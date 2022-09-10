package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bfgq  reason: default package */
/* loaded from: classes3.dex */
public class bfgq {
    public final cjqy a;
    dbsg<cjqp> b = dbpy.a;
    public dbsg<cjql> c = dbpy.a;
    public cjtd d = cjtd.b;
    private final cjqq e;

    public bfgq(cjqq cjqqVar, cjqy cjqyVar) {
        this.e = cjqqVar;
        this.a = cjqyVar;
    }

    public final void a(View view) {
        this.b = dbsg.i(this.e.f(view));
    }

    public final void b(ilo iloVar) {
        cjta c = cjtd.c(iloVar.bZ());
        c.d = dtxy.iK;
        this.d = c.a();
    }

    public final void c() {
        this.d = cjtd.b;
    }

    public final void d() {
        this.c = this.b.h(new dbrn(this) { // from class: bfgo
            private final bfgq a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return ((cjqp) obj).d(this.a.d);
            }
        });
    }

    public final View.OnClickListener e(final View.OnClickListener onClickListener) {
        return new View.OnClickListener(this, onClickListener) { // from class: bfgp
            private final bfgq a;
            private final View.OnClickListener b;

            {
                this.a = this;
                this.b = onClickListener;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bfgq bfgqVar = this.a;
                View.OnClickListener onClickListener2 = this.b;
                if (bfgqVar.c.a()) {
                    bfgqVar.a.j(bfgqVar.c.b(), bfgqVar.d);
                }
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                }
            }
        };
    }
}
