package defpackage;
/* compiled from: PG */
/* renamed from: qyw  reason: default package */
/* loaded from: classes4.dex */
final class qyw implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ qyx b;

    public qyw(qyx qyxVar, String str) {
        this.b = qyxVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.a(this.a);
    }
}
