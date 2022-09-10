package defpackage;

import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ahcz  reason: default package */
/* loaded from: classes2.dex */
public class ahcz extends ahhv {
    private final List<agxa<?>> a;
    private final List<agwu> b;
    private final agwu c;
    private final agyq d;
    private final ahdf e;
    private final cjta f;

    public ahcz(ahht ahhtVar, ahas ahasVar, ahdg ahdgVar, ahfo ahfoVar, dlcv dlcvVar, int i, agyh agyhVar) {
        super(ahhtVar, dlcvVar, agyhVar);
        dlaw dlawVar;
        if (dlcvVar.b == 13) {
            dlawVar = (dlaw) dlcvVar.c;
        } else {
            dlawVar = dlaw.e;
        }
        ddzf bZ = ddzg.t.bZ();
        ddyt bZ2 = ddyu.i.bZ();
        boolean z = agyhVar.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddyu ddyuVar = (ddyu) bZ2.b;
        int i2 = ddyuVar.a | 4;
        ddyuVar.a = i2;
        ddyuVar.c = z;
        dspd dspdVar = dlcvVar.d;
        dspdVar.getClass();
        int i3 = i2 | 512;
        ddyuVar.a = i3;
        ddyuVar.h = dspdVar;
        ddyuVar.a = i3 | 8;
        ddyuVar.d = i;
        int i4 = ddcu.i.a;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddyu ddyuVar2 = (ddyu) bZ2.b;
        ddyuVar2.a |= 16;
        ddyuVar2.e = i4;
        ddyu bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddzg ddzgVar = (ddzg) bZ.b;
        bK.getClass();
        ddzgVar.k = bK;
        ddzgVar.b |= 1;
        ddzg bK2 = bZ.bK();
        cjta z2 = z(dlawVar.a, i, bK2, agyhVar);
        this.f = z2;
        dlcx dlcxVar = dlawVar.c;
        dlcx dlcxVar2 = dlcxVar == null ? dlcx.e : dlcxVar;
        dlcx dlcxVar3 = dlawVar.c;
        dvyw dvywVar = (dlcxVar3 == null ? dlcx.e : dlcxVar3).c;
        ahfn a = ahfoVar.a(dlcxVar2, 0, bK2, (dvywVar == null ? dvyw.bv : dvywVar).I, false);
        this.c = a;
        dcdc z3 = dcbg.b(dlawVar.d).s(ahcy.a).z();
        String str = dlawVar.b;
        long millis = TimeUnit.SECONDS.toMillis(3L);
        agxu agxuVar = agyhVar.g;
        ahdf a2 = ahdgVar.a(z3, str, millis, (agxuVar == null ? agxu.c : agxuVar).b, z2);
        this.e = a2;
        aggm b = aggn.b();
        b.b(2);
        agxa a3 = agxa.a(new aggo(b.a()), a2);
        agoa h = agob.h();
        h.e(true);
        this.a = dcdc.g(a3, agxa.a(new agdj(h.a()), new ahfl(a)));
        jic jicVar = new jic((String) null, ckqc.FULLY_QUALIFIED, iup.e(R.raw.localstream_foodie_favorite_icon_svg), 0);
        cjtd cjtdVar = cjtd.b;
        String str2 = dlawVar.b;
        this.d = ahasVar.a(str2, null, jicVar, null, cjtdVar, str2, null, this);
        this.b = dcdc.f(a);
    }

    @Override // defpackage.agxe
    public List<agxa<?>> a() {
        return this.a;
    }

    @Override // defpackage.agxe
    public cjtd b(ddho ddhoVar) {
        return this.f.b(ddhoVar);
    }

    @Override // defpackage.agxe
    public cqix<agyq> c() {
        return cqgr.fT(new agdv(), this.d);
    }

    @Override // defpackage.agxe
    public List<agwu> g() {
        return this.b;
    }

    @Override // defpackage.ahhv
    public final agyh n() {
        agxs agxsVar = this.m;
        agxt bZ = agxu.c.bZ();
        int intValue = this.e.a().k().intValue();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        agxu agxuVar = (agxu) bZ.b;
        agxuVar.a |= 1;
        agxuVar.b = intValue;
        if (agxsVar.c) {
            agxsVar.bF();
            agxsVar.c = false;
        }
        agyh agyhVar = (agyh) agxsVar.b;
        agxu bK = bZ.bK();
        agyh agyhVar2 = agyh.k;
        bK.getClass();
        agyhVar.g = bK;
        agyhVar.a |= 64;
        return super.n();
    }

    @Override // defpackage.ahhv
    @dzsi
    public agwu o() {
        return this.c;
    }

    @Override // defpackage.ahhv
    public void p() {
        this.e.c();
    }

    @Override // defpackage.ahhv
    public void q() {
        super.q();
        this.e.h();
    }
}
