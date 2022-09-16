package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.ParcelUuid;
import com.google.android.apps.gmm.location.rawlocationevents.BleBeaconEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: ahsb  reason: default package */
/* loaded from: classes2.dex */
public final class ahsb extends ScanCallback implements ahrz {
    private static final UUID a;
    private static final ParcelUuid b;
    private final Context c;
    @dzsi
    private ckcw d;
    private final axru e;
    private final BluetoothAdapter f;
    private final btrm g;
    private boolean h;
    private boolean j;
    @dzsi
    private Set<UUID> k;
    private final ScanSettings l = new ScanSettings.Builder().setScanMode(2).build();
    private final ScanFilter m = new ScanFilter.Builder().setServiceUuid(b).build();
    @dzsi
    private BluetoothLeScanner n = null;
    private final BroadcastReceiver o = new ahsa(this);
    private boolean i = false;

    static {
        UUID fromString = UUID.fromString("0000feaa-0000-1000-8000-00805f9b34fb");
        a = fromString;
        b = new ParcelUuid(fromString);
    }

    public ahsb(Context context, axru axruVar, btrm btrmVar, BluetoothAdapter bluetoothAdapter) {
        this.c = context;
        this.e = axruVar;
        this.g = btrmVar;
        this.f = bluetoothAdapter;
    }

    @Override // defpackage.ahrz
    public final synchronized void a(@dzsi ckcw ckcwVar) {
        this.d = ckcwVar;
        this.h = true;
        ahou.a(ckcwVar, 15, true);
        this.c.registerReceiver(this.o, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        btrm btrmVar = this.g;
        dceq a2 = dcet.a();
        a2.b(ahta.class, new ahsc(ahta.class, this));
        btrmVar.g(this, a2.a());
        d();
    }

    @Override // defpackage.ahrz
    public final synchronized void b() {
        this.h = false;
        this.g.a(this);
        this.c.unregisterReceiver(this.o);
        d();
        if (this.j) {
            ahou.a(this.d, 9, false);
            ahou.b(this.d, 21);
            this.d = null;
        }
    }

    public final synchronized void c(ahta ahtaVar) {
        this.k = ahtaVar.a;
        d();
    }

    public final void d() {
        Set<UUID> set;
        boolean z = this.h && (set = this.k) != null && !set.isEmpty();
        this.j |= z;
        if (!this.e.a("android.permission.BLUETOOTH") || !this.e.a("android.permission.BLUETOOTH_ADMIN")) {
            ahou.a(this.d, 9, false);
            ahou.b(this.d, 17);
            this.d = null;
            return;
        }
        if (this.n == null) {
            try {
                if (!this.f.isEnabled()) {
                    return;
                }
                this.n = this.f.getBluetoothLeScanner();
            } catch (SecurityException unused) {
                ahou.a(this.d, 9, false);
                ahou.b(this.d, 18);
                this.d = null;
                return;
            }
        }
        BluetoothLeScanner bluetoothLeScanner = this.n;
        if (bluetoothLeScanner != null) {
            try {
                if (!z) {
                    if (!this.i) {
                        return;
                    }
                    bluetoothLeScanner.stopScan(this);
                    this.n = null;
                    this.i = false;
                    return;
                } else if (this.i) {
                    return;
                } else {
                    bluetoothLeScanner.startScan(new ArrayList(Arrays.asList(this.m)), this.l, this);
                    this.i = true;
                    ahou.a(this.d, 9, true);
                    this.d = null;
                    return;
                }
            } catch (IllegalStateException unused2) {
                this.i = false;
                this.n = null;
                ahou.a(this.d, 9, false);
                ahou.b(this.d, 20);
                this.d = null;
                return;
            }
        }
        ahou.a(this.d, 9, false);
        ahou.b(this.d, 19);
        this.d = null;
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanFailed(int i) {
    }

    @Override // android.bluetooth.le.ScanCallback
    public final synchronized void onScanResult(int i, ScanResult scanResult) {
        if (scanResult == null) {
            return;
        }
        ScanRecord scanRecord = scanResult.getScanRecord();
        if (scanRecord == null) {
            return;
        }
        byte[] serviceData = scanRecord.getServiceData(b);
        if (serviceData != null && serviceData.length >= 18) {
            if (serviceData[0] == 0) {
                long j = 0;
                long j2 = 0;
                for (int i2 = 0; i2 < 8; i2++) {
                    j2 = (j2 << 8) | (serviceData[i2 + 2] & 255);
                    j = (j << 8) | (serviceData[i2 + 10] & 255);
                }
                Set<UUID> set = this.k;
                if (set != null && set.contains(new UUID(j2, j))) {
                    this.g.b(new BleBeaconEvent(j2, j, scanResult.getRssi(), serviceData[1], scanResult.getTimestampNanos()));
                }
            }
        }
    }
}
