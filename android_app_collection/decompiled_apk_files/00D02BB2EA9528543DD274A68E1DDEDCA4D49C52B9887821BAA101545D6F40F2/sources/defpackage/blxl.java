package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: blxl  reason: default package */
/* loaded from: classes3.dex */
public final class blxl implements cqfc {
    final /* synthetic */ float a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ blxo e;

    public blxl(blxo blxoVar, float f, boolean z, boolean z2, boolean z3) {
        this.e = blxoVar;
        this.a = f;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        if (z) {
            view.setScaleX(0.0f);
        }
        view.setPivotX(view.getRootView().getLayoutDirection() == 0 ? 0.0f : view.getWidth());
        view.animate().scaleX(this.a).setDuration(750L).rotation(0.0f).withStartAction(new blxk(this, view)).withEndAction(new blxj(this, view)).start();
    }
}
