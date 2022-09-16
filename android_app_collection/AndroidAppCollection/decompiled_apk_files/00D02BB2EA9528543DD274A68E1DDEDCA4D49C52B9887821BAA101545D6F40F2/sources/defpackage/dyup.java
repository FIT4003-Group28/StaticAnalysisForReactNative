package defpackage;
/* compiled from: PG */
/* renamed from: dyup  reason: default package */
/* loaded from: classes6.dex */
final class dyup implements Runnable {
    final /* synthetic */ dyuq a;

    public dyup(dyuq dyuqVar) {
        this.a = dyuqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b.i.execute(new dyuo(this));
    }
}
