package defpackage;

import android.app.Application;
import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: croo  reason: default package */
/* loaded from: classes5.dex */
public final class croo implements crgy {
    public static final /* synthetic */ int c = 0;
    private static final int[] d = {2, 1};
    @dzsi
    public BluetoothA2dp a;
    public int b;
    private final Application e;
    private final btrm f;
    @dzsi
    private final BluetoothAdapter g;
    private boolean h;
    private final BroadcastReceiver i;
    private final BluetoothProfile.ServiceListener j;
    private final cron k;

    public croo(Application application, btrm btrmVar) {
        cron cronVar = new cron(application);
        BluetoothAdapter defaultAdapter = cronVar.a() ? BluetoothAdapter.getDefaultAdapter() : null;
        this.i = new crol(this);
        this.j = new crom(this);
        this.e = application;
        this.f = btrmVar;
        this.k = cronVar;
        this.g = defaultAdapter;
    }

    @Override // defpackage.crgy
    public final synchronized void a(crgz crgzVar) {
        this.h = false;
        if (this.k.a()) {
            if (crgzVar.b != dqvj.DRIVE) {
                return;
            }
            BluetoothAdapter bluetoothAdapter = this.g;
            if (bluetoothAdapter == null) {
                return;
            }
            this.b = 0;
            bluetoothAdapter.getProfileProxy(this.e, this.j, 2);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
            intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
            this.e.registerReceiver(this.i, intentFilter);
            this.h = true;
        }
    }

    @Override // defpackage.crgy
    public final synchronized void b(boolean z) {
        BluetoothA2dp bluetoothA2dp;
        if (!this.h) {
            return;
        }
        this.h = false;
        this.e.unregisterReceiver(this.i);
        BluetoothAdapter bluetoothAdapter = this.g;
        if (bluetoothAdapter != null && (bluetoothA2dp = this.a) != null) {
            bluetoothAdapter.closeProfileProxy(2, bluetoothA2dp);
        }
        this.a = null;
    }

    public final synchronized void c() {
        List<BluetoothDevice> arrayList = new ArrayList<>();
        BluetoothA2dp bluetoothA2dp = this.a;
        if (bluetoothA2dp != null) {
            try {
                arrayList = bluetoothA2dp.getDevicesMatchingConnectionStates(d);
            } catch (NullPointerException e) {
                bvoo.j(e);
                return;
            }
        }
        int i = this.b;
        int size = arrayList.size();
        this.b = size;
        if (size > i) {
            this.f.b(croq.a);
        }
    }
}
