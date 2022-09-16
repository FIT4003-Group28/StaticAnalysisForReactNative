package defpackage;
/* compiled from: PG */
/* renamed from: zhm  reason: default package */
/* loaded from: classes4.dex */
final class zhm implements ankb {
    final /* synthetic */ azam a;

    public zhm(azam azamVar) {
        this.a = azamVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        if (!this.a.e()) {
            this.a.a(th);
        }
    }

    @Override // defpackage.ankb
    public final void b(Object obj) {
        aypg aypgVar;
        if (!this.a.e()) {
            if (obj != null) {
                this.a.c(obj);
                return;
            }
            azam azamVar = this.a;
            if (azamVar.get() == ayqi.a || (aypgVar = (aypg) azamVar.getAndSet(ayqi.a)) == ayqi.a) {
                return;
            }
            try {
                azamVar.a.sm();
                if (aypgVar == null) {
                    return;
                }
                aypgVar.qr();
            } catch (Throwable th) {
                if (aypgVar != null) {
                    aypgVar.qr();
                }
                throw th;
            }
        }
    }
}
