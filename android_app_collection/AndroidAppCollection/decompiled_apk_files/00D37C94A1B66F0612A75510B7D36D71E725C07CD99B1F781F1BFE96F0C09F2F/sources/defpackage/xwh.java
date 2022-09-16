package defpackage;
/* compiled from: PG */
/* renamed from: xwh  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xwh implements aypv {
    public final /* synthetic */ xwk a;
    public final /* synthetic */ bahm b;
    private final /* synthetic */ int c;

    public /* synthetic */ xwh(xwk xwkVar, bahm bahmVar) {
        this.a = xwkVar;
        this.b = bahmVar;
    }

    public /* synthetic */ xwh(xwk xwkVar, bahm bahmVar, int i) {
        this.c = i;
        this.a = xwkVar;
        this.b = bahmVar;
    }

    @Override // defpackage.aypv
    public final void a() {
        if (this.c == 0) {
            xwk xwkVar = this.a;
            bahm bahmVar = this.b;
            xwkVar.ao.setText(xwk.af.a(bahmVar));
            xwkVar.aj = bahmVar;
            xwkVar.aE();
            return;
        }
        xwk xwkVar2 = this.a;
        bahm bahmVar2 = this.b;
        xwkVar2.an.setText(xwk.ae.a(bahmVar2));
        xwkVar2.aj = bahmVar2;
        xwkVar2.aE();
    }
}
