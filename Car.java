package CarSales;
class Car{
            private String CarName;
            private String CarType;
            private String price;
            private String Fuel;
            String getCarName()
            {
                return CarName;
            }
            String getCarType()
            {
                return CarType;
            }
            String getPrice()
            {
                return price;
            }
            String getFuel()
            {
                return Fuel;
            }
            public Car(String CarName,String CarType,String price,String Fuel){
                this.CarName = CarName;
                this.CarType = CarType;
                this.price = price;
                this.Fuel = Fuel;
            }
    }