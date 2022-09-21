import React from 'react';
import { StyleSheet, Text, TextInput, View } from 'react-native';

export default function XssComponent() {
  const handleChange = event => {
    document.getElementById("outputDiv").children[0].innerHTML = event.target.value;
  };

  return (
    <View>
        <div style={styles.container}>
            <p style={{width: '80%'}}>{`<div style="width:100%;height:100%;text-align:center;font-size:30px;color:red" onmouseover="alert('This is a XSS attack!')">hover for cool thing!</div>`}</p>
        </div>
        <div style={styles.container}>
            Input:<TextInput onChange={handleChange} style={styles.input}/>
        </div>  
        <div id="outputDiv" style={{width:'100%', display:'flex', justifyContent:'center'}}>
            <Text style={styles.textbox}></Text>
        </div>  
    </View>
  );
}

const styles = StyleSheet.create({
    container: {
        width: '100%',
        display: 'flex',
        flex: 1,
        textAlign: 'center',
        alignItems: 'center',
        justifyContent: 'center',
        marginBottom: '20px'
      },
    input: {
        border: '1px solid black',
    },
    textbox: {
        border: '1px solid black',
        height: 'auto',
        minHeight: '50px',
        width: '50%'
    }
});