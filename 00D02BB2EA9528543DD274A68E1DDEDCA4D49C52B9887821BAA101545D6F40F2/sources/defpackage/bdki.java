package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import java.io.InputStream;
import java.util.Date;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bdki  reason: default package */
/* loaded from: classes3.dex */
public final class bdki implements bbtj {
    public bbtm a;
    private final Context b;
    private boolean c = false;
    private boolean d = false;
    private dbsg<Long> e = dbpy.a;
    private String f = "";
    private String g = "";

    public bdki(bbtm bbtmVar, Context context) {
        this.a = bbtmVar;
        this.b = context;
    }

    private final void u() {
        if (this.a.r().a() || this.d) {
            return;
        }
        String a = bdux.a(this.b, a());
        if (a != null) {
            bbtl u = this.a.u();
            u.f(a);
            this.a = u.a();
        }
        this.d = true;
    }

    private final synchronized void v() {
        final btou btouVar;
        if (!this.c) {
            final Context context = this.b;
            final bbtm bbtmVar = this.a;
            final Uri z = bbtmVar.z();
            if (Build.VERSION.SDK_INT >= 29 && z != null && "content".equals(z.getScheme()) && "media".equals(z.getAuthority())) {
                z = MediaStore.setRequireOriginal(z);
            }
            try {
                if (Build.VERSION.SDK_INT < 29) {
                    btouVar = new btou(context, z, "latitude", "longitude", "datetaken");
                } else {
                    btouVar = new btou(context, z, "datetaken");
                }
                try {
                    bbtm bbtmVar2 = (bbtm) btouVar.h().h(new dbrn(bbtmVar, btouVar, context, z) { // from class: bdkh
                        private final bbtm a;
                        private final btou b;
                        private final Context c;
                        private final Uri d;

                        {
                            this.a = bbtmVar;
                            this.b = btouVar;
                            this.c = context;
                            this.d = z;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj) {
                            bbtm bbtmVar3 = this.a;
                            btou btouVar2 = this.b;
                            Context context2 = this.c;
                            Uri uri = this.d;
                            btos btosVar = (btos) obj;
                            bbtl u = bbtmVar3.u();
                            dbsg a = btosVar.a(btouVar2.c("datetaken"));
                            if (a.a()) {
                                u.c((Long) a.b());
                            }
                            if (Build.VERSION.SDK_INT >= 29) {
                                try {
                                    InputStream a2 = cxnp.a(context2, uri);
                                    if (a2 != null) {
                                        aok aokVar = new aok(a2);
                                        String a3 = aokVar.a("GPSLatitude");
                                        String a4 = aokVar.a("GPSLatitudeRef");
                                        String a5 = aokVar.a("GPSLongitude");
                                        String a6 = aokVar.a("GPSLongitudeRef");
                                        double[] dArr = null;
                                        if (a3 != null && a4 != null && a5 != null && a6 != null) {
                                            try {
                                                dArr = new double[]{aok.b(a3, a4), aok.b(a5, a6)};
                                            } catch (IllegalArgumentException unused) {
                                                String str = "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", a3, a4, a5, a6);
                                            }
                                        }
                                        if (dArr != null) {
                                            u.i(new akqq(dArr[0], dArr[1]));
                                        }
                                        a2.close();
                                    }
                                } catch (Exception unused2) {
                                }
                                return u.a();
                            }
                            dbsg a7 = btosVar.a(btouVar2.d("latitude"));
                            dbsg a8 = btosVar.a(btouVar2.d("longitude"));
                            if (a7.a() && a8.a()) {
                                u.i(new akqq(((Float) a7.b()).floatValue(), ((Float) a8.b()).floatValue()));
                            }
                            return u.a();
                        }
                    }).c(bbtmVar);
                    btouVar.close();
                    bbtmVar = bbtmVar2;
                } catch (Throwable th) {
                    try {
                        btouVar.close();
                    } catch (Throwable th2) {
                        deki.a(th, th2);
                    }
                    throw th;
                }
            } catch (Exception unused) {
            }
            this.a = bbtmVar;
            this.c = true;
        }
    }

    @Override // defpackage.bbtj
    public final Uri a() {
        return this.a.z();
    }

    @Override // defpackage.bbtj
    public final bbti b() {
        if (!this.a.n().a()) {
            final Uri a = a();
            bbtl u = this.a.u();
            u.g(bbti.b(this.b, a).e(new dbty(a) { // from class: bdkc
                private final Uri a;

                {
                    this.a = a;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    return bbti.c(this.a).c(bbti.PHOTO);
                }
            }));
            this.a = u.a();
        }
        return this.a.n().b();
    }

    @Override // defpackage.bbtj
    public final String c() {
        return this.a.e();
    }

    @Override // defpackage.bbtj
    public final dddn d() {
        return this.a.d();
    }

    @Override // defpackage.bbtj
    public final String e() {
        return this.f;
    }

    @Override // defpackage.bbtj
    public final void f(String str) {
        this.f = str;
    }

    @Override // defpackage.bbtj
    public final String g() {
        return this.g;
    }

    @Override // defpackage.bbtj
    public final void h(String str) {
        this.g = str;
    }

    @Override // defpackage.bbtj
    @dzsi
    public final String i() {
        u();
        return this.a.r().f();
    }

    @Override // defpackage.bbtj
    @dzsi
    public final akqq j() {
        if (!this.a.o().a()) {
            v();
        }
        return this.a.o().f();
    }

    @Override // defpackage.bbtj
    @dzsi
    public final Date k() {
        if (this.a.b() == null) {
            v();
        }
        return (Date) dbsg.j(this.a.b()).h(bdkd.a).f();
    }

    @Override // defpackage.bbtj
    public final dbsg<Date> l() {
        u();
        final dbrn dbrnVar = bdke.a;
        long longValue = this.e.e(new dbty(this, dbrnVar) { // from class: bdkf
            private final bdki a;
            private final dbrn b;

            {
                this.a = this;
                this.b = dbrnVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                bdki bdkiVar = this.a;
                return (Long) bdkiVar.a.r().h(this.b).c(0L);
            }
        }).longValue();
        this.e = dbsg.i(Long.valueOf(longValue));
        return dbsg.j(longValue == 0 ? null : new Date(longValue));
    }

    @Override // defpackage.bbtj
    public final Set<dwye> m() {
        return this.a.f();
    }

    @Override // defpackage.bbtj
    public final bbtj n(String str) {
        bbtm F = this.a.F(str);
        return this.a.equals(F) ? this : new bdki(F, this.b);
    }

    @Override // defpackage.bbtj
    public final bbtj o(Uri uri) {
        bbtm G = this.a.G(uri);
        return this.a.equals(G) ? this : new bdki(G, this.b);
    }

    @Override // defpackage.bbtj
    public final boolean p() {
        u();
        return ((Boolean) this.a.r().h(bdkg.a).c(false)).booleanValue();
    }

    @Override // defpackage.bbtj
    public final bbtm q() {
        return this.a;
    }

    @Override // defpackage.bbtj
    public final dbsg<Integer> r() {
        return this.a.C();
    }

    @Override // defpackage.bbtj
    public final dbsg<Integer> s() {
        return this.a.D();
    }

    @Override // defpackage.bbtj
    public final dbsg<Long> t() {
        return this.a.j();
    }
}
