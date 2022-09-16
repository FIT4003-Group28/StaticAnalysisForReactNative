package defpackage;
/* compiled from: PG */
/* renamed from: ahqi  reason: default package */
/* loaded from: classes.dex */
final class ahqi implements Runnable {
    final /* synthetic */ float a;
    final /* synthetic */ ahqo b;

    public ahqi(ahqo ahqoVar, float f) {
        this.b = ahqoVar;
        this.a = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.k.g(this.a);
    }
}
