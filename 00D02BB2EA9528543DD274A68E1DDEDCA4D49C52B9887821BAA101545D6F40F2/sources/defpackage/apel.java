package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: apel  reason: default package */
/* loaded from: classes2.dex */
final class apel implements ango {
    final /* synthetic */ apem a;

    public apel(apem apemVar) {
        this.a = apemVar;
    }

    @Override // defpackage.ango
    public final void c(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void d(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void e(duyc duycVar, duye duyeVar) {
        if ((duyeVar.a & 2) != 0) {
            anhk anhkVar = this.a.d;
            dnwb dnwbVar = duyeVar.c;
            if (dnwbVar == null) {
                dnwbVar = dnwb.i;
            }
            anhkVar.c(dnwbVar);
        }
        this.a.g.execute(new Runnable(this) { // from class: apei
            private final apel a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                apem apemVar = this.a.a;
                if (((ges) apemVar.j).aD) {
                    apemVar.i.d(1);
                }
            }
        });
    }

    @Override // defpackage.ango
    public final void f(duyc duycVar) {
        this.a.g.execute(new Runnable(this) { // from class: apej
            private final apel a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final apel apelVar = this.a;
                apem apemVar = apelVar.a;
                if (!((ges) apemVar.j).aD) {
                    return;
                }
                apemVar.c.f(dcep.B(apemVar.f.a().ai()));
                apelVar.a.i.e(1, new View.OnClickListener(apelVar) { // from class: apek
                    private final apel a;

                    {
                        this.a = apelVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        apel apelVar2 = this.a;
                        apelVar2.a.h.i(cjtd.a(dtyi.aP));
                        apelVar2.a.n();
                    }
                });
            }
        });
    }
}
