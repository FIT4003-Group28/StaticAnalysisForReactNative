package defpackage;
/* compiled from: PG */
/* renamed from: biaf  reason: default package */
/* loaded from: classes3.dex */
final class biaf implements amfq {
    final /* synthetic */ biag a;

    public biaf(biag biagVar) {
        this.a = biagVar;
    }

    @Override // defpackage.amfq
    public final void a(amfu amfuVar) {
        if (amfuVar != null) {
            if (amfuVar.a()) {
                cqtd j = amfuVar.j();
                if (j != null) {
                    biag biagVar = this.a;
                    biagVar.d = j;
                    biagVar.c = true;
                    this.a.l().m();
                    return;
                }
            } else if (amfuVar.b() == 0) {
                amfuVar.e(true);
                return;
            }
        }
        this.a.l().o(this.a);
        this.a.l().m();
    }
}
