package c.e.a.a.i.z;

import android.util.SparseArray;
import c.e.a.a.d;
import java.util.EnumMap;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static SparseArray<d> f3827a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private static EnumMap<d, Integer> f3828b = new EnumMap<>(d.class);

    static {
        f3828b.put((EnumMap<d, Integer>) d.DEFAULT, (d) 0);
        f3828b.put((EnumMap<d, Integer>) d.VERY_LOW, (d) 1);
        f3828b.put((EnumMap<d, Integer>) d.HIGHEST, (d) 2);
        for (d dVar : f3828b.keySet()) {
            f3827a.append(f3828b.get(dVar).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = f3828b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d a(int i) {
        d dVar = f3827a.get(i);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
