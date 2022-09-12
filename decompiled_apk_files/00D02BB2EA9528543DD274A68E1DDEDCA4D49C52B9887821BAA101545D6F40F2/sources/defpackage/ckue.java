package defpackage;
/* compiled from: PG */
/* renamed from: ckue  reason: default package */
/* loaded from: classes4.dex */
final class ckue implements Runnable {
    public boolean a;
    final /* synthetic */ ckuf b;

    public ckue(ckuf ckufVar) {
        this.b = ckufVar;
    }

    public final void a() {
        this.b.b.a(this, bvrj.WEARABLE_DATA, 60000L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            return;
        }
        ckuf ckufVar = this.b;
        if (ckufVar.i) {
            ckufVar.b();
        }
        a();
    }
}
