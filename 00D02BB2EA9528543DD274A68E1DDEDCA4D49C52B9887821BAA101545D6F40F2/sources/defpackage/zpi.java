package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zpi  reason: default package */
/* loaded from: classes7.dex */
public class zpi implements zev {
    public dbsg<dlno> a = dbpy.a;
    private boolean b = false;
    private final Resources c;
    private final zph d;
    private final String e;
    private final cezv f;
    private final cjbx g;
    private final zaz h;

    public zpi(Resources resources, cqhn cqhnVar, cjbx cjbxVar, cezv cezvVar, zaz zazVar, zph zphVar, String str) {
        this.c = resources;
        this.f = cezvVar;
        this.d = zphVar;
        this.e = str;
        this.g = cjbxVar;
        this.h = zazVar;
        final bvqg bvqgVar = new bvqg(this) { // from class: zpg
            private final zpi a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                this.a.a = dbsg.i((dlno) obj);
            }
        };
        didl bZ = diea.c.bZ();
        didw bZ2 = didx.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        didx didxVar = (didx) bZ2.b;
        str.getClass();
        didxVar.a |= 1;
        didxVar.b = str;
        didx bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        diea dieaVar = (diea) bZ.b;
        bK.getClass();
        dieaVar.b = bK;
        dieaVar.a = 6;
        cjbxVar.c.b(bZ.bK(), cedl.a(new bvqg(bvqgVar) { // from class: cjbu
            private final bvqg a;

            {
                this.a = bvqgVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                bvqg bvqgVar2 = this.a;
                dspd dspdVar = cjbx.a;
                dlno dlnoVar = ((dier) obj).c;
                if (dlnoVar == null) {
                    dlnoVar = dlno.f;
                }
                bvqgVar2.NU(dlnoVar);
            }
        }), cjbxVar.b);
    }

    private final void j(int i) {
        cjbx cjbxVar = this.g;
        dspd e = dgmr.e(i);
        String str = this.e;
        dgpf bZ = dgpg.k.bZ();
        ddxz e2 = cjra.e(str);
        if (e2 != null) {
            ddyb ddybVar = e2.b;
            if (ddybVar == null) {
                ddybVar = ddyb.e;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dgpg dgpgVar = (dgpg) bZ.b;
            ddybVar.getClass();
            dgpgVar.c = ddybVar;
            dgpgVar.a |= 32;
        }
        dkfc bZ2 = dkfh.k.bZ();
        dspd dspdVar = cjbx.a;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dkfh dkfhVar = (dkfh) bZ2.b;
        dspdVar.getClass();
        int i2 = dkfhVar.a | 1;
        dkfhVar.a = i2;
        dkfhVar.b = dspdVar;
        e.getClass();
        dkfhVar.a = i2 | 4;
        dkfhVar.d = e;
        dspd c = dgmr.c(cjbx.e, cjbx.f);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dkfh dkfhVar2 = (dkfh) bZ2.b;
        c.getClass();
        dkfhVar2.a |= 2;
        dkfhVar2.c = c;
        dspd a = dgmr.a(bZ.bK());
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dkfh dkfhVar3 = (dkfh) bZ2.b;
        a.getClass();
        dkfhVar3.a |= 64;
        dkfhVar3.j = a;
        cjbxVar.d.b(bZ2.bK(), cedl.b(), cjbxVar.b);
        this.h.d.ac(bvjk.km, this.e);
        this.b = true;
        cqkx.p(this);
        zjz zjzVar = ((zjo) this.d).a;
        zjzVar.c = null;
        zjzVar.b = null;
        cqkx.p(zjzVar);
    }

    @Override // defpackage.zev
    public Boolean a() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.zev
    public CharSequence b() {
        return this.c.getString(R.string.TRANSIT_DIRECTIONS_KNOW_A_BETTER_ROUTE_TITLE);
    }

    @Override // defpackage.zev
    public CharSequence c() {
        return this.c.getString(R.string.TRANSIT_DIRECTIONS_KNOW_A_BETTER_ROUTE_SUBTITLE);
    }

    @Override // defpackage.zev
    public CharSequence d() {
        return this.c.getString(R.string.TRANSIT_DIRECTIONS_KNOW_A_BETTER_ROUTE_SUGGEST_CHIP);
    }

    @Override // defpackage.zev
    public CharSequence e() {
        return this.c.getString(R.string.TRANSIT_DIRECTIONS_KNOW_A_BETTER_ROUTE_DISMISS_CHIP);
    }

    @Override // defpackage.zev
    public cqkl f() {
        j(22);
        return cqkl.a;
    }

    @Override // defpackage.zev
    public cqkl g() {
        j(2);
        if (this.a.a()) {
            final dspd e = dgmr.e(2);
            this.f.e(this.a.b(), dcbg.b(this.a.b().c).o(cjbv.a).s(new dbrn(e) { // from class: cjbw
                private final dspd a;

                {
                    this.a = e;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    dspd dspdVar = this.a;
                    dlnm dlnmVar = (dlnm) obj;
                    dspd dspdVar2 = cjbx.a;
                    cfge bZ = cfgf.e.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    cfgf cfgfVar = (cfgf) bZ.b;
                    dlnmVar.getClass();
                    cfgfVar.b = dlnmVar;
                    cfgfVar.a |= 1;
                    cfga bZ2 = cfgd.h.bZ();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    cfgd cfgdVar = (cfgd) bZ2.b;
                    dspdVar.getClass();
                    cfgdVar.a |= 1;
                    cfgdVar.b = dspdVar;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    cfgf cfgfVar2 = (cfgf) bZ.b;
                    cfgd bK = bZ2.bK();
                    bK.getClass();
                    cfgfVar2.c = bK;
                    cfgfVar2.a |= 2;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    cfgf.b((cfgf) bZ.b);
                    return bZ.bK();
                }
            }).z(), cedo.g(this.a.b().b));
        }
        return cqkl.a;
    }

    @Override // defpackage.zev
    public cjtd h() {
        return cjtd.a(dtyc.cH);
    }

    @Override // defpackage.zev
    public cjtd i() {
        return cjtd.a(dtyc.cI);
    }
}
