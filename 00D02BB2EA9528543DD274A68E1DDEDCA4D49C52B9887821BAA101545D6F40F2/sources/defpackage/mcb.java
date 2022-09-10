package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: mcb  reason: default package */
/* loaded from: classes7.dex */
public final class mcb {
    public final btrm a;
    public final atym b;
    public final List<mca> c;
    public boolean d;
    public int e;
    public int f;
    @dzsi
    public akra g;
    private final aufc h;
    private final Executor i;
    private final asmp j;
    private final cjqq k;
    private final akoq l;
    private final kxc m;
    private final kxc n;
    private final crzp<aufb> o;
    private final List<aktc> p;

    public mcb(btrm btrmVar, aufc aufcVar, Executor executor, cjqq cjqqVar, asmp asmpVar, Context context, akoq akoqVar) {
        atym atymVar = new atym(btrmVar, akoqVar.aC(), akoqVar.aE());
        this.o = new mbx(this);
        this.c = new ArrayList();
        this.p = new ArrayList();
        this.a = btrmVar;
        this.h = aufcVar;
        this.i = executor;
        this.j = asmpVar;
        this.k = cjqqVar;
        this.d = aufcVar.b();
        this.l = akoqVar;
        this.b = atymVar;
        this.m = new kxc(context, akoqVar.aE(), -1, -14671580, -1, -14671580, -2543579, -881790, -2543579, -881790);
        this.n = new kxc(context, akoqVar.aE(), -1, -14671580, -1, -14671580, -8354165, -2433824, -8354165, -2433824);
    }

    private final void h() {
        this.b.b();
        j();
        for (mca mcaVar : this.c) {
            this.l.aC().e(mcaVar.d().a());
            this.l.aC().e(mcaVar.e().a());
        }
        this.c.clear();
        this.e = 0;
        this.f = 0;
    }

    private final mby i(akra akraVar, int i, aryq aryqVar, boolean z) {
        dmpn a;
        String b = npn.b(i + 1);
        bvrj.UI_THREAD.c();
        atzd atzdVar = new atzd(akraVar, this.k, cjtd.a(dtxm.cn));
        if (aryqVar == aryq.GENERIC) {
            a = this.m.a(akraVar, b, false, z);
        } else {
            a = this.n.a(akraVar, b, false, z);
        }
        aktc d = this.l.aC().d(a, dmti.WORLD_ENCODING_LAT_LNG_E7);
        d.Pu();
        return new maq(d, atzdVar, i);
    }

    private final void j() {
        for (aktc aktcVar : this.p) {
            this.l.ak().a(aktcVar);
        }
        this.p.clear();
    }

    public final void a() {
        this.h.i().d(this.o, this.i);
    }

    public final void b() {
        this.h.i().c(this.o);
    }

    public final void c() {
        h();
        this.b.c();
        this.m.b();
        this.n.b();
    }

    public final void d(List<mck> list) {
        bvrj.UI_THREAD.c();
        h();
        for (mck mckVar : list) {
            akra akraVar = mckVar.c;
            int size = this.c.size();
            aryq aryqVar = mckVar.b.o;
            this.c.add(new mar(mckVar.b, mckVar, akraVar, i(akraVar, size, aryqVar, false), i(akraVar, size, aryqVar, true)));
        }
        this.b.a(dcbg.b(this.c).s(mbu.a).z());
    }

    public final void e() {
        bvrj.UI_THREAD.c();
        this.b.a(null);
        j();
    }

    public final void f(int i, int i2) {
        mby d;
        mby d2;
        j();
        dcdg p = dcdn.p();
        for (int i3 = i; i3 < i2; i3++) {
            if (this.d) {
                d2 = this.c.get(i3).e();
            } else {
                d2 = this.c.get(i3).d();
            }
            p.f(d2.a(), d2.b());
        }
        dcdn b = p.b();
        atzf atzfVar = new atzf(false, Integer.MAX_VALUE, b, new atze(b), new amrz(), new amrm(), new amrq(), new amrt(this.g), new amsa());
        for (int i4 = i; i4 < i2; i4++) {
            if (this.d) {
                d = this.c.get(i4).e();
            } else {
                d = this.c.get(i4).d();
            }
            d.a().Pt(new mbz(this, this.c.get(i4).a()));
            this.l.ak().b(d.a(), atzfVar, amsb.NAVIGATION_SEARCH_RESULT, d.c(), kxd.e);
            this.p.add(d.a());
        }
    }

    public final void g(int i, int i2, boolean z) {
        if (i >= i2) {
            return;
        }
        this.e = Math.max(i, 0);
        this.f = Math.min(i2, this.c.size());
        this.b.a(dcbg.b(this.c).s(mbv.a).z());
        f(this.e, this.f);
        this.j.p(dcbg.b(this.c).s(mbw.a).z(), false, false, Math.min((((this.f - 1) / 3) + 1) * 3, this.c.size()), z);
    }
}
