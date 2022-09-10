package defpackage;
/* compiled from: PG */
/* renamed from: bwek  reason: default package */
/* loaded from: classes4.dex */
final class bwek implements btzi<dvta, dvte> {
    final /* synthetic */ bwen a;
    final /* synthetic */ bwel b;

    public bwek(bwel bwelVar, bwen bwenVar) {
        this.b = bwelVar;
        this.a = bwenVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dvta> btzrVar, btzy btzyVar) {
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dvta> btzrVar, dvte dvteVar) {
        dvte dvteVar2 = dvteVar;
        gga ggaVar = this.b.aE;
        int a = dvtd.a(dvteVar2.a);
        if (!(a == 0 || a == 1) || ggaVar == null) {
            return;
        }
        bwel bwelVar = this.b;
        String str = dvteVar2.b;
        bwen bwenVar = this.a;
        bvrj.UI_THREAD.c();
        bwenVar.f(str);
        bwelVar.c = bwelVar.w(ggaVar);
        bwelVar.ai.e(bwelVar.c);
    }
}
