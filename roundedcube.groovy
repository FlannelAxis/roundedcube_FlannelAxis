//create a rounded cube
CSG roundedCube = new RoundedCube(	100,// X dimention
				20,// Y dimention
				100//  Z dimention
				)
				.cornerRadius(1)// sets the radius of the corner
				.toCSG()// converts it to a CSG tor display
return roundedCube