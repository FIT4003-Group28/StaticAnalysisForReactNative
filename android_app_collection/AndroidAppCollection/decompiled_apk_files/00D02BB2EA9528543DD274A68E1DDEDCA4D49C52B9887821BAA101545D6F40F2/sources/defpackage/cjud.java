package defpackage;
/* compiled from: PG */
/* renamed from: cjud  reason: default package */
/* loaded from: classes4.dex */
public final class cjud extends cjtp {
    private final String a;
    @dzsi
    private final String b;
    @dzsi
    private final String c;
    @dzsi
    private final String d;

    public cjud(String str, @dzsi String str2, @dzsi String str3, @dzsi String str4, cqat cqatVar, dbsg<ddlp> dbsgVar) {
        super(cqatVar.e(), dbsgVar);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // defpackage.cjtp, defpackage.cjtk
    public final synchronized void C(dwum dwumVar) {
        super.C(dwumVar);
        dnqg k = k();
        int i = ddfs.c.a;
        if (k.c) {
            k.bF();
            k.c = false;
        }
        dnqh dnqhVar = (dnqh) k.b;
        dnqh dnqhVar2 = dnqh.p;
        int i2 = dnqhVar.a | 64;
        dnqhVar.a = i2;
        dnqhVar.g = i;
        String str = this.d;
        if (str != null) {
            str.getClass();
            dnqhVar.a = i2 | 4;
            dnqhVar.d = str;
        }
        if (dwumVar.c) {
            dwumVar.bF();
            dwumVar.c = false;
        }
        dwun dwunVar = (dwun) dwumVar.b;
        dnqh bK = k.bK();
        dwun dwunVar2 = dwun.w;
        bK.getClass();
        dwunVar.e = bK;
        dwunVar.a |= 4;
    }

    @Override // defpackage.cjtp
    public final synchronized void D(ddmz ddmzVar) {
        super.D(ddmzVar);
        ddmr bZ = ddms.e.bZ();
        String str = this.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddms ddmsVar = (ddms) bZ.b;
        str.getClass();
        int i = ddmsVar.a | 1;
        ddmsVar.a = i;
        ddmsVar.b = str;
        String str2 = this.b;
        if (str2 != null) {
            str2.getClass();
            i |= 2;
            ddmsVar.a = i;
            ddmsVar.c = str2;
        }
        String str3 = this.c;
        if (str3 != null) {
            str3.getClass();
            ddmsVar.a = i | 4;
            ddmsVar.d = str3;
        }
        if (ddmzVar.c) {
            ddmzVar.bF();
            ddmzVar.c = false;
        }
        ddna ddnaVar = (ddna) ddmzVar.b;
        ddms bK = bZ.bK();
        ddna ddnaVar2 = ddna.v;
        bK.getClass();
        ddnaVar.u = bK;
        ddnaVar.a |= 16777216;
    }
}
