import React from "react";
import { render, screen, fireEvent } from "@testing-library/react";
import UserNavbar from "../components/UserNav/UserNav";
import { MemoryRouter } from 'react-router-dom';

describe('UserNavbar Component', () => {
    
    const userNav = render(<MemoryRouter><UserNavbar /></MemoryRouter>);

    const furnitureCartButton = screen.queryByTestId('furnitureCartButton');
    const furnitureHomeButton = screen.queryByTestId('furnitureHomeButton');
    const furnitureOrderButton = screen.queryByTestId('furnitureOrderButton');
    const logoutButton = screen.queryByTestId('logoutButton');
    const userNavbar = screen.queryByTestId('userNavbar');

    test('feUserNavbar1', () => {
        expect(furnitureCartButton).toBeTruthy();
        expect(furnitureHomeButton).toBeTruthy();
        expect(furnitureOrderButton).toBeTruthy();
        expect(logoutButton).toBeTruthy();
        expect(userNavbar).toBeTruthy();
    });

})