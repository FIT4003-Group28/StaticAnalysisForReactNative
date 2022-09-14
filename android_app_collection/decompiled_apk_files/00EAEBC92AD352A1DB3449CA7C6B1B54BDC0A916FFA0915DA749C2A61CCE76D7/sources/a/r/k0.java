package a.r;

import android.animation.LayoutTransition;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
class k0 {

    /* renamed from: a  reason: collision with root package name */
    private static LayoutTransition f649a;

    /* renamed from: b  reason: collision with root package name */
    private static Field f650b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f651c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f652d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f653e;

    /* loaded from: classes.dex */
    static class a extends LayoutTransition {
        a() {
        }

        @Override // android.animation.LayoutTransition
        public boolean isChangingLayout() {
            return true;
        }
    }

    private static void a(LayoutTransition layoutTransition) {
        if (!f653e) {
            try {
                f652d = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f652d.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            }
            f653e = true;
        }
        Method method = f652d;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException unused2) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            } catch (InvocationTargetException unused3) {
                Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.view.ViewGroup r5, boolean r6) {
        /*
            android.animation.LayoutTransition r0 = a.r.k0.f649a
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L2a
            a.r.k0$a r0 = new a.r.k0$a
            r0.<init>()
            a.r.k0.f649a = r0
            android.animation.LayoutTransition r0 = a.r.k0.f649a
            r4 = 2
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = a.r.k0.f649a
            r0.setAnimator(r2, r3)
            android.animation.LayoutTransition r0 = a.r.k0.f649a
            r0.setAnimator(r1, r3)
            android.animation.LayoutTransition r0 = a.r.k0.f649a
            r4 = 3
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = a.r.k0.f649a
            r4 = 4
            r0.setAnimator(r4, r3)
        L2a:
            if (r6 == 0) goto L4a
            android.animation.LayoutTransition r6 = r5.getLayoutTransition()
            if (r6 == 0) goto L44
            boolean r0 = r6.isRunning()
            if (r0 == 0) goto L3b
            a(r6)
        L3b:
            android.animation.LayoutTransition r0 = a.r.k0.f649a
            if (r6 == r0) goto L44
            int r0 = a.r.s.transition_layout_save
            r5.setTag(r0, r6)
        L44:
            android.animation.LayoutTransition r6 = a.r.k0.f649a
        L46:
            r5.setLayoutTransition(r6)
            goto L98
        L4a:
            r5.setLayoutTransition(r3)
            boolean r6 = a.r.k0.f651c
            java.lang.String r0 = "ViewGroupUtilsApi14"
            if (r6 != 0) goto L6a
            java.lang.Class<android.view.ViewGroup> r6 = android.view.ViewGroup.class
            java.lang.String r4 = "mLayoutSuppressed"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L63
            a.r.k0.f650b = r6     // Catch: java.lang.NoSuchFieldException -> L63
            java.lang.reflect.Field r6 = a.r.k0.f650b     // Catch: java.lang.NoSuchFieldException -> L63
            r6.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L63
            goto L68
        L63:
            java.lang.String r6 = "Failed to access mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
        L68:
            a.r.k0.f651c = r1
        L6a:
            java.lang.reflect.Field r6 = a.r.k0.f650b
            if (r6 == 0) goto L83
            boolean r6 = r6.getBoolean(r5)     // Catch: java.lang.IllegalAccessException -> L7e
            if (r6 == 0) goto L7c
            java.lang.reflect.Field r1 = a.r.k0.f650b     // Catch: java.lang.IllegalAccessException -> L7a
            r1.setBoolean(r5, r2)     // Catch: java.lang.IllegalAccessException -> L7a
            goto L7c
        L7a:
            r2 = r6
            goto L7e
        L7c:
            r2 = r6
            goto L83
        L7e:
            java.lang.String r6 = "Failed to get mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
        L83:
            if (r2 == 0) goto L88
            r5.requestLayout()
        L88:
            int r6 = a.r.s.transition_layout_save
            java.lang.Object r6 = r5.getTag(r6)
            android.animation.LayoutTransition r6 = (android.animation.LayoutTransition) r6
            if (r6 == 0) goto L98
            int r0 = a.r.s.transition_layout_save
            r5.setTag(r0, r3)
            goto L46
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.r.k0.a(android.view.ViewGroup, boolean):void");
    }
}
