package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: fbr  reason: default package */
/* loaded from: classes3.dex */
public final class fbr implements ynl {
    public final snc a;
    public final ScheduledExecutorService b;
    public final Executor c;
    private final yni g;
    private final Set h = Collections.newSetFromMap(new WeakHashMap());
    public final Map d = new HashMap();
    public final Map e = new HashMap();
    public final Map f = new HashMap();

    public fbr(snc sncVar, yni yniVar, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.a = sncVar;
        this.g = yniVar;
        this.b = scheduledExecutorService;
        this.c = executor;
    }

    public final void a(fbq fbqVar) {
        if (this.h.isEmpty()) {
            this.g.g(this);
        }
        this.h.add(fbqVar);
    }

    public final void b(fbq fbqVar) {
        this.h.remove(fbqVar);
        if (this.h.isEmpty()) {
            this.g.m(this);
        }
    }

    public final void c(agog agogVar) {
        this.d.put(agogVar.a.m(), Long.valueOf(this.a.c()));
        for (fbq fbqVar : this.h) {
            fbqVar.a(agogVar);
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                agog agogVar = (agog) obj;
                ylr.c();
                final String m = agogVar.a.m();
                long longValue = this.d.containsKey(m) ? ((Long) this.d.get(m)).longValue() : 0L;
                long c = this.a.c();
                long j = c - longValue > 500 ? 0L : (longValue + 500) - c;
                if (j == 0) {
                    c(agogVar);
                    return null;
                }
                this.f.put(m, agogVar);
                if (this.e.containsKey(m)) {
                    return null;
                }
                ankt s = anlz.s(new aniq() { // from class: fbo
                    @Override // defpackage.aniq
                    public final ankt a() {
                        fbr fbrVar = fbr.this;
                        agog agogVar2 = (agog) fbrVar.f.remove(m);
                        agogVar2.getClass();
                        return anlz.q(agogVar2);
                    }
                }, j, TimeUnit.MILLISECONDS, this.b);
                anlz.A(s, new fbp(this, m), this.c);
                this.e.put(m, s);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{agog.class};
    }
}
