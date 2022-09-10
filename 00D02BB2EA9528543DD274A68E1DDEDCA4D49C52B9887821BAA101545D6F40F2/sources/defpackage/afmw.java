package defpackage;
/* compiled from: PG */
/* renamed from: afmw  reason: default package */
/* loaded from: classes2.dex */
final class afmw implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ afmz b;

    public afmw(afmz afmzVar, String str) {
        this.b = afmzVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.C(gfk.g(this.a, false), gfu.ACTIVITY_FRAGMENT, new gfs[0]);
    }
}
