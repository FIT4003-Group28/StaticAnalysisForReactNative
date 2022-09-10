package defpackage;

import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: csox  reason: default package */
/* loaded from: classes5.dex */
public final class csox implements csnt {
    public final boolean a;
    private final Executor b;
    private final String c;
    private final dtcm d;

    public csox(Executor executor, String str, dtcm dtcmVar, boolean z, dbty dbtyVar) {
        this.b = executor;
        this.c = str;
        this.d = dtcmVar;
        this.a = z;
        dbud.a(dbtyVar);
    }

    public static csow b() {
        return new csow();
    }

    @Override // defpackage.csnm
    public final dehn<csnx<dspd>> a(Iterable<dspd> iterable, csnv csnvVar) {
        csnvVar.b();
        dtcq bZ = dtcr.d.bZ();
        Iterable o = dcft.o(iterable, csos.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtcr dtcrVar = (dtcr) bZ.b;
        dsrj<dtcp> dsrjVar = dtcrVar.b;
        if (!dsrjVar.a()) {
            dtcrVar.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(o, dtcrVar.b);
        dtcw bZ2 = dtcx.c.bZ();
        String str = this.c;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dtcx dtcxVar = (dtcx) bZ2.b;
        str.getClass();
        dtcxVar.a |= 1;
        dtcxVar.b = str;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtcr dtcrVar2 = (dtcr) bZ.b;
        dtcx bK = bZ2.bK();
        bK.getClass();
        dtcrVar2.c = bK;
        dtcrVar2.a |= 1;
        dtcr bK2 = bZ.bK();
        dtcm dtcmVar = this.d;
        dyeu dyeuVar = dtcmVar.a;
        dyib<dtcr, dtct> dyibVar = dtcn.a;
        if (dyibVar == null) {
            synchronized (dtcn.class) {
                dyibVar = dtcn.a;
                if (dyibVar == null) {
                    dyhx c = dyib.c();
                    c.c = dyhz.UNARY;
                    c.d = dyib.b("mdi.InfiniteData", "Lookup");
                    c.e = true;
                    c.a = dyyq.b(dtcr.d);
                    c.b = dyyq.b(dtct.b);
                    dyibVar = c.a();
                    dtcn.a = dyibVar;
                }
            }
        }
        return deew.g(dyzf.d(dyeuVar.a(dyibVar, dtcmVar.b), bK2), new defg(this) { // from class: csot
            private final csox a;

            {
                this.a = this;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                boolean z = this.a.a;
                csnw b = csnx.b();
                for (dtcv dtcvVar : ((dtct) obj).a) {
                    csny d = csoa.d();
                    d.b(dtcvVar.d);
                    dtyp dtypVar = dtcvVar.b;
                    if (dtypVar == null) {
                        dtypVar = dtyp.d;
                    }
                    if (dtypVar.a == 0) {
                        if ((dtcvVar.a & 2) != 0) {
                            csnr csnrVar = (csnr) d;
                            csnrVar.b = 2;
                            csnrVar.a = dbsg.i(dtcvVar.c);
                        } else {
                            ((csnr) d).b = true != z ? 3 : 4;
                        }
                        csoa c2 = d.c();
                        csnp csnpVar = (csnp) b;
                        if (csnpVar.a == null) {
                            if (csnpVar.b == null) {
                                csnpVar.a = dcdc.F();
                            } else {
                                csnpVar.a = dcdc.F();
                                csnpVar.a.i(csnpVar.b);
                                csnpVar.b = null;
                            }
                        }
                        csnpVar.a.g(c2);
                    } else {
                        dtyp dtypVar2 = dtcvVar.b;
                        if (dtypVar2 == null) {
                            dtypVar2 = dtyp.d;
                        }
                        String valueOf = String.valueOf(dtypVar2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
                        sb.append("Server error ");
                        sb.append(valueOf);
                        throw new IOException(sb.toString());
                    }
                }
                return deha.a(b.a());
            }
        }, this.b);
    }
}
