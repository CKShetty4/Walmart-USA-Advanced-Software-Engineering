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


------------


## Entity Relationships

- A **Product** is associated with:
  - **One Manufacturer** (one-to-one).
  - **Multiple Animals** (one-to-many).

- An **Animal** is associated with:
  - **Multiple Products** (many-to-many).

- A **Customer** can make:
  - **Multiple Transactions** (one-to-many).

- A **Transaction** is associated with:
  - **One Customer** (one-to-one).
  - **Multiple Products** (one-to-many).

- A **Product** can be involved in:
  - **Multiple Transactions** (many-to-many).

- A **Shipment** is associated with:
  - **One Origin Location** and **One Destination Location** (one-to-one).
  - **Multiple Products** (one-to-many).

- A **Product** can be involved in:
  - **Multiple Shipments** (many-to-many).

