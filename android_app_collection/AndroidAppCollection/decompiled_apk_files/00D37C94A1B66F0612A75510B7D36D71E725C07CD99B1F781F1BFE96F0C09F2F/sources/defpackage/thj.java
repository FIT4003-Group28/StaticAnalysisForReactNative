package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: thj  reason: default package */
/* loaded from: classes4.dex */
public final class thj implements tff {
    public final int f;
    public final String g;
    public final thu i;
    public final ajiy k;
    private final Executor l;
    public final Object b = new Object();
    public final ths c = new ths();
    public final ths d = new ths();
    public final ths e = new ths();
    public final List h = new ArrayList();
    public final AtomicReference j = new AtomicReference();

    public thj(String str, int i, thu thuVar, Executor executor, ajiy ajiyVar) {
        this.f = i;
        this.l = executor;
        this.k = ajiyVar;
        this.i = thuVar;
        this.g = str;
    }

    @Override // defpackage.tff
    public final void a() {
        synchronized (this.b) {
            this.c.b();
            this.d.b();
            this.e.b();
            this.h.clear();
        }
    }

    @Override // defpackage.tff
    public final void b() {
        this.d.c();
    }

    @Override // defpackage.tff
    public final void c() {
        this.c.c();
    }

    @Override // defpackage.tff
    public final void d() {
        this.e.c();
    }

    @Override // defpackage.tff
    public final synchronized void e(boolean z) {
        if (z) {
            a();
        } else {
            this.l.execute(new Runnable() { // from class: thh
                @Override // java.lang.Runnable
                public final void run() {
                    amvn r;
                    int i;
                    amuk o;
                    thj thjVar = thj.this;
                    String str = (String) thjVar.j.get();
                    tho a = thp.a();
                    if (str != null) {
                        r = amvn.r(str);
                    } else {
                        r = amyg.a;
                    }
                    a.c(r);
                    if (thjVar.k.a(thq.COMPONENT_MATERIALIZATION)) {
                        List a2 = thjVar.c.a(thq.COMPONENT_MATERIALIZATION.m, a);
                        if (a2.isEmpty()) {
                            return;
                        }
                        ((thn) a2.get(0)).d = Integer.valueOf(thjVar.f);
                        i = thjVar.i.f(thjVar.g, ((thn) a2.get(0)).a());
                    } else {
                        i = -1;
                    }
                    if (thjVar.k.a(thq.TEMPLATE_FETCHING)) {
                        thjVar.k(thjVar.d.a(thq.TEMPLATE_FETCHING.m, a), i);
                    }
                    if (thjVar.k.a(thq.TEMPLATE_RESOLUTION)) {
                        thjVar.k(thjVar.e.a(thq.TEMPLATE_RESOLUTION.m, a), i);
                    }
                    if (thjVar.k.a(thq.PB_TO_FB)) {
                        synchronized (thjVar.b) {
                            o = !thjVar.h.isEmpty() ? amuk.o(thjVar.h) : null;
                        }
                        if (o == null) {
                            return;
                        }
                        ArrayList arrayList = new ArrayList(o.size());
                        int size = o.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            thi thiVar = (thi) o.get(i2);
                            thn a3 = thr.a();
                            a3.b(thq.PB_TO_FB.m);
                            a3.c = Long.valueOf(thiVar.a);
                            a.h = thiVar.b;
                            a3.e = a.a();
                            arrayList.add(a3);
                        }
                        thjVar.k(arrayList, i);
                    }
                }
            });
        }
    }

    @Override // defpackage.tff
    public final void f(long j) {
        synchronized (this.b) {
            this.h.add(new thi(j, thl.a(), null));
        }
    }

    @Override // defpackage.tff
    public final void g(String str) {
        if (str != null) {
            this.j.compareAndSet(null, str);
        }
    }

    @Override // defpackage.tff
    public final void h() {
        this.d.d();
    }

    @Override // defpackage.tff
    public final void i() {
        this.c.d();
    }

    @Override // defpackage.tff
    public final void j() {
        this.e.d();
    }

    public final void k(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            thn thnVar = (thn) it.next();
            thnVar.d = Integer.valueOf(i);
            this.i.f(this.g, thnVar.a());
        }
    }
}
