package defpackage;
/* compiled from: PG */
/* renamed from: asxf  reason: default package */
/* loaded from: classes2.dex */
final class asxf implements asxv {
    final /* synthetic */ asxg a;

    public asxf(asxg asxgVar) {
        this.a = asxgVar;
    }

    @Override // defpackage.asxv
    public final void a(aszm aszmVar, @dzsi aszm aszmVar2) {
        asxg asxgVar = this.a;
        boolean z = false;
        if (!asxgVar.a.b() && (!aszmVar.b() || vxx.i(aszmVar.l.f))) {
            z = true;
        }
        asxgVar.b = z;
        asxg asxgVar2 = this.a;
        asxgVar2.c = !asxgVar2.a.b();
    }
}
