package defpackage;
/* compiled from: PG */
/* renamed from: aylj  reason: default package */
/* loaded from: classes2.dex */
final class aylj implements Runnable {
    final aylh a;
    final /* synthetic */ aylv b;

    public aylj(aylv aylvVar, aylh aylhVar) {
        this.b = aylvVar;
        this.a = aylhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f.execute(new ayli(this));
    }
}
