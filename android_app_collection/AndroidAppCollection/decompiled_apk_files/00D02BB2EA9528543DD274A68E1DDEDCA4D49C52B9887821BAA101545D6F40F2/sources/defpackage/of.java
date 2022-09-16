package defpackage;

import android.view.View;
import android.view.ViewParent;
/* compiled from: PG */
/* renamed from: of  reason: default package */
/* loaded from: classes7.dex */
public final class of {
    public static boolean a(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof nn) {
            return ((nn) viewParent).a(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, view2, i);
        } catch (AbstractMethodError unused) {
            String str = "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll";
            return false;
        }
    }

    public static void b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof nn) {
            ((nn) viewParent).b(view, view2, i, i2);
        } else if (i2 != 0) {
        } else {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError unused) {
                String str = "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted";
            }
        }
    }

    public static void c(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof nn) {
            ((nn) viewParent).c(view, i);
        } else if (i != 0) {
        } else {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError unused) {
                String str = "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll";
            }
        }
    }

    public static void d(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof no) {
            ((no) viewParent).f(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof nn) {
            ((nn) viewParent).d(view, i, i2, i3, i4, i5);
        } else if (i5 != 0) {
        } else {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError unused) {
                String str = "ViewParent " + viewParent + " does not implement interface method onNestedScroll";
            }
        }
    }

    public static void e(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof nn) {
            ((nn) viewParent).e(view, i, i2, iArr, i3);
        } else if (i3 != 0) {
        } else {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError unused) {
                String str = "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll";
            }
        }
    }

    public static boolean f(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError unused) {
            String str = "ViewParent " + viewParent + " does not implement interface method onNestedFling";
            return false;
        }
    }

    public static boolean g(ViewParent viewParent, View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError unused) {
            String str = "ViewParent " + viewParent + " does not implement interface method onNestedPreFling";
            return false;
        }
    }
}
