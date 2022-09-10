package defpackage;

import android.app.ProgressDialog;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cqe  reason: default package */
/* loaded from: classes5.dex */
public final class cqe extends itb implements cqg {
    private final bnxp a;
    private final akpm b;
    private final dxio<akfc> c;

    public cqe(gga ggaVar, akpm akpmVar, bnyo bnyoVar, dxio<akfc> dxioVar) {
        this.b = akpmVar;
        this.c = dxioVar;
        this.a = new bnxp(ggaVar, ggaVar.getString(R.string.AAP_NOT_SUPPORTED), akpmVar, bnyoVar);
    }

    @Override // defpackage.itb
    public final void Po() {
        bnxp bnxpVar = this.a;
        btzc btzcVar = bnxpVar.a;
        if (btzcVar != null) {
            btzcVar.a();
        }
        ProgressDialog progressDialog = bnxpVar.b;
        if (progressDialog != null) {
            progressDialog.cancel();
            bnxpVar.b = null;
        }
        super.Po();
    }

    @Override // defpackage.cqg
    public final void b(cqf cqfVar, boolean z) {
        c(cqfVar, this.b.n().i.h(), z);
    }

    @Override // defpackage.cqg
    public final void c(cqf cqfVar, dpum dpumVar, boolean z) {
        cqb cqbVar = new cqb(cqfVar, dpumVar);
        if (!z) {
            e(cqbVar);
            return;
        }
        bnxp bnxpVar = this.a;
        cqd cqdVar = new cqd(this, cqbVar);
        if (bnxpVar.b == null) {
            bnxpVar.b = new ProgressDialog(bnxpVar.c, 0);
            bnxpVar.b.setMessage(bnxpVar.c.getString(R.string.VIEWPORT_CHECK_WAIT));
            bnxpVar.b.setOnCancelListener(bnxpVar);
        }
        bnxpVar.b.show();
        dwjq bZ = dwjr.c.bZ();
        if (bnxpVar.d.Z() != null) {
            dhjx Z = bnxpVar.d.Z();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwjr dwjrVar = (dwjr) bZ.b;
            Z.getClass();
            dwjrVar.b = Z;
            dwjrVar.a |= 1;
        }
        btzc btzcVar = bnxpVar.a;
        if (btzcVar != null) {
            btzcVar.a();
        }
        bnxpVar.a = bnxpVar.e.b(bZ.bK(), bnxpVar);
        bnxpVar.f = cqdVar;
    }

    @Override // defpackage.cqg
    public final void d(cqf cqfVar, dbsg<dpum> dbsgVar) {
        dpum h;
        if (dbsgVar.a()) {
            h = dbsgVar.b();
        } else {
            h = this.b.n().i.h();
        }
        this.b.p(akyt.i(akqq.f(h), 12.0f));
        e(new cqb(cqfVar, h));
    }

    public final void e(cqb cqbVar) {
        aker i = akeu.i(cqbVar);
        aken a = i.a();
        a.i(R.string.RAP_AAP_LOGIN_SCREEN_TITLE);
        a.h(R.string.RAP_AAP_LOGIN_SCREEN_SUBTITLE);
        a.c(R.string.DISABLE_INCOGNITO_BODY_TEXT);
        this.c.a().b(i.b());
    }
}
