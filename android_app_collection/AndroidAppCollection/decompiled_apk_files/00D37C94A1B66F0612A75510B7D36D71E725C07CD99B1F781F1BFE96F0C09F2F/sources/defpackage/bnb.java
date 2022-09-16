package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
/* compiled from: PG */
/* renamed from: bnb  reason: default package */
/* loaded from: classes2.dex */
public final class bnb extends bnk {
    private static final String[] p = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property q;
    private static final Property r;
    private static final Property s;
    private static final Property t;
    private static final Property u;

    static {
        new bms(PointF.class);
        q = new bmt(PointF.class);
        r = new bmu(PointF.class);
        s = new bmv(PointF.class);
        t = new bmw(PointF.class);
        u = new bmx(PointF.class);
    }

    private static final void e(bnt bntVar) {
        View view = bntVar.b;
        if (!lj.al(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        bntVar.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        bntVar.a.put("android:changeBounds:parent", bntVar.b.getParent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0126  */
    @Override // defpackage.bnk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator a(android.view.ViewGroup r20, defpackage.bnt r21, defpackage.bnt r22) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnb.a(android.view.ViewGroup, bnt, bnt):android.animation.Animator");
    }

    @Override // defpackage.bnk
    public final void b(bnt bntVar) {
        e(bntVar);
    }

    @Override // defpackage.bnk
    public final void c(bnt bntVar) {
        e(bntVar);
    }

    @Override // defpackage.bnk
    public final String[] d() {
        return p;
    }
}
