package defpackage;
/* compiled from: PG */
/* renamed from: pax  reason: default package */
/* loaded from: classes7.dex */
final class pax implements btzi<dutm, duto> {
    final /* synthetic */ btlu a;
    final /* synthetic */ pay b;

    public pax(pay payVar, btlu btluVar) {
        this.b = payVar;
        this.a = btluVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dutm> btzrVar, btzy btzyVar) {
        int i = pay.k;
        Integer num = btzyVar.s;
        synchronized (this.b) {
            this.b.i.remove(this.a);
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dutm> btzrVar, duto dutoVar) {
        this.b.f.aa(bvjk.gi, this.a, this.b.h.b());
        synchronized (this.b) {
            this.b.i.remove(this.a);
        }
    }
}
