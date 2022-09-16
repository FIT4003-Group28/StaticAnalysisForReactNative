package defpackage;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ahga  reason: default package */
/* loaded from: classes.dex */
public final class ahga {
    public final aeui a;
    public aijy[] b;
    public final /* synthetic */ ahgb c;
    private long d;

    public ahga(ahgb ahgbVar, aeui aeuiVar) {
        this.c = ahgbVar;
        this.a = aeuiVar;
    }

    public final long a() {
        long j;
        long j2;
        aeui aeuiVar = this.a;
        if (aeuiVar != null && this.b == null) {
            j2 = this.c.c;
            this.b = b(aeuiVar, j2);
        }
        j = this.c.c;
        return j + this.d;
    }

    public final aijy[] b(aeui aeuiVar, long j) {
        List i;
        List i2;
        List i3;
        i = ahgb.i(aeuiVar, "Stitched-Video-Id");
        i2 = ahgb.i(aeuiVar, "Stitched-Video-Duration-Us");
        i3 = ahgb.i(aeuiVar, "Stitched-Video-Cpn");
        int size = i.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            try {
                long millis = TimeUnit.MICROSECONDS.toMillis(Long.parseLong((String) i2.get(i5)));
                this.d += millis;
                long j2 = millis + j;
                String str = (String) i3.get(i5);
                if (linkedHashMap.containsKey(str)) {
                    j = ((Long) ((Pair) linkedHashMap.get(str)).first).longValue();
                    linkedHashMap.remove(str);
                }
                linkedHashMap.put(str, new Pair(Long.valueOf(j), Long.valueOf(j2)));
                j = j2;
            } catch (NumberFormatException unused) {
            }
        }
        aijy[] aijyVarArr = new aijy[linkedHashMap.size()];
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            aijyVarArr[i4] = new aijy((String) entry.getKey(), ((Long) ((Pair) entry.getValue()).first).longValue(), ((Long) ((Pair) entry.getValue()).second).longValue());
            i4++;
        }
        return aijyVarArr;
    }
}
