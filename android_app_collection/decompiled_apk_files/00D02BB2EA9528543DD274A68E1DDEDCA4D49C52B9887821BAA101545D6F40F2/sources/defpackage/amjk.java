package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: amjk  reason: default package */
/* loaded from: classes.dex */
public final class amjk {
    public final btnh<amji> a = new amjj();
    public final List<amji> b = dchl.a();
    public final Set<akub> c = dcnm.g();
    public final dzjg<akud> d = new dzjg<>();
    public final Map<dmpn, akud> e = new HashMap();
    private int g = 1;
    public final AtomicInteger f = new AtomicInteger();

    private final int g() {
        int i = this.g;
        if (i == 0) {
            i = 1;
        }
        this.g = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dbsg<amkh> a(amhh amhhVar) {
        akqp akqpVar;
        dbsg<amkh> i;
        amyn.e.a();
        if (amhhVar.g() || amhhVar.s().z().a()) {
            synchronized (this.b) {
                int g = g();
                amkk s = amhhVar.s();
                if (s.i().f()) {
                    alvi a = s.i().a();
                    dbsk.s(a);
                    akqpVar = a.a.a();
                } else {
                    akqpVar = null;
                }
                List<amji> list = this.b;
                amji d = this.a.d();
                int t = amhhVar.t();
                dmpn a2 = amhhVar.s().a();
                int i2 = amhhVar.y() ? 2 : 1;
                d.a = t;
                d.b = a2;
                d.e = i2;
                d.c = g;
                d.d = akqpVar;
                list.add(d);
                i = dbsg.i(new amgx(g));
            }
            return i;
        }
        return dbpy.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i) {
        synchronized (this.b) {
            List<amji> list = this.b;
            amji d = this.a.d();
            d.a = i;
            d.c = -559038737;
            d.b = null;
            d.e = 5;
            d.d = null;
            list.add(d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean c(int i) {
        return this.d.d(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        this.e.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        synchronized (this.b) {
            for (amji amjiVar : this.b) {
                amjiVar.a();
                this.a.h(amjiVar);
            }
            this.b.clear();
        }
        synchronized (this) {
            this.d.clear();
            this.e.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(amkk amkkVar, int i) {
        if (amkkVar.z().a()) {
            synchronized (this.b) {
                int g = g();
                List<amji> list = this.b;
                amji d = this.a.d();
                dmpn a = amkkVar.a();
                d.a = -559038737;
                d.b = a;
                d.e = i;
                d.c = g;
                d.d = null;
                list.add(d);
            }
        }
    }
}
