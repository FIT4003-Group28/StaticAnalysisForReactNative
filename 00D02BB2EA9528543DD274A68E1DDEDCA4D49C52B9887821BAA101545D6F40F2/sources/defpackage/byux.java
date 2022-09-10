package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: byux  reason: default package */
/* loaded from: classes4.dex */
public final class byux implements ango {
    final /* synthetic */ eapd a;
    final /* synthetic */ byuy b;

    public byux(byuy byuyVar, eapd eapdVar) {
        this.b = byuyVar;
        this.a = eapdVar;
    }

    @Override // defpackage.ango
    public final void c(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void d(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void e(duyc duycVar, duye duyeVar) {
        Executor executor = this.b.d;
        final eapd eapdVar = this.a;
        executor.execute(new Runnable(this, eapdVar) { // from class: byuw
            private final byux a;
            private final eapd b;

            {
                this.a = this;
                this.b = eapdVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byux byuxVar = this.a;
                byuxVar.b.e.a(this.b);
            }
        });
    }

    @Override // defpackage.ango
    public final void f(duyc duycVar) {
    }
}
