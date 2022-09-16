package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: adjx  reason: default package */
/* loaded from: classes.dex */
public final class adjx extends acwv implements adjj {
    public final adjm d;
    public final snc e;
    public final Executor f;
    private final adjl h;
    private final adgl i;
    private final azqb j;
    private final azqb k;
    private final airw l;
    private final aypf m;
    private adjw n;
    private final adjz o;
    private final adjt p;
    private adjw q;
    public static final String a = zep.a("MDX.ContinueWatchingNotification");
    private static final long g = TimeUnit.HOURS.toMillis(3);
    static final long b = TimeUnit.SECONDS.toMillis(120);
    static final long c = TimeUnit.DAYS.toMillis(3);

    public adjx(adjl adjlVar, adgl adglVar, azqb azqbVar, adjz adjzVar, adjm adjmVar, snc sncVar, azqb azqbVar2, airw airwVar, acxu acxuVar, Executor executor) {
        super(acxuVar);
        this.m = new aypf();
        this.p = new adjt(this);
        this.h = adjlVar;
        this.i = adglVar;
        this.j = azqbVar;
        this.o = adjzVar;
        this.d = adjmVar;
        this.e = sncVar;
        this.k = azqbVar2;
        this.l = airwVar;
        this.f = executor;
    }

    @Override // defpackage.acxq
    public final ankt a() {
        return anii.h(this.d.a(), adch.j, anjk.a);
    }

    @Override // defpackage.acxq
    public final String b() {
        return "continue-watching";
    }

    @Override // defpackage.acxq
    public final void c(final amuk amukVar) {
        anlz.A(anii.h(anii.i(anko.q(this.d.a()), new anir() { // from class: adjq
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                adjx adjxVar = adjx.this;
                if (!((Boolean) obj).booleanValue()) {
                    return anlz.q(null);
                }
                return anii.h(((vne) adjxVar.d.a.get()).a(), adch.g, anjk.a);
            }
        }, anjk.a), new ampg() { // from class: adjp
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                final adjx adjxVar = adjx.this;
                final amuk amukVar2 = amukVar;
                final String str = (String) obj;
                if (!amps.e(str)) {
                    ylx.k(adjxVar.d.b(), adjxVar.f, new ylv() { // from class: adjn
                        @Override // defpackage.zdt
                        /* renamed from: b */
                        public final void a(Throwable th) {
                            adjx adjxVar2 = adjx.this;
                            amuk amukVar3 = amukVar2;
                            String str2 = str;
                            zep.d("Failed to red the lastTimeShownTimestamp from disk.", th);
                            adjxVar2.j(amukVar3, str2, 0L);
                        }
                    }, new ylw() { // from class: adjo
                        @Override // defpackage.ylw, defpackage.zdt
                        public final void a(Object obj2) {
                            adjx.this.j(amukVar2, str, ((Long) obj2).longValue());
                        }
                    });
                    return null;
                }
                return null;
            }
        }, anjk.a), new adjr(), anjk.a);
    }

    @Override // defpackage.acxq
    public final void d() {
        e();
    }

    @Override // defpackage.adjj
    public final void e() {
        this.h.d.d("continue-watching", 6);
        ylx.m(this.d.c(), acsn.u);
    }

    @Override // defpackage.adjj
    public final void f() {
        ylr.c();
        if (this.q == null) {
            adjw adjwVar = new adjw(this, 1);
            this.q = adjwVar;
            this.m.g(adjwVar.g(this.l));
        }
        if (this.n == null) {
            adjw adjwVar2 = new adjw(this);
            this.n = adjwVar2;
            this.m.g(adjwVar2.g(this.l));
        }
    }

    @Override // defpackage.adjj
    public final void g() {
        ylr.c();
        if (this.q != null) {
            this.m.c();
            this.q = null;
        }
    }

    @Override // defpackage.adjj
    public final void i() {
        long j;
        ajbf n;
        PlayerResponseModel c2;
        try {
            j = ((Long) ylx.e(this.d.b(), adch.k, 1L, TimeUnit.SECONDS)).longValue();
        } catch (Exception unused) {
            j = 0;
        }
        if (((Boolean) this.k.get()).booleanValue() || j == 0 || this.e.c() - j >= c) {
            Boolean bool = false;
            try {
                bool = (Boolean) ylx.e(anii.h(((vne) this.d.a.get()).a(), adch.d, anjk.a), adch.k, 1L, TimeUnit.SECONDS);
            } catch (Exception unused2) {
            }
            if (bool.booleanValue()) {
                return;
            }
            adjz adjzVar = this.o;
            adeo adeoVar = adjzVar.b;
            Context context = adjzVar.a;
            List a2 = adeoVar.a();
            int i = 1;
            bhc bhcVar = a2.size() != 1 ? null : (bhc) a2.get(0);
            if (bhcVar == null || (n = ((airr) this.j.get()).n()) == null || (c2 = n.c()) == null) {
                return;
            }
            long h = ((airr) this.j.get()).h();
            long b2 = n.b();
            long j2 = h - b2;
            String valueOf = String.valueOf(((airr) this.j.get()).q());
            if (valueOf.length() != 0) {
                "videoId:".concat(valueOf);
            }
            String valueOf2 = String.valueOf(((airr) this.j.get()).p());
            if (valueOf2.length() != 0) {
                "playlistId:".concat(valueOf2);
            }
            String valueOf3 = String.valueOf(((airr) this.j.get()).p());
            if (valueOf3.length() != 0) {
                "playlistIndex:".concat(valueOf3);
            }
            if (j2 < b) {
                return;
            }
            String str = bhcVar.d;
            acxj a3 = acxk.a();
            a3.b(str);
            a3.c(bhcVar.c);
            if (this.i.f(bhcVar)) {
                i = 2;
            } else {
                int q = adig.q(bhcVar.q);
                if (q != 0) {
                    i = q;
                }
            }
            a3.e(i);
            adnk c3 = adnl.c();
            c3.f(((airr) this.j.get()).q());
            c3.b(b2);
            c3.d(((airr) this.j.get()).p());
            c3.e(((airr) this.j.get()).g());
            a3.a = c3.a();
            acxk a4 = a3.a();
            adjl adjlVar = this.h;
            String A = c2.A();
            aalc b3 = c2.b();
            adjt adjtVar = this.p;
            Resources resources = adjlVar.a.getResources();
            aalb b4 = b3.b(resources.getDimensionPixelSize(R.dimen.notification_big_picture_icon_width), resources.getDimensionPixelSize(R.dimen.notification_big_picture_icon_height));
            if (b4 == null) {
                return;
            }
            adjlVar.c.l(b4.a(), new adjk(adjlVar, resources, A, str, a4, adjtVar));
        }
    }

    public final void j(amuk amukVar, String str, long j) {
        int size = amukVar.size();
        for (int i = 0; i < size; i++) {
            if (adgl.c(str, ((bhc) amukVar.get(i)).c) && this.e.c() - j < g) {
                return;
            }
        }
        e();
    }
}
