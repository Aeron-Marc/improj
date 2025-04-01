-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 01, 2025 at 02:24 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `im_project`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `GetStudentDetails` (IN `student_id_param` INT)   BEGIN
    SELECT 
        students.student_name, 
        courses.course_name, 
        student_course.grade,
        student_course.status,
        tracks.track_name, 
        programs.program_name
    FROM students
    INNER JOIN student_track ON students.student_id = student_track.student_id
    INNER JOIN student_course ON students.student_id = student_course.student_id
    INNER JOIN courses ON student_course.course_id = courses.course_id
    INNER JOIN track_course ON track_course.course_id = courses.course_id
    INNER JOIN tracks ON student_track.track_id = tracks.track_id
    INNER JOIN track_program ON tracks.track_id = track_program.track_id
    INNER JOIN programs ON track_program.program_id = programs.program_id
    WHERE students.student_id = student_id_param;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE `courses` (
  `course_id` int(11) NOT NULL,
  `course_code` varchar(10) NOT NULL,
  `course_name` varchar(50) DEFAULT NULL,
  `units` int(11) NOT NULL,
  `hours_lec` int(11) DEFAULT NULL,
  `hours_lab` int(11) DEFAULT NULL,
  `corequisite` varchar(50) DEFAULT NULL,
  `prerequisite` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`course_id`, `course_code`, `course_name`, `units`, `hours_lec`, `hours_lab`, `corequisite`, `prerequisite`) VALUES
