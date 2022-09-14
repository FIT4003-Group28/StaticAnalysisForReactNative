package com.facebook.react.modules.netinfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.af;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.ar;
import com.facebook.react.bridge.x;
import com.facebook.react.modules.core.DeviceEventManagerModule;
/* loaded from: classes.dex */
public class NetInfoModule extends ReactContextBaseJavaModule implements x {
    private static final String CONNECTION_TYPE_BLUETOOTH = "bluetooth";
    private static final String CONNECTION_TYPE_CELLULAR = "cellular";
    private static final String CONNECTION_TYPE_ETHERNET = "ethernet";
    private static final String CONNECTION_TYPE_NONE = "none";
    private static final String CONNECTION_TYPE_NONE_DEPRECATED = "NONE";
    private static final String CONNECTION_TYPE_UNKNOWN = "unknown";
    private static final String CONNECTION_TYPE_UNKNOWN_DEPRECATED = "UNKNOWN";
    private static final String CONNECTION_TYPE_WIFI = "wifi";
    private static final String CONNECTION_TYPE_WIMAX = "wimax";
    private static final String EFFECTIVE_CONNECTION_TYPE_2G = "2g";
    private static final String EFFECTIVE_CONNECTION_TYPE_3G = "3g";
    private static final String EFFECTIVE_CONNECTION_TYPE_4G = "4g";
    private static final String EFFECTIVE_CONNECTION_TYPE_UNKNOWN = "unknown";
    private static final String ERROR_MISSING_PERMISSION = "E_MISSING_PERMISSION";
    private static final String MISSING_PERMISSION_MESSAGE = "To use NetInfo on Android, add the following to your AndroidManifest.xml:\n<uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />";
    private String mConnectionType;
    private final a mConnectivityBroadcastReceiver;
    private String mConnectivityDeprecated;
    private final ConnectivityManager mConnectivityManager;
    private String mEffectiveConnectionType;
    private boolean mNoNetworkPermission;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "NetInfo";
    }

    @Override // com.facebook.react.bridge.x
    public void onHostDestroy() {
    }

    public NetInfoModule(ah ahVar) {
        super(ahVar);
        this.mNoNetworkPermission = false;
        this.mConnectivityDeprecated = CONNECTION_TYPE_UNKNOWN_DEPRECATED;
        this.mConnectionType = "unknown";
        this.mEffectiveConnectionType = "unknown";
        this.mConnectivityManager = (ConnectivityManager) ahVar.getSystemService("connectivity");
        this.mConnectivityBroadcastReceiver = new a();
    }

    @Override // com.facebook.react.bridge.x
    public void onHostResume() {
        registerReceiver();
    }

    @Override // com.facebook.react.bridge.x
    public void onHostPause() {
        unregisterReceiver();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().a(this);
    }

    @al
    public void getCurrentConnectivity(af afVar) {
        if (this.mNoNetworkPermission) {
            afVar.a(ERROR_MISSING_PERMISSION, MISSING_PERMISSION_MESSAGE, null);
        } else {
            afVar.a(createConnectivityEventMap());
        }
    }

    @al
    public void isConnectionMetered(af afVar) {
        if (this.mNoNetworkPermission) {
            afVar.a(ERROR_MISSING_PERMISSION, MISSING_PERMISSION_MESSAGE, null);
        } else {
            afVar.a(Boolean.valueOf(android.support.v4.e.a.a(this.mConnectivityManager)));
        }
    }

    private void registerReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        getReactApplicationContext().registerReceiver(this.mConnectivityBroadcastReceiver, intentFilter);
        this.mConnectivityBroadcastReceiver.a(true);
        updateAndSendConnectionType();
    }

    private void unregisterReceiver() {
        if (this.mConnectivityBroadcastReceiver.a()) {
            getReactApplicationContext().unregisterReceiver(this.mConnectivityBroadcastReceiver);
            this.mConnectivityBroadcastReceiver.a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAndSendConnectionType() {
        String str;
        String currentConnectionType;
        NetworkInfo activeNetworkInfo;
        String str2 = "unknown";
        try {
            activeNetworkInfo = this.mConnectivityManager.getActiveNetworkInfo();
        } catch (SecurityException unused) {
            this.mNoNetworkPermission = true;
            str = "unknown";
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            switch (activeNetworkInfo.getType()) {
                case 0:
                case 4:
                    str2 = getEffectiveConnectionType(activeNetworkInfo);
                    str = CONNECTION_TYPE_CELLULAR;
                    break;
                case 1:
                    str = CONNECTION_TYPE_WIFI;
                    break;
                case 2:
                case 3:
                case 5:
                case 8:
                default:
                    str = "unknown";
                    break;
                case 6:
                    str = CONNECTION_TYPE_WIMAX;
                    break;
                case 7:
                    str = CONNECTION_TYPE_BLUETOOTH;
                    break;
                case 9:
                    str = CONNECTION_TYPE_ETHERNET;
                    break;
            }
            currentConnectionType = getCurrentConnectionType();
            if (!str.equalsIgnoreCase(this.mConnectionType) && str2.equalsIgnoreCase(this.mEffectiveConnectionType) && currentConnectionType.equalsIgnoreCase(this.mConnectivityDeprecated)) {
                return;
            }
            this.mConnectionType = str;
            this.mEffectiveConnectionType = str2;
            this.mConnectivityDeprecated = currentConnectionType;
            sendConnectivityChangedEvent();
        }
        str = CONNECTION_TYPE_NONE;
        currentConnectionType = getCurrentConnectionType();
        if (!str.equalsIgnoreCase(this.mConnectionType)) {
        }
        this.mConnectionType = str;
        this.mEffectiveConnectionType = str2;
        this.mConnectivityDeprecated = currentConnectionType;
        sendConnectivityChangedEvent();
    }

    private String getCurrentConnectionType() {
        try {
            NetworkInfo activeNetworkInfo = this.mConnectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return ConnectivityManager.isNetworkTypeValid(activeNetworkInfo.getType()) ? activeNetworkInfo.getTypeName().toUpperCase() : CONNECTION_TYPE_UNKNOWN_DEPRECATED;
            }
            return CONNECTION_TYPE_NONE_DEPRECATED;
        } catch (SecurityException unused) {
            this.mNoNetworkPermission = true;
            return CONNECTION_TYPE_UNKNOWN_DEPRECATED;
        }
    }

    private String getEffectiveConnectionType(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return EFFECTIVE_CONNECTION_TYPE_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
                return EFFECTIVE_CONNECTION_TYPE_3G;
            case 13:
            case 15:
                return EFFECTIVE_CONNECTION_TYPE_4G;
            default:
                return "unknown";
        }
    }

    private void sendConnectivityChangedEvent() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().a(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("networkStatusDidChange", createConnectivityEventMap());
    }

    private ar createConnectivityEventMap() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("network_info", this.mConnectivityDeprecated);
        writableNativeMap.putString("connectionType", this.mConnectionType);
        writableNativeMap.putString("effectiveConnectionType", this.mEffectiveConnectionType);
        return writableNativeMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        private boolean f3596b;

        private a() {
            this.f3596b = false;
        }

        public void a(boolean z) {
            this.f3596b = z;
        }

        public boolean a() {
            return this.f3596b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                NetInfoModule.this.updateAndSendConnectionType();
            }
        }
    }
}
