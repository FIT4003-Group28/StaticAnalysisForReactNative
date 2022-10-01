/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 */
import type { Node } from 'react';
import React, { useState } from "react";
import {
  Button, StyleSheet, Text, View
} from "react-native";
import RTNCounter from 'rtn-counter/js/NativeRTNCounter.js';


const App: () => Node = () => {
  const [javaEventCount, setJavaEventCount] = useState(0);
  const [jsEventCount, setJSEventCount] = useState(0);

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
          <Button title="Javascript -> Java"
            onPress={async () => {
              const value = await RTNCounter.createEventPromise();
              setJavaEventCount(value);
            }} />
        </View>

        <View style={styles.button}>
          <Button title="Javascript -> Javascript" onPress={() => setJSEventCount(jsEventCount + 1)} />
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
    margin: 5,
    flex: 0
  }
});