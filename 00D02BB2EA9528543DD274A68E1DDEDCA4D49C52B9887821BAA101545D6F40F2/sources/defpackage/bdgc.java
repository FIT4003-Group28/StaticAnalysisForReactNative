package defpackage;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import java.io.File;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bdgc  reason: default package */
/* loaded from: classes3.dex */
public final class bdgc extends apk<List<bbtj>> {
    public static final /* synthetic */ int i = 0;
    private static final String[] j = {"_id", "_data", "mime_type", "datetaken", "date_added", "width", "height", "orientation"};
    private static final String[] k = {"latitude", "longitude"};
    private static final String l = String.format(Locale.US, "%s NOT IN ('%s') AND %s > %d", "bucket_display_name", dbrz.e("','").i("Screenshots", "WhatsApp Images", new Object[0]), "_size", 1024);
    private final Context m;
    private final bbtk n;
    private final ckcq o;
    private final dxio<apni> p;
    private final int q;
    private final boolean r;

    public bdgc(Application application, bbtk bbtkVar, dxio<apni> dxioVar, ckcq ckcqVar, int i2, boolean z) {
        super(application.getApplicationContext());
        this.m = application.getApplicationContext();
        this.n = bbtkVar;
        this.o = ckcqVar;
        this.p = dxioVar;
        this.q = i2;
        this.r = z;
    }

