package defpackage;

import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: oyp  reason: default package */
/* loaded from: classes7.dex */
class oyp implements oxn {
    private final cjzt a;
    private final dtnj b;
    private final dvyw c;
    @dzsi
    private final cjtd d;

    public oyp(cjzt cjztVar, dtnj dtnjVar) {
        this.a = cjztVar;
        this.b = dtnjVar;
        dvyw dvywVar = dtnjVar.b;
        this.c = dvywVar == null ? dvyw.bv : dvywVar;
        this.d = oyf.b(cjztVar.b, dtnjVar.d, dtxl.b, cjztVar.e, null);
    }

    @Override // defpackage.oxe
    @dzsi
    public cjtd a() {
        return this.d;
    }

    @Override // defpackage.oxn
    public String b() {
        dvyw dvywVar = this.c;
        return (dvywVar == null || (dvywVar.a & 16) == 0) ? "" : dvywVar.i;
    }

    @Override // defpackage.oxn
    @dzsi
    public String c() {
        dvyw dvywVar = this.c;
        if (dvywVar == null) {
            return null;
        }
        if ((dvywVar.a & 1024) != 0) {
            return dvywVar.p;
        }
        if (dvywVar.o.size() <= 0) {
            return null;
        }
        return this.c.o.get(0);
    }

    @Override // defpackage.oxn
    public jic d() {
        dvyw dvywVar = this.c;
        if (dvywVar != null && (dvywVar.a & 2097152) != 0) {
            dvxh dvxhVar = dvywVar.z;
            if (dvxhVar == null) {
                dvxhVar = dvxh.B;
            }
            if ((dvxhVar.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
                dvxh dvxhVar2 = this.c.z;
                if (dvxhVar2 == null) {
                    dvxhVar2 = dvxh.B;
                }
                dwfl dwflVar = dvxhVar2.q;
                if (dwflVar == null) {
                    dwflVar = dwfl.w;
                }
                return owy.f(dwflVar, R.color.qu_grey_600);
            }
        }
        ckqc ckqcVar = ckqc.FULLY_QUALIFIED;
        owz a = oxa.a(194);
        dbsk.s(a);
        return new jic((String) null, ckqcVar, a.a(), 250);
    }

    @Override // defpackage.oxn
    public String e() {
        return " · ";
    }

    @Override // defpackage.oxn
    public String f() {
        return this.b.e;
    }

    @Override // defpackage.oxn
    public String g() {
        return this.b.f;
    }

    @Override // defpackage.oxn
    public Boolean h() {
        return Boolean.valueOf((this.b.a & 16) != 0);
    }

    @Override // defpackage.oxn
    public cqkl i(cjqm cjqmVar) {
        if (h().booleanValue()) {
            cjyi cjyiVar = this.a.c;
            dthb dthbVar = this.b.c;
            if (dthbVar == null) {
                dthbVar = dthb.F;
            }
            cjzt cjztVar = this.a;
            cjyiVar.j(dthbVar, nxc.a(cjztVar.a, cjztVar.b, cjqmVar));
        }
        return cqkl.a;
    }
}
