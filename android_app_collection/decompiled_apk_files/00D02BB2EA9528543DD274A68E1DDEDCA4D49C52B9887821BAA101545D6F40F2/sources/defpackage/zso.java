package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
/* compiled from: PG */
/* renamed from: zso  reason: default package */
/* loaded from: classes7.dex */
public abstract class zso {
    public abstract int a();

    public abstract CharSequence b();

    public abstract String c();

    public abstract Rect d();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract dbty<Point> e();

    public final Rect f(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect(d());
        rect.offset(iArr[0], iArr[1]);
        Point a = e().a();
        rect.offset(a.x, a.y);
        return rect;
    }
}
