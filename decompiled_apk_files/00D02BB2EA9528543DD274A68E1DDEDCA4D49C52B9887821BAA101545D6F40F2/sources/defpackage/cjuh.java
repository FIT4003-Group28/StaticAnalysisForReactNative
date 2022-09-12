package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: cjuh  reason: default package */
/* loaded from: classes.dex */
public final class cjuh extends cjtp {
    private final cjte a;
    @dzsi
    private final deab b;
    @dzsi
    private final String c;
    @dzsi
    private final String d;
    @dzsi
    private final ddhp e;
    @dzsi
    private ddev f;
    @dzsi
    private final decs g;
    private final boolean h;
    @dzsi
    private final String i;
    @dzsi
    private final String j;
    @dzsi
    private final ddll k;
    @dzsi
    private final ddqs l;
    @dzsi
    private final cjsa m;

    public cjuh(cjte cjteVar, cqat cqatVar, deab deabVar, String str, String str2, String str3, String str4, ddhp ddhpVar, decs decsVar, boolean z, ddev ddevVar, cjsa cjsaVar, dbsg dbsgVar, ddll ddllVar, ddqs ddqsVar, cjsc cjscVar) {
        super(cqatVar.e(), dbsgVar, null);
        this.a = cjteVar;
        this.b = deabVar;
        this.c = str;
        this.d = str2;
        this.i = str3;
        this.j = str4;
        this.e = ddhpVar;
        this.g = decsVar;
        this.h = z;
        this.f = ddevVar;
        this.m = cjsaVar;
        this.k = ddllVar;
        this.l = ddqsVar;
    }

    public final synchronized void A() {
        ddev ddevVar = this.f;
        if (ddevVar == null || (ddevVar.a & 2) == 0) {
            return;
        }
        dsqp dsqpVar = (dsqp) ddevVar.cu(5);
        dsqpVar.bC(ddevVar);
        ddeu ddeuVar = (ddeu) dsqpVar;
        if (ddeuVar.c) {
            ddeuVar.bF();
            ddeuVar.c = false;
        }
        ddev ddevVar2 = (ddev) ddeuVar.b;
        ddevVar2.c = null;
        ddevVar2.a &= -3;
        this.f = ddeuVar.bK();
    }

