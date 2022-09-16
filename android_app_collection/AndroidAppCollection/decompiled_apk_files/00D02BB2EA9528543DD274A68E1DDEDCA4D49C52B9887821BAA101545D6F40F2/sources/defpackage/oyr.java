package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: oyr  reason: default package */
/* loaded from: classes7.dex */
class oyr implements bcdh {
    private final jic a;
    private final float b;

    public oyr(dwfl dwflVar) {
        this.a = new jic(dwflVar.h, jfv.b(dwflVar), 0, 250);
        dhjx dhjxVar = dwflVar.m;
        dhkd dhkdVar = (dhjxVar == null ? dhjx.f : dhjxVar).d;
        float f = (dhkdVar == null ? dhkd.d : dhkdVar).b;
        dhjx dhjxVar2 = dwflVar.m;
        dhkd dhkdVar2 = (dhjxVar2 == null ? dhjx.f : dhjxVar2).d;
        float f2 = (dhkdVar2 == null ? dhkd.d : dhkdVar2).c;
        int a = dwfc.a(dwflVar.f);
        if (a != 0 && a == 3 && f > 0.0f && f2 > 0.0f) {
            this.b = f / f2;
        } else {
            this.b = 1.0f;
        }
    }

    @Override // defpackage.bcdh
    public void a(cqiv cqivVar) {
        cqivVar.a(new bcda(), this);
    }

    @Override // defpackage.bcdh
    public jic b() {
        return this.a;
    }

    @Override // defpackage.bcdh
    public Float c() {
        return Float.valueOf(this.b);
    }

    @Override // defpackage.bcdh
    public Boolean d() {
        return false;
    }

    @Override // defpackage.bcdh
    public View.OnClickListener e() {
        return null;
    }

    @Override // defpackage.bcdh
    public cjtd f() {
        return null;
    }

    @Override // defpackage.bcdh
    public CharSequence g() {
        return null;
    }

    @Override // defpackage.bcdh
    public Boolean h() {
        return false;
    }

    @Override // defpackage.bcdh
    public Boolean i() {
        throw null;
    }

    @Override // defpackage.bcdh
    public CharSequence j() {
        throw null;
    }

    @Override // defpackage.bcdh
    public Boolean k() {
        return bcdg.a();
    }

    @Override // defpackage.bcdh
    public String l() {
        return null;
    }
}
