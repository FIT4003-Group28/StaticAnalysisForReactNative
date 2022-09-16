package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cewj  reason: default package */
/* loaded from: classes4.dex */
public class cewj implements cesw {
    private final Activity a;
    private final akzh b;
    private final ceet c;
    private final bbut d;
    private final cese e;
    private final dhsy f;
    @dzsi
    private final String g;
    private final cevz h;
    private final List<cesv> i;

    public cewj(Activity activity, akzh akzhVar, ceet ceetVar, bbut bbutVar, cewg cewgVar, cese ceseVar, dhsy dhsyVar, @dzsi String str, cevz cevzVar) {
        dhst dhstVar;
        cewj cewjVar = this;
        cewjVar.i = new ArrayList();
        cewjVar.a = activity;
        cewjVar.b = akzhVar;
        cewjVar.c = ceetVar;
        cewjVar.d = bbutVar;
        cewjVar.e = ceseVar;
        cewjVar.f = dhsyVar;
        cewjVar.g = str;
        cewjVar.h = cevzVar;
        if (dhsyVar.a == 5) {
            dhstVar = (dhst) dhsyVar.b;
        } else {
            dhstVar = dhst.b;
        }
        dsrj<dixg> dsrjVar = dhstVar.a;
        ckni ckniVar = new ckni(dcbg.b(dsrjVar).s(cewh.a).z());
        int i = 0;
        for (dixg dixgVar : dsrjVar) {
            List<cesv> list = cewjVar.i;
            cewi cewiVar = new cewi(ckniVar);
            int i2 = i + 1;
            boolean z = str == null;
            dkde dkdeVar = dkde.CAPTURE_TIMESTAMP;
            Resources a = cewgVar.a.a();
            cewg.a(a, 1);
            bbut a2 = cewgVar.b.a();
            cewg.a(a2, 2);
            cewg.a(dixgVar, 3);
            cewg.a(cewiVar, 4);
            cewg.a(dkdeVar, 7);
            cewg.a(cevzVar, 8);
            list.add(new cewf(a, a2, dixgVar, cewiVar, i, z, dkdeVar, cevzVar));
            cewjVar = this;
            i = i2;
        }
    }

    @Override // defpackage.cesg
    public String a() {
        return this.f.f;
    }

    @Override // defpackage.cesg
    public cqtd b() {
        return iup.e(R.raw.ic_mod_add_photo);
    }

    @Override // defpackage.cesg
    public String c() {
        return this.a.getString(R.string.ADD_A_PHOTO);
    }

    @Override // defpackage.cesg
    public cqkl d() {
        akqq S = this.b.g().S();
        bbut bbutVar = this.d;
        bbuz m = bbve.m();
        m.e(dwyd.CREATOR_PROFILE);
        m.b(bbuy.POP_OUT_OF_PHOTO_UPLOAD_FLOW);
        ((bbsu) m).a = bbvd.f(S);
        bbutVar.j(m.a());
        return cqkl.a;
    }

    @Override // defpackage.cesg
    public cjtd e() {
        return cjtd.a(dtxl.eL);
    }

    @Override // defpackage.cesg
    public Boolean f() {
        boolean z = false;
        if (this.e.b() && this.g == null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cesi
    public String g() {
        return this.f.d;
    }

    @Override // defpackage.cesi
    public cqkl h() {
        ceet ceetVar = this.c;
        String str = this.g;
        drds b = drds.b(this.f.c);
        if (b == null) {
            b = drds.UNKNOWN_CREATOR_CONTRIBUTION_TYPE;
        }
        boolean z = this.g != null;
        ceer g = cees.g();
        ((ceep) g).b = this.h;
        ceetVar.l(str, b, z, g.a());
        return cqkl.a;
    }

    @Override // defpackage.cesi
    public cjtd i() {
        return cjtd.a(dtxl.fn);
    }

    @Override // defpackage.cesw
    public List<cesv> j() {
        return this.i;
    }

    @Override // defpackage.cesw
    public Integer k() {
        return Integer.valueOf(Math.min(this.i.size(), 5));
    }
}
