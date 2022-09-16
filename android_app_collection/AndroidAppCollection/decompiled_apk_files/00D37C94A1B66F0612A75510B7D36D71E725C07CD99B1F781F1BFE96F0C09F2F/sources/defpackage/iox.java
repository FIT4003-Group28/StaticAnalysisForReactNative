package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
import com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController;
import j$.util.Optional;
import java.util.Set;
/* compiled from: PG */
/* renamed from: iox  reason: default package */
/* loaded from: classes3.dex */
public final class iox {
    public final yzj a;
    public final mrx b;
    public final acth c;
    public final Set d;
    public final ggk e;
    public final yic f;
    private final Context g;
    private final nfz h;
    private final HatsController i;
    private final MealbarPromoController j;
    private final akfw k;
    private final aafo l;
    private final ezf m;

    public iox(Context context, yzj yzjVar, nfz nfzVar, mrx mrxVar, HatsController hatsController, MealbarPromoController mealbarPromoController, acth acthVar, akfw akfwVar, aafo aafoVar, ggk ggkVar, ezf ezfVar, Set set, niw niwVar, yic yicVar, byte[] bArr) {
        this.g = context;
        this.a = yzjVar;
        this.h = nfzVar;
        this.b = mrxVar;
        this.i = hatsController;
        this.j = mealbarPromoController;
        this.c = acthVar;
        this.k = akfwVar;
        this.l = aafoVar;
        this.m = ezfVar;
        this.d = set;
        this.e = ggkVar;
        this.f = yicVar;
        ggkVar.b = niwVar;
        ggkVar.c = ezfVar;
    }

    public static Optional a(arlt arltVar) {
        avjf avjfVar;
        arlq arlqVar = arltVar.h;
        if (arlqVar == null) {
            arlqVar = arlq.a;
        }
        if (arlqVar.b != 152873793) {
            return Optional.empty();
        }
        arlq arlqVar2 = arltVar.h;
        if (arlqVar2 == null) {
            arlqVar2 = arlq.a;
        }
        if (arlqVar2.b == 152873793) {
            avjfVar = (avjf) arlqVar2.c;
        } else {
            avjfVar = avjf.a;
        }
        return Optional.of(avjfVar);
    }

