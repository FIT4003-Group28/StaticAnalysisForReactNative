package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dafr  reason: default package */
/* loaded from: classes5.dex */
public class dafr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static RectF b(dagg daggVar, View view) {
        if (view == null) {
            return new RectF();
        }
        if (daggVar.x || !(view instanceof dage)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        dage dageVar = (dage) view;
        View[] viewArr = {dageVar.a, dageVar.b, dageVar.c};
        int i = 0;
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view2 = viewArr[i3];
            if (view2 != null && view2.getVisibility() == 0) {
                i2 = z ? Math.min(i2, view2.getLeft()) : view2.getLeft();
                i = z ? Math.max(i, view2.getRight()) : view2.getRight();
                z = true;
            }
        }
        int i4 = i - i2;
        View[] viewArr2 = {dageVar.a, dageVar.b, dageVar.c};
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        for (int i7 = 0; i7 < 3; i7++) {
            View view3 = viewArr2[i7];
            if (view3 != null && view3.getVisibility() == 0) {
                i6 = z2 ? Math.min(i6, view3.getTop()) : view3.getTop();
                i5 = z2 ? Math.max(i5, view3.getBottom()) : view3.getBottom();
                z2 = true;
            }
        }
        int i8 = i5 - i6;
        int b = (int) dabd.b(dageVar.getContext(), 24);
        if (i4 < b) {
            i4 = b;
        }
        int left = (dageVar.getLeft() + dageVar.getRight()) / 2;
        int top = (dageVar.getTop() + dageVar.getBottom()) / 2;
        int i9 = i4 / 2;
        return new RectF(left - i9, top - (i8 / 2), i9 + left, top + (left / 2));
    }

    public void a(dagg daggVar, View view, View view2, float f, Drawable drawable) {
        RectF b = b(daggVar, view);
        RectF b2 = b(daggVar, view2);
        drawable.setBounds(czum.b((int) b.left, (int) b2.left, f), drawable.getBounds().top, czum.b((int) b.right, (int) b2.right, f), drawable.getBounds().bottom);
    }
}
