package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ncb  reason: default package */
/* loaded from: classes7.dex */
public class ncb implements nbv {
    private static final dcqe i = dcqe.c("ncb");
    public final nbz a;
    public final nce b;
    public final nas[] c;
    public final Context d;
    public final kcv e;
    public final cjqy f;
    @dzsi
    public cjqp g;
    private final boolean j;
    private final jzp k;
    private final btrm l;
    public final nar h = new nbx(this);
    private final ncd m = new nby(this);
    private final nca n = new nca(this);

    public ncb(btvo btvoVar, nbz nbzVar, nce nceVar, boolean z, jzp jzpVar, boolean z2, bvsl bvslVar, Context context, kcv kcvVar, cjqy cjqyVar, dehn<cjqp> dehnVar, btrm btrmVar, Executor executor) {
        dbsk.s(nbzVar);
        this.a = nbzVar;
        dbsk.s(nceVar);
        this.b = nceVar;
        this.j = z;
        this.k = jzpVar;
        dbsk.s(context);
        this.d = context;
        dbsk.s(kcvVar);
        this.e = kcvVar;
        dbsk.s(cjqyVar);
        this.f = cjqyVar;
        deha.q(dehnVar, new nbw(this), executor);
        dbsk.s(btrmVar);
        this.l = btrmVar;
        this.c = new nas[3];
        for (int i2 = 0; i2 < 3; i2++) {
            this.c[i2] = new nas(btvoVar, nceVar, i2, this.h, jzpVar, z2, bvslVar, context, false);
        }
    }

    @Override // defpackage.nbv
    public nap a(int i2) {
        return this.c[i2];
    }

    @Override // defpackage.nbv
    public Boolean b() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.nbv
    public Boolean c() {
        return Boolean.valueOf(this.k.h());
    }

    @Override // defpackage.nbv
    public cqkl d() {
        this.a.b();
        return cqkl.a;
    }

    @Override // defpackage.nbv
    public cqkl e() {
        this.a.a();
        return cqkl.a;
    }

    @Override // defpackage.nbv
    public cqkl f() {
        this.a.d();
        return cqkl.a;
    }

    @Override // defpackage.nbv
    public Boolean g() {
        if (!this.b.j() || this.b.a() <= 0 || !this.b.i(0)) {
            return false;
        }
        if (this.b.a() != 1) {
            bvoo.h("Expected one offline route", new Object[0]);
        }
        return true;
    }

    @Override // defpackage.nbv
    public Boolean h() {
        return Boolean.valueOf(this.b.a() == 0);
    }

    @Override // defpackage.nbv
    public cqkl i() {
        this.a.e();
        return cqkl.a;
    }

    @Override // defpackage.nbv
    public String j() {
        return this.d.getString(R.string.CAR_ROUTE_OVERVIEW);
    }

    public void k() {
        this.b.q(this.m);
        btrm btrmVar = this.l;
        nca ncaVar = this.n;
        dceq a = dcet.a();
        a.b(alco.class, new ncc(alco.class, ncaVar, bvrj.UI_THREAD));
        btrmVar.g(ncaVar, a.a());
    }

    public void l() {
        this.b.r(this.m);
        this.l.a(this.n);
    }

    public final boolean m() {
        return cqsz.d().a(this.d) >= cqrp.d(445.0d).a(this.d);
    }
}
