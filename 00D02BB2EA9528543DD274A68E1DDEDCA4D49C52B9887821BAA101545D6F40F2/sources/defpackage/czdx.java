package defpackage;

import com.google.android.libraries.social.populous.core.AffinityContext;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import java.util.Iterator;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: czdx  reason: default package */
/* loaded from: classes5.dex */
public abstract class czdx implements Iterable<cywi> {
    public volatile czfi a = czfj.a;

    public static czdx n(cyes cyesVar, UUID uuid) {
        czdw t = t();
        t.o(cyesVar);
        ((czey) t).a = uuid;
        return t.a();
    }

    public static czdx o(cyes cyesVar) {
        return n(cyesVar, null);
    }

    public static czdw t() {
        czey czeyVar = new czey();
        czeyVar.e();
        return czeyVar;
    }

    public abstract AffinityContext a();

    public abstract dcdc<cyxj> b();

    public abstract dcdc<cywi> c();

    public abstract dcet<String, InAppNotificationTarget> d();

    public abstract long e();

    public abstract long f();

    public abstract long g();

    public abstract cyes h();

    public abstract boolean i();

    @Override // java.lang.Iterable
    public final Iterator<cywi> iterator() {
        return c().listIterator();
    }

    public abstract dcdn<cygg, cywi> j();

    public abstract dcdn<String, cywi> k();

    public abstract boolean l();

    @dzsi
    public abstract UUID m();

    public final boolean p() {
        long currentTimeMillis = System.currentTimeMillis();
        if (!q()) {
            return currentTimeMillis - e() < (dybx.c() ? dybx.a.a().c() : f());
        }
        return false;
    }

    public final boolean q() {
        return r() >= 0 && System.currentTimeMillis() - e() >= r();
    }

    public final long r() {
        return dybx.c() ? dybx.a.a().b() : g();
    }

    public final boolean s(czdx czdxVar) {
        int u = u();
        int i = u - 1;
        if (u != 0) {
            int u2 = czdxVar.u();
            int i2 = u2 - 1;
            if (u2 == 0) {
                throw null;
            }
            return (!c().isEmpty() || !czdxVar.c().isEmpty()) ? i >= i2 ? p() || !czdxVar.p() : p() && !czdxVar.p() : e() > czdxVar.e();
        }
        throw null;
    }

    public abstract int u();
}
