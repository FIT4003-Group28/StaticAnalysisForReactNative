package defpackage;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dlk  reason: default package */
/* loaded from: classes3.dex */
public final class dlk {
    final SparseArray a = new SparseArray();
    final Map b = new HashMap();
    public final int c;
    private final boolean d;
    private int e;

    public dlk(boolean z, int i) {
        this.d = z;
        this.c = i;
        this.e = i + 1;
    }

    public final void a(dlj dljVar) {
        int i;
        if (!dljVar.k() || dljVar == dkn.a) {
            return;
        }
        if (!this.d) {
            dljVar.o();
            if (!this.d || this.c != dljVar.a()) {
                diq d = dljVar.d();
                if (this.b.containsKey(d)) {
                    i = ((Integer) this.b.get(d)).intValue();
                } else {
                    dljVar.o();
                    int i2 = this.e;
                    this.e = i2 + 1;
                    this.a.put(i2, d);
                    this.b.put(d, Integer.valueOf(i2));
                    i = i2;
                }
                dljVar.o();
                dljVar.g(i);
                return;
            }
            throw new IllegalStateException("CustomViewType cannot be the same as ComponentViewType.");
        }
        dljVar.o();
        throw new IllegalStateException("If you enable custom viewTypes, you must provide a customViewType in ViewRenderInfo.");
    }
}
