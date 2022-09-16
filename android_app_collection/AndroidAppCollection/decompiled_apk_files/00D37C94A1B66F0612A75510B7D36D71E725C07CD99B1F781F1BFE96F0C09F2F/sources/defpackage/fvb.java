package defpackage;

import com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: fvb  reason: default package */
/* loaded from: classes3.dex */
public final class fvb implements airt, ynl {
    final /* synthetic */ MealbarPromoController a;

    public fvb(MealbarPromoController mealbarPromoController) {
        this.a = mealbarPromoController;
    }

    public final void a(ahhw ahhwVar) {
        boolean a;
        boolean b;
        fvc fvcVar = this.a.a;
        PlayerResponseModel b2 = ahhwVar.b();
        int i = 0;
        if (b2 != null) {
            asaf[] L = b2.L();
            int i2 = 0;
            while (true) {
                if (i2 >= L.length) {
                    b = fvcVar.b(null);
                    break;
                }
                asaf asafVar = L[i2];
                if ((asafVar.b & 1) != 0) {
                    atds atdsVar = asafVar.c;
                    if (atdsVar == null) {
                        atdsVar = atds.a;
                    }
                    b = fvcVar.b(atdsVar);
                } else {
                    i2++;
                }
            }
            if (b) {
                MealbarPromoController mealbarPromoController = this.a;
                mealbarPromoController.h(mealbarPromoController.a.a, mealbarPromoController.c);
                return;
            }
        }
        fvc fvcVar2 = this.a.a;
        PlayerResponseModel b3 = ahhwVar.b();
        if (b3 == null) {
            return;
        }
        asaf[] L2 = b3.L();
        int length = L2.length;
        while (true) {
            if (i >= length) {
                a = fvcVar2.a(null);
                break;
            }
            asaf asafVar2 = L2[i];
            if ((asafVar2.b & 8) != 0) {
                apzj apzjVar = asafVar2.f;
                if (apzjVar == null) {
                    apzjVar = apzj.a;
                }
                a = fvcVar2.a(apzjVar);
            } else {
                i++;
            }
        }
        if (!a) {
            return;
        }
        MealbarPromoController mealbarPromoController2 = this.a;
        apzj apzjVar2 = mealbarPromoController2.a.b;
        if (apzjVar2 == null) {
            mealbarPromoController2.h.b();
        } else if ((apzjVar2.b & 8) == 0) {
        } else {
            mealbarPromoController2.b.a(null);
            mealbarPromoController2.h.b();
            aweu aweuVar = apzjVar2.e;
            if (aweuVar == null) {
                aweuVar = aweu.a;
            }
            int Q = awwc.Q(aweuVar.b);
            if (Q == 0 || Q != 4) {
                aweu aweuVar2 = apzjVar2.e;
                if (aweuVar2 == null) {
                    aweuVar2 = aweu.a;
                }
                int Q2 = awwc.Q(aweuVar2.b);
                if (Q2 == 0 || Q2 != 3) {
                    return;
                }
                mealbarPromoController2.b.a(apzjVar2);
                return;
            }
            mealbarPromoController2.h.a(apzjVar2);
        }
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().b.aa(new ayqb() { // from class: fva
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                fvb.this.a((ahhw) obj);
            }
        }, dzq.u)};
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                a((ahhw) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhw.class};
    }
}
