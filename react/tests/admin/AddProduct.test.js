import React from 'react';
import { fireEvent, render, screen } from '@testing-library/react';
import AddProduct from '../../components/admin/AddProduct/AddProduct';
import { MemoryRouter } from 'react-router-dom';


describe('Admin AddProduct Component', () => {

    const addProduct = render(<MemoryRouter><AddProduct /></MemoryRouter>);

    const addFurnitureBody = screen.queryByTestId('addFurnitureBody');
    const furnitureName = screen.queryByTestId('furnitureName');
    const furniturePrice = screen.queryByTestId('furniturePrice');
    const furnitureDescription = screen.queryByTestId('furnitureDescription');
    const furnitureImageURL = screen.queryByTestId('furnitureImageURL');
    const furnitureQuantity = screen.queryByTestId('furnitureQuantity')
    const addFurnitureButton = screen.queryByTestId('addFurnitureButton')

    test('feAdminAddProduct1', () => {
        expect(addFurnitureBody).toBeTruthy();
        expect(furnitureName).toBeTruthy();
        expect(furniturePrice).toBeTruthy();
        expect(furnitureDescription).toBeTruthy();
        expect(furnitureImageURL).toBeTruthy();
        expect(furnitureQuantity).toBeTruthy();
        expect(addFurnitureButton).toBeTruthy();  
        
        fireEvent.change(furnitureName, {target : {value : 'testFurnitureName'}})
        expect(furnitureName.value).toBe('testFurnitureName');

        fireEvent.change(furniturePrice, {target : {value : '5'}})
        expect(furniturePrice.value).toBe('5');

        fireEvent.change(furnitureDescription, {target : {value : 'Furniture Description'}})
        expect(furnitureDescription.value).toBe('Furniture Description');

        fireEvent.change(furnitureImageURL, {target : {value : 'furniture URL'}})
        expect(furnitureImageURL.value).toBe('furniture URL');

        fireEvent.change(furnitureQuantity, {target : {value : '120'}})
        expect(furnitureQuantity.value).toBe('120');
    })
 
})