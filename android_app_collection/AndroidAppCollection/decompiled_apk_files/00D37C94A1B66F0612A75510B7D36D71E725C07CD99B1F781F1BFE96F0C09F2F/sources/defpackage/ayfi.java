package defpackage;
/* compiled from: PG */
/* renamed from: ayfi  reason: default package */
/* loaded from: classes2.dex */
final class ayfi implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ ayfr b;

    public ayfi(ayfr ayfrVar, int i) {
        this.b = ayfrVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.d(this.a);
    }
}
