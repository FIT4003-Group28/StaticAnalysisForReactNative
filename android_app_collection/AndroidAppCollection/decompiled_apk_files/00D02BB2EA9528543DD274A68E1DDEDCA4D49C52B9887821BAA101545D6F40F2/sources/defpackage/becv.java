package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: becv  reason: default package */
/* loaded from: classes3.dex */
public class becv implements bnif, bega {
    private final Activity a;
    private final dxio<afha> b;
    private boolean c;
    private boolean d;
    @dzsi
    private ilo e;

    public becv(Activity activity, btvo btvoVar, dxio<afha> dxioVar) {
        this.a = activity;
        this.b = dxioVar;
    }

    @Override // defpackage.bnif
    public Boolean a() {
        return w();
    }

    public boolean b() {
        return this.c && this.d;
    }

    @Override // defpackage.jbf
    public cqtd d() {
        return cqrt.g(2131232488, ibm.w());
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        ilo iloVar = this.e;
        if (iloVar == null) {
            return cqkl.a;
        }
        dqdi dqdiVar = iloVar.h().bs;
        if (dqdiVar == null) {
            dqdiVar = dqdi.e;
        }
        String str = dqdiVar.d;
        this.b.a().q(this.a, new ahr(), str, 1);
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    public cjtd h() {
        ilo iloVar = this.e;
        if (iloVar == null) {
            return cjtd.b;
        }
        cjta c = cjtd.c(iloVar.bZ());
        c.d = dtxj.X;
        return c.a();
    }

    @Override // defpackage.jbf
    @dzsi
    public CharSequence l() {
        return null;
    }

    @Override // defpackage.jbi
    public CharSequence m() {
        ilo iloVar = this.e;
        if (iloVar == null) {
            return "";
        }
        dqdi dqdiVar = iloVar.h().bs;
        if (dqdiVar == null) {
            dqdiVar = dqdi.e;
        }
        return dqdiVar.c;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo c = bwrsVar.c();
        dbsk.s(c);
        this.e = c;
        boolean z = false;
        if (c.aZ()) {
            dqdi dqdiVar = c.h().bs;
            if (dqdiVar == null) {
                dqdiVar = dqdi.e;
            }
            if (dqdiVar.a) {
                z = true;
            }
        }
        this.c = z;
        dqdi dqdiVar2 = c.h().bs;
        if (dqdiVar2 == null) {
            dqdiVar2 = dqdi.e;
        }
        this.d = dqdiVar2.b;
    }

    @Override // defpackage.bega
    public void u() {
        this.e = null;
        this.c = false;
        this.d = false;
    }

    @Override // defpackage.bega
    public Boolean w() {
        boolean z = false;
        if (this.c && !this.d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
