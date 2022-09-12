package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: cjts  reason: default package */
/* loaded from: classes4.dex */
public abstract class cjts extends cjtp {
    public cjts(long j, dbsg<ddlp> dbsgVar) {
        super(j, dbsgVar);
    }

    @Override // defpackage.cjtp, defpackage.cjtk
    public final synchronized void C(dwum dwumVar) {
        super.C(dwumVar);
        dnqg k = k();
        int i = a().b;
        if (k.c) {
            k.bF();
            k.c = false;
        }
        dnqh dnqhVar = (dnqh) k.b;
        dnqh dnqhVar2 = dnqh.p;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        dnqh bK = k.bK();
        if (dwumVar.c) {
            dwumVar.bF();
            dwumVar.c = false;
        }
        dwun dwunVar = (dwun) dwumVar.b;
        dwun dwunVar2 = dwun.w;
        bK.getClass();
        dwunVar.e = bK;
        dwunVar.a |= 4;
    }

    @Override // defpackage.cjtp
    public final synchronized void D(ddmz ddmzVar) {
        super.D(ddmzVar);
        ddpi b = b();
        if (ddmzVar.c) {
            ddmzVar.bF();
            ddmzVar.c = false;
        }
        ddna ddnaVar = (ddna) ddmzVar.b;
        ddna ddnaVar2 = ddna.v;
        b.getClass();
        ddnaVar.p = b;
        ddnaVar.a |= ImageMetadata.LENS_APERTURE;
    }

    protected abstract ddda a();

    protected abstract ddpi b();
}
