import { Search } from '@material-ui/icons';
import React from 'react'
import styled from 'styled-components'

const Container = styled.div`
    background-color: #61B5CB;
    height: 80px;
`;
const Wrapper = styled.div`
    display: flex;
    justify-content: space-between; 
`;
const Right = styled.div`
    padding: 25px 20px;
    font-size: 25px;
    display: flex;
    justify-content: center;
`;
const Left = styled.div`
    flex=2;
    padding:0px 10px;
`;
const SearchContainer = styled.div`
    border: 2px solid lightgray;
    display: flex;
    align-items: center;
    margin-left: 25px;
`;
const Input=styled.input`
    border: none;
`;
const Name=styled.h1`
    font-weight: bold;
    text-align: left;
`;
const Navbar = () => {
  return (
    <Container>
        <Wrapper>
            <Left><Name>CropByte</Name></Left>
            <Right>
                <SearchContainer>
                <Input placeholder="Search" />
                <Search style={{ fontSize: 16 }} />
                </SearchContainer>
            </Right>
        <Right>Home</Right>
        <Right>Cart</Right>
        <Right>My Orders</Right>
        <Right>LogOut</Right>
        </Wrapper>
        
    </Container>
  )
}

export default Navbar
