package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aklj  reason: default package */
/* loaded from: classes.dex */
public final class aklj extends ajwd implements aklk {
    public final ajrj a;
    private final List b;

    public aklj(avnd avndVar, Context context, aafo aafoVar) {
        avni avniVar;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        ajrj ajrjVar = new ajrj();
        this.a = ajrjVar;
        avnj avnjVar = avndVar.c;
        if ((avnjVar == null ? avnj.a : avnjVar).b == 92759253) {
            avnj avnjVar2 = avndVar.c;
            avnjVar2 = avnjVar2 == null ? avnj.a : avnjVar2;
            if (avnjVar2.b == 92759253) {
                avniVar = (avni) avnjVar2.c;
            } else {
                avniVar = avni.a;
            }
        } else {
            avniVar = null;
        }
        if (avniVar != null) {
            akll akllVar = new akll(avniVar, context, aafoVar);
            arrayList.add(akllVar);
            ajrjVar.m(akllVar.c);
        }
    }

    @Override // defpackage.aklk
    public final void b(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(this.b);
        for (aklk aklkVar : this.b) {
            aklkVar.b(arrayList);
        }
    }

    @Override // defpackage.aklk
    public final void c(ajsa ajsaVar) {
        for (aklk aklkVar : this.b) {
            aklkVar.c(ajsaVar);
        }
    }

    @Override // defpackage.ajyj
    public final ajqm lA() {
        return this.a;
    }
}
