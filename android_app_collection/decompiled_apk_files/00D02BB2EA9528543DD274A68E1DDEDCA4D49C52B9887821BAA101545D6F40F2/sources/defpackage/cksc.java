package defpackage;
/* compiled from: PG */
/* renamed from: cksc  reason: default package */
/* loaded from: classes4.dex */
final class cksc implements Runnable {
    final /* synthetic */ crfk a;
    final /* synthetic */ boolean b;
    final /* synthetic */ cksd c;

    public cksc(cksd cksdVar, crfk crfkVar, boolean z) {
        this.c = cksdVar;
        this.a = crfkVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b.a(this.a, this.b);
    }
}
