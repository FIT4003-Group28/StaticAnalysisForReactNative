package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bdei  reason: default package */
/* loaded from: classes3.dex */
final class bdei implements View.OnClickListener {
    final /* synthetic */ bdej a;

    public bdei(bdej bdejVar) {
        this.a = bdejVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bdej bdejVar = this.a;
        bcrq bcrqVar = bdejVar.j;
        bcqr bcqrVar = (bcqr) bcrqVar;
        dwfl e = bcqrVar.a.e(bdejVar.e().intValue());
        dbsk.s(e);
        bcqrVar.c.a().r(e, bcqrVar.b);
    }
}
