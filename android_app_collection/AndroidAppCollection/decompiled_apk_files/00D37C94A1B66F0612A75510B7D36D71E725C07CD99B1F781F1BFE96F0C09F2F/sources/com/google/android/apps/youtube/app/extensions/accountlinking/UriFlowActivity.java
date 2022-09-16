package com.google.android.apps.youtube.app.extensions.accountlinking;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class UriFlowActivity extends gpa implements amhk {
    private gph b;
    private final amkr c = amkr.a(this);
    private boolean d;
    private Context e;
    private l f;
    private boolean g;

    public UriFlowActivity() {
        SystemClock.elapsedRealtime();
    }

    private final gph c() {
        f();
        return this.b;
    }

    private final void f() {
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
                l = amna.l("CreatePeer");
                try {
                    try {
                        Object lI = lI();
                        this.b = new gph(((dwq) lI).bP(), (gpg) ((dwq) lI).a.xU.get(), (alzn) ((dwq) lI).e.get(), ((dwq) lI).bP(), ((dwq) lI).a.bc());
                        l.close();
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

    @Override // defpackage.gpa
    public final /* bridge */ /* synthetic */ axnv b() {
        return amhn.a(this);
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
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, amhm] */
    @Override // defpackage.vih, defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        amlw q = this.c.q();
        try {
            this.d = true;
            f();
            ((amhl) getLifecycle()).h(this.c);
            lI().jq().a();
            super.onCreate(bundle);
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
            gph c = c();
            if (c.c == 3) {
                c.g(c.b.e(intent));
            } else {
                zep.b("Unexpected intent received.");
                c.e();
            }
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
    @Override // defpackage.vih, defpackage.dt, android.app.Activity
    public final void onPause() {
        amlw e = this.c.e();
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vih, defpackage.dt, android.app.Activity
    public final void onResume() {
        amlw g = this.c.g();
        try {
            super.onResume();
            gph c = c();
            if (c.c == 3) {
                c.e();
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
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x0006, B:6:0x0013, B:8:0x0020, B:10:0x0026, B:14:0x0048, B:16:0x0050, B:17:0x0054, B:11:0x002b, B:12:0x003c, B:21:0x005b, B:22:0x0062, B:24:0x006c), top: B:35:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.vih, defpackage.oa, defpackage.dt, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() {
        /*
            r7 = this;
            amkr r0 = r7.c
            amlw r0 = r0.h()
            super.onStart()     // Catch: java.lang.Throwable -> L74
            gph r1 = r7.c()     // Catch: java.lang.Throwable -> L74
            int r2 = r1.c     // Catch: java.lang.Throwable -> L74
            r3 = 1
            if (r2 == r3) goto L13
            goto L6e
        L13:
            com.google.android.apps.youtube.app.extensions.accountlinking.UriFlowActivity r2 = r1.a     // Catch: java.lang.Throwable -> L74
            android.content.Intent r2 = r2.getIntent()     // Catch: java.lang.Throwable -> L74
            android.net.Uri r3 = r2.getData()     // Catch: java.lang.Throwable -> L74
            r4 = 2
            if (r3 == 0) goto L62
            gpg r5 = r1.b     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = r5.b     // Catch: java.lang.Throwable -> L74
            if (r6 == 0) goto L2b
            boolean r3 = r5.c(r3)     // Catch: java.lang.Throwable -> L74
            goto L46
        L2b:
            vne r3 = r5.g     // Catch: java.lang.Throwable -> L74
            ankt r3 = r3.a()     // Catch: java.lang.Throwable -> L74
            gpf r6 = new gpf     // Catch: java.lang.Throwable -> L74
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L74
            anjk r5 = defpackage.anjk.a     // Catch: java.lang.Throwable -> L74
            ankt r3 = defpackage.anii.h(r3, r6, r5)     // Catch: java.lang.Throwable -> L74
            java.lang.Object r3 = r3.get()     // Catch: java.lang.InterruptedException -> L58 java.util.concurrent.ExecutionException -> L5a java.lang.Throwable -> L74
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.InterruptedException -> L58 java.util.concurrent.ExecutionException -> L5a java.lang.Throwable -> L74
            boolean r3 = r3.booleanValue()     // Catch: java.lang.InterruptedException -> L58 java.util.concurrent.ExecutionException -> L5a java.lang.Throwable -> L74
        L46:
            if (r3 == 0) goto L62
            gpg r3 = r1.b     // Catch: java.lang.Throwable -> L74
            int r2 = r3.e(r2)     // Catch: java.lang.Throwable -> L74
            if (r2 != r4) goto L54
            r1.g(r4)     // Catch: java.lang.Throwable -> L74
            goto L6e
        L54:
            r1.f()     // Catch: java.lang.Throwable -> L74
            goto L6e
        L58:
            r2 = move-exception
            goto L5b
        L5a:
            r2 = move-exception
        L5b:
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L74
            defpackage.zep.b(r2)     // Catch: java.lang.Throwable -> L74
        L62:
            gpg r2 = r1.b     // Catch: java.lang.Throwable -> L74
            com.google.android.apps.youtube.app.extensions.accountlinking.UriFlowActivity r3 = r1.a     // Catch: java.lang.Throwable -> L74
            boolean r2 = r2.d(r3)     // Catch: java.lang.Throwable -> L74
            if (r2 == 0) goto L54
            r1.c = r4     // Catch: java.lang.Throwable -> L74
        L6e:
            if (r0 == 0) goto L73
            r0.close()
        L73:
            return
        L74:
            r1 = move-exception
            if (r0 == 0) goto L7a
            r0.close()     // Catch: java.lang.Throwable -> L7a
        L7a:
            goto L7c
        L7b:
            throw r1
        L7c:
            goto L7b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.extensions.accountlinking.UriFlowActivity.onStart():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vih, defpackage.oa, defpackage.dt, android.app.Activity
    public final void onStop() {
        amlw i = this.c.i();
        try {
            super.onStop();
            gph c = c();
            if (c.c == 2) {
                c.c = 3;
            }
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
}