    public final synchronized boolean B() {
        boolean z;
        ddev ddevVar = this.f;
        if (ddevVar != null) {
            if ((ddevVar.a & 2) != 0) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    @Override // defpackage.cjtp, defpackage.cjtk
    public final synchronized void C(dwum dwumVar) {
        super.C(dwumVar);
        dnqg k = k();
        if (this.i != null) {
            doeh bZ = doei.d.bZ();
            String str = this.i;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            doei doeiVar = (doei) bZ.b;
            str.getClass();
            doeiVar.a |= 2;
            doeiVar.b = str;
            doei bK = bZ.bK();
            if (k.c) {
                k.bF();
                k.c = false;
            }
            dnqh dnqhVar = (dnqh) k.b;
            dnqh dnqhVar2 = dnqh.p;
            bK.getClass();
            dnqhVar.m = bK;
            dnqhVar.a |= 262144;
        }
        if (this.j != null) {
            dnjh dnjhVar = ((dnqh) k.b).o;
            if (dnjhVar == null) {
                dnjhVar = dnjh.c;
            }
            dsqp dsqpVar = (dsqp) dnjhVar.cu(5);
            dsqpVar.bC(dnjhVar);
            dnjg dnjgVar = (dnjg) dsqpVar;
            String str2 = this.j;
            if (dnjgVar.c) {
                dnjgVar.bF();
                dnjgVar.c = false;
            }
            dnjh dnjhVar2 = (dnjh) dnjgVar.b;
            str2.getClass();
            dnjhVar2.a |= 1;
            dnjhVar2.b = str2;
            if (k.c) {
                k.bF();
                k.c = false;
            }
            dnqh dnqhVar3 = (dnqh) k.b;
            dnjh bK2 = dnjgVar.bK();
            bK2.getClass();
            dnqhVar3.o = bK2;
            dnqhVar3.a |= ImageMetadata.SHADING_MODE;
        }
        dnqh bK3 = k.bK();
        if (dwumVar.c) {
            dwumVar.bF();
            dwumVar.c = false;
        }
        dwun dwunVar = (dwun) dwumVar.b;
        dwun dwunVar2 = dwun.w;
        bK3.getClass();
        dwunVar.e = bK3;
        dwunVar.a |= 4;
    }

    @Override // defpackage.cjtp
    public final synchronized void D(ddmz ddmzVar) {
        super.D(ddmzVar);
        ddsi bZ = ddsj.k.bZ();
        deaf deafVar = this.a.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddsj ddsjVar = (ddsj) bZ.b;
        ddsjVar.b = deafVar.Q;
        int i = ddsjVar.a | 2;
        ddsjVar.a = i;
        dead deadVar = this.a.b;
        if (deadVar != null) {
            ddsjVar.c = deadVar.f;
            i |= 4;
            ddsjVar.a = i;
        }
        deab deabVar = this.b;
        if (deabVar != null) {
            deabVar.getClass();
            ddsjVar.d = deabVar;
            i |= 8;
            ddsjVar.a = i;
        }
        String str = this.c;
        if (str != null) {
            str.getClass();
            ddsjVar.a = i | 16;
            ddsjVar.e = str;
        }
        if (this.d != null) {
            ddsv bZ2 = ddsw.c.bZ();
            String str2 = this.d;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddsw ddswVar = (ddsw) bZ2.b;
            str2.getClass();
            ddswVar.a |= 2;
            ddswVar.b = str2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddsj ddsjVar2 = (ddsj) bZ.b;
            ddsw bK = bZ2.bK();
            bK.getClass();
            ddsjVar2.f = bK;
            ddsjVar2.a |= 32;
        }
        ddhp ddhpVar = this.e;
        if (ddhpVar != null) {
            ddhk b = cjth.b(ddhpVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddsj ddsjVar3 = (ddsj) bZ.b;
            b.getClass();
            ddsjVar3.g = b;
            ddsjVar3.a |= 64;
        }
        if (this.h) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddsj ddsjVar4 = (ddsj) bZ.b;
            ddsjVar4.a |= 256;
            ddsjVar4.i = true;
        } else {
            decs decsVar = this.g;
            if (decsVar != null) {
                long j = decsVar.a;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddsj ddsjVar5 = (ddsj) bZ.b;
                ddsjVar5.a |= 128;
                ddsjVar5.h = j;
            }
        }
        ddev ddevVar = this.f;
        if (ddevVar != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddsj ddsjVar6 = (ddsj) bZ.b;
            ddevVar.getClass();
            ddsjVar6.j = ddevVar;
            ddsjVar6.a |= 512;
        }
        if (ddmzVar.c) {
            ddmzVar.bF();
            ddmzVar.c = false;
        }
        ddna ddnaVar = (ddna) ddmzVar.b;
        ddsj bK2 = bZ.bK();
        ddna ddnaVar2 = ddna.v;
        bK2.getClass();
        ddnaVar.c = bK2;
        ddnaVar.a |= 32;
        ddls ddlsVar = ((ddna) ddmzVar.b).e;
        if (ddlsVar == null) {
            ddlsVar = ddls.k;
        }
        dsqp dsqpVar = (dsqp) ddlsVar.cu(5);
        dsqpVar.bC(ddlsVar);
        ddlr ddlrVar = (ddlr) dsqpVar;
        ddll ddllVar = this.k;
        if (ddllVar != null) {
            if (ddlrVar.c) {
                ddlrVar.bF();
                ddlrVar.c = false;
            }
            ddls ddlsVar2 = (ddls) ddlrVar.b;
            ddllVar.getClass();
            ddlsVar2.c = ddllVar;
            ddlsVar2.a |= 2;
        }
        ddqs ddqsVar = this.l;
        if (ddqsVar != null) {
            if (ddlrVar.c) {
                ddlrVar.bF();
                ddlrVar.c = false;
            }
            ddls ddlsVar3 = (ddls) ddlrVar.b;
            ddqsVar.getClass();
            ddlsVar3.e = ddqsVar;
            ddlsVar3.a |= 16;
        }
        if (ddmzVar.c) {
            ddmzVar.bF();
            ddmzVar.c = false;
        }
        ddna ddnaVar3 = (ddna) ddmzVar.b;
        ddls bK3 = ddlrVar.bK();
        bK3.getClass();
        ddnaVar3.e = bK3;
        ddnaVar3.a |= 128;
    }

    @Override // defpackage.cjtp
    public final void e(List<cjsa> list) {
        cjsa cjsaVar = this.m;
        if (cjsaVar != null) {
            ArrayList c = dchl.c(list);
            if (list.isEmpty() || !(list.get(0) instanceof cjsd)) {
                c.add(0, cjsaVar);
            } else {
                c.set(0, cjsaVar);
            }
            list = c;
        }
        t(list);
    }

    public final synchronized boolean equals(@dzsi Object obj) {
        boolean z = false;
        if (obj instanceof cjuh) {
            cjuh cjuhVar = (cjuh) obj;
            synchronized (cjuhVar) {
                if (dbsd.a(this.a, cjuhVar.a) && dbsd.a(this.b, cjuhVar.b) && dbsd.a(this.c, cjuhVar.c) && dbsd.a(this.d, cjuhVar.d) && dbsd.a(z(), cjuhVar.z()) && dbsd.a(this.e, cjuhVar.e) && dbsd.a(this.g, cjuhVar.g) && dbsd.a(Boolean.valueOf(this.h), Boolean.valueOf(cjuhVar.h)) && dbsd.a(this.f, cjuhVar.f)) {
                    z = true;
                }
            }
            return z;
        }
        return false;
    }

    public final synchronized int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.g, Boolean.valueOf(this.h), this.f, z()});
    }

    @Override // defpackage.cjtk
    public final boolean q() {
        return this.e == ddda.Kc || this.e == ddda.Kb || B();
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.c();
        b.b("action", this.a);
        deab deabVar = this.b;
        Boolean bool = null;
        b.b("uiState", deabVar == null ? null : deabVar.toString());
        b.b("contentEi", this.c);
        b.b("contentVed", this.d);
        b.b("dataReference", z());
        b.b("clientLeafVe", this.e);
        b.b("featureFprint", this.g);
        if (this.h) {
            bool = true;
        }
        b.b("isFeatureFprintScrubbed", bool);
        return b.toString();
    }

    @dzsi
    public final synchronized String z() {
        return this.i;
    }
}
