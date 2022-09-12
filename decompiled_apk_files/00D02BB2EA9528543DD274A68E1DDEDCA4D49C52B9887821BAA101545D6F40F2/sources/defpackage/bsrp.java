package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bsrp  reason: default package */
/* loaded from: classes4.dex */
public class bsrp implements jbk {
    public final bsri a;
    private final String b;
    private boolean c;

    public bsrp(bsri bsriVar, String str) {
        this.a = bsriVar;
        this.b = str;
    }

    @Override // defpackage.jbk
    public jib NC() {
        jhz a = jhz.a();
        a.a = this.b;
        a.A = this.c;
        a.i = cqrt.g(2131231588, irg.b());
        a.o = this.a.h();
        a.j = cqsk.a(this.a.f());
        a.f(new View.OnClickListener(this) { // from class: bsro
            private final bsrp a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.e();
            }
        });
        a.x = false;
        return a.b();
    }

    public void b(boolean z) {
        this.c = true;
        cqkx.p(this);
    }
}
