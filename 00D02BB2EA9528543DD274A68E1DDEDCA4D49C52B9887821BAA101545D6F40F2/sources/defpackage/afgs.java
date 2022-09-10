package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ShortcutManager;
import android.net.Uri;
import android.os.Build;
import com.google.android.apps.maps.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: afgs  reason: default package */
/* loaded from: classes2.dex */
public final class afgs extends itb implements afha {
    public final WeakReference<Activity> a;
    public final dxio<ckcw> b;
    public final cqkj c;
    private final dxio<akfa> d;
    private final bvrb e;

    public afgs(Activity activity, dxio<akfa> dxioVar, dxio<ckcw> dxioVar2, cqkj cqkjVar, bvrb bvrbVar) {
        this.a = new WeakReference<>(activity);
        this.d = dxioVar;
        this.b = dxioVar2;
        this.c = cqkjVar;
        this.e = bvrbVar;
    }

    private final dehn<Boolean> J(boolean z, Callable<Boolean> callable) {
        if (z) {
            if (this.d.a().j().m()) {
                ((ckcn) this.b.a().a(ckfn.g)).a();
            }
            try {
                return deha.a(callable.call());
            } catch (Exception e) {
                return deha.b(e);
            }
        }
        afbp afbpVar = new afbp();
        deig d = deig.d();
        try {
            Activity activity = this.a.get();
            dbsk.s(activity);
            this.e.b(new afgr(this, activity, afbpVar, d, callable), bvrj.UI_THREAD);
            return d;
        } catch (NullPointerException e2) {
            return deha.b(e2);
        }
    }

    private final boolean K(int i) {
        return !this.d.a().j().m() || i == 2 || i == 3;
    }

    public static boolean e(Context context, Intent intent, @dzsi String str, @dzsi Runnable runnable) {
        btme a = btme.a(context);
        if (str != null) {
            a.b = str;
        }
        if (runnable != null) {
            a.c = runnable;
        }
        return a.d(intent);
    }

