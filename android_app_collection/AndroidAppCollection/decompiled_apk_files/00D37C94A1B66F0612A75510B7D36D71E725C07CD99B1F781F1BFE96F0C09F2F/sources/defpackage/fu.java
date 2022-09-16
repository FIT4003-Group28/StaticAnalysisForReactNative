package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fu  reason: default package */
/* loaded from: classes3.dex */
public final class fu implements Runnable {
    final /* synthetic */ fv a;
    final /* synthetic */ fy b;
    private final /* synthetic */ int c;

    public fu(fy fyVar, fv fvVar) {
        this.b = fyVar;
        this.a = fvVar;
    }

    public fu(fy fyVar, fv fvVar, int i) {
        this.c = i;
        this.b = fyVar;
        this.a = fvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            this.b.b.remove(this.a);
            this.b.c.remove(this.a);
        } else if (!this.b.b.contains(this.a)) {
        } else {
            fv fvVar = this.a;
            iy.E(fvVar.e, fvVar.a.O);
        }
    }
}
