package defpackage;
/* compiled from: PG */
/* renamed from: scv  reason: default package */
/* loaded from: classes4.dex */
public final class scv extends scn implements scs {
    private float a;

    @Override // defpackage.scs
    public final scu a() {
        if (f() == null) {
            return null;
        }
        return new scu(f(), n(), this.a);
    }

    @Override // defpackage.scs
    public final void b(scu scuVar) {
        if (scuVar == null) {
            return;
        }
        this.a = scuVar.c;
        p(scuVar.a);
        o(scuVar.b);
    }

    @Override // defpackage.scs
    public final void c(float f) {
        this.a = f;
    }

    @Override // defpackage.scs
    public final void d() {
    }
}
