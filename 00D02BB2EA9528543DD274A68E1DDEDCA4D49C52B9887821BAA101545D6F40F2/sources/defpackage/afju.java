package defpackage;
/* compiled from: PG */
/* renamed from: afju  reason: default package */
/* loaded from: classes2.dex */
final class afju implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ afjv b;

    public afju(afjv afjvVar, String str) {
        this.b = afjvVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.c.f(this.a);
    }
}
