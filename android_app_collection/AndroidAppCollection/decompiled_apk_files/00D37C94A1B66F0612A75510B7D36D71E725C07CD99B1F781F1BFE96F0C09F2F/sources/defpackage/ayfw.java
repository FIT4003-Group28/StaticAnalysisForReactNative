package defpackage;
/* compiled from: PG */
/* renamed from: ayfw  reason: default package */
/* loaded from: classes2.dex */
final class ayfw implements Runnable {
    final /* synthetic */ axyr a;
    final /* synthetic */ aygi b;

    public ayfw(aygi aygiVar, axyr axyrVar) {
        this.b = aygiVar;
        this.a = axyrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.e.h(this.a);
    }
}
