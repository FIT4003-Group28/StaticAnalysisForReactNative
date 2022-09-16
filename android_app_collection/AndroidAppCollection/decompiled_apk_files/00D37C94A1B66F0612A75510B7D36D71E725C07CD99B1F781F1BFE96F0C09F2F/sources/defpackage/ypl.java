package defpackage;

import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ypl  reason: default package */
/* loaded from: classes4.dex */
public final class ypl implements ypo {
    final /* synthetic */ ypq a;
    private ampq b = amon.a;

    public ypl(ypq ypqVar) {
        this.a = ypqVar;
    }

    private static final boolean f(String str) {
        return str.contains("nrState=CONNECTED") || str.contains("nrState=NOT_RESTRICTED");
    }

    @Override // defpackage.ypo
    public final void a() {
        e(null);
    }

    @Override // defpackage.ypo
    public final void b(TelephonyManager telephonyManager) {
        try {
            telephonyManager.listen(new ypk(this, telephonyManager), 1);
        } catch (RuntimeException e) {
            zep.d("TelephonyManager threw error when registering listener.", e);
            this.a.d = false;
        }
    }

    @Override // defpackage.ypo
    public final boolean c() {
        return this.a.d() && f((String) this.b.e(""));
    }

    @Override // defpackage.ypo
    public final boolean d() {
        return this.a.d() && this.a.d() && ((String) this.b.e("")).contains("mNrFrequencyRange=4");
    }

    public final void e(ServiceState serviceState) {
        synchronized (this.a) {
            if (serviceState == null) {
                this.b = amon.a;
                this.a.c.c(false);
            } else {
                String serviceState2 = serviceState.toString();
                this.b = ampq.j(serviceState2);
                this.a.c.c(Boolean.valueOf(f(serviceState2)));
            }
        }
    }
}
