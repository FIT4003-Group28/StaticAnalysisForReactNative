package defpackage;

import android.util.SparseBooleanArray;
/* compiled from: PG */
/* renamed from: pvz  reason: default package */
/* loaded from: classes4.dex */
public final class pvz {
    private final SparseBooleanArray a;

    public pvz(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i) {
        ptx.g(i, b());
        return this.a.keyAt(i);
    }

    public final int b() {
        return this.a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pvz) {
            return this.a.equals(((pvz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
