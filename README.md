
# cs111f2018-practical4-starter

Designed for use with [GitHub Classroom](https://classroom.github.com/), this
repository contains the starter files for Practical 4 in Computer Science 100.

 Since the Travis builds for this repository will initially fail (as evidenced by
 a red &#x2717; appearing in the commit logs instead of a green &#x2714;), the
 programmer is responsible for completing all of the steps needed to satisfy the
 requirements for the assignment, thus causing a &#x2714; to instead appear in
 the commit logs.


## Introduction

This assignment requires a programmer to implement and test a Java program,
called `DisplayComplementaryDrawingCanvas`, that will produce graphical output.
First, the program will display a canvas with the name of the programmer and
the date at which the program was run. Then, it will display rectangles with
complementary colors, meeting the requirements outlined later in the
assignment. As verified by
[Checkstyle](https://github.com/checkstyle/checkstyle), the source code for the
`DisplayComplementaryDrawingCanvas.java` file must adhere to all of the
requirements in the [Google Java Style
Guide](https://google.github.io/styleguide/javaguide.html).

The source code in the `DisplayComplementaryDrawingCanvas.java` file must also pass
additional tests set by the [GatorGrader tool](https://github.com/GatorEducator/gatorgrader).
As before, GatorGrader will
check to ensure `DisplayComplementaryDrawingCanvas` uses the `new Date()` construct
in the Java code. Moreover, GatorGrader will check the following characteristics
of your implementation:

* The `DisplayComplementaryDrawingCanvas` must:
  * Contain at least four single-line comments and two multi-line comments
  * Declare and use the `CANVAS_HEIGHT` variable
  * Declare and use the `CANVAS_WIDTH` variable
  * Declare and use the `redValue` variable
  * Declare and use the `greenValue` variable
  * Declare and use the `blueValue` variable
  * Create two complementary colors
  * Create two rectangles
  * Declare and use an `int` variable called `RGB_MAXIMUM`

When you use the `git commit` command to transfer your source code to your
GitHub repository, [Travis CI](https://travis-ci.com/) will initialize a build
of your assignment, checking to see if it meets all of the requirements. If
your source code meets all of the established requirements, then you
will see a green &#x2714; in the listing of commits in GitHub. If your
submission does not meet the requirements, a red &#x2717; will appear instead.
The instructor will reduce a programmer's grade for this assignment if the red
&#x2717; appears on the last commit in GitHub immediately before the
assignment's due date.

A carefully formatted assignment sheet for this project provides more details
about the steps that a computer scientist should take to complete this
assignment. You can view this assignment sheet by visiting the listing of
laboratories on the course web site.

## Learning

If you have not done so already, please read all of the relevant [GitHub
Guides](https://guides.github.com/) that explain how to use many of the features
that GitHub provides. In particular, please make sure that you have read the
following GitHub guides: [Mastering
Markdown](https://guides.github.com/features/mastering-markdown/), [Hello
World](https://guides.github.com/activities/hello-world/), and [Documenting Your
Projects on GitHub](https://guides.github.com/features/wikis/). Each of these
guides will help you to understand how to use both [GitHub](http://github.com) and
[GitHub Classroom](https://classroom.github.com/).

To do well on this assignment, you should also review Chapters 1 and 2, and
study Sections 3.9 through
3.11. Please see the course instructor or one of the teaching assistants or
tutors if you have questions about any of these reading assignments.

## Commands

To get started in using the GatorGrader tool, you can change into the directory
for this assignment and type the command `gradle grade` in your
terminal.

Running this command will produce a lot of output that you should carefully
inspect. If the last line of the output indicates that GatorGrader judges that
there are no mistakes in the assignment, then this means that your source code
is passing all of the automated checks. However, if the last line
of the output indicates that there are mistakes, then you will need to
understand what they are and then try to fix them.

You can also complete several important Java programming tasks by using the
`gradle` tool. For instance, you can compile (i.e., create bytecode from the
program's source code if it is a correct program) the program using the command
`gradle build`. There are also additional commands that you can type:

* `gradle clean`: clean the project of all the derived files
* `gradle check`: check the quality of the code using Checkstyle
* `gradle build`: create the bytecode from the Java source code
* `gradle run`: run the Java program in the command-line
* `gradle tasks`: display details about the Gradle system

To run one of these commands, you must be in the main directory for this
assignment where the `build.gradle` file is located. Then, you can type the
command in the terminal and study the output.

## Travis

This assignment uses [Travis CI](https://travis-ci.com/) to automatically run
the checking programs every time you commit to your GitHub repository. The
checking will start as soon as you have accepted the assignment, thus creating
your own private repository. If
you are using Travis for the first time, you will need to authorize Travis CI to
access the private repositories that you created on GitHub.

## Problems

If you have found a problem with this assignment's provided source code, then
you can go to the [Computer Science 100 Practical 4
Starter](Allegheny-Computer-Science-100-01-F2018/cs100f2018-practical4-starter)
repository and create an issue by clicking the "Issues" tab and then clicking
the green "New Issue" button. If you have found a problem with the [GatorGrader
tool](https://github.com/GatorEducator/gatorgrader) and the way that it checks you
assignment, then you can follow the aforementioned steps to create an issue in
its repository. To ensure that your issue is properly resolved, please provide
as many details as is possible about the problem that you experienced.

Students who find, and use the appropriate GitHub issue tracker to correctly
document, a mistake in any aspect of this practical assignment will receive
 extra credit.

## Assistance

If you are having trouble completing any part of this project, then please talk
with either the course instructor or a teaching assistant during the laboratory
session. Alternatively, you may ask questions in the Slack team for this
course. Finally, you can schedule a meeting during the course instructor's
office hours.
