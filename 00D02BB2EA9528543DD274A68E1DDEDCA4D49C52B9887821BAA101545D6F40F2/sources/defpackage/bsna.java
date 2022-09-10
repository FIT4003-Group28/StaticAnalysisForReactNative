package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bsna  reason: default package */
/* loaded from: classes4.dex */
public class bsna implements bsmx {
    private final dxio<axwy> a;
    private final djrm b;
    private final jic c;
    private final jic d;
    private final cjtd e;

    public bsna(dxio<axwy> dxioVar, djrm djrmVar, int i, ddho ddhoVar) {
        this.a = dxioVar;
        this.b = djrmVar;
        drco drcoVar = djrmVar.m;
        String str = (drcoVar == null ? drco.d : drcoVar).c;
        String str2 = djrmVar.q;
        cjta b = cjtd.b();
        b.d = ddhoVar;
        b.i(i);
        ddes bZ = ddet.D.bZ();
        ddzh bZ2 = ddzp.i.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddzp ddzpVar = (ddzp) bZ2.b;
        str.getClass();
        ddzpVar.a |= 1;
        ddzpVar.b = str;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        ddzp bK = bZ2.bK();
        bK.getClass();
        ddetVar.h = bK;
        ddetVar.a |= 32;
        b.s(bZ.bK());
        if (!dbsj.d(str2)) {
            b.g(str2);
        }
        this.e = b.a();
        this.c = new jic(djrmVar.k, ckqc.FIFE, iup.e(R.raw.editorial_list), 250);
        djro djroVar = djrmVar.j;
        this.d = new jic((djroVar == null ? djro.c : djroVar).b, ckqc.FIFE_MERGE, 2131232998, 250);
    }

    @Override // defpackage.bsmx
    public jic a() {
        return this.d;
    }

    @Override // defpackage.bsmx
    public String b() {
        djro djroVar = this.b.j;
        if (djroVar == null) {
            djroVar = djro.c;
        }
        return djroVar.a;
    }

    @Override // defpackage.bsmx
    public CharSequence c() {
        djrm djrmVar = this.b;
        if ((djrmVar.a & 4) != 0) {
            dghq dghqVar = djrmVar.d;
            if (dghqVar == null) {
                dghqVar = dghq.b;
            }
            dgly dglyVar = dghqVar.a.get(0).b;
            if (dglyVar == null) {
                dglyVar = dgly.c;
            }
            return acls.a(dglyVar);
        }
        return "";
    }

    @Override // defpackage.bsmz
    @dzsi
    public jic d(int i) {
        return this.c;
    }

    @Override // defpackage.bsmz
    public String e() {
        return this.b.b;
    }

    @Override // defpackage.bsmz
    public cqkl f(cjqm cjqmVar) {
        axwy a = this.a.a();
        drco drcoVar = this.b.m;
        if (drcoVar == null) {
            drcoVar = drco.d;
        }
        a.E(drcoVar.c);
        return cqkl.a;
    }

    @Override // defpackage.bsmz
    @dzsi
    public cjtd g() {
        return this.e;
    }
}
