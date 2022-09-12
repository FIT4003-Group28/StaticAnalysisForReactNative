package defpackage;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothProfile;
/* compiled from: PG */
/* renamed from: crom  reason: default package */
/* loaded from: classes5.dex */
final class crom implements BluetoothProfile.ServiceListener {
    final /* synthetic */ croo a;

    public crom(croo crooVar) {
        this.a = crooVar;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        if (i == 2) {
            int i2 = croo.c;
            synchronized (this.a) {
                croo crooVar = this.a;
                crooVar.a = (BluetoothA2dp) bluetoothProfile;
                crooVar.c();
            }
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i) {
        if (i == 2) {
            int i2 = croo.c;
            synchronized (this.a) {
                croo crooVar = this.a;
                crooVar.a = null;
                crooVar.b = 0;
            }
        }
    }
}
