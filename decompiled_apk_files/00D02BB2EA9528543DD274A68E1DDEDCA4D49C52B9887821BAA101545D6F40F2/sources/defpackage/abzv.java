package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: abzv  reason: default package */
/* loaded from: classes2.dex */
final class abzv extends abp {
    final /* synthetic */ acbc a;
    final /* synthetic */ Rect b;
    final /* synthetic */ int c;
    final /* synthetic */ Drawable d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;

    public abzv(acbc acbcVar, Rect rect, int i, Drawable drawable, int i2, int i3) {
        this.a = acbcVar;
        this.b = rect;
        this.c = i;
        this.d = drawable;
        this.e = i2;
        this.f = i3;
    }

    @Override // defpackage.abp
    public final void b(Rect rect, View view, RecyclerView recyclerView, aci aciVar) {
        super.b(rect, view, recyclerView, aciVar);
        aec aecVar = (aec) view.getLayoutParams();
        if (aecVar == null || aecVar.b) {
            return;
        }
        if (aecVar.d() == 0) {
            rect.right = this.e;
        } else {
            rect.left = this.f - this.e;
        }
        rect.bottom = this.f;
    }

    @Override // defpackage.abp
    public final void k(Canvas canvas, RecyclerView recyclerView) {
        int intValue = this.a.y().intValue();
        boolean booleanValue = this.a.w().booleanValue();
        if (recyclerView.computeVerticalScrollOffset() > (booleanValue ? this.a.x().a().intValue() - intValue : 0)) {
            if (true != booleanValue) {
                intValue = 0;
            }
            this.b.set(0, intValue, recyclerView.getWidth(), this.c + intValue);
            this.d.setBounds(this.b);
            this.d.draw(canvas);
        }
    }
}
