1. Product
	2. Product ID (primary key)
	3. Name
	4. Manufacturer ID (foreign key referencing the Manufacturer entity)
	5. Type (pet food, pet toy, or pet apparel)
6. Manufacturer
	7. Manufacturer ID (primary key)
	8. Name
9. Pet Food
	10. Product ID (foreign key referencing the Product entity)
	11. Weight
	12. Flavor
	13. Target Health Condition
14. Pet Toy
	15. Product ID (foreign key referencing the Product entity)
	16. Material
	17. Durability
18. Pet Apparel
	19. Product ID (foreign key referencing the Product entity)
	20. Color
	21. Size
	22. Care Instructions
23. Animal
	24. Animal ID (primary key)
	25. Name
26. Product-Animal Association
	27. Product ID (foreign key referencing the Product entity)
	28. Animal ID (foreign key referencing the Animal entity)
29. Customer
	30. Customer ID (primary key)
	31. Name
	32. Email Address
33. Transaction
	34. Transaction ID (primary key)
	35. Customer ID (foreign key referencing the Customer entity)
	36. Date
37. Transaction-Product Association
	38. Transaction ID (foreign key referencing the Transaction entity)
	39. Product ID (foreign key referencing the Product entity)
40. Location
	41. Location ID (primary key)
	42. Name
	43. Zip Code
44. Shipment
	45. Shipment ID (primary key)
	46. Origin Location ID (foreign key referencing the Location entity)
	47. Destination Location ID (foreign key referencing the Location entity)
48. Shipment-Product Association
	49. Shipment ID (foreign key referencing the Shipment entity)
	50. Product ID (foreign key referencing the Product entity)
	51. Quantity