package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bdxl  reason: default package */
/* loaded from: classes3.dex */
final class bdxl implements View.OnAttachStateChangeListener {
    final /* synthetic */ bdyb a;

    public bdxl(bdyb bdybVar) {
        this.a = bdybVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        bdyd bdydVar = this.a.bF;
        if (bdydVar != null) {
            bdydVar.b();
        }
        this.a.bW = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        bdyb bdybVar = this.a;
        bdybVar.bW = false;
        bdyd bdydVar = bdybVar.bF;
        if (bdydVar != null) {
            bdydVar.c();
        }
    }
}
