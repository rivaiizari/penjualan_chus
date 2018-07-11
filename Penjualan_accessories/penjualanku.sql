-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 23, 2018 at 07:40 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `penjualanku`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `Kd_Barang` char(5) NOT NULL,
  `Nama_Barang` varchar(50) NOT NULL,
  `Jenis_Barang` varchar(30) NOT NULL,
  `Harga_Beli` int(10) NOT NULL,
  `Harga_Jual` int(10) NOT NULL,
  `Stock` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `detail_penerimaanbarang`
--

CREATE TABLE `detail_penerimaanbarang` (
  `Kd_PenerimaanBarang` char(5) NOT NULL,
  `Kd_Barang` char(5) NOT NULL,
  `Jml_Pembelian` int(11) DEFAULT NULL,
  `Harga_Pembelian` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `detail_penjualan`
--

CREATE TABLE `detail_penjualan` (
  `Kd_Penjualan` char(5) NOT NULL,
  `Kd_Barang` char(5) NOT NULL,
  `Jml_Penjualan` int(11) DEFAULT NULL,
  `Harga_Penjualan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `distributor`
--

CREATE TABLE `distributor` (
  `Kd_Distributor` char(5) NOT NULL,
  `Nama_Distributor` varchar(50) NOT NULL,
  `No_Telpdistri` varchar(15) NOT NULL,
  `Alamat_Distributor` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE `pegawai` (
  `Kd_Pegawai` char(5) NOT NULL,
  `Password` char(8) NOT NULL,
  `Nama_Pegawai` varchar(50) NOT NULL,
  `No_Telp` varchar(15) NOT NULL,
  `Alamat` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `penerimaan_barang`
--

CREATE TABLE `penerimaan_barang` (
  `Kd_PenerimaanBarang` char(5) NOT NULL,
  `Kd_Pegawai` char(5) NOT NULL,
  `Kd_Distributor` char(5) DEFAULT NULL,
  `tgl_PenerimaanBarang` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE `penjualan` (
  `Kd_Penjualan` char(5) NOT NULL,
  `Kd_Pegawai` char(5) NOT NULL,
  `tgl_Penjualan` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`Kd_Barang`);

--
-- Indexes for table `detail_penerimaanbarang`
--
ALTER TABLE `detail_penerimaanbarang`
  ADD KEY `Kd_PenerimaanBarang` (`Kd_PenerimaanBarang`),
  ADD KEY `Kd_Barang` (`Kd_Barang`);

--
-- Indexes for table `detail_penjualan`
--
ALTER TABLE `detail_penjualan`
  ADD KEY `Kd_Barang` (`Kd_Barang`),
  ADD KEY `Kd_Penjualan` (`Kd_Penjualan`);

--
-- Indexes for table `distributor`
--
ALTER TABLE `distributor`
  ADD PRIMARY KEY (`Kd_Distributor`);

--
-- Indexes for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`Kd_Pegawai`);

--
-- Indexes for table `penerimaan_barang`
--
ALTER TABLE `penerimaan_barang`
  ADD PRIMARY KEY (`Kd_PenerimaanBarang`),
  ADD KEY `Kd_Pegawai` (`Kd_Pegawai`),
  ADD KEY `Kd_Distributor` (`Kd_Distributor`);

--
-- Indexes for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`Kd_Penjualan`),
  ADD KEY `Kd_Pegawai` (`Kd_Pegawai`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `detail_penerimaanbarang`
--
ALTER TABLE `detail_penerimaanbarang`
  ADD CONSTRAINT `detail_penerimaanbarang_ibfk_1` FOREIGN KEY (`Kd_PenerimaanBarang`) REFERENCES `penerimaan_barang` (`Kd_PenerimaanBarang`),
  ADD CONSTRAINT `detail_penerimaanbarang_ibfk_2` FOREIGN KEY (`Kd_Barang`) REFERENCES `barang` (`Kd_Barang`);

--
-- Constraints for table `detail_penjualan`
--
ALTER TABLE `detail_penjualan`
  ADD CONSTRAINT `detail_penjualan_ibfk_1` FOREIGN KEY (`Kd_Barang`) REFERENCES `barang` (`Kd_Barang`),
  ADD CONSTRAINT `detail_penjualan_ibfk_2` FOREIGN KEY (`Kd_Penjualan`) REFERENCES `penjualan` (`Kd_Penjualan`);

--
-- Constraints for table `penerimaan_barang`
--
ALTER TABLE `penerimaan_barang`
  ADD CONSTRAINT `penerimaan_barang_ibfk_1` FOREIGN KEY (`Kd_Pegawai`) REFERENCES `pegawai` (`Kd_Pegawai`),
  ADD CONSTRAINT `penerimaan_barang_ibfk_2` FOREIGN KEY (`Kd_Distributor`) REFERENCES `distributor` (`Kd_Distributor`);

--
-- Constraints for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD CONSTRAINT `penjualan_ibfk_1` FOREIGN KEY (`Kd_Pegawai`) REFERENCES `pegawai` (`Kd_Pegawai`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
