package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ShortsCreationActivity extends gvc implements amhk {
    public gve b;
    public boolean c;
    private final amkr d = amkr.a(this);
    private boolean e;
    private Context f;
    private l g;

    public ShortsCreationActivity() {
        SystemClock.elapsedRealtime();
        addOnContextAvailableListener(new gvd(this));
    }

    private final gve g() {
        c();
        return this.b;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.f;
        }
        amnt.b(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oa, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        this.f = context;
        amnt.a(context);
        super.attachBaseContext(context);
        this.f = null;
    }

    @Override // defpackage.gvc
    public final /* bridge */ /* synthetic */ axnv b() {
        return amhn.a(this);
    }

    public final void c() {
        if (this.b == null) {
            if (!this.e) {
                throw new IllegalStateException("createPeer() called outside of onCreate");
            }
            if (this.c && !isFinishing()) {
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
                        tmn tmnVar = (tmn) ((dwq) lI).a.a.P.get();
                        tmm tmmVar = (tmm) ((dwq) lI).a.a.Q.get();
                        this.b = new gve(((dwq) lI).cb(), (hkg) ((dwq) lI).jk.get(), (snc) ((dwq) lI).a.v.get(), (hkl) ((dwq) lI).a.yP.get());
                        l.close();
                        this.b.g = this;
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

    public final boolean f(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.abp, defpackage.gb, defpackage.apy
    public final apu getLifecycle() {
        if (this.g == null) {
            this.g = new amhl(this);
        }
        return this.g;
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
        amlw p = this.d.p();
        try {
            gve g = g();
            if (intent == null || !intent.getBooleanExtra("close_gallery_on_successful_upload", false) || i2 != -1) {
                super.onActivityResult(i, i2, intent);
            } else {
                g.c.setResult(-1, intent);
                g.c.finish();
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
        amlw b = this.d.b();
        try {
            gve g = g();
            hes hesVar = ((hep) g.a.am).a;
            eo supportFragmentManager = hesVar.mJ().getSupportFragmentManager();
            if (supportFragmentManager.a() > 0) {
                supportFragmentManager.L();
            } else {
                dp e = hesVar.mL().e(R.id.reel_container);
                if (e instanceof hdz) {
                    if (!hesVar.au) {
                        hesVar.aQ(false, gyq.d(hesVar.q(), hesVar.ao, 22156));
                    } else {
                        her herVar = hesVar.an;
                        if (herVar != null) {
                            herVar.b(false);
                        }
                    }
                } else if (e instanceof gxk) {
                    gxk gxkVar = (gxk) e;
                    if (gyy.a(gxkVar.aM)) {
                        gxh gxhVar = gxkVar.e;
                        gwq gwqVar = new gwq(gxkVar, 3);
                        if (((hes) gxhVar).au) {
                            gwqVar.run();
                            ((hes) gxhVar).aK(gyq.d(((hes) gxhVar).q(), ((hes) gxhVar).ao, 22156));
                        }
                    }
                    gxkVar.aF();
                } else if (e instanceof gzt) {
                    ((gzt) e).aH();
                } else if (!(e instanceof hjm)) {
                    super.onBackPressed();
                } else {
                    ((hjm) e).aE();
                }
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

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089 A[Catch: all -> 0x00c3, TryCatch #0 {all -> 0x00c3, blocks: (B:3:0x0007, B:5:0x0024, B:7:0x002d, B:9:0x0031, B:11:0x003f, B:13:0x004f, B:19:0x007d, B:21:0x0089, B:23:0x00a1, B:25:0x00a6, B:26:0x00a9, B:28:0x00af, B:29:0x00b2, B:14:0x0052, B:15:0x0055, B:17:0x0059, B:18:0x006b), top: B:38:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            amkr r0 = r9.d
            amlw r0 = r0.q()
            r1 = 1
            r9.e = r1     // Catch: java.lang.Throwable -> Lc3
            apu r1 = r9.getLifecycle()     // Catch: java.lang.Throwable -> Lc3
            amkr r2 = r9.d     // Catch: java.lang.Throwable -> Lc3
            amhl r1 = (defpackage.amhl) r1     // Catch: java.lang.Throwable -> Lc3
            r1.h(r2)     // Catch: java.lang.Throwable -> Lc3
            gve r1 = r9.g()     // Catch: java.lang.Throwable -> Lc3
            com.google.android.apps.youtube.app.extensions.reel.creation.shorts.activity.ShortsCreationActivity r2 = r1.c     // Catch: java.lang.Throwable -> Lc3
            defpackage.emn.D(r2)     // Catch: java.lang.Throwable -> Lc3
            com.google.android.apps.youtube.app.extensions.reel.creation.shorts.activity.ShortsCreationActivity r2 = r1.g     // Catch: java.lang.Throwable -> Lc3
            super.onCreate(r10)     // Catch: java.lang.Throwable -> Lc3
            if (r10 != 0) goto L2b
            snc r2 = r1.e     // Catch: java.lang.Throwable -> Lc3
            long r2 = r2.c()     // Catch: java.lang.Throwable -> Lc3
            goto L2d
        L2b:
            r2 = 0
        L2d:
            hkg r4 = r1.d     // Catch: java.lang.Throwable -> Lc3
            if (r10 == 0) goto L55
            java.lang.String r5 = "frontend_id_key"
            java.lang.String r5 = r10.getString(r5)     // Catch: java.lang.Throwable -> Lc3
            boolean r6 = defpackage.akzg.f(r5)     // Catch: java.lang.Throwable -> Lc3
            r4.f = r6     // Catch: java.lang.Throwable -> Lc3
            if (r6 == 0) goto L52
            akyh r6 = r4.d     // Catch: java.lang.Throwable -> Lc3
            ankt r6 = r6.j(r5)     // Catch: java.lang.Throwable -> Lc3
            ampq r6 = r4.a(r6)     // Catch: java.lang.Throwable -> Lc3
            boolean r6 = r6.h()     // Catch: java.lang.Throwable -> Lc3
            if (r6 == 0) goto L55
            r4.e = r5     // Catch: java.lang.Throwable -> Lc3
            goto L7d
        L52:
            r4.e = r5     // Catch: java.lang.Throwable -> Lc3
            goto L7d
        L55:
            boolean r5 = r4.f     // Catch: java.lang.Throwable -> Lc3
            if (r5 == 0) goto L6b
            akyh r5 = r4.d     // Catch: java.lang.Throwable -> Lc3
            avui r6 = defpackage.avui.UPLOAD_CREATION_FLOW_SHORTS     // Catch: java.lang.Throwable -> Lc3
            hkf r7 = defpackage.hkg.a     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r5 = r5.s(r6, r7)     // Catch: java.lang.Throwable -> Lc3
            r4.e = r5     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r5 = "Upload Client API in use."
            defpackage.zep.l(r5)     // Catch: java.lang.Throwable -> Lc3
            goto L7d
        L6b:
            akzg r5 = r4.b     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r5 = r5.b()     // Catch: java.lang.Throwable -> Lc3
            r4.e = r5     // Catch: java.lang.Throwable -> Lc3
            albf r5 = r4.c     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r6 = r4.e     // Catch: java.lang.Throwable -> Lc3
            r7 = 0
            avul r8 = defpackage.avul.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_UPLOAD_CREATION_STARTED     // Catch: java.lang.Throwable -> Lc3
            r5.d(r6, r7, r8)     // Catch: java.lang.Throwable -> Lc3
        L7d:
            java.lang.String r4 = r4.e     // Catch: java.lang.Throwable -> Lc3
            com.google.android.apps.youtube.app.extensions.reel.creation.shorts.activity.ShortsCreationActivity r4 = r1.c     // Catch: java.lang.Throwable -> Lc3
            r5 = 2131625078(0x7f0e0476, float:1.8877354E38)
            r4.setContentView(r5)     // Catch: java.lang.Throwable -> Lc3
            if (r10 == 0) goto Lb2
            com.google.android.apps.youtube.app.extensions.reel.creation.shorts.activity.ShortsCreationActivity r10 = r1.c     // Catch: java.lang.Throwable -> Lc3
            eo r10 = r10.getSupportFragmentManager()     // Catch: java.lang.Throwable -> Lc3
            ex r4 = r10.l()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r5 = "ReelBrowseFragmentTag"
            dp r5 = r10.f(r5)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r6 = "SFV_AUDIO_SEARCH_FRAGMENT_TAG"
            dp r10 = r10.f(r6)     // Catch: java.lang.Throwable -> Lc3
            if (r5 == 0) goto La4
            r4.m(r5)     // Catch: java.lang.Throwable -> Lc3
        La4:
            if (r10 == 0) goto La9
            r4.m(r10)     // Catch: java.lang.Throwable -> Lc3
        La9:
            boolean r10 = r4.j()     // Catch: java.lang.Throwable -> Lc3
            if (r10 != 0) goto Lb2
            r4.a()     // Catch: java.lang.Throwable -> Lc3
        Lb2:
            r1.a(r2)     // Catch: java.lang.Throwable -> Lc3
            hkl r10 = r1.f     // Catch: java.lang.Throwable -> Lc3
            r10.o()     // Catch: java.lang.Throwable -> Lc3
            r10 = 0
            r9.e = r10     // Catch: java.lang.Throwable -> Lc3
            if (r0 == 0) goto Lc2
            r0.close()
        Lc2:
            return
        Lc3:
            r10 = move-exception
            if (r0 == 0) goto Lc9
            r0.close()     // Catch: java.lang.Throwable -> Lc9
        Lc9:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.extensions.reel.creation.shorts.activity.ShortsCreationActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.dt, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        amlw r = this.d.r();
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
        amlw c = this.d.c();
        try {
            super.onDestroy();
            gve g = g();
            if (g.c.isFinishing() && !g.b) {
                hkg hkgVar = g.d;
                if (hkgVar.f) {
                    hkgVar.c("Failure while abandoning upload.", hkgVar.d.c(hkgVar.e, avum.UPLOAD_PROCESSOR_ABANDONMENT_REASON_CANCELLED_CREATION));
                    hkgVar.d.B(hkg.a);
                }
            }
            this.c = true;
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
        return g().c(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return g().d(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        gve g = g();
        hes hesVar = ((hep) g.a.am).a;
        dp e = hesVar.mL().e(R.id.reel_container);
        if (hesVar.aM(e)) {
            gxz gxzVar = ((gxk) e).aK;
            if (!gxzVar.d && gxzVar.a.h(i)) {
                return true;
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, android.app.Activity
    public final void onNewIntent(Intent intent) {
        amlw d = this.d.d(intent);
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

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        amlw s = this.d.s();
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
        amlw e = this.d.e();
        try {
            gve g = g();
            if (g.c.isFinishing()) {
                g.c.setRequestedOrientation(-1);
            }
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
    @Override // defpackage.oa, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        amlw t = this.d.t();
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
        amlw f = this.d.f();
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
        amlw u = this.d.u();
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
        amlw g = this.d.g();
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
    @Override // defpackage.abp, defpackage.gb, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        amlw v = this.d.v();
        try {
            super.onSaveInstanceState(bundle);
            bundle.putString("frontend_id_key", g().d.e);
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
        amlw h = this.d.h();
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
        amlw i = this.d.i();
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
        amlw j = this.d.j();
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
        amlw k = this.d.k();
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
