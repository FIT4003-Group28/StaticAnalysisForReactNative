package defpackage;
/* compiled from: PG */
/* renamed from: bvr  reason: default package */
/* loaded from: classes2.dex */
final class bvr implements Runnable {
    final /* synthetic */ bwk a;

    public bvr(bwk bwkVar) {
        this.a = bwkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bwk bwkVar = this.a;
        bwk h = bwk.h();
        h.f(new IllegalStateException("Not implemented"));
        bwkVar.g(h);
    }
}
