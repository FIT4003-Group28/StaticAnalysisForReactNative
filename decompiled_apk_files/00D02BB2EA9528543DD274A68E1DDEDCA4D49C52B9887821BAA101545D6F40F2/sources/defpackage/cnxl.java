package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cnxl  reason: default package */
/* loaded from: classes5.dex */
public final class cnxl {
    public static <T> Set<T> a(int i, boolean z) {
        float f = true != z ? 1.0f : 0.75f;
        if (i <= (true != z ? 256 : 128)) {
            return new aih(i);
        }
        return new HashSet(i, f);
    }

    public static <T> List<T> b(T t) {
        ArrayList arrayList = new ArrayList(Math.max(1, 1));
        arrayList.add(t);
        return arrayList;
    }
}
