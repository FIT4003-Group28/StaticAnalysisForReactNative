package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: ulv  reason: default package */
/* loaded from: classes7.dex */
final class ulv implements View.OnLayoutChangeListener {
    private final Rect a = new Rect();

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup viewGroup = (ViewGroup) view;
        zts ztsVar = (zts) cqkx.e(viewGroup, ulz.b, zts.class);
        if (ztsVar == null) {
            bvoo.h("Failed to find find legSchematicView", new Object[0]);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) cqkx.e(viewGroup, ulz.c, ViewGroup.class);
        if (viewGroup2 == null) {
            bvoo.h("Failed to find stopsList", new Object[0]);
            return;
        }
        Rect rect = this.a;
        rect.set(0, 0, viewGroup2.getWidth(), viewGroup2.getHeight());
        viewGroup.offsetDescendantRectToMyCoords(viewGroup2, rect);
        ztsVar.u(viewGroup2, this.a);
    }
}
