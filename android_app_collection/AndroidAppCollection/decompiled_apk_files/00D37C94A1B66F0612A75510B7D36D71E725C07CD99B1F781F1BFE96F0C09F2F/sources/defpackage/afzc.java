package defpackage;
/* compiled from: PG */
/* renamed from: afzc  reason: default package */
/* loaded from: classes.dex */
public final class afzc implements afzf {
    private final afzf a;
    private boolean b;

    public afzc(afzf afzfVar) {
        afzfVar.getClass();
        this.a = afzfVar;
    }

    public final void d() {
        this.b = true;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        if (!this.b) {
            this.a.kV(cffVar);
        }
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final void lG(Object obj) {
        if (!this.b) {
            this.a.lG(obj);
        }
    }
}
