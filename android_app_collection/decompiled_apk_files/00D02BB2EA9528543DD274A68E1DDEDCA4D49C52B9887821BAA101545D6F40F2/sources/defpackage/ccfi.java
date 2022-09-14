package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: ccfi  reason: default package */
/* loaded from: classes4.dex */
public final class ccfi extends afhx {
    public static final dbsl<afga> a;
    private static final dcdn<String, drds> b;
    private static final dcdn<dros, drds> c;
    private static final dcep<String> d;
    private static final Pattern e;
    private final ceet i;
    private final cfrt j;
    private final chnm k;
    private final ccem l;
    private final ccfy m;
    private final eeu n;
    private final akfa o;
    @dzsi
    private final dpyv p;
    private final btvo q;
    private final Uri r;

    static {
        dcdg p = dcdn.p();
        p.f("photos", drds.MEDIA);
        p.f("reviews", drds.REVIEW);
        p.f("edits", drds.FACTUAL_EDIT);
        p.f("lists", drds.PUBLIC_LIST);
        p.f("events", drds.EVENT);
        b = p.b();
        dcdg p2 = dcdn.p();
        p2.f(dros.REVIEWS, drds.REVIEW);
        p2.f(dros.PHOTOS, drds.MEDIA);
        p2.f(dros.FACTUAL_EDITS, drds.FACTUAL_EDIT);
        p2.f(dros.EVENTS, drds.EVENT);
        c = p2.b();
        d = dcep.C("contribute", "todolist");
        e = Pattern.compile("/maps/contrib/?$");
        a = ccfh.a;
    }

    public ccfi(btvo btvoVar, ceet ceetVar, cfrt cfrtVar, chnm chnmVar, ccem ccemVar, ccfy ccfyVar, eeu eeuVar, akfa akfaVar, auhi auhiVar, Intent intent, @dzsi String str) {
        super(intent, str, afid.CREATOR_PROFILE);
        this.q = btvoVar;
        this.n = eeuVar;
        this.i = ceetVar;
        this.j = cfrtVar;
        this.k = chnmVar;
        this.l = ccemVar;
        this.m = ccfyVar;
        this.o = akfaVar;
        this.r = afhg.b(intent);
        Integer l = auhiVar.l(intent);
        this.p = l == null ? null : dpyv.b(l.intValue());
    }

    @Override // defpackage.afhx
    public final void a() {
        drot drotVar;
        Uri uri = this.r;
        if (uri == null) {
            return;
        }
        String e2 = dbsj.e(uri.getPath());
        Matcher matcher = Pattern.compile("/maps/contrib(/.*)?/data=([^/]*)(/.*)?").matcher(e2);
        String str = "";
        String group = !matcher.matches() ? str : matcher.group(2);
        if (group.isEmpty()) {
            drotVar = drot.e;
        } else {
            try {
                drrr drrrVar = ((drrp) new drsp().a(group, drrp.d)).c;
                if (drrrVar == null) {
                    drrrVar = drrr.j;
                }
                drotVar = drrrVar.e;
                if (drotVar == null) {
                    drotVar = drot.e;
                }
            } catch (Exception unused) {
                drotVar = drot.e;
            }
        }
        Matcher matcher2 = Pattern.compile("/maps/contrib(/[0-9]*)?/([a-z]+)(/.*)?").matcher(e2);
        String group2 = !matcher2.matches() ? str : matcher2.group(2);
        dros b2 = dros.b(drotVar.b);
        if (b2 == null) {
            b2 = dros.UNKNOWN_TAB;
        }
        if (!this.i.e() || e.matcher(e2).matches() || d.contains(group2) || (drotVar.a & 16) != 0) {
            this.l.a(this.f, this.g).a();
        } else if (b2.equals(dros.CONTRIBUTE) || b2.equals(dros.TODO_LIST)) {
            this.m.a(this.f, this.g).a();
        } else {
            drds drdsVar = b.get(group2);
            if (drdsVar == null) {
                drdsVar = c.get(b2);
            }
            Matcher matcher3 = Pattern.compile("/maps/contrib/([0-9]+)(/.*)?").matcher(e2);
            if (matcher3.matches()) {
                str = matcher3.group(1);
            }
            btlu j = this.o.j();
            boolean z = false;
            boolean z2 = str.isEmpty() || (j != null && j.d.equals(str));
            boolean booleanQueryParameter = this.r.getBooleanQueryParameter("do_log_in", false);
            this.n.d(this.f.getBooleanExtra("GMM_ENABLE_ONE_BACK_TAP", false));
            if ("stats".equals(group2) && this.q.getCreatorProfileParameters().e) {
                if (this.j.b()) {
                    this.j.a();
                }
                this.k.l(str);
            } else if (drdsVar == null) {
                ceet ceetVar = this.i;
                if (true == z2) {
                    str = null;
                }
                ceetVar.j(str, booleanQueryParameter, this.p);
            } else {
                ceet ceetVar2 = this.i;
                if (true == z2) {
                    str = null;
                }
                if (!z2 && !booleanQueryParameter) {
                    z = true;
                }
                ceer g = cees.g();
                ((ceep) g).a = this.p;
                g.d(true);
                ceetVar2.l(str, drdsVar, z, g.a());
            }
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        if (this.p != null) {
            return durz.EIT_CONTRIBUTION_NOTIFICATION;
        }
        return durz.EIT_CREATOR_PROFILE;
    }
}
