package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: nkw  reason: default package */
/* loaded from: classes7.dex */
public class nkw implements nkv {
    private final Context a;
    private final jzp b;
    private final mor c;
    private final ldm d;
    private final ldm e;
    private final boolean f;
    private final noj g;
    private final lzf h;
    private boolean i = false;

    public nkw(Context context, jzp jzpVar, mor morVar, ldm ldmVar, ldm ldmVar2, boolean z, noj nojVar, lzf lzfVar) {
        this.a = context;
        dbsk.s(jzpVar);
        this.b = jzpVar;
        dbsk.s(morVar);
        this.c = morVar;
        dbsk.s(ldmVar);
        this.d = ldmVar;
        dbsk.s(ldmVar2);
        this.e = ldmVar2;
        this.f = z;
        dbsk.s(nojVar);
        this.g = nojVar;
        this.h = lzfVar;
    }

    private final boolean A() {
        return cqsz.d().a(this.a) >= cqrp.d(445.0d).a(this.a);
    }

    @dzsi
    private final dwfl z() {
        int a;
        dbsk.l(false);
        ilo iloVar = this.d.d;
        if (iloVar == null) {
            return null;
        }
        for (dwfl dwflVar : iloVar.aE()) {
            if (dwflVar != null && ((a = dwfc.a(dwflVar.f)) == 0 || a == 1)) {
                dizh dizhVar = dwflVar.p;
                if (dizhVar == null) {
                    dizhVar = dizh.j;
                }
                diis diisVar = dizhVar.g;
                if (diisVar == null) {
                    diisVar = diis.h;
                }
                int a2 = diip.a(diisVar.b);
                if (a2 == 0 || a2 != 2) {
                    if ((dwflVar.a & 128) != 0) {
                        return dwflVar;
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.nkv
    public CharSequence a() {
        String str = this.d.b;
        return str == null ? this.a.getResources().getString(R.string.LOADING_ADDRESS_CONTEXT_LABEL) : str;
    }

    @Override // defpackage.nkv
    @dzsi
    public CharSequence b() {
        return this.d.c;
    }

    @Override // defpackage.nkv
    public Boolean c() {
        boolean z = false;
        if (!x().booleanValue() && !y().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.nkv
    public CharSequence d() {
        String str = this.e.b;
        return str == null ? this.a.getResources().getString(R.string.LOADING_ADDRESS_CONTEXT_LABEL) : str;
    }

    @Override // defpackage.nkv
    @dzsi
    public CharSequence e() {
        ldm ldmVar = this.e;
        String str = ldmVar.c;
        dpjs dpjsVar = ldmVar.h.b;
        if (x().booleanValue() || y().booleanValue() || dpjsVar == dpjs.ENTITY_TYPE_HOME || dpjsVar == dpjs.ENTITY_TYPE_WORK) {
            return null;
        }
        return str;
    }

    @Override // defpackage.nkv
    @dzsi
    public cqtd f() {
        return this.c.b();
    }

    @Override // defpackage.nkv
    public CharSequence g() {
        int d = this.c.d();
        return d == 0 ? "" : this.a.getResources().getString(d);
    }

    @Override // defpackage.nkv
    public cqkl h() {
        if (k().booleanValue()) {
            return cqkl.a;
        }
        this.c.m();
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.nkv
    public cqkl i() {
        if (k().booleanValue()) {
            return cqkl.a;
        }
        this.h.l();
        return cqkl.a;
    }

    @Override // defpackage.nkv
    public Boolean j() {
        return Boolean.valueOf(this.b.h());
    }

    @Override // defpackage.nkv
    public Boolean k() {
        return Boolean.valueOf(this.c.a());
    }

    @Override // defpackage.nkv
    public CharSequence l() {
        return this.c.g();
    }

    @Override // defpackage.nkv
    public cqss m() {
        return this.c.i();
    }

    @Override // defpackage.nkv
    public Boolean n() {
        return false;
    }

    @Override // defpackage.nkv
    public CharSequence o() {
        return this.c.j();
    }

    @Override // defpackage.nkv
    public Boolean p() {
        boolean z = false;
        if (this.c.h() && n().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.nkv
    @dzsi
    public jic q() {
        dwfl z;
        if (r().booleanValue() && (z = z()) != null) {
            ckql ckqlVar = new ckql();
            ckqlVar.f = true;
            return new jic(z.h, jfv.b(z), nqu.av(), 0, null, ckqlVar);
        }
        return null;
    }

    @Override // defpackage.nkv
    public Boolean r() {
        ilo iloVar;
        boolean z = false;
        if (!A() || x().booleanValue() || y().booleanValue() || (iloVar = this.d.d) == null || iloVar.bg()) {
            return false;
        }
        if (z() != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.nkv
    public Boolean s() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.nkv
    public Boolean t() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.nkv
    public void u(boolean z) {
        this.i = z;
    }

    @Override // defpackage.nkv
    public Boolean v() {
        boolean z = false;
        if ((A() || !t().booleanValue()) && !x().booleanValue() && !y().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.nkv
    public Boolean w() {
        return false;
    }

    @Override // defpackage.nkv
    public Boolean x() {
        noj nojVar = this.g;
        int i = this.a.getResources().getConfiguration().screenWidthDp;
        int i2 = this.a.getResources().getConfiguration().screenHeightDp;
        return Boolean.valueOf(nojVar.b() == noi.SMALL);
    }

    @Override // defpackage.nkv
    public Boolean y() {
        noj nojVar = this.g;
        int i = this.a.getResources().getConfiguration().screenWidthDp;
        int i2 = this.a.getResources().getConfiguration().screenHeightDp;
        return Boolean.valueOf(nojVar.b() == noi.MEDIUM);
    }
}
