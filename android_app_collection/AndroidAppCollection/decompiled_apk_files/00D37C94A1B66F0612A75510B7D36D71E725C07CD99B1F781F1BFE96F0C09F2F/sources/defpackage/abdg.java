package defpackage;
/* compiled from: PG */
/* renamed from: abdg  reason: default package */
/* loaded from: classes.dex */
final class abdg implements afzf {
    final /* synthetic */ afzf a;
    final /* synthetic */ abdi b;
    private final /* synthetic */ int c;

    public abdg(abdi abdiVar, afzf afzfVar) {
        this.b = abdiVar;
        this.a = afzfVar;
    }

    public abdg(abdi abdiVar, afzf afzfVar, int i) {
        this.c = i;
        this.b = abdiVar;
        this.a = afzfVar;
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        if (this.c == 0) {
            this.a.kV(cffVar);
        } else {
            this.a.kV(cffVar);
        }
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        if (this.c == 0) {
            asdi asdiVar = (asdi) obj;
            this.b.d(asdiVar.d);
            this.a.lG(asdiVar);
            return;
        }
        asdg asdgVar = (asdg) obj;
        this.b.d(asdgVar.d);
        this.a.lG(asdgVar);
    }
}
