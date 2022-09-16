package defpackage;
/* compiled from: PG */
/* renamed from: qph  reason: default package */
/* loaded from: classes4.dex */
final class qph implements Runnable {
    final /* synthetic */ qpj a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    public qph(qpj qpjVar, String str, String str2) {
        this.a = qpjVar;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qjh qjhVar;
        synchronized (this.a.d) {
            qjhVar = (qjh) this.a.d.get(this.b);
        }
        if (qjhVar != null) {
            qjhVar.a(this.b, this.c);
        }
    }
}
