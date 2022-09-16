package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bpbt  reason: default package */
/* loaded from: classes3.dex */
public final class bpbt extends gen implements bnyn<dwjv, dwjx> {
    public cqkj a;
    bopc ad;
    @dzsi
    dwjv ae;
    @dzsi
    dwjx af;
    public bnyq ag;
    private bwrs<ilo> ai;
    private boolean aj;
    public bwqv b;
    public boxa c;
    public bmdq d;
    public aujx e;
    public ckcw g;
    private final bopb ah = new bpbs(this);
    private boolean ak = false;

    private final bwrs<ilo> w() {
        bwrs<ilo> bwrsVar = this.ai;
        dbsk.s(bwrsVar);
        return bwrsVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        super.am();
        this.ag.a();
    }

    @Override // defpackage.bnyn
    /* renamed from: g */
    public final void Rb(dwjv dwjvVar, @dzsi dwjx dwjxVar) {
        int a;
        if (this.ak) {
            if (this.o.getBoolean("IS_FROM_FACTUAL_MODERATION_NOTIFICATION_KEY")) {
                ilo c = w().c();
                aujt c2 = this.e.c(ddos.FACTUAL_MODERATION);
                dbsk.s(c);
                c2.a(c.ai());
                ((ckcn) this.g.a(ckdz.al)).a();
            }
            if (dwjxVar == null || (a = dosm.a(dwjxVar.b)) == 0 || a != 2) {
                q();
                return;
            }
            this.ad.m();
            boxa boxaVar = this.c;
            boxaVar.O(boxaVar.S(dwjxVar));
            return;
        }
        this.ae = dwjvVar;
        this.af = dwjxVar;
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        this.ad = new bopc(this.ah, w(), dqgh.b(this.o.getInt("ATTRIBUTE_TYPE_KEY")), J(), this.d);
        cqkf c = this.a.c(new bofn(), null);
        c.e(this.ad);
        boolean z = false;
        if (bundle != null && bundle.getBoolean("SUBMITTING_REQUEST_STATE_KEY")) {
            z = true;
        }
        Dialog dialog = new Dialog(J(), 16973840);
        dialog.setContentView(c.c());
        if (z) {
            q();
        }
        return dialog;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        bwrs<ilo> e;
        super.l(bundle);
        boolean z = false;
        if (bundle != null && bundle.getBoolean("HAS_MADE_ATTEMPT_TO_SHOW_NOTIFICATION_OPT_OUT_BANNER_KEY")) {
            z = true;
        }
        this.aj = z;
        if (bundle == null) {
            try {
                e = this.b.e(ilo.class, this.o, "PLACEMARK_KEY");
                dbsk.s(e);
            } catch (IOException e2) {
                dbue.b(e2.getCause() == null ? e2 : e2.getCause());
                Throwable cause = e2.getCause();
                Throwable th = e2;
                if (cause != null) {
                    th = e2.getCause();
                }
                throw new RuntimeException(th);
            }
        } else {
            e = bwrs.a((ilo) bundle.getSerializable("PLACEMARK_KEY"));
        }
        this.ai = e;
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxo.t;
    }

    public final void q() {
        this.ad.o(false);
        Toast.makeText(J(), (int) R.string.DATA_REQUEST_ERROR_SUBTITLE, 0).show();
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        dwjx dwjxVar;
        super.s();
        this.ak = true;
        dwjv dwjvVar = this.ae;
        if (dwjvVar == null || (dwjxVar = this.af) == null) {
            return;
        }
        Rb(dwjvVar, dwjxVar);
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putBoolean("SUBMITTING_REQUEST_STATE_KEY", this.ad.p().booleanValue());
        bundle.putBoolean("HAS_MADE_ATTEMPT_TO_SHOW_NOTIFICATION_OPT_OUT_BANNER_KEY", this.aj);
        bundle.putSerializable("PLACEMARK_KEY", w().c());
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void u() {
        super.u();
        this.ak = false;
    }
}
