package defpackage;

import java.util.Comparator;
import java.util.Map;
/* renamed from: akrd  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class akrd implements Comparator {
    static final Comparator a = new akrd();

    private akrd() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int intValue;
        int intValue2;
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        Integer num = (Integer) entry.getValue();
        Integer num2 = (Integer) entry2.getValue();
        if (!num.equals(num2)) {
            intValue = num.intValue();
            intValue2 = num2.intValue();
        } else {
            intValue = ((Integer) entry.getKey()).intValue();
            intValue2 = ((Integer) entry2.getKey()).intValue();
        }
        return intValue - intValue2;
    }
}
