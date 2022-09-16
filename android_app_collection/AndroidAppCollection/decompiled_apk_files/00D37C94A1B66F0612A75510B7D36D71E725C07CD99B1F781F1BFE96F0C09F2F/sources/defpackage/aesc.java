package defpackage;
/* compiled from: PG */
/* renamed from: aesc  reason: default package */
/* loaded from: classes.dex */
final class aesc extends cet {
    final /* synthetic */ aesd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aesc(aesd aesdVar) {
        super(30000, 4, 1.0f);
        this.b = aesdVar;
    }

    @Override // defpackage.cet, defpackage.cfc
    public final void c(cff cffVar) {
        aesd aesdVar;
        afvy afvyVar;
        if (cffVar instanceof ceq) {
            if (this.a > 0) {
                throw cffVar;
            }
            if (!this.b.a.z() && (afvyVar = (aesdVar = this.b).b) != null) {
                afki afkiVar = afki.ABR;
                afvyVar.a(aesdVar.a).b(this.b.a);
                this.b.t();
            }
        }
        super.c(cffVar);
    }
}
