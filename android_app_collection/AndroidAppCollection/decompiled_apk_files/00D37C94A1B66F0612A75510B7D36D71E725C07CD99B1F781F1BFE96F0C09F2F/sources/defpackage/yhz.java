package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: yhz  reason: default package */
/* loaded from: classes4.dex */
final class yhz implements View.OnClickListener {
    final /* synthetic */ yib a;

    public yhz(yib yibVar) {
        this.a = yibVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aopc aopcVar;
        this.a.b();
        yib yibVar = this.a;
        if (view == yibVar.c) {
            aopc aopcVar2 = yibVar.q;
            if (aopcVar2 == null) {
                return;
            }
            awix awixVar = (awix) aopcVar2.mo39build();
            yibVar.d(yic.b(awixVar) + yic.c(awixVar));
            yibVar.c();
        } else if (view != yibVar.b || (aopcVar = yibVar.q) == null) {
        } else {
            awix awixVar2 = (awix) aopcVar.mo39build();
            yibVar.d(yic.b(awixVar2) - yic.c(awixVar2));
            yibVar.c();
        }
    }
}
