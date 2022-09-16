package defpackage;
/* compiled from: PG */
/* renamed from: fxy  reason: default package */
/* loaded from: classes3.dex */
public final class fxy implements fxz {
    private final arfu a;

    public fxy(arfu arfuVar) {
        this.a = arfuVar;
    }

    @Override // defpackage.fxz
    public final apzg a() {
        arfu arfuVar = this.a;
        if (arfuVar == null) {
            return null;
        }
        if (arfuVar.c == 3) {
            return (apzg) arfuVar.d;
        }
        return apzg.a;
    }

    @Override // defpackage.fxz
    public final apzg b() {
        arfu arfuVar = this.a;
        if (arfuVar == null) {
            return null;
        }
        if (arfuVar.c == 2) {
            return (apzg) arfuVar.d;
        }
        return apzg.a;
    }

    @Override // defpackage.fxz
    public final arhs c() {
        arfu arfuVar = this.a;
        if (arfuVar == null) {
            return null;
        }
        arhs arhsVar = arfuVar.e;
        return arhsVar == null ? arhs.a : arhsVar;
    }

    @Override // defpackage.fxz
    public final Object d() {
        return this.a;
    }

    @Override // defpackage.fxz
    public final String e() {
        arfu arfuVar = this.a;
        if (arfuVar == null || (arfuVar.b & 8) == 0) {
            return null;
        }
        aovr aovrVar = arfuVar.f;
        if (aovrVar == null) {
            aovrVar = aovr.a;
        }
        return aovrVar.c;
    }
}
