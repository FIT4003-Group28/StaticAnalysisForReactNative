package android.support.v4.j;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
/* compiled from: ViewParentCompat.java */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    static final c f555a;

    /* compiled from: ViewParentCompat.java */
    /* loaded from: classes.dex */
    static class c {
        c() {
        }

        public boolean a(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof m) {
                return ((m) viewParent).onStartNestedScroll(view, view2, i);
            }
            return false;
        }

        public void b(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof m) {
                ((m) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }

        public void a(ViewParent viewParent, View view) {
            if (viewParent instanceof m) {
                ((m) viewParent).onStopNestedScroll(view);
            }
        }

        public void a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            if (viewParent instanceof m) {
                ((m) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }

        public void a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            if (viewParent instanceof m) {
                ((m) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }

        public boolean a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            if (viewParent instanceof m) {
                return ((m) viewParent).onNestedFling(view, f, f2, z);
            }
            return false;
        }

        public boolean a(ViewParent viewParent, View view, float f, float f2) {
            if (viewParent instanceof m) {
                return ((m) viewParent).onNestedPreFling(view, f, f2);
            }
            return false;
        }
    }

    /* compiled from: ViewParentCompat.java */
    /* loaded from: classes.dex */
    static class a extends c {
        a() {
        }
    }

    /* compiled from: ViewParentCompat.java */
    /* loaded from: classes.dex */
    static class b extends a {
        b() {
        }

        @Override // android.support.v4.j.v.c
        public boolean a(ViewParent viewParent, View view, View view2, int i) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
                return false;
            }
        }

        @Override // android.support.v4.j.v.c
        public void b(ViewParent viewParent, View view, View view2, int i) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }

        @Override // android.support.v4.j.v.c
        public void a(ViewParent viewParent, View view) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }

        @Override // android.support.v4.j.v.c
        public void a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
            }
        }

        @Override // android.support.v4.j.v.c
        public void a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }

        @Override // android.support.v4.j.v.c
        public boolean a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
                return false;
            }
        }

        @Override // android.support.v4.j.v.c
        public boolean a(ViewParent viewParent, View view, float f, float f2) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
                return false;
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f555a = new b();
        } else if (Build.VERSION.SDK_INT >= 19) {
            f555a = new a();
        } else {
            f555a = new c();
        }
    }

    public static boolean a(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof n) {
            return ((n) viewParent).a(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        return f555a.a(viewParent, view, view2, i);
    }

    public static void b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof n) {
            ((n) viewParent).b(view, view2, i, i2);
        } else if (i2 != 0) {
        } else {
            f555a.b(viewParent, view, view2, i);
        }
    }

    public static void a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof n) {
            ((n) viewParent).a(view, i);
        } else if (i != 0) {
        } else {
            f555a.a(viewParent, view);
        }
    }

    public static void a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        if (viewParent instanceof n) {
            ((n) viewParent).a(view, i, i2, i3, i4, i5);
        } else if (i5 != 0) {
        } else {
            f555a.a(viewParent, view, i, i2, i3, i4);
        }
    }

    public static void a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof n) {
            ((n) viewParent).a(view, i, i2, iArr, i3);
        } else if (i3 != 0) {
        } else {
            f555a.a(viewParent, view, i, i2, iArr);
        }
    }

    public static boolean a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return f555a.a(viewParent, view, f, f2, z);
    }

    public static boolean a(ViewParent viewParent, View view, float f, float f2) {
        return f555a.a(viewParent, view, f, f2);
    }
}
