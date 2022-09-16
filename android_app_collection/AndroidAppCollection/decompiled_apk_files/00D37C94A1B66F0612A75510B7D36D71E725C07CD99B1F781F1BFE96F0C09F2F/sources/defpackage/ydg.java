package defpackage;
/* compiled from: PG */
/* renamed from: ydg  reason: default package */
/* loaded from: classes4.dex */
final class ydg implements afzf {
    final /* synthetic */ aoob a;
    final /* synthetic */ arrh b;
    final /* synthetic */ ydh c;

    public ydg(ydh ydhVar, aoob aoobVar, arrh arrhVar) {
        this.c = ydhVar;
        this.a = aoobVar;
        this.b = arrhVar;
    }

    private final void d(arrh arrhVar) {
        if (arrhVar != null) {
            this.c.d.c(arrhVar);
        }
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        arrh arrhVar;
        if (!this.a.H()) {
            ydf ydfVar = new ydf();
            ydfVar.a = this.a;
            ydfVar.b = 3;
            arrf a = arrh.a();
            awhn a2 = ydfVar.a();
            a.copyOnWrite();
            ((arrh) a.instance).ez(a2);
            arrhVar = (arrh) a.mo39build();
        } else {
            arrhVar = null;
        }
        this.c.c.dismiss();
        this.c.a.e(cffVar);
        d(arrhVar);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        asbp asbpVar = (asbp) obj;
        this.c.c.dismiss();
        this.c.b.b();
        d(this.b);
        if (!asbpVar.c.isEmpty()) {
            this.c.e.d(asbpVar.c, null);
        }
    }
}
