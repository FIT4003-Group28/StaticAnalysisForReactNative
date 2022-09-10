package defpackage;
/* compiled from: PG */
/* renamed from: avtu  reason: default package */
/* loaded from: classes3.dex */
public final class avtu extends cjts {
    private final ddpm a;

    public avtu(cqat cqatVar, ddpm ddpmVar, dbsg<ddlp> dbsgVar) {
        super(cqatVar.e(), dbsgVar);
        this.a = ddpmVar;
    }

    @Override // defpackage.cjts
    protected final ddda a() {
        return ddda.eZ;
    }

    @Override // defpackage.cjts
    protected final ddpi b() {
        ddph bZ = ddpi.d.bZ();
        ddpm ddpmVar = this.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddpi ddpiVar = (ddpi) bZ.b;
        ddpmVar.getClass();
        ddpiVar.c = ddpmVar;
        ddpiVar.a |= 32;
        return bZ.bK();
    }
}
