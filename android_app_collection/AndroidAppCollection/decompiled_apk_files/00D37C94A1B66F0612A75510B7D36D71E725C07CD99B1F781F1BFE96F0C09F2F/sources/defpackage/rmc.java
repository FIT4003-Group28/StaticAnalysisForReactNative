package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
/* compiled from: PG */
/* renamed from: rmc  reason: default package */
/* loaded from: classes4.dex */
final class rmc implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ rki b;
    private final /* synthetic */ int c;

    public rmc(rki rkiVar, AppMetadata appMetadata) {
        this.b = rkiVar;
        this.a = appMetadata;
    }

    public rmc(rki rkiVar, AppMetadata appMetadata, int i) {
        this.c = i;
        this.b = rkiVar;
        this.a = appMetadata;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            this.b.a.w();
            rpn rpnVar = this.b.a;
            AppMetadata appMetadata = this.a;
            rpnVar.v();
            rpnVar.x();
            qnm.l(appMetadata.a);
            rpnVar.c(appMetadata);
        } else if (i == 1) {
            this.b.a.w();
            this.b.a.H(this.a);
        } else if (i != 2) {
            this.b.a.w();
            this.b.a.E(this.a);
        } else {
            this.b.a.w();
            rpn rpnVar2 = this.b.a;
            AppMetadata appMetadata2 = this.a;
            rpnVar2.v();
            rpnVar2.x();
            qnm.l(appMetadata2.a);
            rjq b = rjq.b(appMetadata2.v);
            rjq h = rpnVar2.h(appMetadata2.a);
            rpnVar2.aG().k.c("Setting consent, package, consent", appMetadata2.a, b);
            rpnVar2.J(appMetadata2.a, b);
            if (!b.j(h)) {
                return;
            }
            rpnVar2.H(appMetadata2);
        }
    }
}
