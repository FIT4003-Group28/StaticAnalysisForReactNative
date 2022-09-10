package defpackage;
/* compiled from: PG */
/* renamed from: awnp  reason: default package */
/* loaded from: classes3.dex */
final class awnp implements Runnable {
    final /* synthetic */ awnr a;

    public awnp(awnr awnrVar) {
        this.a = awnrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a.a.g.a.a(j.STARTED)) {
            return;
        }
        ggg i = this.a.i();
        if (i != null) {
            this.a.a.E(i);
            return;
        }
        if (this.a.a.K() instanceof ggg) {
            this.a.a.g().e();
        }
        this.a.m();
    }
}
