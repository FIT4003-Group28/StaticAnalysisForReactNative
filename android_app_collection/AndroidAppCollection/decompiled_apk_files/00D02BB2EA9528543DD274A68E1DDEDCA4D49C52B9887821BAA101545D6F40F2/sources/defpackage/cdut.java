package defpackage;

import com.google.android.material.button.MaterialButton;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdut  reason: default package */
/* loaded from: classes4.dex */
public final class cdut extends cdyp {
    public final dzve<cdvi, dztc> s;
    private final MaterialButton t;
    private final cebc u;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cdut(android.view.ViewGroup r4, defpackage.dzve<? super defpackage.cdvi, defpackage.dztc> r5, defpackage.cebd r6) {
        /*
            r3 = this;
            java.lang.String r0 = "onAction"
            defpackage.dzvx.c(r5, r0)
            java.lang.String r0 = "logger"
            defpackage.dzvx.c(r6, r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131624253(0x7f0e013d, float:1.887568E38)
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
        */
        //  java.lang.String r0 = "LayoutInflater.from(pare…*attachToRoot=*/false\n  )"
        /*
            defpackage.dzvx.b(r4, r0)
            r3.<init>(r4)
            r3.s = r5
            android.view.View r4 = r3.a
            r5 = 2131427665(0x7f0b0151, float:1.8476953E38)
            android.view.View r4 = r4.findViewById(r5)
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            r3.t = r4
            cebc r4 = r6.a(r4)
            cjtd r5 = defpackage.cjtd.b
            r4.c(r5)
            r3.u = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdut.<init>(android.view.ViewGroup, dzve, cebd):void");
    }

    @Override // defpackage.cdyp
    public final void C(cdyl cdylVar, Object obj) {
        dzvx.c(cdylVar, "item");
        if (!(cdylVar instanceof cdvj)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        cebc cebcVar = this.u;
        cdvj cdvjVar = (cdvj) cdylVar;
        cebcVar.c(cjtd.a(cdvjVar.d));
        cebcVar.b(new cdus(this, cdylVar));
        MaterialButton materialButton = this.t;
        materialButton.setIcon(this.a.getResources().getDrawable(cdvjVar.a, null));
        materialButton.setText(this.a.getResources().getString(cdvjVar.b));
    }
}
