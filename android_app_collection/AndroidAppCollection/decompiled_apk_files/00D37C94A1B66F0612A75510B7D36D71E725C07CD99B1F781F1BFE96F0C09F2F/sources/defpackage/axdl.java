package defpackage;
/* compiled from: PG */
/* renamed from: axdl  reason: default package */
/* loaded from: classes2.dex */
final class axdl implements Runnable {
    final /* synthetic */ ouy a;
    final /* synthetic */ axdn b;

    public axdl(axdn axdnVar, ouy ouyVar) {
        this.b = axdnVar;
        this.a = ouyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.e(this.a);
    }
}
