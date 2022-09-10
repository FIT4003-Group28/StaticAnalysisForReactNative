package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ibc  reason: default package */
/* loaded from: classes6.dex */
public final class ibc implements bbb {
    final /* synthetic */ ibd a;
    private int b = 0;
    private int c = 0;

    public ibc(ibd ibdVar) {
        this.a = ibdVar;
    }

    @Override // defpackage.bbb
    public final void a(int i, float f, int i2) {
        int i3 = this.c;
        boolean z = false;
        boolean z2 = i3 != 2 || this.b == 1;
        if (i3 != 2 || this.b != 0) {
            z = true;
        }
        new iay(i, f, z2, z);
        cqkx.p(this.a.a());
    }

    @Override // defpackage.bbb
    public final void b(int i) {
        int i2;
        int i3 = this.c;
        boolean z = false;
        if (i3 == 0 || (i3 == 2 && ((i2 = this.b) == 0 || i2 == 1))) {
            z = true;
        }
        this.a.e = new iba(i, z);
        cqkx.p(this.a.a());
    }

    @Override // defpackage.bbb
    public final void c(int i) {
        this.b = this.c;
        this.c = i;
    }
}
