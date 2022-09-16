package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vst  reason: default package */
/* loaded from: classes4.dex */
public final class vst extends vsy {
    private final int[] a;

    public vst(vss vssVar) {
        super(vssVar);
        this.a = new int[9];
    }

    @Override // defpackage.vsy, defpackage.vso
    public final void e(vsn vsnVar) {
        vsn f = vsnVar.f(a());
        super.e(f);
        int i = this.c;
        if (i == 0) {
            f.d();
            f.d();
            f.d();
            f.d();
        } else if (i == 1) {
            f.e();
            f.e();
            f.d();
            f.e();
        } else {
            throw new vsz("Invalid atom version");
        }
        f.a();
        f.m();
        f.k(10L);
        for (int i2 = 0; i2 < 9; i2++) {
            this.a[i2] = f.a();
        }
        f.k(24L);
        f.d();
        f.k(f.b());
        vsnVar.j(f);
    }
}
