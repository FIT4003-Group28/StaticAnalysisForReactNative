package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cpoz  reason: default package */
/* loaded from: classes5.dex */
public final class cpoz<T, D> implements cpoi<T, D> {
    @Override // defpackage.cpoi
    public final String a(List<cpog<T, D>> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (cpog<T, D> cpogVar : list) {
            cpvi<T, D> cpviVar = cpogVar.a.a;
            i += cpogVar.a();
            arrayList.add(cpogVar);
        }
        StringBuilder sb = new StringBuilder();
        if (i > 6) {
            sb.append("Showing ");
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                cpvi<T, D> cpviVar2 = ((cpog) arrayList.get(i2)).a.a;
                sb.append(String.format("%s with %d data points", (String) cpviVar2.h(cpvj.c, cpviVar2.f), Integer.valueOf(((cpog) arrayList.get(i2)).a())));
                if (i2 == arrayList.size() - 2) {
                    sb.append(" and ");
                } else if (i2 < arrayList.size() - 2) {
                    sb.append(", ");
                }
            }
            sb.append(".");
        } else {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                cpog cpogVar2 = (cpog) arrayList.get(i3);
                cpvi cpviVar3 = (cpvi<T, D>) cpogVar2.a.a;
                sb.append((String) cpviVar3.h(cpvj.c, cpviVar3.f));
                sb.append(": ");
                List<T> list2 = cpviVar3.e;
                cpve<T, String> f = cpogVar2.a.a.f(cpvf.f, cpvf.a);
                cpot cpotVar = cpogVar2.a;
                cpve<T, String> f2 = cpotVar.a.f(cpvf.g, cpotVar.b);
                for (int i4 = 0; i4 < list2.size(); i4++) {
                    sb.append(String.format("%s at %s", f.a(list2.get(i4), i4, cpviVar3), f2.a(list2.get(i4), i4, cpviVar3)));
                    if (i4 < list2.size() - 1) {
                        sb.append(", ");
                    }
                }
                sb.append(". ");
            }
        }
        return sb.toString();
    }
}
