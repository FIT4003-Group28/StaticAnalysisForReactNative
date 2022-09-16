package defpackage;
/* compiled from: PG */
/* renamed from: otz  reason: default package */
/* loaded from: classes4.dex */
final class otz implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ oud c;

    public otz(oud oudVar, int i, int i2) {
        this.c = oudVar;
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.f(this.a, this.b);
    }
}