    @Override // defpackage.afha
    public final void B(final Context context, final Uri... uriArr) {
        J(K(4), new Callable(context, uriArr) { // from class: afge
            private final Context a;
            private final Uri[] b;

            {
                this.a = context;
                this.b = uriArr;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = this.a;
                Uri[] uriArr2 = this.b;
                btme a = btme.a(context2);
                boolean z = true;
                a.d = true;
                int i = 0;
                while (true) {
                    if (i >= 2) {
                        z = false;
                        break;
                    } else if (a.c(uriArr2[i])) {
                        break;
                    } else {
                        i++;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }

    @Override // defpackage.afha
    public final dehn<Boolean> C(Context context, dplx dplxVar) {
        return f(context, bvrq.a(dplxVar), 1);
    }

    @Override // defpackage.afha
    public final void D(dqdk dqdkVar) {
        try {
            Activity activity = this.a.get();
            dbsk.s(activity);
            E(activity, dqdkVar);
        } catch (NullPointerException e) {
            deha.b(e);
        }
    }

    @Override // defpackage.afha
    public final void E(Context context, dqdk dqdkVar) {
        String str;
        if ((dqdkVar.a & 1) != 0) {
            dplx dplxVar = dqdkVar.b;
            if (dplxVar == null) {
                dplxVar = dplx.g;
            }
            C(context, dplxVar);
            return;
        }
        dqmk dqmkVar = dqdkVar.c;
        if (dqmkVar == null) {
            dqmkVar = dqmk.c;
        }
        dnpq dnpqVar = dqmkVar.b;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        if ((dnpqVar.a & 2) != 0) {
            dqmk dqmkVar2 = dqdkVar.c;
            if (dqmkVar2 == null) {
                dqmkVar2 = dqmk.c;
            }
            dnpq dnpqVar2 = dqmkVar2.b;
            if (dnpqVar2 == null) {
                dnpqVar2 = dnpq.g;
            }
            str = dnpqVar2.c;
        } else {
            dqmk dqmkVar3 = dqdkVar.c;
            if (dqmkVar3 == null) {
                dqmkVar3 = dqmk.c;
            }
            str = dqmkVar3.a;
        }
        k(context, str, 1);
    }

    @Override // defpackage.afha
    public final void F(final Context context, final Intent intent, final String str) {
        J(K(4), new Callable(context, intent, str) { // from class: afgi
            private final Context a;
            private final Intent b;
            private final String c;

            {
                this.a = context;
                this.b = intent;
                this.c = str;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(afgs.e(this.a, this.b, this.c, null));
            }
        });
    }

    @Override // defpackage.afha
    public final void G(final Runnable runnable) {
        J(K(4), new Callable(runnable) { // from class: afgc
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z;
                try {
                    this.a.run();
                    z = true;
                } catch (RuntimeException unused) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    @Override // defpackage.afha
    public final void H(final Context context, final String str, int i) {
        J(K(i), new Callable(context, str) { // from class: afgp
            private final Context a;
            private final String b;

            {
                this.a = context;
                this.b = str;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean e;
                Context context2 = this.a;
                String str2 = this.b;
                btme a = btme.a(context2);
                if (dbsj.d(str2)) {
                    e = false;
                } else {
                    ahr ahrVar = new ahr();
                    ahrVar.c(a.a.getResources().getColor(R.color.google_white));
                    e = a.e(ahrVar, str2);
                }
                return Boolean.valueOf(e);
            }
        });
    }

    @Override // defpackage.afha
    public final dehn<Boolean> I(final Context context, final Intent intent) {
        return J(K(4), new Callable(context, intent) { // from class: afgf
            private final Context a;
            private final Intent b;

            {
                this.a = context;
                this.b = intent;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z;
                try {
                    this.a.sendBroadcast(this.b);
                    z = true;
                } catch (Exception unused) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    @Override // defpackage.afha
    public final dehn<Boolean> f(final Context context, final Intent intent, int i) {
        return J(K(i), new Callable(context, intent) { // from class: afgh
            private final Context a;
            private final Intent b;

            {
                this.a = context;
                this.b = intent;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(afgs.e(this.a, this.b, null, null));
            }
        });
    }

    @Override // defpackage.afha
    public final dehn<Boolean> i(final fd fdVar, final Intent intent, int i) {
        return J(K(i), new Callable(fdVar, intent) { // from class: afgk
            private final fd a;
            private final Intent b;

            {
                this.a = fdVar;
                this.b = intent;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z;
                try {
                    this.a.Y(this.b);
                    z = true;
                } catch (Exception unused) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    @Override // defpackage.afha
    public final dehn<Boolean> j(final Intent intent, final int i, int i2) {
        try {
            return J(K(i2), new Callable(this, intent, i) { // from class: afgl
                private final afgs a;
                private final Intent b;
                private final int c;

                {
                    this.a = this;
                    this.b = intent;
                    this.c = i;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    afgs afgsVar = this.a;
                    final Intent intent2 = this.b;
                    final int i3 = this.c;
                    Activity activity = afgsVar.a.get();
                    dbsk.s(activity);
                    final btme a = btme.a(activity);
                    dbsk.m(a.a instanceof Activity, "SafeActivityStarter.maybeStartActivityForResult can only be called from an activity context");
                    return Boolean.valueOf(intent2 == null ? false : a.f(new Runnable(a, intent2, i3) { // from class: btmb
                        private final btme a;
                        private final Intent b;
                        private final int c;

                        {
                            this.a = a;
                            this.b = intent2;
                            this.c = i3;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            btme btmeVar = this.a;
                            ((Activity) btmeVar.a).startActivityForResult(this.b, this.c);
                        }
                    }, intent2));
                }
            });
        } catch (NullPointerException e) {
            return deha.b(e);
        }
    }

    @Override // defpackage.afha
    public final dehn<Boolean> k(final Context context, final String str, int i) {
        return J(K(i), new Callable(context, str) { // from class: afgn
            private final Context a;
            private final String b;

            {
                this.a = context;
                this.b = str;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = this.a;
                return Boolean.valueOf(btme.a(context2).b(this.b));
            }
        });
    }

    @Override // defpackage.afha
    public final void l(final Context context, final Uri uri, int i) {
        J(K(i), new Callable(context, uri) { // from class: afgo
            private final Context a;
            private final Uri b;

            {
                this.a = context;
                this.b = uri;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = this.a;
                return Boolean.valueOf(btme.a(context2).c(this.b));
            }
        });
    }

    @Override // defpackage.afha
    public final void m(String str, int i) {
        try {
            Activity activity = this.a.get();
            dbsk.s(activity);
            k(activity, str, i);
        } catch (NullPointerException e) {
            deha.b(e);
        }
    }

    @Override // defpackage.afha
    public final void n(final Context context, final Intent intent, int i, final Runnable runnable) {
        J(K(i), new Callable(context, intent, runnable) { // from class: afgj
            private final Context a;
            private final Intent b;
            private final Runnable c;

            {
                this.a = context;
                this.b = intent;
                this.c = runnable;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(afgs.e(this.a, this.b, null, this.c));
            }
        });
    }

    @Override // defpackage.afha
    public final void o(Intent intent, int i) {
        try {
            Activity activity = this.a.get();
            dbsk.s(activity);
            f(activity, intent, i);
        } catch (NullPointerException e) {
            deha.b(e);
        }
    }

    @Override // defpackage.afha
    public final void p(final fd fdVar, final Intent intent, final int i, int i2) {
        J(K(i2), new Callable(fdVar, intent, i) { // from class: afgm
            private final fd a;
            private final Intent b;
            private final int c;

            {
                this.a = fdVar;
                this.b = intent;
                this.c = i;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z;
                try {
                    this.a.startActivityForResult(this.b, this.c);
                    z = true;
                } catch (Exception unused) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    @Override // defpackage.afha
    public final void q(final Context context, final ahr ahrVar, final String str, int i) {
        J(K(i), new Callable(context, ahrVar, str) { // from class: afgd
            private final Context a;
            private final ahr b;
            private final String c;

            {
                this.a = context;
                this.b = ahrVar;
                this.c = str;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = this.a;
                return Boolean.valueOf(btme.a(context2).e(this.b, this.c));
            }
        });
    }

    @Override // defpackage.afha
    public final void r(String str, int i) {
        try {
            Activity activity = this.a.get();
            dbsk.s(activity);
            H(activity, str, i);
        } catch (NullPointerException e) {
            deha.b(e);
        }
    }

    @Override // defpackage.afha
    public final boolean s() {
        return K(4);
    }

    @Override // defpackage.afha
    public final dehn<Boolean> t(final Context context, final jg jgVar, @dzsi final IntentSender intentSender) {
        return J(K(4), new Callable(context, jgVar, intentSender) { // from class: afgg
            private final Context a;
            private final jg b;
            private final IntentSender c;

            {
                this.a = context;
                this.b = jgVar;
                this.c = intentSender;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = this.a;
                jg jgVar2 = this.b;
                IntentSender intentSender2 = this.c;
                boolean z = true;
                try {
                    if (Build.VERSION.SDK_INT >= 26) {
                        ((ShortcutManager) context2.getSystemService(ShortcutManager.class)).requestPinShortcut(jgVar2.a(), intentSender2);
                    } else if (jk.a(context2)) {
                        Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                        jgVar2.c(intent);
                        if (intentSender2 == null) {
                            context2.sendBroadcast(intent);
                        } else {
                            context2.sendOrderedBroadcast(intent, null, new jj(intentSender2), null, -1, null, null);
                        }
                    }
                } catch (Exception unused) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }
}
