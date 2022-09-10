package defpackage;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: alrk  reason: default package */
/* loaded from: classes.dex */
public class alrk implements also {
    private static final dcqe g = dcqe.c("alrk");
    final Map<Long, alow> a = dcjz.d();
    public final AtomicInteger b = new AtomicInteger();
    public final String c;
    public final int d;
    protected final alrv e;
    private final boolean f;

    public alrk(alrv alrvVar, String str, int i, boolean z) {
        this.e = alrvVar;
        this.c = str;
        this.d = i;
        this.f = z;
    }

    @dzsi
    private final alow k(long j) {
        synchronized (this.a) {
            Map<Long, alow> map = this.a;
            Long valueOf = Long.valueOf(j);
            if (!map.containsKey(valueOf)) {
                return null;
            }
            alow alowVar = this.a.get(valueOf);
            if (alowVar == null) {
                bvoo.h("namespaceStyles contains a key mapped to a null style.", new Object[0]);
            }
            return alowVar;
        }
    }

    @Override // defpackage.akvx
    public akuh a(long j) {
        alow k = k(j);
        return k == null ? alrv.c : k;
    }

    @Override // defpackage.akvx
    public final aktg b(dmqx dmqxVar) {
        alls allsVar = new alls(this.e, this, dmqxVar, this.b.getAndIncrement());
        this.e.s(allsVar, false);
        synchronized (this.a) {
            this.a.put(Long.valueOf(allsVar.a()), allsVar);
        }
        return allsVar;
    }

    @Override // defpackage.akvx
    public final akuh c(Bitmap bitmap) {
        int andIncrement = this.b.getAndIncrement();
        alxn m = alxo.m(andIncrement);
        m.p = new alwe(bitmap);
        return j(m.a(), andIncrement, dcmr.a);
    }

    @Override // defpackage.akvx
    public final void d(akuh akuhVar) {
        if (akuhVar instanceof alow) {
            alow alowVar = (alow) akuhVar;
            alrk alrkVar = alowVar.d;
            dbsk.j(alrkVar == this, "[%s] was told to destroy a style from namespace [%s]", this.c, alrkVar.c);
            synchronized (this.a) {
                Map<Long, alow> map = this.a;
                Long valueOf = Long.valueOf(alowVar.a());
                if (map.containsKey(valueOf)) {
                    this.a.remove(valueOf);
                    alowVar.h();
                }
            }
        }
    }

    @Override // defpackage.akvx
    public final int e() {
        return this.d;
    }

    @Override // defpackage.alxa
    public final alxp f(long j) {
        alrv alrvVar = this.e;
        if (alrvVar != null) {
            return alrvVar.p(j);
        }
        return alxp.e;
    }

    @Override // defpackage.alxa
    public final alxp g(int i) {
        return i(i);
    }

    @Override // defpackage.alxa
    public final alxp h(int i) {
        alrv alrvVar = this.e;
        if (alrvVar != null) {
            return alrvVar.o(i, alrvVar.x());
        }
        return alxp.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public alxp i(long j) {
        alow k = k(j);
        if (k == null) {
            return alxp.e;
        }
        return k.i();
    }

    public final alow j(alxo alxoVar, int i, dcep<amgj> dcepVar) {
        alow alowVar = new alow(this, alxp.b(alxoVar, this.f), i, dcepVar);
        synchronized (this.a) {
            this.a.put(Long.valueOf(alowVar.f), alowVar);
        }
        return alowVar;
    }
}
