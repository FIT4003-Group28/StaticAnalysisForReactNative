/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 */
import type { Node } from 'react';
import React, { useState } from 'react';
import {
  Button, SafeAreaView,
  StatusBar,
  Text
} from 'react-native';
import RTNCalculator from 'rtn-calculator/js/NativeCalculator.js';

const App: () => Node = () => {
  const [addResult, setAddResult] = useState < number | null > (null);
  const [subtractResult, setSubtractResult] = useState < number | null > (null);
  const [multiplyResult, setMultiplyResult] = useState < number | null > (null);
  const [divideResult, setDivideResult] = useState < number | null > (null);

  return (
    <SafeAreaView>
      <StatusBar barStyle={'dark-content'} />

      {/* Add */}
      <Text style={{ marginLeft: 20, marginTop: 20 }}>
        8+2={addResult ?? '??'}
      </Text>
      <Button
        title="Add"
        onPress={async () => {
          const value = await RTNCalculator.add(8, 2);
          setAddResult(value);
        }} />

      {/* Subtract */}
      <Text style={{ marginLeft: 20, marginTop: 20 }}>
        8-2={subtractResult ?? '??'}
      </Text>
      <Button
        title="Subtract"
        onPress={async () => {
          const value = await RTNCalculator.subtract(8, 2);
          setSubtractResult(value);
        }} />

      {/* Multiply */}
      <Text style={{ marginLeft: 20, marginTop: 20 }}>
        8x2={multiplyResult ?? '??'}
      </Text>
      <Button
        title="Multiply"
        onPress={async () => {
          const value = await RTNCalculator.multiply(8, 2);
          setMultiplyResult(value);
        }} />

      {/* Divide */}
      <Text style={{ marginLeft: 20, marginTop: 20 }}>
        8/2={divideResult ?? '??'}
      </Text>
      <Button
        title="Divide"
        onPress={async () => {
          const value = await RTNCalculator.divide(8, 2);
          setDivideResult(value);
        }} />

    </SafeAreaView>
  );
};
export default App;