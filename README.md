# BLACKBOX – Accident Reconstruction Engine

## About BLACKBOX

BLACKBOX is a Java-based project developed as part of a course project. The idea behind the project is to create an Accident Reconstruction Engine that can organize information related to an accident and use it as a starting point for reconstruction and analysis.

The project focuses on bringing different accident-related details together in one place. This can include information about vehicles, events, evidence, and other details available from an accident case.

At the current stage, BLACKBOX provides the basic application structure and foundation that can be extended with more accident reconstruction and analysis features.

## Technologies Used

- Java
- NetBeans
- Apache Ant
- Git
- GitHub

## Requirements

Before setting up the project, make sure the following are installed on your system:

- Java Development Kit (JDK)
- Apache Ant
- Git

NetBeans can also be used if you want to open and work on the project using an IDE.

## Getting the Project

The project is available on GitHub.

Clone the repository using:

```bash
git clone https://github.com/svr-portfolio/BLACKBOX.git
```

After cloning, move into the project folder:

```bash
cd BLACKBOX
```

## Setting Up the Project

Once the repository has been cloned, check that Java and Apache Ant are available from the terminal.

To check Java, run:

```bash
java -version
```

To check Apache Ant, run:

```bash
ant -version
```

If both commands display their installed versions, the basic environment is ready.

The project is organized as a NetBeans project and uses Apache Ant through the `build.xml` file.

## Building the Project

From the root directory of the project, run:

```bash
ant clean
```

This removes previously generated build files.

Then build the project using:

```bash
ant jar
```

The Ant build process uses the project's existing NetBeans build configuration.

## Running the Project

After building the project, it can be started from the command line using:

```bash
ant run
```

The main Java class of the current project is:

```text
blackbox.BLACKBOX
```

The application currently starts with a simple BLACKBOX initialization message.

## Project Structure

```text
BLACKBOX/
│
├── nbproject/
│   └── NetBeans project configuration files
│
├── src/
│   └── blackbox/
│       └── BLACKBOX.java
│
├── .gitignore
├── README.md
├── build.xml
└── manifest.mf
```

## How the Project Works

The current version starts the BLACKBOX application through the `BLACKBOX` Java class.

The application provides the basic starting point for the Accident Reconstruction Engine. The project structure is designed so that additional functionality can be added as development continues.

Future development can include adding more detailed accident information, processing that information, and supporting reconstruction and analysis of accident events.

## Development Using NetBeans

The project can also be opened in NetBeans.

After cloning the repository:

1. Open NetBeans.
2. Select **File → Open Project**.
3. Select the cloned `BLACKBOX` project folder.
4. Open the project.
5. Build and run the project from NetBeans if required.

The project also contains `build.xml`, so Apache Ant can be used to build and run it from the terminal.

## GitHub Repository

The source code and project files are maintained in this GitHub repository:

https://github.com/svr-portfolio/BLACKBOX

## Current Status

BLACKBOX is currently being developed as a course project. The present version contains the basic Java application structure and the initial foundation for the Accident Reconstruction Engine.

More functionality can be added to the project as development progresses.

## Author

Developed as a course project.
