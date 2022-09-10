package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: bvyg  reason: default package */
/* loaded from: classes4.dex */
public final class bvyg implements bvwu {
    private final bvye a;
    private final bvyk b;
    private final bvyz c;

    public bvyg(bvye bvyeVar, bvyk bvykVar, bvyz bvyzVar) {
        this.a = bvyeVar;
        this.b = bvykVar;
        this.c = bvyzVar;
    }

    @Override // defpackage.bvwu
    public final void a() {
        bvye bvyeVar = this.a;
        btrm btrmVar = bvyeVar.a;
        dceq a = dcet.a();
        a.b(cjnw.class, new bvyf(cjnw.class, bvyeVar));
        btrmVar.g(bvyeVar, a.a());
    }

    @Override // defpackage.bvwu
    public final void b() {
        bvyk bvykVar = this.b;
        bvrj.UI_THREAD.c();
        bvykVar.i = true;
        alax b = bvykVar.b();
        if (b != null) {
            b.a();
        }
        if (bvykVar.g != null) {
            bvykVar.c();
        }
    }

    @Override // defpackage.bvwu
    public final void c() {
        bvyk bvykVar = this.b;
        bvrj.UI_THREAD.c();
        bvykVar.i = false;
        alax b = bvykVar.b();
        if (b != null) {
            b.b();
        }
    }

    @Override // defpackage.bvwu
    public final void d() {
        bvye bvyeVar = this.a;
        bvyeVar.a.a(bvyeVar);
        bvyk bvykVar = this.b;
        bvrj.UI_THREAD.c();
        bvykVar.a();
        bvrj.UI_THREAD.c();
        Iterator<aloo> it = bvykVar.h.iterator();
        while (it.hasNext()) {
            aloo next = it.next();
            alop m = bvykVar.a.aj().aF().m();
            if (next != null) {
                m.a.k(null);
            }
        }
        bvykVar.g = null;
        dcdc<bvwh> dcdcVar = this.c.d;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).b();
        }
    }
}
