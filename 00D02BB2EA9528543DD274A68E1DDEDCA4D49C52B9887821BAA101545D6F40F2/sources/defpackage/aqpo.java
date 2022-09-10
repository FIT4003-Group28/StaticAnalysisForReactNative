package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.maps.R;
import java.io.InputStream;
import java.net.URL;
/* compiled from: PG */
/* renamed from: aqpo  reason: default package */
/* loaded from: classes2.dex */
public class aqpo implements aqqe {
    public static final dcep<Integer> a = dcep.C(1, 6);
    public final Object b = new Object();
    public final gga c;
    public final cqhn d;
    public int e;
    public aqpn f;
    public String g;
    public String h;
    public dbsg<Drawable> i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    private final czsy n;
    private final ctyy o;
    private final cusr<Integer> p;
    private final String q;
    private final dxio<apyz> r;
    private final dxio<aqcn> s;
    private final crzp<apsi<dbsg<apsg>>> t;
    private final crzp<apsi<dbsg<apzn>>> u;
    private final cuss<Integer> v;
    private crzm<apsi<dbsg<apsg>>> w;
    private crzm<apsi<dbsg<apzn>>> x;

    public aqpo(final gga ggaVar, final cqhn cqhnVar, czsy czsyVar, final aqgo aqgoVar, dxio<akfa> dxioVar, aprv aprvVar, dxio<aqav> dxioVar2, dxio<apyz> dxioVar3, dxio<apyu> dxioVar4, dxio<aqcn> dxioVar5, ctyy ctyyVar, final String str) {
        crzp<apsi<dbsg<apsg>>> crzpVar = new crzp(this) { // from class: aqpi
            private final aqpo a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                dbsg dbsgVar;
                aqpo aqpoVar = this.a;
                apsi apsiVar = (apsi) crzmVar.l();
                if (apsiVar == null || !((dbsg) apsiVar.a()).a()) {
                    return;
                }
                synchronized (aqpoVar.b) {
                    aqpoVar.l = true;
                    apsg apsgVar = (apsg) ((dbsg) apsiVar.a()).b();
                    aqpoVar.g = apsgVar.b();
                    aqpoVar.h = apsgVar.c();
                    Resources resources = aqpoVar.c.getResources();
                    try {
                        InputStream openStream = new URL(apsgVar.d()).openStream();
                        try {
                            dbsgVar = dbsg.i(new BitmapDrawable(resources, openStream));
                            if (openStream != null) {
                                openStream.close();
                            }
                        } catch (Throwable th) {
                            if (openStream != null) {
                                try {
                                    openStream.close();
                                } catch (Throwable th2) {
                                    deki.a(th, th2);
                                }
                            }
                            throw th;
                        }
                    } catch (Exception unused) {
                        dbsgVar = dbpy.a;
                    }
                    aqpoVar.i = dbsgVar.d(aqpoVar.i);
                    if (!aqpoVar.a()) {
                        return;
                    }
                    aqpn aqpnVar = aqpoVar.f;
                    if (aqpnVar != null) {
                        aqpnVar.a(aqpoVar);
                    }
                    aqpoVar.c.runOnUiThread(new apzx(aqpoVar));
                }
            }
        };
        this.t = crzpVar;
        crzp<apsi<dbsg<apzn>>> crzpVar2 = new crzp(this) { // from class: aqpj
            private final aqpo a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                aqpo aqpoVar = this.a;
                apsi apsiVar = (apsi) crzmVar.l();
                if (apsiVar == null || !((dbsg) apsiVar.a()).a()) {
                    return;
                }
                synchronized (aqpoVar.b) {
                    boolean z = true;
                    aqpoVar.m = true;
                    apzn apznVar = (apzn) ((dbsg) apsiVar.a()).b();
                    boolean e = apznVar.e();
                    aqpoVar.j = e;
                    if (e || !aqpo.a.contains(Integer.valueOf(apznVar.c()))) {
                        z = false;
                    }
                    aqpoVar.k = z;
                    if (!aqpoVar.a()) {
                        return;
                    }
                    aqpn aqpnVar = aqpoVar.f;
                    if (aqpnVar != null) {
                        aqpnVar.a(aqpoVar);
                    }
                    aqpoVar.c.runOnUiThread(new apzx(aqpoVar));
                }
            }
        };
        this.u = crzpVar2;
        this.e = 0;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.c = ggaVar;
        this.d = cqhnVar;
        this.n = czsyVar;
        this.o = ctyyVar;
        this.q = str;
        this.r = dxioVar3;
        this.s = dxioVar5;
        this.i = dbpy.a;
        cuss<Integer> a2 = dxioVar2.a().d().a(ctyyVar, new dbsl(aqgoVar, str) { // from class: aqpk
            private final aqgo a;
            private final String b;

            {
                this.a = aqgoVar;
                this.b = str;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                aqgo aqgoVar2 = this.a;
                String str2 = this.b;
                dcep<Integer> dcepVar = aqpo.a;
                return aqgoVar2.a((cufw) obj, str2);
            }
        }, 99);
        this.v = a2;
        cusr<Integer> cusrVar = new cusr(this, ggaVar, cqhnVar) { // from class: aqpl
            private final aqpo a;
            private final gga b;
            private final cqhn c;

            {
                this.a = this;
                this.b = ggaVar;
                this.c = cqhnVar;
            }

            @Override // defpackage.cusr
            public final void a(Object obj) {
                aqpo aqpoVar = this.a;
                gga ggaVar2 = this.b;
                aqpoVar.e = ((Integer) obj).intValue();
                ggaVar2.runOnUiThread(new apzx(aqpoVar));
            }
        };
        this.p = cusrVar;
        a2.q(cusrVar);
        btlu j = dxioVar.a().j();
        if (j == null || !j.l()) {
            return;
        }
        crzm<apsi<dbsg<apsg>>> e = aprvVar.e(str, j);
        this.w = e;
        e.d(crzpVar, dege.a);
        crzm<apsi<dbsg<apzn>>> b = dxioVar4.a().b(str, j);
        this.x = b;
        b.d(crzpVar2, dege.a);
    }

    public boolean a() {
        boolean z;
        synchronized (this.b) {
            z = false;
            if (this.l && this.m) {
                z = true;
            }
        }
        return z;
    }

    public void b(aqpn aqpnVar) {
        if (a()) {
            aqpnVar.a(this);
        }
        this.f = aqpnVar;
    }

    @Override // defpackage.aqqe
    public String c() {
        return dbsj.e(this.g);
    }

    @Override // defpackage.aqqe
    public String d() {
        return dbsj.e(this.h);
    }

    @Override // defpackage.aqqe
    public cqtd e() {
        if (this.i.a()) {
            return new aqpm(new Object[0], this.i.b());
        } else if (dbsj.d(this.g)) {
            return cqtt.i(cqtt.g(ibm.j()), ibn.c(), ibn.c());
        } else {
            gga ggaVar = this.c;
            String str = this.g;
            czsy czsyVar = this.n;
            int e = ibn.c().e(ggaVar);
            Bitmap createBitmap = Bitmap.createBitmap(e, e, Bitmap.Config.ARGB_8888);
            czsyVar.b(str);
            cztn bZ = czto.f.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            czto cztoVar = (czto) bZ.b;
            str.getClass();
            cztoVar.a |= 8;
            cztoVar.e = str;
            czsyVar.c(czta.a(bZ.bK()));
            czsyVar.a(createBitmap);
            return cqtt.a(createBitmap);
        }
    }

    @Override // defpackage.aqqe
    public cjtd f() {
        return aqdb.a(dtxv.bL, this.q).a();
    }

    @Override // defpackage.aqqe
    public String g() {
        return this.s.a().a(this.e);
    }

    @Override // defpackage.aqqe
    public Boolean h() {
        return Boolean.valueOf(this.e > 0);
    }

    @Override // defpackage.aqqe
    public Boolean i() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.aqqe
    public String j() {
        return this.k ? this.c.getString(R.string.STATUS_MESSAGING_DISABLED_UNRESPONSIVE) : "";
    }

    @Override // defpackage.aqqe
    public cqkl k() {
        apzd f = apze.f();
        f.f(this.g);
        f.e(this.h);
        f.d(this.q);
        f.b(apzb.INBOX_IN_UPDATES_TAB);
        this.r.a().k(f.a(), this.o.b().e());
        return cqkl.a;
    }

    public void l() {
        this.f = null;
        this.v.g(this.p);
        crzm<apsi<dbsg<apsg>>> crzmVar = this.w;
        if (crzmVar != null) {
            crzmVar.c(this.t);
            this.w = null;
        }
        crzm<apsi<dbsg<apzn>>> crzmVar2 = this.x;
        if (crzmVar2 != null) {
            crzmVar2.c(this.u);
            this.x = null;
        }
        this.l = false;
        this.m = false;
    }
}
