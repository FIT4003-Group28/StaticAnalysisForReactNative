package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sfg  reason: default package */
/* loaded from: classes4.dex */
public final class sfg implements Runnable {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ sfi c;

    public sfg(sfi sfiVar, float f, float f2) {
        this.c = sfiVar;
        this.a = f;
        this.b = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sfi sfiVar = this.c;
        sfo sfoVar = sfiVar.e;
        sfu f = sfiVar.f();
        float f2 = this.a;
        float f3 = this.b;
        int round = Math.round(f2);
        f.e.a(f.c.getWidth(), f.c.getHeight());
        int round2 = (-f.e.b) + Math.round(f3);
        f.b.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        f.d.a(f.b.getMeasuredWidth(), f.b.getMeasuredHeight());
        sbz sbzVar = f.d;
        int i = sfoVar.a;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            round -= sbzVar.a / 2;
            round2 -= sbzVar.b;
            f.c(2);
        } else if (i2 == 1) {
            round -= sbzVar.a / 2;
            f.c(1);
        } else if (i2 == 2) {
            round -= sbzVar.a;
            round2 -= sbzVar.b / 2;
            f.c(4);
        } else if (i2 == 3) {
            round2 -= sbzVar.b / 2;
            f.c(3);
        }
        int i3 = round2;
        if (f.c.getLayoutDirection() == 1) {
            round -= f.c.getWidth();
        }
        int i4 = round;
        if (f.a.isShowing()) {
            f.a.update(f.c, i4, i3, -2, -2);
            return;
        }
        f.a.setWidth(-2);
        f.a.setHeight(-2);
        f.a.showAsDropDown(f.c, i4, i3);
    }
}
