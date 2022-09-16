package defpackage;
/* compiled from: PG */
/* renamed from: vsu  reason: default package */
/* loaded from: classes4.dex */
public final class vsu extends vsy {
    public long[] a;
    public long b;

    public vsu(vss vssVar) {
        super(vssVar);
    }

    @Override // defpackage.vsy, defpackage.vso
    public final void e(vsn vsnVar) {
        vsn f = vsnVar.f(a());
        super.e(f);
        int d = (int) f.d();
        this.a = new long[d];
        this.b = f.c();
        for (int i = 0; i < d; i++) {
            this.a[i] = f.d();
        }
        f.k(f.b());
        vsnVar.j(f);
    }
}
