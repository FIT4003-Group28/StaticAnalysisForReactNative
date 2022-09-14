package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
/* compiled from: PG */
/* renamed from: cpwj  reason: default package */
/* loaded from: classes5.dex */
public final class cpwj {
    public static <K, V> HashMap<K, V> a() {
        return new HashMap<>();
    }

    public static <K, V> HashMap<K, V> b(int i) {
        cpwl.c(i >= 0, "expectedSize should be greater than or equal to 0");
        return new HashMap<>(d(i));
    }

    public static <K, V> LinkedHashMap<K, V> c() {
        return new LinkedHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i <= 1073741823) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
