# HorasTicketTrackerIO - README

This README file provides an overview of the HorasTicketTrackerIO project, which is an Android application for tracking support tickets related to incidents in a software system. The document covers the project's tech stack, functional and non-functional requirements, and system architecture. Please refer to the Software Requirement Specification for more detailed information.

## Table of Contents

1. [Introduction](#introduction)
2. [Tech Stack](#tech-stack)
3. [Functional Requirements](#functional-requirements)
4. [Non-Functional Requirements](#non-functional-requirements)
5. [System Architecture](#system-architecture)
6. [Conclusion and Results](#conclusion-and-results)

## Introduction

HorasTicketTrackerIO is an Android application for tracking support tickets related to incidents in a software system. The purpose of this project is to provide a platform for managing and monitoring tickets through various stages, from creation to resolution.

## Tech Stack

- Platform: Android Native
- Language: Kotlin
- Android 8 Oreo - API 26
- Architecture: MVVM (Model-View-ViewModel)
- Android Components and Libraries: Android Jetpack, Room, RecyclerView
- Version Control: Git
- Build System: Gradle KTS

## Functional Requirements

1. User Authentication
2. Ticket Management (Create, Edit, Archive)
3. Ticket Display
4. Ticket Filtering

## Non-Functional Requirements

1. Performance
2. Usability
3. Maintainability
4. Extensibility
5. Testing

## System Architecture

The application follows the MVVM architectural pattern, separating the UI components, business logic, and data layers. The data layer will use a local Room database for ticket storage and management.

### Project Structure
```
└── mx
└── overcome
└── horastickettrackerio
├── data
│ ├── local
│ │ ├── dao
│ │ │ └── TicketDao.kt
│ │ ├── database
│ │ │ ├── Converters.kt
│ │ │ └── TicketDatabase.kt
│ │ └── model
│ │ ├── Ticket.kt
│ │ └── TicketProvider.kt
│ └── model
│ └── repository
│ └── TicketRepository.kt
├── domain
│ └── usecase
│ ├── AchieveTicketUseCase.kt
│ ├── CreateTicketUseCase.kt
│ ├── GetTicketsUseCase.kt
│ └── UpdateTicketUseCase.kt
├── presentation
│ ├── adapter
│ │ ├── OnTicketClickListener.kt
│ │ └── TicketListAdapter.kt
│ ├── ui
│ │ ├── activity
│ │ │ └── MainActivity.kt
│ │ ├── fragment
│ │ │ ├── TicketDetailFragment.kt
│ │ │ └── TicketListFragment.kt
│ │ └── login
│ │ └── Login.kt
│ └── viewmodel
│ └── TicketViewModel.kt
└── utils
├── Constrants.kt
├── Extension.kt
├── PriorityTicket.kt
├── TicketState.kt
└── TicketType.kt
```

# Conclusion and Results

Due to time limitations, an MVP was accomplished that can show a mock list of tickets, allowing users to select the details of the ticket and displaying each ticket differently depending on its state. The APK provided is not signed (not able to be uploaded to the Play Store) but can be tested by allowing the permission to install it on an Android device.

## Installation

To install the HorasTicketTrackerIO APK on your Android device, follow these steps:

1. Download the APK file from the provided link.
2. On your Android device, go to **Settings** > **Security**.
3. Enable the **Unknown Sources** option to allow installation of apps from sources other than the Play Store.
4. Navigate to the downloaded APK file using a file manager and tap on it to start the installation process.
5. Follow the on-screen prompts to complete the installation.

## Usage

1. Launch the HorasTicketTrackerIO app on your Android device.
2. Authenticate yourself by entering your name.
3. Use the app to manage and monitor tickets, including creating new tickets, editing existing ones, and archiving resolved tickets.
4. Filter the ticket list by ticket state (open, in progress, resolved) as needed.
