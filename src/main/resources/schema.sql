
CREATE TABLE lecture
(   lectureCode char(4),
    lectureName varchar(50),
    startApplication timestamp,
    finishApplication timestamp,
    PRIMARY KEY (lectureCode)
);

CREATE TABLE studentList
(   id int,
    studentName varchar(10),
    lectureCode char(4),
    applicationTime timestamp,
    PRIMARY KEY (id),
    FOREIGN KEY (lectureCode) REFERENCES lecture(lectureCode)
);