import React, { useEffect, useState } from "react";
import {
  Button, NativeEventEmitter, NativeModules, StyleSheet, Text, View
} from "react-native";
import CustomNativeButton from "./CustomNativeButtonComponent.js";

const { JavaEventModule } = NativeModules;
const eventEmitter = new NativeEventEmitter(JavaEventModule);

const App = props => {
  const [javaEventCount, setJavaEventCount] = useState(0);
  const [jsEventCount, setJSEventCount] = useState(0);

  useEffect(() => {
    eventEmitter.addListener("EventCount", (eventCount) => {
      if (eventCount != null) {
        setJavaEventCount(eventCount);
      }
    });

    return () => {
      eventEmitter.removeAllListeners();
    };

  }, []);

  const createJavaEventPromise = async () => {
    try {
      var result = await JavaEventModule.createEventPromise();
    } catch (e) {
      console.log(e);
    }
  }

  return (
    <View style={styles.container}>
      <View style={{ flexDirection: 'row' }}>
        <View>
          <Text style={{ fontSize: 20, marginBottom: -20 }}>Java</Text>
          <Text style={{ fontSize: 60, marginBottom: -20, paddingTop: 20, paddingBottom: 40 }}>{javaEventCount}</Text>
        </View>
        <Text>                  </Text>
        <View>
          <Text style={{ fontSize: 20, marginBottom: -20 }}>JS</Text>
          <Text style={{ fontSize: 60, marginBottom: -20, paddingTop: 20, paddingBottom: 40 }}>{jsEventCount}</Text>
        </View>
      </View>
      <View style={styles.button_container}>
        <View style={styles.button}>
          <Button title="Call Java" onPress={createJavaEventPromise} />
        </View>

        <CustomNativeButton title="Call Javascript" onClick={() => setJSEventCount(jsEventCount + 1)} />
        <View style={styles.button}>
          <Button title="Call Java Then Javascript " onPress={() => console.log("test")} />
        </View>

        <CustomNativeButton title="Call Javascript Then Java" onClick={() => {
          setJSEventCount(jsEventCount + 1);
          createJavaEventPromise();
        }} />
      </View>
    </View>
  );
};
export default App;

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  button_container: {
    justifyContent: 'space-between'
  },
  button: {
    height: 40,
    margin: 5,
    flex: 0
  }
});