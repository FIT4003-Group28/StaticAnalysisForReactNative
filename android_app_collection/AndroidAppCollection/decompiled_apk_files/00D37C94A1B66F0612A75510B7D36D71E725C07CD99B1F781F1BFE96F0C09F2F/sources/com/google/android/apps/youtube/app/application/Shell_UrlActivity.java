package com.google.android.apps.youtube.app.application;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
import com.google.android.libraries.youtube.player.features.onesie.BandaidConnectionOpenerController;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
import com.google.android.youtube.api.StandalonePlayerActivity;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class Shell_UrlActivity extends eeo implements amhk {
    private eez l;
    private final amkr m = amkr.a(this);
    private boolean n;
    private Context o;
    private l p;
    private boolean q;

    public Shell_UrlActivity() {
        SystemClock.elapsedRealtime();
    }

    private final eez o() {
        p();
        return this.l;
    }

    private final void p() {
        if (this.l == null) {
            if (!this.n) {
                throw new IllegalStateException("createPeer() called outside of onCreate");
            }
            if (this.q && !isFinishing()) {
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
                        if (a instanceof Shell_UrlActivity) {
                            this.l = new eez((Shell_UrlActivity) a, (eza) ((dwq) lI).a.jF.get(), (BandaidConnectionOpenerController) ((dwq) lI).a.wF.get(), (yni) ((dwq) lI).a.y.get(), ((dwq) lI).a.ap(), (etn) ((dwq) lI).a.np.get(), (osz) ((dwq) lI).a.wG.get(), (aiix) ((dwq) lI).a.fH.get(), (alzn) ((dwq) lI).e.get(), ((dwq) lI).a.bc(), null, null);
                            l2.close();
                            this.l.i = this;
                            return;
                        }
                        String valueOf = String.valueOf(eez.class);
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

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.o;
        }
        amnt.b(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oa, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        this.o = context;
        amnt.a(context);
        super.attachBaseContext(context);
        this.o = null;
    }

    @Override // defpackage.eea
    public final /* bridge */ /* synthetic */ axnv b() {
        return amhn.a(this);
    }

    @Override // defpackage.ees
    protected final int f() {
        o();
        return 3;
    }

    @Override // defpackage.ees
    protected final int g() {
        o();
        return 67108864;
    }

    @Override // defpackage.abp, defpackage.gb, defpackage.apy
    public final apu getLifecycle() {
        if (this.p == null) {
            this.p = new amhl(this);
        }
        return this.p;
    }

    @Override // defpackage.ees
    protected final int h() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ees
    public final Intent i() {
        eez o = o();
        if (!o.e()) {
            return super.i();
        }
        osz oszVar = o.h;
        Shell_UrlActivity shell_UrlActivity = o.a;
        Intent intent = shell_UrlActivity.getIntent();
        String stringExtra = intent.getStringExtra("app_package");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = yja.a(shell_UrlActivity, intent);
        }
        WatchDescriptor a = WatchDescriptor.a(intent);
        Intent intent2 = new Intent(shell_UrlActivity, StandalonePlayerActivity.class);
        intent2.putExtra("watch", a);
        boolean z = false;
        Intent putExtra = intent2.putExtra("developer_key", "AIzaSyA8eiZmM1FaDVjRy-df2KTyQ_vz_yYM39w").putExtra("app_package", shell_UrlActivity.getPackageName()).putExtra("app_version", zfm.c(shell_UrlActivity)).putExtra("client_library_version", alyz.b(11300)).putExtra("lightbox_mode", !intent.getBooleanExtra("force_fullscreen", false));
        if ((shell_UrlActivity.getWindow().getAttributes().flags & 1024) == 0) {
            z = true;
        }
        putExtra.putExtra("window_has_status_bar", z);
        if (stringExtra == null) {
            return intent2;
        }
        intent2.putExtra("referring_app_package", stringExtra);
        return intent2;
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

    @Override // defpackage.ees
    protected final Class j() {
        ohp ohpVar = o().g;
        return WatchWhileActivity.class;
    }

    @Override // defpackage.ees
    protected final boolean l(boolean z) {
        Uri data;
        eez o = o();
        if (o.e() || (data = o.a.getIntent().getData()) == null) {
            return true;
        }
        if (!z) {
            if (!o.f.f()) {
                o.d.f(new evl());
            }
            etn etnVar = o.e;
            if (etnVar.b == -1) {
                etnVar.b = etnVar.a;
            }
        }
        Shell_UrlActivity shell_UrlActivity = o.a;
        String a = yja.a(shell_UrlActivity, shell_UrlActivity.getIntent());
        eza ezaVar = o.b;
        ezaVar.e(ezaVar.n(data, a));
        o.c.j();
        return true;
    }

    @Override // defpackage.ees
    protected final boolean m() {
        return true;
    }

    @Override // defpackage.ees
    protected final void n() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vih, defpackage.dt, defpackage.abp, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        amlw p = this.m.p();
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
        amlw b = this.m.b();
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
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, amhm] */
    @Override // defpackage.ees, defpackage.vih, defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        amlw q = this.m.q();
        try {
            this.n = true;
            p();
            ((amhl) getLifecycle()).h(this.m);
            lI().jq().a();
            super.onCreate(bundle);
            this.n = false;
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
        amlw r = this.m.r();
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
        amlw c = this.m.c();
        try {
            super.onDestroy();
            this.q = true;
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
        amlw d = this.m.d(intent);
        try {
            super.onNewIntent(intent);
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
        amlw s = this.m.s();
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
    @Override // defpackage.vih, defpackage.dt, android.app.Activity
    public final void onPause() {
        amlw e = this.m.e();
        try {
            super.onPause();
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
        amlw t = this.m.t();
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
        amlw f = this.m.f();
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
        amlw u = this.m.u();
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
    @Override // defpackage.vih, defpackage.dt, android.app.Activity
    public final void onResume() {
        amlw g = this.m.g();
        try {
            super.onResume();
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
        amlw v = this.m.v();
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
    @Override // defpackage.vih, defpackage.oa, defpackage.dt, android.app.Activity
    public final void onStart() {
        amlw h = this.m.h();
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
    @Override // defpackage.vih, defpackage.oa, defpackage.dt, android.app.Activity
    public final void onStop() {
        amlw i = this.m.i();
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
        amlw j = this.m.j();
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
        amlw k = this.m.k();
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
