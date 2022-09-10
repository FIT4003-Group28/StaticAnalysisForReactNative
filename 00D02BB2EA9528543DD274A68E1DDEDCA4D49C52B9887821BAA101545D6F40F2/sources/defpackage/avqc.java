package defpackage;
/* compiled from: PG */
/* renamed from: avqc  reason: default package */
/* loaded from: classes3.dex */
final class avqc implements btzi<dvgc, dvgg> {
    final /* synthetic */ deig a;

    public avqc(deig deigVar) {
        this.a = deigVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dvgc> btzrVar, btzy btzyVar) {
        this.a.k(new btzz(btzyVar));
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dvgc> btzrVar, dvgg dvggVar) {
        dvgg dvggVar2 = dvggVar;
        int a = dvgf.a(dvggVar2.b);
        if (a != 0 && a == 2) {
            this.a.j(dvggVar2);
        } else {
            this.a.k(new btzz(btzy.h));
        }
    }
}
