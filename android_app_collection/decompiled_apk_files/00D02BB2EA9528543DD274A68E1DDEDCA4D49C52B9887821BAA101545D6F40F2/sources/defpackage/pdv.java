package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: pdv  reason: default package */
/* loaded from: classes7.dex */
public final class pdv implements pcx<dljf> {
    public static final int a = auiy.TODO_PHOTO.a().intValue();
    public final ckcw b;
    public final auhi c;
    private final Context d;
    private final btwr e;
    private final auhj f;
    private final bvrb g;
    private final dxio<akfa> h;
    @dzsi
    private String i;
    private final cdbc j;

    public pdv(Application application, ckcw ckcwVar, btwr btwrVar, auhi auhiVar, auhj auhjVar, bvrb bvrbVar, cdbc cdbcVar, dxio dxioVar) {
        this.d = application;
        this.b = ckcwVar;
        this.e = btwrVar;
        this.c = auhiVar;
        this.f = auhjVar;
        this.g = bvrbVar;
        this.j = cdbcVar;
        this.h = dxioVar;
    }

    public static final int g() {
        return dpyv.TODO_PHOTO.dm;
    }

    @Override // defpackage.pcx
    public final boolean a(int i) {
        return a == i;
    }

    @Override // defpackage.pcx
    public final dssr<dljf> b() {
        return (dssr) dljf.g.cu(7);
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ int c(dljf dljfVar) {
        return g();
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ void d(final pau pauVar, pas pasVar, dljf dljfVar) {
        final dljf dljfVar2 = dljfVar;
        ((ckcn) this.b.a(ckdz.ah)).a();
        String str = pauVar.b;
        final btlu n = !dbsj.d(str) ? this.h.a().n(str) : null;
        pap papVar = pasVar.b;
        if (papVar == null) {
            papVar = pap.d;
        }
        this.c.j(f(dljfVar2, papVar.b, papVar.c, null, null, pauVar, n, false));
        int i = dljfVar2.a;
        int i2 = 1;
        int i3 = (i & 8) != 0 ? 1 : 0;
        if ((i & 16) == 0) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (i4 == 0) {
            ((ckco) this.b.a(ckdz.ak)).a(ckdx.a(5));
            return;
        }
        btue y = this.h.a().y("oauth2:https://www.googleapis.com/auth/photos.image.readonly");
        if (y == null) {
            ((ckco) this.b.a(ckdz.ak)).a(ckdx.a(6));
            return;
        }
        String e = y.e();
        this.i = e;
        if (e == null) {
            for (int i5 = 0; i5 < i4; i5++) {
                ((ckco) this.b.a(ckdz.ak)).a(ckdx.a(2));
            }
            return;
        }
        ((ckcn) this.b.a(ckdz.ai)).a();
        final pap papVar2 = papVar;
        this.g.b(new Runnable(this, dljfVar2, papVar2, pauVar, n) { // from class: pdq
            private final pdv a;
            private final dljf b;
            private final pap c;
            private final pau d;
            private final btlu e;

            {
                this.a = this;
                this.b = dljfVar2;
                this.c = papVar2;
                this.d = pauVar;
                this.e = n;
            }

            @Override // java.lang.Runnable
            public final void run() {
                pdv pdvVar = this.a;
                dljf dljfVar3 = this.b;
                pdvVar.e((dljfVar3.a & 8) != 0 ? dljfVar3.e : null, 100, new pds(pdvVar, dljfVar3, this.c, this.d, this.e));
            }
        }, bvrj.UI_THREAD);
    }

    public final void e(@dzsi String str, int i, pdu pduVar) {
        if (str == null) {
            pduVar.a(null);
        } else if (!str.startsWith("https://lh3.googleusercontent.com/")) {
            ((ckco) this.b.a(ckdz.ak)).a(ckdx.a(4));
            pduVar.a(null);
        } else {
            brw<Bitmap> g = brc.d(this.d).g();
            cae caeVar = new cae();
            String valueOf = String.valueOf(this.i);
            caeVar.b(valueOf.length() != 0 ? "Bearer ".concat(valueOf) : new String("Bearer "));
            g.j(new cac(str, caeVar.a()));
            g.i(new pdt(this, i, i, pduVar));
        }
    }

    public final augj f(dljf dljfVar, String str, String str2, @dzsi Bitmap bitmap, @dzsi Bitmap bitmap2, pau pauVar, @dzsi btlu btluVar, boolean z) {
        augc a2 = this.f.a(dljfVar.b, dljfVar.c, g(), this.c.g(dpyv.TODO_PHOTO.dm));
        a2.R = pauVar;
        a2.S = btluVar;
        cdbc cdbcVar = this.j;
        String str3 = pauVar.b;
        dspd dspdVar = (dljfVar.a & 4) != 0 ? dljfVar.d : null;
        Intent putExtra = new Intent("android.intent.action.VIEW").setClassName(cdbcVar.a, String.valueOf(cdbcVar.a.getPackageName()).concat(".TodoPhotoActivity")).putExtra("fragment_key", "TODO_PHOTO_FRAGMENT").putExtra("ep_key", dwyd.PUBLISH_PRIVATE_PHOTO_NOTIFICATION).putExtra("rtcie_key", cdfv.SHOW_EMPTY_PAGE);
        if (dspdVar != null) {
            putExtra.putExtra("ctok_key", dspdVar.G());
        }
        if (str3 != null) {
            putExtra.putExtra("obfuscated_gaia_id", str3);
        }
        a2.E(putExtra, auhw.ACTIVITY);
        a2.O = z;
        a2.f = str;
        a2.g = str2;
        a2.v = -1;
        a2.C(true);
        a2.I();
        a2.D(this.d.getResources().getColor(R.color.quantum_googblue));
        if (bitmap != null) {
            a2.m = bitmap;
        }
        if (bitmap2 != null) {
            hz hzVar = new hz();
            hzVar.f(str);
            hzVar.g(str2);
            hzVar.a = bitmap2;
            hzVar.e(null);
            a2.s = hzVar;
        } else {
            btwr btwrVar = this.e;
            String str4 = pauVar.b;
            if (btwrVar.h().getPhotoUploadParameters().j) {
                ia iaVar = new ia();
                iaVar.f(str);
                iaVar.e(str2);
                a2.s = iaVar;
            }
        }
        return a2.a();
    }
}
