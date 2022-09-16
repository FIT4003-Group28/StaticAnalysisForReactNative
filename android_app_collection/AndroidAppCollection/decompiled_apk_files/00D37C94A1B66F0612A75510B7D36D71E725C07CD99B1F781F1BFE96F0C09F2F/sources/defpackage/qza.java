package defpackage;
/* compiled from: PG */
/* renamed from: qza  reason: default package */
/* loaded from: classes4.dex */
final class qza implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ qzb b;

    public qza(qzb qzbVar, String str) {
        this.b = qzbVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.g.a(this.a);
    }
}
