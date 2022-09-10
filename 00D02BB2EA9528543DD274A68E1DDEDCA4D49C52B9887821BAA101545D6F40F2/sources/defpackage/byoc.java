package defpackage;
/* compiled from: PG */
/* renamed from: byoc  reason: default package */
/* loaded from: classes.dex */
public final class byoc implements bypr {
    private final bvjj a;

    public byoc(bvjj bvjjVar) {
        this.a = bvjjVar;
    }

    private final boolean c() {
        return this.a.m(bvjk.dg, false);
    }

    @Override // defpackage.bypr
    public final boolean a(dkql dkqlVar) {
        if (!c()) {
            dkhd dkhdVar = dkqlVar.a;
            if (dkhdVar == null) {
                dkhdVar = dkhd.h;
            }
            return dkhdVar.b;
        }
        return true;
    }

    @Override // defpackage.bypr
    public final boolean b(dkql dkqlVar) {
        if (c()) {
            return true;
        }
        if (!a(dkqlVar)) {
            return false;
        }
        if (dkqlVar.h && vxx.a(this.a) != dqvj.DRIVE) {
            return false;
        }
        return dkqlVar.e;
    }
}
