package defpackage;
/* compiled from: PG */
/* renamed from: cevy  reason: default package */
/* loaded from: classes4.dex */
final class cevy implements mw<bvns> {
    private final cevz a;
    private final axhs b;
    private final String c;

    public cevy(cevz cevzVar, axhs axhsVar, String str) {
        this.a = cevzVar;
        this.b = axhsVar;
        this.c = str;
    }

    @Override // defpackage.mw
    public final /* bridge */ /* synthetic */ void a(bvns bvnsVar) {
        if (bvnsVar == bvns.BLOCK_ACTION_SUCCESS) {
            axgi j = this.b.j();
            if (j != null) {
                String str = this.c;
                for (axok axokVar : axok.values()) {
                    axgi.f(j.j(axokVar), str);
                }
            }
            ges gesVar = (ges) this.a;
            gga ggaVar = gesVar.aE;
            if (!gesVar.aD || ggaVar == null) {
                return;
            }
            ggaVar.w();
        }
    }
}
