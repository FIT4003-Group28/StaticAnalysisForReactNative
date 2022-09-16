package defpackage;

import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ypn  reason: default package */
/* loaded from: classes4.dex */
public final class ypn implements ypo {
    final /* synthetic */ ypq a;
    private boolean b;
    private boolean c;

    public ypn(ypq ypqVar) {
        this.a = ypqVar;
    }

    @Override // defpackage.ypo
    public final void a() {
        e(null);
    }

    @Override // defpackage.ypo
    public final void b(TelephonyManager telephonyManager) {
        try {
            telephonyManager.listen(new ypm(this, telephonyManager), 1048576);
        } catch (RuntimeException e) {
            zep.d("TelephonyManager threw error when registering listener.", e);
            this.a.d = false;
        }
    }

    @Override // defpackage.ypo
    public final boolean c() {
        return this.a.d() && this.c;
    }

    @Override // defpackage.ypo
    public final boolean d() {
        return this.a.d() && this.b;
    }

    public final void e(TelephonyDisplayInfo telephonyDisplayInfo) {
        boolean z;
        synchronized (this.a) {
            boolean z2 = false;
            if (telephonyDisplayInfo == null) {
                this.c = false;
                this.b = false;
                this.a.c.c(false);
            } else {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                if (overrideNetworkType != 4) {
                    if (overrideNetworkType == 5) {
                        overrideNetworkType = 5;
                    } else {
                        z = false;
                        this.b = z;
                        if (!z || overrideNetworkType == 3) {
                            z2 = true;
                        }
                        this.c = z2;
                        this.a.c.c(Boolean.valueOf(z2));
                    }
                }
                z = true;
                this.b = z;
                if (!z) {
                }
                z2 = true;
                this.c = z2;
                this.a.c.c(Boolean.valueOf(z2));
            }
        }
    }
}
