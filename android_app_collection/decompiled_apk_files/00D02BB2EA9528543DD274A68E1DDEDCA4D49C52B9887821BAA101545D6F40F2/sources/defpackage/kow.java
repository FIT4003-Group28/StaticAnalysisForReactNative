package defpackage;

import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: kow  reason: default package */
/* loaded from: classes7.dex */
public final class kow {
    public final bvjj a;
    public final btrm b;
    public final cqkj c;
    public final lzf d;
    public final ViewGroup e;
    public final kov f = new kov(this);
    @dzsi
    public cqkf<kpc> g;
    @dzsi
    public cjqp h;

    public kow(bvjj bvjjVar, btrm btrmVar, cqkj cqkjVar, lzf lzfVar, ViewGroup viewGroup) {
        this.a = bvjjVar;
        this.b = btrmVar;
        this.c = cqkjVar;
        this.d = lzfVar;
        this.e = viewGroup;
    }

    public final void a() {
        cqkf<kpc> cqkfVar = this.g;
        if (cqkfVar != null) {
            this.e.removeView(cqkfVar.c());
            cqkfVar.e(null);
            this.g = null;
        }
    }
}
