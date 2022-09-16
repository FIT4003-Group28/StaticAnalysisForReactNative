package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bhjr  reason: default package */
/* loaded from: classes3.dex */
public class bhjr implements bhjp, bega {
    private final Activity b;
    private final dxio<begg> c;
    @dzsi
    private bwrs<ilo> e;
    public boolean a = false;
    @dzsi
    private ckqf d = null;

    public bhjr(Activity activity, dxio<begg> dxioVar, dxio<bbut> dxioVar2) {
        this.b = activity;
        this.c = dxioVar;
    }

    @dzsi
    private final String a() {
        ilo c;
        bwrs<ilo> bwrsVar = this.e;
        if (bwrsVar == null || (c = bwrsVar.c()) == null) {
            return null;
        }
        return c.aL();
    }

    @Override // defpackage.bhjp
    public Boolean b() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.bhjp
    @dzsi
    public jic c() {
        String a = a();
        if (a != null) {
            ckqc ckqcVar = ckqc.FULLY_QUALIFIED;
            if (this.d == null) {
                this.d = new bhjq(this);
            }
            return new jic(a, ckqcVar, 0, this.d);
        }
        return null;
    }

    @Override // defpackage.bhjp
    public Boolean d() {
        return w();
    }

    @Override // defpackage.bhjp
    public cqkl e() {
        this.c.a().m(jjn.COLLAPSED);
        return cqkl.a;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.e = bwrsVar;
    }

    @Override // defpackage.bega
    public void u() {
        this.e = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        boolean z = true;
        boolean z2 = btpf.b(this.b) && this.b.getResources().getConfiguration().orientation == 2;
        String a = a();
        if (z2 || a == null) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
