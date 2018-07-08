# CSVLogger
A place to develop a simple framework for logging values and publishing them to CSV files.

## Log
Log is a concrete class that represents a running "Log" of values. It has functions to add to it (log) and clear, as well as some different ways it can be outputted. A seperate CSVLogger class should in the future be able to accept such Log objects and publish their contents to a CSV file.

## Loggable
Loggable is an abstract class that is meant to be extended by any class that wishes to log values. The abstract method, 'collectData()' must be implemented to return an Object[] that represents a "snapshot" of whatever needs to be logged. A user must then call the 'log()' function of the class at a periodic interval to capture a "snapshot" and add it to the log at the time it is captured.
