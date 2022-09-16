package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: xnp  reason: default package */
/* loaded from: classes4.dex */
public final class xnp implements xns, xnr {
    private final Activity a;
    private final xko b;
    private final ajyj c;
    private final xlp d;
    private final xwd e;
    private final String f;
    private final zdt g;
    private final aafo h;

    public xnp(Activity activity, xko xkoVar, ajyj ajyjVar, xlp xlpVar, xwd xwdVar, String str, zdt zdtVar, aafo aafoVar) {
        this.a = activity;
        this.b = xkoVar;
        this.c = ajyjVar;
        this.d = xlpVar;
        this.e = xwdVar;
        this.f = str;
        this.g = zdtVar;
        this.h = aafoVar;
    }

    private final acti g() {
        Activity activity = this.a;
        if (activity instanceof acth) {
            return ((acth) activity).oi();
        }
        return null;
    }

    private static amup h(ajyj ajyjVar) {
        if (ajyjVar != null) {
            return amup.k("sectionController", ajyjVar);
        }
        return null;
    }

    @Override // defpackage.xns
    public final /* synthetic */ Long a() {
        return null;
    }

    @Override // defpackage.xns
    public final String b() {
        return this.f;
    }

    @Override // defpackage.xns
    public final void c(cff cffVar) {
        this.g.a(cffVar);
    }

    @Override // defpackage.xns
    public final void d(arog arogVar) {
        arnh arnhVar;
        aqav aqavVar;
        this.e.dismiss();
        if ((arogVar.b & 2) != 0 || arogVar.e.size() <= 0) {
            xko xkoVar = this.b;
            if ((arogVar.b & 4) != 0) {
                arnhVar = arogVar.f;
                if (arnhVar == null) {
                    arnhVar = arnh.a;
                }
            } else {
                arnhVar = null;
            }
            xkoVar.a(arnhVar, h(this.c));
            aroh arohVar = arogVar.d;
            if (arohVar == null) {
                arohVar = aroh.a;
            }
            if (arohVar.b != 62285947) {
                return;
            }
            aroh arohVar2 = arogVar.d;
            if (arohVar2 == null) {
                arohVar2 = aroh.a;
            }
            if (arohVar2.b == 62285947) {
                aqavVar = (aqav) arohVar2.c;
            } else {
                aqavVar = aqav.a;
            }
            if ((aqavVar.c & 32) != 0 && g() != null) {
                g().D(new acte(aqavVar.A.I()));
            }
            xmd xmdVar = this.d.b;
            if (xmdVar == null) {
                return;
            }
            xmdVar.e(aqavVar);
            return;
        }
        if (g() != null) {
            arnh arnhVar2 = arogVar.f;
            if (arnhVar2 == null) {
                arnhVar2 = arnh.a;
            }
            if ((arnhVar2.b & 4096) != 0) {
                arnh arnhVar3 = arogVar.f;
                if (arnhVar3 == null) {
                    arnhVar3 = arnh.a;
                }
                if (arnhVar3.l) {
                    g().n(new acte(actj.CIVILITY_REMINDER_DIALOG));
                    g().n(new acte(actj.CIVILITY_REMINDER_EDIT_BUTTON));
                    g().n(new acte(actj.CIVILITY_REMINDER_POST_ANYWAY_BUTTON));
                    g().n(new acte(actj.CIVILITY_REMINDER_REPORT_BUTTON));
                }
            }
        }
        this.h.b(arogVar.e);
    }

    @Override // defpackage.xnr
    public final void e(cff cffVar) {
        this.g.a(cffVar);
    }

    @Override // defpackage.xnr
    public final void f(arod arodVar) {
        arnh arnhVar;
        xlp xlpVar;
        xmd xmdVar;
        aqav aqavVar;
        aqav aqavVar2;
        this.e.dismiss();
        if ((arodVar.b & 2) != 0 || arodVar.f.size() <= 0) {
            xko xkoVar = this.b;
            if ((arodVar.b & 8) != 0) {
                arnhVar = arodVar.g;
                if (arnhVar == null) {
                    arnhVar = arnh.a;
                }
            } else {
                arnhVar = null;
            }
            xkoVar.a(arnhVar, h(this.c));
            aroe aroeVar = arodVar.d;
            if (aroeVar == null) {
                aroeVar = aroe.a;
            }
            if (aroeVar.b != 62285947 || (xmdVar = (xlpVar = this.d).b) == null) {
                return;
            }
            if (!arodVar.e) {
                aqav aqavVar3 = xlpVar.c;
                aroe aroeVar2 = arodVar.d;
                if (aroeVar2 == null) {
                    aroeVar2 = aroe.a;
                }
                if (aroeVar2.b == 62285947) {
                    aqavVar = (aqav) aroeVar2.c;
                } else {
                    aqavVar = aqav.a;
                }
                xmdVar.f(aqavVar3, aqavVar);
                return;
            }
            aroe aroeVar3 = arodVar.d;
            if (aroeVar3 == null) {
                aroeVar3 = aroe.a;
            }
            if (aroeVar3.b == 62285947) {
                aqavVar2 = (aqav) aroeVar3.c;
            } else {
                aqavVar2 = aqav.a;
            }
            xmdVar.g(aqavVar2, this.d.c);
            return;
        }
        if (g() != null) {
            arnh arnhVar2 = arodVar.g;
            if (arnhVar2 == null) {
                arnhVar2 = arnh.a;
            }
            if ((arnhVar2.b & 4096) != 0) {
                arnh arnhVar3 = arodVar.g;
                if (arnhVar3 == null) {
                    arnhVar3 = arnh.a;
                }
                if (arnhVar3.l) {
                    g().n(new acte(actj.CIVILITY_REMINDER_DIALOG));
                    g().n(new acte(actj.CIVILITY_REMINDER_EDIT_BUTTON));
                    g().n(new acte(actj.CIVILITY_REMINDER_POST_ANYWAY_BUTTON));
                    g().n(new acte(actj.CIVILITY_REMINDER_REPORT_BUTTON));
                }
            }
        }
        this.h.b(arodVar.f);
    }
}
