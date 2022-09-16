package defpackage;
/* compiled from: PG */
/* renamed from: alg  reason: default package */
/* loaded from: classes.dex */
final class alg implements Runnable {
    final /* synthetic */ ji a;
    final /* synthetic */ Object b;

    public alg(ji jiVar, Object obj) {
        this.a = jiVar;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.accept(this.b);
    }
}
