package defpackage;

import android.content.Intent;
import com.google.android.apps.gmm.util.systemhealth.impl.SystemHealthService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
/* renamed from: ckpt  reason: default package */
/* loaded from: classes.dex */
public final class ckpt implements ckoy {
    public final ckpa a;
    public final ckow b;
    private final int e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final ckmm j;
    private final ckpr k;
    @dzsi
    private crzb m;
    public final List<eacl> c = new ArrayList();
    private final List<Integer> l = new ArrayList();
    public boolean d = true;
    private boolean n = false;
    private int o = ckoz.a(1);
    private int p = ckpb.a(1);

    public ckpt(ckpa ckpaVar, dszg dszgVar, ckow ckowVar, boolean z, boolean z2, boolean z3, boolean z4, ckmm ckmmVar, dzsj<ckov> dzsjVar) {
        this.a = ckpaVar;
        this.b = ckowVar;
        this.h = z;
        this.f = z2;
        this.g = z3;
        this.i = z4;
        this.e = dszgVar.a();
        this.j = ckmmVar;
        this.k = (ckpr) dzsjVar.a();
    }

    private final dzze e() {
        eaci bZ = eacm.h.bZ();
        int i = this.o;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eacm eacmVar = (eacm) bZ.b;
        int i2 = eacmVar.a | 1;
        eacmVar.a = i2;
        eacmVar.b = i;
        int i3 = this.p;
        int i4 = i2 | 2;
        eacmVar.a = i4;
        eacmVar.c = i3;
        int i5 = this.e;
        eacmVar.a = i4 | 4;
        eacmVar.d = i5;
        if (!this.c.isEmpty()) {
            List<eacl> list = this.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eacm eacmVar2 = (eacm) bZ.b;
            dsrj<eacl> dsrjVar = eacmVar2.e;
            if (!dsrjVar.a()) {
                eacmVar2.e = dsqw.cl(dsrjVar);
            }
            dsod.bv(list, eacmVar2.e);
        }
        if (!this.l.isEmpty()) {
            List<Integer> list2 = this.l;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eacm eacmVar3 = (eacm) bZ.b;
            dsrf dsrfVar = eacmVar3.f;
            if (!dsrfVar.a()) {
                eacmVar3.f = dsqw.cg(dsrfVar);
            }
            dsod.bv(list2, eacmVar3.f);
        }
        dzzb bZ2 = dzzc.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dzzc dzzcVar = (dzzc) bZ2.b;
        eacm bK = bZ.bK();
        bK.getClass();
        dzzcVar.b = bK;
        dzzcVar.a |= 4;
        dzzd dzzdVar = (dzzd) dzze.a.bZ();
        dzzdVar.k(dzzc.d, bZ2.bK());
        return (dzze) dzzdVar.bK();
    }

    private final void f() {
        this.o = ckoz.a(1);
        this.p = ckpb.a(1);
        this.l.clear();
        this.c.clear();
    }

    @Override // defpackage.ckoy
    public final synchronized void a() {
        if (!this.n) {
            return;
        }
        if (this.g) {
            this.j.r(this.a.bo);
        }
        if (this.f) {
            this.j.k(this.a.bp);
        }
        if (this.h) {
            this.j.n(this.a.bp);
        }
        if (this.i) {
            this.j.v(this.a.bp);
        }
        f();
        this.n = false;
    }

    @Override // defpackage.ckoy
    public final synchronized void b(@dzsi int i) {
        crzb bvrhVar;
        if (this.n) {
            return;
        }
        ckpr ckprVar = this.k;
        try {
            if (!ckprVar.l) {
                ckprVar.i.startService(new Intent(ckprVar.i, SystemHealthService.class));
                ckprVar.l = true;
            }
            Iterator<ckoy> it = ckprVar.a.values().iterator();
            while (it.hasNext()) {
                ckpt ckptVar = (ckpt) it.next();
                ckptVar.d(this.a);
                d(ckptVar.a);
            }
            ckprVar.a.put(this.a, this);
        } catch (Exception unused) {
            ((ckco) ckprVar.j.a(ckip.M)).a(this.a.bs);
            ckprVar.l = false;
        }
        if (!this.b.a()) {
            if (!ckprVar.l) {
                return;
            }
            if (i != 0) {
                this.o = ckoz.a(i);
            }
            bvrj a = bvrj.a();
            if (a != null) {
                bvrhVar = new bvqe(a);
            } else {
                bvrhVar = new bvrh(Thread.currentThread().getId());
            }
            this.m = bvrhVar;
            if (this.g) {
                this.j.q(this.a.bo);
            }
            if (this.f) {
                this.j.i(this.a.bp);
                this.j.f(this.a.bq, e());
            }
            if (this.h) {
                this.j.l(this.a.bp);
            }
            if (this.i) {
                this.j.s(this.a.bp);
            }
            if (!bvrj.UI_THREAD.b() && this.d) {
                this.d = false;
            }
            this.n = true;
            return;
        }
        throw null;
    }

    @Override // defpackage.ckoy
    public final synchronized void c(@dzsi int i) {
        ConcurrentMap<ckow, List<ckoy>> concurrentMap;
        List<ckoy> list;
        if (!this.n) {
            return;
        }
        if (i != 0) {
            this.p = ckpb.a(i);
        }
        dbsk.s(this.m);
        if (!this.m.c()) {
            a();
            return;
        }
        dzze e = e();
        if (this.g) {
            this.j.o(this.a.bo, e);
        }
        if (this.f) {
            this.j.j(this.a.bp, e);
            this.j.f(this.a.br, e);
        }
        if (this.h) {
            this.j.m(this.a.bp, e);
        }
        if (this.i) {
            this.j.u(this.a.bp, e);
        }
        ckpr ckprVar = this.k;
        ckprVar.a.remove(this.a);
        ckow ckowVar = this.b;
        if (ckowVar.a() && (concurrentMap = ckprVar.b.get(null)) != null && (list = concurrentMap.get(ckowVar)) != null) {
            list.remove(this);
        }
        f();
        this.n = false;
    }

    final void d(ckpa ckpaVar) {
        this.l.add(Integer.valueOf(ckpaVar.bs));
    }
}
