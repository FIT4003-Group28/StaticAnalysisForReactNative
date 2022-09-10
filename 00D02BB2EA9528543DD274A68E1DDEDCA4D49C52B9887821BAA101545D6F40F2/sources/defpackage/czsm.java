package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: czsm  reason: default package */
/* loaded from: classes.dex */
public final class czsm extends gt {
    public final List<czsh> a;
    public final cznv b;
    private final Integer c;

    public czsm(gn gnVar, dubf dubfVar, Integer num, boolean z, cznv cznvVar) {
        super(gnVar);
        ArrayList arrayList = new ArrayList(dubfVar.e.size());
        for (dubq dubqVar : dubfVar.e) {
            int a = dubp.a(dubqVar.g);
            int i = (a == 0 ? 1 : a) - 2;
            if (i == 1) {
                arrayList.add(new czrs(dubqVar));
            } else if (i == 2) {
                arrayList.add(new czpk(dubqVar));
            } else if (i == 3) {
                arrayList.add(new czrb(dubqVar));
            } else if (i == 4) {
                arrayList.add(new czpx(dubqVar));
            }
        }
        if (czov.a(dyed.b(czov.a))) {
            if (cznvVar == cznv.CARD) {
                dtzt dtztVar = dubfVar.b;
                arrayList.add(new czss(dtztVar == null ? dtzt.f : dtztVar));
            }
        } else {
            dtzt dtztVar2 = dubfVar.b;
            arrayList.add(new czss(dtztVar2 == null ? dtzt.f : dtztVar2));
        }
        this.a = arrayList;
        if (z && !arrayList.isEmpty()) {
            arrayList.remove(0);
        }
        if (!arrayList.isEmpty()) {
            this.c = num;
            this.b = cznvVar;
            return;
        }
        throw new NullPointerException("Questions were missing!");
    }

    public static int s(fd fdVar) {
        return fdVar.o.getInt("QuestionIndex", -1);
    }

    @Override // defpackage.bas
    public final int OV() {
        return this.a.size();
    }

    @Override // defpackage.gt
    public final fd a(int i) {
        fd a = this.a.get(i).a(this.c, i);
        a.o.putInt("QuestionIndex", i);
        return a;
    }
}
