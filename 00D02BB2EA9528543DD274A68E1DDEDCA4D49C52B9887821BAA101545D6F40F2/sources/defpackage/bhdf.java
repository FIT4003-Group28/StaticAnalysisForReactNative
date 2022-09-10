package defpackage;
/* compiled from: PG */
/* renamed from: bhdf  reason: default package */
/* loaded from: classes3.dex */
public final class bhdf implements btzi<dimc, dime> {
    final /* synthetic */ bhdn a;

    public bhdf(bhdn bhdnVar) {
        this.a = bhdnVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dimc> btzrVar, btzy btzyVar) {
        dcdc<dgef> dcdcVar = bhdh.a;
        Throwable th = btzyVar.r;
        String str = btzrVar.a.c;
        bhdn bhdnVar = this.a;
        bhdnVar.a.g = false;
        bhdo bhdoVar = bhdnVar.a;
        bhdoVar.b = true;
        cqkx.p(bhdoVar);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dimc> btzrVar, dime dimeVar) {
        bhdn bhdnVar = this.a;
        dsrj<dged> dsrjVar = dimeVar.a;
        bhdnVar.a.g = false;
        bhdo bhdoVar = bhdnVar.a;
        bhdoVar.b = false;
        bhdoVar.c = dsrjVar;
        if (!bhdoVar.c.isEmpty()) {
            bhdo bhdoVar2 = bhdnVar.a;
            bhdoVar2.a.p(bhdoVar2.c, bhdoVar2);
        }
        cqkx.p(bhdnVar.a);
    }
}
