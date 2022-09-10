package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bdeh  reason: default package */
/* loaded from: classes3.dex */
final class bdeh implements View.OnClickListener {
    final /* synthetic */ bdej a;

    public bdeh(bdej bdejVar) {
        this.a = bdejVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bdej bdejVar = this.a;
        bcrq bcrqVar = bdejVar.j;
        bcqr bcqrVar = (bcqr) bcrqVar;
        dwfl e = bcqrVar.a.e(bdejVar.e().intValue());
        dbsk.s(e);
        if (cknv.i(e)) {
            bcqrVar.b.Qn(new bdgu(true, cknv.j(e)));
            return;
        }
        bwqv bwqvVar = bcqrVar.f;
        dizh dizhVar = e.p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        dggg dgggVar = dizhVar.b;
        if (dgggVar == null) {
            dgggVar = dggg.d;
        }
        bcqrVar.b.aZ(bdgj.g(bwqvVar, dgggVar, cknv.j(e)));
    }
}
