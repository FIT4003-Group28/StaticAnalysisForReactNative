package defpackage;

import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: agna  reason: default package */
/* loaded from: classes.dex */
public enum agna {
    EMPTY(0),
    FORECASTING(1),
    FULL(2);
    
    static final SparseArray d = new SparseArray();
    public final int e;

    static {
        agna[] values;
        for (agna agnaVar : values()) {
            d.put(agnaVar.e, agnaVar);
        }
    }

    agna(int i) {
        this.e = i;
    }
}
