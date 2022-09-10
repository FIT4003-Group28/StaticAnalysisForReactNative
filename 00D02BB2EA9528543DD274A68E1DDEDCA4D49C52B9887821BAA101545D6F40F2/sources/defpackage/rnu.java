package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.udc.ConsentCancelReason;
/* compiled from: PG */
/* renamed from: rnu  reason: default package */
/* loaded from: classes7.dex */
public final class rnu implements awnl {
    private static final ddho b = dtxl.cx;
    public transient cjqy a;
    private final int c;

    public rnu(int i) {
        this.c = i;
    }

    private final void c(ddho ddhoVar) {
        this.a.i(cjtd.a(ddhoVar));
    }

    @Override // defpackage.awnl
    public final awnn a() {
        return awnn.UDC_CONSENT;
    }

    @Override // defpackage.awnl
    public final void b(Activity activity, int i, Intent intent) {
        ((ron) btsq.c(ron.class, activity)).wG(this);
        rnv.e.set(1);
        if (i == -1) {
            rnv.e.set(2);
            c(dtxl.cw);
        } else if (i != 0) {
            if (i != 100) {
                return;
            }
            this.a.r(new cjsz(b));
        } else {
            ConsentCancelReason consentCancelReason = null;
            if (intent != null && intent.hasExtra("udc.consent.cancelReason")) {
                consentCancelReason = (ConsentCancelReason) intent.getParcelableExtra("udc.consent.cancelReason");
            }
            if (consentCancelReason == null || consentCancelReason.a != 1) {
                c(dtxl.cy);
                return;
            }
            c(dtxl.cv);
            rnv.e.set(this.c);
        }
    }
}
