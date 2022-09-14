package defpackage;
/* compiled from: PG */
/* renamed from: pcq  reason: default package */
/* loaded from: classes7.dex */
final class pcq implements btzi<dusu, dusw> {
    final /* synthetic */ deig a;

    public pcq(deig deigVar) {
        this.a = deigVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dusu> btzrVar, btzy btzyVar) {
        this.a.k(new btzz(btzyVar));
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dusu> btzrVar, dusw duswVar) {
        dusw duswVar2 = duswVar;
        int a = duts.a(duswVar2.a);
        if (a == 0 || a == 1) {
            this.a.j(duswVar2);
        } else {
            this.a.cancel(true);
        }
    }
}
