package defpackage;
/* compiled from: PG */
/* renamed from: bwfd  reason: default package */
/* loaded from: classes4.dex */
final class bwfd implements btzi<dvta, dvte> {
    final /* synthetic */ bwen a;
    final /* synthetic */ deig b;
    final /* synthetic */ bweo c;

    public bwfd(bwen bwenVar, deig deigVar, bweo bweoVar) {
        this.a = bwenVar;
        this.b = deigVar;
        this.c = bweoVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dvta> btzrVar, btzy btzyVar) {
        this.b.j(dbpy.a);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dvta> btzrVar, dvte dvteVar) {
        deig deigVar;
        Object i;
        dvte dvteVar2 = dvteVar;
        int a = dvtd.a(dvteVar2.a);
        if (a == 0 || a == 1) {
            this.a.f(dvteVar2.b);
            deigVar = this.b;
            i = dbsg.i(this.c);
        } else {
            deigVar = this.b;
            i = dbpy.a;
        }
        deigVar.j(i);
    }
}
