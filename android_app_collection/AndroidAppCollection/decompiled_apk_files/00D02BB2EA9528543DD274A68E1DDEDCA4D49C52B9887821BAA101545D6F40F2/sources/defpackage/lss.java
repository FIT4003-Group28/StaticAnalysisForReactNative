package defpackage;

import android.view.View;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: lss  reason: default package */
/* loaded from: classes7.dex */
public final class lss extends nor {
    public final noo a;
    public boolean b;
    private final kdg c;
    private final atcw d;
    private final nce e;
    private final lxf f;
    private final cjsz g;
    private final not h;
    private final ncb i;
    private final cqkf<nbv> j;
    private final kxs k;

    public lss(btvo btvoVar, bvsl bvslVar, cjqy cjqyVar, cjqq cjqqVar, btrm btrmVar, cqkj cqkjVar, jzp jzpVar, kdg kdgVar, noo nooVar, atcw atcwVar, nce nceVar, lxf lxfVar, lji ljiVar, not notVar, kxu kxuVar, kcv kcvVar, Executor executor) {
        super(cjqyVar, cjqqVar);
        this.g = new cjsz(dtxm.ck);
        this.b = true;
        this.c = kdgVar;
        this.a = nooVar;
        this.d = atcwVar;
        this.e = nceVar;
        this.f = lxfVar;
        this.h = notVar;
        this.i = new ncb(btvoVar, new lsr(this, nooVar, ljiVar), nceVar, true, jzpVar, true, bvslVar, cqkjVar.d, kcvVar, cjqyVar, v(), btrmVar, executor);
        cqkf<nbv> d = cqkjVar.d(new nbm(false), notVar.a(), false);
        this.j = d;
        View c = d.c();
        kxn k = kxo.k();
        k.k();
        this.k = new kxs(c, k, kxuVar);
    }

    @Override // defpackage.nor, defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    @Override // defpackage.nor, defpackage.non
    public final void a() {
        this.i.k();
        this.j.e(this.i);
    }

    @Override // defpackage.non
    public final noq b() {
        this.c.d(this);
        this.f.k(true, this.e);
        s(this.g);
        this.d.z();
        this.k.a();
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        return this.j.c();
    }

    @Override // defpackage.nor, defpackage.non
    public final void e() {
        this.k.b();
        t();
        this.f.k(false, null);
        this.c.e(this);
        if (this.b) {
            this.d.F();
        }
        this.d.x();
        this.d.v();
    }

    @Override // defpackage.nor, defpackage.non
    public final void f() {
        this.i.l();
        this.j.e(null);
        if (!this.b) {
            this.d.F();
        }
    }

    @Override // defpackage.non
    public final String g() {
        return "GuidanceRouteSelectOverlay";
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.h.b(noeVar, this.j.c());
    }
}
