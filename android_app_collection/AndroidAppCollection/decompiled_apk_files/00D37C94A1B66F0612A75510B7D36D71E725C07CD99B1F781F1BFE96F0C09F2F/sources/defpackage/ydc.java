package defpackage;
/* compiled from: PG */
/* renamed from: ydc  reason: default package */
/* loaded from: classes4.dex */
final class ydc implements afzf {
    final /* synthetic */ aoob a;
    final /* synthetic */ arrh b;
    final /* synthetic */ ydd c;

    public ydc(ydd yddVar, aoob aoobVar, arrh arrhVar) {
        this.c = yddVar;
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
            ydb ydbVar = new ydb();
            ydbVar.a = this.a;
            ydbVar.b = 3;
            arrf a = arrh.a();
            awhk a2 = ydbVar.a();
            a.copyOnWrite();
            ((arrh) a.instance).eu(a2);
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
        aryu aryuVar = (aryu) obj;
        this.c.c.dismiss();
        this.c.b.b();
        d(this.b);
        if (!aryuVar.c.isEmpty()) {
            this.c.e.d(aryuVar.c, null);
        }
    }
}
