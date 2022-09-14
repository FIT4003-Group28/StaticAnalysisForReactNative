package com.teslamotors.plugins.ble;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.support.v4.i.i;
import com.teslamotors.a.a;
import com.teslamotors.plugins.ble.b.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: BLEVehicleController.java */
/* loaded from: classes.dex */
public class f implements b {

    /* renamed from: a  reason: collision with root package name */
    private final BLEService f5256a;

    /* renamed from: d  reason: collision with root package name */
    private final String f5259d;
    private final com.teslamotors.plugins.ble.c.c e;
    private final Context j;
    private final BluetoothAdapter k;
    private final String l;
    private com.teslamotors.plugins.ble.a.d m;
    private volatile Handler o;
    private boolean p;
    private BluetoothLeScanner q;
    private boolean r;
    private boolean t;
    private ConcurrentHashMap<String, com.teslamotors.plugins.ble.a.c> f = new ConcurrentHashMap<>();
    private Set<com.teslamotors.plugins.ble.a.c> g = Collections.newSetFromMap(new ConcurrentHashMap());
    private List<String> n = new ArrayList();
    private final ScanCallback u = new ScanCallback() { // from class: com.teslamotors.plugins.ble.f.2
        private void a(ScanResult scanResult) {
            BluetoothDevice device;
            com.teslamotors.plugins.ble.a.c cVar;
            if ((Build.VERSION.SDK_INT >= 26 && !scanResult.isConnectable()) || scanResult == null || (device = scanResult.getDevice()) == null || (cVar = (com.teslamotors.plugins.ble.a.c) f.this.f.get(device.getAddress())) == null || cVar.b()) {
                return;
            }
            if (cVar.g() && scanResult.getRssi() > -95) {
                f.this.a(String.format("BG Scan; making direct connection to %s with RSSI %s", cVar, Integer.valueOf(scanResult.getRssi())));
                f.this.g(cVar);
                return;
            }
            f.this.a(String.format("BG Scan; NOT re-initializing connection to %s - last connection occurred %s seconds ago / RSSI: %s", cVar, Long.valueOf(cVar.h()), Integer.valueOf(scanResult.getRssi())));
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i, ScanResult scanResult) {
            a(scanResult);
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i) {
            f.this.a(String.format("BG Scan failed with error %s", g.a(i)));
        }
    };
    private byte[] s = null;
    private com.teslamotors.plugins.ble.a.c h = null;
    private com.teslamotors.plugins.ble.a.c i = null;

    /* renamed from: b  reason: collision with root package name */
    private ConcurrentHashMap<String, Integer> f5257b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private ConcurrentHashMap<String, Integer> f5258c = new ConcurrentHashMap<>();

    public void n() {
    }

    public f(String str, String str2, Context context, BluetoothAdapter bluetoothAdapter, BLEService bLEService) {
        this.f5259d = str;
        this.l = str2;
        this.k = bluetoothAdapter;
        this.j = context;
        this.e = new com.teslamotors.plugins.ble.c.c(this, this.f5259d, this.l, context);
        this.e.a();
        this.m = new com.teslamotors.plugins.ble.a.d();
        this.f5256a = bLEService;
        this.o = new Handler(Looper.getMainLooper());
        f();
        d();
    }

    @Override // com.teslamotors.plugins.ble.b
    public String a() {
        return this.f5259d;
    }

    @Override // com.teslamotors.plugins.ble.b
    public void a(h hVar) {
        this.m.a(hVar);
        hVar.l = this.e.g();
        hVar.m = this.e.h();
        hVar.n = this.e.i();
        hVar.o = this.e.j();
        hVar.p = this.e.f();
        hVar.q = this.e.k();
        hVar.r = this.e.l();
        hVar.u = this.h != null && this.h.f();
        hVar.v = this.h == null ? "" : this.h.d();
        hVar.s = this.m.a();
        hVar.k = this.f5259d;
        com.teslamotors.plugins.ble.b.f a2 = BLEService.a(this.f);
        if (a2.f5214a.isEmpty()) {
            for (i<String, String> iVar : y()) {
                a2.f5214a.put(iVar.f469a, new com.teslamotors.plugins.ble.b.e("?", false, iVar.f470b, -1000));
            }
        }
        hVar.w = a2;
        hVar.y = a(this.e.m());
    }

    @Override // com.teslamotors.plugins.ble.b
    public void a(boolean z) {
        this.f5256a.a(z);
    }

    public boolean i() {
        return this.h != null;
    }

