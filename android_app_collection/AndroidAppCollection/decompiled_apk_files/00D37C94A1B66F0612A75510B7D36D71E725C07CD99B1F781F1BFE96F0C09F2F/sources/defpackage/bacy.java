package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import org.chromium.net.AndroidTelephonyManagerBridge;
/* compiled from: PG */
/* renamed from: bacy  reason: default package */
/* loaded from: classes2.dex */
public final class bacy extends PhoneStateListener {
    final /* synthetic */ AndroidTelephonyManagerBridge a;
    private ServiceState b;

    public bacy(AndroidTelephonyManagerBridge androidTelephonyManagerBridge) {
        this.a = androidTelephonyManagerBridge;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        TelephonyManager telephonyManager;
        ServiceState serviceState2 = this.b;
        if (serviceState2 == null || !serviceState2.equals(serviceState)) {
            this.b = serviceState;
            AndroidTelephonyManagerBridge androidTelephonyManagerBridge = this.a;
            telephonyManager = AndroidTelephonyManagerBridge.getTelephonyManager();
            androidTelephonyManagerBridge.update(telephonyManager);
        }
    }
}