    public final void b(arlt arltVar) {
        avdv avdvVar;
        avjp avjpVar;
        arbg arbgVar;
        apzj apzjVar;
        aqft aqftVar;
        atds atdsVar;
        apzi apziVar;
        avdv avdvVar2;
        asku askuVar;
        Optional a = a(arltVar);
        if (a.isPresent()) {
            String j = ggs.j(a.get());
            this.d.add(j);
            this.k.f((avjf) a.get(), new ampt() { // from class: iow
                @Override // defpackage.ampt
                public final boolean a(Object obj) {
                    return iox.this.d.contains(ggs.j((avjf) obj));
                }
            }, !j.equals("music_app_button") && !j.equals("youtube_originals_button"));
        }
        if (!this.m.k()) {
            arlq arlqVar = arltVar.h;
            if (arlqVar == null) {
                arlqVar = arlq.a;
            }
            if (arlqVar.b != 86135402) {
                arlv arlvVar = arltVar.g;
                if (arlvVar == null) {
                    arlvVar = arlv.a;
                }
                if (arlvVar.b == 84469052) {
                    avdvVar = (avdv) arlvVar.c;
                } else {
                    avdvVar = avdv.a;
                }
                if ((avdvVar.b & 16) == 0) {
                    arlv arlvVar2 = arltVar.g;
                    if (arlvVar2 == null) {
                        arlvVar2 = arlv.a;
                    }
                    if (arlvVar2.b == 364669234) {
                        arlv arlvVar3 = arltVar.g;
                        if (arlvVar3 == null) {
                            arlvVar3 = arlv.a;
                        }
                        if (arlvVar3.b == 364669234) {
                            apziVar = (apzi) arlvVar3.c;
                        } else {
                            apziVar = apzi.a;
                        }
                        if ((apziVar.b & 1) != 0) {
                            aafo aafoVar = this.l;
                            apzg apzgVar = apziVar.c;
                            if (apzgVar == null) {
                                apzgVar = apzg.a;
                            }
                            aafoVar.a(apzgVar);
                            return;
                        }
                    }
                    arlq arlqVar2 = arltVar.h;
                    if (arlqVar2 == null) {
                        arlqVar2 = arlq.a;
                    }
                    if (arlqVar2.b != 96907215) {
                        arlu arluVar = arltVar.f;
                        if (arluVar == null) {
                            arluVar = arlu.a;
                        }
                        if (arluVar.b == 118637602) {
                            arlu arluVar2 = arltVar.f;
                            if (arluVar2 == null) {
                                arluVar2 = arlu.a;
                            }
                            if (arluVar2.b == 118637602) {
                                avjpVar = (avjp) arluVar2.c;
                            } else {
                                avjpVar = avjp.a;
                            }
                        } else {
                            arlq arlqVar3 = arltVar.h;
                            if (arlqVar3 == null) {
                                arlqVar3 = arlq.a;
                            }
                            if (arlqVar3.b == 118637602) {
                                arlq arlqVar4 = arltVar.h;
                                if (arlqVar4 == null) {
                                    arlqVar4 = arlq.a;
                                }
                                if (arlqVar4.b == 118637602) {
                                    avjpVar = (avjp) arlqVar4.c;
                                } else {
                                    avjpVar = avjp.a;
                                }
                            } else {
                                avjpVar = null;
                            }
                        }
                        mrx mrxVar = this.b;
                        acti oi = this.c.oi();
                        ezx g = mrxVar.a.g();
                        if (g.i() || g.l()) {
                            if (mrxVar.j()) {
                                mrxVar.a();
                            }
                        } else if (!mrx.k(avjpVar)) {
                            if (mrxVar.j()) {
                                return;
                            }
                            if (mrxVar.g == null) {
                                mrxVar.b();
                            }
                            mrxVar.f(avjpVar, oi);
                            mrxVar.e = false;
                            return;
                        }
                        arlq arlqVar5 = arltVar.h;
                        if (arlqVar5 == null) {
                            arlqVar5 = arlq.a;
                        }
                        if (arlqVar5.b != 64099105) {
                            arlq arlqVar6 = arltVar.h;
                            if (arlqVar6 == null) {
                                arlqVar6 = arlq.a;
                            }
                            if (arlqVar6.b == 182224395) {
                                arlq arlqVar7 = arltVar.h;
                                if (arlqVar7 == null) {
                                    arlqVar7 = arlq.a;
                                }
                                if (arlqVar7.b == 182224395) {
                                    apzjVar = (apzj) arlqVar7.c;
                                } else {
                                    apzjVar = apzj.a;
                                }
                                int i = apzjVar.b;
                                if ((i & 1) != 0) {
                                    aafo aafoVar2 = this.l;
                                    apzg apzgVar2 = apzjVar.c;
                                    if (apzgVar2 == null) {
                                        apzgVar2 = apzg.a;
                                    }
                                    aafoVar2.a(apzgVar2);
                                    return;
                                } else if ((i & 2) == 0) {
                                    return;
                                } else {
                                    aafo aafoVar3 = this.l;
                                    apzg apzgVar3 = apzjVar.d;
                                    if (apzgVar3 == null) {
                                        apzgVar3 = apzg.a;
                                    }
                                    aafoVar3.a(apzgVar3);
                                    this.c.oi().u(new acte(apzjVar.f), null);
                                    return;
                                }
                            }
                            arlq arlqVar8 = arltVar.h;
                            if (arlqVar8 == null) {
                                arlqVar8 = arlq.a;
                            }
                            if (arlqVar8.b == 162801955) {
                                arbgVar = (arbg) arlqVar8.c;
                            } else {
                                arbgVar = arbg.a;
                            }
                            c(arbgVar);
                            return;
                        }
                        Context context = this.g;
                        arlq arlqVar9 = arltVar.h;
                        if (arlqVar9 == null) {
                            arlqVar9 = arlq.a;
                        }
                        if (arlqVar9.b == 64099105) {
                            aqftVar = (aqft) arlqVar9.c;
                        } else {
                            aqftVar = aqft.a;
                        }
                        ajgx.n(context, aqftVar, this.l, this.c.oi(), null);
                        return;
                    }
                    MealbarPromoController mealbarPromoController = this.j;
                    arlq arlqVar10 = arltVar.h;
                    if (arlqVar10 == null) {
                        arlqVar10 = arlq.a;
                    }
                    if (arlqVar10.b == 96907215) {
                        atdsVar = (atds) arlqVar10.c;
                    } else {
                        atdsVar = atds.a;
                    }
                    mealbarPromoController.h(atdsVar, this.c.oi());
                    return;
                }
                HatsController hatsController = this.i;
                arlv arlvVar4 = arltVar.g;
                if (arlvVar4 == null) {
                    arlvVar4 = arlv.a;
                }
                if (arlvVar4.b == 84469052) {
                    avdvVar2 = (avdv) arlvVar4.c;
                } else {
                    avdvVar2 = avdv.a;
                }
                avdu avduVar = avdvVar2.c;
                if (avduVar == null) {
                    avduVar = avdu.a;
                }
                hatsController.k(avduVar);
                return;
            }
            nfz nfzVar = this.h;
            arlq arlqVar11 = arltVar.h;
            if (arlqVar11 == null) {
                arlqVar11 = arlq.a;
            }
            if (arlqVar11.b == 86135402) {
                askuVar = (asku) arlqVar11.c;
            } else {
                askuVar = asku.a;
            }
            nfzVar.e();
            nfzVar.c.a(askuVar);
            nfzVar.a.b(nfzVar.c);
        }
    }

    public final boolean c(arbg arbgVar) {
        if (arbgVar == null || (arbgVar.b & 1) == 0) {
            return false;
        }
        this.e.e(arbgVar);
        return true;
    }
}
