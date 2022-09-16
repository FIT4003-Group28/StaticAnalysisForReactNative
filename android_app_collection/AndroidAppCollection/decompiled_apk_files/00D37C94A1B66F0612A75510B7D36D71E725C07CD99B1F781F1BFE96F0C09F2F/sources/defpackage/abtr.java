package defpackage;
/* compiled from: PG */
/* renamed from: abtr  reason: default package */
/* loaded from: classes.dex */
final class abtr implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ abtt b;

    public abtr(abtt abttVar, int i) {
        this.b = abttVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b(this.a);
    }
}
