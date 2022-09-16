package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: bhd  reason: default package */
/* loaded from: classes2.dex */
public final class bhd {
    static bgw a;
    final Context b;
    final ArrayList c = new ArrayList();

    public bhd(Context context) {
        this.b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.bgw a() {
        /*
            bgw r0 = defpackage.bhd.a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r2 = r0.b
            if (r2 == 0) goto Lc
            goto Lbd
        Lc:
            r2 = 1
            r0.b = r2
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 30
            r5 = 0
            if (r3 < r4) goto L48
            android.content.Context r3 = r0.a
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<androidx.mediarouter.media.MediaTransferReceiver> r6 = androidx.mediarouter.media.MediaTransferReceiver.class
            r4.<init>(r3, r6)
            java.lang.String r6 = r3.getPackageName()
            r4.setPackage(r6)
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            java.util.List r3 = r3.queryBroadcastReceivers(r4, r5)
            int r3 = r3.size()
            if (r3 <= 0) goto L35
            r5 = 1
        L35:
            r0.e = r5
            if (r5 == 0) goto L4a
            bfy r3 = new bfy
            android.content.Context r4 = r0.a
            bfq r5 = new bfq
            r5.<init>(r0)
            r3.<init>(r4, r5)
            r0.f = r3
            goto L4c
        L48:
            r0.e = r5
        L4a:
            r0.f = r1
        L4c:
            android.content.Context r3 = r0.a
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 24
            if (r4 < r5) goto L5a
            bib r4 = new bib
            r4.<init>(r3, r0)
            goto L5f
        L5a:
            bih r4 = new bih
            r4.<init>(r3, r0)
        L5f:
            r0.c = r4
            bhe r3 = new bhe
            bgq r4 = new bgq
            r4.<init>(r0)
            r3.<init>(r4)
            r0.o = r3
            bij r3 = r0.c
            r0.g(r3)
            bfy r3 = r0.f
            if (r3 == 0) goto L79
            r0.g(r3)
        L79:
            bhz r3 = new bhz
            android.content.Context r4 = r0.a
            r3.<init>(r4, r0)
            r0.d = r3
            bhz r0 = r0.d
            boolean r3 = r0.d
            if (r3 != 0) goto Lbd
            r0.d = r2
            android.content.IntentFilter r2 = new android.content.IntentFilter
            r2.<init>()
            java.lang.String r3 = "android.intent.action.PACKAGE_ADDED"
            r2.addAction(r3)
            java.lang.String r3 = "android.intent.action.PACKAGE_REMOVED"
            r2.addAction(r3)
            java.lang.String r3 = "android.intent.action.PACKAGE_CHANGED"
            r2.addAction(r3)
            java.lang.String r3 = "android.intent.action.PACKAGE_REPLACED"
            r2.addAction(r3)
            java.lang.String r3 = "android.intent.action.PACKAGE_RESTARTED"
            r2.addAction(r3)
            java.lang.String r3 = "package"
            r2.addDataScheme(r3)
            android.content.Context r3 = r0.a
            android.content.BroadcastReceiver r4 = r0.e
            android.os.Handler r5 = r0.c
            r3.registerReceiver(r4, r2, r1, r5)
            android.os.Handler r1 = r0.c
            java.lang.Runnable r0 = r0.f
            r1.post(r0)
        Lbd:
            bgw r0 = defpackage.bhd.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhd.a():bgw");
    }

    public static void c() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
    }

    public static boolean d() {
        Bundle bundle;
        if (a == null) {
            return false;
        }
        bhm bhmVar = a().p;
        return bhmVar == null || (bundle = bhmVar.c) == null || bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true);
    }

    public static boolean e() {
        if (a == null) {
            return false;
        }
        return a().e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f() {
        bhm bhmVar;
        bgw a2 = a();
        if (a2 == null || (bhmVar = a2.p) == null) {
            return false;
        }
        return bhmVar.b;
    }

    public static final bhc g() {
        c();
        return a().d();
    }

    public static final MediaSessionCompat$Token h() {
        bgw bgwVar = a;
        if (bgwVar == null) {
            return null;
        }
        bgv bgvVar = bgwVar.B;
        if (bgvVar != null) {
            return bgvVar.a.b();
        }
        iz izVar = bgwVar.C;
        if (izVar != null) {
            return izVar.b();
        }
        return null;
    }

    public static final List i() {
        c();
        bgw a2 = a();
        return a2 == null ? Collections.emptyList() : a2.h;
    }

    public static final bhc j() {
        c();
        return a().e();
    }

    public static final void m(iz izVar) {
        c();
        bgw a2 = a();
        a2.C = izVar;
        bgv bgvVar = izVar != null ? new bgv(a2, izVar) : null;
        bgv bgvVar2 = a2.B;
        if (bgvVar2 != null) {
            bgvVar2.a();
        }
        a2.B = bgvVar;
        if (bgvVar != null) {
            a2.m();
        }
    }

    public static final void n(bhm bhmVar) {
        c();
        bgw a2 = a();
        bhm bhmVar2 = a2.p;
        a2.p = bhmVar;
        if (a2.e) {
            if ((bhmVar2 == null ? false : bhmVar2.b) != bhmVar.b) {
                a2.f.jN(a2.x);
            }
        }
        a2.m.a(769, bhmVar);
    }

    private final int s(kt ktVar) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            if (((bgp) this.c.get(i)).e == ktVar) {
                return i;
            }
        }
        return -1;
    }

    public final void p(bgo bgoVar, kt ktVar) {
        q(bgoVar, ktVar, 0);
    }

    public static bhd b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        c();
        if (a == null) {
            a = new bgw(context.getApplicationContext());
        }
        bgw bgwVar = a;
        int size = bgwVar.g.size();
        while (true) {
            size--;
            if (size >= 0) {
                bhd bhdVar = (bhd) ((WeakReference) bgwVar.g.get(size)).get();
                if (bhdVar == null) {
                    bgwVar.g.remove(size);
                } else if (bhdVar.b == context) {
                    return bhdVar;
                }
            } else {
                bhd bhdVar2 = new bhd(context);
                bgwVar.g.add(new WeakReference(bhdVar2));
                return bhdVar2;
            }
        }
    }

    public static final boolean k(bgo bgoVar, int i) {
        if (bgoVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        c();
        bgw a2 = a();
        if (!bgoVar.d()) {
            if ((i & 2) == 0 && a2.n) {
                return true;
            }
            bhm bhmVar = a2.p;
            boolean z = bhmVar != null && bhmVar.a && a2.e;
            int size = a2.h.size();
            for (int i2 = 0; i2 < size; i2++) {
                bhc bhcVar = (bhc) a2.h.get(i2);
                if (((i & 1) == 0 || !bhcVar.j()) && ((!z || bhcVar.j() || bhcVar.c() == a2.f) && bhcVar.n(bgoVar))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void l(bhc bhcVar) {
        if (bhcVar == null) {
            throw new IllegalArgumentException("route must not be null");
        }
        c();
        a().j(bhcVar, 3);
    }

    public static final void o(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        c();
        bgw a2 = a();
        bhc c = a2.c();
        if (a2.e() == c) {
            return;
        }
        a2.j(c, i);
    }

    public final void r(kt ktVar) {
        if (ktVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        c();
        int s = s(ktVar);
        if (s < 0) {
            return;
        }
        this.c.remove(s);
        a().l();
    }

    public final void q(bgo bgoVar, kt ktVar, int i) {
        bgp bgpVar;
        int i2;
        if (bgoVar != null) {
            if (ktVar == null) {
                throw new IllegalArgumentException("callback must not be null");
            }
            c();
            int s = s(ktVar);
            if (s < 0) {
                bgpVar = new bgp(this, ktVar, null);
                this.c.add(bgpVar);
            } else {
                bgpVar = (bgp) this.c.get(s);
            }
            if (i != bgpVar.c) {
                bgpVar.c = i;
                i2 = 1;
            } else {
                i2 = 0;
            }
            int i3 = i2 | (i & 1);
            bgpVar.d = SystemClock.elapsedRealtime();
            bgo bgoVar2 = bgpVar.b;
            bgoVar2.c();
            bgoVar.c();
            if (!bgoVar2.c.containsAll(bgoVar.c)) {
                bgn bgnVar = new bgn(bgpVar.b);
                bgnVar.d(bgoVar);
                bgpVar.b = bgnVar.a();
            } else if (i3 == 0) {
                return;
            }
            a().l();
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }
}
