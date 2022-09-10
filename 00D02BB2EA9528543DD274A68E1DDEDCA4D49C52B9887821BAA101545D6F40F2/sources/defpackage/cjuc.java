package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: cjuc  reason: default package */
/* loaded from: classes4.dex */
public abstract class cjuc extends cjtp {
    public cjuc(cqat cqatVar, dbsg<ddlp> dbsgVar) {
        super(cqatVar.e(), dbsgVar);
    }

    @Override // defpackage.cjtp
    public final synchronized void D(ddmz ddmzVar) {
        super.D(ddmzVar);
        ddqu a = a();
        if (ddmzVar.c) {
            ddmzVar.bF();
            ddmzVar.c = false;
        }
        ddna ddnaVar = (ddna) ddmzVar.b;
        ddna ddnaVar2 = ddna.v;
        a.getClass();
        ddnaVar.q = a;
        ddnaVar.a |= ImageMetadata.SHADING_MODE;
    }

    protected abstract ddqu a();
}
