
import type { Node } from 'react';
import React from 'react';
import RTNCenteredText from 'rtn-centered-text/js/RTNCenteredTextNativeComponent';


const App: () => Node = () => {
  return (
    <RTNCenteredText
      text="Hello World!"
      style={{ width: '100%', height: 30 }}
    />
  );
};

export default App;
