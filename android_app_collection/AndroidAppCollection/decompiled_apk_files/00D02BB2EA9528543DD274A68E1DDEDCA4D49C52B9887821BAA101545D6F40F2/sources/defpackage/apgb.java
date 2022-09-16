package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: apgb  reason: default package */
/* loaded from: classes2.dex */
public class apgb implements jbk {
    public final gga a;
    private final ilo b;

    public apgb(gga ggaVar, ilo iloVar) {
        this.a = ggaVar;
        this.b = iloVar;
    }

    @Override // defpackage.jbk
    public jib NC() {
        jhz a = jhz.a();
        a.a = this.b.n();
        a.q = ibm.b();
        a.u = ibm.t();
        a.A = false;
        a.f(new View.OnClickListener(this) { // from class: apga
            private final apgb a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gn g = this.a.a.g();
                if (!g.J()) {
                    g.e();
                }
            }
        });
        a.g = ibm.o();
        a.d = ibm.b();
        a.x = false;
        return a.b();
    }
}
