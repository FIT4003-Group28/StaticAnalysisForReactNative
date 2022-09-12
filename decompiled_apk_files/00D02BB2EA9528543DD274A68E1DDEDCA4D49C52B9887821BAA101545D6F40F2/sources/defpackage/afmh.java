package defpackage;
/* compiled from: PG */
/* renamed from: afmh  reason: default package */
/* loaded from: classes2.dex */
final class afmh implements Runnable {
    final /* synthetic */ dwir a;
    final /* synthetic */ afmj b;

    public afmh(afmj afmjVar, dwir dwirVar) {
        this.b = afmjVar;
        this.a = dwirVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.a().s(this.a, null);
    }
}
