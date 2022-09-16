package defpackage;
/* compiled from: PG */
/* renamed from: hsx  reason: default package */
/* loaded from: classes3.dex */
final class hsx implements bpn {
    final /* synthetic */ hsy a;

    public hsx(hsy hsyVar) {
        this.a = hsyVar;
    }

    @Override // defpackage.bpn
    public final void a(int i) {
    }

    @Override // defpackage.bpn
    public final void b(int i, float f, int i2) {
    }

    @Override // defpackage.bpn
    public final void c(int i) {
        if (this.a.av.j() == 0) {
            return;
        }
        htl htlVar = (htl) this.a.aw.o(i);
        if (!htlVar.b) {
            this.a.aK(true);
            this.a.aL(i);
        }
        htlVar.c.ab(0);
    }
}
