package defpackage;

import android.widget.CompoundButton;
/* compiled from: PG */
/* renamed from: afvq  reason: default package */
/* loaded from: classes2.dex */
class afvq extends afwf {
    final /* synthetic */ afwg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afvq(afwg afwgVar, cqtd cqtdVar, CharSequence charSequence, cjtd cjtdVar) {
        super(afwgVar, cqtdVar, charSequence, cjtdVar, true);
        this.a = afwgVar;
    }

    @Override // defpackage.afuz
    public cqkl n(cjqm cjqmVar) {
        return cqkl.a;
    }

    @Override // defpackage.afwf, defpackage.afuz
    public Boolean s() {
        return Boolean.valueOf(this.a.f.m(bvjk.et, false));
    }

    @Override // defpackage.afwf, defpackage.afuz
    public CompoundButton.OnCheckedChangeListener t() {
        return new CompoundButton.OnCheckedChangeListener(this) { // from class: afve
            private final afvq a;

            {
                this.a = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                afvq afvqVar = this.a;
                if (z && !afvqVar.s().booleanValue()) {
                    afvqVar.a.G.a();
                }
                afvqVar.a.F.a(z);
                cjqy cjqyVar = afvqVar.a.d;
                cjte cjteVar = new cjte(deaf.TAP);
                cjta b = cjtd.b();
                b.d = dtxv.x;
                ddzy bZ = deab.c.bZ();
                deaa deaaVar = z ? deaa.TOGGLE_OFF : deaa.TOGGLE_ON;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                deab deabVar = (deab) bZ.b;
                deabVar.b = deaaVar.d;
                deabVar.a |= 1;
                b.a = bZ.bK();
                cjqyVar.m(cjteVar, b.a());
            }
        };
    }
}
