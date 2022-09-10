package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aper  reason: default package */
/* loaded from: classes2.dex */
public class aper implements apeb {
    private static final cjtd a = cjtd.a(dtyi.aH);
    private final bwrs<aoyg> b;
    private final apdi c;
    private final apeo d;
    private final apcf e;
    private final apch<apdz> f;

    public aper(final apen apenVar, apep apepVar, apcf apcfVar, bwrs<aoyg> bwrsVar, bwrs<HashSet<akqi>> bwrsVar2, final apdi apdiVar, final aoxr aoxrVar) {
        bwqv a2 = apepVar.a.a();
        apep.a(a2, 1);
        aphj a3 = apepVar.b.a();
        apep.a(a3, 2);
        gga a4 = apepVar.c.a();
        apep.a(a4, 3);
        apep.a(bwrsVar, 4);
        apep.a(bwrsVar2, 5);
        apep.a(aoxrVar, 6);
        this.d = new apeo(a2, a3, a4, bwrsVar, bwrsVar2, aoxrVar);
        this.e = apcfVar;
        this.b = bwrsVar;
        this.c = apdiVar;
        this.f = new apch<>(bwrsVar, new apcg(apenVar, this, aoxrVar, apdiVar) { // from class: apeq
            private final apen a;
            private final aper b;
            private final aoxr c;
            private final apdi d;

            {
                this.a = apenVar;
                this.b = this;
                this.c = aoxrVar;
                this.d = apdiVar;
            }

            @Override // defpackage.apcg
            public final apcy a(aoxt aoxtVar, int i) {
                apen apenVar2 = this.a;
                aper aperVar = this.b;
                aoxr aoxrVar2 = this.c;
                apdi apdiVar2 = this.d;
                apen.a(apenVar2.a.a(), 1);
                begg a5 = apenVar2.b.a();
                apen.a(a5, 2);
                axyp a6 = apenVar2.c.a();
                apen.a(a6, 3);
                dzsj<axwy> dzsjVar = apenVar2.d;
                bwqv a7 = apenVar2.e.a();
                apen.a(a7, 5);
                gga a8 = apenVar2.f.a();
                apen.a(a8, 6);
                dzsj<anhg> dzsjVar2 = apenVar2.g;
                angp a9 = apenVar2.h.a();
                apen.a(a9, 8);
                anhk a10 = apenVar2.i.a();
                apen.a(a10, 9);
                Executor a11 = apenVar2.j.a();
                apen.a(a11, 10);
                cjqy a12 = apenVar2.k.a();
                apen.a(a12, 11);
                apdb a13 = apenVar2.l.a();
                apen.a(a13, 12);
                apcl a14 = apenVar2.m.a();
                apen.a(a14, 13);
                aoxv a15 = apenVar2.n.a();
                apen.a(a15, 14);
                apen.a(apenVar2.o.a(), 15);
                apen.a(aperVar, 16);
                apen.a(aoxtVar, 17);
                apen.a(aoxrVar2, 19);
                apen.a(apdiVar2, 20);
                return new apem(a5, a6, dzsjVar, a7, a8, dzsjVar2, a9, a10, a11, a12, a13, a14, a15, aperVar, aoxtVar, i, aoxrVar2, apdiVar2);
            }
        });
    }

    private final aoyg i() {
        aoyg c = this.b.c();
        dbsk.s(c);
        return c;
    }

    @Override // defpackage.apeb
    public List<apdz> a() {
        return this.f.a();
    }

    @Override // defpackage.apeb
    public Boolean b() {
        aoyf b = i().b();
        boolean z = true;
        if (b != aoyf.LOADING && b != aoyf.INITIAL_LOADING && b != aoyf.PARTIALLY_LOADED) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.apeb
    public Boolean c() {
        return Boolean.valueOf(i().b().a());
    }

    @Override // defpackage.apeb
    public cqqw d() {
        return this.e.a(a, this.b);
    }

    @Override // defpackage.apeb
    public apea e() {
        return this.d;
    }

    public void f(dcep<akqi> dcepVar) {
        apdh apdhVar = (apdh) this.c;
        HashSet<akqi> c = apdhVar.ap.c();
        dbsk.s(c);
        c.removeAll(dcepVar);
        apdhVar.ap.d(c);
        apdhVar.q(apdhVar.af.l().L(), false);
    }

    public void g(dcep<akqi> dcepVar) {
        apdh apdhVar = (apdh) this.c;
        HashSet<akqi> c = apdhVar.ap.c();
        dbsk.s(c);
        c.addAll(dcepVar);
        apdhVar.ap.d(c);
        apdhVar.q(apdhVar.af.l().L(), false);
    }

    public boolean h(akqi akqiVar) {
        HashSet<akqi> c = ((apdh) this.c).ap.c();
        dbsk.s(c);
        return c.contains(akqiVar);
    }
}
