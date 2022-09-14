package defpackage;
/* renamed from: csjm  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class csjm implements csiw {
    public static final csiw b = new csjm();

    private csjm() {
    }

    @Override // defpackage.csiw
    public final dehn a(dssj dssjVar) {
        final csim csimVar = (csim) dssjVar;
        return deha.a(new csiv(csimVar) { // from class: csjt
            private final csim a;

            {
                this.a = csimVar;
            }

            @Override // defpackage.csiv
            public final void a(dssi dssiVar) {
                ddhh ddhhVar = (ddhh) dssiVar;
                int i = this.a.a;
                if (ddhhVar.c) {
                    ddhhVar.bF();
                    ddhhVar.c = false;
                }
                ddhk ddhkVar = (ddhk) ddhhVar.b;
                ddhk ddhkVar2 = ddhk.k;
                ddhkVar.a |= 2;
                ddhkVar.c = i;
            }
        });
    }
}
