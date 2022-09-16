package defpackage;
/* compiled from: PG */
/* renamed from: aylc  reason: default package */
/* loaded from: classes2.dex */
final class aylc implements Runnable {
    final /* synthetic */ aylv a;

    public aylc(aylv aylvVar) {
        this.a = aylvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aylv aylvVar = this.a;
        if (!aylvVar.y) {
            aylvVar.u.e();
        }
    }
}
