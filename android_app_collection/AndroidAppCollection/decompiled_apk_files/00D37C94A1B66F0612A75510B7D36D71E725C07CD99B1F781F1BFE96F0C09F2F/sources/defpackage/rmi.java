package defpackage;
/* compiled from: PG */
/* renamed from: rmi  reason: default package */
/* loaded from: classes4.dex */
final class rmi implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ long d;
    final /* synthetic */ rki e;

    public rmi(rki rkiVar, String str, String str2, String str3, long j) {
        this.e = rkiVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.a;
        if (str == null) {
            this.e.a.i.n().t(this.b, null);
            return;
        }
        this.e.a.i.n().t(this.b, new rnm(this.c, str, this.d));
    }
}
