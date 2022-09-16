package defpackage;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyke  reason: default package */
/* loaded from: classes6.dex */
public final class dyke implements dymc {
    public final String a;
    public dysl b;
    public final Object c = new Object();
    public final Set<dykb> d = new HashSet();
    public final Executor e;
    public final dyvr f;
    public boolean g;
    public dyjb h;
    public boolean i;
    public final dyju j;
    private final dygo k;
    private final InetSocketAddress l;
    private final String m;
    private final dyel n;
    private boolean o;
    private boolean p;

    public dyke(dyju dyjuVar, InetSocketAddress inetSocketAddress, String str, @dzsi String str2, dyel dyelVar, Executor executor, dyvr dyvrVar) {
        dbsk.t(inetSocketAddress, "address");
        this.l = inetSocketAddress;
        this.k = dygo.a(getClass(), inetSocketAddress.toString());
        this.m = str;
        this.a = dyow.d("cronet", str2);
        this.e = executor;
        this.j = dyjuVar;
        this.f = dyvrVar;
        dyej b = dyel.b();
        b.b(dyop.a, dyiu.PRIVACY_AND_INTEGRITY);
        b.b(dyop.b, dyelVar);
        this.n = b.a();
    }

    final void a() {
        synchronized (this.c) {
            if (!this.g || this.p || this.d.size() != 0) {
                return;
            }
            this.p = true;
            this.b.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(dykb dykbVar, dyjb dyjbVar) {
        synchronized (this.c) {
            if (this.d.remove(dykbVar)) {
                boolean z = true;
                if (dyjbVar.p != dyiy.CANCELLED && dyjbVar.p != dyiy.DEADLINE_EXCEEDED) {
                    z = false;
                }
                dykbVar.p.h(dyjbVar, z, new dyhw());
                a();
            }
        }
    }

    @Override // defpackage.dysm
    public final Runnable c(dysl dyslVar) {
        this.b = dyslVar;
        synchronized (this.c) {
            this.i = true;
        }
        return new dykc(this);
    }

    @Override // defpackage.dylv
    public final /* bridge */ /* synthetic */ dyls d(dyib dyibVar, dyhw dyhwVar, dyet dyetVar) {
        dbsk.t(dyibVar, "method");
        dbsk.t(dyhwVar, "headers");
        String str = dyibVar.b;
        String concat = str.length() != 0 ? "/".concat(str) : new String("/");
        String str2 = this.m;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 8 + String.valueOf(concat).length());
        sb.append("https://");
        sb.append(str2);
        sb.append(concat);
        return new dykd(this, sb.toString(), dyhwVar, dyibVar, dyvi.a(dyetVar, this.n, dyhwVar), dyetVar).a;
    }

    @Override // defpackage.dysm
    public final void e(dyjb dyjbVar) {
        synchronized (this.c) {
            if (this.g) {
                return;
            }
            synchronized (this.c) {
                if (this.o) {
                    return;
                }
                this.o = true;
                this.b.c(dyjbVar);
                synchronized (this.c) {
                    this.g = true;
                    this.h = dyjbVar;
                }
                a();
            }
        }
    }

    @Override // defpackage.dysm
    public final void f(dyjb dyjbVar) {
        ArrayList arrayList;
        e(dyjbVar);
        synchronized (this.c) {
            arrayList = new ArrayList(this.d);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ((dykb) arrayList.get(i)).e(dyjbVar);
        }
        a();
    }

    @Override // defpackage.dygs
    public final dygo k() {
        return this.k;
    }

    @Override // defpackage.dymc
    public final dyel l() {
        return this.n;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.l);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append("(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
