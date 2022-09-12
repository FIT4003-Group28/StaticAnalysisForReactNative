package defpackage;
/* compiled from: PG */
/* renamed from: afmx  reason: default package */
/* loaded from: classes2.dex */
final class afmx implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ afmz b;

    public afmx(afmz afmzVar, String str) {
        this.b = afmzVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.a().f(this.a);
    }
}
