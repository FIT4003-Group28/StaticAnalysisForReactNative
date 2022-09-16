package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bdca  reason: default package */
/* loaded from: classes3.dex */
public final class bdca implements View.OnAttachStateChangeListener {
    final /* synthetic */ bdcb a;

    public bdca(bdcb bdcbVar) {
        this.a = bdcbVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (!(view instanceof bxbx)) {
            return;
        }
        bxbx bxbxVar = (bxbx) view;
        if (!bxbxVar.a()) {
            bdcb bdcbVar = this.a;
            bxbxVar.g(bdcbVar.e, bdcbVar.f, bdcbVar.g);
            bxbxVar.d();
        }
        bxbxVar.b(this.a.b, new bdbz(bxbxVar));
        bwuj f = bxbxVar.f();
        if (f != null) {
            f.b(this.a.c);
        }
        this.a.d.a(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (!(view instanceof bxbx)) {
            return;
        }
        bxbx bxbxVar = (bxbx) view;
        bxbxVar.d();
        bxbxVar.c();
    }
}
