package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aetb  reason: default package */
/* loaded from: classes2.dex */
public class aetb implements aesp {
    public final dzsj<araj> a;
    public final dzsj<cqg> b;
    public final aeti c;
    public final ckcw d;
    private final dzsj<aesb> e;
    private final boolean f;
    private final dcdc<jba> g;
    private final dcdc<ilo> h;
    private final cqqw i;
    private final aeui j;
    private final cjtd k;
    private final aesa l;

    public aetb(dzsj<aesb> dzsjVar, dzsj<araj> dzsjVar2, dzsj<cqg> dzsjVar3, bnjv bnjvVar, final axwq axwqVar, final apkf apkfVar, final ckcw ckcwVar, aeui aeuiVar, final aeti aetiVar, cqqw cqqwVar, aesa aesaVar) {
        this.e = dzsjVar;
        this.a = dzsjVar2;
        this.b = dzsjVar3;
        this.c = aetiVar;
        this.i = cqqwVar;
        this.j = aeuiVar;
        this.d = ckcwVar;
        this.l = aesaVar;
        this.f = aeuiVar.f == aeuh.NEUTRAL;
        ilo h = aeuiVar.h();
        this.h = dcbg.b(aeuiVar.g).o(aesq.a).s(aesr.a).o(dbss.NOT_NULL).s(aess.a).o(dbss.NOT_NULL).o(aesaVar.equals(aesa.WRITE_REVIEW) ? aesy.a : aesz.a).s(new dbrn(axwqVar, apkfVar) { // from class: aest
            private final axwq a;
            private final apkf b;

            {
                this.a = axwqVar;
                this.b = apkfVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dbsg<azva> l;
                axwq axwqVar2 = this.a;
                apkf apkfVar2 = this.b;
                ilo iloVar = (ilo) obj;
                ily g = iloVar.g();
                String b = apkfVar2.b(iloVar.h(), iloVar.n());
                if (b != null) {
                    g.F(b);
                }
                g.C = axwqVar2.o(iloVar.ai());
                if (akqi.d(iloVar.ai())) {
                    l = axwqVar2.k(iloVar.ai());
                } else {
                    dhjz dhjzVar = iloVar.h().e;
                    if (dhjzVar == null) {
                        dhjzVar = dhjz.e;
                    }
                    l = axwqVar2.l(akqq.j(dhjzVar));
                }
                if (l.a()) {
                    g.z = l.b().a;
                }
                return g.d();
            }
        }).z();
        dccx F = dcdc.F();
        for (final int i = 0; i < this.h.size(); i++) {
            final ilo iloVar = this.h.get(i);
            bnjs a = bnjvVar.a(iloVar);
            a.a = new bnjt(ckcwVar, i, aetiVar, iloVar) { // from class: aesu
                private final ckcw a;
                private final int b;
                private final aeti c;
                private final ilo d;

                {
                    this.a = ckcwVar;
                    this.b = i;
                    this.c = aetiVar;
                    this.d = iloVar;
                }

                @Override // defpackage.bnjt
                public final void a(cjqm cjqmVar) {
                    ckcw ckcwVar2 = this.a;
                    int i2 = this.b;
                    aeti aetiVar2 = this.c;
                    ilo iloVar2 = this.d;
                    ((ckco) ckcwVar2.a(ckgo.p)).a(ckgj.FIRST_AROUND_ME_PLACE.e + i2);
                    aetiVar2.q(iloVar2);
                }
            };
            a.b = i;
            cjta b = cjtd.b();
            b.d = dtxy.fD;
            b.i(i);
            a.n = b.a();
            if (dzsjVar.a().s()) {
                a.g = iloVar.cr(h);
            }
            F.g(a.a());
        }
        this.g = F.f();
        this.k = cjtd.a(dtxy.ft);
    }

    @Override // defpackage.iqf
    public Boolean a() {
        return true;
    }

    @Override // defpackage.iqf
    public Boolean b() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.iqf
    public cqqw d() {
        return this.i;
    }

    @Override // defpackage.iqf
    public void e() {
        this.e.a().t(7);
    }

    @Override // defpackage.iqf
    public String f() {
        return this.c.H().getString(R.string.IAMHERE_PLACES_NEAR_YOU_LIST_CONTENT_DESCRIPTION);
    }

    @Override // defpackage.iqf
    public cjtd g() {
        return this.k;
    }

    @Override // defpackage.iqf
    public View.OnAttachStateChangeListener h() {
        return null;
    }

    @Override // defpackage.aesp
    public jib i() {
        jhz jhzVar = new jhz();
        jhzVar.r = 0;
        jhzVar.x = false;
        jhzVar.h = false;
        jhzVar.f(new View.OnClickListener(this) { // from class: aesv
            private final aetb a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.c.i();
            }
        });
        jhzVar.g = ibl.b();
        return jhzVar.b();
    }

    @Override // defpackage.aesp
    public jam j() {
        return new aeta(this);
    }

    @Override // defpackage.aesp
    public dcdc<ilo> k() {
        return this.h;
    }

    @Override // defpackage.aesp
    public Runnable l() {
        return new Runnable(this) { // from class: aesw
            private final aetb a;

            {
                this.a = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
                if (r2 != 2) goto L9;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r4 = this;
                    aetb r0 = r4.a
                    aeti r1 = r0.c
                    boolean r2 = r1.aD
                    if (r2 == 0) goto L40
                    r1.i()
                    aesa r2 = defpackage.aesa.OPEN_PLACESHEET
                    aesa r2 = r1.aq
                    int r2 = r2.ordinal()
                    if (r2 == 0) goto L22
                    r3 = 1
                    if (r2 == r3) goto L1c
                    r3 = 2
                    if (r2 == r3) goto L22
                    goto L2f
                L1c:
                    bqji r1 = r1.g
                    r1.a()
                    goto L2f
                L22:
                    dxio<brba> r1 = r1.ao
                    java.lang.Object r1 = r1.a()
                    brba r1 = (defpackage.brba) r1
                    java.lang.String r2 = ""
                    r1.e(r2)
                L2f:
                    ckcw r0 = r0.d
                    ckgz r1 = defpackage.ckgo.p
                    java.lang.Object r0 = r0.a(r1)
                    ckco r0 = (defpackage.ckco) r0
                    ckgj r1 = defpackage.ckgj.SEARCH_FOR_A_PLACE
                    int r1 = r1.e
                    r0.a(r1)
                L40:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aesw.run():void");
            }
        };
    }

    @Override // defpackage.aesp
    public Runnable m() {
        return new Runnable(this) { // from class: aesx
            private final aetb a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aetb aetbVar = this.a;
                if (aetbVar.c.aD) {
                    akra akraVar = new akra();
                    aetbVar.b.a().b(cqf.b(dnqb.BLUE_DOT_MENU, aetbVar.a.a().m().f().f(akraVar) ? akraVar.S() : null), true);
                    ((ckco) aetbVar.d.a(ckgo.p)).a(ckgj.ADD_A_MISSING_PLACE.e);
                }
            }
        };
    }

    @Override // defpackage.aesp
    public Boolean n() {
        return Boolean.valueOf(!this.l.equals(aesa.WRITE_REVIEW));
    }

    @Override // defpackage.aesp
    public Boolean o() {
        return Boolean.valueOf(this.l.equals(aesa.WRITE_REVIEW));
    }

    @Override // defpackage.iqf
    /* renamed from: p */
    public dcdc<jba> c() {
        return this.g;
    }

    public final aeuh q() {
        return this.j.f;
    }
}
