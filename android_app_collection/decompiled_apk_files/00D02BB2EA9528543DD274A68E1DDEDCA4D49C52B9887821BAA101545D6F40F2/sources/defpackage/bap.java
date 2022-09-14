package defpackage;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: bap  reason: default package */
/* loaded from: classes3.dex */
public abstract class bap {
    final aim<String, Method> a;
    final aim<String, Method> b;
    final aim<String, Class<?>> c;

    public bap(aim<String, Method> aimVar, aim<String, Method> aimVar2, aim<String, Class<?>> aimVar3) {
        this.a = aimVar;
        this.b = aimVar2;
        this.c = aimVar3;
    }

    private final Class<?> E(Class<?> cls) {
        Class<?> cls2 = this.c.get(cls.getName());
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.c.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final void A(bar barVar) {
        if (barVar != null) {
            try {
                f(E(barVar.getClass()).getName());
                bap b = b();
                try {
                    Class<?> cls = barVar.getClass();
                    Method method = this.b.get(cls.getName());
                    if (method == null) {
                        method = E(cls).getDeclaredMethod("write", cls, bap.class);
                        this.b.put(cls.getName(), method);
                    }
                    method.invoke(null, barVar, b);
                    b.a();
                    return;
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException(e3);
                } catch (InvocationTargetException e4) {
                    Throwable cause = e4.getCause();
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    }
                    if (cause instanceof Error) {
                        throw ((Error) cause);
                    }
                    throw new RuntimeException(e4);
                }
            } catch (ClassNotFoundException e5) {
                throw new RuntimeException(barVar.getClass().getSimpleName() + " does not have a Parcelizer", e5);
            }
        }
        f(null);
    }

    public final <T extends bar> T B() {
        String j = j();
        if (j == null) {
            return null;
        }
        bap b = b();
        try {
            Method method = this.a.get(j);
            if (method == null) {
                method = Class.forName(j, true, bap.class.getClassLoader()).getDeclaredMethod("read", bap.class);
                this.a.put(j, method);
            }
            return (T) method.invoke(null, b);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(e4);
        }
    }

    public final <T extends bar> T C(T t) {
        return !o(1) ? t : (T) B();
    }

    public final void D(bar barVar) {
        p(1);
        A(barVar);
    }

    protected abstract void a();

    protected abstract bap b();

    public abstract void c(byte[] bArr);

    protected abstract void d(CharSequence charSequence);

    protected abstract void e(int i);

    protected abstract void f(String str);

    protected abstract void g(Parcelable parcelable);

    protected abstract void h(boolean z);

    protected abstract int i();

    protected abstract String j();

    public abstract byte[] k();

    protected abstract CharSequence l();

    protected abstract <T extends Parcelable> T m();

    protected abstract boolean n();

    public abstract boolean o(int i);

    public abstract void p(int i);

    public final void q(boolean z, int i) {
        p(i);
        h(z);
    }

    public final void r(CharSequence charSequence, int i) {
        p(i);
        d(charSequence);
    }

    public final void s(int i, int i2) {
        p(i2);
        e(i);
    }

    public final void t(String str, int i) {
        p(i);
        f(str);
    }

    public final void u(Parcelable parcelable, int i) {
        p(i);
        g(parcelable);
    }

    public final boolean v(boolean z, int i) {
        return !o(i) ? z : n();
    }

    public final int w(int i, int i2) {
        return !o(i2) ? i : i();
    }

    public final String x(String str, int i) {
        return !o(i) ? str : j();
    }

    public final <T extends Parcelable> T y(T t, int i) {
        return !o(i) ? t : (T) m();
    }

    public final CharSequence z(CharSequence charSequence, int i) {
        return !o(i) ? charSequence : l();
    }
}
