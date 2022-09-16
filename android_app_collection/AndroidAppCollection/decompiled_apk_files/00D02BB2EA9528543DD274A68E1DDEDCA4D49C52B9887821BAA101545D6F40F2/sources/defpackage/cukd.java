package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: cukd  reason: default package */
/* loaded from: classes5.dex */
public final class cukd implements ctuj {
    @Override // defpackage.ctuj
    public final dxqg a(cugu cuguVar) {
        dbsg<cukp> b = cuiq.b(cuguVar);
        if (!b.a()) {
            cstl.a("PhotoMsgConverter");
            dxqg bZ = dxqi.t.bZ();
            dxos dxosVar = dxos.UNKNOWN;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((dxqi) bZ.b).l = dxosVar.a();
            return bZ;
        }
        cukp b2 = b.b();
        byte[] b3 = b2.c().a() ? b2.c().b() : null;
        dxqg bZ2 = dxqi.t.bZ();
        dxos dxosVar2 = dxos.PHOTO;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ((dxqi) bZ2.b).l = dxosVar2.a();
        dxql bZ3 = dxqm.d.bZ();
        dxpu bZ4 = dxpv.f.bZ();
        dxvx bZ5 = dxvy.d.bZ();
        String a = b2.a().a();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        a.getClass();
        ((dxvy) bZ5.b).a = a;
        dsqy c = dsqy.c(b2.a().b());
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        c.getClass();
        ((dxvy) bZ5.b).c = c;
        ((dxvy) bZ5.b).b = eacr.a(12);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dxvy bK = bZ5.bK();
        bK.getClass();
        ((dxpv) bZ4.b).a = bK;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        ((dxpv) bZ4.b).b = "image/jpeg";
        dspd x = dspd.x(b3);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dxpv dxpvVar = (dxpv) bZ4.b;
        x.getClass();
        dxpvVar.c = x;
        dxpvVar.d = "image/jpeg";
        int f = b2.f();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        ((dxpv) bZ4.b).e = f;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dxpv bK2 = bZ4.bK();
        bK2.getClass();
        ((dxqm) bZ3.b).a = bK2;
        int d = b2.d();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        ((dxqm) bZ3.b).b = d;
        int e = b2.e();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        ((dxqm) bZ3.b).c = e;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dxqi dxqiVar = (dxqi) bZ2.b;
        dxqm bK3 = bZ3.bK();
        bK3.getClass();
        dxqiVar.d = bK3;
        dxqiVar.c = R.styleable.AppCompatTheme_textAppearanceListItem;
        return bZ2;
    }

    @Override // defpackage.ctuj
    public final cugm b(ctyy ctyyVar, dxqi dxqiVar) {
        dxos b = dxos.b(dxqiVar.l);
        if (b == null) {
            b = dxos.UNRECOGNIZED;
        }
        if (!b.equals(dxos.PHOTO)) {
            cstl.a("PhotoMsgConverter");
            return cuas.d(dspd.b);
        }
        dxpv dxpvVar = (dxqiVar.c == 103 ? (dxqm) dxqiVar.d : dxqm.d).a;
        if (dxpvVar == null) {
            dxpvVar = dxpv.f;
        }
        if (!dxpvVar.b.equalsIgnoreCase("image/jpeg")) {
            cstl.a("PhotoMsgConverter");
            return cuas.d(dspd.b);
        }
        dxpv dxpvVar2 = (dxqiVar.c == 103 ? (dxqm) dxqiVar.d : dxqm.d).a;
        if (dxpvVar2 == null) {
            dxpvVar2 = dxpv.f;
        }
        byte[] G = dxpvVar2.c.G();
        cuko i = cukp.i();
        i.h(G);
        i.b(0);
        cukk cukkVar = (cukk) i;
        cukkVar.b = null;
        i.i((dxqiVar.c == 103 ? (dxqm) dxqiVar.d : dxqm.d).b);
        i.c((dxqiVar.c == 103 ? (dxqm) dxqiVar.d : dxqm.d).c);
        dxpv dxpvVar3 = (dxqiVar.c == 103 ? (dxqm) dxqiVar.d : dxqm.d).a;
        if (dxpvVar3 == null) {
            dxpvVar3 = dxpv.f;
        }
        i.f(dxpvVar3.e);
        cukm c = cukn.c();
        dxpv dxpvVar4 = (dxqiVar.c == 103 ? (dxqm) dxqiVar.d : dxqm.d).a;
        if (dxpvVar4 == null) {
            dxpvVar4 = dxpv.f;
        }
        dxvy dxvyVar = dxpvVar4.a;
        if (dxvyVar == null) {
            dxvyVar = dxvy.d;
        }
        c.b(dxvyVar.a);
        dxpv dxpvVar5 = (dxqiVar.c == 103 ? (dxqm) dxqiVar.d : dxqm.d).a;
        if (dxpvVar5 == null) {
            dxpvVar5 = dxpv.f;
        }
        dxvy dxvyVar2 = dxpvVar5.a;
        if (dxvyVar2 == null) {
            dxvyVar2 = dxvy.d;
        }
        dsqy dsqyVar = dxvyVar2.c;
        if (dsqyVar == null) {
            dsqyVar = dsqy.b;
        }
        c.c(dsqyVar.a);
        cukkVar.a = c.a();
        dbsg<byte[]> a = cuiq.a(i.a());
        if (!a.a()) {
            cstl.a("PhotoMsgConverter");
            return cuas.d(dspd.b);
        }
        cugk c2 = cugl.c();
        ((cudv) c2).a = "photos";
        c2.b(a.b());
        return cuas.b(c2.a());
    }
}
