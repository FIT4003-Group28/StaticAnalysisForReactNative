package defpackage;

import android.util.LongSparseArray;
/* compiled from: PG */
@btsb
/* renamed from: amuj  reason: default package */
/* loaded from: classes2.dex */
public final class amuj {
    public final LongSparseArray<Double> a;
    private final LongSparseArray<Double> b;

    public amuj(LongSparseArray<Double> longSparseArray, LongSparseArray<Double> longSparseArray2) {
        this.a = longSparseArray;
        this.b = longSparseArray2;
    }

    @dzsi
    public final Double a(amub amubVar) {
        return this.b.get(amubVar.W);
    }
}
