import csv
import sqlite3

class DatabaseConnector:
    """Manages a connection to a sqlite database."""

    def __init__(self, database_file):
        self.connection = sqlite3.connect(database_file)
        self.cursor = self.connection.cursor()

    def populate(self, spreadsheet_folder):
        """Populate the database with data imported from each spreadsheet."""