package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: gza  reason: default package */
/* loaded from: classes3.dex */
final class gza implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ gzb a;
    private final View b;
    private final View c;

    public gza(gzb gzbVar, View view, View view2) {
        this.a = gzbVar;
        this.b = view;
        this.c = view2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        Rect rect = new Rect();
        this.c.getGlobalVisibleRect(rect);
        akgc akgcVar = this.a.d;
        if (akgcVar != null) {
            akgcVar.b.set(rect);
        }
        Rect rect2 = new Rect();
        this.b.getGlobalVisibleRect(rect2);
        float rotation = this.b.getRotation();
        double sin = Math.sin(Math.toRadians(rotation));
        akgc akgcVar2 = this.a.d;
        if (akgcVar2 != null) {
            akgcVar2.c(rect2, 2, 2);
        }
        akgc akgcVar3 = this.a.d;
        boolean z = akgcVar3 != null && akgcVar3.h(2, rect2);
        akgc akgcVar4 = this.a.d;
        boolean z2 = akgcVar4 != null && akgcVar4.h(1, rect2);
        if (z || z2) {
            double width = this.b.getWidth();
            Double.isNaN(width);
            double abs = Math.abs((width / 2.0d) * sin);
            double height = this.b.getHeight();
            Double.isNaN(height);
            double d = (height / 2.0d) * sin;
            if (rotation > 90.0f || rotation < -90.0f) {
                rect2.offset(z ? (int) d : (int) (-d), z ? (int) (-abs) : (int) abs);
            } else {
                rect2.offset(z ? (int) (-d) : (int) d, z ? (int) (-abs) : (int) abs);
            }
        } else {
            rect2.offset(0, rect2.height() / 2);
        }
        this.a.a.e();
        akgc akgcVar5 = this.a.d;
        if (akgcVar5 != null) {
            akgcVar5.g(rect2);
        }
        this.a.c.c(true);
    }
}
