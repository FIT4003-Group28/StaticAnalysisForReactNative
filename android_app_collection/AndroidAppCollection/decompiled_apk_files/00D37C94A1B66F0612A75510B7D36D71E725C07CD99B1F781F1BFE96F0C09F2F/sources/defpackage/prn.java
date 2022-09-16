package defpackage;

import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: prn  reason: default package */
/* loaded from: classes4.dex */
final class prn {
    public int a;
    public final SparseArray b;
    public final pvu c;

    public prn() {
        pee peeVar = pee.f;
        throw null;
    }

    public final Object a(int i) {
        if (this.a == -1) {
            this.a = 0;
        }
        while (true) {
            int i2 = this.a;
            if (i2 > 0 && i < this.b.keyAt(i2)) {
                this.a--;
            }
        }
        while (this.a < this.b.size() - 1 && i >= this.b.keyAt(this.a + 1)) {
            this.a++;
        }
        return this.b.valueAt(this.a);
    }

    public final Object b() {
        SparseArray sparseArray = this.b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public final boolean c() {
        return this.b.size() == 0;
    }

    public prn(pvu pvuVar) {
        this.b = new SparseArray();
        this.c = pvuVar;
        this.a = -1;
    }
}