(1, 'IT 111', 'Introduction to Computing', 3, 2, 3, NULL, NULL),
(2, 'GEd 102', 'Mathematics in the Modern World', 3, 3, NULL, NULL, NULL),
(3, 'GEd 108', 'Art Appreciation', 3, 3, NULL, NULL, NULL),
(4, 'Fili 101', 'Kontekstwalisadong Komunikasyon sa Filipino', 3, 3, NULL, NULL, NULL),
(5, 'PATHFit 1', 'Movement Competency Training', 2, 2, NULL, NULL, NULL),
(6, 'NSTP 111', 'National Service Training Program 1', 3, 3, NULL, NULL, NULL),
(7, 'GEd 103', 'The Life and Works of Rizal', 3, 3, NULL, NULL, NULL),
(8, 'GEd 104', 'The Contemporary World', 3, 3, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `programs`
--

CREATE TABLE `programs` (
  `program_id` int(11) NOT NULL,
  `program_name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `programs`
--

INSERT INTO `programs` (`program_id`, `program_name`) VALUES
(1, 'Bachelor of Science in Information Technology');

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `student_id` int(11) NOT NULL,
  `student_name` varchar(50) DEFAULT NULL,
  `srcode` varchar(10) DEFAULT NULL,
  `sex` enum('Male','Female','Other') DEFAULT NULL,
  `year` enum('First','Second','Third','Fourth') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`student_id`, `student_name`, `srcode`, `sex`, `year`) VALUES
(1, 'Aeron Salanguit', '23-71744', 'Male', 'First'),
(2, 'Dorina Cables', '23-11111', 'Female', 'First'),
(3, 'Adrian Cornado', '23-22222', 'Male', 'First'),
(4, 'Kokey Alien', '23-33333', 'Other', 'First');

-- --------------------------------------------------------

--
-- Table structure for table `student_course`
--

CREATE TABLE `student_course` (
  `sc_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  `grade` varchar(5) NOT NULL,
  `status` enum('Completed','Incomplete') NOT NULL DEFAULT 'Incomplete'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student_course`
--

INSERT INTO `student_course` (`sc_id`, `student_id`, `course_id`, `grade`, `status`) VALUES
(1, 1, 1, '3.00', 'Completed'),
(2, 1, 2, '3.00', 'Completed'),
(3, 1, 3, '3.00', 'Completed'),
(4, 1, 4, 'INC', 'Incomplete'),
(5, 1, 5, '3.00', 'Completed'),
(6, 1, 6, '3.00', 'Completed'),
(7, 1, 7, '3.00', 'Completed'),
(8, 1, 8, '3.00', 'Completed');

-- --------------------------------------------------------

--
-- Table structure for table `student_track`
--

CREATE TABLE `student_track` (
  `st_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `track_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student_track`
--

INSERT INTO `student_track` (`st_id`, `student_id`, `track_id`) VALUES
(1, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `tracks`
--

CREATE TABLE `tracks` (
  `track_id` int(11) NOT NULL,
  `track_name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tracks`
--

INSERT INTO `tracks` (`track_id`, `track_name`) VALUES
(1, 'BUSINESS ANALYTICS TRACK');

-- --------------------------------------------------------

--
-- Table structure for table `track_course`
--

CREATE TABLE `track_course` (
  `tc_id` int(11) NOT NULL,
  `track_id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  `year` enum('First','Second','Third','Fourth') NOT NULL,
  `semester` enum('First','Second') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `track_course`
--

INSERT INTO `track_course` (`tc_id`, `track_id`, `course_id`, `year`, `semester`) VALUES
(1, 1, 1, 'First', 'First'),
(2, 1, 2, 'First', 'First'),
(3, 1, 3, 'First', 'First'),
(4, 1, 4, 'First', 'First'),
(5, 1, 5, 'First', 'First'),
(6, 1, 6, 'First', 'First'),
(7, 1, 7, 'First', 'First'),
(8, 1, 8, 'First', 'First');

-- --------------------------------------------------------

--
-- Table structure for table `track_program`
--

CREATE TABLE `track_program` (
  `tp_id` int(11) NOT NULL,
  `track_id` int(11) NOT NULL,
  `program_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `track_program`
--

INSERT INTO `track_program` (`tp_id`, `track_id`, `program_id`) VALUES
(1, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `uid` int(11) NOT NULL,
  `srcode` varchar(20) NOT NULL,
  `password` varchar(255) NOT NULL,
  `type` enum('admin','evaluator') NOT NULL,
  `email` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`uid`, `srcode`, `password`, `type`, `email`) VALUES
(1, '23-77024', '12345', 'admin', NULL),
(2, '23-77025', '12345', 'evaluator', NULL),
(3, '23-75482', '23-75482', 'evaluator', 'luke@gmail.com');

-- --------------------------------------------------------

--
-- Stand-in structure for view `view_all`
-- (See below for the actual view)
--
CREATE TABLE `view_all` (
`student_name` varchar(50)
,`course_name` varchar(50)
,`grade` varchar(5)
,`status` enum('Completed','Incomplete')
,`track_name` varchar(50)
,`program_name` varchar(50)
);

-- --------------------------------------------------------

--
-- Structure for view `view_all`
--
DROP TABLE IF EXISTS `view_all`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view_all`  AS SELECT `students`.`student_name` AS `student_name`, `courses`.`course_name` AS `course_name`, `student_course`.`grade` AS `grade`, `student_course`.`status` AS `status`, `tracks`.`track_name` AS `track_name`, `programs`.`program_name` AS `program_name` FROM (((((((`students` join `student_track` on(`students`.`student_id` = `student_track`.`student_id`)) join `student_course` on(`students`.`student_id` = `student_course`.`student_id`)) join `courses` on(`student_course`.`course_id` = `courses`.`course_id`)) join `track_course` on(`track_course`.`course_id` = `courses`.`course_id`)) join `tracks` on(`student_track`.`track_id` = `tracks`.`track_id`)) join `track_program` on(`tracks`.`track_id` = `track_program`.`track_id`)) join `programs` on(`track_program`.`program_id` = `programs`.`program_id`)) ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `courses`
--
ALTER TABLE `courses`
  ADD PRIMARY KEY (`course_id`);

--
-- Indexes for table `programs`
--
ALTER TABLE `programs`
  ADD PRIMARY KEY (`program_id`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`student_id`);

--
-- Indexes for table `student_course`
--
ALTER TABLE `student_course`
  ADD PRIMARY KEY (`sc_id`);

--
-- Indexes for table `student_track`
--
ALTER TABLE `student_track`
  ADD PRIMARY KEY (`st_id`);

--
-- Indexes for table `tracks`
--
ALTER TABLE `tracks`
  ADD PRIMARY KEY (`track_id`);

--
-- Indexes for table `track_course`
--
ALTER TABLE `track_course`
  ADD PRIMARY KEY (`tc_id`);

--
-- Indexes for table `track_program`
--
ALTER TABLE `track_program`
  ADD PRIMARY KEY (`tp_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`uid`),
  ADD UNIQUE KEY `srcode` (`srcode`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `courses`
--
ALTER TABLE `courses`
  MODIFY `course_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `programs`
--
ALTER TABLE `programs`
  MODIFY `program_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `student_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `student_course`
--
ALTER TABLE `student_course`
  MODIFY `sc_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `student_track`
--
ALTER TABLE `student_track`
  MODIFY `st_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tracks`
--
ALTER TABLE `tracks`
  MODIFY `track_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `track_course`
--
ALTER TABLE `track_course`
  MODIFY `tc_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `track_program`
--
ALTER TABLE `track_program`
  MODIFY `tp_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `uid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
