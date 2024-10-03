## Product
- **Product ID** (primary key)
- **Name**
- **Manufacturer ID** (foreign key referencing the Manufacturer entity)
- **Type** (pet food, pet toy, or pet apparel)

## Manufacturer
- **Manufacturer ID** (primary key)
- **Name**

## Pet Food
- **Product ID** (foreign key referencing the Product entity)
- **Weight**
- **Flavor**
- **Target Health Condition**

## Pet Toy
- **Product ID** (foreign key referencing the Product entity)
- **Material**
- **Durability**

## Pet Apparel
- **Product ID** (foreign key referencing the Product entity)
- **Color**
- **Size**
- **Care Instructions**

## Animal
- **Animal ID** (primary key)
- **Name**

## Product-Animal Association
- **Product ID** (foreign key referencing the Product entity)
- **Animal ID** (foreign key referencing the Animal entity)

## Customer
- **Customer ID** (primary key)
- **Name**
- **Email Address**

## Transaction
- **Transaction ID** (primary key)
- **Customer ID** (foreign key referencing the Customer entity)
- **Date**

## Transaction-Product Association
- **Transaction ID** (foreign key referencing the Transaction entity)
- **Product ID** (foreign key referencing the Product entity)

## Location
- **Location ID** (primary key)
- **Name**
- **Zip Code**

## Shipment
- **Shipment ID** (primary key)
- **Origin Location ID** (foreign key referencing the Location entity)
- **Destination Location ID** (foreign key referencing the Location entity)

## Shipment-Product Association
- **Shipment ID** (foreign key referencing the Shipment entity)
- **Product ID** (foreign key referencing the Product entity)
- **Quantity**
