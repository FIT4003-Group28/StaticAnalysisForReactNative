package defpackage;
/* compiled from: PG */
/* renamed from: aajw  reason: default package */
/* loaded from: classes.dex */
final class aajw implements aypg {
    private final aypg a;
    private final aajy b;

    public aajw(aypg aypgVar, aajy aajyVar) {
        this.a = aypgVar;
        this.b = aajyVar;
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.a.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.a.qr();
        aajy aajyVar = this.b;
        if (!aajyVar.a.aJ()) {
            aajyVar.sm();
        }
    }
}
