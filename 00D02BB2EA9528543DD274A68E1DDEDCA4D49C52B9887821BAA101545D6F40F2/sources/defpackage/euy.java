package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: euy  reason: default package */
/* loaded from: classes6.dex */
final class euy<T> implements dzsj<T> {
    final /* synthetic */ euz a;
    private final int b;

    public euy(euz euzVar, int i) {
        this.a = euzVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                euz euzVar = this.a;
                ftt fttVar = euzVar.a;
                return (T) new bsih(fttVar.eV, fttVar.oX(), euzVar.a.eW.lz(), euzVar.a.pa(), euzVar.a.eW.K(), euzVar.a.y(), euzVar.a.eW.V(), euzVar.a.eS(), euzVar.a.pc());
            } else if (i == 2) {
                Resources c = this.a.a.eW.a.c();
                dxjg.e(c);
                return (T) new bsjf(c);
            } else if (i == 3) {
                Resources c2 = this.a.a.eW.a.c();
                dxjg.e(c2);
                return (T) new bsif(c2);
            } else if (i == 4) {
                return (T) new bsjg(this.a.a.a, new cqhn());
            } else {
                if (i != 5) {
                    euz euzVar2 = this.a;
                    cqhn cqhnVar = new cqhn();
                    Resources c3 = euzVar2.a.eW.a.c();
                    dxjg.e(c3);
                    return (T) new bsiy(cqhnVar, c3);
                }
                return (T) new bsip(new cqhn(), this.a.a.wk());
            }
        }
        return (T) new brzk(this.a.a.eW.il());
    }
}
