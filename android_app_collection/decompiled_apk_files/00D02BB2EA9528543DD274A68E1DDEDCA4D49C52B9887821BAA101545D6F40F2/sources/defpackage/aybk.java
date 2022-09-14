package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: aybk  reason: default package */
/* loaded from: classes3.dex */
final class aybk implements Comparator<Integer> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Integer num, Integer num2) {
        Integer num3 = num;
        Integer num4 = num2;
        if (num3.equals(num4)) {
            return 0;
        }
        if (num3.intValue() == -1) {
            return 1;
        }
        return (num4.intValue() != -1 && num3.intValue() > num4.intValue()) ? 1 : -1;
    }
}
