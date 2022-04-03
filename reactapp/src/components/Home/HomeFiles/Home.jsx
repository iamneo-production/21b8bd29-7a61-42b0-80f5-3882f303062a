import React from 'react'
import Navbar from '../Components/Navbar'
import Newsletter from '../Components/Newsletter'
import Products from '../Components/Products'

const Home = () => {
  return (
    <div>
      <Navbar/>
      <Products/>
      <Newsletter/>
    </div>
  )
}

export default Home
