package defpackage;

import android.app.Application;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: chyp  reason: default package */
/* loaded from: classes4.dex */
final class chyp extends cqqw {
    final /* synthetic */ chsf a;
    final /* synthetic */ cqhu b;
    final /* synthetic */ Application c;
    final /* synthetic */ chyq d;

    public chyp(chyq chyqVar, chsf chsfVar, cqhu cqhuVar, Application application) {
        this.d = chyqVar;
        this.a = chsfVar;
        this.b = cqhuVar;
        this.c = application;
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (this.a.d(this.d.b) && this.d.e != null) {
            aag aagVar = (aag) recyclerView.l;
            dbsk.s(aagVar);
            boolean z = aagVar.ac() >= this.d.e.intValue();
            chyq chyqVar = this.d;
            if (chyqVar.d != z) {
                chyqVar.d = z;
                cqkx.p(chyqVar);
            }
        }
        dbsg u = dcbg.b(cqkx.n(this.d)).s(new dbrn() { // from class: chym
            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return dbsg.j(cqhu.a((View) obj, cizk.a));
            }
        }).o(chyn.a).s(chyo.a).u();
        if (!u.a()) {
            return;
        }
        if (recyclerView.canScrollVertically(-1)) {
            ((View) u.b()).setElevation(cqrp.d(2.0d).e(this.c));
        } else {
            ((View) u.b()).setElevation(0.0f);
        }
    }
}
