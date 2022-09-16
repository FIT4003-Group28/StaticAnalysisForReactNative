package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: amkr  reason: default package */
/* loaded from: classes.dex */
public final class amkr {
    public amlv a;
    public amlv b;
    public amlw d;
    private final Activity f;
    private final Context g;
    private amlw l;
    private amlw m;
    private amlw n;
    private final Runnable e = new Runnable() { // from class: amkp
        @Override // java.lang.Runnable
        public final void run() {
            amkr.this.a = null;
        }
    };
    private final amlw h = new amkm(this, 3);
    private final amlw i = new amkm(this, 1);
    private boolean j = false;
    private boolean k = false;
    public boolean c = false;

    private amkr(Activity activity, Context context) {
        this.f = activity;
        this.g = context;
    }

    private final void A() {
        if (this.j) {
            this.a = null;
            this.j = false;
        }
    }

    private final void B() {
        amlw amlwVar = this.d;
        if (amlwVar == null) {
            return;
        }
        String valueOf = String.valueOf(amlwVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
        sb.append("Expected lifecycleStepSpan to be null but was:");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    public static amkr a(Activity activity) {
        return new amkr(activity, activity);
    }

    private final amlt w(amlt amltVar) {
        return amlt.d(amltVar, amlt.c(((ammc) awwc.u(this.g, ammc.class)).ko()));
    }

    private final amlw x(String str) {
        if (amna.o()) {
            return amna.m(str, w(amls.a));
        }
        return antz.t(this.g).a(str);
    }

    private final String y(String str) {
        String simpleName = this.g.getClass().getSimpleName();
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(simpleName).length());
        sb.append(str);
        sb.append(" ");
        sb.append(simpleName);
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r7v7, types: [amlw, amlv] */
    private final void z(String str, String str2, Intent intent) {
        amlt amltVar;
        this.b = amna.a();
        amlv h = ammo.h(intent);
        amlt amltVar2 = amlu.a;
        amkq amkqVar = new amkq();
        amlr b = amlt.b();
        b.a(amlu.c, amkqVar);
        amlt e = ((amlt) b).e();
        if (h != null) {
            amna.e(h);
            this.a = h;
            amltVar = w(amltVar2);
        } else {
            this.k = amna.q();
            if (!amna.o()) {
                amlv d = amna.d();
                if (d != null) {
                    this.l = d;
                    amlv f = d.f(y(str), e);
                    this.m = f;
                    amna.e(f);
                    this.n = new amlp(this.m);
                } else {
                    this.l = antz.t(this.g).b(y(str), amltVar2);
                }
            } else {
                amltVar2 = w(amltVar2);
            }
            this.a = amna.a();
            amltVar = amltVar2;
        }
        this.d = amna.m(y(str2), amltVar);
        uwp.h(this.e);
    }

    public final amlw b() {
        B();
        final amlw x = x("Back pressed");
        final amlw p = amna.p();
        return new amlw() { // from class: amko
            @Override // defpackage.amlw, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                amlw amlwVar = amlw.this;
                try {
                    p.close();
                    amlwVar.close();
                } catch (Throwable th) {
                    try {
                        amlwVar.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
        };
    }

    public final amlw c() {
        n("onDestroy");
        return new amkm(this);
    }

    public final amlw d(Intent intent) {
        aqxo.y(this.f != null);
        z("Reintenting into", "onNewIntent", intent);
        return this.h;
    }

    public final amlw e() {
        n("onPause");
        return this.i;
    }

    public final amlw f() {
        this.b = amna.a();
        amna.e(this.a);
        return new amkm(this, 2);
    }

    public final amlw g() {
        A();
        n("onResume");
        return this.h;
    }

    public final amlw h() {
        A();
        n("onStart");
        return this.h;
    }

    public final amlw i() {
        n("onStop");
        return this.i;
    }

    public final amlw j() {
        B();
        return x("onSupportNavigateUp");
    }

    public final amlw k() {
        B();
        return x("onUserInteraction");
    }

    public final void l(aps apsVar) {
        aps apsVar2 = aps.ON_CREATE;
        int ordinal = apsVar.ordinal();
        if (ordinal == 0) {
            if (!this.c) {
                return;
            }
            o();
            this.c = false;
        } else if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5) {
            o();
        } else {
            String valueOf = String.valueOf(apsVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
            sb.append("Unknown lifecycle: ");
            sb.append(valueOf);
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    public final void m() {
        this.j = true;
        Activity activity = this.f;
        if (activity == null || activity.isChangingConfigurations() || this.f.isFinishing()) {
            return;
        }
        this.a = null;
    }

    public final void n(String str) {
        this.b = amna.a();
        amlt amltVar = amlu.a;
        amlv amlvVar = this.a;
        if (amlvVar != null) {
            amna.e(amlvVar);
            amltVar = w(amltVar);
        } else {
            this.k = amna.q();
            if (!amna.o()) {
                amly t = antz.t(this.g);
                Class<?> cls = this.g.getClass();
                amlt amltVar2 = amlu.a;
                String simpleName = cls.getSimpleName();
                StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + str.length());
                sb.append(simpleName);
                sb.append(": ");
                sb.append(str);
                this.l = t.a.b(sb.toString(), amlt.d(t.b, amltVar2), t.c);
            } else {
                amltVar = w(amltVar);
            }
            this.a = amna.a();
        }
        this.d = amna.m(y(str), amltVar);
    }

    public final void o() {
        amlw amlwVar = this.d;
        amlwVar.getClass();
        amlwVar.close();
        this.d = null;
        if (this.k) {
            this.k = false;
            amna.j();
        }
        amlw amlwVar2 = this.n;
        if (amlwVar2 != null) {
            amlwVar2.close();
            this.n = null;
            this.m = null;
        }
        amlw amlwVar3 = this.l;
        if (amlwVar3 != null) {
            amlwVar3.close();
            this.l = null;
        }
        amna.e(this.b);
        this.b = null;
    }

    public final amlw p() {
        B();
        return x("onActivityResult");
    }

    public final amlw q() {
        Activity activity = this.f;
        if (activity != null) {
            z("Intenting into", "onCreate", activity.getIntent());
        } else {
            A();
            n("onCreate");
        }
        return this.h;
    }

    public final amlw r() {
        amlw f = amna.f();
        if (amna.o()) {
            return f;
        }
        amly t = antz.t(this.g);
        String simpleName = this.g.getClass().getSimpleName();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 19);
        sb.append(simpleName);
        sb.append(": onCreatePanelMenu");
        final amlv a = t.a(sb.toString());
        return new amlw() { // from class: amkn
            /* JADX WARN: Type inference failed for: r0v0, types: [amln, amlv] */
            @Override // defpackage.amlw, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                amna.i(amln.this);
                amna.j();
            }
        };
    }

    public final amlw s() {
        B();
        return x("onOptionsItemSelected");
    }

    public final amlw t() {
        A();
        n("onPostCreate");
        return this.h;
    }

    public final amlw u() {
        return x("onRequestPermissionsResult");
    }

    public final amlw v() {
        n("onSaveInstanceState");
        return this.i;
    }
}
