package a.r;

import android.view.View;
/* loaded from: classes.dex */
public abstract class w0 extends a0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f706a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    private static int a(d0 d0Var, int i) {
        int[] iArr;
        if (d0Var == null || (iArr = (int[]) d0Var.f583a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }

    @Override // a.r.a0
    public void a(d0 d0Var) {
        View view = d0Var.f584b;
        Integer num = (Integer) d0Var.f583a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        d0Var.f583a.put("android:visibilityPropagation:visibility", num);
        view.getLocationOnScreen(r2);
        int[] iArr = {iArr[0] + Math.round(view.getTranslationX())};
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iArr[1] + (view.getHeight() / 2);
        d0Var.f583a.put("android:visibilityPropagation:center", iArr);
    }

    @Override // a.r.a0
    public String[] a() {
        return f706a;
    }

    public int b(d0 d0Var) {
        Integer num;
        if (d0Var == null || (num = (Integer) d0Var.f583a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int c(d0 d0Var) {
        return a(d0Var, 0);
    }

    public int d(d0 d0Var) {
        return a(d0Var, 1);
    }
}
