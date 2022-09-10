package defpackage;

import android.app.Dialog;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: zgr  reason: default package */
/* loaded from: classes7.dex */
public class zgr implements jad, zrz {
    private final vpd a;
    private final gga b;
    private final ziq c;
    private final amub d;
    private final qbp e;
    @dzsi
    private Dialog f;

    public zgr(vpd vpdVar, gga ggaVar, ziq ziqVar, qbp qbpVar, amub amubVar) {
        this.a = vpdVar;
        this.d = amubVar;
        this.b = ggaVar;
        this.c = ziqVar;
        this.e = qbpVar;
    }

    private final void b() {
        Dialog dialog = this.f;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f.dismiss();
    }

    @Override // defpackage.jad
    public Boolean a() {
        return Boolean.valueOf(!dbsj.d(e().toString()));
    }

    @Override // defpackage.jad
    public cqkl c() {
        ziq ziqVar = this.c;
        amub amubVar = this.d;
        this.f = ziqVar.a(amubVar.h, amubVar.J, this);
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        return cjtd.a(dtyb.dP);
    }

    @Override // defpackage.jad
    public CharSequence e() {
        if (this.d.h == dqvj.DRIVE && !this.a.a()) {
            dphv b = dphv.b(this.d.d.a.z);
            if (b == null) {
                b = dphv.UNKNOWN_LICENSE_PLATE_RESTRICTION;
            }
            vpc g = vph.g(b);
            if (g != null && this.a.c(g)) {
                int ordinal = g.ordinal();
                if (ordinal == 0) {
                    return this.b.getResources().getString(R.string.AVOID_ODD_EVEN_ROADS).toUpperCase(Locale.getDefault());
                }
                if (ordinal == 1) {
                    return this.b.getResources().getString(R.string.AVOID_RODIZIO_AREA).toUpperCase(Locale.getDefault());
                }
                if (ordinal == 2) {
                    return this.b.getResources().getString(R.string.AVOID_MANILA_AREA).toUpperCase(Locale.getDefault());
                }
                return ordinal != 3 ? "" : this.b.getResources().getString(pxo.AVOID_SANTIAGO_AREA).toUpperCase(Locale.getDefault());
            }
        }
        return "";
    }

    @Override // defpackage.jad
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.jad
    public cqkl g(cjqm cjqmVar) {
        return jac.b(this);
    }

    @Override // defpackage.jad
    public Boolean h() {
        return jac.a();
    }

    @Override // defpackage.jad
    public cqtd i() {
        return null;
    }

    @Override // defpackage.zrz
    public void w(dwao dwaoVar) {
        dnqg bZ = dnqh.p.bZ();
        ddxw bZ2 = ddxx.j.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddxx ddxxVar = (ddxx) bZ2.b;
        ddxxVar.a |= 8;
        ddxxVar.d = 19694;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        ddxx bK = bZ2.bK();
        bK.getClass();
        dnqhVar.f = bK;
        dnqhVar.a |= 16;
        this.e.h(dwaoVar, bZ.bK());
        b();
    }

    @Override // defpackage.zrz
    public void x() {
        b();
    }
}
