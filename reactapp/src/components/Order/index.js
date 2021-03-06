var ServiceChooser = React.createClass({
    getInitialState: function(){
        return { total: 105 };
    },
    addTotal: function( price ){
        this.setState( { total: this.state.total + price } );
    },
    render: function() {
   var self = this;
      var services = this.props.items.map(function(s){
            // Create a new Service component for each item in the items array.
            // Notice that I pass the self.addTotal function to the component.
   return (
    <Service name={s.name} price={s.price} active={s.active} addTotal={self.addTotal} />
   );
 });
   
  return (
   <div>
    <h1>Order page</h1>
    <div id="services">
     {services}
     <p id="total">Total<b>Rs {this.state.total.toFixed(2)}</b></p>
    </div>
   </div>
  );
 }
});

var Service = React.createClass({
    getInitialState: function(){
        return { active: false };
    },
    clickHandler: function (){
        var active = !this.state.active;
        this.setState({ active: active });        
        // Notify the ServiceChooser, by calling its addTotal method
        this.props.addTotal( active ? this.props.price : -this.props.price );
    },
    render: function(){
        return (
     <p className={this.state.active ? 'active' : ''} onClick={this.clickHandler}>{this.props.name}<b>Rs {this.props.price.toFixed(2)}</b></p>
    );
    }
});

var services = [
    { name: 'tomato', price: 45 },
    { name: 'potato', price: 20 },
    { name: 'carrots', price: 30 },
    { name: 'green chilli', price: 10 }
];

// Render the ServiceChooser component, and pass the array of services
ReactDOM.render(<ServiceChooser items={ services } />, document.getElementById('container'));