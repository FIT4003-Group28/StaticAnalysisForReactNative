package com.teslamotors.plugins.ble;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.SystemClock;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.af;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.ar;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.teslamotors.a.a;
import com.teslamotors.plugins.ble.b.h;
import com.teslamotors.plugins.ble.b.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class BLEModule extends ReactContextBaseJavaModule implements com.teslamotors.plugins.client.b {
    private static final String TAG = "BLEModule";
    private af clearPromise;
    private AtomicInteger currentCommandID;
    private String initializationMessage;
    boolean mBound;
    private com.teslamotors.plugins.client.e mClient;
    private Map<Integer, af> mCommandPromises;
    private Context mContext;
    private boolean mEventSubscriptionsReady;
    private Handler mHandler;
    private final Messenger mMessenger;
    Messenger mService;
    private final ServiceConnection mServiceConnection;
    private af publicKeyInfoPromise;
    private af scanPromise;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "TMBLE";
    }

    /* loaded from: classes.dex */
    class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            data.setClassLoader(getClass().getClassLoader());
            switch (com.teslamotors.plugins.ble.b.d.a(message.what)) {
                case ClearPeripheralsResult:
                    BLEModule.this.onClearPeripheralsResult();
                    return;
                case ScanForPeripheralsResult:
                    BLEModule.this.onScanForPeripheralsResult((i) data.getParcelable(com.teslamotors.plugins.ble.b.d.ScanForPeripheralsResult.b()));
                    return;
                case PublicKeyInfoResult:
                    BLEModule.this.onPublicKeyInfoResult((com.teslamotors.plugins.ble.b.g) data.getParcelable(com.teslamotors.plugins.ble.b.d.PublicKeyInfoResult.b()));
                    return;
                case CommandResult:
                    BLEModule.this.onCommandResult((com.teslamotors.plugins.ble.b.a) data.getParcelable(com.teslamotors.plugins.ble.b.d.CommandResult.b()));
                    return;
                case StatusMessage:
                    BLEModule.this.onStatusMessage((h) data.getParcelable(com.teslamotors.plugins.ble.b.d.StatusMessage.b()));
                    return;
                case LogMessage:
                    com.teslamotors.plugins.ble.b.c cVar = (com.teslamotors.plugins.ble.b.c) data.getParcelable(com.teslamotors.plugins.ble.b.d.LogMessage.b());
                    if (cVar == null) {
                        return;
                    }
                    if (cVar.c() == 6) {
                        BLEModule.this.mClient.a(cVar.a(), cVar.b(), cVar.d());
                        return;
                    } else {
                        BLEModule.this.mClient.a(cVar.a(), cVar.b());
                        return;
                    }
                case RegisterComplete:
                    BLEModule.this.getStatus(null);
                    return;
                default:
                    super.handleMessage(message);
                    return;
            }
        }
    }

    private ar getPeripheralsAsMap(com.teslamotors.plugins.ble.b.f fVar) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (fVar != null) {
            for (Map.Entry<String, com.teslamotors.plugins.ble.b.e> entry : fVar.f5214a.entrySet()) {
                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                com.teslamotors.plugins.ble.b.e value = entry.getValue();
                writableNativeMap2.putString("name", value.f5210a);
                writableNativeMap2.putBoolean("connected", value.f5211b);
                writableNativeMap2.putString("identifier", value.f5212c);
                writableNativeMap2.putInt("rssi", value.f5213d);
                writableNativeMap.a(entry.getKey(), writableNativeMap2);
            }
        }
        return writableNativeMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onClearPeripheralsResult() {
        if (this.clearPromise != null) {
            this.clearPromise.a((Object) null);
            this.clearPromise = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onScanForPeripheralsResult(i iVar) {
        if (this.scanPromise != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putInt("total_found", iVar.f5223c);
            writableNativeMap.putString("error", iVar.f5222b);
            writableNativeMap.putBoolean("success", iVar.f5221a);
            writableNativeMap.a("peripherals", getPeripheralsAsMap(iVar.f5224d));
            this.scanPromise.a(writableNativeMap);
            this.scanPromise = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCommandResult(com.teslamotors.plugins.ble.b.a aVar) {
        boolean z = true;
        if (!this.mCommandPromises.containsKey(Integer.valueOf(aVar.f5195c))) {
            logInfo(String.format("Got command result of %s - %s for ID %s with no associated promise", aVar.f5193a.name(), aVar.f5194b, Integer.valueOf(aVar.f5195c)));
            return;
        }
        logInfo(String.format("Got command result of %s - %s for ID %s", aVar.f5193a.name(), aVar.f5194b, Integer.valueOf(aVar.f5195c)));
        this.mHandler.removeCallbacksAndMessages(Integer.valueOf(aVar.f5195c));
        if (aVar.f5193a == com.teslamotors.plugins.ble.b.b.WAIT) {
            addCommandTimeout(aVar.f5195c);
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (aVar.f5193a != com.teslamotors.plugins.ble.b.b.OK) {
            z = false;
        }
        writableNativeMap.putBoolean("success", z);
        writableNativeMap.putString("error", aVar.f5194b);
        this.mCommandPromises.get(Integer.valueOf(aVar.f5195c)).a(writableNativeMap);
        this.mCommandPromises.remove(Integer.valueOf(aVar.f5195c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onStatusMessage(h hVar) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (hVar.f5217a != null) {
            writableNativeMap.putBoolean("df", hVar.f5217a.booleanValue());
        }
        if (hVar.f5219c != null) {
            writableNativeMap.putBoolean("dr", hVar.f5219c.booleanValue());
        }
        if (hVar.f5218b != null) {
            writableNativeMap.putBoolean("pf", hVar.f5218b.booleanValue());
        }
        if (hVar.f5220d != null) {
            writableNativeMap.putBoolean("pr", hVar.f5220d.booleanValue());
        }
        if (hVar.e != null) {
            writableNativeMap.putBoolean("ft", hVar.e.booleanValue());
        }
        if (hVar.f != null) {
            writableNativeMap.putBoolean("rt", hVar.f.booleanValue());
        }
        if (hVar.g != null) {
            writableNativeMap.putBoolean("cp", hVar.g.booleanValue());
        }
        writableNativeMap.putBoolean("remote_start", hVar.j);
        writableNativeMap.putBoolean("locked", hVar.h);
        writableNativeMap.putBoolean("locked_before_2017_40", hVar.i);
        writableNativeMap.putString("vin", hVar.k);
        writableNativeMap.putInt("whitelist_key_count", hVar.l);
        writableNativeMap.putBoolean("whitelist_has_key", hVar.m);
        writableNativeMap.putBoolean("local_key_pair", hVar.n);
        writableNativeMap.putBoolean("remote_key_pair", hVar.o);
        writableNativeMap.putBoolean("shared_secret", hVar.p);
        writableNativeMap.putInt("session_counter", (int) hVar.q);
        writableNativeMap.putInt("permissions", hVar.r);
        writableNativeMap.putBoolean("is_connected", hVar.u);
        writableNativeMap.putString("command_peripheral", hVar.v);
        writableNativeMap.putDouble("timestamp", hVar.s);
        writableNativeMap.putBoolean("bluetooth_enabled", hVar.t);
        writableNativeMap.a("peripherals", getPeripheralsAsMap(hVar.w));
        writableNativeMap.putBoolean("hw_filtering", hVar.x);
        writableNativeMap.a("capabilities", com.teslamotors.plugins.client.d.b.b(new JSONObject(hVar.y)));
        emitDeviceEvent("ble:status", writableNativeMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logInfo(String str) {
        this.mClient.a(TAG, String.format("[TMBLE Module] %s", str));
    }

    private void logError(String str, Exception exc) {
        this.mClient.a(TAG, String.format("[TMBLE Module Error] %s", str), exc);
    }

    public BLEModule(ah ahVar) {
        super(ahVar);
        this.currentCommandID = new AtomicInteger(1);
        this.mServiceConnection = new ServiceConnection() { // from class: com.teslamotors.plugins.ble.BLEModule.1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                BLEModule.this.mService = new Messenger(iBinder);
                BLEModule.this.mBound = true;
                Message obtain = Message.obtain();
                obtain.what = com.teslamotors.plugins.ble.b.d.Register.a();
                BLEModule.this.sendMessage(obtain);
                BLEModule.this.markEventSubscriptionsReady(BLEModule.this.mEventSubscriptionsReady);
                if (!BLEModule.this.mEventSubscriptionsReady) {
                    BLEModule.this.logInfo("BLEService was bound when event subscriptions weren't ready");
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                BLEModule.this.mBound = false;
                BLEModule.this.mService = null;
            }
        };
        this.mContext = ahVar.getApplicationContext();
        this.mClient = com.teslamotors.plugins.client.e.a(ahVar);
        this.mClient.a(this);
        this.mMessenger = new Messenger(new a(getReactApplicationContext().getMainLooper()));
        this.mCommandPromises = new ConcurrentHashMap();
        this.mHandler = new Handler(getReactApplicationContext().getMainLooper());
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        String y = this.mClient.y();
        String x = this.mClient.x();
        String d2 = this.mClient.d(y);
        if (BLEService.a(getReactApplicationContext(), y, x)) {
            startService(y, x, d2);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        if (this.mBound) {
            Message obtain = Message.obtain();
            obtain.what = com.teslamotors.plugins.ble.b.d.Unregister.a();
            sendMessage(obtain);
            getReactApplicationContext().unbindService(this.mServiceConnection);
            this.mBound = false;
        }
    }

    @al
    public void markEventSubscriptionsReady(boolean z) {
        this.mEventSubscriptionsReady = z;
        if (z && this.initializationMessage != null) {
            this.mClient.a(TAG, this.initializationMessage);
            this.initializationMessage = null;
        }
        Message obtain = Message.obtain();
        obtain.what = com.teslamotors.plugins.ble.b.d.SetEventSubscriptionsReady.a();
        Bundle bundle = new Bundle();
        bundle.putBoolean(com.teslamotors.plugins.ble.b.d.SetEventSubscriptionsReady.b(), this.mEventSubscriptionsReady);
        obtain.setData(bundle);
        if (sendMessage(obtain) || !z) {
            return;
        }
        logInfo("Failed to notify service that event subscriptions were ready");
    }

    @al
    public void scanForPeripherals(String str, boolean z, af afVar) {
        this.scanPromise = afVar;
        Message obtain = Message.obtain();
        obtain.what = com.teslamotors.plugins.ble.b.d.ScanForPeripherals.a();
        Bundle bundle = new Bundle();
        bundle.putString(com.teslamotors.plugins.ble.b.d.ScanForPeripherals.b(), str);
        obtain.setData(bundle);
        obtain.arg1 = z ? 1 : 0;
        if (sendMessage(obtain) || this.scanPromise == null) {
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("success", false);
        writableNativeMap.putString("error", "PHONE_KEY_SCAN_FAILURE");
        this.scanPromise.a(writableNativeMap);
        this.scanPromise = null;
        com.teslamotors.plugins.client.e a2 = com.teslamotors.plugins.client.e.a(getReactApplicationContext());
        startService(str, a2.x(), a2.d(str));
    }

    private void addCommandTimeout(final int i) {
        this.mHandler.removeCallbacksAndMessages(Integer.valueOf(i));
        this.mHandler.postAtTime(new Runnable() { // from class: com.teslamotors.plugins.ble.BLEModule.2
            @Override // java.lang.Runnable
            public void run() {
                if (BLEModule.this.mCommandPromises.containsKey(Integer.valueOf(i))) {
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putBoolean("success", false);
                    writableNativeMap.putString("error", "PHONE_KEY_COMMAND_TIMEOUT");
                    ((af) BLEModule.this.mCommandPromises.get(Integer.valueOf(i))).a(writableNativeMap);
                    BLEModule.this.mCommandPromises.remove(Integer.valueOf(i));
                }
            }
        }, Integer.valueOf(i), SystemClock.uptimeMillis() + 6000);
    }

    @al
    public void resetCommandPeripheral() {
        Message obtain = Message.obtain();
        obtain.what = com.teslamotors.plugins.ble.b.d.ResetCommandPeripheral.a();
        sendMessage(obtain);
    }

    @al
    public void startMonitoringRSSI() {
        Message obtain = Message.obtain();
        obtain.what = com.teslamotors.plugins.ble.b.d.StartMonitoringRSSI.a();
        sendMessage(obtain);
    }

    @al
    public void stopMonitoringRSSI() {
        Message obtain = Message.obtain();
        obtain.what = com.teslamotors.plugins.ble.b.d.StopMonitoringRSSI.a();
        sendMessage(obtain);
    }

    @al
    public void startService(String str, String str2, String str3) {
        Intent intent = new Intent(getReactApplicationContext(), BLEService.class);
        intent.putExtra("VIN", str);
        intent.putExtra("ACCOUNT_EMAIL", str2);
        intent.putExtra("VEHICLE_NAME", str3);
        getReactApplicationContext().startService(intent);
        getReactApplicationContext().bindService(intent, this.mServiceConnection, 1);
    }

    @al
    public void getStatus(af afVar) {
        Message obtain = Message.obtain();
        obtain.what = com.teslamotors.plugins.ble.b.d.GetStatus.a();
        sendMessage(obtain);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("success", true);
        if (afVar != null) {
            afVar.a(writableNativeMap);
        }
    }

    @al
    public void setStayConnectedWhenUnauthorized(boolean z) {
        Message obtain = Message.obtain();
        obtain.what = com.teslamotors.plugins.ble.b.d.SetConnectionBehaviorWhenUnauthorized.a();
        obtain.arg1 = z ? 1 : 0;
        sendMessage(obtain);
    }

    @al
    public void sendNullAuthResponse(af afVar) {
        Message obtain = Message.obtain();
        obtain.what = com.teslamotors.plugins.ble.b.d.AuthResponse.a();
        obtain.arg1 = nextCommandID();
        obtain.arg2 = a.EnumC0091a.AUTHENTICATION_LEVEL_NONE.a();
        sendMessage(obtain);
        this.mCommandPromises.put(Integer.valueOf(obtain.arg1), afVar);
        addCommandTimeout(obtain.arg1);
    }

    @al
    public void commandUnlock(af afVar) {
        Message obtain = Message.obtain();
        obtain.what = com.teslamotors.plugins.ble.b.d.UnlockCar.a();
        obtain.arg1 = nextCommandID();
        sendMessage(obtain);
        this.mCommandPromises.put(Integer.valueOf(obtain.arg1), afVar);
        addCommandTimeout(obtain.arg1);
    }

    @al
    public void commandLock(af afVar) {
        Message obtain = Message.obtain();
        obtain.what = com.teslamotors.plugins.ble.b.d.LockCar.a();
        obtain.arg1 = nextCommandID();
        sendMessage(obtain);
        this.mCommandPromises.put(Integer.valueOf(obtain.arg1), afVar);
        addCommandTimeout(obtain.arg1);
    }

    @al
    public void commandFrunk(af afVar) {
        Message obtain = Message.obtain();
        obtain.what = com.teslamotors.plugins.ble.b.d.OpenFrunk.a();
        obtain.arg1 = nextCommandID();
        sendMessage(obtain);
        this.mCommandPromises.put(Integer.valueOf(obtain.arg1), afVar);
        addCommandTimeout(obtain.arg1);
    }

    @al
    public void commandTrunk(af afVar) {
        Message obtain = Message.obtain();
        obtain.what = com.teslamotors.plugins.ble.b.d.OpenTrunk.a();
        obtain.arg1 = nextCommandID();
        sendMessage(obtain);
        this.mCommandPromises.put(Integer.valueOf(obtain.arg1), afVar);
        addCommandTimeout(obtain.arg1);
    }

    @al
    public void commandOpenChargePort(af afVar) {
        Message obtain = Message.obtain();
        obtain.what = com.teslamotors.plugins.ble.b.d.OpenChargePort.a();
        obtain.arg1 = nextCommandID();
        sendMessage(obtain);
        this.mCommandPromises.put(Integer.valueOf(obtain.arg1), afVar);
        addCommandTimeout(obtain.arg1);
    }

    @al
    public void commandCloseChargePort(af afVar) {
        Message obtain = Message.obtain();
        obtain.what = com.teslamotors.plugins.ble.b.d.CloseChargePort.a();
        obtain.arg1 = nextCommandID();
        sendMessage(obtain);
        this.mCommandPromises.put(Integer.valueOf(obtain.arg1), afVar);
        addCommandTimeout(obtain.arg1);
    }

    @al
    public void clearPeripherals(af afVar) {
        Message obtain = Message.obtain();
        obtain.what = com.teslamotors.plugins.ble.b.d.ClearPeripherals.a();
        boolean sendMessage = sendMessage(obtain);
        this.clearPromise = afVar;
        if (!sendMessage) {
            com.teslamotors.plugins.client.e a2 = com.teslamotors.plugins.client.e.a(getReactApplicationContext());
            a2.a(a2.y(), a2.x(), new HashSet());
            if (this.clearPromise == null) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putBoolean("success", true);
            this.clearPromise.a(writableNativeMap);
            this.clearPromise = null;
        }
    }

    @al
    public void addToWhitelist(af afVar) {
        Message obtain = Message.obtain();
        obtain.what = com.teslamotors.plugins.ble.b.d.AddToWhitelist.a();
        obtain.arg1 = nextCommandID();
        sendMessage(obtain);
        this.mCommandPromises.put(Integer.valueOf(obtain.arg1), afVar);
        addCommandTimeout(obtain.arg1);
    }

    @al
    public void removeFromWhitelist(af afVar) {
        Message obtain = Message.obtain();
        obtain.what = com.teslamotors.plugins.ble.b.d.RemoveFromWhitelist.a();
        obtain.arg1 = nextCommandID();
        sendMessage(obtain);
        this.mCommandPromises.put(Integer.valueOf(obtain.arg1), afVar);
        addCommandTimeout(obtain.arg1);
    }

    @al
    public void updateWhitelist(af afVar) {
        Message obtain = Message.obtain();
        obtain.what = com.teslamotors.plugins.ble.b.d.GetWhiteslistUpdate.a();
        obtain.arg1 = nextCommandID();
        sendMessage(obtain);
        this.mCommandPromises.put(Integer.valueOf(obtain.arg1), afVar);
        addCommandTimeout(obtain.arg1);
    }

    @al
    public void setAccountEmail(String str) {
        if (this.mBound) {
            Message obtain = Message.obtain();
            obtain.what = com.teslamotors.plugins.ble.b.d.SetAccountEmail.a();
            Bundle bundle = new Bundle();
            bundle.putString(com.teslamotors.plugins.ble.b.d.SetAccountEmail.b(), str);
            obtain.setData(bundle);
            sendMessage(obtain);
        }
    }

    @al
    public void setSelectedVIN(String str, String str2) {
        String x = com.teslamotors.plugins.client.e.a(getReactApplicationContext()).x();
        if (!this.mBound && BLEService.a(getReactApplicationContext(), str, x)) {
            startService(str, x, str2);
        } else if (!this.mBound) {
        } else {
            Message obtain = Message.obtain();
            obtain.what = com.teslamotors.plugins.ble.b.d.SetVin.a();
            Bundle bundle = new Bundle();
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(str);
            arrayList.add(str2);
            bundle.putStringArrayList(com.teslamotors.plugins.ble.b.d.SetVin.b(), arrayList);
            obtain.setData(bundle);
            sendMessage(obtain);
        }
    }

    @al
    public void getPublicKeyInfo(af afVar) {
        this.publicKeyInfoPromise = afVar;
        Message obtain = Message.obtain();
        obtain.what = com.teslamotors.plugins.ble.b.d.GetPublicKeyInfo.a();
        if (sendMessage(obtain) || afVar == null) {
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("success", false);
        writableNativeMap.putString("error", "PHONE_KEY_PUBLIC_KEY_RETRIEVAL_ERROR");
        this.publicKeyInfoPromise.a(writableNativeMap);
        this.publicKeyInfoPromise = null;
    }

    @al
    public void promoteServiceToForeground() {
        if (this.mBound) {
            Message obtain = Message.obtain();
            obtain.what = com.teslamotors.plugins.ble.b.d.PromoteServiceToForeground.a();
            sendMessage(obtain);
        }
    }

    private void stopService() {
        if (this.mBound) {
            Message obtain = Message.obtain();
            obtain.what = com.teslamotors.plugins.ble.b.d.Unregister.a();
            sendMessage(obtain);
            getReactApplicationContext().unbindService(this.mServiceConnection);
            this.mBound = false;
        }
        BLEService.d(getReactApplicationContext());
        BLEService.b(getReactApplicationContext());
        getReactApplicationContext().stopService(new Intent(getReactApplicationContext(), BLEService.class));
    }

    private int nextCommandID() {
        return this.currentCommandID.getAndAdd(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPublicKeyInfoResult(com.teslamotors.plugins.ble.b.g gVar) {
        if (this.publicKeyInfoPromise != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putBoolean("success", (gVar == null || gVar.a() == null || gVar.b() == null) ? false : true);
            writableNativeMap.putString("public_key", gVar.b() == null ? "" : g.a(gVar.b()));
            writableNativeMap.putString("key_hash", gVar.a() == null ? "" : gVar.a());
            if (gVar == null) {
                writableNativeMap.putString("error", "PHONE_KEY_PUBLIC_KEY_NOT_FOUND");
            }
            this.publicKeyInfoPromise.a(writableNativeMap);
            this.publicKeyInfoPromise = null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException
        	at java.util.BitSet.or(BitSet.java:940)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:732)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:811)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:706)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public boolean sendMessage(android.os.Message r3) {
        /*
            r2 = this;
            boolean r0 = r2.mBound
            r1 = 0
            if (r0 == 0) goto L14
            android.os.Messenger r0 = r2.mService
            if (r0 != 0) goto La
            goto L14
        La:
            android.os.Messenger r0 = r2.mMessenger     // Catch: android.os.RemoteException -> L14
            r3.replyTo = r0     // Catch: android.os.RemoteException -> L14
            android.os.Messenger r0 = r2.mService     // Catch: android.os.RemoteException -> L14
            r0.send(r3)     // Catch: android.os.RemoteException -> L14
            r1 = 1
        L14:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.plugins.ble.BLEModule.sendMessage(android.os.Message):boolean");
    }

    @Override // com.teslamotors.plugins.client.b
    public void emitDeviceEvent(String str, Object obj) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().a(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, obj);
    }
}
