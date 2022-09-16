package com.google.android.apps.youtube.app.extensions.reel.watch.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivity;
import com.google.android.youtube.R;
import j$.util.Optional;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ReelWatchActivity extends hws implements amhk {
    private hxj b;
    private final amkr c = amkr.a(this);
    private boolean d;
    private Context e;
    private l f;
    private boolean g;

    public ReelWatchActivity() {
        SystemClock.elapsedRealtime();
        addOnContextAvailableListener(new hwy(this));
    }

    private final hxj f() {
        c();
        return this.b;
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

    @Override // defpackage.hws
    public final /* bridge */ /* synthetic */ axnv b() {
        return amhn.a(this);
    }

    public final void c() {
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
                        if (!(a instanceof ReelWatchActivity)) {
                            String valueOf = String.valueOf(hxj.class);
                            String valueOf2 = String.valueOf(a.getClass());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 158 + String.valueOf(valueOf2).length());
                            sb.append("Attempt to inject a Activity wrapper of type ");
                            sb.append(valueOf);
                            sb.append(", but the wrapper available is of type: ");
                            sb.append(valueOf2);
                            sb.append(". Does your peer's @Inject constructor reference the wrong wrapper class?");
                            throw new IllegalStateException(sb.toString());
                        }
                        ReelWatchActivity reelWatchActivity = (ReelWatchActivity) a;
                        hqp hqpVar = (hqp) ((dwq) lI).jl.get();
                        iak iakVar = (iak) ((dwq) lI).a.md.get();
                        azqb azqbVar = ((dwq) lI).gp;
                        ifk ifkVar = (ifk) ((dwq) lI).a.mc.get();
                        aacz aaczVar = (aacz) ((dwq) lI).a.D.get();
                        ahub ahubVar = (ahub) ((dwq) lI).a.rO.get();
                        this.b = new hxj(reelWatchActivity, hqpVar, iakVar, azqbVar, ifkVar, aaczVar, (fqd) ((dwq) lI).I.get(), (yiv) ((dwq) lI).fS.get(), (hyu) ((dwq) lI).a.a.R.get(), ((dwq) lI).gk(), (yvs) ((dwq) lI).jE.get(), null, null);
                        l2.close();
                        this.b.k = this;
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

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        hxj f = f();
        aukw aukwVar = f.j.b().E;
        if (aukwVar == null) {
            aukwVar = aukw.a;
        }
        if (aukwVar.c) {
            ReelWatchActivity reelWatchActivity = f.a;
            reelWatchActivity.overridePendingTransition(0, true != ((Boolean) hxj.a(reelWatchActivity.getIntent()).map(glk.m).map(glk.n).orElse(false)).booleanValue() ? R.anim.reel_activity_slide_down : R.anim.reel_activity_slide_out_right);
        }
    }

    @Override // defpackage.abp, defpackage.gb, defpackage.apy
    public final apu getLifecycle() {
        if (this.f == null) {
            this.f = new amhl(this);
        }
        return this.f;
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
    @Override // defpackage.dt, defpackage.abp, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        amlw p = this.c.p();
        try {
            hxj f = f();
            if (!f.f.b(i, i2, intent)) {
                super.onActivityResult(i, i2, intent);
            }
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
        amlw b = this.c.b();
        try {
            hxj f = f();
            aukw aukwVar = f.j.b().E;
            if (aukwVar == null) {
                aukwVar = aukw.a;
            }
            if (aukwVar.c) {
                gtm gtmVar = (gtm) f.c.get();
                if (!((Boolean) Optional.ofNullable(gtmVar.a()).filter(new lgw(gto.class, 1)).map(new lgv(gto.class, 1)).map(glk.g).orElse(false)).booleanValue() && !gtmVar.h()) {
                    f.a.finishAfterTransition();
                }
            } else if (!((gtm) f.c.get()).g()) {
                ((gtm) f.c.get()).h();
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.oa, defpackage.dt, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f().e.c(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        amlw q = this.c.q();
        try {
            this.d = true;
            ((amhl) getLifecycle()).h(this.c);
            final hxj f = f();
            long currentTimeMillis = System.currentTimeMillis();
            emn.D(f.a);
            super.onCreate(bundle);
            f.a.setContentView(R.layout.reel_watch_activity);
            hwu hwuVar = (hwu) f.a.getSupportFragmentManager().f("ProcessDeathDetectorFragmentTag");
            if (bundle != null && hwuVar != null && hwuVar.a) {
                f.a.finish();
            } else {
                ex l = f.a.getSupportFragmentManager().l();
                hwu hwuVar2 = new hwu();
                hwuVar2.a = false;
                hwuVar2.aC();
                l.r(hwuVar2, "ProcessDeathDetectorFragmentTag");
                l.a();
                f.b.d("r_ac", currentTimeMillis);
                f.a.postponeEnterTransition();
                f.b();
                f.e.a();
                f.i.a();
                aukw aukwVar = f.j.b().E;
                if (aukwVar == null) {
                    aukwVar = aukw.a;
                }
                if (aukwVar.c) {
                    f.h.g(new Callable() { // from class: hxh
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            hxj hxjVar = hxj.this;
                            aynr aynrVar = ((gtm) hxjVar.c.get()).e;
                            final ReelWatchActivity reelWatchActivity = hxjVar.a;
                            return aynrVar.R(new aypv() { // from class: hxg
                                @Override // defpackage.aypv
                                public final void a() {
                                    ReelWatchActivity.this.finishAfterTransition();
                                }
                            });
                        }
                    });
                }
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
    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public final void onDestroy() {
        amlw c = this.c.c();
        try {
            super.onDestroy();
            hxj f = f();
            f.i.b();
            ifk ifkVar = f.d;
            synchronized (ifkVar.b) {
                ifkVar.b.clear();
            }
            f.e.d();
            f.g.b();
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
    @Override // defpackage.dt, android.app.Activity
    public final void onNewIntent(Intent intent) {
        amlw d = this.c.d(intent);
        try {
            super.onNewIntent(intent);
            hxj f = f();
            f.a.setIntent(intent);
            f.b();
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

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        amlw s = this.c.s();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
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
    @Override // defpackage.dt, android.app.Activity
    public final void onPause() {
        amlw e = this.c.e();
        try {
            hxj f = f();
            if (f.a.isFinishing()) {
                f.a.setRequestedOrientation(-1);
            }
            super.onPause();
            f.e.b();
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
    @Override // defpackage.oa, android.app.Activity
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
    @Override // defpackage.oa, defpackage.dt, android.app.Activity
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

    @Override // defpackage.dt, defpackage.abp, android.app.Activity
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, android.app.Activity
    public final void onResume() {
        amlw g = this.c.g();
        try {
            super.onResume();
            f().e.e();
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
    @Override // defpackage.abp, defpackage.gb, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        amlw v = this.c.v();
        try {
            super.onSaveInstanceState(bundle);
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public final void onStart() {
        amlw h = this.c.h();
        try {
            super.onStart();
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
    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public final void onStop() {
        amlw i = this.c.i();
        try {
            super.onStop();
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

    @Override // android.app.Activity
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
}
