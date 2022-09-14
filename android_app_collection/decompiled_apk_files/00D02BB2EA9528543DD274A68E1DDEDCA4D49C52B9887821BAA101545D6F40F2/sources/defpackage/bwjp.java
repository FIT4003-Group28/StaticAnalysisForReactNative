package defpackage;
/* compiled from: PG */
/* renamed from: bwjp  reason: default package */
/* loaded from: classes4.dex */
final class bwjp implements Runnable {
    final /* synthetic */ bwjq a;

    public bwjp(bwjq bwjqVar) {
        this.a = bwjqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bwjw bwjwVar = this.a.a;
        dbsk.s(bwjwVar);
        bwjwVar.b();
    }
}
