package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
/* compiled from: PG */
/* renamed from: axm  reason: default package */
/* loaded from: classes3.dex */
public final class axm extends ayn {
    private static final String[] p = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<axl, PointF> q;
    private static final Property<axl, PointF> r;
    private static final Property<View, PointF> s;
    private static final Property<View, PointF> t;
    private static final Property<View, PointF> u;

    static {
        new axd(PointF.class);
        q = new axe(PointF.class);
        r = new axf(PointF.class);
        s = new axg(PointF.class);
        t = new axh(PointF.class);
        u = new axi(PointF.class);
    }

    private static final void e(ayx ayxVar) {
        View view = ayxVar.b;
        if (!od.ae(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        ayxVar.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        ayxVar.a.put("android:changeBounds:parent", ayxVar.b.getParent());
    }

    @Override // defpackage.ayn
    public final String[] a() {
        return p;
    }

    @Override // defpackage.ayn
    public final void b(ayx ayxVar) {
        e(ayxVar);
    }

    @Override // defpackage.ayn
    public final void c(ayx ayxVar) {
        e(ayxVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0132 A[RETURN] */
    @Override // defpackage.ayn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator d(android.view.ViewGroup r20, defpackage.ayx r21, defpackage.ayx r22) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axm.d(android.view.ViewGroup, ayx, ayx):android.animation.Animator");
    }
}
