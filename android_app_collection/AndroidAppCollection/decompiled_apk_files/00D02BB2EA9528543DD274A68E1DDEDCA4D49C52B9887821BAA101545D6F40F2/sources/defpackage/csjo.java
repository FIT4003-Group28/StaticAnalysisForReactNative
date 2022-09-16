package defpackage;
/* renamed from: csjo  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class csjo implements csiw {
    public static final csiw b = new csjo();

    private csjo() {
    }

    @Override // defpackage.csiw
    public final dehn a(dssj dssjVar) {
        final csjb csjbVar = (csjb) dssjVar;
        return deha.a(new csiv(csjbVar) { // from class: csjr
            private final csjb a;

            {
                this.a = csjbVar;
            }

            @Override // defpackage.csiv
            public final void a(dssi dssiVar) {
                csjb csjbVar2 = this.a;
                ddhh ddhhVar = (ddhh) dssiVar;
                if ((csjbVar2.a & 1) != 0) {
                    ddhhVar.k(ddcm.a, Long.valueOf(csjbVar2.b));
                }
            }
        });
    }
}
