package defpackage;
/* compiled from: PG */
/* renamed from: zic  reason: default package */
/* loaded from: classes7.dex */
final class zic implements Runnable {
    final /* synthetic */ zie a;

    public zic(zie zieVar) {
        this.a = zieVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d.e();
        this.a.a.S(bvjk.jh, true);
        this.a.b.run();
    }
}
