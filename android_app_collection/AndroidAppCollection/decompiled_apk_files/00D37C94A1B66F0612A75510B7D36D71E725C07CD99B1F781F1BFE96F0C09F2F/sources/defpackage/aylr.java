package defpackage;
/* compiled from: PG */
/* renamed from: aylr  reason: default package */
/* loaded from: classes2.dex */
final class aylr implements Runnable {
    final /* synthetic */ ayls a;
    private final /* synthetic */ int b;

    public aylr(ayls aylsVar) {
        this.a = aylsVar;
    }

    public aylr(ayls aylsVar, int i) {
        this.b = i;
        this.a = aylsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.b.f.execute(new ayln(this, null));
            return;
        }
        aylv aylvVar = this.a.b;
        if (aylvVar.y) {
            return;
        }
        aylvVar.u.e();
    }
}
