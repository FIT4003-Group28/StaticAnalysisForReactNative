package defpackage;

import java.util.Comparator;
/* renamed from: cmiy  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cmiy implements Comparator {
    static final Comparator a = new cmiy();

    private cmiy() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        dclu<Integer> dcluVar = cmjh.a;
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        } else if (num2.intValue() != -1) {
            return num.intValue() - num2.intValue();
        } else {
            return 1;
        }
    }
}
