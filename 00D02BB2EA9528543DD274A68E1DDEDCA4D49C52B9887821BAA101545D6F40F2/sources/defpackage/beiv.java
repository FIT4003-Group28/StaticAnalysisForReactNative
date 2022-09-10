package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
import defpackage.cqkp;
import java.io.IOException;
import java.util.List;
/* compiled from: PG */
/* renamed from: beiv  reason: default package */
/* loaded from: classes3.dex */
public abstract class beiv<T extends cqkp> extends hxf {
    @dzsi
    protected bwrs<bvrt<benb>> ad;
    @dzsi
    protected bwrs<ilo> ae;
    @dzsi
    protected cqkf<T> af;
    protected beol ag;
    private jib ah = jhz.a().b();
    public ff b;
    public dxio<beii> c;
    public bwqv d;
    public cklf e;
    public beid f;
    public efg g;

    /* JADX INFO: Access modifiers changed from: protected */
    public beiv(boolean z) {
        dbsk.l(z);
    }

    private final jho aV(final bwrs<ilo> bwrsVar) {
        String aX = aX();
        ilo c = bwrsVar.c();
        cjta c2 = cjtd.c(c == null ? null : c.bZ());
        c2.d = dtxv.aP;
        cjtd a = c2.a();
        jhm a2 = jhm.a();
        a2.a = aX;
        a2.f = a;
        a2.b = aX;
        a2.h = 0;
        a2.d(new View.OnClickListener(this, bwrsVar) { // from class: beiu
            private final beiv a;
            private final bwrs b;

            {
                this.a = this;
                this.b = bwrsVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                beiv beivVar = this.a;
                bwrs<ilo> bwrsVar2 = this.b;
                if (beivVar.ad != null) {
                    bwrs<bvrt<benb>> bwrsVar3 = beivVar.ad;
                    dbsk.s(bwrsVar3);
                    beivVar.c.a().e(bwrsVar2, bwrsVar3);
                }
            }
        });
        return a2.c();
    }

    private final String aX() {
        return this.b.getString(R.string.MERCHANT_PANEL_CALLS_SETTINGS);
    }

    @Override // defpackage.ges, defpackage.fd
    public void Qe() {
        super.Qe();
        beol beolVar = this.ag;
        if (beolVar != null) {
            beolVar.b();
        }
        cqkf<T> cqkfVar = this.af;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.af = null;
        }
    }

    protected abstract String aR();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aS() {
        beol beolVar = this.ag;
        if (beolVar != null) {
            beolVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aT() {
        dgab o;
        beol beolVar = this.ag;
        if (beolVar == null || (o = beolVar.o()) == null) {
            return;
        }
        aU(o);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aU(dgab dgabVar) {
        if (this.ae == null) {
            return;
        }
        boolean z = true;
        if (!dgabVar.equals(dgab.TRACKING) && !dgabVar.equals(dgab.PAUSED)) {
            z = false;
        }
        List<jho> list = this.ah.n;
        if (list.isEmpty()) {
            jhz e = this.ah.e();
            if (z) {
                bwrs<ilo> bwrsVar = this.ae;
                dbsk.s(bwrsVar);
                e.c(aV(bwrsVar));
            }
            ff ffVar = this.b;
            cklf cklfVar = this.e;
            bwrs<ilo> bwrsVar2 = this.ae;
            dbsk.s(bwrsVar2);
            e.c(beno.d(ffVar, cklfVar, bwrsVar2));
            jib b = e.b();
            this.ah = b;
            q(b);
        } else if (!z || list.get(0).a(this.b).toString().equals(aX())) {
        } else {
            jhz e2 = this.ah.e();
            e2.e();
            bwrs<ilo> bwrsVar3 = this.ae;
            dbsk.s(bwrsVar3);
            e2.c(aV(bwrsVar3));
            e2.d(list);
            jib b2 = e2.b();
            this.ah = b2;
            q(b2);
        }
    }

    @Override // defpackage.hxf
    public final jib g() {
        jhz e = this.ah.e();
        e.a = aR();
        e.E = 1;
        e.f(new View.OnClickListener(this) { // from class: beit
            private final beiv a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b.onBackPressed();
            }
        });
        e.x = false;
        e.l = this.b.getString(R.string.ACCESSIBILITY_OVERFLOW_MENU);
        jib b = e.b();
        this.ah = b;
        return b;
    }

    @Override // defpackage.ges, defpackage.fd
    public void l(@dzsi Bundle bundle) {
        super.l(bundle);
        try {
            this.ad = this.d.e(bvrt.class, this.o, "BaseMerchantCallsFragment.merchantCallsState");
        } catch (IOException e) {
            bvoo.j(e);
        }
        if (this.ad == null) {
            this.ad = bwrs.a(bvrt.b(benb.b));
        }
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        this.g.a(egjVar.a());
    }
}
