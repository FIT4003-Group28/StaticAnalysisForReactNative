package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigationbar.NavigationBarDividerLayout;
import com.google.android.apps.youtube.app.common.util.AccessibilityStateReceiver;
import com.google.android.apps.youtube.app.ui.pivotbar.PivotBar;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.android.libraries.youtube.account.identity.C$AutoValue_AccountIdentity;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;
import com.google.android.youtube.R;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: oie  reason: default package */
/* loaded from: classes3.dex */
public final class oie extends oif implements fub, fqf, oke, amau, ynl {
    public boolean A;
    public axnm B;
    public ViewGroup C;
    public axnm D;
    public azqb E;
    public fud F;
    public azqb G;
    public alaz H;
    public azqb I;

    /* renamed from: J  reason: collision with root package name */
    public xli f237J;
    public fbw K;
    public azqb L;
    public azqb M;
    public azqb N;
    public azqb O;
    public niw P;
    public azqb Q;
    public ofu R;
    public azqb S;
    public lmp T;
    public aiii U;
    public ooa V;
    public azqb W;
    public azqb X;
    public ltn Y;
    public AccessibilityStateReceiver Z;
    public final WatchWhileActivity a;
    public lpt aA;
    public yzm aB;
    public lrw aC;
    public ltt aD;
    public adbv aE;
    public ofx aF;
    public adni aG;
    public Set aH;
    public ojy aI;
    public gfu aJ;
    public gfr aK;
    public ajgz aL;
    public yxe aM;
    public eys aN;
    public egc aO;
    public azqb aP;
    public axnm aQ;
    public oji aR;
    public final efz aS;
    public final ywk aT;
    public final yni aU;
    public final yxd aV;
    public boolean aW;
    public lnj aX;
    public final aacz aY;
    public sdb aZ;
    public azqb aa;
    public lrt ab;
    public ScheduledExecutorService ac;
    public ayor ad;
    public egi ae;
    public lmj af;
    public azqb ag;
    public fpt ah;
    public evn ai;
    public aggb aj;
    public axnm ak;
    public oje al;
    public nio am;
    public oiw an;
    public ojl ao;
    public ojx ap;
    public ojq aq;
    public oiy ar;
    public oio as;
    public ojz at;
    public ojg au;
    public ois av;
    public nub aw;
    public oik ax;
    public nfk ay;
    public ojv az;
    public long b;
    public ise ba;
    public ehi bb;
    private final aadd bd;
    private final ykv be;
    private final gfs bf;
    private final alzn bg;
    private final whe bh;
    private final boolean bi;
    public fqd c;
    public SharedPreferences d;
    public String e;
    public azqb f;
    public feu g;
    public akkm h;
    public wwk i;
    public wxc j;
    public ajxq k;
    public okf l;
    public fqh m;
    public mer n;
    public luf o;
    public fyg p;
    public axnm q;
    public fsd r;
    public oah s;
    public ybq t;
    public aafo u;
    public azqb v;
    public azqb w;
    public axnm x;
    public ojm y;
    public boolean z;

