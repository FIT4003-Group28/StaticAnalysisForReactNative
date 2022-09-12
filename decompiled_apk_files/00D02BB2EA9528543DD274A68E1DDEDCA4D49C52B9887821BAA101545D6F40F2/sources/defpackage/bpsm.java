package defpackage;
/* compiled from: PG */
/* renamed from: bpsm  reason: default package */
/* loaded from: classes4.dex */
final class bpsm extends gh {
    final /* synthetic */ bpsn a;

    public bpsm(bpsn bpsnVar) {
        this.a = bpsnVar;
    }

    @Override // defpackage.gh
    public final void a(gn gnVar, fd fdVar) {
        if (this.a.a.equals(fdVar)) {
            gnVar.an(this);
        }
    }

    @Override // defpackage.gh
    public final void e(fd fdVar) {
        if (this.a.a.equals(fdVar)) {
            this.a.b.e(true);
        }
    }
}
