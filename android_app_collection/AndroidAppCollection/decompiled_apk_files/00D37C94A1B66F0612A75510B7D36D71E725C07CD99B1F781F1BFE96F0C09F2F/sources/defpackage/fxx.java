package defpackage;
/* compiled from: PG */
/* renamed from: fxx  reason: default package */
/* loaded from: classes3.dex */
public final class fxx implements fxz {
    private final aqgr a;

    public fxx(aqgr aqgrVar) {
        this.a = aqgrVar;
    }

    @Override // defpackage.fxz
    public final apzg a() {
        aqgr aqgrVar = this.a;
        if (aqgrVar.c == 3) {
            return (apzg) aqgrVar.d;
        }
        return apzg.a;
    }

    @Override // defpackage.fxz
    public final apzg b() {
        aqgr aqgrVar = this.a;
        if (aqgrVar.c == 2) {
            return (apzg) aqgrVar.d;
        }
        return apzg.a;
    }

    @Override // defpackage.fxz
    public final arhs c() {
        arhs arhsVar = this.a.e;
        return arhsVar == null ? arhs.a : arhsVar;
    }

    @Override // defpackage.fxz
    public final Object d() {
        return this.a;
    }

    @Override // defpackage.fxz
    public final String e() {
        aqgr aqgrVar = this.a;
        if ((aqgrVar.b & 8) != 0) {
            aovr aovrVar = aqgrVar.f;
            if (aovrVar == null) {
                aovrVar = aovr.a;
            }
            return aovrVar.c;
        }
        return null;
    }
}
