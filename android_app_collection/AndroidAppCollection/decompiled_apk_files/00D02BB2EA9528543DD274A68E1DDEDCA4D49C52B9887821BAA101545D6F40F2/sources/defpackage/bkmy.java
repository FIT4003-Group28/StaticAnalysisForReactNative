package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bkmy  reason: default package */
/* loaded from: classes3.dex */
public class bkmy implements bkmv {
    public final bknf a;
    private final btvo b;
    private final bhhf c;
    private final ilo d;
    private final boolean e;

    public bkmy(btvo btvoVar, bhhf bhhfVar, bknf bknfVar, bwrs<ilo> bwrsVar, boolean z) {
        this.b = btvoVar;
        this.c = bhhfVar;
        this.a = bknfVar;
        ilo c = bwrsVar.c();
        dbsk.s(c);
        this.d = c;
        this.e = z;
    }

    @Override // defpackage.bkmv
    public View.OnClickListener a() {
        return new View.OnClickListener(this) { // from class: bkmw
            private final bkmy a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.QX();
            }
        };
    }

    @Override // defpackage.bkmv
    public View.OnClickListener b() {
        return new View.OnClickListener(this) { // from class: bkmx
            private final bkmy a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.aS();
            }
        };
    }

    @Override // defpackage.bkmv
    public Boolean c() {
        return Boolean.valueOf(this.c.a(this.d));
    }

    @Override // defpackage.bkmv
    public Boolean d() {
        boolean z = false;
        if (this.b.getPlaceMenuParameters().a() && !c().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bkmv
    public Boolean e() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.bkmv
    public cjtd f() {
        if (this.c.a(this.d)) {
            return h(dtxv.cv);
        }
        return h(dtxv.ap);
    }

    @Override // defpackage.bkmv
    public cjtd g() {
        if (e().booleanValue()) {
            return h(c().booleanValue() ? dtxx.D : dtxx.B);
        }
        return h(c().booleanValue() ? dtxv.aq : dtxv.ao);
    }

    public cjtd h(ddho ddhoVar) {
        cjta c = cjtd.c(this.d.bZ());
        c.d = ddhoVar;
        return c.a();
    }
}
