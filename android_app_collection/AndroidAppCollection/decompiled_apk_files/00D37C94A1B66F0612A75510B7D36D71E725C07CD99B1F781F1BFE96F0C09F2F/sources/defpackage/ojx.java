package defpackage;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ojx  reason: default package */
/* loaded from: classes3.dex */
public final class ojx implements afvu, fqc, ynl {
    public final WatchWhileActivity a;
    public final ojl b;
    public final afwc c;
    public final afvn d;
    public final wai e;
    public final afvt f;
    public final fqd g;
    public final aadd h;
    public final azqb i;
    public final wfy j;
    public final azqb k;
    public int l;
    public String m;
    public ProgressDialog n;
    public final aacz o;
    private final oio p;
    private final aafo q;
    private final eza r;
    private final azqb s;
    private final fvf t;
    private final wal u;

    public ojx(WatchWhileActivity watchWhileActivity, ojl ojlVar, oio oioVar, afwc afwcVar, afvn afvnVar, wai waiVar, aafo aafoVar, eza ezaVar, fvf fvfVar, azqb azqbVar, afvt afvtVar, wal walVar, fqd fqdVar, aadd aaddVar, aacz aaczVar, azqb azqbVar2, wfy wfyVar, azqb azqbVar3) {
        this.a = watchWhileActivity;
        this.b = ojlVar;
        this.p = oioVar;
        this.c = afwcVar;
        this.d = afvnVar;
        this.e = waiVar;
        this.q = aafoVar;
        this.r = ezaVar;
        this.s = azqbVar;
        this.t = fvfVar;
        this.f = afvtVar;
        this.u = walVar;
        this.g = fqdVar;
        this.h = aaddVar;
        this.o = aaczVar;
        this.i = azqbVar2;
        this.j = wfyVar;
        this.k = azqbVar3;
    }

    @Override // defpackage.fqc
    public final void a() {
        if (this.d.c().g()) {
            this.f.h();
        }
    }

    @Override // defpackage.fqc
    public final void b() {
        if (this.d.c().g()) {
            this.f.c();
        }
    }

    public final void c(Bundle bundle) {
        int i = 0;
        if (bundle != null) {
            i = bundle.getInt("recreate_signed_in_state", 0);
        }
        this.l = i;
        this.f.i(this);
        this.g.g(this);
    }

    public final boolean d(final boolean z, final apzg apzgVar) {
        Runnable runnable = new Runnable() { // from class: ojw
            @Override // java.lang.Runnable
            public final void run() {
                ojx.this.e(z, apzgVar);
            }
        };
        okf okfVar = (okf) this.s.get();
        if (!z) {
            return e(false, apzgVar);
        }
        okfVar.n(runnable);
        this.a.q().A = true;
        return true;
    }

    public final boolean e(boolean z, apzg apzgVar) {
        boolean z2 = false;
        if (!this.d.t()) {
            if (!z) {
                return false;
            }
            if (!this.a.q().E()) {
                if (this.l == 1) {
                    z2 = true;
                }
                ProgressDialog progressDialog = this.n;
                if (progressDialog != null && progressDialog.isShowing()) {
                    this.a.dismissDialog(1032);
                }
                this.l = 2;
                ((frv) this.k.get()).j();
                if (!this.r.l()) {
                    this.b.s(z2);
                }
                this.b.i = null;
                this.p.a();
            }
            return true;
        }
        if (!this.a.q().E()) {
            ProgressDialog progressDialog2 = this.n;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                this.a.dismissDialog(1032);
            }
            int i = this.l;
            this.l = 1;
            ((frv) this.k.get()).j();
            ojl ojlVar = this.b;
            if (z || i != 1) {
                z2 = true;
            }
            ojlVar.s(z2);
            if (apzgVar != null) {
                if (this.r.l()) {
                    this.r.j();
                }
                if (!etk.i(apzgVar)) {
                    this.q.c(apzgVar, null);
                }
            }
            this.p.a();
        }
        return true;
    }

    @Override // defpackage.afvu
    public final void j() {
    }

    @Override // defpackage.afvu
    public final void k() {
        if (this.d.t()) {
            waj a = this.u.a();
            fvg d = fvl.d();
            d.k(this.a.getString(R.string.sign_in_as, new Object[]{a.d, a.b}));
            this.t.i(d.b());
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                wgh wghVar = (wgh) obj;
                if (wghVar.a() == wgg.FINISHED && wghVar.c()) {
                    String d = this.d.c().d();
                    if (!TextUtils.equals(d, this.m)) {
                        this.m = d;
                        this.b.p(8);
                        d(true, wghVar.b());
                        return null;
                    }
                }
                e(wghVar.c(), wghVar.b());
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{wgh.class};
    }

    @Override // defpackage.afvu
    public final void l() {
        String string = this.a.getString(R.string.incognito_auto_terminated);
        String string2 = this.a.getString(R.string.ok);
        aqxo.p(!TextUtils.isEmpty(string));
        aqxo.p(!TextUtils.isEmpty(string2));
        new AlertDialog.Builder(this.a).setMessage(string).setPositiveButton(string2, (DialogInterface.OnClickListener) null).show();
    }
}
