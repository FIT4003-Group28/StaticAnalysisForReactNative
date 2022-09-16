package defpackage;

import android.util.SparseIntArray;
/* compiled from: PG */
/* renamed from: abkw  reason: default package */
/* loaded from: classes.dex */
public final class abkw {
    private static final SparseIntArray a = new abkt();
    private static final SparseIntArray b = new abku();
    private final SparseIntArray c;

    public abkw(abkv abkvVar) {
        SparseIntArray sparseIntArray;
        abkv abkvVar2 = abkv.DARK;
        int ordinal = abkvVar.ordinal();
        if (ordinal != 0) {
            sparseIntArray = ordinal != 1 ? null : b;
        } else {
            sparseIntArray = a;
        }
        sparseIntArray.getClass();
        this.c = sparseIntArray;
    }

    public final int a(int i) {
        if (this.c.indexOfKey(i) >= 0) {
            return this.c.get(i);
        }
        return 0;
    }
}
