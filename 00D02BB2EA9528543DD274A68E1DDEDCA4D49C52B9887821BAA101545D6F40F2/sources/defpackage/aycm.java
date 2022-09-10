package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* renamed from: aycm  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class aycm implements cqfc {
    static final cqfc a = new aycm();

    private aycm() {
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        cqrp cqrpVar = aycu.a;
        aycl ayclVar = new aycl();
        ayclVar.h = 150L;
        ayclVar.i = 150L;
        ayclVar.k = 150L;
        ayclVar.j = 150L;
        ((RecyclerView) view).setItemAnimator(ayclVar);
    }
}