    public oie(WatchWhileActivity watchWhileActivity, aacz aaczVar, aadd aaddVar, ykv ykvVar, efz efzVar, ywk ywkVar, gfu gfuVar, final snc sncVar, yni yniVar, alzn alznVar, whe wheVar) {
        uyw uywVar = uyw.a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = true;
        if (uwp.j() && uywVar.c > 0 && elapsedRealtime <= SystemClock.elapsedRealtime() && ((uywVar.n.b == null || elapsedRealtime <= uywVar.n.b.longValue()) && uywVar.f == 0)) {
            uywVar.f = elapsedRealtime;
            uywVar.m.f = true;
        }
        watchWhileActivity.addOnContextAvailableListener(new abv() { // from class: ohw
            @Override // defpackage.abv
            public final void a(Context context) {
                oie.this.b = sncVar.d();
            }
        });
        this.a = watchWhileActivity;
        this.aY = aaczVar;
        this.bd = aaddVar;
        this.be = ykvVar;
        this.aS = efzVar;
        this.aT = ywkVar;
        this.aU = yniVar;
        gfs a = gfuVar.a();
        this.bf = a;
        this.bg = alznVar;
        this.bh = wheVar;
        if (!ambj.c()) {
            Intent intent = watchWhileActivity.getIntent();
            if (!intent.hasCategory("android.intent.category.LAUNCHER") && (intent.getFlags() & 268468224) == 0 && intent.getExtras() != null && !intent.getExtras().isEmpty()) {
                ((amzw) ((amzw) ambj.a.g()).i("com/google/apps/tiktok/account/api/controller/Config", "forLauncherActivity", 58, "Config.java")).s("Launcher config used on invalid activity: %s", watchWhileActivity.getClass());
            }
        }
        ambi a2 = ambj.a();
        a2.c(true);
        a2.b(whh.class);
        alznVar.a(a2.a()).c(this);
        watchWhileActivity.supportRequestWindowFeature(9);
        boolean ax = eog.ax(aaczVar);
        boolean X = eog.X(aaddVar.a());
        gfs gfsVar = gfs.LIGHT;
        int ordinal = a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (X && ax) {
                    watchWhileActivity.setTheme(2132083891);
                } else if (X) {
                    watchWhileActivity.setTheme(2132083890);
                } else if (ax) {
                    watchWhileActivity.setTheme(2132083892);
                } else {
                    watchWhileActivity.setTheme(2132083889);
                }
            }
        } else if (X && ax) {
            watchWhileActivity.setTheme(2132083906);
        } else if (X) {
            watchWhileActivity.setTheme(2132083905);
        } else if (ax) {
            watchWhileActivity.setTheme(2132083907);
        } else {
            watchWhileActivity.setTheme(2132083904);
        }
        h();
        z = (ywkVar.c(ywk.E) & 4194304) == 0 ? false : z;
        this.bi = z;
        this.aV = z ? efzVar.h : null;
    }

    public final void A() {
        asxj asxjVar = this.K.b.b().e;
        if (asxjVar == null) {
            asxjVar = asxj.a;
        }
        if (asxjVar.cl) {
            ((jgz) this.L.get()).a();
        }
    }

    public final void C() {
        AccountIdentity accountIdentity;
        String string;
        this.y.a(false);
        if (this.ao.n() == null && !this.aZ.a) {
            ojl ojlVar = this.ao;
            ise iseVar = this.ba;
            Bundle a = PaneDescriptor.a();
            a.putInt("network_connectivity_requirement", 1);
            ojlVar.r(new PaneDescriptor(iseVar.a, a), 2);
        }
        h();
        ojx ojxVar = this.ap;
        String d = ojxVar.d.c().d();
        String str = ojxVar.m;
        boolean z = str != null && !str.equals(d);
        ojxVar.m = d;
        if (!ojxVar.d(z, null)) {
            wai waiVar = ojxVar.e;
            if (!waiVar.a.t()) {
                wac wacVar = waiVar.a;
                if (wacVar instanceof vzv) {
                    vzv vzvVar = (vzv) wacVar;
                    if (vzvVar.e() == 1) {
                        if (vzvVar.e() != 1 || (string = vzvVar.a.getString(vzx.ACCOUNT_NAME, null)) == null) {
                            accountIdentity = null;
                        } else {
                            String string2 = vzvVar.a.getString(vzx.PAGE_ID, null);
                            StringBuilder sb = new StringBuilder();
                            sb.append(string);
                            if (string2 != null) {
                                sb.append(":");
                                sb.append(string2);
                            }
                            String sb2 = sb.toString();
                            if (true == "No +Page Delegate".equals(string2)) {
                                string2 = "";
                            }
                            accountIdentity = AccountIdentity.n(sb2, string, string2, null);
                        }
                        if (accountIdentity != null) {
                            waiVar.c.a(accountIdentity, new wah(accountIdentity, new wae(waiVar, accountIdentity)), ((C$AutoValue_AccountIdentity) accountIdentity).b, 6);
                        }
                    }
                }
            }
            ojxVar.l = 0;
            ((frv) ojxVar.k.get()).j();
            if (!eog.aP(ojxVar.o)) {
                ojxVar.c.c(ojxVar.a, null, null);
            } else {
                ((ecd) ojxVar.i.get()).e();
            }
        }
        if (ojxVar.e.a()) {
            wai waiVar2 = ojxVar.e;
            if (waiVar2.a()) {
                AccountIdentity accountIdentity2 = (AccountIdentity) waiVar2.a.c();
                String d2 = accountIdentity2.d();
                String a2 = accountIdentity2.a();
                waiVar2.c.a(AccountIdentity.t(a2), new wag(d2, new waf(waiVar2)), a2, 6);
            }
        }
        final wai waiVar3 = ojxVar.e;
        if (waiVar3.a.t()) {
            waiVar3.e.execute(new Runnable() { // from class: wad
                @Override // java.lang.Runnable
                public final void run() {
                    wai waiVar4 = wai.this;
                    afvm c = waiVar4.a.c();
                    if (c instanceof AccountIdentity) {
                        try {
                            if (whp.c(((AccountIdentity) c).a(), waiVar4.f.h())) {
                                return;
                            }
                            waiVar4.g.l("Current signed in account not available on device anymore", false);
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
        if (ojxVar.d.c().g()) {
            asxp asxpVar = ojxVar.h.a().e;
            if (asxpVar == null) {
                asxpVar = asxp.a;
            }
            if (asxpVar.o) {
                ojxVar.f.e(null);
            }
        }
        ojxVar.j.a();
        String str2 = (String) this.f.get();
        boolean f = akzj.f(this.e, str2);
        this.e = str2;
        if (!f) {
            this.ao.k();
        }
        ((frv) this.q.get()).j();
        this.c.e();
        h();
        ojq ojqVar = this.aq;
        ((izm) ojqVar.n.get()).e();
        ezu ezuVar = ojqVar.C;
        if (ezuVar != null) {
            ojqVar.g(ezuVar);
        }
    }

    public final void D() {
        ((frv) this.q.get()).o();
    }

    public final boolean E() {
        return this.y.b();
    }

    @Override // defpackage.oke
    public final void F() {
        this.ao.a.w();
    }

    public final void G() {
        this.r.a();
    }

    @Override // defpackage.amau
    public final void a(amas amasVar) {
        this.bh.b(2, 2, 2);
    }

    @Override // defpackage.amau
    public final void b(Throwable th) {
        if ((th instanceof alzz) && (th.getCause() instanceof whi)) {
            this.bh.b(2, 3, 8);
            this.bg.b(amuk.r(whh.class));
        }
        if (th instanceof alzy) {
            this.bh.b(2, 3, 9);
            this.bg.b(amuk.r(whh.class));
        }
        if (th instanceof amaa) {
            afus.c(2, 25, "[Clockwork][WatchWhileActivityPeer] onAccountError()", th);
            final whe wheVar = this.bh;
            wheVar.c.execute(new Runnable() { // from class: whd
                @Override // java.lang.Runnable
                public final void run() {
                    int i;
                    whe wheVar2 = whe.this;
                    afvm c = wheVar2.a.c();
                    amuk w = wheVar2.b.w();
                    if ("youtube-direct".equals(wey.b(c))) {
                        amxx amxxVar = (amxx) w;
                        int i2 = amxxVar.c;
                        boolean z = false;
                        for (int i3 = 0; i3 < i2; i3++) {
                            z |= c.b().equals(((ambp) w.get(i3)).c);
                        }
                        if (z) {
                            i = 13;
                        } else if (w.isEmpty()) {
                            i = 10;
                        } else {
                            i = amxxVar.c == 1 ? 11 : 12;
                        }
                    } else if ("youtube-delegated".equals(wey.b(c))) {
                        i = 14;
                    } else {
                        i = "youtube-incognito".equals(wey.b(c)) ? 15 : 16;
                    }
                    wheVar2.b(2, 3, i);
                }
            });
        }
        this.bh.c(2, th);
    }

    @Override // defpackage.amau
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.amau
    public final /* synthetic */ void d() {
        answ.m(this);
    }

    @Override // defpackage.fqf
    public final void e(int i) {
        if (this.z) {
            return;
        }
        this.F.h(i);
        this.p.h(0, i);
        this.R.s(0, -i);
        ViewGroup viewGroup = this.C;
        if (viewGroup != null && viewGroup.getPaddingBottom() != i) {
            ViewGroup viewGroup2 = this.C;
            viewGroup2.setPadding(viewGroup2.getPaddingLeft(), this.C.getPaddingTop(), this.C.getPaddingRight(), i);
        }
        ((izm) this.D.get()).f(i);
    }

    public final acti g() {
        return this.aq.i() ? this.aq.m : this.ao.i() != null ? this.ao.h().oi() : acti.l;
    }

    public final void h() {
        this.be.a();
    }

    public final void i() {
        if (this.bf != this.aJ.a()) {
            Handler handler = new Handler(Looper.getMainLooper());
            final WatchWhileActivity watchWhileActivity = this.a;
            watchWhileActivity.getClass();
            handler.postAtFrontOfQueue(new Runnable() { // from class: ohy
                @Override // java.lang.Runnable
                public final void run() {
                    WatchWhileActivity.this.recreate();
                }
            });
        }
    }

    public final void j() {
        for (fkp fkpVar : fkp.a.keySet()) {
            fkpVar.a();
        }
        ((ltu) this.v.get()).h();
        ((ltu) this.w.get()).h();
        this.aX.a();
        this.aj.a();
    }

    public final void k() {
        this.F.d((BottomUiContainer) this.a.findViewById(R.id.bottom_ui_container));
        this.F.i(this);
        final fqh fqhVar = this.m;
        View findViewById = this.a.findViewById(R.id.bottom_bar_container);
        findViewById.getClass();
        fqhVar.b = findViewById;
        fqhVar.b.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: fqg
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                fqh fqhVar2 = fqh.this;
                int i9 = i4 - i2;
                if (i9 == i8 - i6 || fqhVar2.b == null) {
                    return;
                }
                for (fqf fqfVar : fqhVar2.a) {
                    fqfVar.e(i9);
                }
            }
        });
        this.m.a(this);
        ezv.q(this.a, true);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ewc ewcVar = (ewc) obj;
                if (!this.A) {
                    return null;
                }
                this.a.getWindow().getDecorView().requestLayout();
                this.A = false;
                return null;
            } else if (i == 1) {
                isy isyVar = (isy) obj;
                auuz auuzVar = isyVar.b().b;
                if (auuzVar == null) {
                    auuzVar = auuz.a;
                }
                if ((auuzVar.b & 1) == 0) {
                    return null;
                }
                WatchWhileActivity watchWhileActivity = this.a;
                auuz auuzVar2 = isyVar.b().b;
                if (auuzVar2 == null) {
                    auuzVar2 = auuz.a;
                }
                aqft aqftVar = auuzVar2.c;
                if (aqftVar == null) {
                    aqftVar = aqft.a;
                }
                ajgx.m(watchWhileActivity, aqftVar, this.u, g(), this.aL);
                return null;
            } else if (i == 2) {
                ypy ypyVar = (ypy) obj;
                ((frv) this.q.get()).j();
                return null;
            } else if (i == 3) {
                afwd afwdVar = (afwd) obj;
                this.F.c(true);
                return null;
            } else if (i == 4) {
                if (!((ahgk) obj).a()) {
                    return null;
                }
                ip.d(this.a, ((iz) this.N.get()).c);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ewc.class, isy.class, ypy.class, afwd.class, ahgk.class};
    }

    public final void l() {
        this.f237J.i = new oib(this);
    }

    public final void m() {
        fyg fygVar = this.p;
        View findViewById = this.a.findViewById(R.id.accessibility_layer_container);
        FloatingActionButton floatingActionButton = (FloatingActionButton) this.a.findViewById(R.id.fab);
        if (fygVar.l) {
            return;
        }
        fygVar.l = true;
        aqxo.y(zag.s(findViewById, floatingActionButton));
        fygVar.i = new fxw(fygVar.a, floatingActionButton, fygVar);
        fygVar.j = new fyj(floatingActionButton, findViewById, fygVar);
        floatingActionButton.getClass();
        fygVar.d = floatingActionButton;
        fygVar.d.setOnClickListener(fygVar);
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(fygVar.d, PropertyValuesHolder.ofFloat(View.SCALE_X, 1.0f), PropertyValuesHolder.ofFloat(View.SCALE_Y, 1.0f)).setDuration(150L);
        duration.addListener(new fyd(fygVar));
        fygVar.g = duration;
        ObjectAnimator duration2 = ObjectAnimator.ofPropertyValuesHolder(fygVar.d, PropertyValuesHolder.ofFloat(View.SCALE_X, 0.0f), PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.0f)).setDuration(150L);
        duration2.addListener(new fye(fygVar));
        fygVar.h = duration2;
        fygVar.e();
    }

    public final void n() {
        ois oisVar = this.av;
        oisVar.b = oisVar.a.getWindow().getAttributes().softInputMode;
        oisVar.c = true;
    }

    public final void o() {
        this.l.f(this);
        PivotBar pivotBar = (PivotBar) this.a.findViewById(R.id.pivot_bar);
        pivotBar.g = this.n;
        this.l.j(pivotBar);
    }

    public final void p() {
        lrt lrtVar = this.ab;
        lrtVar.b.addObserver(lrtVar.f);
    }

    public final void q() {
        this.a.setDefaultKeyMode(0);
    }

    public final void r() {
        ((akge) this.a.p.get()).g(this.a.findViewById(16908290));
    }

    public final void s() {
        this.a.setContentView((View) this.B.get());
        this.aB.h((View) this.B.get(), 7);
        this.a.findViewById(R.id.slim_status_bar_player_container).setBackground(this.ax.a);
        View findViewById = ((ViewGroup) this.B.get()).findViewById(R.id.next_gen_watch_container_layout);
        WatchWhileActivity watchWhileActivity = this.a;
        watchWhileActivity.getClass();
        AccessibilityLayerLayout m = ezv.m(watchWhileActivity);
        if (m != null) {
            if (findViewById == null || !zag.s(m, findViewById)) {
                m.b(false);
            } else {
                m.a = findViewById.getId();
                m.c = findViewById;
                m.b(true);
            }
        }
        this.a.getWindow().setBackgroundDrawable(null);
        final oje ojeVar = this.al;
        if (!ojeVar.h) {
            ojeVar.h = true;
            ojeVar.d.b = (NavigationBarDividerLayout) ojeVar.a.findViewById(R.id.navigation_bar_divider_frame);
            gbw gbwVar = ojeVar.d;
            if (gbw.a) {
                ojeVar.f.f(new Callable() { // from class: ojd
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final oje ojeVar2 = oje.this;
                        return ayoi.p(ojeVar2.c.h(), ojeVar2.b.h().af(oav.j), ((nfk) ojeVar2.e.get()).d(), ojeVar2.i.a, ojc.a).as(new ayqb() { // from class: ojb
                            @Override // defpackage.ayqb
                            public final void a(Object obj) {
                                oje ojeVar3 = oje.this;
                                ftf ftfVar = ftf.ACTIVITY_DEFAULT;
                                int ordinal = ((ftf) obj).ordinal();
                                if (ordinal != 0) {
                                    if (ordinal != 1) {
                                        return;
                                    }
                                    if (eog.V(ojeVar3.g.a())) {
                                        ojeVar3.d.b(ojeVar3.a, 2132083233);
                                    } else {
                                        ojeVar3.d.b(ojeVar3.a, 2132083232);
                                    }
                                } else if (eog.V(ojeVar3.g.a())) {
                                    gfu I = ((gfv) antz.u(ojeVar3.a, gfv.class)).I();
                                    if (I.a() == gfs.LIGHT) {
                                        ojeVar3.d.b(ojeVar3.a, 2132083236);
                                    } else if (I.a() != gfs.DARK) {
                                    } else {
                                        ojeVar3.d.b(ojeVar3.a, 2132083233);
                                    }
                                } else {
                                    gbw gbwVar2 = ojeVar3.d;
                                    Activity activity = ojeVar3.a;
                                    if (!gbw.a) {
                                        return;
                                    }
                                    TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(null, gbx.b, R.attr.navigationBarStyle, R.style.NavigationBar);
                                    gbwVar2.a(obtainStyledAttributes);
                                    obtainStyledAttributes.recycle();
                                }
                            }
                        });
                    }
                });
            }
        }
        lpt lptVar = this.aA;
        nfk nfkVar = this.ay;
        lptVar.c = (View) this.B.get();
        lptVar.d = nfkVar;
        WatchWhileActivity watchWhileActivity2 = this.a;
        View view = (View) this.B.get();
        view.getViewTreeObserver().addOnPreDrawListener(new oid(watchWhileActivity2, view));
    }

    public final void t(Bundle bundle, long j) {
        evn evnVar = this.ai;
        if (bundle != null) {
            evnVar.b();
        } else {
            evnVar.a.d(new exf(j));
        }
    }

    public final /* synthetic */ void u() {
        super.x();
    }

    public final /* synthetic */ void v() {
        super.y();
    }

    public final void w() {
        oeu oeuVar;
        nml nmlVar;
        oiy oiyVar = this.ar;
        if (!((nfz) oiyVar.b.get()).e() && !oiyVar.b().k()) {
            if (oiyVar.h.j()) {
                mrx mrxVar = oiyVar.h;
                if (mrxVar.e) {
                    mrxVar.a();
                    return;
                }
            }
            oa oaVar = oiyVar.a;
            if (oaVar instanceof okb) {
                View findViewById = ((okb) oaVar).findViewById(R.id.mdx_drawer_layout);
                if (findViewById instanceof izc) {
                    izc izcVar = (izc) findViewById;
                    if (izcVar.a().a()) {
                        izcVar.c();
                        return;
                    }
                }
            }
            oiyVar.p.a();
            boolean z = oiyVar.n;
            ezx g = oiyVar.g.g();
            if (g.g()) {
                ((ahso) oiyVar.c.get()).c();
            } else if (g == ezx.WATCH_WHILE_MAXIMIZED && (oeuVar = oiyVar.d.a) != null && (nmlVar = ((DefaultWatchPanelViewController) oeuVar).e) != null && nmlVar.y()) {
                nmlVar.m();
            } else if (g.i() && z) {
                oiyVar.a.finish();
            } else if (g.b()) {
                oiyVar.f.j(true);
            } else if (g == ezx.WATCH_WHILE_MAXIMIZED) {
                oiyVar.f.m(true);
            } else {
                gbd i = oiyVar.c().i();
                if (i != null && i.bc()) {
                    return;
                }
                if (oiyVar.n) {
                    oiyVar.a.finish();
                    return;
                }
                int i2 = oiyVar.c().j;
                oiyVar.c().p(4);
                boolean F = oiyVar.i.F();
                oiyVar.c().j = i2;
                if (F) {
                    return;
                }
                if (!oiyVar.j.l()) {
                    ylx.n(oiyVar.a, oiyVar.j.g(((jwi) oiyVar.o.get()).aT, oiyVar.g.g()), new oix(oiyVar), new oix(oiyVar, 1));
                    return;
                }
                oiyVar.j.h();
                oiyVar.d();
            }
        }
    }

    @Override // defpackage.oif
    public final void x() {
        yxd yxdVar;
        this.aM.h(4);
        try {
            if (!this.bi || (yxdVar = this.aV) == null) {
                this.aw.i(this.aW);
                this.aW = false;
                this.ai.c();
                super.x();
                if (!ggs.i()) {
                    B();
                }
                this.j.a();
                this.aq.v();
            } else {
                ayor ayorVar = this.ad;
                yxc b = yxd.b(6);
                b.a("bfa", new ohx(this, 8));
                yxdVar.n(ayorVar, b);
                this.aW = false;
                yxd yxdVar2 = this.aV;
                ayor ayorVar2 = this.ad;
                yxc b2 = yxd.b(6);
                b2.a("ior", new ohx(this, 9));
                b2.a("sor", new ohx(this, 10));
                b2.c("ros", new ohz(this, 6), true ^ ggs.i());
                b2.a("cdb", new ohx(this, 11));
                b2.a("wpr", new ohx(this, 12));
                yxdVar2.n(ayorVar2, b2);
            }
        } finally {
            this.aM.d(4);
        }
    }

    @Override // defpackage.oif
    public final void y() {
        yxe yxeVar;
        Intent a;
        yxd yxdVar;
        Intent a2;
        this.aM.h(3);
        try {
            if (!this.bi || (yxdVar = this.aV) == null) {
                this.aw.i(this.aW);
                this.ai.d();
                h();
                super.y();
                h();
                if (eog.af(this.aY) != 1 || (a = this.aO.a(this.a)) == null) {
                    Intent b = this.ae.b(null);
                    if (b != null) {
                        ((airr) this.M.get()).K();
                        this.a.startActivity(b);
                        if (egi.a(b)) {
                            this.a.finish();
                            yxeVar = this.aM;
                        }
                    }
                    fyn.a();
                    if (ggs.i()) {
                        B();
                        C();
                    }
                    yxeVar = this.aM;
                } else {
                    ((airr) this.M.get()).K();
                    this.a.startActivity(a);
                    this.a.finish();
                    yxeVar = this.aM;
                }
            } else {
                ayor ayorVar = this.ad;
                yxc b2 = yxd.b(6);
                b2.a("bfa", new ohx(this, 13));
                b2.a("ios", new ohx(this, 14));
                b2.a("bcf", new ohx(this, 20));
                b2.a("sos", new ohx(this, 15));
                b2.a("bcf", new ohx(this, 20));
                yxdVar.n(ayorVar, b2);
                if (eog.af(this.aY) != 1 || (a2 = this.aO.a(this.a)) == null) {
                    Intent b3 = this.ae.b(null);
                    if (b3 != null) {
                        ((airr) this.M.get()).K();
                        this.a.startActivity(b3);
                        if (egi.a(b3)) {
                            this.a.finish();
                            yxeVar = this.aM;
                        }
                    }
                    yxd yxdVar2 = this.aV;
                    ayor ayorVar2 = this.ad;
                    yxc b4 = yxd.b(6);
                    b4.a("ftr", qvl.b);
                    b4.c("ros", new ohz(this, 6), ggs.i());
                    b4.c("rfs", new ohz(this, 7), ggs.i());
                    yxdVar2.n(ayorVar2, b4);
                    yxeVar = this.aM;
                } else {
                    ((airr) this.M.get()).K();
                    this.a.startActivity(a2);
                    this.a.finish();
                    yxeVar = this.aM;
                }
            }
            yxeVar.d(3);
        } catch (Throwable th) {
            this.aM.d(3);
            throw th;
        }
    }

    public final void z() {
        this.y.a(true);
        lrw lrwVar = this.aC;
        if (lrwVar.e) {
            lrwVar.a.unregisterReceiver(lrwVar);
            lrwVar.e = false;
        }
        ojq ojqVar = this.aq;
        ojqVar.x.c();
        ojqVar.j.m(ojqVar.c);
        if (!eog.aq(ojqVar.E)) {
            ojqVar.j.m(ojqVar.D);
        }
        ojqVar.j.m(ojqVar.k);
        ojqVar.D.d.removeMessages(1);
        ((izm) ojqVar.n.get()).d();
        ojg ojgVar = this.au;
        ojgVar.a.m(ojgVar.e.get());
        ojgVar.a.m(ojgVar.j.get());
        ((jaw) ojgVar.i.get()).e();
        yzv yzvVar = ojgVar.c;
        if (yzvVar instanceof lmo) {
            lmo lmoVar = (lmo) yzvVar;
            lmoVar.b = null;
            lmoVar.a = null;
            ojgVar.a.m(yzvVar);
        }
        this.aU.m(this);
        this.aU.m(this.at);
        this.aU.m(this.ap);
        this.aU.m(this.E.get());
        this.aU.m(this.I.get());
        this.aU.m(this.G.get());
        this.aU.m(this.l);
        this.aU.m(this.af);
        this.aU.m(this.S.get());
        this.aU.m(this.aF);
        nio nioVar = this.am;
        if (nioVar.c()) {
            if (nioVar.d) {
                nioVar.d = false;
                nioVar.b.unregisterReceiver(nioVar.a);
            }
            nioVar.a();
        }
        ggk ggkVar = (ggk) this.O.get();
        ggkVar.a.h(ggkVar.d);
        this.ar.n = false;
        alaz alazVar = this.H;
        alazVar.d.execute(new alar(alazVar));
        j();
        ltn ltnVar = this.Y;
        ltnVar.e.c();
        if (!eog.ap(ltnVar.f)) {
            ltnVar.a.m(ltnVar);
        }
        this.c.b();
        ojx ojxVar = this.ap;
        ojxVar.m = ojxVar.d.c().d();
        aiii aiiiVar = this.U;
        aiiiVar.a.c();
        aiiiVar.a();
        ((acqs) this.x.get()).d();
        adbv adbvVar = this.aE;
        adbvVar.a.i(adbvVar);
    }

    public final void B() {
        lrw lrwVar = this.aC;
        boolean z = true;
        if (!lrwVar.e) {
            asxj asxjVar = lrwVar.h.b().e;
            if (asxjVar == null) {
                asxjVar = asxj.a;
            }
            if (asxjVar.N && Build.VERSION.SDK_INT < 29) {
                lrwVar.f = (PowerManager) lrwVar.a.getSystemService("power");
                lrwVar.a.registerReceiver(lrwVar, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
                lrwVar.e = true;
            }
        }
        fvl fvlVar = lrwVar.g;
        if (fvlVar != null && lrwVar.a()) {
            lrwVar.b.i(fvlVar);
        }
        lrwVar.g = null;
        i();
        h();
        ojq ojqVar = this.aq;
        if (akg.b()) {
            ojqVar.t(ojqVar.u.isInMultiWindowMode());
        }
        ojqVar.j.g(ojqVar.c);
        if (ojqVar.D != null) {
            if (eog.aq(ojqVar.E)) {
                ojqVar.x.g(ojqVar.D.g(ojqVar.p));
            } else {
                ojqVar.j.g(ojqVar.D);
            }
        }
        ojqVar.j.g(ojqVar.k);
        ((enq) ojqVar.o.get()).a();
        wwk wwkVar = this.i;
        wwkVar.b.e(this.ac);
        D();
        nio nioVar = this.am;
        if (nioVar.c() && !nioVar.d) {
            nioVar.d = true;
            nioVar.b();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter.addDataScheme("package");
            nioVar.b.registerReceiver(nioVar.a, intentFilter);
        }
        ojg ojgVar = this.au;
        jcq jcqVar = (jcq) ojgVar.f.get();
        jcqVar.d.execute(new jcb(jcqVar));
        ((jaw) ojgVar.i.get()).d();
        ojgVar.a.g(ojgVar.e.get());
        ojgVar.a.g(ojgVar.j.get());
        final joh johVar = ojgVar.h;
        ylx.j(anii.i(johVar.b.a.a(), new anir() { // from class: jof
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                joh johVar2 = joh.this;
                fdb fdbVar = (fdb) obj;
                if ((fdbVar.b & 1) != 0) {
                    return johVar2.b(fdbVar.c);
                }
                return anlz.q(null);
            }
        }, anjk.a), anjk.a, ngc.e);
        yzv yzvVar = ojgVar.c;
        if (yzvVar instanceof lmo) {
            lmo lmoVar = (lmo) yzvVar;
            jvc jvcVar = ojgVar.d;
            acth acthVar = ojgVar.k;
            jvcVar.getClass();
            lmoVar.b = jvcVar;
            lmoVar.a = acthVar;
            ojgVar.a.g(yzvVar);
        }
        ojgVar.d.m(true);
        final jot jotVar = (jot) ojgVar.g.get();
        ylx.i(jotVar.d.b(), new ylw() { // from class: jos
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                jot jotVar2 = jot.this;
                if (((Boolean) obj).booleanValue()) {
                    if (!jotVar2.c(jot.a) && ((agrf) jotVar2.e.get()).h()) {
                        ((agxa) jotVar2.f.get()).a();
                    }
                    jotVar2.b(jot.b);
                }
            }
        });
        this.aU.h(this, oie.class);
        this.aU.g(this.at);
        this.aU.g(this.ap);
        this.aU.g(this.E.get());
        this.aU.g(this.I.get());
        this.aU.g(this.G.get());
        this.aU.g(this.af);
        this.aU.g(this.S.get());
        this.aU.g(this.aF);
        alaz alazVar = this.H;
        alazVar.d.execute(new alar(alazVar, 2));
        ggk ggkVar = (ggk) this.O.get();
        ggkVar.a.f(ggkVar.d);
        ((ggk) this.O.get()).b = this.P;
        this.ac.execute(new ohx(this, 19));
        airr airrVar = (airr) this.M.get();
        if (airrVar.q() != null) {
            lmp lmpVar = this.T;
            if (!airrVar.P() && lmpVar.c.s.b()) {
                akfg akfgVar = lmpVar.b;
                akfh l = akfgVar.l();
                l.k(lmpVar.a.getString(R.string.error_audio_cast_background));
                l.j(false);
                akfgVar.n(l.b());
            }
        }
        ((aget) this.aa.get()).e();
        ltn ltnVar = this.Y;
        if (eog.ap(ltnVar.f)) {
            ltnVar.e.g(ltnVar.g(ltnVar.d));
        } else {
            ltnVar.a.g(ltnVar);
        }
        AccessibilityStateReceiver accessibilityStateReceiver = this.Z;
        accessibilityStateReceiver.j();
        accessibilityStateReceiver.l();
        h();
        if (pku.h(this.aY)) {
            this.d.edit().putInt("searchbox_hint_rotation_state", (this.d.getInt("searchbox_hint_rotation_state", 0) + 1) % 3).apply();
        }
        if (this.an.e) {
            G();
            this.an.h();
        }
        aiii aiiiVar = this.U;
        aiiiVar.a.c();
        aiiiVar.a.g(aiiiVar.g(aiiiVar.b));
        ((acqs) this.x.get()).e();
        adbv adbvVar = this.aE;
        adbvVar.a.g(adbvVar);
        if (adbvVar.a.e() == null) {
            z = false;
        }
        adbvVar.a(z);
        this.aD.a(this.bf);
        this.aK.e(this.bf.d);
    }
}
