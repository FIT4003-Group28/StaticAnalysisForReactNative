package defpackage;

import android.util.LongSparseArray;
/* compiled from: PG */
/* renamed from: vtr  reason: default package */
/* loaded from: classes7.dex */
public final class vtr {
    public final bvrb a;
    public final btrm b;
    public final LongSparseArray<amkz> c = new LongSparseArray<>();
    public dcep<amub> d = dcmr.a;
    public boolean e;

    public vtr(bvrb bvrbVar, btrm btrmVar) {
        this.a = bvrbVar;
        this.b = btrmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(Iterable<amub> iterable) {
        this.d = dcep.L(iterable);
        this.c.clear();
    }
}
