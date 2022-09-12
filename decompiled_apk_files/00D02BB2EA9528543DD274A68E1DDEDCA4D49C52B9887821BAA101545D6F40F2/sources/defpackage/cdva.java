package defpackage;
/* compiled from: PG */
/* renamed from: cdva  reason: default package */
/* loaded from: classes4.dex */
final class cdva implements Runnable {
    final /* synthetic */ cduz a;
    final /* synthetic */ cdvc b;

    public cdva(cduz cduzVar, cdvc cdvcVar) {
        this.a = cduzVar;
        this.b = cdvcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.t.a(this.a.b);
    }
}
