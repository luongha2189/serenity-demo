Feature: Product
	test Product
	
	Scenario: Add Product
		Given I click menu product
		Given I on list product
		When I click button add product
		When I add product "Test Pr"
		Then I save product
		#Then I verify success add product "Thêm mới sản phẩm thành công"
		And I on list product
		And I on first product
		And I edit product "Test Pr 1"
		And I save product
		
#	Scenario: View Page Detail Product
#		When I click view page
#		Then I close tab
