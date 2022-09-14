package com.teslamotors.plugins.ble;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.ParcelUuid;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.app.y;
import android.util.Log;
import com.teslamotors.plugins.ble.b.h;
import com.teslamotors.plugins.ble.b.i;
import d.a.c.a;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
@TargetApi(21)
/* loaded from: classes.dex */
public class BLEService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public static final ScanSettings f5157a = new ScanSettings.Builder().setScanMode(2).build();

    /* renamed from: c  reason: collision with root package name */
    private static final String f5158c = "BLEService";
    private BluetoothManager f;
    private BluetoothAdapter g;
    private volatile b h;
    private boolean n;
    private boolean o;
    private boolean p;
    private h q;
    private Map<String, com.teslamotors.plugins.ble.a.c> t;
    private boolean u;
    private String v;
    private BluetoothLeScanner w;
    private boolean x;

    /* renamed from: d  reason: collision with root package name */
    private Queue<String> f5160d = new ArrayBlockingQueue(100);
    private boolean e = false;
    private com.teslamotors.plugins.ble.b i = new c();
    private String j = null;
    private String k = "";
    private String l = "";
    private long m = 0;
    private HashSet<String> r = new HashSet<>();
    private HashSet<String> s = new HashSet<>();
    private volatile List<Messenger> y = Collections.synchronizedList(new ArrayList());

    /* renamed from: b  reason: collision with root package name */
    final Messenger f5159b = new Messenger(new a());
    private final BroadcastReceiver z = new BroadcastReceiver() { // from class: com.teslamotors.plugins.ble.BLEService.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", PKIFailureInfo.systemUnavail);
                switch (intExtra) {
                    case 10:
                    case 13:
                        Object[] objArr = new Object[1];
                        objArr[0] = intExtra == 10 ? "" : "turning";
                        BLEService.this.e(String.format("Bluetooth adapter is %s OFF", objArr));
                        BLEService.this.b(false);
                        BLEService.this.x = false;
                        BLEService.this.i.e();
                        BLEService.this.i.b();
                        return;
                    case 11:
                        BLEService.this.e("Bluetooth adapter is turning ON");
                        return;
                    case 12:
                        BLEService.this.e("Bluetooth adapter is ON");
                        BLEService.this.i.c();
                        BLEService.this.i.d();
                        return;
                    default:
                        return;
                }
            } else if (action.equals("android.intent.action.SCREEN_ON")) {
                BLEService.this.e("Screen On received");
            } else if (!action.equals("android.intent.action.BATTERY_CHANGED")) {
            } else {
                BLEService.this.n = BLEService.a(intent);
                BLEService.this.c();
            }
        }
    };
    private Runnable A = new Runnable() { // from class: com.teslamotors.plugins.ble.BLEService.2
        @Override // java.lang.Runnable
        public void run() {
            BLEService bLEService = BLEService.this;
            Object[] objArr = new Object[1];
            objArr[0] = BLEService.this.u ? "saving" : "NOT saving";
            bLEService.e(String.format("Timeout fired - stopping scan and %s results", objArr));
            BLEService.this.b(BLEService.this.u);
        }
    };
    private Runnable B = new Runnable() { // from class: com.teslamotors.plugins.ble.BLEService.3
        @Override // java.lang.Runnable
        public void run() {
            BLEService.this.a(false);
        }
    };
    private final ScanCallback C = new ScanCallback() { // from class: com.teslamotors.plugins.ble.BLEService.4
        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i, ScanResult scanResult) {
            BluetoothDevice device = scanResult.getDevice();
            String address = device.getAddress();
            if (BLEService.this.s.contains(address)) {
                return;
            }
            if (scanResult.getScanRecord() == null || scanResult.getScanRecord().getServiceUuids() == null) {
                BLEService.this.s.add(address);
                return;
            }
            BLEService.this.s.add(address);
            for (ParcelUuid parcelUuid : scanResult.getScanRecord().getServiceUuids()) {
                if (parcelUuid.equals(com.teslamotors.plugins.ble.a.f5170c)) {
                    BLEService.this.e(String.format("Scan result service: %s %s %s", device.getName(), device.getAddress(), parcelUuid.toString()));
                    if (BLEService.this.u) {
                        if (BLEService.this.a(scanResult) && !BLEService.this.t.containsKey(address)) {
                            BLEService.this.r.add(address);
                            BLEService.this.t.put(address, new com.teslamotors.plugins.ble.a.c(BLEService.this.d(scanResult.getScanRecord().getDeviceName()), scanResult.getDevice(), null, BLEService.this.i, BLEService.this.g, BLEService.this.getApplicationContext()));
                            if (BLEService.this.r.size() >= com.teslamotors.plugins.ble.a.j.size()) {
                                BLEService.this.e("Found all peripherals - stopping scan");
                                BLEService.this.b(true);
                            }
                        }
                    }
                }
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i) {
            BLEService.this.e(String.format("Scan Failed: %s", g.a(i)));
        }
    };

    public void c() {
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.teslamotors.plugins.notifications.a.a(this);
        com.teslamotors.plugins.crashlytics.b.a(this);
        this.h = new b(Looper.getMainLooper());
        this.j = com.teslamotors.plugins.client.e.a(getApplicationContext()).y();
        this.k = com.teslamotors.plugins.client.e.a(getApplicationContext()).x();
        this.l = com.teslamotors.plugins.client.e.a(getApplicationContext()).d(this.j);
        e("onCreate");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        registerReceiver(this.z, intentFilter);
        c(getApplicationContext());
        h();
    }

    private Notification e() {
        return f().a();
    }

    private y.c f() {
        y.c a2 = a((Context) this, this.q == null ? "" : getString(this.q.a()));
        if (this.i.h() == com.teslamotors.plugins.ble.c.b.CONNECTED && this.q.m) {
            if (this.q.h) {
                a2.a(a.C0121a.ic_notification, getString(a.b.notification_unlock_button), a(this, com.teslamotors.plugins.ble.b.d.UnlockCar));
            } else {
                a2.a(a.C0121a.ic_notification, getString(a.b.notification_lock_button), a(this, com.teslamotors.plugins.ble.b.d.LockCar));
            }
            a2.a(a.C0121a.ic_notification, getString(a.b.notification_front_trunk_button), a(this, com.teslamotors.plugins.ble.b.d.OpenFrunk));
            a2.a(a.C0121a.ic_notification, getString(a.b.notification_rear_trunk_button), a(this, com.teslamotors.plugins.ble.b.d.OpenTrunk));
        }
        a2.a((CharSequence) this.l);
        return a2;
    }

    static y.c a(Context context, String str) {
        return new y.c(context, "phone_key_service_channel").a((CharSequence) context.getString(a.b.phone_key_notification_title)).b((CharSequence) str).c(Color.parseColor("#CC0000")).a("com.teslamotors.plugins.ble.BLE_SERVICE").a(true).a(a.C0121a.ic_notification).a(PendingIntent.getActivity(context, 0, com.teslamotors.plugins.client.e.a(context).B(), 134217728));
    }

    private void g() {
        if (!com.teslamotors.plugins.ble.a.f5168a || !b(this, this.j, this.k) || !this.p) {
            return;
        }
        ((NotificationManager) getSystemService("notification")).notify(333, e());
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String str;
        e("onStartCommand");
        if (intent != null) {
            str = intent.getAction();
            if (!"com.teslamotors.plugins.ble.action.REINITIALIZE_CONNECTION".equalsIgnoreCase(str) && !"com.teslamotors.plugins.ble.action.RESTART_BG_SCAN".equalsIgnoreCase(str)) {
                if ("com.teslamotors.ble.action.COMMAND".equalsIgnoreCase(str)) {
                    Message obtain = Message.obtain();
                    obtain.what = intent.getIntExtra("command_id", com.teslamotors.plugins.ble.b.d.GetStatus.a());
                    obtain.arg1 = -obtain.what;
                    this.i.a(obtain);
                } else {
                    this.j = intent.getStringExtra("VIN");
                    this.k = intent.getStringExtra("ACCOUNT_EMAIL");
                    this.l = intent.getStringExtra("VEHICLE_NAME");
                }
            }
        } else {
            str = null;
        }
        i();
        if (this.j != null && this.k != null && this.g != null && !this.i.a().equalsIgnoreCase(this.j)) {
            this.i = new f(this.j, this.k, getApplicationContext(), this.g, this);
        } else if (str != null) {
            if ("com.teslamotors.plugins.ble.action.REINITIALIZE_CONNECTION".equalsIgnoreCase(str)) {
                this.i.c();
                c(getApplicationContext());
            } else if ("com.teslamotors.plugins.ble.action.RESTART_BG_SCAN".equalsIgnoreCase(str)) {
                this.i.e();
                this.i.d();
            }
        }
        a(true);
        return super.onStartCommand(intent, i, i2);
    }

    /* loaded from: classes.dex */
    class a extends Handler {
        a() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z = true;
            if (message.arg1 > 0) {
                BLEService.this.e(String.format("Handling message: %s with arg %s", com.teslamotors.plugins.ble.b.d.b(message.what), Integer.valueOf(message.arg1)));
            } else {
                Log.i(BLEService.f5158c, String.format("Handling message: %s", com.teslamotors.plugins.ble.b.d.b(message.what)));
            }
            switch (com.teslamotors.plugins.ble.b.d.a(message.what)) {
                case ScanForPeripherals:
                    BLEService bLEService = BLEService.this;
                    String str = (String) message.getData().get(com.teslamotors.plugins.ble.b.d.ScanForPeripherals.b());
                    if (message.arg1 <= 0) {
                        z = false;
                    }
                    bLEService.a(str, z);
                    return;
                case GetStatus:
                    BLEService.this.a(true);
                    return;
                case SetVin:
                    ArrayList<String> stringArrayList = message.getData().getStringArrayList(com.teslamotors.plugins.ble.b.d.SetVin.b());
                    BLEService.this.b(stringArrayList.get(0), stringArrayList.get(1));
                    return;
                case SetAccountEmail:
                    BLEService.this.c(message.getData().getString(com.teslamotors.plugins.ble.b.d.SetAccountEmail.b()));
                    return;
                case PromoteServiceToForeground:
                    BLEService.this.h();
                    return;
                case Register:
                    BLEService.this.a(message.replyTo);
                    return;
                case Unregister:
                    BLEService.this.b(message.replyTo);
                    return;
                case SetEventSubscriptionsReady:
                    BLEService.this.a(Boolean.valueOf(message.getData().getBoolean(com.teslamotors.plugins.ble.b.d.SetEventSubscriptionsReady.b())));
                    return;
                case ClearPeripherals:
                    BLEService.this.b(false);
                    break;
                case AuthResponse:
                case SetConnectionBehaviorWhenUnauthorized:
                case GetPublicKeyInfo:
                case ResetCommandPeripheral:
                case StartMonitoringRSSI:
                case StopMonitoringRSSI:
                case UnlockCar:
                case LockCar:
                case OpenFrunk:
                case OpenTrunk:
                case OpenChargePort:
                case CloseChargePort:
                case AddToWhitelist:
                case GetWhiteslistUpdate:
                case RemoveFromWhitelist:
                    break;
                default:
                    super.handleMessage(message);
                    throw new RuntimeException(String.format("Unsupported message: %s", com.teslamotors.plugins.ble.b.d.a(message.what)));
            }
            BLEService.this.i.a(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(com.teslamotors.plugins.ble.b.d dVar, Parcelable parcelable) {
        for (int size = this.y.size() - 1; size >= 0; size--) {
            Message obtain = Message.obtain();
            Bundle bundle = new Bundle();
            if (parcelable != null) {
                bundle.putParcelable(dVar.b(), parcelable);
            }
            obtain.what = dVar.a();
            obtain.setData(bundle);
            try {
                this.y.get(size).send(obtain);
            } catch (RemoteException e) {
                Log.e(f5158c, "Failed to send message to client - removing", e);
                if (this.y.size() > size) {
                    try {
                        this.y.remove(size);
                    } catch (IndexOutOfBoundsException unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Boolean bool) {
        boolean z = !this.e && bool.booleanValue();
        this.e = bool.booleanValue();
        if (z) {
            while (this.f5160d.size() > 0) {
                a(com.teslamotors.plugins.ble.b.d.LogMessage, new com.teslamotors.plugins.ble.b.c(f5158c, this.f5160d.poll(), 4, null));
            }
            a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z) {
        String str2;
        this.v = a(str);
        this.r.clear();
        this.s.clear();
        this.u = z;
        this.t = new HashMap();
        i();
        if (this.f == null) {
            e("Unable to obtain a BluetoothManager.");
            str2 = "PHONE_KEY_BLUETOOTH_INACCESSIBLE";
        } else {
            str2 = null;
        }
        BluetoothAdapter adapter = this.f.getAdapter();
        if (adapter == null) {
            e("Unable to obtain a BluetoothAdapter.");
            str2 = "PHONE_KEY_BLUETOOTH_INACCESSIBLE";
        } else if (!adapter.isEnabled()) {
            str2 = "PHONE_KEY_BLUETOOTH_DISABLED";
        }
        if (adapter != null) {
            this.w = adapter.getBluetoothLeScanner();
            if (this.w == null) {
                e("Unable to obtain a Bluetooth LE Scanner.");
                str2 = "PHONE_KEY_BLUETOOTH_INACCESSIBLE";
            }
            if (this.x) {
                str2 = "PHONE_KEY_SCAN_IN_PROGRESS";
            }
            if (str2 == null) {
                e("Starting Scan");
                try {
                    this.x = true;
                    this.w.startScan((List<ScanFilter>) null, f5157a, this.C);
                    this.h.postDelayed(this.A, 20000L);
                } catch (Exception e) {
                    this.x = false;
                    a("Failed to start scan", e);
                    str2 = "PHONE_KEY_SCAN_FAILURE";
                }
            }
        }
        if (str2 != null) {
            b(str2);
        }
    }

    private String a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1);
            messageDigest.update(str.getBytes());
            return g.a(messageDigest.digest()).substring(0, 16);
        } catch (Exception e) {
            a("Failed to get VIN identifier", e);
            return null;
        }
    }

    public boolean a() {
        return this.x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        this.h.removeCallbacks(this.A);
        if (!this.x) {
            return;
        }
        this.x = false;
        if (this.w != null && this.g != null && this.g.isEnabled()) {
            e(String.format("Stopping pairing scan with %d peripherals", Integer.valueOf(this.r.size())));
            this.w.stopScan(this.C);
            if (z && this.r.size() > 0) {
                this.i.b();
                this.i.a(this.t);
                this.i.f();
            }
        }
        b((String) null);
    }

    private void b(String str) {
        a(com.teslamotors.plugins.ble.b.d.ScanForPeripheralsResult, new i(str == null, str, this.r.size(), a(this.t)));
    }

    public static com.teslamotors.plugins.ble.b.f a(Map<String, com.teslamotors.plugins.ble.a.c> map) {
        com.teslamotors.plugins.ble.b.f fVar = new com.teslamotors.plugins.ble.b.f();
        for (Map.Entry<String, com.teslamotors.plugins.ble.a.c> entry : map.entrySet()) {
            com.teslamotors.plugins.ble.a.c value = entry.getValue();
            fVar.f5214a.put(value.a(), new com.teslamotors.plugins.ble.b.e(value));
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Messenger messenger) {
        this.y.add(messenger);
        Message obtain = Message.obtain();
        obtain.what = com.teslamotors.plugins.ble.b.d.RegisterComplete.a();
        try {
            messenger.send(obtain);
            e("Registering " + messenger);
        } catch (RemoteException e) {
            Log.e(f5158c, "Failed to send message to client", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Messenger messenger) {
        e("Unregistering " + messenger);
        this.y.remove(messenger);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2) {
        String str3 = this.j != null ? "REDACTED" : "null";
        String str4 = str != null ? "REDACTED" : "null";
        this.l = str2;
        e(String.format("Setting VIN from %s to %s", str3, str4));
        if (str == null) {
            str = "";
        }
        i();
        if (!str.equalsIgnoreCase(this.j)) {
            this.i.b();
            this.m = 0L;
            this.j = str;
            this.i = new f(this.j, this.k, getApplicationContext(), this.g, this);
        }
        if (a((Context) this, this.j, this.k)) {
            if (b(this, this.j, this.k)) {
                h();
                return;
            } else {
                b();
                return;
            }
        }
        e("No VIN, non-applicable VIN, or no user - stopping BLE Service");
        b();
        stopSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        e(String.format("Changing email from %s to %s", this.k != null ? "REDACTED" : "null", str != null ? "REDACTED" : "null"));
        if (str == null) {
            str = "";
        }
        if (!str.equalsIgnoreCase(this.k)) {
            this.i.b();
            this.m = 0L;
            this.k = str;
            if (a((Context) this, this.j, this.k)) {
                this.i = new f(this.j, this.k, getApplicationContext(), this.g, this);
            } else {
                this.i = new c();
            }
        }
        if (!a((Context) this, this.j, this.k)) {
            e("No VIN, non-applicable VIN, or no user - stopping BLE Service");
            b();
            stopSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
        if (this.p) {
            e("Demoting service from foreground");
            this.p = false;
            stopForeground(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (com.teslamotors.plugins.ble.a.f5168a && b(this, this.j, this.k)) {
            e("Promoting service to foreground");
            startForeground(333, e());
            this.p = true;
            return;
        }
        e("NOT promoting service to foreground");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f5159b.getBinder();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.z);
        this.i.b();
        this.h.removeCallbacksAndMessages(null);
        a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String str = BLEService.f5158c;
            Log.i(str, "Handling msg:" + message);
        }
    }

    private void i() {
        if (this.f == null) {
            this.f = (BluetoothManager) getSystemService("bluetooth");
            if (this.f == null) {
                e("Unable to initialize BluetoothManager.");
            }
        }
        this.g = this.f.getAdapter();
        if (this.g == null) {
            e("Unable to obtain a BluetoothAdapter.");
        } else if (!this.g.isEnabled()) {
        } else {
            this.o = this.g.isOffloadedFilteringSupported();
            com.teslamotors.plugins.client.e.a(getApplicationContext()).b(4, this.o ? "filtering" : "unsupported");
        }
    }

    private void a(String str, String str2, int i, Exception exc) {
        if (!this.e || this.y.size() == 0) {
            if (this.f5160d.size() == 100) {
                this.f5160d.poll();
            }
            this.f5160d.offer(String.format("PRE-LAUNCH [%s]: %s", com.teslamotors.plugins.ble.a.i.format(new Date()), str2));
            return;
        }
        a(com.teslamotors.plugins.ble.b.d.LogMessage, new com.teslamotors.plugins.ble.b.c(str, str2, i, exc));
    }

    public synchronized void a(boolean z) {
        long currentTimeMillis = System.currentTimeMillis() - this.m;
        if (!z && currentTimeMillis < 500) {
            this.h.removeCallbacks(this.B);
            this.h.postDelayed(this.B, 500 - currentTimeMillis);
            return;
        }
        this.m = System.currentTimeMillis();
        this.q = new h();
        this.q.t = this.g != null && this.g.isEnabled();
        this.q.x = this.o;
        this.i.a(this.q);
        g();
        a(com.teslamotors.plugins.ble.b.d.StatusMessage, this.q);
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        return (str == null || str.length() <= 0) ? "X" : str.substring(str.length() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(ScanResult scanResult) {
        if (scanResult.getScanRecord() == null || scanResult.getScanRecord().getDeviceName() == null) {
            return false;
        }
        String deviceName = scanResult.getScanRecord().getDeviceName();
        return deviceName.startsWith("S") && this.v != null && deviceName.contains(this.v) && com.teslamotors.plugins.ble.a.j.contains(d(deviceName));
    }

    public static void a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            ((AlarmManager) context.getSystemService("alarm")).setWindow(0, System.currentTimeMillis() + 1200000, 600000L, e(context));
        }
    }

    public static void b(Context context) {
        AlarmManager alarmManager;
        if (Build.VERSION.SDK_INT < 24 || (alarmManager = (AlarmManager) context.getSystemService("alarm")) == null) {
            return;
        }
        alarmManager.cancel(e(context));
    }

    private static PendingIntent e(Context context) {
        Intent intent = new Intent(context, BLEService.class);
        intent.setAction("com.teslamotors.plugins.ble.action.RESTART_BG_SCAN");
        return PendingIntent.getService(context, 0, intent, 0);
    }

    public static void c(Context context) {
        ((AlarmManager) context.getSystemService("alarm")).setWindow(0, System.currentTimeMillis() + 14400000, 14400000L, f(context));
    }

    public static void d(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (alarmManager != null) {
            alarmManager.cancel(f(context));
        }
    }

    private static PendingIntent f(Context context) {
        Intent intent = new Intent(context, BLEService.class);
        intent.setAction("com.teslamotors.plugins.ble.action.REINITIALIZE_CONNECTION");
        return PendingIntent.getService(context, 0, intent, 0);
    }

    private static PendingIntent a(Context context, com.teslamotors.plugins.ble.b.d dVar) {
        Intent intent = new Intent(context, BLEService.class);
        intent.setAction("com.teslamotors.ble.action.COMMAND");
        intent.putExtra("command_id", dVar.a());
        return PendingIntent.getService(context, dVar.a(), intent, 0);
    }

    public static boolean a(Context context, String str, String str2) {
        return str2 != null && str != null && str.length() > 4 && (str.substring(3, 4).equalsIgnoreCase("3") || com.teslamotors.plugins.client.e.a(context).c(str, str2).size() > 0);
    }

    public static boolean b(Context context, String str, String str2) {
        return a(context, str, str2) && com.teslamotors.plugins.client.e.a(context).c(str, str2).size() > 0;
    }

    public static boolean a(Intent intent) {
        int intExtra = intent.getIntExtra("plugged", -1);
        return intExtra == 1 || intExtra == 2 || intExtra == 4;
    }

    public void a(String str, String str2, Exception exc) {
        a(str, String.format("[TMBLE Error] %s", str2), 6, exc);
    }

    public void a(String str, String str2) {
        a(str, String.format("[TMBLE] %s", str2), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        a(f5158c, str);
    }

    private void a(String str, Exception exc) {
        a(f5158c, str, exc);
    }
}
