package defpackage;
/* compiled from: PG */
/* renamed from: axdk  reason: default package */
/* loaded from: classes2.dex */
final class axdk implements Runnable {
    final /* synthetic */ oux a;
    final /* synthetic */ axdn b;

    public axdk(axdn axdnVar, oux ouxVar) {
        this.b = axdnVar;
        this.a = ouxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.d(this.a);
    }
}
