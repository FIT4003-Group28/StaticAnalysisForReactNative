package defpackage;

import android.app.Application;
import com.google.android.apps.maps.R;
import com.google.android.libraries.geophotouploader.UploadService;
import java.util.Date;
import java.util.List;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: bbps  reason: default package */
/* loaded from: classes3.dex */
public final class bbps extends bbqf {
    private static final dcqe d = dcqe.c("bbps");
    public final Application a;
    public final crwb b;
    public final dcdc<Integer> c;
    private final crtf e;

    public bbps(Application application, crwb crwbVar, btvo btvoVar, crtf crtfVar) {
        this.a = application;
        this.b = crwbVar;
        dccx F = dcdc.F();
        F.i(btvoVar.getLoggingParameters().j);
        F.i(btvoVar.getTriggerExperimentIdParameters().a);
        this.c = F.f();
        this.e = crtfVar;
    }

    private static crti j(String str, dwyd dwydVar, dbsg<bbvh> dbsgVar) {
        boolean z;
        dbsg i;
        crth bZ = crti.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        crti crtiVar = (crti) bZ.b;
        str.getClass();
        crtiVar.a |= 1;
        crtiVar.b = str;
        if (dwydVar.equals(dwyd.REVIEW)) {
            dgpx bZ2 = dgpy.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dgpy dgpyVar = (dgpy) bZ2.b;
            dgpyVar.a |= 1;
            dgpyVar.b = "local-user-posts";
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            crti crtiVar2 = (crti) bZ.b;
            dgpy bK = bZ2.bK();
            bK.getClass();
            crtiVar2.e = bK;
            crtiVar2.a |= 8;
        }
        int i2 = 2;
        if (dbsgVar.a()) {
            ilo a = dbsgVar.b().a();
            if (!a.bf().r) {
                i = dbpy.a;
            } else {
                String cR = a.cR();
                if (cR == null) {
                    bvoo.h("PlusPageInfo has no obfuscated GAIA id. Feature ID: %s", a.ai());
                    i = dbpy.a;
                } else {
                    i = dbsg.i(cR);
                }
            }
            z = i.a();
            if (z) {
                String str2 = (String) i.b();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                crti crtiVar3 = (crti) bZ.b;
                str2.getClass();
                crtiVar3.a |= 2;
                crtiVar3.c = str2;
            }
        } else {
            z = false;
        }
        if (dwydVar == dwyd.MERCHANT_MODE_CREATE_POST_WEBVIEW) {
            i2 = 41;
        } else if (z) {
            i2 = 31;
        } else {
            crtx crtxVar = crtx.UNKNOWN;
            int ordinal = dwydVar.ordinal();
            if (ordinal == 5) {
                i2 = 64;
            } else if (ordinal == 10) {
                i2 = 27;
            } else if (ordinal == 12) {
                i2 = 66;
            } else if (ordinal == 14) {
                i2 = 26;
            }
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        crti crtiVar4 = (crti) bZ.b;
        crtiVar4.d = i2 - 1;
        crtiVar4.a |= 4;
        return bZ.bK();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:94:0x0317
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:82)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    @Override // defpackage.bbqf
    public final defpackage.dcdc<defpackage.cruz> a(java.lang.String r23, defpackage.dwyd r24, defpackage.dbsg<defpackage.bbvh> r25, defpackage.dcdc<defpackage.bbpw> r26) {
        /*
            Method dump skipped, instructions count: 1277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbps.a(java.lang.String, dwyd, dbsg, dcdc):dcdc");
    }

    @Override // defpackage.bbqf
    public final dcdc<cruz> b(String str, final dwyd dwydVar, dbsg<bbvh> dbsgVar, dcdc<bbpy> dcdcVar) {
        crva bK;
        crtf crtfVar = this.e;
        crti j = j(str, dwydVar, dbsgVar);
        final List<crts> k = dchl.k(dcdcVar, new dbrn(this, dwydVar) { // from class: bbpp
            private final bbps a;
            private final dwyd b;

            {
                this.a = this;
                this.b = dwydVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                bbps bbpsVar = this.a;
                return ((bbpy) obj).d(bbpsVar.a, this.b, bbpsVar.c, bbpsVar.b);
            }
        });
        dbsk.b(!k.isEmpty(), "uploadOptions cannot be empty.");
        if (!crtf.e(j)) {
            bK = crtf.f(k.size(), cruf.PRECHECK_REJECTED_INVALID_ARGUMENT);
        } else {
            for (crts crtsVar : k) {
                dbsk.b(!crtsVar.c.isEmpty(), "UploadOption.photo_id is required.");
            }
            dcdc r = dcdc.r(dchl.k(k, crtb.a));
            crxa f = crxb.f();
            f.c(j);
            f.d((String) r.get(0));
            f.b(r);
            f.e(Long.valueOf(new Date().getTime()));
            final crxb f2 = f.f();
            crvs b = crtfVar.d.b(f2, dtbh.IMPORT);
            b.n((crts) k.get(0));
            b.a();
            crtfVar.a(new cruu(f2, k) { // from class: crtc
                private final crxb a;
                private final List b;

                {
                    this.a = f2;
                    this.b = k;
                }

                @Override // defpackage.cruu
                public final void a(UploadService uploadService) {
                    crxb crxbVar = this.a;
                    List list = this.b;
                    uploadService.j.a(uploadService, uploadService.getResources().getQuantityString(R.plurals.PHOTO_UPLOAD_IN_PROGRESS_TITLE, list.size(), Integer.valueOf(list.size())));
                    crug crugVar = uploadService.b;
                    crxf g = crxg.g();
                    ((crxc) g).a = uploadService;
                    g.b(uploadService.c);
                    g.c(uploadService.m);
                    g.f(uploadService.b);
                    g.e(crxbVar);
                    g.d(uploadService.d);
                    crxe crxeVar = new crxe(g.a(), list);
                    synchronized (crug.a) {
                        crugVar.b.execute(crxeVar);
                        crugVar.d++;
                    }
                }
            });
            crux bZ = crva.b.bZ();
            List k2 = dchl.k(r, crtd.a);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            crva crvaVar = (crva) bZ.b;
            crvaVar.b();
            dsod.bv(k2, crvaVar.a);
            bK = bZ.bK();
        }
        return dcdc.r(bK.a);
    }

    @Override // defpackage.bbqf
    public final boolean c() {
        return this.e.d();
    }

    @Override // defpackage.bbqf
    public final void d(boolean z) {
        this.e.j.edit().putBoolean("geo.uploader.shared_preference_wifi_only_key", z).apply();
    }

    @Override // defpackage.bbqf
    public final dbsg<String> e(final String str) {
        dcdc<crua> f;
        dbsl dbslVar = new dbsl(str) { // from class: bbpq
            private final String a;

            {
                this.a = str;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return ((crua) obj).c.equals(this.a);
            }
        };
        crtf crtfVar = this.e;
        synchronized (crtfVar.k) {
            dccx F = dcdc.F();
            crte crteVar = crtfVar.k;
            dccx F2 = dcdc.F();
            for (Queue<crua> queue : crteVar.a.values()) {
                F2.i(queue);
            }
            F.i(F2.f());
            F.i(crtfVar.f.d(null, null));
            f = F.f();
        }
        for (crua cruaVar : f) {
            if (dbslVar.a(cruaVar)) {
                return dbsg.i(cruaVar.b);
            }
        }
        return dbpy.a;
    }

    @Override // defpackage.bbqf
    public final dbsg<String> f(String str) {
        crua c = this.e.c(str);
        if (c == null || (c.a & 128) == 0) {
            return dbpy.a;
        }
        dfqq dfqqVar = c.j;
        if (dfqqVar == null) {
            dfqqVar = dfqq.x;
        }
        return dbsg.i(dfqqVar.c);
    }

    @Override // defpackage.bbqf
    public final dbsg<String> g(String str) {
        crua c = this.e.c(str);
        if (c != null && (c.a & 128) != 0) {
            dfqq dfqqVar = c.j;
            if (dfqqVar == null) {
                dfqqVar = dfqq.x;
            }
            if ((dfqqVar.a & 4) != 0) {
                dfqq dfqqVar2 = c.j;
                if (dfqqVar2 == null) {
                    dfqqVar2 = dfqq.x;
                }
                return dbsg.i(dfqqVar2.d);
            }
        }
        return dbpy.a;
    }

    @Override // defpackage.bbqf
    public final int h(String str) {
        dwyd dwydVar = dwyd.UNKNOWN_ENTRY_POINT;
        switch (((crtx) dbsg.j(this.e.c(str)).h(bbpr.a).c(crtx.UNKNOWN)).ordinal()) {
            case 1:
            case 2:
                return 2;
            case 3:
            case 4:
                return 4;
            case 5:
            case 6:
            case 7:
                return 3;
            default:
                return 1;
        }
    }
}
