package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
/* compiled from: PG */
/* renamed from: pwr  reason: default package */
/* loaded from: classes4.dex */
final class pwr extends PhoneStateListener {
    final /* synthetic */ pws a;

    public pwr(pws pwsVar) {
        this.a = pwsVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        this.a.c(true != (overrideNetworkType == 3 || overrideNetworkType == 4) ? 5 : 10);
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        String serviceState2 = serviceState == null ? "" : serviceState.toString();
        this.a.c(true != (serviceState2.contains("nrState=CONNECTED") || serviceState2.contains("nrState=NOT_RESTRICTED")) ? 5 : 10);
    }
}
