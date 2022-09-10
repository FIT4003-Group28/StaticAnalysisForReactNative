package defpackage;

import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.text.NumberFormat;
/* compiled from: PG */
/* renamed from: bdfa  reason: default package */
/* loaded from: classes3.dex */
class bdfa implements jbj {
    final /* synthetic */ bdfb a;

    public bdfa(bdfb bdfbVar) {
        this.a = bdfbVar;
    }

    @dzsi
    private final dqjc a() {
        bdfb bdfbVar = this.a;
        return bdfbVar.b.a(bdfbVar.c);
    }

    private final int n() {
        dqjc a = a();
        if (a == null) {
            return 0;
        }
        return a.b;
    }

    @Override // defpackage.jbj
    public String b() {
        int n = n();
        return n == 0 ? "" : NumberFormat.getInstance(akr.a(this.a.e.getConfiguration()).d()).format(n);
    }

    @Override // defpackage.jbj
    public Boolean c() {
        dqjc a = a();
        boolean z = false;
        if (a != null) {
            dqjh b = dqjh.b(a.c);
            if (b == null) {
                b = dqjh.UNKNOWN_VOTE_TYPE;
            }
            if (b.equals(dqjh.THUMBS_UP)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jbj
    public Boolean d() {
        return false;
    }

    @Override // defpackage.jbj
    public CharSequence e() {
        int n = n();
        if (c().booleanValue()) {
            return this.a.e.getQuantityString(R.plurals.PHOTO_ACCESSIBILITY_THUMBS_UP_CHECKED_DESCRIPTION, n, Integer.valueOf(n));
        }
        return this.a.e.getQuantityString(R.plurals.PHOTO_ACCESSIBILITY_THUMBS_UP_UNCHECKED_DESCRIPTION, n, Integer.valueOf(n));
    }

    @Override // defpackage.jbj
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.jbj
    public CharSequence g() {
        return "";
    }

    @Override // defpackage.jbj
    public CharSequence h() {
        return "";
    }

    @Override // defpackage.jbj
    public CharSequence i() {
        return "";
    }

    @Override // defpackage.jbj
    public CharSequence j() {
        return "";
    }

    @Override // defpackage.jbj
    public Boolean k() {
        return Boolean.valueOf(a() != null);
    }

    @Override // defpackage.jbj
    public cqkl l() {
        bdfb bdfbVar = this.a;
        bcrt bcrtVar = bdfbVar.a;
        dwfl dwflVar = bdfbVar.c;
        int i = bdfbVar.d;
        dqjh dqjhVar = c().booleanValue() ? dqjh.THUMBS_VOTE_NONE : dqjh.THUMBS_UP;
        bcrl bcrlVar = (bcrl) bcrtVar;
        if (!bcrlVar.b.a().c()) {
            bcrlVar.c.k(new bcrj(bcrlVar, dwflVar, i, dqjhVar), null);
        } else {
            bcrlVar.b(dwflVar, i, dqjhVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.jbj
    public cqkl m() {
        return cqkl.a;
    }

    @Override // defpackage.jbj
    @dzsi
    public cqtd q() {
        return null;
    }

    @Override // defpackage.jbj
    @dzsi
    public cqtd r() {
        return null;
    }

    @Override // defpackage.jbj
    public cjtd s() {
        cjta b = cjtd.b();
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = c().booleanValue() ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        b.d = dtxy.cI;
        dwfl dwflVar = this.a.c;
        if ((dwflVar.a & ImageMetadata.LENS_APERTURE) != 0) {
            dpsn dpsnVar = dwflVar.t;
            if (dpsnVar == null) {
                dpsnVar = dpsn.d;
            }
            b.g = decs.a(dpsnVar.c);
        }
        return b.a();
    }

    @Override // defpackage.jbj
    @dzsi
    public cjtd t() {
        return null;
    }

    @Override // defpackage.jbj
    public CharSequence u() {
        return "";
    }

    @Override // defpackage.jbj
    public void v(int i) {
    }
}
