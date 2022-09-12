package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: axte  reason: default package */
/* loaded from: classes3.dex */
final class axte implements axub {
    private final Activity a;
    @dzsi
    private final axuc b;

    public axte(Activity activity, @dzsi axuc axucVar) {
        this.a = activity;
        this.b = axucVar;
    }

    private final void c(boolean z, @dzsi azvc azvcVar) {
        fd K = ((gga) this.a).K();
        if (K != null && K.U()) {
            ((gga) this.a).g().e();
        }
        axuc axucVar = this.b;
        if (axucVar != null) {
            if (z) {
                axucVar.a(this.a).a(azvcVar);
            } else {
                axucVar.a(this.a).b();
            }
        }
    }

    @Override // defpackage.axub
    public final void a(@dzsi azvc azvcVar) {
        c(true, azvcVar);
    }

    @Override // defpackage.axub
    public final void b() {
        c(false, null);
    }
}
