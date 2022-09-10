package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dylc  reason: default package */
/* loaded from: classes6.dex */
public final class dylc extends dyom {
    public final dymc a;
    public final String b;
    final /* synthetic */ dyld c;

    public dylc(dyld dyldVar, dymc dymcVar, String str) {
        this.c = dyldVar;
        dbsk.t(dymcVar, "delegate");
        this.a = dymcVar;
        dbsk.t(str, "authority");
        this.b = str;
    }

    @Override // defpackage.dyom
    protected final dymc a() {
        return this.a;
    }

    @Override // defpackage.dyom, defpackage.dylv
    public final dyls d(dyib<?, ?> dyibVar, dyhw dyhwVar, dyet dyetVar) {
        dyls dylsVar;
        dyer dyerVar = dyetVar.d;
        if (dyerVar == null) {
            dyerVar = null;
        }
        if (dyerVar != null) {
            dysv dysvVar = new dysv(this.a, dyibVar, dyhwVar, dyetVar);
            try {
                ((dyeq) dyerVar).a(new dylb(this, dyibVar), (Executor) dbsc.a(dyetVar.c, this.c.a), new dyeo(dysvVar));
            } catch (Throwable th) {
                dysvVar.b(dyjb.i.g("Credentials should use fail() instead of throwing exceptions").f(th));
            }
            synchronized (dysvVar.f) {
                dylsVar = dysvVar.g;
                if (dylsVar == null) {
                    dysvVar.i = new dynv();
                    dylsVar = dysvVar.i;
                    dysvVar.g = dylsVar;
                }
            }
            return dylsVar;
        }
        return this.a.d(dyibVar, dyhwVar, dyetVar);
    }
}
