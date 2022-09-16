package defpackage;

import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sah  reason: default package */
/* loaded from: classes4.dex */
public final class sah implements saw {
    final /* synthetic */ sai a;

    public sah(sai saiVar) {
        this.a = saiVar;
    }

    @Override // defpackage.saw
    public final int a() {
        return 100;
    }

    @Override // defpackage.saw
    public final String b() {
        ArrayList<sag> d = sbv.d();
        for (sat satVar : this.a.u) {
            d.add(new sag(satVar));
        }
        dkr dkrVar = this.a.B;
        ArrayList arrayList = new ArrayList(d.size());
        int i = 0;
        for (sag sagVar : d) {
            sgt sgtVar = sagVar.a.a;
            i += sagVar.a();
            arrayList.add(sagVar);
        }
        StringBuilder sb = new StringBuilder();
        int i2 = dkrVar.c;
        if (i > 6) {
            sb.append("Showing ");
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                sgt sgtVar2 = ((sag) arrayList.get(i3)).a.a;
                sb.append(String.format("%s with %d data points", (String) sgtVar2.e(sgu.c, sgtVar2.b), Integer.valueOf(((sag) arrayList.get(i3)).a())));
                if (i3 == arrayList.size() - 2) {
                    sb.append(" and ");
                } else if (i3 < arrayList.size() - 2) {
                    sb.append(", ");
                }
            }
            sb.append(".");
        } else {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                sag sagVar2 = (sag) arrayList.get(i4);
                sgt sgtVar3 = sagVar2.a.a;
                sb.append((String) sgtVar3.e(sgu.c, sgtVar3.b));
                sb.append(": ");
                List list = sgtVar3.a;
                sgp b = sagVar2.a.b();
                sgp a = sagVar2.a.a();
                for (int i5 = 0; i5 < list.size(); i5++) {
                    sb.append(String.format("%s at %s", (String) b.a(list.get(i5), i5, sgtVar3), (String) a.a(list.get(i5), i5, sgtVar3)));
                    if (i5 < list.size() - 1) {
                        sb.append(", ");
                    }
                }
                sb.append(". ");
            }
        }
        return sb.toString();
    }
}
