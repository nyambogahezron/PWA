import React from 'react';
import { View, Text, Button } from 'react-native';

export default function App() {
  const handlePress = () => {
    alert('Hello, PWA!');
  };

  return (
    <View style={{ flex: 1, justifyContent: 'center', alignItems: 'center' }}>
      <Text>Welcome to My PWA!</Text>
      <Button title='Click Me' onPress={handlePress} />
    </View>
  );
}
