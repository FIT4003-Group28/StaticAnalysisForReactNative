import React, { useEffect, useState } from "react";
import { Button, NativeEventEmitter, NativeModules, StyleSheet, Text, View } from "react-native";
import CustomNativeButton from "./CustomNativeButtonComponent.js";

const { JavaEventModule } = NativeModules;
const eventEmitter = new NativeEventEmitter(JavaEventModule);

const App = props => {
  const [allValues, setAllValues] = useState({
    javaToJavaEventString: '',
    javaToJsEventString: '',
    jsToJavaEventString: '',
    jsToJsEventString: '',
 });


  const JavaScriptSourcedString = "Javascript Sourced String";

  useEffect(() => {
    eventEmitter.addListener("EventStringFromJava", (eventString) => {
      
    if (eventString != null) {
      setAllValues({...allValues, javaToJavaEventString: eventString});
    }

    return () => {
      eventEmitter.removeAllListeners();
    };
  }, [])});


  useEffect(() => {
    eventEmitter.addListener("EventStringFromJs", (eventString) => {
      
    if (eventString != null) {
      setAllValues({...allValues, jsToJavaEventString: eventString});
    }

    return () => {
      eventEmitter.removeAllListeners();
    };
  }, [])});


  const createJavaEventPromiseFromJava = async () => {
    try {
      await JavaEventModule.createEventPromiseFromJava();
    } catch (e) {
      console.log(e);
    }
  }

  const createJavaEventPromiseFromJs = async () => {
    try {
      await JavaEventModule.createEventPromiseFromJs();
    } catch (e) {
      console.log(e);
    }
  }

  handleOnPressJavaToJs = () => {
    setAllValues({...allValues, javaToJsEventString: JavaScriptSourcedString + " requested from Java"})
  }

  handleOnPressJsToJs = () => {
    setAllValues({...allValues, jsToJsEventString: JavaScriptSourcedString + " requested from Javascript"});
  }

  return (
    <View style={styles.container}>
      <Button title="Javascript -> Java" onPress={createJavaEventPromiseFromJs}  />
      <Text style={styles.text} >{allValues.jsToJavaEventString}</Text>

      <CustomNativeButton title="Java -> Javascript" onClick={handleOnPressJavaToJs} />
      <Text style={styles.text} >{allValues.javaToJsEventString}</Text>

      <Button title="Javascript -> Javascript" onPress={handleOnPressJsToJs} />
      <Text style={styles.text} >{allValues.jsToJsEventString}</Text>

      <CustomNativeButton title="Java -> Java" onClick={createJavaEventPromiseFromJava} />
      <Text style={styles.text} >{allValues.javaToJavaEventString}</Text>
    </View>
  );
};

export default App;

const styles = StyleSheet.create({
  container: {
    display: "flex",
    width: "100%",
    height: "100%",
    alignItems: 'center',
    justifyContent: 'center'
  },
  text: {
    fontSize: 15, 
    marginBottom: -20, 
    paddingTop: 20, 
    paddingBottom: 40, 
    textAlign: "center"
  }
});