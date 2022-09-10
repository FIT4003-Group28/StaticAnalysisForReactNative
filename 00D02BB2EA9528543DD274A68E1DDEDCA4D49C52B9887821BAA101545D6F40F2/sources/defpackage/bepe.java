package defpackage;

import android.app.Application;
import android.text.format.DateUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bepe  reason: default package */
/* loaded from: classes3.dex */
public class bepe implements bens {
    public final ff a;
    public final bgyj b;
    public final bepp c;
    public final bgza d;
    public final bepp e;
    public final List<String> f;
    public final cqkp g;
    public boolean i;
    private final eapg j;
    private final beic k;
    private final bwrs<ilo> l;
    private final eapg m;
    private final Executor n;
    private boolean o;
    private boolean p = true;
    public boolean h = true;
    private final crzp<apsi<dbsg<List<dfzw>>>> q = new bepb(this);
    private final View.OnAttachStateChangeListener r = new bepc(this);

    public bepe(ff ffVar, cqat cqatVar, cqhn cqhnVar, bgyj bgyjVar, beic beicVar, bepq bepqVar, bgzb bgzbVar, Executor executor, cqkp cqkpVar, bwrs<ilo> bwrsVar) {
        this.a = ffVar;
        this.b = bgyjVar;
        this.k = beicVar;
        this.c = bepqVar.a(true);
        this.l = bwrsVar;
        ilo c = bwrsVar.c();
        cjta c2 = cjtd.c(c == null ? null : c.bZ());
        c2.d = dtxv.aF;
        cjtd a = c2.a();
        Application a2 = bgzbVar.a.a();
        bgzb.a(a2, 1);
        cqhn a3 = bgzbVar.b.a();
        bgzb.a(a3, 2);
        bgyx a4 = bgzbVar.c.a();
        bgzb.a(a4, 3);
        bgzb.a(a, 4);
        this.d = new bgza(a2, a3, a4, a);
        this.e = bepqVar.a(false);
        this.n = executor;
        this.g = cqkpVar;
        eapg s = bvtb.s(cqatVar.b());
        this.j = s;
        eapg o = s.o(s.b.K().g(s.a, 5));
        this.m = o;
        ArrayList arrayList = new ArrayList();
        while (o.compareTo(s) <= 0) {
            arrayList.add(DateUtils.formatDateTime(ffVar, o.l().a, 65572));
            o = o.o(o.b.K().e(o.a, 1));
        }
        this.f = arrayList;
    }

    @Override // defpackage.bens
    public Boolean a() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.bens
    public bgyq b() {
        return this.d;
    }

    @Override // defpackage.bens
    public bgyn c() {
        return this.c;
    }

    @Override // defpackage.bens
    public bgyn d() {
        return this.e;
    }

    @Override // defpackage.bens
    public View.OnAttachStateChangeListener e() {
        return this.r;
    }

    @Override // defpackage.bens
    @dzsi
    public cqfc f() {
        if (!this.h) {
            return null;
        }
        return new bepd(this);
    }

    public Boolean g() {
        return Boolean.valueOf(this.p);
    }

    @dzsi
    public bgyp h() {
        return this.d.b();
    }

    public boolean i() {
        return this.i;
    }

    public void j() {
        this.k.a().a(this.q, this.n);
        ilo c = this.l.c();
        if (this.o || c == null) {
            return;
        }
        this.k.b(c, this.m, this.j);
        this.o = true;
    }

    public void k() {
        this.k.a().c(this.q);
    }

    public void l() {
        if (!this.p) {
            this.p = true;
            cqkx.p(this);
        }
    }

    public void m() {
        if (this.p) {
            this.p = false;
            bgyp b = this.d.b();
            if (b != null && b.a().booleanValue()) {
                b.d();
            }
            cqkx.p(this);
        }
    }

    public final void n(int i, int i2, int i3, List<dfzw> list) {
        int i4 = 0;
        int i5 = 0;
        while (i <= i2) {
            int i6 = i - i3;
            i4 += list.get(i6).a;
            i5 += list.get(i6).b;
            i++;
        }
        this.c.g(i4);
        this.e.g(i5);
    }
}
