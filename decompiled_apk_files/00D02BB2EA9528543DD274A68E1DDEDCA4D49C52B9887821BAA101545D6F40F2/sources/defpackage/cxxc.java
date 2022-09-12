package defpackage;

import java.util.Comparator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cxxc  reason: default package */
/* loaded from: classes5.dex */
final class cxxc implements Comparator<Map.Entry<cxwm, Double>> {
    final /* synthetic */ Map a;

    public cxxc(Map map) {
        this.a = map;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Map.Entry<cxwm, Double> entry, Map.Entry<cxwm, Double> entry2) {
        Map.Entry<cxwm, Double> entry3 = entry;
        Map.Entry<cxwm, Double> entry4 = entry2;
        if (entry3.getValue().doubleValue() > entry4.getValue().doubleValue()) {
            return 1;
        }
        if (entry3.getValue().doubleValue() < entry4.getValue().doubleValue()) {
            return -1;
        }
        String a = entry3.getKey().a();
        String a2 = entry4.getKey().a();
        int intValue = ((Integer) this.a.get(a2)).intValue() - ((Integer) this.a.get(a)).intValue();
        return intValue == 0 ? a.compareToIgnoreCase(a2) : intValue;
    }
}
