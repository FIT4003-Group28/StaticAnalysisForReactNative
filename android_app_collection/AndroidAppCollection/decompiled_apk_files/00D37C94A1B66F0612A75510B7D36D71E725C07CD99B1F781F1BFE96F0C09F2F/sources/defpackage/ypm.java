package defpackage;

import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
/* compiled from: PG */
/* renamed from: ypm  reason: default package */
/* loaded from: classes4.dex */
final class ypm extends ypp {
    final /* synthetic */ ypn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypm(ypn ypnVar, TelephonyManager telephonyManager) {
        super(ypnVar.a, telephonyManager);
        this.a = ypnVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        this.a.e(telephonyDisplayInfo);
        a();
    }
}
