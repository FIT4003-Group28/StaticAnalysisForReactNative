package defpackage;

import android.content.Intent;
import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: yiv  reason: default package */
/* loaded from: classes4.dex */
public final class yiv {
    public SparseArray a;

    public final boolean a(int i) {
        SparseArray sparseArray = this.a;
        return (sparseArray == null || sparseArray.get(i) == null) ? false : true;
    }

    public final boolean b(int i, int i2, Intent intent) {
        SparseArray sparseArray = this.a;
        if (sparseArray == null || sparseArray.get(i) == null) {
            return false;
        }
        ((yiu) this.a.get(i)).kC(i, i2, intent);
        SparseArray sparseArray2 = this.a;
        if (sparseArray2 == null) {
            return true;
        }
        sparseArray2.remove(i);
        return true;
    }
}
