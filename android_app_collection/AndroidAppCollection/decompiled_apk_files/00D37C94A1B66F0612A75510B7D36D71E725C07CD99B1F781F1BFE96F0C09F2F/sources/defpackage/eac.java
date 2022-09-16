package defpackage;
/* compiled from: PG */
/* renamed from: eac  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class eac implements ynj {
    public final /* synthetic */ eai a;
    private final /* synthetic */ int b;

    public /* synthetic */ eac(eai eaiVar) {
        this.a = eaiVar;
    }

    public /* synthetic */ eac(eai eaiVar, int i) {
        this.b = i;
        this.a = eaiVar;
    }

    @Override // defpackage.ynj
    public final void a(Object obj) {
        if (this.b == 0) {
            eai eaiVar = this.a;
            afwd afwdVar = (afwd) obj;
            ((ces) eaiVar.bp.get()).b();
            ((aget) eaiVar.C.get()).b(ages.USER_CHANGED);
            ((akhf) eaiVar.D.get()).a();
            ((akhi) eaiVar.E.get()).a();
            ahfe.h(eaiVar.f);
            eaiVar.a.execute(new dzv(eaiVar, 5));
            return;
        }
        eai eaiVar2 = this.a;
        afwb afwbVar = (afwb) obj;
        ((ces) eaiVar2.bp.get()).b();
        ((aget) eaiVar2.C.get()).b(ages.USER_CHANGED);
        ((akhf) eaiVar2.D.get()).a();
        ((akhi) eaiVar2.E.get()).a();
        eaiVar2.a.execute(new dzv(eaiVar2, 4));
    }
}
