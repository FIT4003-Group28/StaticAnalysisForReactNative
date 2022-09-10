package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: azcp  reason: default package */
/* loaded from: classes3.dex */
public class azcp implements azbd {
    public final bwrs<ilo> a;
    public final axwi b;
    public final dxio<axwp> c;
    public final Executor d;
    public final btrm e;
    public final axwy f;
    public final ges g;
    public final gfq h;
    public List<azbc> i = new CopyOnWriteArrayList();
    public boolean j;
    @dzsi
    public azco k;
    private final gga l;
    private final azcd m;
    private final Executor n;
    private final axwo o;

    public azcp(gga ggaVar, axwi axwiVar, Executor executor, Executor executor2, azcd azcdVar, dxio<axwp> dxioVar, axwo axwoVar, axwy axwyVar, btrm btrmVar, gfq gfqVar, ges gesVar, bwrs<ilo> bwrsVar) {
        this.l = ggaVar;
        this.a = bwrsVar;
        this.g = gesVar;
        this.h = gfqVar;
        this.b = axwiVar;
        this.c = dxioVar;
        this.d = executor;
        this.n = executor2;
        this.m = azcdVar;
        this.o = axwoVar;
        this.f = axwyVar;
        this.e = btrmVar;
        this.j = false;
        this.j = false;
        bvqj.c(deew.h(axwiVar.f(), new dbrn(this) { // from class: azcf
            private final azcp a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                azcp azcpVar = this.a;
                dcdc dcdcVar = (dcdc) obj;
                azcpVar.i.clear();
                ilo c = azcpVar.a.c();
                dbsk.s(c);
                azwv a = azcpVar.c.a().a(azxb.f(c.D, c.E));
                boolean z = a != null && a.f();
                if (c.bN() != z) {
                    bwrs<ilo> bwrsVar2 = azcpVar.a;
                    ily g = c.g();
                    g.C(z);
                    bwrsVar2.d(g.d());
                }
                int size = dcdcVar.size();
                for (int i = 0; i < size; i++) {
                    baad baadVar = (baad) dcdcVar.get(i);
                    if (baadVar.y()) {
                        azcpVar.i.add(azcpVar.k(baadVar));
                    }
                }
                azcpVar.i.add(azcpVar.k(null));
                azcpVar.i = dclu.d(new azcm()).h(new azcn()).o(azcpVar.i);
                return true;
            }
        }, executor2), new bvqg(this) { // from class: azce
            private final azcp a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                azcp azcpVar = this.a;
                Boolean bool = (Boolean) obj;
                azcpVar.j = true;
                cqkx.p(azcpVar);
            }
        }, executor);
    }

    @Override // defpackage.azbd
    public jib a() {
        jhz a = jhz.a();
        a.a = this.l.getString(R.string.SAVE_TO_LISTS_PAGE_TITLE);
        a.j = null;
        a.i = null;
        a.f(null);
        a.x = true;
        jhm a2 = jhm.a();
        a2.a = this.l.getString(R.string.LIST_SAVE_DONE_BUTTON);
        a2.h = 2;
        a2.d(new View.OnClickListener(this) { // from class: azcg
            private final azcp a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.j();
            }
        });
        a2.n = true;
        a2.f = cjtd.a(dtyb.r);
        a.c(a2.c());
        return a.b();
    }

    @Override // defpackage.azbd
    public List<azbc> b() {
        return this.i;
    }

    @Override // defpackage.azbd
    public cqkl c() {
        this.o.e(this.g, bwrs.a(dcdc.f(this.a.c())));
        return cqkl.a;
    }

    @Override // defpackage.azbd
    public Boolean d() {
        return Boolean.valueOf(!this.j);
    }

    @Override // defpackage.azbd
    public cjtd e() {
        ilo c = this.a.c();
        dbsk.s(c);
        cjtd bZ = c.bZ();
        cjta b = cjtd.b();
        b.d = dtyb.w;
        b.b = bZ.e;
        b.g(bZ.d);
        return b.a();
    }

    public void f(baad baadVar) {
        gfq.l(this.g);
        this.o.i(baadVar);
    }

    public void g(baal baalVar) {
        j();
    }

    public void h() {
        j();
    }

    public void i(azco azcoVar) {
        this.k = azcoVar;
    }

    public final synchronized void j() {
        bvqd.a(deha.l(dcbg.b(this.i).o(azch.a).s(new dbrn(this) { // from class: azci
            private final azcp a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                final azcp azcpVar = this.a;
                baad e = ((azbc) obj).e();
                if (e != null) {
                    return azcpVar.b.j(e);
                }
                if (azcpVar.a.c() != null) {
                    btrm btrmVar = azcpVar.e;
                    ilo c = azcpVar.a.c();
                    dbsk.s(c);
                    btrmVar.b(new azrf(c));
                }
                azcpVar.d.execute(new Runnable(azcpVar) { // from class: azcl
                    private final azcp a;

                    {
                        this.a = azcpVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        azcp azcpVar2 = this.a;
                        azcpVar2.f.f(azcpVar2.a);
                    }
                });
                return deha.a(null);
            }
        }).z()).c(new Runnable(this) { // from class: azcj
            private final azcp a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String E;
                azcp azcpVar = this.a;
                if (azcpVar.k != null) {
                    dcdc z = dcbg.b(azcpVar.i).o(azck.a).z();
                    if (z.size() > 1) {
                        azco azcoVar = azcpVar.k;
                        dbsk.s(azcoVar);
                        ayzk ayzkVar = (ayzk) azcoVar;
                        dafk a = ckos.a(ayzkVar.a.d.findViewById(16908290), ayzkVar.a.d.getString(R.string.SAVED_IN_PLACE_LISTS_COUNT, new Object[]{Integer.valueOf(z.size())}), 0);
                        a.t(R.string.LIST_VIEW_ALL, new View.OnClickListener(ayzkVar) { // from class: ayzj
                            private final ayzk a;

                            {
                                this.a = ayzkVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.a.a.ad.a().n();
                            }
                        });
                        a.c();
                    } else if (z.size() == 1) {
                        azco azcoVar2 = azcpVar.k;
                        dbsk.s(azcoVar2);
                        baad e = ((azbc) z.get(0)).e();
                        if (e == null) {
                            E = ((ayzk) azcoVar2).a.d.getString(R.string.STARRED_PLACES_BUILT_IN_LIST_TITLE);
                        } else {
                            E = e.E(((ayzk) azcoVar2).a.H());
                        }
                        ayzk ayzkVar2 = (ayzk) azcoVar2;
                        dafk a2 = ckos.a(ayzkVar2.a.d.findViewById(16908290), ayzkVar2.a.d.getString(R.string.SAVED_IN_LIST, new Object[]{E}), 0);
                        a2.t(true != ayzkVar2.a.a.f() ? R.string.VIEW_LIST_SAVE_SNACKBAR : R.string.SEE_LIST_SAVE_SNACKBAR, new View.OnClickListener(ayzkVar2, e) { // from class: ayzi
                            private final ayzk a;
                            private final baad b;

                            {
                                this.a = ayzkVar2;
                                this.b = e;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ayzk ayzkVar3 = this.a;
                                baad baadVar = this.b;
                                if (baadVar == null) {
                                    ayzkVar3.a.ad.a().G();
                                } else {
                                    ayzkVar3.a.g.a().i(baadVar);
                                }
                            }
                        });
                        a2.c();
                    }
                }
                gfq.l(azcpVar.g);
            }
        }, this.d), this.d);
    }

    public final azbc k(@dzsi baad baadVar) {
        azcd azcdVar = this.m;
        ges gesVar = this.g;
        ilo c = this.a.c();
        dbsk.s(c);
        ilo c2 = this.a.c();
        dbsk.s(c2);
        cjtd a = c2.a();
        gga a2 = azcdVar.a.a();
        azcd.a(a2, 1);
        cqkj a3 = azcdVar.b.a();
        azcd.a(a3, 2);
        cjqy a4 = azcdVar.c.a();
        azcd.a(a4, 3);
        axxb a5 = azcdVar.d.a();
        azcd.a(a5, 4);
        aymh a6 = azcdVar.e.a();
        azcd.a(a6, 5);
        azcd.a(azcdVar.f.a(), 6);
        axwo a7 = azcdVar.g.a();
        azcd.a(a7, 7);
        axwi a8 = azcdVar.h.a();
        azcd.a(a8, 8);
        axze a9 = azcdVar.i.a();
        azcd.a(a9, 9);
        aydl a10 = azcdVar.j.a();
        azcd.a(a10, 10);
        azcd.a(gesVar, 11);
        azcd.a(c, 13);
        azcd.a(a, 14);
        return new azcc(a2, a3, a4, a5, a6, a7, a8, a9, a10, gesVar, baadVar, c, a);
    }
}
