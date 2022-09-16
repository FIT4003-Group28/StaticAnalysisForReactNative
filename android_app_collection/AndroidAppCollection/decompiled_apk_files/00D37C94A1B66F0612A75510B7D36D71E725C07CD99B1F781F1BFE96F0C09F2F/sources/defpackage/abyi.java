package defpackage;

import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: abyi  reason: default package */
/* loaded from: classes.dex */
public enum abyi {
    GOOD(0),
    POOR(1),
    BAD(2);
    
    private static final SparseArray d = new SparseArray();
    private final int f;

    static {
        abyi[] values;
        for (abyi abyiVar : values()) {
            d.put(abyiVar.f, abyiVar);
        }
    }

    abyi(int i) {
        this.f = i;
    }
}
