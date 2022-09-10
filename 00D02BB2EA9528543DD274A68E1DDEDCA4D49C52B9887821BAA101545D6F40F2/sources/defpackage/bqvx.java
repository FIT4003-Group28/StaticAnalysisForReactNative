package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bqvx  reason: default package */
/* loaded from: classes4.dex */
public final class bqvx implements bqlb {
    final /* synthetic */ bqvz a;
    final /* synthetic */ bqwa b;

    public bqvx(bqwa bqwaVar, bqvz bqvzVar) {
        this.b = bqwaVar;
        this.a = bqvzVar;
    }

    @Override // defpackage.bqlb
    public final void d(bqlf bqlfVar) {
        try {
            this.a.a().a();
            this.a.c().d(bqlfVar);
            this.b.f();
            this.b.g();
        } catch (Throwable th) {
            this.b.f();
            throw th;
        }
    }

    @Override // defpackage.bqlb
    public final void e() {
        try {
            this.a.a().a();
            this.a.c().e();
            this.b.f();
            this.b.g();
        } catch (Throwable th) {
            this.b.f();
            throw th;
        }
    }
}
