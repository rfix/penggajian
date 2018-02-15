-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 14, 2017 at 06:23 PM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `penggajian`
--

-- --------------------------------------------------------

--
-- Table structure for table `gaji_borong`
--

CREATE TABLE `gaji_borong` (
  `id` int(4) NOT NULL,
  `kuantity` int(6) DEFAULT NULL,
  `tanggal` date DEFAULT NULL,
  `id_borong` int(4) DEFAULT NULL,
  `total` int(10) DEFAULT NULL,
  `tunjangan` int(10) DEFAULT NULL,
  `upah_barang` int(10) DEFAULT NULL,
  `id_jabatan` int(4) DEFAULT NULL,
  `id_barang` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `gaji_borong`
--

INSERT INTO `gaji_borong` (`id`, `kuantity`, `tanggal`, `id_borong`, `total`, `tunjangan`, `upah_barang`, `id_jabatan`, `id_barang`) VALUES
(9, 600, '2017-07-22', 1, 280000, 100000, 300, 1, 2),
(10, 550, '2017-07-22', 2, 335000, 60000, 500, 2, 1),
(11, 650, '2017-07-15', 3, 255000, 60000, 300, 2, 2),
(12, 575, '2017-07-15', 5, 347500, 60000, 500, 2, 1),
(13, 560, '2017-07-08', 6, 380000, 100000, 500, 1, 1),
(14, 710, '2017-07-08', 3, 273000, 60000, 300, 2, 2),
(15, 545, '2017-07-22', 8, 332500, 60000, 500, 2, 1),
(16, 600, '2017-07-08', 7, 400000, 100000, 500, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `gaji_harian`
--

CREATE TABLE `gaji_harian` (
  `id` int(4) NOT NULL,
  `kuantity` int(10) DEFAULT NULL,
  `tanggal` date DEFAULT NULL,
  `id_harian` int(4) DEFAULT NULL,
  `gaji` int(11) DEFAULT NULL,
  `golongan` varchar(15) DEFAULT NULL,
  `total` int(11) DEFAULT NULL,
  `id_jabatan` int(11) DEFAULT NULL,
  `tunjangan` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `gaji_harian`
--

INSERT INTO `gaji_harian` (`id`, `kuantity`, `tanggal`, `id_harian`, `gaji`, `golongan`, `total`, `id_jabatan`, `tunjangan`) VALUES
(17, 5, '2017-05-06', 1, 60000, 'GOL 3', 360000, 2, 60000),
(18, 6, '2017-05-06', 2, 70000, 'GOL 4', 520000, 1, 100000),
(19, 6, '2017-05-06', 4, 60000, 'GOL 2', 420000, 2, 60000),
(20, 6, '2017-05-06', 5, 70000, 'GOL 3', 520000, 1, 100000),
(26, 70, '2017-05-13', 8, 50000, 'GOL 1', 3560000, 2, 60000),
(27, 60, '2017-05-13', 6, 60000, 'GOL 2', 3660000, 2, 60000),
(28, 6, '2017-06-03', 2, 50000, 'GOL 1', 400000, 1, 100000),
(29, 5, '2017-07-08', 9, 50000, 'GOL 1', 350000, 1, 100000),
(30, 5, '2017-07-22', 15, 50000, 'GOL 1', 350000, 1, 100000),
(31, 5, '2017-07-22', 16, 50000, 'GOL 1', 350000, 1, 100000),
(32, 5, '2017-07-01', 17, 40000, 'GOL 1', 260000, 2, 60000);

-- --------------------------------------------------------

--
-- Table structure for table `jabatan`
--

CREATE TABLE `jabatan` (
  `id` int(11) NOT NULL,
  `gaji` int(11) DEFAULT NULL,
  `nama_jabatan` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jabatan`
--

INSERT INTO `jabatan` (`id`, `gaji`, `nama_jabatan`) VALUES
(1, 100000, 'Maintenence'),
(2, 60000, 'Karyawan'),
(3, 70000, 'Teknisi Mesin'),
(4, 70000, 'Teknisi Listrik'),
(5, 70000, 'Mandor');

-- --------------------------------------------------------

--
-- Table structure for table `jenisbarang`
--

CREATE TABLE `jenisbarang` (
  `id` int(11) NOT NULL,
  `gaji` int(11) DEFAULT NULL,
  `nama_barang` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jenisbarang`
--

INSERT INTO `jenisbarang` (`id`, `gaji`, `nama_barang`) VALUES
(1, 500, 'Barang A'),
(2, 300, 'Barang B'),
(3, 400, 'barang C');

-- --------------------------------------------------------

--
-- Table structure for table `karyawanborong`
--

CREATE TABLE `karyawanborong` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `jenis_kelamin` varchar(15) DEFAULT NULL,
  `tanggal_lahir` date DEFAULT NULL,
  `agama` varchar(20) DEFAULT NULL,
  `no_telp` varchar(13) DEFAULT NULL,
  `alamat` varchar(60) DEFAULT NULL,
  `pendidikan` varchar(10) DEFAULT NULL,
  `id_barang` int(11) DEFAULT NULL,
  `id_jabatan` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `karyawanborong`
--

INSERT INTO `karyawanborong` (`id`, `nama`, `jenis_kelamin`, `tanggal_lahir`, `agama`, `no_telp`, `alamat`, `pendidikan`, `id_barang`, `id_jabatan`) VALUES
(1, 'Tata', 'Laki - laki', '2017-04-01', 'Islam', '0877815645610', 'Tegal', 'Tegal', 2, 1),
(2, 'arieb', 'Laki - lak', '2017-04-19', 'Islam', '647168731', 'KP', 'SD', 1, 2),
(3, 'Umam', 'Laki - lak', '2017-04-05', 'Islam', '648716876', 'Banyumas', 'SD', 2, 2),
(5, 'mujahidin', 'Laki - lak', '2017-05-09', 'Islam', '74987893', 'wamena', 'S1', 1, 2),
(6, 'sumanto', 'Laki - lak', '2017-05-26', 'Islam', '226506154', 'kalangan', 'SMP', 1, 1),
(7, 'Wahyu', 'Laki - lak', '2017-05-03', 'Islam', '089786746373', 'ndari', 'S1', 1, 1),
(8, 'dika', 'Laki - laki', '2017-06-01', 'Islam', '0896767736876', 'growong lor', 'S1', 1, 2),
(9, 'hafi', 'Laki - laki', '1995-07-24', 'Islam', '0898654464564', 'pajeksan', 'pajeksan', 2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `karyawanharian`
--

CREATE TABLE `karyawanharian` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `jenis_kelamin` varchar(15) DEFAULT NULL,
  `no_telp` varchar(13) DEFAULT NULL,
  `agama` varchar(20) DEFAULT NULL,
  `pendidikan` varchar(15) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `golongan` varchar(15) DEFAULT NULL,
  `gaji_harian` int(11) DEFAULT NULL,
  `tanggal_lahir` date DEFAULT NULL,
  `tanggal_masuk` date NOT NULL,
  `id_jabatan` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `karyawanharian`
--

INSERT INTO `karyawanharian` (`id`, `nama`, `jenis_kelamin`, `no_telp`, `agama`, `pendidikan`, `alamat`, `golongan`, `gaji_harian`, `tanggal_lahir`, `tanggal_masuk`, `id_jabatan`) VALUES
(1, 'Heru', 'Laki - laki', '089657555645', 'Islam', 'S1', 'KP', 'GOL 3', 60000, '2017-04-07', '2016-05-03', 2),
(2, 'mijo', 'Laki - laki', '085874397488', 'Islam', 'SD', 'medan', 'GOL 4', 70000, '2017-04-06', '2016-05-07', 1),
(3, 'memet', 'Laki - laki', '79876876', 'Islam', 'SMP', 'GUnung kidul', 'GOL 1', 40000, '2017-04-06', '2016-01-08', 2),
(4, 'didot', 'Laki - laki', '68726876', 'Islam', 'SD', 'lombok', 'GOL 2', 50000, '1994-04-04', '2015-03-05', 2),
(5, 'Ecing', 'Perempuan', '7637871', 'Islam', 'SD', 'Sragen', 'GOL 3', 60000, '1985-04-05', '2014-02-12', 1),
(6, 'wulan', 'Perempuan', '768687', 'Islam', 'SD', 'Pati', 'GOL 2', 50000, '1995-04-05', '2015-04-07', 2),
(8, 'udin', 'Laki - laki', '287198', 'Islam', 'SMP', 'hfjajfha', 'GOL 1', 50000, '2017-05-04', '2017-05-05', 2),
(9, 'hari', 'Laki - laki', '786687979', 'Islam', 'SD', 'hjfkjaifa', 'GOL 1', 50000, '2017-05-06', '2016-05-07', 1),
(10, 'heru tri julianto', 'Laki - laki', '2323', 'Islam', 'SD', 'jgj', 'GOL 2', 60000, '2017-05-09', '2017-05-03', 1),
(11, 'jobret', 'Laki - laki', '4663642', 'Islam', 'SD', 'gafga', 'GOL 2', 60000, '2017-05-04', '2015-05-07', 2),
(12, 'juprek', 'Laki - laki', '886937676', 'Islam', 'SD', 'jkhkjk', 'GOL 1', 50000, '2017-05-04', '2016-05-09', 1),
(13, 'antok', 'Laki - laki', '6431876', 'Islam', 'SD', 'fajhkjjk', 'GOL 1', 50000, '2017-05-09', '2017-05-09', 2),
(14, 'waji', 'Perempuan', '68764', 'Islam', 'SD', 'hfkjdfkja', 'GOL 1', 50000, '2017-05-09', '2017-05-04', 1),
(15, 'jojo', 'Laki - laki', '68778', 'Islam', 'SD', 'hfakjhk', 'GOL 1', 50000, '2017-05-09', '2017-05-09', 1),
(16, 'harun', 'Laki - laki', '0897377347884', 'Islam', 'SD', 'growong', 'GOL 1', 50000, '2017-06-01', '2017-06-01', 1),
(17, 'ahmad', 'Laki - laki', '0261455961655', 'Islam', 'SMK', 'langgen', 'GOL 1', 40000, '1995-07-05', '2016-07-06', 2);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `peran` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `nama`, `password`, `username`, `peran`) VALUES
(1, 'Rofiq', 'admin', 'admin', 'Admin'),
(2, 'Rina', 'rinana', 'Rinana', 'Keuangan');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `gaji_borong`
--
ALTER TABLE `gaji_borong`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_4fv6jcrvuycmr1w39udn4r2c9` (`id_borong`),
  ADD KEY `FK_fe2k1xy068hbi0ikvjnwf02uv` (`id_jabatan`),
  ADD KEY `FK_jlut6jl44t74bdtq7xn7n58fk` (`id_barang`);

--
-- Indexes for table `gaji_harian`
--
ALTER TABLE `gaji_harian`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_8h5sa4l6l6hgl4ptc1kv56mqy` (`id_harian`),
  ADD KEY `FK_sabyee5ihn3ufte7uf9hk6p4y` (`id_jabatan`);

--
-- Indexes for table `jabatan`
--
ALTER TABLE `jabatan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `jenisbarang`
--
ALTER TABLE `jenisbarang`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `karyawanborong`
--
ALTER TABLE `karyawanborong`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_17qyw862by278wray3wnhnoba` (`id_barang`),
  ADD KEY `FK_oishvg3wnqaqje1ygehfhm0d` (`id_jabatan`);

--
-- Indexes for table `karyawanharian`
--
ALTER TABLE `karyawanharian`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_dhawd5diaijo5c32xt4h47pst` (`id_jabatan`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `gaji_borong`
--
ALTER TABLE `gaji_borong`
  MODIFY `id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT for table `gaji_harian`
--
ALTER TABLE `gaji_harian`
  MODIFY `id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;
--
-- AUTO_INCREMENT for table `jabatan`
--
ALTER TABLE `jabatan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `jenisbarang`
--
ALTER TABLE `jenisbarang`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `karyawanborong`
--
ALTER TABLE `karyawanborong`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `karyawanharian`
--
ALTER TABLE `karyawanharian`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `gaji_borong`
--
ALTER TABLE `gaji_borong`
  ADD CONSTRAINT `FK_4fv6jcrvuycmr1w39udn4r2c9` FOREIGN KEY (`id_borong`) REFERENCES `karyawanborong` (`id`),
  ADD CONSTRAINT `FK_fe2k1xy068hbi0ikvjnwf02uv` FOREIGN KEY (`id_jabatan`) REFERENCES `jabatan` (`id`),
  ADD CONSTRAINT `FK_jlut6jl44t74bdtq7xn7n58fk` FOREIGN KEY (`id_barang`) REFERENCES `jenisbarang` (`id`);

--
-- Constraints for table `gaji_harian`
--
ALTER TABLE `gaji_harian`
  ADD CONSTRAINT `FK_8h5sa4l6l6hgl4ptc1kv56mqy` FOREIGN KEY (`id_harian`) REFERENCES `karyawanharian` (`id`),
  ADD CONSTRAINT `FK_sabyee5ihn3ufte7uf9hk6p4y` FOREIGN KEY (`id_jabatan`) REFERENCES `jabatan` (`id`);

--
-- Constraints for table `karyawanborong`
--
ALTER TABLE `karyawanborong`
  ADD CONSTRAINT `FK_17qyw862by278wray3wnhnoba` FOREIGN KEY (`id_barang`) REFERENCES `jenisbarang` (`id`),
  ADD CONSTRAINT `FK_oishvg3wnqaqje1ygehfhm0d` FOREIGN KEY (`id_jabatan`) REFERENCES `jabatan` (`id`);

--
-- Constraints for table `karyawanharian`
--
ALTER TABLE `karyawanharian`
  ADD CONSTRAINT `FK_dhawd5diaijo5c32xt4h47pst` FOREIGN KEY (`id_jabatan`) REFERENCES `jabatan` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
