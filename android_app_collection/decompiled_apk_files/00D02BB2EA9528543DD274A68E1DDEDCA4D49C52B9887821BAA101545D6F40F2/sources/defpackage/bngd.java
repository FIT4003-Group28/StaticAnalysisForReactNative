package defpackage;
/* compiled from: PG */
/* renamed from: bngd  reason: default package */
/* loaded from: classes3.dex */
final class bngd extends dzvy implements dzve<jhu, dztc> {
    final /* synthetic */ bnge a;
    final /* synthetic */ boolean b;

    public bngd(bnge bngeVar, boolean z) {
        this.a = bngeVar;
        this.b = z;
    }

    @Override // defpackage.dzve
    public final /* bridge */ /* synthetic */ dztc a(jhu jhuVar) {
        jho jhoVar;
        jho jhoVar2;
        jhu jhuVar2 = jhuVar;
        dzvx.c(jhuVar2, "$receiver");
        if (this.b) {
            jhoVar2 = this.a.a.d;
            jhuVar2.d(jhoVar2);
            jhoVar = this.a.a.e;
        } else {
            jhoVar = this.a.a.c;
        }
        jhuVar2.d(jhoVar);
        return dztc.a;
    }
}
