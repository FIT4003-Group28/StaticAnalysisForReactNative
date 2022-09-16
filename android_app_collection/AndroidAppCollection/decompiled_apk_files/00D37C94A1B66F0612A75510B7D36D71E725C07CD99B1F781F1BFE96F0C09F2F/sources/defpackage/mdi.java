package defpackage;

import android.graphics.Rect;
import android.view.View;
/* compiled from: PG */
/* renamed from: mdi  reason: default package */
/* loaded from: classes3.dex */
public final class mdi implements View.OnLayoutChangeListener {
    final /* synthetic */ Rect a;

    public mdi(Rect rect) {
        this.a = rect;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.left += this.a.left;
        rect.top += this.a.top;
        rect.right -= this.a.right;
        rect.bottom -= this.a.bottom;
        ((View) view.getParent()).setTouchDelegate(new mdj(rect, view));
    }
}
