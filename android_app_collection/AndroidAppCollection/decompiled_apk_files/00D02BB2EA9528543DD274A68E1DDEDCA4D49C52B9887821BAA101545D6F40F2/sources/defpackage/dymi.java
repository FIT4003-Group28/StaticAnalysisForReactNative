package defpackage;
/* compiled from: PG */
/* renamed from: dymi  reason: default package */
/* loaded from: classes6.dex */
final class dymi implements Runnable {
    final /* synthetic */ StringBuilder a;
    final /* synthetic */ dymv b;

    public dymi(dymv dymvVar, StringBuilder sb) {
        this.b = dymvVar;
        this.a = sb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b(dyjb.f.g(this.a.toString()), true);
    }
}
