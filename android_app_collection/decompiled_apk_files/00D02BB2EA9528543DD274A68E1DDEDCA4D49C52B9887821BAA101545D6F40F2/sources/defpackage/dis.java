package defpackage;

import com.google.android.apps.gmm.ar.api.ArLauncherParams;
/* compiled from: PG */
/* renamed from: dis  reason: default package */
/* loaded from: classes6.dex */
final class dis implements degu<Boolean> {
    final /* synthetic */ ArLauncherParams a;
    final /* synthetic */ Object b;
    final /* synthetic */ dit c;

    public dis(dit ditVar, ArLauncherParams arLauncherParams, Object obj) {
        this.c = ditVar;
        this.a = arLauncherParams;
        this.b = obj;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        cjtd cjtdVar = dit.a;
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        ckgz ckgzVar;
        if (bool.booleanValue()) {
            czh a = this.a.a();
            diu diuVar = this.c.y;
            czh czhVar = czh.WALKING_NAVIGATION;
            int ordinal = a.ordinal();
            if (ordinal == 0) {
                ckgzVar = ckdi.b;
            } else if (ordinal != 1) {
                if (ordinal == 3) {
                    ckgzVar = ckdi.d;
                }
                this.c.f(a).p(this.b);
            } else {
                ckgzVar = ckdi.c;
            }
            float d = diuVar.a.a().d();
            if (!Float.isNaN(d)) {
                diuVar.b.a().s(ckgzVar, Math.round(d));
            }
            this.c.f(a).p(this.b);
        }
    }
}
