package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.geller.portable.Geller;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: pie  reason: default package */
/* loaded from: classes7.dex */
public final class pie<V> extends pim<V> {
    public final dsyl a;
    public final dspy<dfok, V> b;
    public final akfa c;
    public final dehp d;
    public final dxio<btvo> e;
    public final dxio<pgp> f;
    private final dxio<pgf> h;

    public pie(dehp dehpVar, akfa akfaVar, dxio<btvo> dxioVar, dxio<pgf> dxioVar2, dxio<pgp> dxioVar3, dsyl dsylVar, dspy<dfok, V> dspyVar) {
        this.d = dehpVar;
        this.a = dsylVar;
        this.b = dspyVar;
        this.c = akfaVar;
        this.e = dxioVar;
        this.h = dxioVar2;
        this.f = dxioVar3;
    }

    public static final boolean c(pfm<V> pfmVar) {
        return (pfmVar.e == null || pfmVar.c == null) ? false : true;
    }

    @Override // defpackage.pim
    public final dehn<dcdc<pfm<V>>> a() {
        return deew.g(this.h.a().b(), new defg(this) { // from class: pia
            private final pie a;

            {
                this.a = this;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                final pie pieVar = this.a;
                Geller geller = (Geller) obj;
                String t = pieVar.c.j().t();
                if (t == null) {
                    return deha.a(dcdc.e());
                }
                return deew.h(deha.d(new Callable(geller, t, pieVar.a, dswb.e, dtgz.a) { // from class: cqzc
                    private final Geller a;
                    private final String b;
                    private final dsyl c;
                    private final dswb d;
                    private final dtgz e;

                    {
                        this.a = geller;
                        this.b = t;
                        this.c = r3;
                        this.d = r4;
                        this.e = r5;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Geller geller2 = this.a;
                        String str = this.b;
                        dsyl dsylVar = this.c;
                        dswb dswbVar = this.d;
                        dtgz dtgzVar = this.e;
                        geller2.d(dsylVar);
                        dbtp c = dbtp.c(dbpc.a);
                        try {
                            dswd dswdVar = (dswd) cqzo.a(geller2.nativeReadElements(geller2.c, geller2.b(str), dsylVar.name(), dswbVar.bS(), dtgzVar.bS()), dswd.b);
                            geller2.d(dsylVar);
                            c.d(TimeUnit.MILLISECONDS);
                            return dswdVar;
                        } catch (cqzl unused) {
                            return dswd.b;
                        }
                    }
                }, geller.a), new dbrn(pieVar) { // from class: pid
                    private final pie a;

                    {
                        this.a = pieVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        Object b;
                        pie pieVar2 = this.a;
                        dccx F = dcdc.F();
                        for (dsyn dsynVar : ((dswd) obj2).a) {
                            dsqv<dsyn, dfok> dsqvVar = dfok.g;
                            dsynVar.f(dsqvVar);
                            Object l = dsynVar.V.l(dsqvVar.d);
                            if (l == null) {
                                b = dsqvVar.b;
                            } else {
                                b = dsqvVar.b(l);
                            }
                            pfm a = pfl.a((dfok) b, pieVar2.b);
                            if (pie.c(a)) {
                                F.g(a);
                            }
                        }
                        dcdc f = F.f();
                        f.size();
                        return f;
                    }
                }, pieVar.d);
            }
        }, this.d);
    }