    public boolean j() {
        for (Map.Entry<String, com.teslamotors.plugins.ble.a.c> entry : this.f.entrySet()) {
            if (entry.getValue().b() && entry.getValue().f()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.teslamotors.plugins.ble.b
    public com.teslamotors.plugins.ble.c.b h() {
        if (this.h == null) {
            return com.teslamotors.plugins.ble.c.b.DISCONNECTED;
        }
        return this.h.b() ? com.teslamotors.plugins.ble.c.b.CONNECTED : com.teslamotors.plugins.ble.c.b.DISCONNECTED;
    }

    public void k() {
        if (this.h != null) {
            a("Command peripheral already exists - not connecting new command peripheral");
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, com.teslamotors.plugins.ble.a.c> entry : this.f.entrySet()) {
            com.teslamotors.plugins.ble.a.c value = entry.getValue();
            if (value.b() && value.f()) {
                arrayList.add(value);
            }
        }
        int size = arrayList.size();
        if (size > 0) {
            com.teslamotors.plugins.ble.a.c cVar = (com.teslamotors.plugins.ble.a.c) (size == 1 ? arrayList.get(0) : arrayList.get(new Random().nextInt(size)));
            a(String.format("connectCommandPeripheral - chose %s from %s", cVar, arrayList));
            if (!cVar.i()) {
                return;
            }
            this.i = cVar;
        }
    }

    public void l() {
        if (this.h != null) {
            f(this.h);
        }
    }

    @Override // com.teslamotors.plugins.ble.b
    public void c() {
        if (this.f.size() == 0) {
            f();
        } else {
            ArrayList<com.teslamotors.plugins.ble.a.c> arrayList = new ArrayList();
            for (com.teslamotors.plugins.ble.a.c cVar : u()) {
                if (!cVar.b()) {
                    cVar.k();
                    arrayList.add(new com.teslamotors.plugins.ble.a.c(cVar.a(), this.k.getRemoteDevice(cVar.d()), null, this, this.k, this.j));
                }
            }
            for (com.teslamotors.plugins.ble.a.c cVar2 : arrayList) {
                this.f.put(cVar2.d(), cVar2);
                h(cVar2);
            }
        }
        a(true);
    }

    public void g(com.teslamotors.plugins.ble.a.c cVar) {
        if (!cVar.b()) {
            f(cVar);
        }
    }

    @Override // com.teslamotors.plugins.ble.b
    public void f(com.teslamotors.plugins.ble.a.c cVar) {
        if (cVar.d() != null) {
            a("disconnecting/reconnecting to " + cVar);
            cVar.k();
            com.teslamotors.plugins.ble.a.c cVar2 = new com.teslamotors.plugins.ble.a.c(cVar.a(), this.k.getRemoteDevice(cVar.d()), null, this, this.k, this.j);
            this.f.put(cVar2.d(), cVar2);
            h(cVar2);
        }
    }

    private List<com.teslamotors.plugins.ble.a.c> u() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, com.teslamotors.plugins.ble.a.c> entry : this.f.entrySet()) {
            if (e(entry.getValue())) {
                arrayList.add(0, entry.getValue());
            } else {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    private void v() {
        this.h = null;
        for (i<String, String> iVar : y()) {
            String str = iVar.f470b;
            this.f.put(str, new com.teslamotors.plugins.ble.a.c(iVar.f469a, this.k.getRemoteDevice(str), null, this, this.k, this.j));
        }
        this.n = a(this.f.keySet());
    }

    @Override // com.teslamotors.plugins.ble.b
    public void f() {
        v();
        for (com.teslamotors.plugins.ble.a.c cVar : u()) {
            h(cVar);
        }
    }

    public void h(com.teslamotors.plugins.ble.a.c cVar) {
        if (!this.k.isEnabled()) {
            a("Cannot create connection - adapter is not enabled");
        } else if (cVar.d() == null) {
            a("Cannot create connection - mac is null");
        } else {
            cVar.j();
        }
    }

    private void w() {
        Iterator<Map.Entry<String, com.teslamotors.plugins.ble.a.c>> it = this.f.entrySet().iterator();
        while (it.hasNext()) {
            it.remove();
            it.next().getValue().k();
        }
        this.n = Collections.EMPTY_LIST;
        a(true);
    }

    @Override // com.teslamotors.plugins.ble.b
    public void b() {
        w();
    }

    public void m() {
        this.h = null;
        a(Collections.EMPTY_MAP);
        w();
        BLEService bLEService = this.f5256a;
        BLEService.d(this.j);
        this.e.c();
        this.f5256a.a(com.teslamotors.plugins.ble.b.d.ClearPeripheralsResult, (Parcelable) null);
        this.f5256a.b();
        a(true);
    }

    public void a(int i, com.teslamotors.plugins.ble.b.b bVar, String str, com.teslamotors.plugins.ble.a.c cVar) {
        String a2 = a(i);
        if (this.f5257b.containsKey(a2)) {
            Integer num = this.f5257b.get(a2);
            this.f5257b.remove(a2);
            a(num);
            this.f5256a.a(com.teslamotors.plugins.ble.b.d.CommandResult, new com.teslamotors.plugins.ble.b.a(bVar, str, num.intValue()));
        }
        if (bVar.equals(com.teslamotors.plugins.ble.b.b.OK)) {
            cVar.b(true);
            this.g.remove(cVar);
        }
    }

    private void a(byte[] bArr, String str) {
        a(bArr, this.h, str);
    }

    private void a(byte[] bArr, com.teslamotors.plugins.ble.a.c cVar, String str) {
        if (bArr == null) {
            a(String.format("WARNING: Null bytes to send for type %s", str));
            return;
        }
        String a2 = g.a(bArr);
        if (cVar != null && cVar.f()) {
            cVar.a(bArr, str);
        } else {
            a(false, "PHONE_KEY_NOT_CONNECTED", a2, cVar);
        }
    }

    @Override // com.teslamotors.plugins.ble.b
    public void a(Message message) {
        boolean z = false;
        switch (com.teslamotors.plugins.ble.b.d.a(message.what)) {
            case ClearPeripherals:
                m();
                return;
            case GetPublicKeyInfo:
                o();
                return;
            case ResetCommandPeripheral:
                l();
                return;
            case StartMonitoringRSSI:
                this.r = true;
                x();
                return;
            case StopMonitoringRSSI:
                this.r = false;
                r();
                return;
            case AuthResponse:
                a(message.arg1, message.arg2);
                return;
            case UnlockCar:
                a(message.arg1);
                return;
            case LockCar:
                b(message.arg1);
                return;
            case OpenFrunk:
                c(message.arg1);
                return;
            case OpenTrunk:
                d(message.arg1);
                return;
            case OpenChargePort:
                e(message.arg1);
                return;
            case CloseChargePort:
                f(message.arg1);
                return;
            case AddToWhitelist:
                h(message.arg1);
                return;
            case GetWhiteslistUpdate:
                i(message.arg1);
                return;
            case RemoveFromWhitelist:
                g(message.arg1);
                return;
            case SetConnectionBehaviorWhenUnauthorized:
                if (message.arg1 > 0) {
                    z = true;
                }
                this.t = z;
                return;
            default:
                return;
        }
    }

    public void a(a.aj ajVar, String str) {
        a(a(ajVar), str);
    }

    private void g(int i) {
        byte[] a2 = a(this.e.e());
        if (a2 == null) {
            this.f5256a.a(com.teslamotors.plugins.ble.b.d.CommandResult, new com.teslamotors.plugins.ble.b.a(com.teslamotors.plugins.ble.b.b.ERROR, "PHONE_KEY_COULD_NOT_CREATE_MESSAGE", i));
            return;
        }
        this.f5258c.put(g.a(a2), Integer.valueOf(i));
        a(a2, com.teslamotors.plugins.ble.a.b.REMOVE_FROM_WHITELIST.name());
    }

    private void h(int i) {
        byte[] a2 = a(this.e.d());
        if (a2 == null) {
            this.f5256a.a(com.teslamotors.plugins.ble.b.d.CommandResult, new com.teslamotors.plugins.ble.b.a(com.teslamotors.plugins.ble.b.b.ERROR, "PHONE_KEY_COULD_NOT_CREATE_MESSAGE", i));
            return;
        }
        this.f5258c.put(g.a(a2), Integer.valueOf(i));
        a(a2, com.teslamotors.plugins.ble.a.b.ADD_TO_WHITELIST.name());
    }

    private void i(int i) {
        byte[] a2 = a(this.e.a(a.s.INFORMATION_REQUEST_TYPE_GET_WHITELIST_INFO));
        this.f5258c.put(g.a(a2), Integer.valueOf(i));
        a(a2, com.teslamotors.plugins.ble.a.b.GET_WHITELIST_INFO.name());
    }

    public void o() {
        this.f5256a.a(com.teslamotors.plugins.ble.b.d.PublicKeyInfoResult, new com.teslamotors.plugins.ble.b.g(this.e.n(), this.e.o()));
    }

    private void a(int i, int i2) {
        a(a.EnumC0091a.b(i2), i, com.teslamotors.plugins.ble.a.b.AUTH_RESPONSE_NULL.name());
    }

    public void a(int i) {
        a(a.aa.RKE_ACTION_UNLOCK, i, com.teslamotors.plugins.ble.a.b.RKE_ACTION_UNLOCK.name());
    }

    public void b(int i) {
        a(a.aa.RKE_ACTION_LOCK, i, com.teslamotors.plugins.ble.a.b.RKE_ACTION_LOCK.name());
    }

    public void c(int i) {
        a(a.aa.RKE_ACTION_OPEN_FRUNK, i, com.teslamotors.plugins.ble.a.b.RKE_ACTION_OPEN_FRUNK.name());
    }

    public void d(int i) {
        a(a.aa.RKE_ACTION_OPEN_TRUNK, i, com.teslamotors.plugins.ble.a.b.RKE_ACTION_OPEN_TRUNK.name());
    }

    public void e(int i) {
        a(a.aa.RKE_ACTION_OPEN_CHARGE_PORT, i, com.teslamotors.plugins.ble.a.b.RKE_ACTION_OPEN_CHARGE_PORT.name());
    }

    public void f(int i) {
        a(a.aa.RKE_ACTION_CLOSE_CHARGE_PORT, i, com.teslamotors.plugins.ble.a.b.RKE_ACTION_CLOSE_CHARGE_PORT.name());
    }

    private void a(a.EnumC0091a enumC0091a, int i, String str) {
        a(this.e.a(enumC0091a), i, str);
    }

    private void a(a.aa aaVar, int i, String str) {
        a(this.e.a(aaVar), i, str);
    }

    private void a(com.teslamotors.plugins.ble.a.a aVar, int i, String str) {
        byte[] a2 = aVar != null ? a(aVar.b()) : null;
        if (a2 == null) {
            this.f5256a.a(com.teslamotors.plugins.ble.b.d.CommandResult, new com.teslamotors.plugins.ble.b.a(com.teslamotors.plugins.ble.b.b.ERROR, "PHONE_KEY_COULD_NOT_CREATE_MESSAGE", i));
            return;
        }
        this.f5257b.put(a(aVar.a()), Integer.valueOf(i));
        this.f5257b.put(g.a(a2), Integer.valueOf(i));
        a(a2, str);
    }

    public static byte[] a(a.aj ajVar) {
        if (ajVar == null) {
            return null;
        }
        byte[] byteArray = ajVar.toByteArray();
        byte[] bArr = new byte[byteArray.length + 2];
        for (int i = 2; i < bArr.length; i++) {
            bArr[i] = byteArray[i - 2];
        }
        bArr[0] = (byte) ((byteArray.length >> 8) & 255);
        bArr[1] = (byte) (byteArray.length & 255);
        return bArr;
    }

    @Override // com.teslamotors.plugins.ble.b
    public void a(boolean z, String str, String str2, com.teslamotors.plugins.ble.a.c cVar) {
        if (!z && str == "PHONE_KEY_TRANSMISSION_FAILURE") {
            f(cVar);
            return;
        }
        n();
        if (!z && this.f5257b.containsKey(str2)) {
            Integer remove = this.f5257b.remove(str2);
            a(remove);
            this.f5256a.a(com.teslamotors.plugins.ble.b.d.CommandResult, new com.teslamotors.plugins.ble.b.a(com.teslamotors.plugins.ble.b.b.ERROR, str, remove.intValue()));
        } else if (!this.f5258c.containsKey(str2)) {
        } else {
            this.f5256a.a(com.teslamotors.plugins.ble.b.d.CommandResult, new com.teslamotors.plugins.ble.b.a(z ? com.teslamotors.plugins.ble.b.b.OK : com.teslamotors.plugins.ble.b.b.ERROR, str, this.f5258c.remove(str2).intValue()));
        }
    }

    public boolean p() {
        for (Map.Entry<String, com.teslamotors.plugins.ble.a.c> entry : this.f.entrySet()) {
            if (entry.getValue().b()) {
                return true;
            }
        }
        return false;
    }

    public boolean q() {
        for (Map.Entry<String, com.teslamotors.plugins.ble.a.c> entry : this.f.entrySet()) {
            if (!entry.getValue().b()) {
                return false;
            }
        }
        return this.f.size() > 0;
    }

    @Override // com.teslamotors.plugins.ble.b
    public void d() {
        if (this.n.isEmpty()) {
            return;
        }
        this.o.postDelayed(new Runnable() { // from class: com.teslamotors.plugins.ble.f.1
            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                if (f.this.f5256a.a() || f.this.p) {
                    return;
                }
                BLEService unused = f.this.f5256a;
                if (!BLEService.a(f.this.j, f.this.f5259d, f.this.l)) {
                    return;
                }
                f.this.q = f.this.k == null ? null : f.this.k.getBluetoothLeScanner();
                if (f.this.q == null || f.this.k == null) {
                    f.this.a("Failed to BG Scan - Unable to obtain a Bluetooth LE Scanner/Adapter/Manager");
                } else if (f.this.p()) {
                    f.this.a("Skipping BG Scan - already has connected peripherals");
                } else if (!f.this.i() || f.this.h() != com.teslamotors.plugins.ble.c.b.CONNECTED) {
                    if (f.this.k.isEnabled()) {
                        if (f.this.n.isEmpty()) {
                            return;
                        }
                        try {
                            z = f.this.k.isOffloadedFilteringSupported();
                        } catch (Exception unused2) {
                            z = false;
                        }
                        if (!z) {
                            f.this.a("Skipping BG Scan - offloaded filtering NOT supported");
                            return;
                        }
                        ScanSettings build = new ScanSettings.Builder().setScanMode(0).build();
                        ArrayList arrayList = new ArrayList();
                        for (String str : f.this.n) {
                            arrayList.add(new ScanFilter.Builder().setDeviceAddress(str).build());
                        }
                        f.this.a(String.format("Starting BG Scan for %s address(es)", Integer.valueOf(arrayList.size())));
                        try {
                            f.this.q.startScan(arrayList, build, f.this.u);
                            f.this.p = true;
                        } catch (Exception e) {
                            f.this.a("BG Scan failed", e);
                        }
                        BLEService unused3 = f.this.f5256a;
                        BLEService.a(f.this.j);
                        return;
                    }
                    f.this.a("Skipping BG Scan - adapter not enabled");
                } else {
                    f.this.a("Skipping BG Scan - already has command peripheral");
                }
            }
        }, 2000L);
    }

    private List<String> a(Collection<String> collection) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT > 26 || collection == null || collection.isEmpty()) {
            return arrayList;
        }
        for (String str : collection) {
            if ((g.a(str.split(":")[0])[0] & 192) != 128) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @Override // com.teslamotors.plugins.ble.b
    public void e() {
        if (!this.p) {
            return;
        }
        BLEService bLEService = this.f5256a;
        BLEService.b(this.j);
        this.p = false;
        if (this.q == null || !this.k.isEnabled()) {
            return;
        }
        a("Stopping BG Scan");
        this.q.stopScan(this.u);
    }

    @Override // com.teslamotors.plugins.ble.b
    public void a(Map<String, com.teslamotors.plugins.ble.a.c> map) {
        int i;
        HashSet hashSet = new HashSet();
        this.n = a(this.f.keySet());
        Iterator<Map.Entry<String, com.teslamotors.plugins.ble.a.c>> it = map.entrySet().iterator();
        while (true) {
            i = 2;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, com.teslamotors.plugins.ble.a.c> next = it.next();
            hashSet.add(String.format("%s%s%s", next.getValue().a(), "-", next.getValue().d()));
        }
        a(String.format("Setting stored device addresses to %s", hashSet));
        com.teslamotors.plugins.client.e.a(this.j).a(this.f5259d, this.l, hashSet);
        if (hashSet.isEmpty()) {
            BLEService bLEService = this.f5256a;
            BLEService.d(this.j);
        } else {
            BLEService bLEService2 = this.f5256a;
            BLEService.c(this.j);
        }
        if (!hashSet.isEmpty()) {
            i = 1;
        }
        this.j.getPackageManager().setComponentEnabledSetting(new ComponentName(this.j.getApplicationContext(), BLEBootReceiver.class), i, 1);
    }

    private static String a(long j) {
        return String.format("IV-%s", Long.valueOf(j));
    }

    private void a(Integer num) {
        Iterator<Map.Entry<String, Integer>> it = this.f5257b.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().equals(num)) {
                it.remove();
                return;
            }
        }
    }

    private void x() {
        for (Map.Entry<String, com.teslamotors.plugins.ble.a.c> entry : this.f.entrySet()) {
            entry.getValue().c(true);
        }
    }

    public void r() {
        for (Map.Entry<String, com.teslamotors.plugins.ble.a.c> entry : this.f.entrySet()) {
            entry.getValue().c(false);
        }
    }

    public void s() {
        if (this.r) {
            x();
        } else {
            r();
        }
    }

    private Set<i<String, String>> y() {
        HashSet hashSet = new HashSet();
        for (String str : com.teslamotors.plugins.client.e.a(this.j).c(this.f5259d, this.l)) {
            String[] split = str.split("-");
            if (split.length == 2) {
                hashSet.add(new i(split[0], split[1]));
            }
        }
        return hashSet;
    }

    private HashMap<String, Boolean> a(a.f fVar) {
        HashMap<String, Boolean> hashMap = new HashMap<>();
        if (fVar != null) {
            hashMap.put("open_unlock_charge_port", Boolean.valueOf(fVar.c()));
            hashMap.put("close_charge_port", Boolean.valueOf(fVar.d()));
        }
        return hashMap;
    }

    @Override // com.teslamotors.plugins.ble.b
    public void a(String str) {
        this.f5256a.a("BLEVehicleController", str);
    }

    @Override // com.teslamotors.plugins.ble.b
    public void a(String str, Exception exc) {
        this.f5256a.a("BLEVehicleController", str, exc);
    }

    @Override // com.teslamotors.plugins.ble.b
    public void a(com.teslamotors.plugins.ble.a.c cVar) {
        this.e.a(cVar);
    }

    @Override // com.teslamotors.plugins.ble.b
    public void a(byte[] bArr) {
        this.s = bArr;
    }

    @Override // com.teslamotors.plugins.ble.b
    public boolean g() {
        return this.s != null;
    }

    @Override // com.teslamotors.plugins.ble.b
    public void a(a.o oVar, com.teslamotors.plugins.ble.a.c cVar) {
        boolean z;
        this.m.a(System.currentTimeMillis() / 1000.0d);
        this.e.a(oVar, cVar);
        a.aq d2 = oVar.d();
        if (d2 != d2.F()) {
            this.m.a(d2);
            a(String.format("Got vehicle status: %s - %s", this.m, this.m.b()));
            z = true;
        } else {
            z = false;
        }
        a.b f = oVar.f();
        if (f != f.F() && this.e.h()) {
            com.teslamotors.plugins.ble.a.a a2 = this.e.a(f.h());
            if (a2 == null) {
                a(String.format("Cannot reply to auth request with level %s", f.h().name()));
            } else {
                byte[] a3 = a(a2.b());
                a(String.format("Received auth request with level %s", f.h().name()));
                a(a3, f.h().name());
                z = true;
            }
        }
        a(z);
    }

    @Override // com.teslamotors.plugins.ble.b
    public synchronized boolean e(com.teslamotors.plugins.ble.a.c cVar) {
        boolean z;
        z = this.h != null && this.h.d().equals(cVar.d());
        if (z && !this.h.equals(cVar)) {
            a(String.format("Duplicate command peripheral references! %s", this), new Exception("Duplicate command peripheral references!"));
        }
        return z;
    }

    @Override // com.teslamotors.plugins.ble.b
    public synchronized boolean b(com.teslamotors.plugins.ble.a.c cVar) {
        boolean z;
        if (this.i != null) {
            if (this.i.d().equalsIgnoreCase(cVar.d())) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    @Override // com.teslamotors.plugins.ble.b
    public synchronized void d(com.teslamotors.plugins.ble.a.c cVar) {
        if (this.i != null && this.i.d().equalsIgnoreCase(cVar.d())) {
            this.h = cVar;
            this.i = null;
            this.e.b();
        }
    }

    @Override // com.teslamotors.plugins.ble.b
    public void c(com.teslamotors.plugins.ble.a.c cVar) {
        boolean z;
        if (e(cVar)) {
            z = true;
            this.h = null;
        } else {
            z = false;
        }
        this.g.remove(cVar);
        this.e.a(cVar, z);
    }

    @Override // com.teslamotors.plugins.ble.b
    public void a(com.teslamotors.plugins.ble.a.c cVar, int i) {
        s();
        a(true);
        if (!p()) {
            d();
        } else if (!q()) {
        } else {
            e();
        }
    }

    public boolean t() {
        return this.t;
    }
}
