package defpackage;

import android.util.SparseArray;
import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: clil  reason: default package */
/* loaded from: classes5.dex */
public final class clil {
    private static SparseArray<clcv> a = new SparseArray<>();
    private static EnumMap<clcv, Integer> b;

    static {
        EnumMap<clcv, Integer> enumMap = new EnumMap<>(clcv.class);
        b = enumMap;
        enumMap.put((EnumMap<clcv, Integer>) clcv.DEFAULT, (clcv) 0);
        b.put((EnumMap<clcv, Integer>) clcv.VERY_LOW, (clcv) 1);
        b.put((EnumMap<clcv, Integer>) clcv.HIGHEST, (clcv) 2);
        for (clcv clcvVar : b.keySet()) {
            a.append(b.get(clcvVar).intValue(), clcvVar);
        }
    }

    public static clcv a(int i) {
        clcv clcvVar = a.get(i);
        if (clcvVar != null) {
            return clcvVar;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown Priority for value ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int b(clcv clcvVar) {
        Integer num = b.get(clcvVar);
        if (num != null) {
            return num.intValue();
        }
        String valueOf = String.valueOf(clcvVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
        sb.append("PriorityMapping is missing known Priority value ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }
}
