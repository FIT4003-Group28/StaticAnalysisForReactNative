package defpackage;

import android.util.SparseIntArray;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: fqj  reason: default package */
/* loaded from: classes3.dex */
public final class fqj {
    private final SparseIntArray b = new SparseIntArray(4);
    private final Set c = Collections.newSetFromMap(new WeakHashMap());
    public int a = 0;

    public final void a(fqi fqiVar) {
        this.c.add(fqiVar);
    }

    public final void b(fqi fqiVar) {
        this.c.remove(fqiVar);
    }

    public final void c(int i, int i2) {
        this.b.put(i, i2);
        int i3 = 0;
        for (int i4 = 0; i4 < this.b.size(); i4++) {
            i3 += this.b.valueAt(i4);
        }
        if (this.a == i3) {
            return;
        }
        this.a = i3;
        for (fqi fqiVar : this.c) {
            fqiVar.a();
        }
    }
}
