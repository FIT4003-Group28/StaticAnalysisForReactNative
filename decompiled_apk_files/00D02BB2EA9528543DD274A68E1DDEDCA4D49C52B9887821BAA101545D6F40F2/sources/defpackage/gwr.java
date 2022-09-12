package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: gwr  reason: default package */
/* loaded from: classes.dex */
final class gwr implements cqfc {
    final /* synthetic */ boolean a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;
    final /* synthetic */ int d;

    public gwr(boolean z, float f, float f2, int i) {
        this.a = z;
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        if (z) {
            b(view);
        } else {
            view.animate().alpha(this.b).scaleX(this.c).scaleY(this.c).setInterpolator(irf.a).setDuration(this.d).setListener(new gwq(this, view)).start();
        }
    }

    public final void b(View view) {
        view.setVisibility(true != this.a ? 8 : 0);
        view.setAlpha(this.b);
        view.setScaleX(this.c);
        view.setScaleY(this.c);
    }
}
