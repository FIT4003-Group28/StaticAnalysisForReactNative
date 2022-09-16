package defpackage;
/* compiled from: PG */
/* renamed from: bwfc  reason: default package */
/* loaded from: classes4.dex */
final class bwfc implements btzi<dhru, dhry> {
    final /* synthetic */ bwen a;
    final /* synthetic */ deig b;
    final /* synthetic */ bweo c;

    public bwfc(bwen bwenVar, deig deigVar, bweo bweoVar) {
        this.a = bwenVar;
        this.b = deigVar;
        this.c = bweoVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dhru> btzrVar, btzy btzyVar) {
        this.b.j(dbpy.a);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dhru> btzrVar, dhry dhryVar) {
        deig deigVar;
        Object obj;
        dhry dhryVar2 = dhryVar;
        int a = dhrx.a(dhryVar2.a);
        if (a != 0 && a == 2) {
            this.a.f(dhryVar2.b);
            deigVar = this.b;
            obj = dbsg.i(this.c);
        } else {
            deigVar = this.b;
            obj = dbpy.a;
        }
        deigVar.j(obj);
    }
}
