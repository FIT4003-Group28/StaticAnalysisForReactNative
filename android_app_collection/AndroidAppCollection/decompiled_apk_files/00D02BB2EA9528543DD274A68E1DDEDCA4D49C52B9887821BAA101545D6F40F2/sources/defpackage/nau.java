package defpackage;

import android.view.View;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: nau  reason: default package */
/* loaded from: classes7.dex */
public final class nau extends nor {
    public final noo a;
    public final lzf b;
    public final ldm c;
    public final nce d;
    public final dcdc<ldm> e;
    public final nbp f;
    private final not g;
    private final cjsz h;
    private final ncb i;
    private final cqkf<nbv> j;
    private final kxs k;
    private final nbz l;

    public nau(cqkj cqkjVar, not notVar, kxu kxuVar, btvo btvoVar, jzp jzpVar, btrm btrmVar, bvsl bvslVar, cjqy cjqyVar, cjqq cjqqVar, noo nooVar, lzf lzfVar, ldm ldmVar, dcdc dcdcVar, nce nceVar, nbp nbpVar, kcv kcvVar, Executor executor) {
        super(cjqyVar, cjqqVar);
        this.h = new cjsz(dtxm.dx);
        nat natVar = new nat(this);
        this.l = natVar;
        this.g = notVar;
        this.a = nooVar;
        this.b = lzfVar;
        this.c = ldmVar;
        this.e = dcdcVar;
        this.d = nceVar;
        this.f = nbpVar;
        cqkf<nbv> d = cqkjVar.d(new nbm(true), notVar.a(), false);
        this.j = d;
        this.i = new ncb(btvoVar, natVar, nceVar, true, jzpVar, false, bvslVar, cqkjVar.d, kcvVar, cjqyVar, v(), btrmVar, executor);
        View c = d.c();
        kxn k = kxo.k();
        k.k();
        this.k = new kxs(c, k, kxuVar);
    }

    @Override // defpackage.nor, defpackage.non
    public final void a() {
        this.i.k();
    }

    @Override // defpackage.non
    public final noq b() {
        s(this.h);
        this.j.e(this.i);
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
        this.j.e(null);
    }

    @Override // defpackage.nor, defpackage.non
    public final void f() {
        this.i.l();
    }

    @Override // defpackage.non
    public final String g() {
        return "RouteDisplayOverlay";
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.g.b(noeVar, d());
    }
}
