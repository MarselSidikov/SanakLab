cmake_minimum_required(VERSION 3.6)
project(untitled)

set(CMAKE_CXX_STANDARD 11)
SET(CMAKE_C_FLAGS_DEBUG "-D_DEBUG")
set(SOURCE_FILES main.cpp)
add_executable(untitled ${SOURCE_FILES})