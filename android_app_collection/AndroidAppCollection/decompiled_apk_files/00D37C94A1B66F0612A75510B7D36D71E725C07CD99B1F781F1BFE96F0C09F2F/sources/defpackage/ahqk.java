package defpackage;
/* compiled from: PG */
/* renamed from: ahqk  reason: default package */
/* loaded from: classes.dex */
final class ahqk implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ ahqo b;

    public ahqk(ahqo ahqoVar, int i) {
        this.b = ahqoVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.k.h(this.a, 0);
    }
}