    @Override // defpackage.pim
    public final void b(final pfm<V> pfmVar) {
        deew.g(this.h.a().b(), new defg(this, pfmVar) { // from class: pib
            private final pie a;
            private final pfm b;

            {
                this.a = this;
                this.b = pfmVar;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                final pie pieVar = this.a;
                pfm pfmVar2 = this.b;
                Geller geller = (Geller) obj;
                String t = pieVar.c.j().t();
                if (t == null) {
                    return deha.a(false);
                }
                if (!pie.c(pfmVar2)) {
                    return deha.a(false);
                }
                dfok a = pfmVar2.a(pieVar.b);
                dsyl dsylVar = pieVar.a;
                dsym dsymVar = (dsym) dsyn.e.bZ();
                String str = a.c;
                if (dsymVar.c) {
                    dsymVar.bF();
                    dsymVar.c = false;
                }
                dsyn dsynVar = (dsyn) dsymVar.b;
                str.getClass();
                dsynVar.a |= 4;
                dsynVar.c = str;
                dswr bZ = dsws.e.bZ();
                dfoo dfooVar = a.e;
                if (dfooVar == null) {
                    dfooVar = dfoo.e;
                }
                long j = dfooVar.c;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dsws dswsVar = (dsws) bZ.b;
                int i = dswsVar.a | 1;
                dswsVar.a = i;
                dswsVar.b = j;
                dswsVar.a = i | 2;
                dswsVar.c = 0;
                dsws dswsVar2 = (dsws) bZ.b;
                dswsVar2.a |= 4;
                dswsVar2.d = 0;
                if (dsymVar.c) {
                    dsymVar.bF();
                    dsymVar.c = false;
                }
                dsyn dsynVar2 = (dsyn) dsymVar.b;
                dsws bK = bZ.bK();
                bK.getClass();
                dsynVar2.b = bK;
                dsynVar2.a |= 1;
                dsymVar.k(dfok.g, a);
                boolean z = geller.d;
                dbsk.m(true, "write() not allowed if Geller is read-only");
                return deew.h(deew.h(deee.h(degp.q(deha.f(new deff(geller, t, dsylVar, (dsyn) dsymVar.bK()) { // from class: cqzi
                    private final Geller a;
                    private final String b;
                    private final dsyl c;
                    private final dsyn d;

                    {
                        this.a = geller;
                        this.b = t;
                        this.c = dsylVar;
                        this.d = r4;
                    }

                    @Override // defpackage.deff
                    public final dehn a() {
                        Geller geller2 = this.a;
                        String str2 = this.b;
                        dsyl dsylVar2 = this.c;
                        dsyn dsynVar3 = this.d;
                        if (TextUtils.isEmpty(str2)) {
                            return deha.b(new cqzl(drtc.INVALID_ARGUMENT, "Invalid user."));
                        }
                        long j2 = geller2.c;
                        long b = geller2.b(str2);
                        String name = dsylVar2.name();
                        String[] strArr = {dsynVar3.c};
                        dsws dswsVar3 = dsynVar3.b;
                        if (dswsVar3 == null) {
                            dswsVar3 = dsws.e;
                        }
                        geller2.nativeWrite(j2, b, name, strArr, dswsVar3.b, dsynVar3.bS());
                        return dehk.a;
                    }
                }, geller.b)), cqzl.class, new defg(geller, dsylVar) { // from class: cqzj
                    private final Geller a;
                    private final dsyl b;

                    {
                        this.a = geller;
                        this.b = dsylVar;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj2) {
                        cqzl cqzlVar = (cqzl) obj2;
                        this.a.d(this.b);
                        cqzlVar.a.name();
                        return deha.b(cqzlVar);
                    }
                }, geller.a), new dbrn(geller, dsylVar) { // from class: cqzd
                    private final Geller a;
                    private final dsyl b;

                    {
                        this.a = geller;
                        this.b = dsylVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        Void r3 = (Void) obj2;
                        this.a.d(this.b);
                        drtc.OK.name();
                        return null;
                    }
                }, geller.a), new dbrn(pieVar) { // from class: pic
                    private final pie a;

                    {
                        this.a = pieVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        pie pieVar2 = this.a;
                        Void r2 = (Void) obj2;
                        if (pieVar2.e.a().getGellerParameters().b) {
                            pieVar2.f.a().b();
                        }
                        return true;
                    }
                }, pieVar.d);
            }
        }, this.d);
    }
}
