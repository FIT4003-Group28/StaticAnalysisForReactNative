package defpackage;
/* compiled from: PG */
/* renamed from: ayfx  reason: default package */
/* loaded from: classes2.dex */
final class ayfx implements Runnable {
    final /* synthetic */ axzb a;
    final /* synthetic */ aygi b;

    public ayfx(aygi aygiVar, axzb axzbVar) {
        this.b = aygiVar;
        this.a = axzbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.e.j(this.a);
    }
}
