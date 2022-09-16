package com.teslamotors.plugins.proximitysensornotifier;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.af;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.ar;
import com.facebook.react.bridge.b;
import com.facebook.react.modules.core.DeviceEventManagerModule;
/* loaded from: classes.dex */
public class ProximitySensorNotifierModule extends ReactContextBaseJavaModule implements SensorEventListener {
    private static final String PROXIMITY_SENSOR_NEAR = "near";
    private static final String REACT_CLASS = "TMProximitySensorNotifier";
    private static final String TAG = "ProximitySensorNotifierModule";
    private Sensor mProximitySensor;
    private SensorManager mSensorManager;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public ProximitySensorNotifierModule(ah ahVar) {
        super(ahVar);
        this.mSensorManager = (SensorManager) ahVar.getSystemService("sensor");
        this.mProximitySensor = this.mSensorManager.getDefaultSensor(8);
    }

    @al
    public void setProximitySensorMonitoringEnabled(Boolean bool, af afVar) {
        if (bool.booleanValue()) {
            this.mSensorManager.registerListener(this, this.mProximitySensor, 0);
        } else {
            this.mSensorManager.unregisterListener(this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        boolean z = false;
        float f = sensorEvent.values[0];
        if (f != this.mProximitySensor.getMaximumRange() && f <= 3.0f) {
            z = true;
        }
        sendProximitySensorStateChangedEvent(z);
    }

    private void sendProximitySensorStateChangedEvent(boolean z) {
        if (getReactApplicationContext().b()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().a(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("proximitySensorStateChanged", createProximitySensorStateMap(z));
        }
    }

    private ar createProximitySensorStateMap(boolean z) {
        ar b2 = b.b();
        b2.putBoolean(PROXIMITY_SENSOR_NEAR, z);
        return b2;
    }
}
