package defpackage;
/* compiled from: PG */
/* renamed from: lyl  reason: default package */
/* loaded from: classes7.dex */
final class lyl implements Runnable {
    final /* synthetic */ lym a;

    public lyl(lym lymVar) {
        this.a = lymVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.c();
        lxy lxyVar = this.a.c;
        dbsk.s(lxyVar);
        this.a.b();
        this.a.d(lxyVar);
    }
}