    @Override // defpackage.apk
    public final /* bridge */ /* synthetic */ List<bbtj> c() {
        dcdc e;
        btou btouVar;
        this.o.a();
        final boolean z = this.p.a().b() && this.r;
        try {
            Context context = this.m;
            Uri contentUri = z ? MediaStore.Files.getContentUri("external") : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            int i2 = this.q;
            String[] strArr = j;
            String str = l;
            if (Build.VERSION.SDK_INT < 29) {
                strArr = (String[]) dclq.b(strArr, k, String.class);
            }
            if (z) {
                strArr = (String[]) dclq.d(strArr, "duration");
                str = String.valueOf(str).concat(" AND (media_type=1 OR media_type=3)");
            }
            btop h = btoq.h();
            h.b(strArr);
            h.c(str);
            h.e("datetaken DESC");
            ((btnq) h).a = dbsg.i(Integer.valueOf(i2));
            btou btouVar2 = new btou(context, contentUri, h.a());
            try {
                final btor<Long> c = btouVar2.c("_id");
                final btor<String> a = btouVar2.a("_data");
                final btor<String> a2 = btouVar2.a("mime_type");
                final btor<Long> c2 = btouVar2.c("datetaken");
                final btor<Long> c3 = btouVar2.c("date_added");
                final btor<Integer> b = btouVar2.b("orientation");
                final btor<Integer> b2 = btouVar2.b("width");
                final btor<Integer> b3 = btouVar2.b("height");
                final btor<Double> e2 = btouVar2.e("latitude");
                final btor<Double> e3 = btouVar2.e("longitude");
                final btor<Long> c4 = btouVar2.c("duration");
                btouVar = btouVar2;
                try {
                    dcbg o = dcbg.b(btouVar2).s(new dbrn(c, a2, z, c2, c3, c4, b2, b3, b, a, e2, e3) { // from class: bdfn
                        private final btor a;
                        private final btor b;
                        private final boolean c;
                        private final btor d;
                        private final btor e;
                        private final btor f;
                        private final btor g;
                        private final btor h;
                        private final btor i;
                        private final btor j;
                        private final btor k;
                        private final btor l;

                        {
                            this.a = c;
                            this.b = a2;
                            this.c = z;
                            this.d = c2;
                            this.e = c3;
                            this.f = c4;
                            this.g = b2;
                            this.h = b3;
                            this.i = b;
                            this.j = a;
                            this.k = e2;
                            this.l = e3;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj) {
                            dbsg dbsgVar;
                            btor btorVar = this.a;
                            btor btorVar2 = this.b;
                            boolean z2 = this.c;
                            btor btorVar3 = this.d;
                            btor btorVar4 = this.e;
                            btor btorVar5 = this.f;
                            btor btorVar6 = this.g;
                            btor btorVar7 = this.h;
                            btor btorVar8 = this.i;
                            btor btorVar9 = this.j;
                            btor btorVar10 = this.k;
                            btor btorVar11 = this.l;
                            btos btosVar = (btos) obj;
                            final String l2 = Long.toString(((Long) btosVar.a(btorVar).b()).longValue());
                            dbsg<bbti> a3 = z2 ? bbti.a((String) btosVar.a(btorVar2).f()) : dbsg.i(bbti.PHOTO);
                            final bbtl w = bbtm.w((Uri) a3.h(new dbrn(l2) { // from class: bdfw
                                private final String a;

                                {
                                    this.a = l2;
                                }

                                @Override // defpackage.dbrn
                                public final Object a(Object obj2) {
                                    String str2 = this.a;
                                    int i3 = bdgc.i;
                                    bbti bbtiVar = bbti.PHOTO;
                                    int ordinal = ((bbti) obj2).ordinal();
                                    if (ordinal != 0) {
                                        if (ordinal == 1) {
                                            return Uri.withAppendedPath(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, str2);
                                        }
                                        throw new IllegalStateException("MediaType must be covered in the switch");
                                    }
                                    return Uri.withAppendedPath(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, str2);
                                }
                            }).c(Uri.withAppendedPath(MediaStore.Files.getContentUri("external"), l2)));
                            dbsg a4 = btosVar.a(btorVar3);
                            final long j2 = eaow.d(((Long) btosVar.a(btorVar4).c(0L)).longValue()).b;
                            ((bbse) w).a = Long.valueOf(((Long) a4.h(new dbrn(j2) { // from class: bdfx
                                private final long a;

                                {
                                    this.a = j2;
                                }

                                @Override // defpackage.dbrn
                                public final Object a(Object obj2) {
                                    long j3 = this.a;
                                    Long l3 = (Long) obj2;
                                    if (l3.longValue() != 2147483647000L) {
                                        j3 = l3.longValue();
                                    }
                                    return Long.valueOf(j3);
                                }
                            }).c(Long.valueOf(j2))).longValue());
                            w.r(dddn.GMM_GALLERY);
                            w.getClass();
                            a3.h(new dbrn(w) { // from class: bdga
                                private final bbtl a;

                                {
                                    this.a = w;
                                }

                                @Override // defpackage.dbrn
                                public final Object a(Object obj2) {
                                    bbtl bbtlVar = this.a;
                                    bbtlVar.g((bbti) obj2);
                                    return bbtlVar;
                                }
                            });
                            dbsg a5 = btosVar.a(btorVar5);
                            w.getClass();
                            a5.h(new dbrn(w) { // from class: bdgb
                                private final bbtl a;

                                {
                                    this.a = w;
                                }

                                @Override // defpackage.dbrn
                                public final Object a(Object obj2) {
                                    bbtl bbtlVar = this.a;
                                    bbtlVar.d((Long) obj2);
                                    return bbtlVar;
                                }
                            });
                            dbsg a6 = btosVar.a(btorVar6);
                            w.getClass();
                            a6.h(new dbrn(w) { // from class: bdfo
                                private final bbtl a;

                                {
                                    this.a = w;
                                }

                                @Override // defpackage.dbrn
                                public final Object a(Object obj2) {
                                    bbtl bbtlVar = this.a;
                                    bbtlVar.q((Integer) obj2);
                                    return bbtlVar;
                                }
                            });
                            dbsg a7 = btosVar.a(btorVar7);
                            w.getClass();
                            a7.h(new dbrn(w) { // from class: bdfp
                                private final bbtl a;

                                {
                                    this.a = w;
                                }

                                @Override // defpackage.dbrn
                                public final Object a(Object obj2) {
                                    bbtl bbtlVar = this.a;
                                    bbtlVar.p((Integer) obj2);
                                    return bbtlVar;
                                }
                            });
                            dbsg a8 = btosVar.a(btorVar8);
                            w.getClass();
                            a8.h(new dbrn(w) { // from class: bdfq
                                private final bbtl a;

                                {
                                    this.a = w;
                                }

                                @Override // defpackage.dbrn
                                public final Object a(Object obj2) {
                                    bbtl bbtlVar = this.a;
                                    bbtlVar.n((Integer) obj2);
                                    return bbtlVar;
                                }
                            });
                            btosVar.a(btorVar9).h(new dbrn(w) { // from class: bdfr
                                private final bbtl a;

                                {
                                    this.a = w;
                                }

                                @Override // defpackage.dbrn
                                public final Object a(Object obj2) {
                                    bbtl bbtlVar = this.a;
                                    String str2 = (String) obj2;
                                    int i3 = bdgc.i;
                                    bbtlVar.f(str2);
                                    ((bbse) bbtlVar).b = dbsg.i(Uri.fromFile(new File(str2)).toString());
                                    return bbtlVar;
                                }
                            });
                            dcdc z3 = dcbg.j(btosVar.a(btorVar10), btosVar.a(btorVar11)).o(bdfy.a).s(bdfz.a).z();
                            if (z3.size() == 2) {
                                dbsgVar = dbsg.i(new akqq(((Double) z3.get(0)).doubleValue(), ((Double) z3.get(1)).doubleValue()));
                            } else {
                                dbsgVar = dbpy.a;
                            }
                            w.getClass();
                            dbsgVar.h(new dbrn(w) { // from class: bdfs
                                private final bbtl a;

                                {
                                    this.a = w;
                                }

                                @Override // defpackage.dbrn
                                public final Object a(Object obj2) {
                                    bbtl bbtlVar = this.a;
                                    bbtlVar.i((akqq) obj2);
                                    return bbtlVar;
                                }
                            });
                            return w.a();
                        }
                    }).o(bdft.a).o(bdfu.a);
                    final bbtk bbtkVar = this.n;
                    bbtkVar.getClass();
                    e = o.s(new dbrn(bbtkVar) { // from class: bdfv
                        private final bbtk a;

                        {
                            this.a = bbtkVar;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj) {
                            return this.a.b((bbtm) obj);
                        }
                    }).z();
                    btouVar.close();
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    btouVar.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                btouVar = btouVar2;
            }
        } catch (Exception unused) {
            e = dcdc.e();
        }
        this.o.b();
        e.size();
        this.o.c();
        return e;
    }

    @Override // defpackage.apl
    protected final void i() {
        a();
    }

    @Override // defpackage.apl
    protected final void k() {
        f();
    }

    @Override // defpackage.apl
    public final void l() {
    }

    @Override // defpackage.apl
    protected final void n() {
        f();
    }
}
