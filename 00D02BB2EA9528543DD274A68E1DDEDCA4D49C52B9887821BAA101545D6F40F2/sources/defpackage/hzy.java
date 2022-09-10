package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: hzy  reason: default package */
/* loaded from: classes6.dex */
final class hzy implements dafw {
    final /* synthetic */ iaa a;

    public hzy(iaa iaaVar) {
        this.a = iaaVar;
    }

    @Override // defpackage.dafv
    public final void a(dagb dagbVar) {
        View view = dagbVar.e;
        if (view != null) {
            cjtd k = cjqg.k(view);
            cjql e = cjqg.e(view);
            if (k != null && e != null) {
                this.a.c.j(e, k);
            }
        }
        this.a.e = new iba(dagbVar.d, false);
        cqkx.p(this.a);
        for (hzz hzzVar : this.a.d) {
            hzzVar.c(dagbVar);
        }
    }

    @Override // defpackage.dafv
    public final void b(dagb dagbVar) {
        for (hzz hzzVar : this.a.d) {
            hzzVar.a(dagbVar);
        }
    }

    @Override // defpackage.dafv
    public final void c(dagb dagbVar) {
        for (hzz hzzVar : this.a.d) {
            hzzVar.b(dagbVar);
        }
    }
}
