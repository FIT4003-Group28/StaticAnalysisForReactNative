package defpackage;
/* compiled from: PG */
/* renamed from: aznq  reason: default package */
/* loaded from: classes2.dex */
final class aznq implements Runnable {
    final aznp a;
    final /* synthetic */ aznr b;

    public aznq(aznr aznrVar, aznp aznpVar) {
        this.b = aznrVar;
        this.a = aznpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d = true;
        this.b.a.remove(this.a);
    }
}
