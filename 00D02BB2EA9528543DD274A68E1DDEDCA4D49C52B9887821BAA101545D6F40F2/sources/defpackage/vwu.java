package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: vwu  reason: default package */
/* loaded from: classes7.dex */
public final class vwu {
    public static final eaow a = eaow.c(1);
    public final Context b;
    public final Resources c;
    public final cqat d;

    public vwu(Context context, cqat cqatVar) {
        this.b = context;
        this.c = context.getResources();
        this.d = cqatVar;
    }

    public static eaow g(eaow eaowVar) {
        return eaow.c(Math.abs(eaowVar.f()));
    }

    private final void h(dpbw dpbwVar, bvsv bvsvVar) {
        if (vxj.f(dpbwVar)) {
            bvsvVar.l(vxj.a(dpbwVar, this.b));
            bvsvVar.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bvsv a(vwt vwtVar) {
        eaol a2 = vxs.a(vwtVar.a());
        if (a2 == null) {
            return new bvsx(this.c).a("");
        }
        eaow f = f(a2.Ti());
        dpbw d = vxj.d(vwtVar);
        boolean z = f != null && g(f).q(a);
        boolean x = a2.x(new eapd(this.d.b()));
        if (z) {
            return c(d);
        }
        if (x || f == null) {
            String a3 = zbc.a(this.b, a2);
            bvsu c = new bvsx(this.c).c(R.string.TRANSIT_UPCOMING_DEPARTURE_ABSOLUTE);
            c.a(b(d, a3));
            return c;
        }
        bvsu c2 = new bvsx(this.c).c(R.string.TRANSIT_UPCOMING_DEPARTURE_RELATIVE);
        c2.a(d(d, f));
        return c2;
    }

    public final bvsv b(dpbw dpbwVar, CharSequence charSequence) {
        bvsv a2 = new bvsx(this.c).a(charSequence);
        h(dpbwVar, a2);
        return a2;
    }

    public final bvsv c(dpbw dpbwVar) {
        bvsu c = new bvsx(this.c).c(R.string.TRANSIT_UPCOMING_DEPARTURE_NOW);
        h(dpbwVar, c);
        return c;
    }

    public final bvsv d(dpbw dpbwVar, eaow eaowVar) {
        bvsw bvswVar = new bvsw();
        Resources resources = this.c;
        int g = (int) eaowVar.g();
        bvsz bvszVar = bvsz.ABBREVIATED;
        if (vxj.f(dpbwVar)) {
            bvswVar.c();
        }
        return b(dpbwVar, bvtb.f(resources, g, bvszVar, bvswVar));
    }

    public final String e() {
        return this.c.getString(R.string.TRANSIT_UPCOMING_DEPARTURES_FORMATTED_NOW);
    }

    @dzsi
    public final eaow f(@dzsi eapd eapdVar) {
        if (eapdVar == null) {
            return null;
        }
        eaow c = eapj.b(new eapd(this.d.b()), eapdVar).c();
        if (!g(c).q(eaow.b(1L))) {
            return null;
        }
        return c;
    }
}
