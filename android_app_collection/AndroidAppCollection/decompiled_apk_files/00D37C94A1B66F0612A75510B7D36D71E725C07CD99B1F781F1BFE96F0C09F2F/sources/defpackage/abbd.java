package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abbd  reason: default package */
/* loaded from: classes.dex */
public final class abbd extends aarq {
    final /* synthetic */ abbe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abbd(abbe abbeVar, aaqj aaqjVar) {
        super(aaqjVar, abbeVar.f, asat.a, abaa.o, abbc.a);
        this.a = abbeVar;
    }

    @Override // defpackage.aarq
    public final /* bridge */ /* synthetic */ Object h(aoqu aoquVar) {
        return (asat) aoquVar;
    }

    @Override // defpackage.aarq
    public final /* bridge */ /* synthetic */ void m(aaqs aaqsVar, Object obj) {
        int cf;
        aucj b;
        asat asatVar = (asat) obj;
        abbe abbeVar = this.a;
        asas asasVar = (asas) ((aopa) aaqsVar.a()).mo39build();
        aagh c = abbeVar.b.c();
        String str = (asatVar.b & 16384) != 0 ? asatVar.i : asasVar.d;
        for (auci auciVar : asasVar.e) {
            int cf2 = awwc.cf(auciVar.c);
            if (cf2 != 0 && cf2 == 2) {
                String f = aakj.f(231, auciVar.d);
                c.f(f).G(ayoc.v(auof.f(f).c())).g(auog.class).r(new nli(str, 3)).c(new abba(c, str)).S(fzb.l, aaga.b);
                yni yniVar = abbeVar.a;
                String str2 = auciVar.d;
                asav asavVar = (asav) abgb.e(asasVar.f, asav.a.getParserForType());
                if (asavVar == null) {
                    b = aucj.PAGE_SOURCE_UNKNOWN;
                } else {
                    b = aucj.b(asavVar.b);
                    if (b == null) {
                        b = aucj.PAGE_SOURCE_UNKNOWN;
                    }
                }
                yniVar.d(new abbk(str, str2, b, asatVar));
            } else {
                int cf3 = awwc.cf(auciVar.c);
                if ((cf3 != 0 && cf3 == 3) || ((cf = awwc.cf(auciVar.c)) != 0 && cf == 19)) {
                    c.f(aakj.f(231, auciVar.k)).g(auog.class).r(new nli(str, 4)).c(new abba(c, str, 2)).S(fzb.m, aaga.c);
                    abbeVar.a.d(new abbn(asasVar.d, auciVar.k, auciVar.e, asatVar));
                } else {
                    int cf4 = awwc.cf(auciVar.c);
                    if (cf4 != 0 && cf4 == 4) {
                        abbeVar.a.d(new abbm(asasVar.d, auciVar.e, auciVar.g));
                    } else {
                        int cf5 = awwc.cf(auciVar.c);
                        if (cf5 != 0 && cf5 == 36) {
                            abbeVar.a.d(new abbl(asasVar.d, auciVar.e, auciVar.f, asatVar));
                        } else {
                            int cf6 = awwc.cf(auciVar.c);
                            if (cf6 != 0 && cf6 == 32) {
                                abbeVar.a.d(new abbg(asasVar.d, auciVar.l, true));
                            } else {
                                int cf7 = awwc.cf(auciVar.c);
                                if (cf7 != 0 && cf7 == 33) {
                                    abbeVar.a.d(new abbf(asasVar.d, zgh.h(asatVar.g), true));
                                } else {
                                    int cf8 = awwc.cf(auciVar.c);
                                    if (cf8 != 0 && cf8 == 30) {
                                        abbeVar.a.d(new abbi(asasVar.d, true));
                                    } else {
                                        int cf9 = awwc.cf(auciVar.c);
                                        if (cf9 != 0 && cf9 == 11) {
                                            abbeVar.a.d(new abbh(asasVar.d, asatVar));
                                        } else {
                                            int cf10 = awwc.cf(auciVar.c);
                                            if (cf10 != 0 && cf10 == 15) {
                                                abbeVar.a.d(new abbh(asasVar.d, asatVar));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.aarq
    public final void n(aaqs aaqsVar) {
        abbe abbeVar = this.a;
        asas asasVar = (asas) ((aopa) aaqsVar.a()).mo39build();
        for (auci auciVar : asasVar.e) {
            int cf = awwc.cf(auciVar.c);
            if (cf != 0 && cf == 32) {
                abbeVar.a.d(new abbg(asasVar.d, auciVar.l, false));
            } else {
                int cf2 = awwc.cf(auciVar.c);
                if (cf2 != 0 && cf2 == 33) {
                    abbeVar.a.d(new abbf(asasVar.d, "", false));
                } else {
                    int cf3 = awwc.cf(auciVar.c);
                    if (cf3 != 0 && cf3 == 30) {
                        abbeVar.a.d(new abbi(asasVar.d, false));
                    } else {
                        int cf4 = awwc.cf(auciVar.c);
                        if (cf4 != 0 && cf4 == 2) {
                            abbeVar.a.d(new abbj(asasVar.d, auciVar.d));
                        }
                    }
                }
            }
        }
    }
}
