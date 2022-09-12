package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dxjc  reason: default package */
/* loaded from: classes.dex */
public final class dxjc<T> implements dzsj, dxio {
    private static final Object a = new Object();
    private volatile dzsj<T> b;
    private volatile Object c = a;

    private dxjc(dzsj<T> dzsjVar) {
        this.b = dzsjVar;
    }

    public static <P extends dzsj<T>, T> dzsj<T> b(P p) {
        dxjg.b(p);
        return p instanceof dxjc ? p : new dxjc(p);
    }

    public static <P extends dzsj<T>, T> dxio<T> c(P p) {
        if (p instanceof dxio) {
            return (dxio) p;
        }
        dxjg.b(p);
        return new dxjc(p);
    }

    public static void d(Object obj, Object obj2) {
        if (obj == a || (obj instanceof dxjf) || obj == obj2) {
            return;
        }
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowActionBarOverlay + String.valueOf(valueOf2).length());
        sb.append("Scoped provider was invoked recursively returning different results: ");
        sb.append(valueOf);
        sb.append(" & ");
        sb.append(valueOf2);
        sb.append(". This is likely due to a circular dependency.");
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.dzsj
    public final T a() {
        T t = (T) this.c;
        Object obj = a;
        if (t == obj) {
            synchronized (this) {
                t = this.c;
                if (t == obj) {
                    t = this.b.a();
                    d(this.c, t);
                    this.c = t;
                    this.b = null;
                }
            }
        }
        return t;
    }
}
