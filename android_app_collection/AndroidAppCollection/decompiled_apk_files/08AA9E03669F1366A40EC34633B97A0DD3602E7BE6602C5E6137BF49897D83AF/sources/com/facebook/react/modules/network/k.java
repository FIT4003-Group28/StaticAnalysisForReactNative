package com.facebook.react.modules.network;

import com.facebook.react.bridge.aq;
import com.facebook.react.bridge.ar;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.IOException;
import java.net.SocketTimeoutException;
/* compiled from: ResponseUtil.java */
/* loaded from: classes.dex */
public class k {
    public static void a(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, long j, long j2) {
        aq a2 = com.facebook.react.bridge.b.a();
        a2.pushInt(i);
        a2.pushInt((int) j);
        a2.pushInt((int) j2);
        rCTDeviceEventEmitter.emit("didSendNetworkData", a2);
    }

    public static void a(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, String str, long j, long j2) {
        aq a2 = com.facebook.react.bridge.b.a();
        a2.pushInt(i);
        a2.pushString(str);
        a2.pushInt((int) j);
        a2.pushInt((int) j2);
        rCTDeviceEventEmitter.emit("didReceiveNetworkIncrementalData", a2);
    }

    public static void b(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, long j, long j2) {
        aq a2 = com.facebook.react.bridge.b.a();
        a2.pushInt(i);
        a2.pushInt((int) j);
        a2.pushInt((int) j2);
        rCTDeviceEventEmitter.emit("didReceiveNetworkDataProgress", a2);
    }

    public static void a(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, String str) {
        aq a2 = com.facebook.react.bridge.b.a();
        a2.pushInt(i);
        a2.pushString(str);
        rCTDeviceEventEmitter.emit("didReceiveNetworkData", a2);
    }

    public static void a(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, String str, IOException iOException) {
        aq a2 = com.facebook.react.bridge.b.a();
        a2.pushInt(i);
        a2.pushString(str);
        if (iOException != null && iOException.getClass() == SocketTimeoutException.class) {
            a2.pushBoolean(true);
        }
        rCTDeviceEventEmitter.emit("didCompleteNetworkResponse", a2);
    }

    public static void a(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i) {
        aq a2 = com.facebook.react.bridge.b.a();
        a2.pushInt(i);
        a2.pushNull();
        rCTDeviceEventEmitter.emit("didCompleteNetworkResponse", a2);
    }

    public static void a(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, int i2, ar arVar, String str) {
        aq a2 = com.facebook.react.bridge.b.a();
        a2.pushInt(i);
        a2.pushInt(i2);
        a2.a(arVar);
        a2.pushString(str);
        rCTDeviceEventEmitter.emit("didReceiveNetworkResponse", a2);
    }
}
