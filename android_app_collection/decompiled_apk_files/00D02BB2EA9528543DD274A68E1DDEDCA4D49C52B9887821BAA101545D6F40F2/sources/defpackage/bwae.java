package defpackage;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
/* compiled from: PG */
/* renamed from: bwae  reason: default package */
/* loaded from: classes4.dex */
public final class bwae extends bvwn<dmfy> {
    public final bvws b;
    private final gga c;
    private final dzsj<eaou> d;
    private final dzsj<eapg> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwae(gga ggaVar, final cqat cqatVar, bvws bvwsVar) {
        super(dmfy.f);
        dzsj<eaou> dzsjVar = new dzsj(cqatVar) { // from class: bwab
            private final cqat a;

            {
                this.a = cqatVar;
            }

            @Override // defpackage.dzsj
            public final Object a() {
                return bvtb.t(this.a.b());
            }
        };
        dzsj<eapg> dzsjVar2 = new dzsj(cqatVar) { // from class: bwac
            private final cqat a;

            {
                this.a = cqatVar;
            }

            @Override // defpackage.dzsj
            public final Object a() {
                return bvtb.s(this.a.b());
            }
        };
        this.c = ggaVar;
        this.d = dzsjVar;
        this.e = dzsjVar2;
        this.b = bvwsVar;
    }

    @Override // defpackage.bvwn
    public final /* bridge */ /* synthetic */ void a(dmfy dmfyVar) {
        eapg a;
        dmfy dmfyVar2 = dmfyVar;
        if ((dmfyVar2.a & 1) != 0) {
            dpoj dpojVar = dmfyVar2.b;
            if (dpojVar == null) {
                dpojVar = dpoj.e;
            }
            a = new eapg(dpojVar.b, dpojVar.c, dpojVar.d);
        } else {
            a = this.e.a();
        }
        jem jemVar = new jem(this.c, new DatePickerDialog.OnDateSetListener(this) { // from class: bwad
            private final bwae a;

            {
                this.a = this;
            }

            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                bvws bvwsVar = this.a.b;
                dmck bZ = dmcl.c.bZ();
                dpoi bZ2 = dpoj.e.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dpoj dpojVar2 = (dpoj) bZ2.b;
                int i4 = dpojVar2.a | 1;
                dpojVar2.a = i4;
                dpojVar2.b = i;
                int i5 = i4 | 2;
                dpojVar2.a = i5;
                dpojVar2.c = i2 + 1;
                dpojVar2.a = i5 | 4;
                dpojVar2.d = i3;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dmcl dmclVar = (dmcl) bZ.b;
                dpoj bK = bZ2.bK();
                bK.getClass();
                dmclVar.b = bK;
                dmclVar.a |= 1;
                bvwsVar.b(bZ.bK(), dmcl.d);
            }
        }, a.r(), a.s() - 1, a.t());
        if ((dmfyVar2.a & 2) != 0) {
            dpoj dpojVar2 = dmfyVar2.c;
            if (dpojVar2 == null) {
                dpojVar2 = dpoj.e;
            }
            jemVar.getDatePicker().setMinDate(new eapg(dpojVar2.b, dpojVar2.c, dpojVar2.d).m(this.d.a()).a);
        }
        if ((dmfyVar2.a & 4) != 0) {
            dpoj dpojVar3 = dmfyVar2.d;
            if (dpojVar3 == null) {
                dpojVar3 = dpoj.e;
            }
            jemVar.getDatePicker().setMaxDate(new eapg(dpojVar3.b, dpojVar3.c, dpojVar3.d).p(1).m(this.d.a()).a - 1);
        }
        jemVar.show();
    }
}
