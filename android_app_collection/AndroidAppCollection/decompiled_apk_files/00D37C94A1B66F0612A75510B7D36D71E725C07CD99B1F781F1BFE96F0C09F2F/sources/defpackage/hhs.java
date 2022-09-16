package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: hhs  reason: default package */
/* loaded from: classes3.dex */
final class hhs extends hhh {
    static final ampg a = new hhr();
    static final ampg b = new hhf();

    @Override // defpackage.hhh
    public final void a(axbm axbmVar, aqsl aqslVar) {
        if (axbmVar.n().b == 1) {
            axcs n = axbmVar.n();
            Map unmodifiableMap = Collections.unmodifiableMap((n.b == 1 ? (axcp) n.c : axcp.a).b);
            ArrayList arrayList = new ArrayList(unmodifiableMap.keySet());
            Collections.sort(arrayList);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Long l = (Long) arrayList.get(i);
                Double d = (Double) unmodifiableMap.get(l);
                if (d != null) {
                    aopa createBuilder = aqsk.a.createBuilder();
                    long longValue = l.longValue();
                    createBuilder.copyOnWrite();
                    aqsk aqskVar = (aqsk) createBuilder.instance;
                    aqskVar.b |= 1;
                    aqskVar.c = longValue;
                    double doubleValue = d.doubleValue();
                    createBuilder.copyOnWrite();
                    aqsk aqskVar2 = (aqsk) createBuilder.instance;
                    aqskVar2.b |= 2;
                    aqskVar2.d = doubleValue;
                    aqslVar.copyOnWrite();
                    ((aqsq) aqslVar.instance).g((aqsk) createBuilder.mo39build());
                }
            }
        }
    }
}
