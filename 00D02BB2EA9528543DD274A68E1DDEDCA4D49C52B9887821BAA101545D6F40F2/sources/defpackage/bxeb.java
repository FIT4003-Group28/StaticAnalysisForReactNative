package defpackage;
/* compiled from: PG */
/* renamed from: bxeb  reason: default package */
/* loaded from: classes4.dex */
final class bxeb implements Runnable {
    final /* synthetic */ bxef a;

    public bxeb(bxef bxefVar) {
        this.a = bxefVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        btxx btxxVar = this.a.e;
        if (btxxVar != null) {
            btxxVar.b();
        }
    }
}
