package defpackage;

import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
/* compiled from: PG */
/* renamed from: ypk  reason: default package */
/* loaded from: classes4.dex */
final class ypk extends ypp {
    final /* synthetic */ ypl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypk(ypl yplVar, TelephonyManager telephonyManager) {
        super(yplVar.a, telephonyManager);
        this.a = yplVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        this.a.e(serviceState);
        a();
    }
}
