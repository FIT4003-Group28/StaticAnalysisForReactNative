package defpackage;
/* compiled from: PG */
/* renamed from: vzq  reason: default package */
/* loaded from: classes4.dex */
final class vzq implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String[] c;
    final /* synthetic */ vzs d;

    public vzq(vzs vzsVar, String str, String str2, String[] strArr) {
        this.d = vzsVar;
        this.a = str;
        this.b = str2;
        this.c = strArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a.getWritableDatabase().delete(this.a, this.b, this.c);
        this.d.b.open();
    }
}
