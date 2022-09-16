package defpackage;
/* compiled from: PG */
/* renamed from: acyp  reason: default package */
/* loaded from: classes.dex */
public class acyp {
    public final dxio<dklz> a;
    private final dxio<dkiy> b;
    private final dxio<qef> c;

    public acyp(dxio<dklz> dxioVar, dxio<dkiy> dxioVar2, dxio<qef> dxioVar3) {
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = dxioVar3;
    }

    public final boolean a() {
        dkly dklyVar = this.a.a().d;
        if (dklyVar == null) {
            dklyVar = dkly.d;
        }
        return dklyVar.a;
    }

    public final boolean b() {
        dklk dklkVar = this.a.a().c;
        if (dklkVar == null) {
            dklkVar = dklk.c;
        }
        return dklkVar.a;
    }

    public final boolean c() {
        return this.b.a().bA;
    }

    public final boolean d() {
        dklu dkluVar = this.a.a().f;
        if (dkluVar == null) {
            dkluVar = dklu.c;
        }
        return dkluVar.a && !this.c.a().a();
    }

    public final dklz e() {
        return this.a.a();
    }

    public final boolean f() {
        return this.a.a().g;
    }

    public final boolean g() {
        return f() && this.a.a().h;
    }
}
