package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
/* compiled from: PG */
/* renamed from: sdx  reason: default package */
/* loaded from: classes4.dex */
public final class sdx implements sdj {
    private final SortedMap a;

    public sdx(SortedMap sortedMap) {
        this.a = sortedMap;
    }

    @Override // defpackage.sdj
    public final List a(List list) {
        long j;
        ArrayList f = sbv.f(list.size());
        if (!list.isEmpty()) {
            if (list.size() < 2) {
                j = 0;
            } else {
                j = Long.MAX_VALUE;
                int i = 0;
                while (i <= list.size() - 2) {
                    long longValue = ((Double) list.get(i)).longValue();
                    i++;
                    j = Math.min(j, ((Double) list.get(i)).longValue() - longValue);
                }
            }
            SortedMap sortedMap = this.a;
            sef sefVar = (sef) sortedMap.get(sortedMap.firstKey());
            for (Map.Entry entry : this.a.entrySet()) {
                if (((Long) entry.getKey()).longValue() > j) {
                    break;
                }
                sefVar = (sef) entry.getValue();
            }
            Iterator it = list.iterator();
            Date date = new Date(((Double) it.next()).longValue());
            f.add(sefVar.a.format(date));
            while (it.hasNext()) {
                Date date2 = new Date(((Double) it.next()).longValue());
                sefVar.c.setTime(date);
                int i2 = sefVar.c.get(sefVar.b);
                sefVar.c.setTime(date2);
                if (sefVar.c.get(sefVar.b) != i2) {
                    f.add(sefVar.a.format(date2));
                } else {
                    f.add(sefVar.a(date2));
                }
                date = date2;
            }
        }
        return f;
    }
}
