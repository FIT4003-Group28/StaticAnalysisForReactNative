import React, { useEffect, useState } from "react";
import {
  Button, NativeEventEmitter, NativeModules, StyleSheet, Text, View
} from "react-native";

const { JavaEventModule } = NativeModules;
const eventEmitter = new NativeEventEmitter(JavaEventModule);

const App = props => {
  const [javaEventCount, setJavaEventCount] = useState(0);
  const [jsEventCount, setJSEventCount] = useState(0);

  useEffect(() => {
    eventEmitter.addListener("EventCount", (eventCount) => {
      console.log(eventCount);
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
          <Button title="Create Java Event" onPress={createJavaEventPromise} />
        </View>
        <View style={styles.button}>
          <Button title="Create Javascript Event" onPress={() => setJSEventCount(() => setJSEventCount(jsEventCount + 1))} />
        </View>
        <View style={styles.button}>
          <Button title="Create Java Then JS Event" onPress={() => console.log("test")} />
        </View>
        <View style={styles.button}>
          <Button title="Create JS Then Java Event" onPress={() => console.log("test")} />
        </View>
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
    margin: 5
  }
});