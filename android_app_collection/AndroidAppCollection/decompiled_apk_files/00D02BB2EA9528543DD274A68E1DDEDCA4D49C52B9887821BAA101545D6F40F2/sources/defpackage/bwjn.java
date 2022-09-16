package defpackage;

import android.app.Application;
import android.graphics.Point;
import android.util.DisplayMetrics;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bwjn  reason: default package */
/* loaded from: classes4.dex */
public final class bwjn implements bwjx {
    private final Application a;
    private final btvo b;
    private final bvsf c;
    private final cqat d;
    private final pez e;
    private final ahjq f;
    private final bvjj g;
    private final aeht h;
    @dzsi
    private final dxio<nxh> i;
    private final dxio<akfa> j;
    @dzsi
    private final akox k;
    private final axwq l;
    private final Boolean m;
    @dzsi
    private final nvk n;
    private final bvtd o;

    static {
        Class[] clsArr = {dtjb.class, dnmu.class, dtmp.class, dnqh.class, dtnd.class, dnzj.class, dgrn.class, dgrt.class, docs.class, dvto.class, dvts.class, dtqg.class, dtqi.class, dtre.class};
        for (int i = 0; i < 14; i++) {
            Class cls = clsArr[i];
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
            } catch (Exception unused) {
            }
        }
    }

    public bwjn(nvk nvkVar, Application application, btvo btvoVar, bvsf bvsfVar, cqat cqatVar, pez pezVar, ahjq ahjqVar, bvjj bvjjVar, bvtd bvtdVar, aeht aehtVar, dxio dxioVar, dxio dxioVar2, akox akoxVar, axwq axwqVar, Boolean bool) {
        this.n = nvkVar;
        this.a = application;
        this.b = btvoVar;
        this.c = bvsfVar;
        this.d = cqatVar;
        this.e = pezVar;
        this.f = ahjqVar;
        this.g = bvjjVar;
        this.o = bvtdVar;
        this.h = aehtVar;
        this.i = dxioVar;
        this.j = dxioVar2;
        this.k = akoxVar;
        this.l = axwqVar;
        this.m = bool;
    }

    @Override // defpackage.bwjx
    public final bwnn a(dtiy dtiyVar, List<dtja> list, bwnl bwnlVar) {
        bwnn bwnnVar = new bwnn();
        btlu j = this.j.a().j();
        bwnnVar.b = j;
        akox akoxVar = this.k;
        dvtn dvtnVar = bwnnVar.a;
        dtnc dtncVar = (dtnc) dtnd.l.bZ();
        dtrb bZ = dtre.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtre dtreVar = (dtre) bZ.b;
        dtreVar.a |= 8;
        dtreVar.c = 171377664;
        dtjm bZ2 = dtjp.h.bZ();
        if (btpf.b(this.a)) {
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dtjp dtjpVar = (dtjp) bZ2.b;
            dtjpVar.b = 2;
            dtjpVar.a |= 1;
        } else {
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dtjp dtjpVar2 = (dtjp) bZ2.b;
            dtjpVar2.b = 1;
            dtjpVar2.a |= 1;
        }
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        if (displayMetrics.widthPixels > 0 && displayMetrics.heightPixels > 0) {
            int i = displayMetrics.widthPixels;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dtjp dtjpVar3 = (dtjp) bZ2.b;
            dtjpVar3.a |= 2;
            dtjpVar3.c = i;
            int i2 = displayMetrics.heightPixels;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dtjp dtjpVar4 = (dtjp) bZ2.b;
            dtjpVar4.a |= 4;
            dtjpVar4.d = i2;
        } else {
            String valueOf = String.valueOf(displayMetrics);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Can't get display size ");
            sb.append(valueOf);
            sb.toString();
            String valueOf2 = String.valueOf(displayMetrics);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 23);
            sb2.append("Can't get display size ");
            sb2.append(valueOf2);
            bvoo.j(new IllegalStateException(sb2.toString()));
        }
        int i3 = displayMetrics.densityDpi;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dtjp dtjpVar5 = (dtjp) bZ2.b;
        dtjpVar5.a |= 8;
        dtjpVar5.e = i3;
        if (displayMetrics.densityDpi <= 160) {
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dtjp dtjpVar6 = (dtjp) bZ2.b;
            dtjpVar6.f = 1;
            dtjpVar6.a |= 16;
        } else if (displayMetrics.densityDpi <= 240) {
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dtjp dtjpVar7 = (dtjp) bZ2.b;
            dtjpVar7.f = 2;
            dtjpVar7.a |= 16;
        } else if (displayMetrics.densityDpi <= 320) {
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dtjp dtjpVar8 = (dtjp) bZ2.b;
            dtjpVar8.f = 3;
            dtjpVar8.a |= 16;
        } else {
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dtjp dtjpVar9 = (dtjp) bZ2.b;
            dtjpVar9.f = 4;
            dtjpVar9.a |= 16;
        }
        List<Integer> a = this.c.a();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dtjp dtjpVar10 = (dtjp) bZ2.b;
        dsrf dsrfVar = dtjpVar10.g;
        if (!dsrfVar.a()) {
            dtjpVar10.g = dsqw.cg(dsrfVar);
        }
        dsod.bv(a, dtjpVar10.g);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtre dtreVar2 = (dtre) bZ.b;
        dtjp bK = bZ2.bK();
        bK.getClass();
        dtreVar2.b = bK;
        dtreVar2.a |= 2;
        bZ.a(dtrd.LIST_LAYOUT_COMPACT_ICON_VIEW);
        bZ.a(dtrd.HIERARCHICAL_ICONS);
        bZ.a(dtrd.IMAGE_URL_SCHEME_SIZE_REPLACEMENT);
        if (!this.m.booleanValue()) {
            bZ.a(dtrd.SERVER_SIDE_SIGN_IN_PROMO);
        }
        dxio<nxh> dxioVar = this.i;
        if (dxioVar != null) {
            dtie a2 = owx.a(dxioVar.a().a(), this.a.getResources());
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dtre dtreVar3 = (dtre) bZ.b;
            dtiq bK2 = a2.bK();
            bK2.getClass();
            dtreVar3.f = bK2;
            dtreVar3.a |= 16384;
        } else {
            dtiq dtiqVar = dtiq.i;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dtre dtreVar4 = (dtre) bZ.b;
            dtiqVar.getClass();
            dtreVar4.f = dtiqVar;
            dtreVar4.a |= 16384;
        }
        nvk nvkVar = this.n;
        if (nvkVar != null) {
            dthf b = nvkVar.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dtre dtreVar5 = (dtre) bZ.b;
            b.getClass();
            dtreVar5.g = b;
            dtreVar5.a |= 32768;
        }
        dowa a3 = bvsl.a(this.g);
        if (a3 != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dtre dtreVar6 = (dtre) bZ.b;
            dtreVar6.d = a3.e;
            dtreVar6.a |= 256;
        }
        if (dtncVar.c) {
            dtncVar.bF();
            dtncVar.c = false;
        }
        dtnd dtndVar = (dtnd) dtncVar.b;
        dtre bK3 = bZ.bK();
        bK3.getClass();
        dtndVar.b = bK3;
        dtndVar.a |= 1;
        dtiu bZ3 = dtjb.h.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dtjb dtjbVar = (dtjb) bZ3.b;
        dtjbVar.d = dtiyVar.e;
        dtjbVar.a |= 1;
        dtjb dtjbVar2 = (dtjb) bZ3.b;
        dsrf dsrfVar2 = dtjbVar2.b;
        if (!dsrfVar2.a()) {
            dtjbVar2.b = dsqw.cg(dsrfVar2);
        }
        for (dtja dtjaVar : list) {
            dtjbVar2.b.h(dtjaVar.A);
        }
        if (list.contains(dtja.SEARCH)) {
            dtiv bZ4 = dtiw.e.bZ();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dtiw dtiwVar = (dtiw) bZ4.b;
            dtiwVar.a |= 1;
            dtiwVar.b = true;
            dtiw dtiwVar2 = (dtiw) bZ4.b;
            dtiwVar2.a |= 2;
            dtiwVar2.c = true;
            dtiw dtiwVar3 = (dtiw) bZ4.b;
            dtiwVar3.a |= 4;
            dtiwVar3.d = true;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dtjb dtjbVar3 = (dtjb) bZ3.b;
            dtiw bK4 = bZ4.bK();
            bK4.getClass();
            dtjbVar3.g = bK4;
            dtjbVar3.a |= 128;
        }
        if (list.contains(dtja.CAR_SEARCH)) {
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dtjb dtjbVar4 = (dtjb) bZ3.b;
            dtjbVar4.a |= 32;
            dtjbVar4.f = true;
        }
        if (dtncVar.c) {
            dtncVar.bF();
            dtncVar.c = false;
        }
        dtnd dtndVar2 = (dtnd) dtncVar.b;
        dtjb bK5 = bZ3.bK();
        bK5.getClass();
        dtndVar2.e = bK5;
        dtndVar2.a |= 8;
        dtjq bZ5 = dtjt.e.bZ();
        dtju bZ6 = dtjv.d.bZ();
        dqvj a4 = vxx.a(this.g);
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dtjv dtjvVar = (dtjv) bZ6.b;
        dtjvVar.b = a4.k;
        dtjvVar.a |= 1;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dtjt dtjtVar = (dtjt) bZ5.b;
        dtjv bK6 = bZ6.bK();
        bK6.getClass();
        dtjtVar.b = bK6;
        dtjtVar.a |= 1;
        if (dtncVar.c) {
            dtncVar.bF();
            dtncVar.c = false;
        }
        dtnd dtndVar3 = (dtnd) dtncVar.b;
        dtjt bK7 = bZ5.bK();
        bK7.getClass();
        dtndVar3.f = bK7;
        dtndVar3.a |= 32;
        long b2 = this.d.b();
        dtqf bZ7 = dtqg.c.bZ();
        dtqh bZ8 = dtqi.d.bZ();
        long j2 = 1000 * b2;
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        dtqi dtqiVar = (dtqi) bZ8.b;
        dtqiVar.a |= 1;
        dtqiVar.b = j2;
        int offset = TimeZone.getDefault().getOffset(b2) / 1000;
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        dtqi dtqiVar2 = (dtqi) bZ8.b;
        dtqiVar2.a |= 2;
        dtqiVar2.c = offset;
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        dtqg dtqgVar = (dtqg) bZ7.b;
        dtqi bK8 = bZ8.bK();
        bK8.getClass();
        dtqgVar.b = bK8;
        dtqgVar.a |= 1;
        if (dtncVar.c) {
            dtncVar.bF();
            dtncVar.c = false;
        }
        dtnd dtndVar4 = (dtnd) dtncVar.b;
        dtqg bK9 = bZ7.bK();
        bK9.getClass();
        dtndVar4.c = bK9;
        dtndVar4.a |= 2;
        DisplayMetrics displayMetrics2 = this.a.getResources().getDisplayMetrics();
        doov bZ9 = doow.e.bZ();
        bZ9.a(doos.PNG);
        bZ9.a(doos.JPG);
        int i4 = displayMetrics2.densityDpi;
        if (bZ9.c) {
            bZ9.bF();
            bZ9.c = false;
        }
        doow doowVar = (doow) bZ9.b;
        doowVar.a |= 1;
        doowVar.c = i4;
        dhkc bZ10 = dhkd.d.bZ();
        int i5 = displayMetrics2.widthPixels;
        if (bZ10.c) {
            bZ10.bF();
            bZ10.c = false;
        }
        dhkd dhkdVar = (dhkd) bZ10.b;
        dhkdVar.a |= 1;
        dhkdVar.b = i5;
        int i6 = displayMetrics2.heightPixels;
        if (bZ10.c) {
            bZ10.bF();
            bZ10.c = false;
        }
        dhkd dhkdVar2 = (dhkd) bZ10.b;
        dhkdVar2.a |= 2;
        dhkdVar2.c = i6;
        if (bZ9.c) {
            bZ9.bF();
            bZ9.c = false;
        }
        doow doowVar2 = (doow) bZ9.b;
        dhkd bK10 = bZ10.bK();
        bK10.getClass();
        doowVar2.d = bK10;
        doowVar2.a |= 2;
        if (dtncVar.c) {
            dtncVar.bF();
            dtncVar.c = false;
        }
        dtnd dtndVar5 = (dtnd) dtncVar.b;
        doow bK11 = bZ9.bK();
        bK11.getClass();
        dtndVar5.h = bK11;
        dtndVar5.a |= 256;
        String str = bwnlVar.b;
        if (str != null) {
            if (dtncVar.c) {
                dtncVar.bF();
                dtncVar.c = false;
            }
            dtnd dtndVar6 = (dtnd) dtncVar.b;
            str.getClass();
            dtndVar6.a |= 1024;
            dtndVar6.i = str;
        }
        String b3 = this.l.b();
        if (b3 != null) {
            if (dtncVar.c) {
                dtncVar.bF();
                dtncVar.c = false;
            }
            dtnd dtndVar7 = (dtnd) dtncVar.b;
            b3.getClass();
            dtndVar7.a |= 4096;
            dtndVar7.k = b3;
        }
        Point point = null;
        String A = this.g.A(bvjk.dV, j, null);
        if (A != null) {
            if (dtncVar.c) {
                dtncVar.bF();
                dtncVar.c = false;
            }
            dtnd dtndVar8 = (dtnd) dtncVar.b;
            A.getClass();
            dtndVar8.a |= 2048;
            dtndVar8.j = A;
        }
        if (dvtnVar.c) {
            dvtnVar.bF();
            dvtnVar.c = false;
        }
        dvto dvtoVar = (dvto) dvtnVar.b;
        dtnd dtndVar9 = (dtnd) dtncVar.bK();
        dvto dvtoVar2 = dvto.k;
        dtndVar9.getClass();
        dvtoVar.b = dtndVar9;
        dvtoVar.a |= 1;
        if (akoxVar != null) {
            point = akoxVar.o;
        }
        dvxt b4 = brma.b(point, this.a.getResources());
        if (dvtnVar.c) {
            dvtnVar.bF();
            dvtnVar.c = false;
        }
        dvto dvtoVar3 = (dvto) dvtnVar.b;
        b4.getClass();
        dvtoVar3.d = b4;
        dvtoVar3.a |= 8;
        dhkd a5 = brma.a(this.a.getResources().getDimensionPixelSize(R.dimen.placecollection_icon_size));
        if (dvtnVar.c) {
            dvtnVar.bF();
            dvtnVar.c = false;
        }
        dvto dvtoVar4 = (dvto) dvtnVar.b;
        a5.getClass();
        dvtoVar4.e = a5;
        dvtoVar4.a |= 16;
        dvtnVar.a(dvxj.SVG_LIGHT);
        dvtnVar.a(dvxj.SVG_DARK);
        dvtnVar.a(dvxj.SVG_INCIDENT_LIGHT);
        dwfs o = cknx.o(true);
        if (dvtnVar.c) {
            dvtnVar.bF();
            dvtnVar.c = false;
        }
        dvto dvtoVar5 = (dvto) dvtnVar.b;
        dwfv bK12 = o.bK();
        bK12.getClass();
        dvtoVar5.i = bK12;
        dvtoVar5.a |= 512;
        dnqg bZ11 = dnqh.p.bZ();
        if (bZ11.c) {
            bZ11.bF();
            bZ11.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ11.b;
        dnqhVar.a |= 2048;
        dnqhVar.j = true;
        dnmu dnmuVar = dnmu.PROPERTY_GMM;
        if (bZ11.c) {
            bZ11.bF();
            bZ11.c = false;
        }
        dnqh dnqhVar2 = (dnqh) bZ11.b;
        dnqhVar2.l = dnmuVar.ap;
        dnqhVar2.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        if (dvtnVar.c) {
            dvtnVar.bF();
            dvtnVar.c = false;
        }
        dvto dvtoVar6 = (dvto) dvtnVar.b;
        dnqh bK13 = bZ11.bK();
        bK13.getClass();
        dvtoVar6.j = bK13;
        dvtoVar6.a |= 1024;
        dnyc bZ12 = dnzj.Z.bZ();
        dnnn d = this.h.d();
        if (bZ12.c) {
            bZ12.bF();
            bZ12.c = false;
        }
        dnzj dnzjVar = (dnzj) bZ12.b;
        d.getClass();
        dnzjVar.d = d;
        dnzjVar.a |= 1;
        dhkd a6 = brma.a(this.a.getResources().getDimensionPixelSize(R.dimen.startpage_placecollection_coverphoto_size));
        if (dvtnVar.c) {
            dvtnVar.bF();
            dvtnVar.c = false;
        }
        dvto dvtoVar7 = (dvto) dvtnVar.b;
        a6.getClass();
        dvtoVar7.f = a6;
        dvtoVar7.a |= 32;
        dnzj bK14 = bZ12.bK();
        bK14.getClass();
        dvtoVar7.g = bK14;
        dvtoVar7.a |= 128;
        if (this.b.getOdelayParameters().a) {
            dnwj a7 = this.e.a(this.d.b() - TimeUnit.MINUTES.toMillis(5L), TimeUnit.SECONDS.toMillis(30L));
            if (dvtnVar.c) {
                dvtnVar.bF();
                dvtnVar.c = false;
            }
            dvto dvtoVar8 = (dvto) dvtnVar.b;
            a7.getClass();
            dvtoVar8.c = a7;
            dvtoVar8.a |= 4;
        }
        akox akoxVar2 = this.k;
        if (akoxVar2 != null && akoxVar2.i()) {
            bwnnVar.d(alao.a(this.k));
        }
        GmmLocation a8 = this.f.a();
        if (a8 != null) {
            bwnnVar.c(a8.a());
        }
        return bwnnVar;
    }
}
