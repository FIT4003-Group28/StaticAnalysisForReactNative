package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bhiu  reason: default package */
/* loaded from: classes3.dex */
public class bhiu implements bhio {
    public final cqhn a;
    private final gga d;
    private final bhhf e;
    private final boolean f;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private String m;
    private String n;
    public cjtd c = cjtd.b;
    private boolean g = true;
    public boolean b = false;

    public bhiu(gga ggaVar, bhhf bhhfVar, bhat bhatVar, cqhn cqhnVar) {
        this.d = ggaVar;
        this.e = bhhfVar;
        this.a = cqhnVar;
        this.f = bhatVar.a();
    }

    @Override // defpackage.bhio
    public Boolean a() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.bhio
    public Boolean c() {
        if (!this.i || !this.j) {
            return false;
        }
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.bhio
    public Boolean d() {
        return Boolean.valueOf(this.k);
    }

    @Override // defpackage.bhio
    public Boolean e() {
        return Boolean.valueOf(this.l);
    }

    @Override // defpackage.bhio
    public String f() {
        return this.m;
    }

    @Override // defpackage.bhio
    public cjtd g() {
        return this.c;
    }

    @Override // defpackage.bhio
    public Boolean h() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.bhio
    public Boolean i() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.bhio
    public String j() {
        return this.n;
    }

    public void k(dpua dpuaVar) {
        l(false);
        String str = dpuaVar.b;
        this.m = str;
        if (this.f && this.i) {
            str = this.d.getString(R.string.MERCHANT_PANEL_INSIGHTS_CONTENT_DESCRIPTION, new Object[]{str});
        }
        this.n = str;
        int a = dptx.a(dpuaVar.c);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i != 2) {
            this.k = false;
            if (i == 3) {
                this.l = true;
                this.h = true;
            }
        } else {
            this.k = true;
        }
        this.l = false;
        this.h = true;
    }

    public void l(boolean z) {
        this.g = z;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        this.i = this.e.m(bwrsVar);
        boolean z = false;
        if (iloVar != null) {
            dvwi dvwiVar = iloVar.bf().v;
            if (dvwiVar == null) {
                dvwiVar = dvwi.m;
            }
            if ((dvwiVar.a & 256) != 0) {
                z = true;
            }
        }
        this.j = z;
    }

    @Override // defpackage.bega
    public void u() {
        this.i = false;
        this.j = false;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return true;
    }

    @Override // defpackage.bhio
    public Boolean b() {
        if (!this.i || !this.j) {
            return Boolean.valueOf(this.h);
        }
        return false;
    }
}
