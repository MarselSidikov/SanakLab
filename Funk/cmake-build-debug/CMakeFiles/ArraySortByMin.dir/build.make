# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.6

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /home/soti/Загрузки/clion-2016.3.4/bin/cmake/bin/cmake

# The command to remove a file.
RM = /home/soti/Загрузки/clion-2016.3.4/bin/cmake/bin/cmake -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/soti/CLionProjects/Funk

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/soti/CLionProjects/Funk/cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/ArraySortByMin.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/ArraySortByMin.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/ArraySortByMin.dir/flags.make

CMakeFiles/ArraySortByMin.dir/main.cpp.o: CMakeFiles/ArraySortByMin.dir/flags.make
CMakeFiles/ArraySortByMin.dir/main.cpp.o: ../main.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/soti/CLionProjects/Funk/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/ArraySortByMin.dir/main.cpp.o"
	/usr/bin/c++   $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/ArraySortByMin.dir/main.cpp.o -c /home/soti/CLionProjects/Funk/main.cpp

CMakeFiles/ArraySortByMin.dir/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/ArraySortByMin.dir/main.cpp.i"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/soti/CLionProjects/Funk/main.cpp > CMakeFiles/ArraySortByMin.dir/main.cpp.i

CMakeFiles/ArraySortByMin.dir/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/ArraySortByMin.dir/main.cpp.s"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/soti/CLionProjects/Funk/main.cpp -o CMakeFiles/ArraySortByMin.dir/main.cpp.s

CMakeFiles/ArraySortByMin.dir/main.cpp.o.requires:

.PHONY : CMakeFiles/ArraySortByMin.dir/main.cpp.o.requires

CMakeFiles/ArraySortByMin.dir/main.cpp.o.provides: CMakeFiles/ArraySortByMin.dir/main.cpp.o.requires
	$(MAKE) -f CMakeFiles/ArraySortByMin.dir/build.make CMakeFiles/ArraySortByMin.dir/main.cpp.o.provides.build
.PHONY : CMakeFiles/ArraySortByMin.dir/main.cpp.o.provides

CMakeFiles/ArraySortByMin.dir/main.cpp.o.provides.build: CMakeFiles/ArraySortByMin.dir/main.cpp.o


# Object files for target ArraySortByMin
ArraySortByMin_OBJECTS = \
"CMakeFiles/ArraySortByMin.dir/main.cpp.o"

# External object files for target ArraySortByMin
ArraySortByMin_EXTERNAL_OBJECTS =

ArraySortByMin: CMakeFiles/ArraySortByMin.dir/main.cpp.o
ArraySortByMin: CMakeFiles/ArraySortByMin.dir/build.make
ArraySortByMin: CMakeFiles/ArraySortByMin.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/home/soti/CLionProjects/Funk/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable ArraySortByMin"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/ArraySortByMin.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/ArraySortByMin.dir/build: ArraySortByMin

.PHONY : CMakeFiles/ArraySortByMin.dir/build

CMakeFiles/ArraySortByMin.dir/requires: CMakeFiles/ArraySortByMin.dir/main.cpp.o.requires

.PHONY : CMakeFiles/ArraySortByMin.dir/requires

CMakeFiles/ArraySortByMin.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/ArraySortByMin.dir/cmake_clean.cmake
.PHONY : CMakeFiles/ArraySortByMin.dir/clean

CMakeFiles/ArraySortByMin.dir/depend:
	cd /home/soti/CLionProjects/Funk/cmake-build-debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/soti/CLionProjects/Funk /home/soti/CLionProjects/Funk /home/soti/CLionProjects/Funk/cmake-build-debug /home/soti/CLionProjects/Funk/cmake-build-debug /home/soti/CLionProjects/Funk/cmake-build-debug/CMakeFiles/ArraySortByMin.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/ArraySortByMin.dir/depend

