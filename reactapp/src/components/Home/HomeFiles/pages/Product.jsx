import styled from "styled-components";
import Navbar from "../Components/Navbar";
import Newsletter from "../Components/Newsletter";
const Container = styled.div``;

const Product = () => {
  return (
    <Container>
      <Navbar/>
      <Wrapper>
          <ImgContainer>
          </ImgContainer>
      </Wrapper>
      <Newsletter/>
    </Container>
  )
}

export default Product
