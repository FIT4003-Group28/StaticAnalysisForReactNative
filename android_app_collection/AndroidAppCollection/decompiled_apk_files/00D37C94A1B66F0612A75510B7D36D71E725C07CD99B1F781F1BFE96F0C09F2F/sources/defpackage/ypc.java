package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: ypc  reason: default package */
/* loaded from: classes4.dex */
final class ypc implements ayom {
    final /* synthetic */ Callable a;
    private aypg b;

    public ypc(Callable callable) {
        this.a = callable;
    }

    private final void e() {
        aypg aypgVar = this.b;
        if (aypgVar != null && !aypgVar.e()) {
            this.b.qr();
        }
        this.b = null;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        e();
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 76);
        sb.append("Lifecycle-scoped subscription disposed due to unrelated error in lifecycle: ");
        sb.append(valueOf);
        zep.d(sb.toString(), th);
    }

    @Override // defpackage.ayom
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            e();
        } else if (this.b != null) {
        } else {
            try {
                aypg aypgVar = (aypg) this.a.call();
                aypgVar.getClass();
                this.b = aypgVar;
            } catch (Exception e) {
                throw new ypd(e);
            }
        }
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
    }

    @Override // defpackage.ayom
    public final void sm() {
        e();
    }
}
