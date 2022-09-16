package com.google.android.apps.youtube.app.settings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.preference.Preference;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelsConfiguration;
import com.google.android.apps.youtube.app.fragments.panels.PanelFragmentDescriptor;
import com.google.android.apps.youtube.app.settings.SettingsActivity;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SettingsActivity extends lfo implements amhk {
    private lhe b;
    private final amkr c = amkr.a(this);
    private boolean d;
    private Context e;
    private l f;
    private boolean g;

    public SettingsActivity() {
        SystemClock.elapsedRealtime();
    }

    private final lhe i() {
        j();
        return this.b;
    }

    private final void j() {
        if (this.b == null) {
            if (!this.d) {
                throw new IllegalStateException("createPeer() called outside of onCreate");
            }
            if (this.g && !isFinishing()) {
                throw new IllegalStateException("createPeer() called after destroyed.");
            }
            amlp l = amna.l("CreateComponent");
            try {
                lI();
                l.close();
                amlp l2 = amna.l("CreatePeer");
                try {
                    try {
                        Object lI = lI();
                        Activity a = ((dwq) lI).a();
                        if (a instanceof SettingsActivity) {
                            final lhe lheVar = new lhe((SettingsActivity) a, (gfu) ((dwq) lI).a.eA.get(), (fqd) ((dwq) lI).I.get(), axot.a(((dwq) lI).a.zH), (Executor) ((dwq) lI).a.h.get(), ((dwq) lI).a.ct(), (Handler) ((dwq) lI).a.an.get(), (yvs) ((dwq) lI).jE.get(), axot.a(((dwq) lI).jO), axot.a(((dwq) lI).jN), ((dwq) lI).aB(), (ljo) ((dwq) lI).jP.get(), axot.a(((dwq) lI).B), (aadd) ((dwq) lI).a.K.get(), (wgz) ((dwq) lI).fT.get(), ((dwq) lI).a.bc());
                            final ayor ayorVar = (ayor) ((dwq) lI).a.iz.get();
                            ypf gk = ((dwq) lI).gk();
                            ((alzn) ((dwq) lI).e.get()).c(lheVar);
                            gk.f(new Callable() { // from class: lha
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    final lhe lheVar2 = lhe.this;
                                    return lheVar2.m.a.V(ktg.f).V(new ayqe() { // from class: lgy
                                        @Override // defpackage.ayqe
                                        public final Object a(Object obj) {
                                            return Integer.valueOf(zew.i(lhe.this.a.getResources().getDisplayMetrics(), true != ((Boolean) obj).booleanValue() ? 4 : 0));
                                        }
                                    }).X(ayorVar).as(new ayqb() { // from class: lgx
                                        @Override // defpackage.ayqb
                                        public final void a(Object obj) {
                                            final Integer num = (Integer) obj;
                                            Optional.ofNullable(lhe.this.a.findViewById(R.id.settings_toolbar_layout)).filter(new lgw(Toolbar.class)).map(new lgv(Toolbar.class)).ifPresent(new Consumer() { // from class: lhc
                                                @Override // j$.util.function.Consumer
                                                public final void accept(Object obj2) {
                                                    ((Toolbar) obj2).setElevation(num.intValue());
                                                }

                                                @Override // j$.util.function.Consumer
                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                    return consumer.getClass();
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                            this.b = lheVar;
                            l2.close();
                            this.b.t = this;
                            return;
                        }
                        String valueOf = String.valueOf(lhe.class);
                        String valueOf2 = String.valueOf(a.getClass());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 158 + String.valueOf(valueOf2).length());
                        sb.append("Attempt to inject a Activity wrapper of type ");
                        sb.append(valueOf);
                        sb.append(", but the wrapper available is of type: ");
                        sb.append(valueOf2);
                        sb.append(". Does your peer's @Inject constructor reference the wrong wrapper class?");
                        throw new IllegalStateException(sb.toString());
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                } catch (Throwable th) {
                    try {
                        l2.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    l.close();
                } catch (Throwable unused2) {
                }
                throw th2;
            }
        }
    }

    @Override // defpackage.bjo
    public final boolean a(Preference preference) {
        lhe i = i();
        if (!"accessibility_hide_player_controls_setting_key".equals(preference.s)) {
            return false;
        }
        if (i.a.getSupportFragmentManager().f("PREF_DIALOG") != null) {
            return true;
        }
        lie aL = lie.aL(preference.s);
        aL.aD(i.a.getSupportFragmentManager().e(R.id.settings_detail_container));
        aL.qv(i.a.getSupportFragmentManager(), "PREF_DIALOG");
        return true;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.e;
        }
        amnt.b(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oa, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        this.e = context;
        amnt.a(context);
        super.attachBaseContext(context);
        this.e = null;
    }

    @Override // defpackage.bjp
    public final boolean b(Preference preference) {
        lhe i = i();
        lhq lhqVar = i.e().ak;
        String str = preference.s;
        if (lhqVar.a(R.string.captions_key).equals(str)) {
            lhqVar.a.startActivity(new Intent("android.settings.CAPTIONING_SETTINGS"));
            return true;
        }
        apzg apzgVar = null;
        if (lhqVar.a(R.string.subscription_product_setting_key).equals(str)) {
            Intent a = lhqVar.e.a();
            for (Object obj : lhqVar.c.h()) {
                if (apwq.class.isInstance(obj)) {
                    apwq apwqVar = (apwq) obj;
                    if ((apwqVar.b & 1) != 0 && (apzgVar = apwqVar.c) == null) {
                        apzgVar = apzg.a;
                    }
                    a.putExtra("navigation_endpoint", lhqVar.d.f(apzgVar).toByteArray());
                    lhqVar.a.startActivity(a);
                    return true;
                }
            }
            return true;
        } else if (lhqVar.a(R.string.connected_accounts_browse_page_key).equals(str)) {
            Intent a2 = lhqVar.e.a();
            for (Object obj2 : lhqVar.c.h()) {
                if (obj2 instanceof apwj) {
                    apwj apwjVar = (apwj) obj2;
                    if ((apwjVar.b & 1) != 0 && (apzgVar = apwjVar.c) == null) {
                        apzgVar = apzg.a;
                    }
                    a2.putExtra("navigation_endpoint", lhqVar.d.f(apzgVar).toByteArray());
                    lhqVar.a.startActivity(a2);
                    return true;
                }
            }
            return true;
        } else {
            int i2 = 0;
            boolean z = false;
            if (lhqVar.a(R.string.yt_unlimited_post_purchase_key).equals(str) || lhqVar.a(R.string.yt_unlimited_pre_purchase_key).equals(str)) {
                Intent a3 = lhqVar.e.a();
                while (true) {
                    if (i2 >= lhqVar.c.h().size()) {
                        break;
                    }
                    Object obj3 = lhqVar.c.h().get(i2);
                    if (obj3 instanceof apwr) {
                        apwr apwrVar = (apwr) obj3;
                        if ((apwrVar.b & 1) != 0) {
                            aopa mo52toBuilder = apwrVar.mo52toBuilder();
                            acti actiVar = lhqVar.d;
                            apzg apzgVar2 = apwrVar.c;
                            if (apzgVar2 == null) {
                                apzgVar2 = apzg.a;
                            }
                            apzg f = actiVar.f(apzgVar2);
                            mo52toBuilder.copyOnWrite();
                            apwr apwrVar2 = (apwr) mo52toBuilder.instance;
                            f.getClass();
                            apwrVar2.c = f;
                            apwrVar2.b |= 1;
                            apwr apwrVar3 = (apwr) mo52toBuilder.mo39build();
                            apzg apzgVar3 = apwrVar3.c;
                            if (apzgVar3 == null) {
                                apzgVar3 = apzg.a;
                            }
                            a3.putExtra("navigation_endpoint", apzgVar3.toByteArray());
                            lhqVar.c.h().set(i2, apwrVar3);
                        }
                    } else {
                        i2++;
                    }
                }
                lhqVar.a.startActivity(a3);
                return true;
            } else if (lhqVar.a(R.string.yt_unplugged_pref_key).equals(str)) {
                for (Object obj4 : lhqVar.c.h()) {
                    if (apws.class.isInstance(obj4)) {
                        apzg apzgVar4 = ((apws) obj4).c;
                        if (apzgVar4 == null) {
                            apzgVar4 = apzg.a;
                        }
                        lhqVar.d.H(3, new acte(apzgVar4.c), null);
                        lhqVar.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((avvk) apzgVar4.qm(UrlEndpointOuterClass.urlEndpoint)).c)));
                        return true;
                    }
                }
                return true;
            } else if (lhqVar.a(R.string.history_key).equals(str)) {
                for (Object obj5 : lhqVar.c.i()) {
                    if (obj5 instanceof apwk) {
                        apwk apwkVar = (apwk) obj5;
                        if ((apwkVar.b & 4) == 0) {
                            return true;
                        }
                        aafo aafoVar = lhqVar.b;
                        apzg apzgVar5 = apwkVar.d;
                        if (apzgVar5 == null) {
                            apzgVar5 = apzg.a;
                        }
                        aafoVar.a(apzgVar5);
                    }
                }
                return true;
            } else if (lhqVar.a(R.string.premium_early_access_browse_page_key).equals(str)) {
                Intent a4 = lhqVar.e.a();
                for (Object obj6 : lhqVar.c.i()) {
                    if (obj6 instanceof apwp) {
                        apwp apwpVar = (apwp) obj6;
                        if ((apwpVar.b & 1) != 0 && (apzgVar = apwpVar.c) == null) {
                            apzgVar = apzg.a;
                        }
                        a4.putExtra("navigation_endpoint", lhqVar.d.f(apzgVar).toByteArray());
                        lhqVar.a.startActivity(a4);
                        return true;
                    }
                }
                return true;
            } else {
                String str2 = preference.s;
                if (i.a.getString(R.string.refresh_config_key).equals(str2)) {
                    lit litVar = new lit(i.a, i.e, i.f, i.g);
                    llm.j(litVar.d, litVar.a, "Refreshing...", false);
                    litVar.b.execute(new lis(litVar));
                    return true;
                } else if (!i.a.getString(R.string.pair_with_tv_key).equals(str2)) {
                    String str3 = preference.u;
                    i.q = str3;
                    return i.j(str3);
                } else {
                    aby abyVar = i.s;
                    if (abyVar == null) {
                        return true;
                    }
                    SettingsActivity settingsActivity = i.a;
                    if (i.b.a() == gfs.DARK) {
                        z = true;
                    }
                    abyVar.b(adih.d(settingsActivity, z));
                    return true;
                }
            }
        }
    }

    @Override // defpackage.lfo
    public final /* bridge */ /* synthetic */ axnv f() {
        return amhn.a(this);
    }

    public final lhe g() {
        lhe lheVar = this.b;
        if (lheVar != null) {
            if (this.g) {
                throw new IllegalStateException("peer() called after destroyed.");
            }
            return lheVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.abp, defpackage.gb, defpackage.apy
    public final apu getLifecycle() {
        if (this.f == null) {
            this.f = new amhl(this);
        }
        return this.f;
    }

    public final void h(CharSequence charSequence) {
        super.setTitle(charSequence);
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vih, defpackage.dt, defpackage.abp, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        amlw p = this.c.p();
        try {
            super.onActivityResult(i, i2, intent);
            p.close();
        } catch (Throwable th) {
            try {
                p.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.vih, defpackage.abp, android.app.Activity
    public final void onBackPressed() {
        amlw b = this.c.b();
        try {
            super.onBackPressed();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, amhm] */
    @Override // defpackage.vih, defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        amlw q = this.c.q();
        try {
            this.d = true;
            j();
            ((amhl) getLifecycle()).h(this.c);
            lI().jq().a();
            super.onCreate(bundle);
            final lhe i = i();
            i.a.setContentView((View) i.j.get());
            i.n.d((BottomUiContainer) i.a.findViewById(R.id.bottom_ui_container));
            i.h.a();
            gbw gbwVar = new gbw(i.a);
            if (eog.V(i.m.a())) {
                if (i.p == gfs.LIGHT) {
                    gbwVar.b(i.a, 2132083236);
                } else if (i.b.a() == gfs.DARK) {
                    gbwVar.b(i.a, 2132083233);
                }
            }
            Intent intent = i.a.getIntent();
            if ("android.intent.action.MANAGE_NETWORK_USAGE".equals(intent.getAction())) {
                intent.putExtra(":android:no_headers", true);
                intent.putExtra(":android:show_fragment", GeneralPrefsFragment.class.getName());
            }
            Toolbar toolbar = (Toolbar) i.a.findViewById(R.id.toolbar);
            Drawable mutate = i.a.getResources().getDrawable(2131233316).mutate();
            yzh.e(mutate, zhn.j(i.a, R.attr.ytTextPrimary).orElse(0), PorterDuff.Mode.SRC_IN);
            toolbar.q(mutate);
            i.a.setSupportActionBar(toolbar);
            Optional.ofNullable(i.a.getSupportActionBar()).ifPresent(khv.b);
            if (intent.getBooleanExtra("background_settings", false)) {
                ylx.n(i.a, ((enw) i.d.get()).a(), lcz.n, ylx.b);
            }
            i.c.a();
            if (bundle == null || !bundle.containsKey("CONFIGURATION_CHANGE_KEY")) {
                if (!i.l.a()) {
                    ((gbv) i.i.get()).b(PanelsConfiguration.c(PanelFragmentDescriptor.e(lhj.class), PanelFragmentDescriptor.e(GeneralPrefsFragment.class)));
                    i.a.getOnBackPressedDispatcher().b(i.a, i.o);
                }
                ((yzm) i.k.get()).h(i.a.findViewById(R.id.settings_root_container), 0);
                i.s = i.a.registerForActivityResult(new acj(), new abw() { // from class: lgu
                    @Override // defpackage.abw
                    public final void a(Object obj) {
                        lhe lheVar = lhe.this;
                        if (((ActivityResult) obj).a == 2) {
                            lheVar.a.finish();
                        }
                    }
                });
            } else {
                i.q = bundle.getString("LAST_SHOWN_FRAGMENT_KEY", i.q);
                i.r = true;
                i.a.getOnBackPressedDispatcher().b(i.a, i.o);
            }
            this.d = false;
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
        amlw r = this.c.r();
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
    @Override // defpackage.vih, defpackage.oa, defpackage.dt, android.app.Activity
    public final void onDestroy() {
        amlw c = this.c.c();
        try {
            super.onDestroy();
            i().h.b();
            this.g = true;
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vih, defpackage.dt, android.app.Activity
    public final void onNewIntent(Intent intent) {
        amlw d = this.c.d(intent);
        try {
            super.onNewIntent(intent);
            i().g(intent);
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

    @Override // defpackage.vih, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean onOptionsItemSelected;
        amlw s = this.c.s();
        try {
            lhe i = i();
            if (menuItem.getItemId() != 16908332) {
                onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            } else {
                i.a.getOnBackPressedDispatcher().c();
                onOptionsItemSelected = true;
            }
            s.close();
            return onOptionsItemSelected;
        } catch (Throwable th) {
            try {
                s.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vih, defpackage.dt, android.app.Activity
    public final void onPause() {
        amlw e = this.c.e();
        try {
            super.onPause();
            i().c.b();
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vih, defpackage.oa, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        amlw t = this.c.t();
        try {
            super.onPostCreate(bundle);
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
    @Override // defpackage.vih, defpackage.oa, defpackage.dt, android.app.Activity
    public final void onPostResume() {
        amlw f = this.c.f();
        try {
            super.onPostResume();
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.vih, defpackage.dt, defpackage.abp, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        amlw u = this.c.u();
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            u.close();
        } catch (Throwable th) {
            try {
                u.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        lhe i = i();
        if (i.p != i.b.a()) {
            Handler handler = new Handler(Looper.getMainLooper());
            final SettingsActivity settingsActivity = i.a;
            settingsActivity.getClass();
            handler.postAtFrontOfQueue(new Runnable() { // from class: lgz
                @Override // java.lang.Runnable
                public final void run() {
                    SettingsActivity.this.recreate();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vih, defpackage.dt, android.app.Activity
    public final void onResume() {
        amlw g = this.c.g();
        try {
            super.onResume();
            lhe i = i();
            i.c.e();
            i.h(i.a.getString(R.string.settings));
            lhp lhpVar = (lhp) i.a.getSupportFragmentManager().f(i.f());
            if (lhpVar != null) {
                lhpVar.e.d(acuo.a(12924), null, null);
            }
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
    @Override // defpackage.vih, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        amlw v = this.c.v();
        try {
            super.onSaveInstanceState(bundle);
            lhe i = i();
            bundle.putBoolean("CONFIGURATION_CHANGE_KEY", true);
            bundle.putString("LAST_SHOWN_FRAGMENT_KEY", i.q);
            if (v == null) {
                return;
            }
            v.close();
        } catch (Throwable th) {
            if (v != null) {
                try {
                    v.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onSearchRequested() {
        super.onSearchRequested();
        i();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vih, defpackage.oa, defpackage.dt, android.app.Activity
    public final void onStart() {
        amlw h = this.c.h();
        try {
            super.onStart();
            lhe i = i();
            if (!i.l.a()) {
                i.g(i.a.getIntent());
            }
            if (i.r) {
                i.r = false;
                bjk bjkVar = (bjk) i.a.getSupportFragmentManager().f("androidx.preference.PreferenceFragment.DIALOG");
                if (bjkVar != null && bjkVar.aJ() != null) {
                    String str = bjkVar.aJ().s;
                    if (etk.COUNTRY.equals(str)) {
                        bjkVar.dismiss();
                    } else if ("voice_language".equals(str)) {
                        bjkVar.dismiss();
                    }
                }
            }
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
    @Override // defpackage.vih, defpackage.oa, defpackage.dt, android.app.Activity
    public final void onStop() {
        amlw i = this.c.i();
        try {
            super.onStop();
            i();
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
        amlw j = this.c.j();
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

    @Override // defpackage.vih, android.app.Activity
    public final void onUserInteraction() {
        amlw k = this.c.k();
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
    public final void setTitle(CharSequence charSequence) {
        i().h(charSequence);
    }
}
