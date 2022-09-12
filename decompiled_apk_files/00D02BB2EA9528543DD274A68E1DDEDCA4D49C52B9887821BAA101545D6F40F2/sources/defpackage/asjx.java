package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: asjx  reason: default package */
/* loaded from: classes2.dex */
public final class asjx {
    @dzsi
    public static Long a(List<eapd> list) {
        if (list.size() > 1) {
            long j = 0;
            int i = 0;
            while (i < list.size() - 1) {
                int i2 = i + 1;
                long j2 = (list.get(i2).a - list.get(i).a) - 33;
                if (j2 > 0) {
                    j += j2;
                }
                i = i2;
            }
            double d = j;
            double d2 = ((eapd) dcft.s(list)).a - list.get(0).a;
            Double.isNaN(d);
            Double.isNaN(d2);
            return Long.valueOf((long) ((d / d2) * 1000.0d));
        }
        return null;
    }
}
