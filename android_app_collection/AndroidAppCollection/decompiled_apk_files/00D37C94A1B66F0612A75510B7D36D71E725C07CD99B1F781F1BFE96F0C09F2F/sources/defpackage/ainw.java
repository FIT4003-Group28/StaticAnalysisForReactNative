package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ainw  reason: default package */
/* loaded from: classes.dex */
public final class ainw implements aizo, ainn {
    public String a;
    public volatile List b;
    public adhn c;
    public adho d;
    private final Context e;
    private final BroadcastReceiver f;
    private final IntentFilter g;
    private final ainq h;
    private final aizp i;
    private final aioa j;
    private final snc k;
    private final aioe l;
    private final Handler m;
    private volatile boolean n;
    private final List o;
    private final Map p;
    private long q;
    private boolean r;
    private final aikh s;

    public ainw(Context context, aizp aizpVar, aizn aiznVar, aikh aikhVar, ainq ainqVar, aioa aioaVar, snc sncVar, aioe aioeVar, List list) {
        context.getClass();
        this.e = context;
        ainqVar.getClass();
        this.h = ainqVar;
        aizpVar.getClass();
        this.i = aizpVar;
        aikhVar.getClass();
        this.s = aikhVar;
        this.j = aioaVar;
        sncVar.getClass();
        this.k = sncVar;
        this.l = aioeVar;
        this.m = new Handler(Looper.getMainLooper());
        IntentFilter intentFilter = new IntentFilter();
        this.g = intentFilter;
        intentFilter.addAction("noop");
        intentFilter.addAction("android.intent.action.MAIN");
        intentFilter.addAction("com.google.android.libraries.youtube.player.action.controller_notification_delete");
        this.o = list;
        this.b = list;
        this.f = new aint(this, aiznVar, aioeVar);
        this.p = new HashMap();
        l(list);
    }

    private static void j(IntentFilter intentFilter, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (String str : ((aino) it.next()).e()) {
                intentFilter.addAction(str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0088, code lost:
        if (r13 == null) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void k(boolean r17) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ainw.k(boolean):void");
    }

    private final void l(List list) {
        amuk o = amuk.o(list);
        j(this.g, o);
        List<aino> list2 = this.b;
        this.b = o;
        List<aino> list3 = this.b;
        if (list2 != null) {
            for (aino ainoVar : list2) {
                ainoVar.h(null);
            }
        }
        for (aino ainoVar2 : list3) {
            ainoVar2.h(this);
        }
    }

    public final synchronized void b(boolean z) {
        this.i.a.remove(this);
        if (z) {
            this.h.a();
        }
        for (aino ainoVar : this.b) {
            ainoVar.g();
        }
        if (this.n) {
            this.n = false;
            this.e.unregisterReceiver(this.f);
            this.l.e();
        }
        if (this.r) {
            this.m.removeCallbacks(new ains(this));
            this.r = false;
        }
    }

    public final synchronized void c() {
        boolean z = false;
        this.r = false;
        if (this.n) {
            adhn adhnVar = this.c;
            if (adhnVar != null) {
                adoa adoaVar = (adoa) adhnVar.a.j.get();
                if (adoaVar.m() || adoaVar.d() == 0 || adoaVar.d() == 1) {
                    z = true;
                }
            } else {
                z = this.s.h();
            }
            k(z);
        }
    }

    @Override // defpackage.aizo
    public final void d(int i) {
        if ((i & 163) == 0) {
            return;
        }
        a(false);
    }

    public final void e() {
        f(this.o);
    }

    public final void f(List list) {
        if (this.b.equals(list)) {
            return;
        }
        l(list);
        a(false);
    }

    @Deprecated
    public final void g(aino ainoVar, aino ainoVar2) {
        this.p.put(ainoVar, ainoVar2);
        j(this.g, amuk.r(ainoVar2));
    }

    public final synchronized void h() {
        i(false);
    }

    public final synchronized void i(boolean z) {
        if (!this.n) {
            this.n = true;
            this.e.registerReceiver(this.f, this.g);
        }
        this.i.c(this);
        a(z);
    }

    public final synchronized void a(boolean z) {
        if (!z) {
            if (!this.n || this.r) {
                return;
            }
        }
        long d = this.k.d();
        if (z) {
            k(true);
            return;
        }
        long j = this.q + 200;
        if (d > j) {
            c();
            return;
        }
        this.m.postDelayed(new ains(this), Math.max(0L, j - d));
        this.r = true;
    }

    public ainw(Context context, aizp aizpVar, aizn aiznVar, aikh aikhVar, ainq ainqVar, aioa aioaVar, snc sncVar, List list) {
        this(context, aizpVar, aiznVar, aikhVar, ainqVar, aioaVar, sncVar, new aiod(), list);
    }
}
