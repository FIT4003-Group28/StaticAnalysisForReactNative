package defpackage;

import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
import com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: iug  reason: default package */
/* loaded from: classes3.dex */
public final class iug {
    public final akfw a;
    public final Set b = new HashSet();
    public avdu c;
    private final HatsController d;
    private final MealbarPromoController e;
    private final fcb f;
    private final acti g;
    private atds h;

    public iug(HatsController hatsController, MealbarPromoController mealbarPromoController, acti actiVar, akfw akfwVar, fcb fcbVar) {
        this.d = hatsController;
        this.e = mealbarPromoController;
        this.g = actiVar;
        this.a = akfwVar;
        this.f = fcbVar;
    }

    public final void a(asgt asgtVar) {
        FormatStreamModel formatStreamModel;
        atds atdsVar;
        avdv avdvVar;
        avdu avduVar;
        avjf avjfVar;
        asgr asgrVar = asgtVar.j;
        if (asgrVar == null) {
            asgrVar = asgr.a;
        }
        if (asgrVar.b == 152873793) {
            asgr asgrVar2 = asgtVar.j;
            if (asgrVar2 == null) {
                asgrVar2 = asgr.a;
            }
            if (asgrVar2.b == 152873793) {
                avjfVar = (avjf) asgrVar2.c;
            } else {
                avjfVar = avjf.a;
            }
            this.b.add(ggs.j(avjfVar));
            this.a.e(avjfVar, new ampt() { // from class: iuf
                @Override // defpackage.ampt
                public final boolean a(Object obj) {
                    return iug.this.b.contains(ggs.j((avjf) obj));
                }
            });
        }
        asgv asgvVar = asgtVar.m;
        if (asgvVar == null) {
            asgvVar = asgv.a;
        }
        if (asgvVar.b == 84469052) {
            asgv asgvVar2 = asgtVar.m;
            if (asgvVar2 == null) {
                asgvVar2 = asgv.a;
            }
            if (asgvVar2.b == 84469052) {
                avdvVar = (avdv) asgvVar2.c;
            } else {
                avdvVar = avdv.a;
            }
            if ((avdvVar.b & 16) != 0) {
                avduVar = avdvVar.c;
                if (avduVar == null) {
                    avduVar = avdu.a;
                }
            } else {
                avduVar = null;
            }
            this.c = avduVar;
            this.d.k(avduVar);
            return;
        }
        asgr asgrVar3 = asgtVar.j;
        if (asgrVar3 == null) {
            asgrVar3 = asgr.a;
        }
        if (asgrVar3.b == 96907215) {
            asgr asgrVar4 = asgtVar.j;
            if (asgrVar4 == null) {
                asgrVar4 = asgr.a;
            }
            if (asgrVar4.b == 96907215) {
                atdsVar = (atds) asgrVar4.c;
            } else {
                atdsVar = atds.a;
            }
            this.h = atdsVar;
            this.e.h(atdsVar, this.g);
            return;
        }
        fcb fcbVar = this.f;
        if (!fcbVar.b.o() || (formatStreamModel = fcbVar.i.a) == null || !formatStreamModel.J()) {
            return;
        }
        asxj asxjVar = fcbVar.h.b().e;
        if (asxjVar == null) {
            asxjVar = asxj.a;
        }
        boolean c = ghj.c(fcbVar.d, ((fda) fcbVar.e.a.c()).i, TimeUnit.SECONDS.toMillis(asxjVar.T), fcbVar.f.c());
        asxj asxjVar2 = fcbVar.h.b().e;
        if (asxjVar2 == null) {
            asxjVar2 = asxj.a;
        }
        int i = asxjVar2.U;
        long j = ((fda) fcbVar.e.a.c()).h;
        long j2 = i;
        if (!c || j >= j2) {
            return;
        }
        if (fcbVar.g == null) {
            akfh l = fcbVar.c.l();
            l.k(fcbVar.a.getResources().getString(R.string.offline_stream_snackbar_text));
            l.l(new fca(fcbVar));
            l.j(true);
            fcbVar.g = l.b();
        }
        fcbVar.c.n(fcbVar.g);
    }

    public final void b() {
        this.e.g(this.h);
        this.d.i(this.c);
        fcb fcbVar = this.f;
        akfi akfiVar = fcbVar.g;
        if (akfiVar != null) {
            fcbVar.c.m(akfiVar);
        }
    }
}
