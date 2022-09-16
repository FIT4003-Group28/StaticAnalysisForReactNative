package defpackage;
/* compiled from: PG */
/* renamed from: ayfz  reason: default package */
/* loaded from: classes2.dex */
final class ayfz implements Runnable {
    final /* synthetic */ axyy a;
    final /* synthetic */ aygi b;

    public ayfz(aygi aygiVar, axyy axyyVar) {
        this.b = aygiVar;
        this.a = axyyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.e.i(this.a);
    }
}
