package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: xmy  reason: default package */
/* loaded from: classes7.dex */
public final class xmy implements xmx {
    @dzsi
    public doza a;
    private final Context b;
    private final cqat c;
    private final String d;
    private final zvb e;
    @dzsi
    private final dpce f;
    @dzsi
    private final String g;
    @dzsi
    private final dnoh h;
    @dzsi
    private final donz i;
    @dzsi
    private final dpyy j;
    @dzsi
    private final String k;
    @dzsi
    private final Integer l;
    @dzsi
    private final dqea m;
    @dzsi
    private final Runnable n;
    @dzsi
    private final cqtd o;
    private final eapr p;
    @dzsi
    private xmw q;

    public xmy(Context context, cqat cqatVar, String str, zvb zvbVar, @dzsi dpce dpceVar, @dzsi String str2, @dzsi dnoh dnohVar, eapr eaprVar, @dzsi donz donzVar, @dzsi dpyy dpyyVar, @dzsi dqea dqeaVar, @dzsi doza dozaVar, @dzsi jhk jhkVar, @dzsi Integer num, @dzsi Runnable runnable, @dzsi xmw xmwVar, @dzsi cqtd cqtdVar) {
        this.c = cqatVar;
        this.b = context;
        this.d = str;
        this.e = zvbVar;
        this.f = dpceVar;
        this.g = str2;
        this.h = dnohVar;
        this.p = eaprVar;
        this.i = donzVar;
        this.j = dpyyVar;
        this.k = jhkVar == null ? null : jhkVar.a;
        this.l = num;
        this.m = dqeaVar;
        this.a = dozaVar;
        this.n = runnable;
        this.q = xmwVar;
        this.o = cqtdVar;
    }

    @Override // defpackage.xmx
    public final String a() {
        return this.d;
    }

    @Override // defpackage.xmx
    public final zvb b() {
        return this.e;
    }

    @Override // defpackage.xmx
    @dzsi
    public final dpce c() {
        return this.f;
    }

    @Override // defpackage.xmx
    @dzsi
    public final String d() {
        return this.g;
    }

    @Override // defpackage.xmx
    @dzsi
    public final dpyy e() {
        return this.j;
    }

    @Override // defpackage.xmx
    @dzsi
    public final cqtd f() {
        return this.o;
    }

    @Override // defpackage.xmx
    @dzsi
    public final dnoh g() {
        return this.h;
    }

    @Override // defpackage.xmx
    public final CharSequence h() {
        Context context = this.b;
        eapr eaprVar = this.p;
        eaow b = xkb.b(this.c, eaprVar.Ti());
        if (b != null) {
            int f = (int) b.f();
            if (f >= -59 && f < 0) {
                int i = -f;
                return context.getResources().getQuantityString(R.plurals.TRANSIT_PAST_DEPARTURE_MINUTES, i, Integer.valueOf(i));
            } else if (f == 0) {
                return context.getString(R.string.TRANSIT_UPCOMING_DEPARTURE_NOW_STANDALONE);
            } else {
                if (f > 0 && f <= 59) {
                    return context.getResources().getQuantityString(R.plurals.TRANSIT_UPCOMING_DEPARTURE_MINUTES, f, Integer.valueOf(f));
                }
            }
        }
        return context.getString(R.string.TRANSIT_UPCOMING_DEPARTURE_ABSOLUTE, zbc.a(context, eaprVar));
    }

    @Override // defpackage.xmx
    public final eapr i() {
        return this.p;
    }

    @Override // defpackage.xmx
    @dzsi
    public final donz j() {
        return this.i;
    }

    @Override // defpackage.xmx
    @dzsi
    public final String k() {
        return this.k;
    }

    @Override // defpackage.xmx
    @dzsi
    public final Integer l() {
        return this.l;
    }

    @Override // defpackage.xmx
    @dzsi
    public final dqea m() {
        return this.m;
    }

    @Override // defpackage.xmx
    @dzsi
    public final doza n() {
        return this.a;
    }

    @Override // defpackage.xmx
    @dzsi
    public final Runnable o() {
        return this.n;
    }

    @Override // defpackage.xmx
    @dzsi
    public final xmw p() {
        return this.q;
    }

    @Override // defpackage.xmx
    public final void q(xmx xmxVar) {
        if (this.d.equals(xmxVar.a())) {
            xmw p = xmxVar.p();
            xmw xmwVar = this.q;
            if ((xmwVar != null && xmwVar.b() != null) || p == null) {
                return;
            }
            this.q = p;
        }
    }
}
