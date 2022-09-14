package defpackage;

import android.content.Context;
import android.util.SparseIntArray;
/* compiled from: PG */
/* renamed from: cnvi  reason: default package */
/* loaded from: classes.dex */
public final class cnvi {
    private final SparseIntArray a;
    private cnmr b;

    public cnvi() {
        cnmq cnmqVar = cnmq.a;
        throw null;
    }

    public final int a(Context context, cnnz cnnzVar) {
        cnwc.a(context);
        cnwc.a(cnnzVar);
        int i = 0;
        if (!cnnzVar.t()) {
            return 0;
        }
        int c = cnnzVar.c();
        int c2 = c(c);
        if (c2 == -1) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.a.size()) {
                    i = -1;
                    break;
                }
                int keyAt = this.a.keyAt(i2);
                if (keyAt > c && this.a.get(keyAt) == 0) {
                    break;
                }
                i2++;
            }
            c2 = i == -1 ? this.b.j(context, c) : i;
            this.a.put(c, c2);
        }
        return c2;
    }

    public final void b() {
        this.a.clear();
    }

    public final int c(int i) {
        return this.a.get(i, -1);
    }

    public cnvi(cnmr cnmrVar) {
        this.a = new SparseIntArray();
        cnwc.a(cnmrVar);
        this.b = cnmrVar;
    }
}
