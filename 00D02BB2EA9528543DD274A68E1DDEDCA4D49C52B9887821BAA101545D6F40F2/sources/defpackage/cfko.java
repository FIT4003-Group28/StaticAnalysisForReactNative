package defpackage;
/* compiled from: PG */
/* renamed from: cfko  reason: default package */
/* loaded from: classes4.dex */
final class cfko implements gj {
    final /* synthetic */ gn a;
    final /* synthetic */ String b;

    public cfko(gn gnVar, String str) {
        this.a = gnVar;
        this.b = str;
    }

    @Override // defpackage.gj
    public final void a() {
        if (this.a.j() == 0) {
            this.a.m(this);
            int i = cfkp.i;
            return;
        }
        gn gnVar = this.a;
        if (!this.b.equals(gnVar.k(gnVar.j() - 1).p())) {
            return;
        }
        this.a.e();
        this.a.m(this);
    }
}
