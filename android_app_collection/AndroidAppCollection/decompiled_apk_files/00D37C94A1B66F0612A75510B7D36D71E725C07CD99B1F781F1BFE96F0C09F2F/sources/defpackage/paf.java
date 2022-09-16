package defpackage;

import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: paf  reason: default package */
/* loaded from: classes4.dex */
final class paf {
    public final oyf a;
    public int b;
    public long c;
    public long d;
    public boolean f;
    public long g;
    public long h;
    public boolean i;
    private final SparseArray j = new SparseArray();
    private final SparseArray k = new SparseArray();
    public final pae e = new pae();

    public paf(oyf oyfVar) {
        this.a = oyfVar;
        b();
    }

    public final void a(pcq pcqVar) {
        this.j.append(pcqVar.a, pcqVar);
    }

    public final void b() {
        this.f = false;
    }

    public final void c(abtm abtmVar) {
        this.k.append(abtmVar.a, abtmVar);
    }
}
