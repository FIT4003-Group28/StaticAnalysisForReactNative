package defpackage;
/* compiled from: PG */
/* renamed from: lpl  reason: default package */
/* loaded from: classes3.dex */
final class lpl implements afzf {
    final Object a;
    final String b;
    final /* synthetic */ lpm c;

    public lpl(lpm lpmVar, Object obj, String str) {
        this.c = lpmVar;
        this.a = obj;
        this.b = str;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.c.b.e(cffVar);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        asat asatVar = (asat) obj;
        if (asatVar == null || asatVar.f.size() == 0) {
            return;
        }
        this.c.c.e(asatVar.f, this.a);
        this.c.d.d(new abbh(this.b, asatVar));
    }
}
