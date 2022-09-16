package defpackage;
/* compiled from: PG */
/* renamed from: ahqh  reason: default package */
/* loaded from: classes.dex */
final class ahqh implements Runnable {
    final /* synthetic */ ahqo a;
    private final /* synthetic */ int b;

    public ahqh(ahqo ahqoVar) {
        this.a = ahqoVar;
    }

    public ahqh(ahqo ahqoVar, int i) {
        this.b = i;
        this.a = ahqoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.k.f();
        } else if (i == 1) {
            this.a.k.a();
        } else {
            ahqo ahqoVar = this.a;
            ahqoVar.j.removeView(ahqoVar.k);
        }
    }
}
