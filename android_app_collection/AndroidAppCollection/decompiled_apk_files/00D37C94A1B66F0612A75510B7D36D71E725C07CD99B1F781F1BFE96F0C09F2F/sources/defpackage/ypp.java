package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
/* compiled from: PG */
/* renamed from: ypp  reason: default package */
/* loaded from: classes4.dex */
class ypp extends PhoneStateListener {
    private final TelephonyManager a;
    final /* synthetic */ ypq b;

    public ypp(ypq ypqVar, TelephonyManager telephonyManager) {
        this.b = ypqVar;
        this.a = telephonyManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        ypq ypqVar;
        try {
            try {
                this.a.listen(this, 0);
                ypqVar = this.b;
            } catch (RuntimeException e) {
                zep.d("TelephonyManager threw error when unregistering listener.", e);
                ypqVar = this.b;
            }
            ypqVar.d = false;
        } catch (Throwable th) {
            this.b.d = false;
            throw th;
        }
    }
}
