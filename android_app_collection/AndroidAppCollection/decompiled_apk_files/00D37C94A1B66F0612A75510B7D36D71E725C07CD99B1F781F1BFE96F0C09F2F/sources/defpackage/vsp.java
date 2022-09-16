package defpackage;
/* compiled from: PG */
/* renamed from: vsp  reason: default package */
/* loaded from: classes4.dex */
public final class vsp extends vsy {
    public long a;
    public long[] b;

    public vsp(vss vssVar) {
        super(vssVar);
    }

    @Override // defpackage.vsy, defpackage.vso
    public final void e(vsn vsnVar) {
        vsn f = vsnVar.f(a());
        super.e(f);
        int e = (int) f.e();
        this.b = new long[e];
        this.a = f.c();
        for (int i = 0; i < e; i++) {
            this.b[i] = f.e();
        }
        f.k(f.b());
        vsnVar.j(f);
    }
}
