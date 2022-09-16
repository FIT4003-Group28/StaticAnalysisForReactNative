package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bfkp  reason: default package */
/* loaded from: classes3.dex */
public class bfkp implements jbr {
    private final bbut a;
    private final ilo b;
    private final boolean c;
    private final boolean d;
    private cjtd e;
    private jjn f = jjn.HIDDEN;
    private Integer g = -1;

    public bfkp(bbut bbutVar, ilo iloVar, ddho ddhoVar, boolean z, boolean z2) {
        this.a = bbutVar;
        this.b = iloVar;
        this.c = z;
        this.e = cjtd.a(ddhoVar);
        this.d = z2;
    }

    @Override // defpackage.jbr
    public Boolean a() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.jbr
    public Boolean b() {
        return true;
    }

    @Override // defpackage.jbr
    public cqkl c() {
        bbut bbutVar = this.a;
        bbuz m = bbve.m();
        m.b(bbuy.POP_OUT_OF_PHOTO_UPLOAD_FLOW);
        m.e(dwyd.PLACE_PAGE);
        ((bbsu) m).b = this.b;
        bbutVar.j(m.a());
        return cqkl.a;
    }

    @Override // defpackage.jbr
    public cqvf d() {
        return cqvf.l(R.string.ADD_A_PHOTO_DESCRIPTION);
    }

    @Override // defpackage.jbr
    public cqtd e() {
        return cqta.f();
    }

    @Override // defpackage.jbr
    public cqss f() {
        if (!this.c) {
            return ibm.p();
        }
        return ibl.b();
    }

    @Override // defpackage.jbr
    public cqss g() {
        if (!this.c) {
            return ibm.x();
        }
        return ibl.b();
    }

    @Override // defpackage.jbr
    public View.AccessibilityDelegate h() {
        if (this.f == jjn.EXPANDED) {
            return new bnhx();
        }
        return new View.AccessibilityDelegate();
    }

    @Override // defpackage.jbr
    public Integer i() {
        return Integer.valueOf(this.d ? this.g.intValue() : -1);
    }

    @Override // defpackage.jbt
    public void j(cqiv cqivVar) {
        cqivVar.a(new hgj(), this);
    }

    @Override // defpackage.jbt
    public cjtd k() {
        return this.e;
    }

    public void l(jjn jjnVar) {
        this.f = jjnVar;
    }

    public void m(Integer num) {
        this.g = num;
    }

    public void n(ddho ddhoVar) {
        cjta c = cjtd.c(this.e);
        c.d = ddhoVar;
        this.e = c.a();
    }
}
