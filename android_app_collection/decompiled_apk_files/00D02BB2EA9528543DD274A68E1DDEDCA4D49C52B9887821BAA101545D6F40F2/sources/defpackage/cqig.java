package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: cqig  reason: default package */
/* loaded from: classes.dex */
public final class cqig implements cqkd {
    public static final Class<?>[] a;
    public static final Class<?>[] b;
    public static final Class<?>[] c;
    public static final Class<?>[] d;
    private static final Method e;
    private static final Method f;
    private static final Method g;
    private static final aim<Class<? extends View>, cqif<?>> h = new aim<>();
    private final Context i;
    private final cqpr<View> j;

    static {
        try {
            Method declaredMethod = ViewGroup.class.getDeclaredMethod("generateDefaultLayoutParams", new Class[0]);
            e = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = ViewGroup.class.getDeclaredMethod("generateLayoutParams", ViewGroup.LayoutParams.class);
            f = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = ViewGroup.class.getDeclaredMethod("checkLayoutParams", ViewGroup.LayoutParams.class);
            g = declaredMethod3;
            declaredMethod3.setAccessible(true);
            a = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
            b = new Class[]{Context.class, AttributeSet.class, Integer.TYPE};
            c = new Class[]{Context.class, AttributeSet.class};
            d = new Class[]{Context.class};
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        }
    }

    public cqig(Context context, cqpr<View> cqprVar) {
        dbsk.s(context);
        this.i = context;
        this.j = cqprVar;
    }

    private static Object e(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // defpackage.cqkd
    public final Context a(@dzsi Integer num, @dzsi ViewGroup viewGroup) {
        Context context = (viewGroup == null || viewGroup.getContext() == null) ? this.i : viewGroup.getContext();
        return num != null ? new ContextThemeWrapper(context, num.intValue()) : context;
    }

    @Override // defpackage.cqkd
    public final <T extends View> T b(Class<T> cls, int i, int i2, @dzsi Integer num, @dzsi ViewGroup viewGroup, boolean z) {
        cqif<?> cqifVar;
        T t;
        Context a2 = a(num, viewGroup);
        dbsk.s(a2);
        Class<? extends View> cls2 = this.j.a.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        aim<Class<? extends View>, cqif<?>> aimVar = h;
        synchronized (aimVar) {
            cqifVar = aimVar.get(cls);
            if (cqifVar == null) {
                cqifVar = new cqif<>(cls);
                aimVar.put(cls, cqifVar);
            }
        }
        if (i2 != 0) {
            if (cqifVar.a == null) {
                cqifVar.a = (dbsg<Constructor<T>>) cqifVar.a(a);
            }
            if (cqifVar.a.a()) {
                t = (T) cqif.b(cqifVar.a.b(), a2, null, Integer.valueOf(i), Integer.valueOf(i2));
                d(viewGroup, t, z);
                return t;
            }
        }
        if (i != 0) {
            if (cqifVar.b == null) {
                cqifVar.b = (dbsg<Constructor<T>>) cqifVar.a(b);
            }
            if (cqifVar.b.a()) {
                t = (T) cqif.b(cqifVar.b.b(), a2, null, Integer.valueOf(i));
                d(viewGroup, t, z);
                return t;
            }
        }
        if (cqifVar.c == null) {
            cqifVar.c = (dbsg<Constructor<T>>) cqifVar.a(c);
        }
        if (cqifVar.c.a()) {
            t = (T) cqif.b(cqifVar.c.b(), a2, null);
        } else {
            if (cqifVar.d == null) {
                cqifVar.d = (dbsg<Constructor<T>>) cqifVar.a(d);
            }
            if (cqifVar.d.a()) {
                t = (T) cqif.b(cqifVar.d.b(), a2);
            } else {
                String valueOf = String.valueOf(cqifVar.e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                sb.append("Could not create instance of ");
                sb.append(valueOf);
                throw new RuntimeException(sb.toString());
            }
        }
        d(viewGroup, t, z);
        return t;
    }

    @Override // defpackage.cqkd
    public final View c(int i, ViewGroup viewGroup, boolean z) {
        View inflate = LayoutInflater.from(this.i).inflate(i, viewGroup, z);
        return (viewGroup == null || !z) ? inflate : viewGroup.getChildAt(viewGroup.getChildCount() - 1);
    }

    @Override // defpackage.cqkd
    public final void d(@dzsi ViewGroup viewGroup, View view, boolean z) {
        if (viewGroup == null) {
            return;
        }
        if (z) {
            viewGroup.addView(view);
        }
        if (view.getParent() != viewGroup && (view.getParent() instanceof ViewGroup)) {
            viewGroup = (ViewGroup) view.getParent();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = layoutParams == null ? (ViewGroup.LayoutParams) e(e, viewGroup, new Object[0]) : layoutParams;
        if (!((Boolean) e(g, viewGroup, layoutParams2)).booleanValue()) {
            layoutParams2 = (ViewGroup.LayoutParams) e(f, viewGroup, layoutParams2);
        }
        if (layoutParams == layoutParams2) {
            return;
        }
        view.setLayoutParams(layoutParams2);
    }
}
