package defpackage;

import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import com.google.android.apps.maps.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: ajdz  reason: default package */
/* loaded from: classes2.dex */
public final class ajdz extends ges implements ajeg, ajht, ajij {
    public cqkj a;
    public bvsx ad;
    public dxio<ahwf> ae;
    public ajee af;
    @dzsi
    cqkf<ajee> ag;
    @dzsi
    cqkf<jbk> ah;
    public btlu ai;
    public dqzv aj;
    public dbsg<Profile> ak;
    @dzsi
    public ajik al;
    @dzsi
    public ajhu am;
    public String an;
    @dzsi
    public ProgressDialog ao;
    private int ap = 0;
    private final BroadcastReceiver aq = new ajdy(this);
    public efg b;
    public gga c;
    public cqat d;
    public akfa e;
    public cqhn f;
    public bvrb g;

    static {
        dbsk.s(ajdz.class.getCanonicalName());
    }

    @Override // defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    public final void aJ() {
        gn gnVar = this.A;
        dbsk.s(gnVar);
        gnVar.f();
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ag = this.a.c(new ajef(), null);
        this.ah = this.a.c(new hxj(), null);
        cqkf<ajee> cqkfVar = this.ag;
        dbsk.s(cqkfVar);
        return cqkfVar.c();
    }

    @Override // defpackage.fd
    public final void aq(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.aq(str, fileDescriptor, printWriter, strArr);
        String name = ajdz.class.getName();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(name).length());
        sb.append(str);
        sb.append(name);
        sb.append(":");
        printWriter.println(sb.toString());
        int i = this.ap;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 19);
        sb2.append(str);
        sb2.append("  state=");
        sb2.append(i);
        printWriter.println(sb2.toString());
    }

    @Override // defpackage.ajij
    public final void g(dbsg<dqzv> dbsgVar) {
        i();
        if (dbsgVar.a()) {
            aJ();
            this.ae.a().q();
            return;
        }
        w(Rp(R.string.UPDATE_SHARES_OPERATION_FAILED));
        aJ();
    }

    public final void i() {
        if (this.ao != null) {
            if (!J().isFinishing()) {
                ProgressDialog progressDialog = this.ao;
                dbsk.s(progressDialog);
                progressDialog.dismiss();
            }
            this.ao = null;
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle != null) {
            dbsk.l(bundle.containsKey("state"));
            this.ap = bundle.getInt("state", 0);
            dbsk.l(bundle.containsKey("account_id"));
            String string = bundle.getString("account_id");
            dbsk.s(string);
            this.an = string;
            try {
                this.ak = dbsg.j((Profile) bundle.getParcelable("profile"));
                dsqa c = dsqa.c();
                this.aj = (dqzv) dsqw.cr(dqzv.h, (byte[]) dbsk.s(bundle.getByteArray("share_acl")), c);
            } catch (dsrm unused) {
                aJ();
                return;
            }
        }
        final deig d = deig.d();
        this.g.b(new Runnable(this, d) { // from class: ajdv
            private final ajdz a;
            private final deig b;

            {
                this.a = this;
                this.b = d;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ajdz ajdzVar = this.a;
                deig deigVar = this.b;
                dbsk.s(ajdzVar.an);
                btlu n = ajdzVar.e.n(ajdzVar.an);
                dbsk.s(n);
                deigVar.j(n);
            }
        }, bvrj.BACKGROUND_THREADPOOL);
        this.af = new ajeh(this.aj, this.ak, H(), this.d, this.ad, this.f, this);
        gz b = R().b();
        ajhp ajhpVar = (ajhp) R().H("UPDATE_SHARES_RETAIN_FRAGMENT");
        if (ajhpVar == null) {
            ajhpVar = new ajhp();
            b.y(ajhpVar, "UPDATE_SHARES_RETAIN_FRAGMENT");
        }
        this.al = ajhpVar;
        ajfp ajfpVar = (ajfp) R().H("CANCEL_SHARES_RETAIN_FRAGMENT");
        if (ajfpVar == null) {
            ajfpVar = new ajfp();
            b.y(ajfpVar, "CANCEL_SHARES_RETAIN_FRAGMENT");
        }
        this.am = ajfpVar;
        if (!b.q()) {
            b.g();
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxu.fI;
    }

    public final ProgressDialog q() {
        ProgressDialog progressDialog = new ProgressDialog(H());
        progressDialog.setProgressStyle(0);
        progressDialog.setCancelable(false);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage(alp.a().b(Rp(R.string.DATA_LOADING_IN_PROGRESS)));
        progressDialog.show();
        return progressDialog;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        cqkf<ajee> cqkfVar = this.ag;
        dbsk.s(cqkfVar);
        ajee ajeeVar = this.af;
        dbsk.s(ajeeVar);
        cqkfVar.e(ajeeVar);
        cqkf<jbk> cqkfVar2 = this.ah;
        dbsk.s(cqkfVar2);
        cqkfVar2.e(new jbk(this) { // from class: ajdw
            private final ajdz a;

            {
                this.a = this;
            }

            @Override // defpackage.jbk
            public jib NC() {
                final ajdz ajdzVar = this.a;
                jhz a = jhz.a();
                a.k = new jia(ajdzVar) { // from class: ajdx
                    private final ajdz a;

                    {
                        this.a = ajdzVar;
                    }

                    @Override // defpackage.jia
                    public final void a(View view) {
                        this.a.aJ();
                    }
                };
                a.g = ibl.b();
                a.i = cqrt.f(2131232580);
                a.j = cqrt.l(R.string.CLOSE_BUTTON);
                a.e = cqrt.f(R.drawable.toolbar_action_background);
                a.x = false;
                a.d = gdj.b();
                a.q = ibm.a();
                a.o = cjtd.a(dtxu.fM);
                return a.b();
            }
        });
        this.c.registerReceiver(this.aq, new IntentFilter("android.intent.action.TIME_TICK"));
        ajik ajikVar = this.al;
        dbsk.s(ajikVar);
        ajhp ajhpVar = (ajhp) ajikVar;
        dbsk.l(ajhpVar.e == null);
        ajhpVar.e = this;
        ajhu ajhuVar = this.am;
        dbsk.s(ajhuVar);
        ajfp ajfpVar = (ajfp) ajhuVar;
        dbsk.l(ajfpVar.f == null);
        ajfpVar.f = this;
        egj egjVar = new egj(this);
        egjVar.ad(false);
        egjVar.f(false);
        cqkf<jbk> cqkfVar3 = this.ah;
        dbsk.s(cqkfVar3);
        egjVar.F(cqkfVar3.c());
        egjVar.ag(null);
        egjVar.y(true);
        cqkf<ajee> cqkfVar4 = this.ag;
        dbsk.s(cqkfVar4);
        egjVar.w(cqkfVar4.c());
        egjVar.x(egr.a);
        this.b.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putString("account_id", this.an);
        bundle.putInt("state", this.ap);
        if (this.ak.a()) {
            bundle.putParcelable("profile", this.ak.b());
        }
        bundle.putByteArray("share_acl", this.aj.bS());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        cqkf<ajee> cqkfVar = this.ag;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        cqkf<jbk> cqkfVar2 = this.ah;
        if (cqkfVar2 != null) {
            cqkfVar2.e(null);
        }
        this.c.unregisterReceiver(this.aq);
        ajik ajikVar = this.al;
        dbsk.s(ajikVar);
        ((ajhp) ajikVar).e = null;
        ajhu ajhuVar = this.am;
        dbsk.s(ajhuVar);
        ((ajfp) ajhuVar).f = null;
        i();
        super.u();
    }

    public final void w(CharSequence charSequence) {
        ckos.a(J().findViewById(16908290), charSequence, 0).c();
    }
}
