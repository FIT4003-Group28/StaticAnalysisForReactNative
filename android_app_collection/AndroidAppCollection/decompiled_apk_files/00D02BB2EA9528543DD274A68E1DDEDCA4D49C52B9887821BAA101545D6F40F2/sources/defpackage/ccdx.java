package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ccdx  reason: default package */
/* loaded from: classes4.dex */
public class ccdx implements cccu {
    private static final dcqe c = dcqe.c("ccdx");
    public final dxio<ccbk> a;
    @dzsi
    public final drns b;
    private final dxio<gce> d;
    private final Resources e;
    private final boolean f;
    private final cjtd g;
    private final cqix<?> h;
    private final dcdc<ccef> i;
    @dzsi
    private final jic j;
    @dzsi
    private final jic k;
    private final iuv l;
    private final String m;
    private final String n;
    private boolean o;
    @dzsi
    private cccq p;

    /* JADX WARN: Removed duplicated region for block: B:89:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ccdx(defpackage.dxio<defpackage.ccbk> r4, defpackage.dxio<defpackage.cccw> r5, defpackage.dxio<defpackage.ccdp> r6, defpackage.dxio<defpackage.ccdh> r7, final defpackage.dxio<defpackage.ccec> r8, defpackage.dxio<defpackage.gce> r9, android.content.res.Resources r10, defpackage.drnp r11) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccdx.<init>(dxio, dxio, dxio, dxio, dxio, dxio, android.content.res.Resources, drnp):void");
    }

    @Override // defpackage.cccu
    public Boolean a() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.cccu
    public cjtd b() {
        return this.g;
    }

    @Override // defpackage.cccu
    @dzsi
    public jic c() {
        return this.d.a().h() ? this.k : this.j;
    }

    @Override // defpackage.cccu
    public cqss d() {
        return this.l;
    }

    @Override // defpackage.cccu
    public cqix<?> e() {
        return this.h;
    }

    @Override // defpackage.cccu
    public Boolean f() {
        drns drnsVar = this.b;
        boolean z = false;
        if (drnsVar != null && drnq.a(drnsVar.a) != 6) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cccu
    public View.OnClickListener g() {
        return new View.OnClickListener(this) { // from class: ccdv
            private final ccdx a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                drnb drnbVar;
                drnl drnlVar;
                drmz drmzVar;
                drmx drmxVar;
                drmj drmjVar;
                String str;
                ccdx ccdxVar = this.a;
                if (ccdxVar.b != null) {
                    ccbk a = ccdxVar.a.a();
                    drns drnsVar = ccdxVar.b;
                    int a2 = drnq.a(drnsVar.a);
                    int i = a2 - 1;
                    if (a2 == 0) {
                        throw null;
                    }
                    if (i == 0) {
                        ccbi a3 = a.b.a();
                        if (drnsVar.a == 1) {
                            drnbVar = (drnb) drnsVar.b;
                        } else {
                            drnbVar = drnb.b;
                        }
                        a3.a.a().f(drnbVar.a);
                    } else if (i == 1) {
                        ccbj a4 = a.c.a();
                        if (drnsVar.a == 2) {
                            drnlVar = (drnl) drnsVar.b;
                        } else {
                            drnlVar = drnl.b;
                        }
                        afha a5 = a4.a.a();
                        dqdk dqdkVar = drnlVar.a;
                        if (dqdkVar == null) {
                            dqdkVar = dqdk.e;
                        }
                        a5.D(dqdkVar);
                    } else if (i == 2) {
                        ccbh a6 = a.d.a();
                        if (drnsVar.a == 3) {
                            drmzVar = (drmz) drnsVar.b;
                        } else {
                            drmzVar = drmz.c;
                        }
                        a6.a.a().i(drmzVar.b, 1, blpq.LOCAL_GUIDES_CAMPAIGN_ENTRY_POINT_NONPREFETCH);
                    } else if (i == 3) {
                        ccbg a7 = a.e.a();
                        if (drnsVar.a == 4) {
                            drmxVar = (drmx) drnsVar.b;
                        } else {
                            drmxVar = drmx.b;
                        }
                        a7.a.a().a(drmxVar.a);
                    } else if (i != 4) {
                        Object[] objArr = new Object[1];
                        int a8 = drnq.a(drnsVar.a);
                        switch (a8) {
                            case 1:
                                str = "OPEN_URL_IN_APP_ACTION";
                                break;
                            case 2:
                                str = "PLATFORM_INTENT_ACTION";
                                break;
                            case 3:
                                str = "LAUNCH_RIDDLER_ACTION";
                                break;
                            case 4:
                                str = "LAUNCH_HELP_CENTER_ACTION";
                                break;
                            case 5:
                                str = "FULL_SCREEN_WEB_VIEW_ACTION";
                                break;
                            case 6:
                                str = "ACTION_NOT_SET";
                                break;
                            default:
                                str = "null";
                                break;
                        }
                        if (a8 == 0) {
                            throw null;
                        }
                        objArr[0] = str;
                        bvoo.h("Unsupported UgcInfoCardAction: %s", objArr);
                    } else {
                        ccbf a9 = a.f.a();
                        if (drnsVar.a == 5) {
                            drmjVar = (drmj) drnsVar.b;
                        } else {
                            drmjVar = drmj.h;
                        }
                        bvvw a10 = a9.a.a();
                        bvxn bZ = bvxu.A.bZ();
                        String str2 = drmjVar.b;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        bvxu bvxuVar = (bvxu) bZ.b;
                        str2.getClass();
                        int i2 = bvxuVar.a | 1;
                        bvxuVar.a = i2;
                        bvxuVar.b = str2;
                        boolean z = drmjVar.c;
                        int i3 = i2 | 2;
                        bvxuVar.a = i3;
                        bvxuVar.c = z;
                        boolean z2 = drmjVar.d;
                        bvxuVar.a = i3 | 4;
                        bvxuVar.d = z2;
                        dkyx aT = a9.b.a().getUgcParameters().aT();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        bvxu bvxuVar2 = (bvxu) bZ.b;
                        aT.getClass();
                        bvxuVar2.j = aT;
                        bvxuVar2.a |= 256;
                        bvxq bZ2 = bvxt.c.bZ();
                        bvxr bZ3 = bvxs.d.bZ();
                        drme drmeVar = drmjVar.g;
                        if (drmeVar == null) {
                            drmeVar = drme.c;
                        }
                        String str3 = drmeVar.a;
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        bvxs bvxsVar = (bvxs) bZ3.b;
                        str3.getClass();
                        bvxsVar.a |= 1;
                        bvxsVar.b = str3;
                        drme drmeVar2 = drmjVar.g;
                        if (drmeVar2 == null) {
                            drmeVar2 = drme.c;
                        }
                        String str4 = drmeVar2.b;
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        bvxs bvxsVar2 = (bvxs) bZ3.b;
                        str4.getClass();
                        bvxsVar2.a |= 2;
                        bvxsVar2.c = str4;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        bvxt bvxtVar = (bvxt) bZ2.b;
                        bvxs bK = bZ3.bK();
                        bK.getClass();
                        bvxtVar.b = bK;
                        bvxtVar.a = 2;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        bvxu bvxuVar3 = (bvxu) bZ.b;
                        bvxt bK2 = bZ2.bK();
                        bK2.getClass();
                        bvxuVar3.w = bK2;
                        bvxuVar3.a |= 2097152;
                        if ((drmjVar.a & 8) != 0) {
                            drmi drmiVar = drmjVar.e;
                            if (drmiVar == null) {
                                drmiVar = drmi.e;
                            }
                            bvxj bZ4 = bvxm.e.bZ();
                            if ((drmiVar.a & 1) != 0) {
                                String str5 = drmiVar.b;
                                if (bZ4.c) {
                                    bZ4.bF();
                                    bZ4.c = false;
                                }
                                bvxm bvxmVar = (bvxm) bZ4.b;
                                str5.getClass();
                                bvxmVar.a |= 1;
                                bvxmVar.b = str5;
                            }
                            int a11 = drmh.a(drmiVar.c);
                            if (a11 == 0 || a11 != 3) {
                                if (bZ4.c) {
                                    bZ4.bF();
                                    bZ4.c = false;
                                }
                                bvxm bvxmVar2 = (bvxm) bZ4.b;
                                bvxmVar2.c = 1;
                                bvxmVar2.a |= 2;
                            } else {
                                if (bZ4.c) {
                                    bZ4.bF();
                                    bZ4.c = false;
                                }
                                bvxm bvxmVar3 = (bvxm) bZ4.b;
                                bvxmVar3.c = 2;
                                bvxmVar3.a = 2 | bvxmVar3.a;
                            }
                            if ((drmiVar.a & 4) != 0) {
                                int i4 = drmiVar.d;
                                bvxm bvxmVar4 = (bvxm) bZ4.b;
                                bvxmVar4.a |= 4;
                                bvxmVar4.d = i4;
                            }
                            bvxm bK3 = bZ4.bK();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            bvxu bvxuVar4 = (bvxu) bZ.b;
                            bK3.getClass();
                            bvxuVar4.t = bK3;
                            bvxuVar4.a |= 262144;
                        }
                        a10.k(bZ.bK(), null, new dtxi(drmjVar.f));
                    }
                }
            }
        };
    }

    @Override // defpackage.cccu
    @dzsi
    public jht h() {
        if (this.i.isEmpty()) {
            return null;
        }
        jhu h = jhv.h();
        h.e(dcbg.b(this.i).s(ccdw.a).z());
        cccq cccqVar = this.p;
        if (cccqVar != null) {
            Resources resources = this.e;
            cccq cccqVar2 = this.p;
            dbsk.s(cccqVar2);
            ((jhi) h).e = resources.getString(R.string.CT_INFO_CARD_ACCESSIBILITY_OVERFLOW_MENU_CONTENT_DESCRIPTION, Integer.valueOf(cccqVar.a() + 1), Integer.valueOf(cccqVar2.b()));
        }
        return ((jhi) h).b();
    }

    @Override // defpackage.cccu
    public void i(boolean z) {
        this.o = z;
    }

    @Override // defpackage.cccu
    public boolean j() {
        return this.o;
    }

    @Override // defpackage.cccu
    public String k() {
        return this.m;
    }

    @Override // defpackage.cccu
    public dcdn<oy, View.OnClickListener> l() {
        dcdg p = dcdn.p();
        dcdc<ccef> dcdcVar = this.i;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            p.f(ccef.c(), dcdcVar.get(i).b());
        }
        return p.b();
    }

    @Override // defpackage.cccu
    public String m() {
        cccq cccqVar = this.p;
        if (cccqVar == null || cccqVar.b() <= 1) {
            return this.n;
        }
        Resources resources = this.e;
        cccq cccqVar2 = this.p;
        dbsk.s(cccqVar2);
        cccq cccqVar3 = this.p;
        dbsk.s(cccqVar3);
        return resources.getString(R.string.CT_INFO_CARD_ACCESSIBILITY_CONTENT_DESCRIPTION, Integer.valueOf(cccqVar2.a() + 1), Integer.valueOf(cccqVar3.b()), this.n);
    }

    @Override // defpackage.cccu
    public void n(cccq cccqVar) {
        this.p = cccqVar;
    }
}
