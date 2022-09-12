package defpackage;

import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: clzg  reason: default package */
/* loaded from: classes5.dex */
final class clzg {
    public final clvk a;
    public int f;
    public long g;
    public boolean h;
    public long i;
    public boolean k;
    public long l;
    public long m;
    public boolean n;
    public final boolean b = false;
    public final boolean c = false;
    private final SparseArray<cmnh> o = new SparseArray<>();
    private final SparseArray<cmng> p = new SparseArray<>();
    public final clzf j = new clzf();
    public byte[] e = new byte[128];
    public final cmnl d = new cmnl(this.e, 0, 0);

    public clzg(clvk clvkVar) {
        this.a = clvkVar;
        c();
    }

    public final void a(cmnh cmnhVar) {
        this.o.append(cmnhVar.d, cmnhVar);
    }

    public final void b(cmng cmngVar) {
        this.p.append(cmngVar.a, cmngVar);
    }

    public final void c() {
        this.h = false;
        this.k = false;
        this.j.a = false;
    }
}
