package defpackage;
/* compiled from: PG */
/* renamed from: ahsk  reason: default package */
/* loaded from: classes.dex */
final class ahsk implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ ahso b;

    public ahsk(ahso ahsoVar, boolean z) {
        this.b = ahsoVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.i(this.a);
    }
}
