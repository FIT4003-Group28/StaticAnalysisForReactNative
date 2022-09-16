package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: acya  reason: default package */
/* loaded from: classes.dex */
public final class acya implements yjo {
    public static final /* synthetic */ int k = 0;
    public final adgc b;
    public final adeo c;
    public final yrj d;
    public final acwu e;
    public final ankw f;
    public final boolean g;
    public final yjs j;
    private final acxr n;
    private ankt o;
    private static final String l = zep.a("MDX.BackgroundScanTaskRunner");
    private static final acxt m = acxt.a().a();
    static final yjn a = new yjn(0, 30);
    public final Runnable i = new acxz(this);
    final Handler h = new Handler(Looper.getMainLooper());

    public acya(adgc adgcVar, adeo adeoVar, acxr acxrVar, yrj yrjVar, azqb azqbVar, acwu acwuVar, ankw ankwVar, boolean z) {
        this.b = adgcVar;
        this.c = adeoVar;
        this.n = acxrVar;
        this.d = yrjVar;
        this.j = (yjs) azqbVar.get();
        this.e = acwuVar;
        this.f = ankwVar;
        this.g = z;
    }

    public static /* synthetic */ void c(Throwable th) {
        String str = l;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 65);
        sb.append("Could not get available media routes for making background scan: ");
        sb.append(valueOf);
        zep.c(str, sb.toString());
    }

    private final amvn f() {
        HashSet hashSet = new HashSet();
        amzs it = this.n.a().iterator();
        while (it.hasNext()) {
            acxq acxqVar = (acxq) it.next();
            try {
                if (((acxt) ylx.g(acxqVar.a(), 5L, TimeUnit.SECONDS, m)).a) {
                    hashSet.add(acxqVar);
                }
            } catch (Exception e) {
                zep.d("Failed to read the clientConfig", e);
            }
        }
        return amvn.p(hashSet);
    }

    private static ankt g(final amvn amvnVar) {
        aqxo.y(!amvnVar.isEmpty());
        amuf amufVar = new amuf();
        amzs it = amvnVar.iterator();
        while (it.hasNext()) {
            amufVar.h(((acxq) it.next()).a());
        }
        final amuk g = amufVar.g();
        return anlz.j(g).a(new Callable() { // from class: acxy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                amvn<acxq> amvnVar2 = amvn.this;
                amuk amukVar = g;
                int i = acya.k;
                amzt listIterator = amukVar.listIterator();
                int i2 = Integer.MAX_VALUE;
                int i3 = Integer.MAX_VALUE;
                int i4 = 0;
                for (acxq acxqVar : amvnVar2) {
                    try {
                        acxt acxtVar = (acxt) anlz.y((Future) listIterator.next());
                        String.format(Locale.US, "client %s: enabled=%b scan_duration=%d scan_period=%d scan_period_no_devices=%d", acxqVar.b(), Boolean.valueOf(acxtVar.a), Integer.valueOf(acxtVar.b), Integer.valueOf(acxtVar.d), Integer.valueOf(acxtVar.c));
                        i4 = Math.max(i4, acxtVar.b);
                        i3 = Math.min(i3, acxtVar.c);
                        i2 = Math.min(i2, acxtVar.d);
                    } catch (ExecutionException e) {
                        String b = acxqVar.b();
                        zep.d(b.length() != 0 ? "Could not read the config values for ".concat(b) : new String("Could not read the config values for "), e);
                    }
                }
                acxs a2 = acxt.a();
                a2.c(i4);
                a2.d(i2);
                a2.e(i3);
                return a2.a();
            }
        }, anjk.a);
    }

    @Override // defpackage.yjo
    public final int a(Bundle bundle) {
        amvn f = f();
        if (f.isEmpty()) {
            return 0;
        }
        ylx.i(g(f), new acxw(this, 1));
        aqxo.y(!f.isEmpty());
        ankt g = g(f);
        this.o = g;
        ylx.k(g, ylx.a, acsn.i, new acxw(this));
        return 2;
    }

    public final void b(List list) {
        final amuk o;
        amvn f = f();
        if (!this.d.r()) {
            o = amuk.q();
            amzs it = f.iterator();
            while (it.hasNext()) {
                ((acxq) it.next()).d();
            }
        } else {
            o = amuk.o(list);
            amzs it2 = f.iterator();
            while (it2.hasNext()) {
                ((acxq) it2.next()).c(o);
            }
        }
        ylx.k(this.o, ylx.a, acsn.h, new ylw() { // from class: acxx
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                acya acyaVar = acya.this;
                acxt acxtVar = (acxt) obj;
                boolean isEmpty = o.isEmpty();
                int i = isEmpty ^ true ? acxtVar.d : acxtVar.c;
                String.format(Locale.US, "scheduling task with %s seconds of delay", Integer.valueOf(i));
                acyaVar.j.e("mdx_background_scanner", i, true, true != isEmpty ? 0 : 2, null, acya.a, false);
                acyaVar.j.c("mdx_fallback_background_scanner");
                acyaVar.h.removeCallbacks(acyaVar.i);
                acyaVar.b.K(acyaVar);
            }
        });
    }
}
