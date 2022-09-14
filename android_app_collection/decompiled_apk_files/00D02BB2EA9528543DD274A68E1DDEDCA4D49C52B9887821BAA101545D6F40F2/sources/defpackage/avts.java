package defpackage;
/* compiled from: PG */
/* renamed from: avts  reason: default package */
/* loaded from: classes3.dex */
public final class avts extends cjts {
    private final ddpk a;

    public avts(cqat cqatVar, ddpk ddpkVar, dbsg<ddlp> dbsgVar) {
        super(cqatVar.e(), dbsgVar);
        this.a = ddpkVar;
    }

    @Override // defpackage.cjts
    protected final ddda a() {
        return ddda.eZ;
    }

    @Override // defpackage.cjts
    protected final ddpi b() {
        ddph bZ = ddpi.d.bZ();
        ddpk ddpkVar = this.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddpi ddpiVar = (ddpi) bZ.b;
        ddpkVar.getClass();
        ddpiVar.b = ddpkVar;
        ddpiVar.a |= 4;
        return bZ.bK();
    }
}
