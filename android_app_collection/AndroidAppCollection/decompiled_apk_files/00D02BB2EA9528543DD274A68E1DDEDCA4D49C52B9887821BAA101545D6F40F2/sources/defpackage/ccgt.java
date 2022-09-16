package defpackage;

import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ccgt  reason: default package */
/* loaded from: classes4.dex */
public class ccgt implements ccib {
    private final dioc a;
    private final boolean b;
    @dzsi
    private final ccia c;
    private final boolean d;
    private final gga e;
    private final cjtd f;
    private final boolean g;
    private final List<ccig> h = new ArrayList();

    public ccgt(dioc diocVar, boolean z, @dzsi ccia cciaVar, boolean z2, boolean z3, gga ggaVar) {
        this.a = diocVar;
        this.b = z;
        this.c = cciaVar;
        this.d = z2;
        this.g = z3;
        this.e = ggaVar;
        for (diob diobVar : diocVar.d) {
            this.h.add(new cchs(diobVar));
        }
        if (z) {
            this.f = cjtd.a(dtxu.ar);
        } else if (this.d) {
            this.f = cjtd.a(dtxu.aq);
        } else {
            this.f = cjtd.a(dtxu.as);
        }
    }

    @Override // defpackage.ccib
    public CharSequence a() {
        return this.a.c;
    }

    @Override // defpackage.ccib
    public Boolean b() {
        return Boolean.valueOf(this.c != null);
    }

    @Override // defpackage.ccib
    public Boolean c() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.ccib
    public List<ccig> d() {
        return this.h;
    }

    @Override // defpackage.ccib
    @dzsi
    public cjtd e() {
        dioc diocVar = this.a;
        if ((diocVar.a & 4) != 0) {
            return cjtd.a(cjth.d(diocVar.e));
        }
        return null;
    }

    @Override // defpackage.ccib
    public cjtd f() {
        return this.f;
    }

    @Override // defpackage.ccib
    public cqkl g() {
        ccia cciaVar = this.c;
        if (cciaVar != null) {
            cciaVar.a();
        }
        return cqkl.a;
    }

    @Override // defpackage.ccib
    public CharSequence h() {
        if (this.b) {
            return this.e.getString(R.string.NEXT_BUTTON);
        }
        return this.e.getString(true != this.d ? R.string.LOCAL_GUIDE_SIGN_IN_AND_JOIN_BUTTON : R.string.LOCAL_GUIDE_JOIN_BUTTON);
    }

    @Override // defpackage.ccib
    public cqtd j() {
        if (this.b) {
            return irn.aa();
        }
        return irn.Y();
    }

    @Override // defpackage.ccib
    public Boolean k() {
        int a = dinz.a(this.a.b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ccib
    public cqtd i() {
        int a = dinz.a(this.a.b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i != 1) {
            if (i == 2) {
                return cqrt.f(2131232101);
            }
            return irg.Q();
        }
        return cqrt.f(2131232100);
    }
}
