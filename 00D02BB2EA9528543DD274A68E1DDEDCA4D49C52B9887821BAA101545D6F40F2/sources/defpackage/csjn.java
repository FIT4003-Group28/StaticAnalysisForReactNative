package defpackage;
/* renamed from: csjn  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class csjn implements csiw {
    public static final csiw b = new csjn();

    private csjn() {
    }

    @Override // defpackage.csiw
    public final dehn a(dssj dssjVar) {
        final dtbc dtbcVar = (dtbc) dssjVar;
        return deha.a(new csiv(dtbcVar) { // from class: csjs
            private final dtbc a;

            {
                this.a = dtbcVar;
            }

            @Override // defpackage.csiv
            public final void a(dssi dssiVar) {
                dtbc dtbcVar2 = this.a;
                ddhh ddhhVar = (ddhh) dssiVar;
                if (ddhhVar.c) {
                    ddhhVar.bF();
                    ddhhVar.c = false;
                }
                ddhk ddhkVar = (ddhk) ddhhVar.b;
                ddhk ddhkVar2 = ddhk.k;
                dtbcVar2.getClass();
                ddhkVar.g = dtbcVar2;
                ddhkVar.a |= 16;
            }
        });
    }
}
