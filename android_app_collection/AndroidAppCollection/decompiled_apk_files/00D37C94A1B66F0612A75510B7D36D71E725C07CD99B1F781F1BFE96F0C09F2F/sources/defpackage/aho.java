package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: aho  reason: default package */
/* loaded from: classes.dex */
public class aho extends ahh {
    public ArrayList aH = new ArrayList();

    public void T() {
        ArrayList arrayList = this.aH;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ahh ahhVar = (ahh) this.aH.get(i);
            if (ahhVar instanceof aho) {
                ((aho) ahhVar).T();
            }
        }
    }

    public final void Y(ahh ahhVar) {
        this.aH.remove(ahhVar);
        ahhVar.s();
    }

    @Override // defpackage.ahh
    public void s() {
        this.aH.clear();
        super.s();
    }

    @Override // defpackage.ahh
    public final void u(agx agxVar) {
        super.u(agxVar);
        int size = this.aH.size();
        for (int i = 0; i < size; i++) {
            ((ahh) this.aH.get(i)).u(agxVar);
        }
    }
}
