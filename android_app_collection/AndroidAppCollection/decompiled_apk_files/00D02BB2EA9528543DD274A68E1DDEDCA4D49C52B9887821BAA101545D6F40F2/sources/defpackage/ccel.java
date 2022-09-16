package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: ccel  reason: default package */
/* loaded from: classes4.dex */
public final class ccel extends afhx {
    public static final dbsl<afga> d;
    private static final dcdn<String, dkcp> e;
    private static final dcdn<String, String> i;
    private static final dcdn<dros, String> j;
    public final eeu a;
    public final akfa b;
    public final akfc c;
    private final cafi k;
    private final gga l;
    private final bvjj m;
    private final auhi n;
    private final bvrb o;
    private final cjqy p;
    @dzsi
    private final Integer q;
    @dzsi
    private final dpyv r;
    private final Uri s;

    static {
        dcdg p = dcdn.p();
        p.f("photos", dkcp.PHOTO);
        p.f("reviews", dkcp.REVIEW);
        p.f("contributions", dkcp.CONTRIBUTE);
        p.f("edits", dkcp.EDIT);
        p.f("lists", dkcp.PUBLIC_LIST);
        p.f("events", dkcp.EVENTS);
        e = p.b();
        i = dcdn.k("todolist", "PLACES_YOU_VISITED");
        j = dcdn.o(dros.PHOTOS, "photos", dros.REVIEWS, "reviews", dros.CONTRIBUTE, "contributions", dros.FACTUAL_EDITS, "edits", dros.TODO_LIST, "todolist");
        d = ccej.a;
    }

    public ccel(cafi cafiVar, gga ggaVar, eeu eeuVar, akfa akfaVar, akfc akfcVar, bvjj bvjjVar, auhi auhiVar, bvrb bvrbVar, cjqy cjqyVar, Intent intent, @dzsi String str) {
        super(intent, str, afid.CONTRIBUTION_PAGE);
        this.l = ggaVar;
        this.a = eeuVar;
        this.k = cafiVar;
        this.b = akfaVar;
        this.c = akfcVar;
        this.m = bvjjVar;
        this.n = auhiVar;
        this.o = bvrbVar;
        this.p = cjqyVar;
        this.s = afhg.b(intent);
        Integer l = auhiVar.l(intent);
        this.q = l;
        this.r = l == null ? null : dpyv.b(l.intValue());
    }

    @dzsi
    private static drot e(String str) {
        Matcher matcher = Pattern.compile("/maps/contrib/[0-9]*/data=([^/]*)(/.*)?").matcher(str);
        String group = !matcher.matches() ? null : matcher.group(1);
        if (group != null) {
            try {
                drrp drrpVar = (drrp) new drsp().a(group, drrp.d);
                if (drrpVar != null) {
                    drrr drrrVar = drrpVar.c;
                    if (drrrVar == null) {
                        drrrVar = drrr.j;
                    }
                    drot drotVar = drrrVar.e;
                    return drotVar == null ? drot.e : drotVar;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // defpackage.afhx
    public final void a() {
        String str;
        Uri uri = this.s;
        if (uri == null) {
            return;
        }
        Matcher matcher = Pattern.compile("/maps/contrib/([0-9]*)(/.*)?").matcher(uri.getPath());
        droq droqVar = null;
        String group = !matcher.matches() ? null : matcher.group(1);
        drot e2 = e(this.s.getPath());
        if (e2 == null) {
            str = null;
        } else {
            dros b = dros.b(e2.b);
            if (b == null) {
                b = dros.UNKNOWN_TAB;
            }
            str = j.get(b);
        }
        if (str == null) {
            Matcher matcher2 = Pattern.compile("/maps/contrib/[0-9]*/([a-z]+).*").matcher(this.s.getPath());
            str = !matcher2.matches() ? null : matcher2.group(1);
        }
        drot e3 = e(this.s.getPath());
        if (e3 != null && (e3.a & 16) != 0 && (droqVar = e3.d) == null) {
            droqVar = droq.c;
        }
        if (!dbsj.d(this.s.getQueryParameter("do_log_in"))) {
            if (group == null) {
                return;
            }
            btlu j2 = this.b.j();
            if (j2 == null || !j2.d.equals(group)) {
                this.c.f(group, new ccek(this, group, str, droqVar));
                return;
            }
        }
        this.a.d(this.f.getBooleanExtra("GMM_ENABLE_ONE_BACK_TAP", false));
        if (this.f.getBooleanExtra("homescreen_shortcut", false)) {
            this.p.i(cjtd.a(dtyi.ag));
        }
        d(group, str, droqVar);
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        if (this.r != null) {
            return durz.EIT_CONTRIBUTION_NOTIFICATION;
        }
        return durz.EIT_CONTRIBUTION_PAGE;
    }

    public final void d(@dzsi String str, @dzsi String str2, @dzsi droq droqVar) {
        dcdn<String, String> dcdnVar = i;
        if (dcdnVar.containsKey(str2)) {
            this.k.m(dcdnVar.get(str2));
        } else {
            this.k.j(str, e.get(str2), droqVar);
        }
        if (this.r != null) {
            avac.bp(this.l, this.q, this.m, this.o, this.n);
        }
    }
}
