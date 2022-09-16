package defpackage;
/* compiled from: PG */
/* renamed from: aqz  reason: default package */
/* loaded from: classes2.dex */
final class aqz implements Runnable {
    final /* synthetic */ ara a;

    public aqz(ara araVar) {
        this.a = araVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ara araVar = this.a;
        araVar.e.c.remove(araVar.f.a());
    }
}
