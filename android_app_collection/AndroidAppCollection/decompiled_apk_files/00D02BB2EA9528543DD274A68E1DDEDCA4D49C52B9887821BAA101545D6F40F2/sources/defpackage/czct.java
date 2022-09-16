package defpackage;

import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.MatchInfo;
/* compiled from: PG */
/* renamed from: czct  reason: default package */
/* loaded from: classes5.dex */
public final class czct {
    public final czdb a;
    public final boolean b;
    public final ClientConfigInternal c;
    private final czcz d;

    public czct(czdb czdbVar, ClientConfigInternal clientConfigInternal) {
        this.a = czdbVar;
        boolean z = clientConfigInternal.G;
        this.b = z;
        this.d = new czcz(czdbVar, z);
        this.c = clientConfigInternal;
    }

    private final dcdc<MatchInfo> d(dudl dudlVar, dcdc<dudl> dcdcVar) {
        dccx G = dcdc.G(dcdcVar.size());
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dudl dudlVar2 = dcdcVar.get(i);
            if (this.a.b(dudlVar, dudlVar2, this.b)) {
                G.i(dudm.g(dudlVar2, dudlVar.c.length()));
            }
        }
        return G.f();
    }

    private final dcep<MatchInfo> e(dshb dshbVar, dcdc<dudl> dcdcVar) {
        dcdc<dudl> g;
        String str = dshbVar.b;
        if (str.isEmpty()) {
            return dcmr.a;
        }
        dcen N = dcep.N();
        if (this.b) {
            g = czdb.c(str);
        } else {
            g = g(str, true);
        }
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdc<MatchInfo> d = d(dcdcVar.get(i), g);
            if (!d.isEmpty()) {
                N.i(d);
            }
        }
        return N.f();
    }

    private static final dcdc<dudl> g(String str, boolean z) {
        if (str == null) {
            return dcdc.e();
        }
        return dudm.c(str, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0222, code lost:
        if (defpackage.cyez.a.b(r11.charAt(r7)) == false) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Iterable<defpackage.cyvs> r22, defpackage.cyvc r23, java.lang.String r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czct.a(java.lang.Iterable, cyvc, java.lang.String, boolean):void");
    }

    public final void b(cywm cywmVar, dsia dsiaVar, dcdc<dudl> dcdcVar, dudl dudlVar, dcdc<dudl> dcdcVar2) {
        dshb dshbVar;
        dsic dsicVar;
        dshi dshiVar;
        for (dsgt dsgtVar : dsiaVar.c) {
            if (cywm.c(this.c.l, dsgtVar)) {
                dsgv dsgvVar = dsgtVar.d;
                if (dsgvVar == null) {
                    dsgvVar = dsgv.f;
                }
                dshv dshvVar = dsgvVar.c;
                if (dshvVar == null) {
                    dshvVar = dshv.e;
                }
                dcep<MatchInfo> c = c(dshvVar, dcdcVar);
                dcep<MatchInfo> dcepVar = dcmr.a;
                int a = dsgs.a(dsgtVar.b);
                int i = a - 1;
                if (a != 0) {
                    if (i == 0) {
                        if (dsgtVar.b == 2) {
                            dshbVar = (dshb) dsgtVar.c;
                        } else {
                            dshbVar = dshb.f;
                        }
                        dcepVar = e(dshbVar, dcdcVar);
                    } else if (i == 1) {
                        if (dsgtVar.b == 3) {
                            dsicVar = (dsic) dsgtVar.c;
                        } else {
                            dsicVar = dsic.d;
                        }
                        dcepVar = f(dsicVar, dudlVar, dcdcVar2);
                    } else if (i == 2) {
                        if (dsgtVar.b == 4) {
                            dshiVar = (dshi) dsgtVar.c;
                        } else {
                            dshiVar = dshi.e;
                        }
                        int a2 = dshh.a(dshiVar.b);
                        int i2 = a2 - 1;
                        if (a2 == 0) {
                            throw null;
                        }
                        String str = "";
                        if (i2 == 0) {
                            dsgw bZ = dshb.f.bZ();
                            if (dshiVar.b == 2) {
                                str = (String) dshiVar.c;
                            }
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dshb dshbVar2 = (dshb) bZ.b;
                            str.getClass();
                            dshbVar2.a |= 1;
                            dshbVar2.b = str;
                            dcepVar = e(bZ.bK(), dcdcVar);
                        } else if (i2 != 1) {
                            dcepVar = dcmr.a;
                        } else {
                            dsib bZ2 = dsic.d.bZ();
                            String str2 = dshiVar.b == 3 ? (String) dshiVar.c : str;
                            if (bZ2.c) {
                                bZ2.bF();
                                bZ2.c = false;
                            }
                            dsic dsicVar2 = (dsic) bZ2.b;
                            str2.getClass();
                            int i3 = 1 | dsicVar2.a;
                            dsicVar2.a = i3;
                            dsicVar2.b = str2;
                            if (dshiVar.b == 3) {
                                str = (String) dshiVar.c;
                            }
                            str.getClass();
                            dsicVar2.a = i3 | 2;
                            dsicVar2.c = str;
                            dcepVar = f(bZ2.bK(), dudlVar, dcdcVar2);
                        }
                    }
                    if (!c.isEmpty() || !dcepVar.isEmpty()) {
                        cyfv j = cywmVar.j(dsgtVar);
                        cyfu c2 = j.c();
                        c2.d = c;
                        c2.e = dcepVar;
                        cywmVar.h(dsgtVar, j);
                    }
                } else {
                    throw null;
                }
            }
        }
    }

    public final dcep<MatchInfo> c(dshv dshvVar, dcdc<dudl> dcdcVar) {
        dcdc<dudl> g;
        String str = dshvVar.b;
        if (str.isEmpty()) {
            return dcmr.a;
        }
        dcen N = dcep.N();
        if (this.b) {
            g = czdb.c(str);
        } else {
            g = g(str, false);
        }
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdc<MatchInfo> d = d(dcdcVar.get(i), g);
            if (!d.isEmpty()) {
                N.i(d);
            }
        }
        return N.f();
    }

    private final dcep<MatchInfo> f(dsic dsicVar, dudl dudlVar, dcdc<dudl> dcdcVar) {
        dcfc<dudl> a;
        if (!dsicVar.b.isEmpty() || !dsicVar.c.isEmpty()) {
            String str = (dsicVar.a & 2) != 0 ? dsicVar.c : dsicVar.b;
            if (this.b) {
                dcfa T = dcfc.T(dudl.b);
                T.k(dudm.d(str));
                a = T.f();
            } else {
                a = this.a.a(str);
            }
            dcpd<dudl> it = a.iterator();
            while (it.hasNext()) {
                dudl next = it.next();
                int size = dcdcVar.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.b(dcdcVar.get(i), next, this.b)) {
                        dcdc<MatchInfo> a2 = czcz.a(dudlVar.c, dsicVar.b, next);
                        if (!a2.isEmpty()) {
                            return dcep.K(a2);
                        }
                    }
                }
            }
            return dcmr.a;
        }
        return dcmr.a;
    }
}
