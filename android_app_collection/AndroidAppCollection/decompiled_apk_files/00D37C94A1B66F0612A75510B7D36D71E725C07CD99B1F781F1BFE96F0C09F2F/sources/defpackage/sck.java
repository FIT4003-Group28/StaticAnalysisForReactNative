package defpackage;
/* compiled from: PG */
/* renamed from: sck  reason: default package */
/* loaded from: classes4.dex */
public final class sck extends scn implements sch {
    private float a;
    private float b;

    @Override // defpackage.sch
    public final scj a() {
        scp f = f();
        if (f == null) {
            return null;
        }
        return new scj(f, n(), this.a, this.b);
    }

    @Override // defpackage.sch
    public final void b(scj scjVar) {
        if (scjVar == null) {
            return;
        }
        p(scjVar.a);
        o(scjVar.b);
        this.a = scjVar.c;
        this.b = scjVar.d;
    }

    @Override // defpackage.sch
    public final void c(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.sch
    public final float d() {
        return this.b;
    }

    @Override // defpackage.sch
    public final float e() {
        return this.a;
    }
}
