package defpackage;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aeoe  reason: default package */
/* loaded from: classes2.dex */
public class aeoe implements aenl {
    public static final boolean a;
    public final Activity b;
    protected final btvo c;
    public final aeno d;
    public final aeno e;
    public final aeqi f;
    @dzsi
    public final dqxa g;
    public boolean h;
    public aehu i;
    private final cqat l;
    private final aeol m;
    private final cqkj n;
    @dzsi
    private gdf o;
    @dzsi
    private aelb p;
    private final aenn r;
    private final aenn s;
    public int j = 0;
    public int k = 0;
    private final aeoj q = new aeob(this);

    static {
        a = Build.VERSION.SDK_INT < 22;
    }

    public aeoe(Activity activity, aenp aenpVar, aeol aeolVar, cqat cqatVar, cqkj cqkjVar, btvo btvoVar, cqhu cqhuVar, aeqi aeqiVar, aela aelaVar, aehu aehuVar, @dzsi dqxa dqxaVar) {
        aeoc aeocVar = new aeoc(this);
        this.r = aeocVar;
        aeod aeodVar = new aeod(this);
        this.s = aeodVar;
        this.b = activity;
        this.c = btvoVar;
        this.l = cqatVar;
        this.m = aeolVar;
        this.f = aeqiVar;
        this.n = cqkjVar;
        this.g = dqxaVar;
        eapg eapgVar = aehuVar.c;
        eapg eapgVar2 = aehuVar.d;
        aeno a2 = aenpVar.a(R.string.CHECK_IN_CONTENT_DESCRIPTION, aelaVar.b(), cqrt.l(R.string.ACCESSIBILITY_CHECK_IN_PREV_ARROW_DATE_BUTTON), cqrt.l(R.string.ACCESSIBILITY_CHECK_IN_NEXT_ARROW_DATE_BUTTON), aelaVar.a(), aehu.d(cqatVar), aehu.e(cqatVar), eapgVar);
        this.d = a2;
        aeno a3 = aenpVar.a(R.string.CHECK_OUT_CONTENT_DESCRIPTION, aelaVar.c(), cqrt.l(R.string.ACCESSIBILITY_CHECK_OUT_PREV_ARROW_DATE_BUTTON), cqrt.l(R.string.ACCESSIBILITY_CHECK_OUT_NEXT_ARROW_DATE_BUTTON), aelaVar.a(), aehu.g(eapgVar), aehu.f(eapgVar), eapgVar2);
        this.e = a3;
        this.i = aehuVar;
        a2.j(aeodVar);
        a3.j(aeocVar);
    }

    public final void Re() {
        gdf gdfVar = this.o;
        if (gdfVar != null) {
            gdfVar.dismiss();
        }
    }

    public final void Rf() {
        cqiw aelrVar;
        eapg a2;
        gdf gdfVar = new gdf(this.b, 16974132);
        this.o = gdfVar;
        aeok a3 = this.m.a(this.q, this.d.a(), this.e.a(), this.k);
        cqkj cqkjVar = this.n;
        if (a) {
            if (this.k == 0) {
                a2 = this.d.a();
            } else {
                a2 = this.e.a();
            }
            aelrVar = new aema(a2.r(), a2.s() - 1, a2.t());
        } else {
            aelrVar = new aelr();
        }
        cqkf c = cqkjVar.c(aelrVar, null);
        c.e(a3);
        gdfVar.setContentView(c.c());
        this.o.show();
    }

    public void a(@dzsi aelb aelbVar) {
        this.p = aelbVar;
    }

    public void b(aehu aehuVar) {
        this.i = aehuVar;
        d(aehuVar);
        cqkx.p(this);
    }

    public final void c(aehu aehuVar, ddho ddhoVar, cjqm cjqmVar) {
        d(aehuVar);
        this.i = aehuVar;
        cqkx.p(this);
        aelb aelbVar = this.p;
        if (aelbVar != null) {
            aelbVar.a(aehuVar.c, aehuVar.d, ddhoVar, cjqmVar);
        }
    }

    public final void d(aehu aehuVar) {
        this.d.l(aehuVar.c);
        this.e.l(aehuVar.d);
        this.d.i(aehu.d(this.l), aehu.e(this.l));
        eapg eapgVar = aehuVar.c;
        this.e.i(aehu.g(eapgVar), aehu.f(eapgVar));
    }

    public void e() {
        Re();
    }

    public void f(@dzsi cjta cjtaVar) {
        this.d.j = cjtaVar;
        this.e.j = cjtaVar;
    }

    @Override // defpackage.aenl
    public aeng g() {
        return this.d;
    }

    @Override // defpackage.aenl
    public aeng h() {
        return this.e;
    }

    @Override // defpackage.aenl
    public cqfc i() {
        return this.c.getHotelBookingModuleParameters().g() ? new cqfc(this) { // from class: aenz
            private final aeoe a;

            {
                this.a = this;
            }

            @Override // defpackage.cqfc
            public final void a(View view, boolean z) {
                View a2;
                aeoe aeoeVar = this.a;
                if (!aeqi.g(aeoeVar.g) || (a2 = cqhu.a(view, aene.a)) == null) {
                    return;
                }
                aeqi aeqiVar = aeoeVar.f;
                aeqiVar.b = a2;
                aeqiVar.h();
            }
        } : aeny.a;
    }

    @Override // defpackage.aenl
    @dzsi
    public cqfd j() {
        if (this.c.getCategoricalSearchParameters().b()) {
            return null;
        }
        return new cqfd(this) { // from class: aeoa
            private final aeoe a;

            {
                this.a = this;
            }

            @Override // defpackage.cqfd
            public final boolean a(View view) {
                aeoe aeoeVar = this.a;
                boolean z = ((float) view.getMeasuredWidth()) > (aeoeVar.b.getResources().getDisplayMetrics().density * 186.0f) * aeoeVar.b.getResources().getConfiguration().fontScale;
                if (aeoeVar.k().booleanValue() != z) {
                    aeoeVar.h = z;
                    aeoeVar.d.c = z;
                    aeoeVar.e.c = z;
                    cqkx.p(aeoeVar);
                    return false;
                }
                return true;
            }
        };
    }

    @Override // defpackage.aenl
    public Boolean k() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.aenl
    public Float l() {
        return aenj.a();
    }
}
