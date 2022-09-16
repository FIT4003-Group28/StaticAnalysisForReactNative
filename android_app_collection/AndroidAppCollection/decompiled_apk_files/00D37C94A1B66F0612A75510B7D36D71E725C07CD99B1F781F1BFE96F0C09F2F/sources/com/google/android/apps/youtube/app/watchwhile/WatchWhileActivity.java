package com.google.android.apps.youtube.app.watchwhile;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.constraint.ConstraintLayout;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.application.Shell_HomeActivity;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import com.google.android.apps.youtube.app.common.util.AccessibilityStateReceiver;
import com.google.android.youtube.R;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WatchWhileActivity extends ogi implements amhk {
    private l A;
    private boolean B;
    private oie w;
    private final amkr x = amkr.a(this);
    private boolean y;
    private Context z;

    public WatchWhileActivity() {
        SystemClock.elapsedRealtime();
        addOnContextAvailableListener(new ohh(this));
    }

    private final oie w() {
        s();
        return this.w;
    }

    @Override // defpackage.ems
    protected final Dialog a(int i) {
        return null;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.z;
        }
        amnt.b(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oa, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        this.z = context;
        amnt.a(context);
        super.attachBaseContext(context);
        this.z = null;
    }

    @Override // defpackage.abp, defpackage.gb, defpackage.apy
    public final apu getLifecycle() {
        if (this.A == null) {
            this.A = new amhl(this);
        }
        return this.A;
    }

    @Override // defpackage.ems
    protected final void h(gfs gfsVar) {
    }

    @Override // defpackage.oa, android.app.Activity
    public final void invalidateOptionsMenu() {
        amlw p = amna.p();
        try {
            super.invalidateOptionsMenu();
            p.close();
        } catch (Throwable th) {
            try {
                p.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    public final boolean isInPictureInPictureMode() {
        ojq ojqVar = w().aq;
        if (akg.c()) {
            if (ojqVar.A && !ojqVar.B && !ojqVar.v.b() && !ojqVar.u.isInMultiWindowMode()) {
                ojqVar.B = true;
                ojqVar.c.p();
                ojqVar.s.c(false);
                ojqVar.B = false;
            }
            return ojqVar.A;
        }
        return false;
    }

    @Override // defpackage.ems
    public final void j() {
        oie w = w();
        if (w.an.h) {
            w.w();
        } else if (((frv) w.q.get()).f() != 1) {
        } else {
            w.ar.n = false;
            if (w.ao.a.C()) {
                w.D();
            } else if (w.a.isTaskRoot() || w.an.f) {
                if (w.l.m()) {
                    return;
                }
                ojl ojlVar = w.ao;
                int i = ojlVar.j;
                w.ao.r(ojlVar.f(), i | 2);
            } else {
                ehi ehiVar = w.bb;
                Intent flags = new Intent(w.a, Shell_HomeActivity.class).setFlags(335544320);
                flags.setAction("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER");
                w.a.startActivity(flags);
            }
        }
    }

    @Override // defpackage.ems
    protected final Dialog k(int i) {
        oie w = w();
        if (i != 1032) {
            WatchWhileActivity watchWhileActivity = w.bc;
            return null;
        }
        ojx ojxVar = w.ap;
        if (ojxVar.n == null) {
            ojxVar.n = new ProgressDialog(ojxVar.a);
            ojxVar.n.setMessage(ojxVar.a.getString(R.string.sign_in_progress));
            ojxVar.n.setCancelable(false);
            ojxVar.n.setCanceledOnTouchOutside(false);
        }
        return ojxVar.n;
    }

    @Override // defpackage.ogk
    public final /* bridge */ /* synthetic */ axnv m() {
        return amhn.a(this);
    }

    @Override // defpackage.ems
    public final void mA() {
        w().D();
    }

    @Override // defpackage.ems
    protected final void mz() {
        oie w = w();
        oiw oiwVar = w.an;
        if (oiwVar.e) {
            oiwVar.h();
            w.G();
        }
    }

    @Override // defpackage.okb
    protected final ggr n() {
        String q = ((airr) w().M.get()).q();
        JSONObject jSONObject = null;
        if (q == null) {
            return null;
        }
        try {
            jSONObject = new JSONObject().put("@videoId", q);
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
            sb.append("Failed to form the JSON for the assistant: ");
            sb.append(valueOf);
            zep.b(sb.toString());
        }
        return new ggr(jSONObject.toString(), zgt.h(q));
    }

    @Override // defpackage.ems, defpackage.acth
    public final acti oi() {
        return w().g();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
        oie w = w();
        if (frv.a == actionMode.getTag() || Build.VERSION.SDK_INT >= 23) {
            return;
        }
        ((frv) w.q.get()).l();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
        oie w = w();
        if (frv.a == actionMode.getTag() || Build.VERSION.SDK_INT >= 23) {
            return;
        }
        ((frv) w.q.get()).h();
    }

    @Override // defpackage.ems, defpackage.dt, defpackage.abp, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        amlw p = this.x.p();
        try {
            super.onActivityResult(i, i2, intent);
            w().aN.g(i, i2);
            p.close();
        } catch (Throwable th) {
            try {
                p.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.abp, android.app.Activity
    public final void onBackPressed() {
        amlw b = this.x.b();
        try {
            w().w();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.ems, defpackage.oa, defpackage.dt, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        oie w = w();
        apyy b = w.aY.b();
        if (b != null) {
            asxj asxjVar = b.e;
            if (asxjVar == null) {
                asxjVar = asxj.a;
            }
            if (asxjVar.as) {
                w.i();
            }
        }
        w.aI.a(configuration);
        ojq ojqVar = w.aq;
        ojqVar.B = false;
        ojqVar.i.b(ojqVar.a);
        zew.s(w.a.getApplicationContext());
        w.k.c(lxy.b(w.a));
        ((frv) w.q.get()).j();
        w.j();
        w.c.c(configuration);
        ajgx ajgxVar = w.h.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.okb, defpackage.ems, defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        yxd yxdVar;
        amlw q = this.x.q();
        try {
            this.y = true;
            ((amhl) getLifecycle()).h(this.x);
            super.onCreate(bundle);
            oie w = w();
            w.aM.h(2);
            if (bundle != null) {
                w.aW = bundle.getBoolean("IS_BACKING_FROM_OTHER_ACTIVITY", false);
            }
            if ((w.aT.c(ywk.E) & 4194304) == 0 || (yxdVar = w.aV) == null) {
                w.h();
                w.aD.b(bundle);
                w.t(bundle, w.b);
                w.am = new nio(w.a.getApplicationContext());
                w.h();
                w.y.a(true);
                w.ap.c(bundle);
                w.s();
                w.r();
                w.q();
                w.n();
                w.C = (ViewGroup) w.a.findViewById(R.id.pane_fragment_container);
                w.ao.q(w.o, (frv) w.q.get());
                w.k();
                w.o();
                w.ay.e();
                w.aq.s((View) w.B.get(), w.C, w.m, bundle);
                w.s.b = w.l;
                w.au.a();
                w.m();
                w.p();
                w.at.a();
                w.l();
                w.A();
                w.ac.execute(new ohz(w, 12));
                ((loq) w.X.get()).a();
                w.ac.execute(new ohz(w, 2));
                if (eog.aO(w.aY)) {
                    w.c.g(w.ah);
                }
                w.c.a();
                w.V.a();
                w.az.a();
                w.az.c(w.a, w.u);
                w.a.getSupportFragmentManager().ak(new aksy(), true);
                w.aG.a();
                w.M.get();
            } else {
                ayor ayorVar = w.ad;
                yxc b = yxd.b(6);
                b.a("bcf", new ohx(w, 20));
                b.a("dtc", new oia(w, bundle, 1));
                b.a("ioc", new oia(w, bundle));
                b.a("adh", new ohz(w, 13));
                b.a("bcf", new ohx(w, 20));
                b.a("wwp", new ohx(w, 3));
                b.a("wws", new oia(w, bundle, 2));
                b.a("inu", new ohz(w));
                b.a("ttc", new ohz(w, 5));
                b.a("svc", new ohx(w, 17));
                b.a("imc", new ohz(w, 11));
                b.a("apc", new ohz(w, 4));
                b.a("pnc", new ohx(w, 4));
                b.a("btu", new ohx(w, 18));
                b.a("pbc", new ohz(w, 8));
                b.a("scc", new ohx(w, 5));
                b.a("wpc", new oia(w, bundle, 3));
                b.a("lss", new ohx(w, 6));
                b.a("woc", new ohx(w, 7));
                b.a("fab", new ohz(w, 3));
                b.a("pcc", new ohz(w, 9));
                b.a("wyc", new ohz(w, 10));
                b.a("cdc", new ohx(w, 16));
                b.a("dec", new ohz(w, 1));
                yxdVar.n(ayorVar, b);
                yxd yxdVar2 = w.aV;
                ayor ayorVar2 = w.ad;
                yxc b2 = yxd.b(0);
                b2.a("imm", new ohz(w, 12));
                yxdVar2.n(ayorVar2, b2);
                yxd yxdVar3 = w.aV;
                ayor ayorVar3 = w.ad;
                yxc b3 = yxd.b(6);
                b3.a("ill", new ohz(w, 14));
                yxdVar3.n(ayorVar3, b3);
                yxd yxdVar4 = w.aV;
                ayor ayorVar4 = w.ad;
                yxc b4 = yxd.b(0);
                b4.a("scm", new ohz(w, 2));
                yxdVar4.n(ayorVar4, b4);
                boolean aO = eog.aO(w.aY);
                yxd yxdVar5 = w.aV;
                ayor ayorVar5 = w.ad;
                yxc b5 = yxd.b(6);
                b5.c("rtc", new ohz(w, 15), aO);
                b5.a("ilc", new ohz(w, 16));
                b5.a("bsc", new ohz(w, 17));
                b5.a("crc", new ohz(w, 18));
                b5.a("src", new ohz(w, 19));
                b5.a("rfl", new ohx(w, 1));
                b5.a("ifl", new ohx(w));
                b5.a("psp", new ohx(w, 2));
                yxdVar5.n(ayorVar5, b5);
            }
            w.aM.d(2);
            this.y = false;
            if (q == null) {
                return;
            }
            q.close();
        } catch (Throwable th) {
            if (q != null) {
                try {
                    q.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.dt, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        amlw r = this.x.r();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            r.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            try {
                r.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.okb, defpackage.oa, defpackage.dt, android.app.Activity
    public final void onDestroy() {
        amlw c = this.x.c();
        try {
            super.onDestroy();
            oie w = w();
            w.z = true;
            ojq ojqVar = w.aq;
            ojqVar.l.l();
            ojqVar.r.b(ojqVar);
            ojqVar.z.c();
            ojqVar.y.c();
            ojqVar.q.i();
            ((izm) ojqVar.n.get()).c();
            ojqVar.e.i();
            w.at.close();
            ojx ojxVar = w.ap;
            ojxVar.f.j(ojxVar);
            ojxVar.g.i(ojxVar);
            lrt lrtVar = w.ab;
            lrtVar.b.deleteObserver(lrtVar.f);
            AccessibilityStateReceiver accessibilityStateReceiver = w.Z;
            accessibilityStateReceiver.a.clear();
            accessibilityStateReceiver.g();
            accessibilityStateReceiver.b.clear();
            accessibilityStateReceiver.h();
            w.c.d();
            ((loq) w.X.get()).f();
            w.au.d.i();
            ooa ooaVar = w.V;
            if (eog.bb(ooaVar.f)) {
                ayqi.c((AtomicReference) ooaVar.e);
                if (ooaVar.a.g()) {
                    ((onj) ooaVar.c.get()).a();
                    if (ooaVar.b.k) {
                        final onf onfVar = (onf) ooaVar.d.get();
                        if (!onfVar.e) {
                            onfVar.e = true;
                            onfVar.f = false;
                            onfVar.a.a();
                            onfVar.b.g(onfVar);
                            onfVar.g = onfVar.a.a.as(new ayqb() { // from class: one
                                @Override // defpackage.ayqb
                                public final void a(Object obj) {
                                    onf onfVar2 = onf.this;
                                    zhx zhxVar = (zhx) obj;
                                    onfVar2.d.a();
                                    onfVar2.f = true;
                                }
                            });
                            if (onfVar.d.d() && onfVar.c.o()) {
                                onfVar.a.d();
                            }
                        }
                    }
                }
            }
            ojv ojvVar = w.az;
            ojvVar.c.m(ojvVar.d);
            adni adniVar = w.aG;
            adniVar.a.j(adniVar);
            w.t.d();
            this.B = true;
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.oa, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        oie w = w();
        oiy oiyVar = w.ar;
        asxp asxpVar = oiyVar.l.a().e;
        if (asxpVar == null) {
            asxpVar = asxp.a;
        }
        if (asxpVar.br) {
            mdp mdpVar = oiyVar.m;
            if (mdpVar.a.e() || mdpVar.a.d()) {
                if (i != 21) {
                    if (i != 22) {
                        if (i == 31) {
                            ((airr) mdpVar.c.get()).C(new mdo(mdpVar));
                        } else if (i != 62) {
                            if (i == 113 || i == 114) {
                                Bundle bundle = new Bundle();
                                bundle.putInt("KeyPress", i);
                                mdr mdrVar = new mdr();
                                mdrVar.ae(bundle);
                                mdrVar.qv(mdpVar.g.getSupportFragmentManager(), "KeyboardShortcutsDialogFragment");
                            }
                        } else if (((airr) mdpVar.c.get()).d()) {
                            ((aizn) mdpVar.b.get()).c();
                        } else {
                            ((aizn) mdpVar.b.get()).d();
                        }
                    } else if (keyEvent.isAltPressed()) {
                        ((ahwz) mdpVar.f.get()).b(aicb.CHAPTER).ifPresent(new mdn(mdpVar, 1));
                    } else {
                        ((aizn) mdpVar.b.get()).g(10000L);
                    }
                } else if (keyEvent.isAltPressed()) {
                    ((ahwz) mdpVar.f.get()).c(aicb.CHAPTER).ifPresent(new mdn(mdpVar));
                } else {
                    ((aizn) mdpVar.b.get()).g(-10000L);
                }
                return true;
            }
        }
        if (oiyVar.a.hasWindowFocus()) {
            adof adofVar = oiyVar.k;
            final eo supportFragmentManager = oiyVar.a.getSupportFragmentManager();
            adnt e = ((adoa) adofVar.b.get()).e();
            if (e != null && e.a() == 1 && (i == 24 || i == 25 || i == 164)) {
                adhf adhfVar = adofVar.c;
                dp f = supportFragmentManager.f("MdxMediaRouteControllerDialogFragment");
                if (f == null || !f.at()) {
                    final bfm b = adhfVar.b();
                    adhfVar.b.post(new Runnable() { // from class: adhg
                        @Override // java.lang.Runnable
                        public final void run() {
                            bfm.this.qv(supportFragmentManager, "MdxMediaRouteControllerDialogFragment");
                        }
                    });
                    return true;
                }
                return true;
            }
        }
        if (!oiyVar.b().l(i, keyEvent) && (!oiyVar.a().k() || !oiyVar.e(i))) {
            boolean z = false;
            for (fef fefVar : (Set) oiyVar.e.get()) {
                z |= fefVar.onKeyDown(i, keyEvent);
            }
            if (!z) {
                gbd i2 = oiyVar.c().i();
                if (!(i2 instanceof KeyEvent.Callback) || !((KeyEvent.Callback) i2).onKeyDown(i, keyEvent)) {
                    return super.onKeyDown(i, keyEvent);
                }
            }
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        oie w = w();
        if (w.ar.b().m(i)) {
            return true;
        }
        return super.onKeyLongPress(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        oie w = w();
        oiy oiyVar = w.ar;
        if (oiyVar.b().p(i)) {
            return true;
        }
        if (oiyVar.a().k() && oiyVar.e(i)) {
            return true;
        }
        boolean z = false;
        for (fef fefVar : (Set) oiyVar.e.get()) {
            z |= fefVar.onKeyUp(i, keyEvent);
        }
        if (z) {
            return true;
        }
        gbd i2 = oiyVar.c().i();
        if ((i2 instanceof KeyEvent.Callback) && ((KeyEvent.Callback) i2).onKeyUp(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // defpackage.oil, defpackage.dt, android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        w().aq.t(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, android.app.Activity
    public final void onNewIntent(Intent intent) {
        amlw d = this.x.d(intent);
        try {
            super.onNewIntent(intent);
            w().an.d(intent);
            if (d == null) {
                return;
            }
            d.close();
        } catch (Throwable th) {
            if (d != null) {
                try {
                    d.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oa
    public final void onNightModeChanged(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.okb, defpackage.dt, android.app.Activity
    public final void onPause() {
        amlw e = this.x.e();
        try {
            super.onPause();
            oie w = w();
            w.ai.a();
            ogf ogfVar = w.as.a;
            if (!ggs.i()) {
                w.z();
            }
            if (e == null) {
                return;
            }
            e.close();
        } catch (Throwable th) {
            if (e != null) {
                try {
                    e.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.dt, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        super.onPictureInPictureModeChanged(z);
        w().aq.u(z);
    }

    @Override // defpackage.ems, defpackage.oa, android.app.Activity
    protected final void onPostCreate(Bundle bundle) {
        amlw t = this.x.t();
        try {
            super.onPostCreate(bundle);
            oie w = w();
            ojq ojqVar = w.aq;
            jvo jvoVar = ojqVar.G;
            ems emsVar = ojqVar.a;
            View view = ((dp) jvoVar.get()).O;
            if (view != null && view.getParent() == null) {
                ((ViewGroup) emsVar.findViewById(R.id.player_fragment_container)).addView(view, -1, -1);
            }
            if (ojqVar.A) {
                ojqVar.s.c(true);
                ojqVar.B = true;
                ojqVar.y(true);
                ojqVar.B = false;
            }
            w.an.c(w.a.getIntent(), bundle);
            if (t == null) {
                return;
            }
            t.close();
        } catch (Throwable th) {
            if (t != null) {
                try {
                    t.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public final void onPostResume() {
        amlw f = this.x.f();
        try {
            oie w = w();
            w.aU.d(new exg());
            super.onPostResume();
            final oji ojiVar = w.aR;
            asxj asxjVar = ojiVar.e.b().e;
            if (asxjVar == null) {
                asxjVar = asxj.a;
            }
            if (asxjVar.cj && ojiVar.a.compareAndSet(false, true)) {
                asxj asxjVar2 = ojiVar.e.b().e;
                if (asxjVar2 == null) {
                    asxjVar2 = asxj.a;
                }
                int i = asxjVar2.cU;
                if (i > 0) {
                    ayoi.T(1).q(zna.t(ojiVar.b.a())).A(i, TimeUnit.MILLISECONDS).ag(1L).X(ojiVar.c).as(new ayqb() { // from class: ojh
                        @Override // defpackage.ayqb
                        public final void a(Object obj) {
                            Integer num = (Integer) obj;
                            oji.this.d.h(auzb.STARTUP_SIGNAL_ACTIVITY_ONRESUME_LOADED);
                        }
                    });
                } else {
                    ojiVar.d.h(auzb.STARTUP_SIGNAL_ACTIVITY_ONRESUME_LOADED);
                }
            }
            w.aU.d(new exh());
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.dt, defpackage.abp, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        akkl a;
        aknw aknwVar;
        amlw u = this.x.u();
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            akkm akkmVar = w().h;
            atvo b = atvo.b(i);
            if (akkm.a.containsKey(b) && (aknwVar = (a = akkmVar.a(b)).d) != null) {
                if (iArr.length <= 0 || iArr[0] != 0) {
                    aknwVar.b();
                    if (!a.a.shouldShowRequestPermissionRationale(a.c)) {
                        a.d.a();
                    }
                } else {
                    aknwVar.c();
                }
                a.d = null;
            }
            u.close();
        } catch (Throwable th) {
            try {
                u.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.okb, defpackage.ems, defpackage.dt, android.app.Activity
    public final void onResume() {
        amlw g = this.x.g();
        try {
            w().x();
            if (g == null) {
                return;
            }
            g.close();
        } catch (Throwable th) {
            if (g != null) {
                try {
                    g.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt
    public final void onResumeFragments() {
        super.onResumeFragments();
        oie w = w();
        if (!ggs.i()) {
            w.C();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x0006, B:5:0x0011, B:13:0x0025, B:18:0x0044, B:20:0x005a, B:21:0x0063, B:8:0x0018, B:10:0x001c, B:14:0x0039, B:17:0x003f), top: B:30:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.abp, defpackage.gb, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSaveInstanceState(android.os.Bundle r8) {
        /*
            r7 = this;
            amkr r0 = r7.x
            amlw r0 = r0.v()
            oie r1 = r7.w()     // Catch: java.lang.Throwable -> L84
            ojq r2 = r1.aq     // Catch: java.lang.Throwable -> L84
            boolean r3 = r2.A     // Catch: java.lang.Throwable -> L84
            r4 = 1
            if (r3 == 0) goto L39
            boolean r3 = defpackage.akg.c()     // Catch: java.lang.Throwable -> L84
            if (r3 != 0) goto L18
            goto L25
        L18:
            boolean r3 = r2.A     // Catch: java.lang.Throwable -> L84
            if (r3 == 0) goto L25
            ogq r3 = r2.v     // Catch: java.lang.Throwable -> L84
            boolean r3 = r3.b()     // Catch: java.lang.Throwable -> L84
            if (r3 == 0) goto L25
            goto L39
        L25:
            azpx r3 = r2.s     // Catch: java.lang.Throwable -> L84
            r5 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L84
            r3.c(r6)     // Catch: java.lang.Throwable -> L84
            r2.B = r4     // Catch: java.lang.Throwable -> L84
            ofu r3 = r2.c     // Catch: java.lang.Throwable -> L84
            r3.p()     // Catch: java.lang.Throwable -> L84
            r2.B = r5     // Catch: java.lang.Throwable -> L84
            goto L44
        L39:
            boolean r2 = r2.A     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto L44
            if (r8 == 0) goto L44
            java.lang.String r2 = "IS_IN_PICTURE_IN_PICTURE"
            r8.putBoolean(r2, r4)     // Catch: java.lang.Throwable -> L84
        L44:
            com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity r2 = r1.bc     // Catch: java.lang.Throwable -> L84
            super.onSaveInstanceState(r8)     // Catch: java.lang.Throwable -> L84
            java.lang.String r2 = "has_handled_intent"
            oiw r3 = r1.an     // Catch: java.lang.Throwable -> L84
            boolean r3 = r3.g     // Catch: java.lang.Throwable -> L84
            r8.putBoolean(r2, r3)     // Catch: java.lang.Throwable -> L84
            com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity r2 = r1.a     // Catch: java.lang.Throwable -> L84
            boolean r2 = r2.isChangingConfigurations()     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto L63
            java.lang.String r2 = "recreate_signed_in_state"
            ojx r3 = r1.ap     // Catch: java.lang.Throwable -> L84
            int r3 = r3.l     // Catch: java.lang.Throwable -> L84
            r8.putInt(r2, r3)     // Catch: java.lang.Throwable -> L84
        L63:
            ltt r2 = r1.aD     // Catch: java.lang.Throwable -> L84
            r2.c(r8)     // Catch: java.lang.Throwable -> L84
            com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity r2 = r1.a     // Catch: java.lang.Throwable -> L84
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L84
            java.lang.String r2 = r2.getSimpleName()     // Catch: java.lang.Throwable -> L84
            com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity r3 = r1.a     // Catch: java.lang.Throwable -> L84
            defpackage.arey.K(r2, r8)     // Catch: java.lang.Throwable -> L84
            java.lang.String r2 = "IS_BACKING_FROM_OTHER_ACTIVITY"
            boolean r1 = r1.aW     // Catch: java.lang.Throwable -> L84
            r8.putBoolean(r2, r1)     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L83
            r0.close()
        L83:
            return
        L84:
            r8 = move-exception
            if (r0 == 0) goto L8a
            r0.close()     // Catch: java.lang.Throwable -> L8a
        L8a:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity.onSaveInstanceState(android.os.Bundle):void");
    }

    @Override // defpackage.ems, android.app.Activity, android.view.Window.Callback
    public final boolean onSearchRequested() {
        w().G();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.okb, defpackage.ems, defpackage.oa, defpackage.dt, android.app.Activity
    public final void onStart() {
        amlw h = this.x.h();
        try {
            w().y();
            if (h == null) {
                return;
            }
            h.close();
        } catch (Throwable th) {
            if (h != null) {
                try {
                    h.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.okb, defpackage.oa, defpackage.dt, android.app.Activity
    public final void onStop() {
        amlw i = this.x.i();
        try {
            super.onStop();
            oie w = w();
            w.aq.q.k(1);
            w.ai.a();
            if (ggs.i()) {
                w.z();
            }
            fyn.b();
            if (i == null) {
                return;
            }
            i.close();
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.oa
    public final boolean onSupportNavigateUp() {
        amlw j = this.x.j();
        try {
            boolean onSupportNavigateUp = super.onSupportNavigateUp();
            j.close();
            return onSupportNavigateUp;
        } catch (Throwable th) {
            try {
                j.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.ems, android.app.Activity
    public final void onUserInteraction() {
        amlw k = this.x.k();
        try {
            super.onUserInteraction();
            k.close();
        } catch (Throwable th) {
            try {
                k.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        final ojq ojqVar = w().aq;
        if (ojqVar.g.l()) {
            ojqVar.g.h();
        } else {
            ylx.n(ojqVar.a, ojqVar.g.g(((jwi) ojqVar.G.get()).aT, ojqVar.d.g()), mbi.e, new zdt() { // from class: ojn
                @Override // defpackage.zdt
                public final void a(Object obj) {
                    ojq ojqVar2 = ojq.this;
                    Boolean bool = (Boolean) obj;
                    if (bool == null || !bool.booleanValue() || !eog.D(ojqVar2.f)) {
                        return;
                    }
                    ojqVar2.B = true;
                    ojqVar2.s.c(true);
                    ojqVar2.c.i();
                    ojqVar2.h.c();
                    ojqVar2.w.a();
                }
            });
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        for (yzy yzyVar : w().aH) {
            yzyVar.b(z);
        }
    }

    @Override // defpackage.okb
    protected final ivn p(admj admjVar, adij adijVar, azqb azqbVar, adma admaVar) {
        oie w = w();
        ivn ivnVar = new ivn(admjVar, adijVar, w.a, w.aq, azqbVar, admaVar, w.aP);
        ((admc) w.aQ.get()).a(ivnVar);
        return ivnVar;
    }

    public final oie q() {
        oie oieVar = this.w;
        if (oieVar != null) {
            if (this.B) {
                throw new IllegalStateException("peer() called after destroyed.");
            }
            return oieVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.okb
    protected final azqb r(adij adijVar) {
        oie w = w();
        if (adijVar == adij.WATCH) {
            return w.W;
        }
        WatchWhileActivity watchWhileActivity = w.bc;
        if (adijVar != adij.BROWSE) {
            return null;
        }
        return watchWhileActivity.u;
    }

    public final void s() {
        if (this.w == null) {
            if (!this.y) {
                throw new IllegalStateException("createPeer() called outside of onCreate");
            }
            if (this.B && !isFinishing()) {
                throw new IllegalStateException("createPeer() called after destroyed.");
            }
            amlp l = amna.l("CreateComponent");
            try {
                lI();
                l.close();
                l = amna.l("CreatePeer");
                try {
                    try {
                        Object lI = lI();
                        oie oieVar = new oie(((dwq) lI).fe(), (aacz) ((dwq) lI).a.D.get(), (aadd) ((dwq) lI).a.K.get(), (ykv) ((dwq) lI).a.V.get(), (efz) ((dwq) lI).a.cQ.get(), (ywk) ((dwq) lI).a.B.get(), (gfu) ((dwq) lI).a.eA.get(), (snc) ((dwq) lI).a.v.get(), (yni) ((dwq) lI).a.y.get(), (alzn) ((dwq) lI).e.get(), ((dwq) lI).a.bc());
                        oieVar.c = (fqd) ((dwq) lI).I.get();
                        oieVar.d = (SharedPreferences) ((dwq) lI).a.t.get();
                        oieVar.e = ((dwq) lI).a.a.aa();
                        dyo dyoVar = ((dwq) lI).a;
                        oieVar.f = dyoVar.a.am;
                        oieVar.g = (feu) dyoVar.wt.get();
                        oieVar.h = (akkm) ((dwq) lI).hR.get();
                        oieVar.i = (wwk) ((dwq) lI).a.eH.get();
                        oieVar.j = (wxc) ((dwq) lI).a.sg.get();
                        oieVar.k = (ajxq) ((dwq) lI).jQ.get();
                        oieVar.l = (okf) ((dwq) lI).iT.get();
                        oieVar.m = (fqh) ((dwq) lI).jR.get();
                        oieVar.n = (mer) ((dwq) lI).jS.get();
                        oieVar.o = (luf) ((dwq) lI).iF.get();
                        oieVar.p = (fyg) ((dwq) lI).jT.get();
                        oieVar.q = axot.a(((dwq) lI).iR);
                        oieVar.r = (fsd) ((dwq) lI).iy.get();
                        oieVar.s = (oah) ((dwq) lI).w.get();
                        adfa adfaVar = (adfa) ((dwq) lI).jU.get();
                        oieVar.t = (ybq) ((dwq) lI).hQ.get();
                        oieVar.u = (aafo) ((dwq) lI).H.get();
                        oieVar.v = ((dwq) lI).gy;
                        oieVar.w = ((dwq) lI).jV;
                        oieVar.x = axot.a(((dwq) lI).a.H);
                        oieVar.y = (ojm) ((dwq) lI).fw.get();
                        AppTabsBar appTabsBar = (AppTabsBar) ((dwq) lI).iE.get();
                        ConstraintLayout constraintLayout = (ConstraintLayout) ((dwq) lI).iD.get();
                        oieVar.B = axot.a(((dwq) lI).aC);
                        oieVar.D = axot.a(((dwq) lI).ek);
                        oieVar.E = ((dwq) lI).jW;
                        oieVar.F = ((dwq) lI).aB();
                        oieVar.G = ((dwq) lI).jX;
                        oieVar.H = (alaz) ((dwq) lI).a.wm.get();
                        oieVar.I = ((dwq) lI).dn;
                        oieVar.f237J = (xli) ((dwq) lI).gh.get();
                        oieVar.K = (fbw) ((dwq) lI).a.le.get();
                        dyo dyoVar2 = ((dwq) lI).a;
                        oieVar.L = dyoVar2.nQ;
                        oieVar.M = ((dwq) lI).o;
                        oieVar.N = dyoVar2.jE;
                        oieVar.O = ((dwq) lI).aq;
                        oieVar.P = (niw) ((dwq) lI).ab.get();
                        oieVar.Q = ((dwq) lI).a.uB;
                        oieVar.R = (ofu) ((dwq) lI).ak.get();
                        ezh ezhVar = (ezh) ((dwq) lI).A.get();
                        oieVar.aZ = (sdb) ((dwq) lI).ee.get();
                        oieVar.S = ((dwq) lI).a.yt;
                        oieVar.T = (lmp) ((dwq) lI).jY.get();
                        oieVar.U = (aiii) ((dwq) lI).fQ.get();
                        oieVar.V = (ooa) ((dwq) lI).ka.get();
                        oieVar.W = ((dwq) lI).dH;
                        oieVar.X = ((dwq) lI).kb;
                        oieVar.Y = (ltn) ((dwq) lI).kc.get();
                        oieVar.Z = (AccessibilityStateReceiver) ((dwq) lI).aj.get();
                        oieVar.aa = ((dwq) lI).a.lW;
                        oieVar.ab = (lrt) ((dwq) lI).kd.get();
                        oieVar.ac = (ScheduledExecutorService) ((dwq) lI).a.h.get();
                        oieVar.ad = (ayor) ((dwq) lI).a.aq.get();
                        oieVar.ae = (egi) ((dwq) lI).a.wz.get();
                        oieVar.af = (lmj) ((dwq) lI).ke.get();
                        oieVar.ag = ((dwq) lI).a.kC;
                        oieVar.ah = (fpt) ((dwq) lI).kg.get();
                        oieVar.ai = (evn) ((dwq) lI).iv.get();
                        oieVar.aX = (lnj) ((dwq) lI).dR.get();
                        oieVar.aj = (aggb) ((dwq) lI).dC.get();
                        oieVar.ak = axot.a(((dwq) lI).a.wH);
                        oieVar.al = (oje) ((dwq) lI).ki.get();
                        oieVar.an = (oiw) ((dwq) lI).iY.get();
                        oieVar.ao = (ojl) ((dwq) lI).E.get();
                        oieVar.ap = (ojx) ((dwq) lI).iV.get();
                        oieVar.aq = (ojq) ((dwq) lI).ab.get();
                        oieVar.ar = (oiy) ((dwq) lI).ec.get();
                        oieVar.as = (oio) ((dwq) lI).iw.get();
                        oieVar.at = (ojz) ((dwq) lI).kj.get();
                        oieVar.au = (ojg) ((dwq) lI).kl.get();
                        oieVar.av = (ois) ((dwq) lI).fp.get();
                        oieVar.aw = (nub) ((dwq) lI).dX.get();
                        oieVar.ax = (oik) ((dwq) lI).iH.get();
                        oieVar.ay = (nfk) ((dwq) lI).aE.get();
                        oieVar.az = (ojv) ((dwq) lI).km.get();
                        oieVar.aA = (lpt) ((dwq) lI).aA.get();
                        oieVar.aB = (yzm) ((dwq) lI).B.get();
                        oieVar.aC = (lrw) ((dwq) lI).kn.get();
                        oieVar.aD = (ltt) ((dwq) lI).ko.get();
                        oieVar.aE = (adbv) ((dwq) lI).a.a.au.get();
                        ((dwq) lI).B();
                        oieVar.aF = (ofx) ((dwq) lI).kp.get();
                        oieVar.aG = new adni((afvt) ((dwq) lI).a.dz.get(), (adoa) ((dwq) lI).a.jq.get(), (aczr) ((dwq) lI).a.bg.get());
                        oieVar.aH = amvn.s((yzy) ((dwq) lI).B.get(), (yzy) ((dwq) lI).al.get());
                        oieVar.aI = (ojy) ((dwq) lI).an.get();
                        gbv gbvVar = (gbv) ((dwq) lI).hH.get();
                        oieVar.aJ = (gfu) ((dwq) lI).a.eA.get();
                        oieVar.aK = (gfr) ((dwq) lI).a.nP.get();
                        egt egtVar = (egt) ((dwq) lI).kr.get();
                        lju ljuVar = (lju) ((dwq) lI).a.a.av.get();
                        oieVar.aL = (ajgz) ((dwq) lI).cA.get();
                        ghs ghsVar = (ghs) ((dwq) lI).bu.get();
                        mix mixVar = (mix) ((dwq) lI).ks.get();
                        oieVar.ba = fyv.a();
                        oieVar.bb = new ehi();
                        oieVar.aM = (yxe) ((dwq) lI).a.X.get();
                        oieVar.aN = (eys) ((dwq) lI).hr.get();
                        oieVar.aO = (egc) ((dwq) lI).a.rL.get();
                        axnm a = axot.a(((dwq) lI).jo);
                        axnm a2 = axot.a(((dwq) lI).kq);
                        axnm a3 = axot.a(((dwq) lI).kt);
                        ayor ayorVar = (ayor) ((dwq) lI).a.iz.get();
                        asxj asxjVar = ((aacz) ((dwq) lI).a.D.get()).b().e;
                        if (asxjVar == null) {
                            asxjVar = asxj.a;
                        }
                        if (asxjVar.ce) {
                            StartupSignalStream startupSignalStream = (StartupSignalStream) a.get();
                            ypf ypfVar = (ypf) a2.get();
                            aypf aypfVar = new aypf();
                            EnumMap enumMap = new EnumMap(auzb.class);
                            for (oga ogaVar : (Set) a3.get()) {
                                Set set = (Set) enumMap.get(auzb.STARTUP_SIGNAL_FIRST_THUMBNAIL_LOADED);
                                if (set == null) {
                                    set = new HashSet();
                                    enumMap.put((EnumMap) auzb.STARTUP_SIGNAL_FIRST_THUMBNAIL_LOADED, (auzb) set);
                                }
                                set.add(ogaVar);
                            }
                            for (final Map.Entry entry : enumMap.entrySet()) {
                                aypfVar.d(startupSignalStream.g().q(zna.t(ypfVar.a())).I(new ayqf() { // from class: ofz
                                    @Override // defpackage.ayqf
                                    public final boolean a(Object obj) {
                                        return ((auzb) obj).equals(entry.getKey());
                                    }
                                }).j().y(ayorVar).T(new ayqb() { // from class: ofy
                                    @Override // defpackage.ayqb
                                    public final void a(Object obj) {
                                        auzb auzbVar = (auzb) obj;
                                        for (oga ogaVar2 : (Set) entry.getValue()) {
                                            asxj asxjVar2 = ogaVar2.c.b().e;
                                            if (asxjVar2 == null) {
                                                asxjVar2 = asxj.a;
                                            }
                                            if (asxjVar2.ce) {
                                                ogaVar2.a.pM((aizf[]) ogaVar2.b.get());
                                            }
                                        }
                                    }
                                }));
                            }
                        }
                        oieVar.aP = ((dwq) lI).gT;
                        oieVar.aQ = axot.a(((dwq) lI).a.a.Y);
                        oieVar.aR = (oji) ((dwq) lI).ku.get();
                        this.w = oieVar;
                        l.close();
                        this.w.bc = this;
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } finally {
                try {
                    l.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // defpackage.ems, defpackage.abp, android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
        w().aW = true;
    }

    @Override // defpackage.oil
    protected final void t(boolean z) {
        w().aq.g.j(z);
    }

    public final void u() {
        super.onResume();
    }

    public final void v() {
        super.onStart();
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        oie w = w();
        w.aI.a(configuration);
        w.aq.u(z);
    }
}
