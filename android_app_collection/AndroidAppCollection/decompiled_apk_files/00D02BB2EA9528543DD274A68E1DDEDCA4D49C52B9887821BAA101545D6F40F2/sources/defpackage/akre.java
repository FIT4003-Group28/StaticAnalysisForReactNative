package defpackage;

import java.util.Comparator;
import java.util.Map;
/* renamed from: akre  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class akre implements Comparator {
    static final Comparator a = new akre();

    private akre() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        Integer num = (Integer) entry.getValue();
        Integer num2 = (Integer) entry2.getValue();
        if (!num.equals(num2)) {
            return num2.intValue() - num.intValue();
        }
        return ((Integer) entry2.getKey()).intValue() - ((Integer) entry.getKey()).intValue();
    }
}
