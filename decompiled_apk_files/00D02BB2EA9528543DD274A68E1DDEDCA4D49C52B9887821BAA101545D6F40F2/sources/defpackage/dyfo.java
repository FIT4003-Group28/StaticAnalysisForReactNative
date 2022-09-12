package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dyfo  reason: default package */
/* loaded from: classes6.dex */
public final class dyfo {
    static final Logger a = Logger.getLogger(dyfo.class.getName());
    public static final dyfo b = new dyfo();

    private dyfo() {
    }

    public static dyfo a() {
        dyfo c = dyfm.a.c();
        return c == null ? b : c;
    }

    static <T> void h(T t, Object obj) {
        if (t != null) {
            return;
        }
        throw new NullPointerException((String) obj);
    }

    public dyfo b() {
        dyfo a2 = dyfm.a.a(this);
        return a2 == null ? b : a2;
    }

    public void c(dyfo dyfoVar) {
        h(dyfoVar, "toAttach");
        dyfm.a.b(this, dyfoVar);
    }

    public boolean d() {
        return false;
    }

    public Throwable e() {
        return null;
    }

    public dyfr f() {
        return null;
    }

    public void g(dylp dylpVar, Executor executor) {
        h(dylpVar, "cancellationListener");
        h(executor, "executor");
    }

    public void i() {
    }
}
