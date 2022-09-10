package defpackage;

import android.app.Activity;
import android.app.ProgressDialog;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cgri  reason: default package */
/* loaded from: classes4.dex */
public final class cgri implements awwn {
    private static final dcqe j = dcqe.c("cgri");
    public final Activity a;
    public final btpc b;
    public final bvjj c;
    public final awwq d;
    public final cgrf e;
    public final cgrh f;
    @dzsi
    public ProgressDialog g;
    @dzsi
    public cgsm h;
    public String i = "";
    private String k = "";
    private String l = "";
    private boolean m = false;
    private boolean n = false;

    public cgri(Activity activity, btpc btpcVar, bvjj bvjjVar, awwq awwqVar, cgrf cgrfVar, cgrh cgrhVar) {
        this.a = activity;
        this.b = btpcVar;
        this.c = bvjjVar;
        this.d = awwqVar;
        this.e = cgrfVar;
        this.f = cgrhVar;
    }

    private final void f(String str, String str2, drrp drrpVar) {
        h();
        this.f.bq(str, str2, drrpVar);
        this.h = null;
    }

    private final void g() {
        h();
        this.n = false;
        this.h = null;
        this.f.br();
    }

    private final void h() {
        ProgressDialog progressDialog = this.g;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.g = null;
        }
    }

    @Override // defpackage.awwn
    @dzsi
    public final awwt a() {
        this.m = true;
        this.l = "";
        awws u = awwt.u();
        u.t(dcdc.f("ugc_tasks_sharing"));
        u.e(awvv.a);
        return u.a();
    }

    @Override // defpackage.awwn
    public final void b(awwb awwbVar, awwp awwpVar) {
        dvha dvhaVar = (dvha) awwbVar.a(awvv.a).f();
        if (dvhaVar != null) {
            this.l = dvhaVar.d;
        }
        if (awwbVar.c(awvv.a).b()) {
            return;
        }
        this.m = false;
        if (!this.n) {
            return;
        }
        cgsm cgsmVar = this.h;
        if (cgsmVar == null) {
            bvoo.h("Pending share model is null when Passive Assist Model update arrives.", new Object[0]);
            g();
            return;
        }
        this.n = false;
        e();
        f(this.i, this.k, cgsmVar.a());
    }

    public final boolean c() {
        return this.h != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(String str) {
        String string;
        cgsm cgsmVar = this.h;
        if (cgsmVar == null) {
            bvoo.h("Pending share model is null when TrT share url response arrives.", new Object[0]);
            g();
            return;
        }
        this.i = str;
        if (!str.isEmpty()) {
            if (cgsmVar.a != null && cgsmVar.b != null) {
                dspd dspdVar = cgsmVar.c;
                String J = dspdVar != null ? dspdVar.J() : "";
                if (J.isEmpty()) {
                    string = this.a.getString(R.string.UGC_TASKS_SHARE_MESSAGE_DESCRIPTION_FALLBACK);
                } else {
                    string = this.a.getString(R.string.UGC_TASKS_SHARE_MESSAGE_DESCRIPTION_TASK, new Object[]{J});
                }
                this.k = string;
            } else if (cgsmVar.d == null) {
                this.k = this.a.getString(R.string.UGC_TASKS_SHARE_MESSAGE_DESCRIPTION_NEAR_YOU);
            } else if (this.m) {
                this.n = true;
                return;
            } else {
                e();
            }
            f(this.i, this.k, cgsmVar.a());
            return;
        }
        g();
    }

    private final void e() {
        String string;
        String str = this.l;
        if (str == null || str.isEmpty()) {
            string = this.a.getString(R.string.UGC_TASKS_SHARE_MESSAGE_DESCRIPTION_FALLBACK);
        } else {
            string = this.a.getString(R.string.UGC_TASKS_SHARE_MESSAGE_DESCRIPTION_VIEWPORT, new Object[]{this.l});
        }
        this.k = string;
    }
}
