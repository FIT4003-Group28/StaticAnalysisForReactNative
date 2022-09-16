package defpackage;
/* compiled from: PG */
/* renamed from: qpe  reason: default package */
/* loaded from: classes4.dex */
final class qpe implements Runnable {
    final /* synthetic */ qpj a;
    final /* synthetic */ int b;

    public qpe(qpj qpjVar, int i) {
        this.a = qpjVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.o.b(this.b);
    }
}
