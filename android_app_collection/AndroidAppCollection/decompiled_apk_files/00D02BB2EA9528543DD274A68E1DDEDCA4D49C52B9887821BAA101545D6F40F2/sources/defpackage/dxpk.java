package defpackage;
/* compiled from: PG */
/* renamed from: dxpk  reason: default package */
/* loaded from: classes6.dex */
public final class dxpk extends dyyt<dxpk> {
    public dxpk(dyeu dyeuVar, dyet dyetVar) {
        super(dyeuVar, dyetVar);
    }

    @Override // defpackage.dyyv
    protected final /* bridge */ /* synthetic */ dyyv a(dyeu dyeuVar, dyet dyetVar) {
        return new dxpk(dyeuVar, dyetVar);
    }

    public final dehn<dszo> b(dszm dszmVar) {
        dyeu dyeuVar = this.a;
        dyib<dszm, dszo> dyibVar = dxpl.a;
        if (dyibVar == null) {
            synchronized (dxpl.class) {
                dyibVar = dxpl.a;
                if (dyibVar == null) {
                    dyhx c = dyib.c();
                    c.c = dyhz.UNARY;
                    c.d = dyib.b("google.internal.communications.instantmessaging.v1.LighterFrontend", "SendLighterMessage");
                    c.e = true;
                    c.a = dyyq.b(dszm.e);
                    c.b = dyyq.b(dszo.b);
                    dyibVar = c.a();
                    dxpl.a = dyibVar;
                }
            }
        }
        return dyzf.d(dyeuVar.a(dyibVar, this.b), dszmVar);
    }
}
