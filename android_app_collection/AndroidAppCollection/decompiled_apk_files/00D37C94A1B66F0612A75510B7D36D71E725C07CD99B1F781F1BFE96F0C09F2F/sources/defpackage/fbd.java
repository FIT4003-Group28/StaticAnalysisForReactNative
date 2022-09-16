package defpackage;
/* compiled from: PG */
/* renamed from: fbd  reason: default package */
/* loaded from: classes3.dex */
public final class fbd {
    public final fbj a;

    public fbd(fbj fbjVar) {
        this.a = fbjVar;
    }

    public static Long c(aajj aajjVar) {
        asza b;
        if (aajjVar instanceof awjr) {
            return ((awjr) aajjVar).getAddedTimestampMillis();
        }
        if (aajjVar instanceof awjm) {
            return ((awjm) aajjVar).getAddedTimestampMillis();
        }
        if (!(aajjVar instanceof asze) || (b = ((asze) aajjVar).b()) == null) {
            return -1L;
        }
        return b.getAddedTimestampMillis();
    }

    private static final ayoi d(aajl aajlVar, String str, final aqpa aqpaVar) {
        return aajlVar.f(str).g(awka.class).w(dzy.o).N(dzy.l).I(new ayqf() { // from class: fax
            @Override // defpackage.ayqf
            public final boolean a(Object obj) {
                int i;
                aqpa aqpaVar2 = aqpa.this;
                awkb awkbVar = (awkb) obj;
                aqpa aqpaVar3 = aqpa.FILTER_TYPE_UNSPECIFIED;
                int ordinal = aqpaVar2.ordinal();
                return ordinal != 2 ? ordinal != 3 || (i = awkbVar.b) == 1 || i == 3 : awkbVar.b == 2;
            }
        }).V(new dzy(12)).V(dzy.p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ayoc a(final aajl aajlVar, String str, String str2) {
        return d(aajlVar, str, aqpa.FILTER_TYPE_VIDEOS_ONLY).I(new nli(str2, 1)).j().s(new ayqe() { // from class: fbb
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                fbd fbdVar = fbd.this;
                final aajl aajlVar2 = aajlVar;
                final fbc fbcVar = (fbc) obj;
                return fbdVar.a.a().i(new ayqe() { // from class: fba
                    @Override // defpackage.ayqe
                    public final Object a(Object obj2) {
                        fbc fbcVar2 = fbc.this;
                        aajl aajlVar3 = aajlVar2;
                        if (!((amvn) obj2).contains(fbcVar2.c)) {
                            return aajlVar3.f(fbcVar2.a);
                        }
                        return ayoc.p();
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ayos b(aajl aajlVar, String str, aqpa aqpaVar, int i, fat fatVar) {
        ayos aq;
        ayoi V = d(aajlVar, str, aqpaVar).ak(this.a.a().k(), eho.d).I(new efx(10)).V(dzy.n).ak(ayos.D(amvn.p(this.a.b)).k(), eho.d).I(new efx(11)).V(dzy.n).V(dzy.m);
        aajlVar.getClass();
        ayoi u = V.u(new gna(aajlVar, 1));
        if (fatVar == fat.TIME_DESCENDING) {
            aq = u.aq().E(new ayqz(fay.a));
        } else {
            aq = u.aq();
        }
        return aq.E(dzy.k).E(new faz(i));
    }
}
