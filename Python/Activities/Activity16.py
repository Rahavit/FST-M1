class Car:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(f"{self.manufacturer} {self.model} is moving")

    def stop(self):
        print(f"{self.manufacturer} {self.model} has stopped")

# Create car objects
car1 = Car("Toyota", "Innova", 2023, "Automatic", "Silver")
car2 = Car("Honda", "City", 2022, "Automatic", "Red")
car3 = Car("VW", "Vento", 2022, "Manual", "Black")

# Use the car objects
car1.accelerate()
car2.stop()
car3.accelerate()
