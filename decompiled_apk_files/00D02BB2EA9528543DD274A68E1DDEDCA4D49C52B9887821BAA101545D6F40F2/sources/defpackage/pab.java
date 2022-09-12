package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: pab  reason: default package */
/* loaded from: classes7.dex */
class pab implements oxy {
    private final Context a;
    private final cjzt b;
    private final dtra c;
    private final dvyw d;
    @dzsi
    private final cjtd e;

    public pab(Context context, cjzt cjztVar, dtra dtraVar) {
        this.a = context;
        this.b = cjztVar;
        this.c = dtraVar;
        dvyw dvywVar = dtraVar.e;
        this.d = dvywVar == null ? dvyw.bv : dvywVar;
        this.e = oyf.b(cjztVar.b, dtraVar.g, dtxl.b, cjztVar.e, null);
    }

    @Override // defpackage.oxe
    @dzsi
    public cjtd a() {
        return this.e;
    }

    @Override // defpackage.oxy
    public String b() {
        return (String) dbsg.j(this.d).h(ozw.a).c("");
    }

    @Override // defpackage.oxy
    public String c() {
        return (String) dbsg.j(this.d).h(ozx.a).c("");
    }

    @Override // defpackage.oxy
    public jic d() {
        dvyw dvywVar = this.d;
        if (dvywVar != null && (dvywVar.a & 2097152) != 0) {
            dvxh dvxhVar = dvywVar.z;
            if (dvxhVar == null) {
                dvxhVar = dvxh.B;
            }
            if ((dvxhVar.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
                dvxh dvxhVar2 = this.d.z;
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
        int i = true != ((doay) dbsg.j(this.d).h(paa.a).c(doay.UNSUPPORTED)).equals(doay.TYPE_ROAD) ? 194 : 65523;
        ckqc ckqcVar = ckqc.FULLY_QUALIFIED;
        owz a = oxa.a(i);
        dbsk.s(a);
        return new jic((String) null, ckqcVar, a.a(), 250);
    }

    @Override // defpackage.oxy
    public dhyq e() {
        dhyq b = dhyq.b(this.c.d);
        return b == null ? dhyq.UNKNOWN_FACTUAL_EDIT_STATE : b;
    }

    @Override // defpackage.oxy
    public String f() {
        dtra dtraVar = this.c;
        if (dtraVar.c) {
            return this.a.getString(R.string.EDIT_PUBLISHED_PLACE_CREATION);
        }
        return dbrz.e(" · ").g(dcbg.b(dtraVar.b).s(ozy.a));
    }

    @Override // defpackage.oxy
    public Boolean g() {
        return Boolean.valueOf((this.c.a & 32) != 0);
    }

    @Override // defpackage.oxy
    public String h() {
        return dbrz.e("\n").g(dcbg.b(this.c.h).s(ozz.a));
    }

    @Override // defpackage.oxy
    public cqkl i(cjqm cjqmVar) {
        if (g().booleanValue()) {
            cjyi cjyiVar = this.b.c;
            dthb dthbVar = this.c.f;
            if (dthbVar == null) {
                dthbVar = dthb.F;
            }
            cjzt cjztVar = this.b;
            cjyiVar.j(dthbVar, nxc.a(cjztVar.a, cjztVar.b, cjqmVar));
        }
        return cqkl.a;
    }
}
