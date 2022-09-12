package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bmdj  reason: default package */
/* loaded from: classes3.dex */
public class bmdj implements bmdh {
    public bnwz a;
    private final bnxa b;
    private ilo c;

    public bmdj(bnxa bnxaVar) {
        this.b = bnxaVar;
    }

    @Override // defpackage.bmdh
    public View.OnClickListener a() {
        return new View.OnClickListener(this) { // from class: bmdi
            private final bmdj a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bnwz bnwzVar = this.a.a;
                dbsk.s(bnwzVar);
                bnwzVar.a();
            }
        };
    }

    @Override // defpackage.bmdh
    public cjtd b() {
        return cjtd.a(dtxo.Z);
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.c = bwrsVar.c();
        this.a = this.b.a(bwrsVar);
    }

    @Override // defpackage.bega
    public void u() {
        this.c = null;
        this.a = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        ilo iloVar = this.c;
        boolean z = false;
        if (iloVar != null && bmbd.a(iloVar.cA()).c.size() > 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
