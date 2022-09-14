package defpackage;

import android.app.Application;
import android.content.Context;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import java.util.Collection;
import java.util.List;
/* compiled from: PG */
/* renamed from: arzw  reason: default package */
/* loaded from: classes2.dex */
public final class arzw {
    public static final cqtv a = cqrp.d(48.0d);
    public final Context b;
    private final dxio<bvsl> c;
    private final cqat d;
    private final bvsx e;
    private final bvsw f;
    private final atln g;
    private final int h;

    public arzw(Application application, dxio<bvsl> dxioVar, dxio<amfi> dxioVar2, cqat cqatVar) {
        this.b = application;
        this.c = dxioVar;
        this.d = cqatVar;
        this.e = new bvsx(application.getResources());
        bvsw bvswVar = new bvsw();
        bvswVar.c();
        this.f = bvswVar;
        this.g = new atln(application, dxioVar2);
        this.h = application.getResources().getColor(R.color.navigation_secondary_text);
    }

    private final List<CharSequence> d(atln atlnVar, Collection<amup> collection, int i, int i2) {
        atli atliVar = new atli(this.b, collection.size(), 1, Integer.MAX_VALUE, true, null, true, i2, 1.0f, 1.0f, 1.0f, 0, null, null);
        atlnVar.d(collection, i, false, null, atliVar);
        return atliVar.k();
    }

    public final arzz a(crqf crqfVar) {
        String string;
        arzx arzxVar = new arzx();
        amuo amuoVar = crqfVar.g().b;
        amub amubVar = crqfVar.g().a;
        int b = crqfVar.g().b();
        int i = crqfVar.g().h;
        if (b != -1) {
            String charSequence = bvta.a(this.b, b + (this.d.b() / 1000), amubVar.m(), amubVar.az()).a.toString();
            bvsu c = this.e.c(R.string.ESTIMATED_TIME_OF_ARRIVAL_SHORT);
            c.a(charSequence);
            Spannable c2 = c.c();
            dbsk.s(c2);
            arzxVar.e = c2;
            bvsu c3 = this.e.c(R.string.ARRIVE_AT_TIME);
            c3.a(charSequence);
            Spannable c4 = c3.c();
            dbsk.s(c4);
            arzxVar.f = c4;
            bvsu c5 = this.e.c(R.string.ESTIMATED_TIME_OF_ARRIVAL);
            bvsv a2 = this.e.a(charSequence);
            a2.i();
            c5.a(a2);
            Spannable c6 = c5.c();
            dbsk.s(c6);
            arzxVar.g = c6;
        }
        if (i != -1) {
            Spanned h = this.c.a().h(i, amubVar.I, this.f, null);
            dbsk.s(h);
            arzxVar.b = h;
        }
        arzz a3 = arzxVar.a();
        if (b != -1 && i != -1) {
            Spanned e = bvtb.e(this.b.getResources(), b, bvsz.ABBREVIATED);
            dbsk.s(e);
            arzxVar.c = e;
            bvsu c7 = this.e.c(R.string.DURATION_AND_DISTANCE_TO_DESTINATION);
            c7.a(e, a3.c);
            Spannable c8 = c7.c();
            dbsk.s(c8);
            arzxVar.d = c8;
        }
        if (crqfVar.j) {
            if (amubVar.l() != null) {
                string = amubVar.l().p();
            } else {
                string = this.b.getString(R.string.DA_DESTINATION_REACHED);
            }
            arzxVar.e(string);
            arzxVar.b(string);
        } else if (atlk.a(crqfVar)) {
            String string2 = this.b.getString(atlk.b(crqfVar));
            arzxVar.e(string2);
            arzxVar.b(string2);
        } else if (amuoVar == null) {
            String string3 = this.b.getString(R.string.DA_REROUTING);
            arzxVar.e(string3);
            arzxVar.b(string3);
        } else {
            dowa dowaVar = amubVar.I;
            int i2 = crqfVar.g().e;
            boolean d = crqfVar.d();
            dbsk.s(dowaVar);
            arzx arzxVar2 = new arzx();
            arzxVar2.e(atli.o(this.b, this.c.a(), i2, amuoVar, dowaVar));
            arzxVar2.c(atli.p(this.b, amuoVar));
            arzxVar2.d(atli.l(this.c.a(), i2, dowaVar));
            arzxVar2.b(b(amuoVar, false, d));
            arzxVar2.f(c(amuoVar));
            arzxVar2.h = new arzy(amuoVar, d, a.e(this.b));
            arzz a4 = arzxVar2.a();
            arzxVar.e(a4.b);
            arzxVar.c(a4.i);
            arzxVar.d(a4.j);
            arzxVar.b(a4.k);
            arzxVar.f(a4.l);
            arzxVar.h = a4.m;
            arzz a5 = arzxVar.a();
            if (i != -1) {
                if (b != -1) {
                    bvsu b2 = this.e.b("{0}\n\n{1}\n{2}");
                    b2.a(a5.b, a5.e, a5.h);
                    dbsk.s(b2.c());
                } else {
                    bvsu b3 = this.e.b("{0}\n\n{1}");
                    b3.a(a5.b, a5.c);
                    dbsk.s(b3.c());
                }
            } else if (b == -1) {
                dbsk.s(a5.b);
            } else {
                bvsu b4 = this.e.b("{0}\n\n{1}");
                b4.a(a5.b, a5.h);
                dbsk.s(b4.c());
            }
        }
        String s = amubVar.l().s(this.b.getResources());
        dbsk.s(s);
        arzxVar.a = s;
        return arzxVar.a();
    }

    public final CharSequence b(amuo amuoVar, boolean z, boolean z2) {
        amup j = amux.j(amuoVar);
        if (!z2 || j == null) {
            atll g = atln.g(this.b, amuoVar, 2);
            if (g.a.isEmpty()) {
                return amuoVar.p;
            }
            CharSequence charSequence = (CharSequence) dcft.r(d(this.g, g.a, g.c, this.h), "");
            if (z) {
                return charSequence;
            }
            CharSequence charSequence2 = (CharSequence) dcft.r(d(this.g, g.b, g.d, this.h), "");
            return TextUtils.isEmpty(charSequence2) ? charSequence : TextUtils.concat(charSequence, " ", charSequence2);
        }
        atli n = atli.n(this.b, false, this.h, 1.0f, 1.0f);
        this.g.i(j, true, n);
        return n.k().get(0);
    }

    public final CharSequence c(amuo amuoVar) {
        return b(amuoVar, true, false);
    }
}
