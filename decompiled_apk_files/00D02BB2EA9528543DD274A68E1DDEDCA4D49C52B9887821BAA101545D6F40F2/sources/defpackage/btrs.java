package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: btrs  reason: default package */
/* loaded from: classes.dex */
public class btrs {
    private final Object a;
    public final bvrj b;
    public boolean c = false;
    @dzsi
    private final Method d;
    private final String e;

    public btrs(Object obj, bvrj bvrjVar) {
        dbsk.t(obj, "GmmEventHandler target cannot be null.");
        this.a = obj;
        this.d = null;
        this.b = bvrjVar;
        StringBuilder sb = new StringBuilder(64);
        sb.append("{target:{");
        sb.append(obj.getClass().getName());
        sb.append("@");
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("},threadTag:{");
        sb.append(bvrjVar);
        sb.append("}}");
        this.e = sb.toString();
    }

    protected void a(Object obj) {
        throw new NullPointerException(String.format("Cannot deliver %s to object of type %s", obj.getClass().getCanonicalName(), this.a.getClass().getCanonicalName()));
    }

    public Class<?> d() {
        throw null;
    }

    public final synchronized void e(Object obj) {
        dbsk.s(obj);
        try {
            a(obj);
        } catch (IllegalAccessException e) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Method became inaccessible: ");
            sb.append(valueOf);
            throw new Error(sb.toString(), e);
        } catch (IllegalArgumentException e2) {
            String valueOf2 = String.valueOf(this.a);
            String valueOf3 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder("null".length() + 37 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
            sb2.append("Method rejected target/argument: ");
            sb2.append("null");
            sb2.append(", ");
            sb2.append(valueOf2);
            sb2.append(", ");
            sb2.append(valueOf3);
            throw new Error(sb2.toString(), e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof Error) {
                throw ((Error) e3.getCause());
            }
            throw e3;
        }
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof btrs) {
            btrs btrsVar = (btrs) obj;
            if (this.a == btrsVar.a) {
                Method method = btrsVar.d;
                if (dbsd.a(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a) + 961;
    }

    public final String toString() {
        return this.e;
    }
}
