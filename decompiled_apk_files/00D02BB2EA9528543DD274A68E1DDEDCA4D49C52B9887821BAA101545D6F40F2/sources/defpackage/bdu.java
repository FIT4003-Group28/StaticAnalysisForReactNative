package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bdu  reason: default package */
/* loaded from: classes3.dex */
public final class bdu implements bcx, bel, bct {
    Boolean a;
    private final Context b;
    private final bdn c;
    private final bem d;
    private final bdt f;
    private boolean g;
    private final Set<bgh> e = new HashSet();
    private final Object h = new Object();

    static {
        bbz.f("GreedyScheduler");
    }

    public bdu(Context context, bbj bbjVar, bif bifVar, bdn bdnVar) {
        this.b = context;
        this.c = bdnVar;
        this.d = new bem(context, bifVar, this);
        this.f = new bdt(this, bbjVar.h);
    }

    private final void g() {
        this.a = Boolean.valueOf(bhg.a(this.b));
    }

    private final void h() {
        if (!this.g) {
            this.c.e.d(this);
            this.g = true;
        }
    }

    @Override // defpackage.bel
    public final void Ni(List<String> list) {
        for (String str : list) {
            bbz.e().a(new Throwable[0]);
            this.c.i(str);
        }
    }

    @Override // defpackage.bel
    public final void Nj(List<String> list) {
        for (String str : list) {
            bbz.e().a(new Throwable[0]);
            this.c.k(str);
        }
    }

    @Override // defpackage.bct
    public final void a(String str, boolean z) {
        synchronized (this.h) {
            Iterator<bgh> it = this.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                bgh next = it.next();
                if (next.a.equals(str)) {
                    bbz.e().a(new Throwable[0]);
                    this.e.remove(next);
                    this.d.a(this.e);
                    break;
                }
            }
        }
    }

    @Override // defpackage.bcx
    public final void b(bgh... bghVarArr) {
        if (this.a == null) {
            g();
        }
        if (!this.a.booleanValue()) {
            bbz.e().c(new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (bgh bghVar : bghVarArr) {
            long d = bghVar.d();
            long currentTimeMillis = System.currentTimeMillis();
            if (bghVar.p == 1) {
                if (currentTimeMillis < d) {
                    bdt bdtVar = this.f;
                    if (bdtVar != null) {
                        Runnable remove = bdtVar.b.remove(bghVar.a);
                        if (remove != null) {
                            bdtVar.c.a(remove);
                        }
                        bds bdsVar = new bds(bdtVar, bghVar);
                        bdtVar.b.put(bghVar.a, bdsVar);
                        bdtVar.c.a.postDelayed(bdsVar, bghVar.d() - System.currentTimeMillis());
                    }
                } else if (bghVar.e()) {
                    if (Build.VERSION.SDK_INT < 23 || !bghVar.i.c) {
                        if (Build.VERSION.SDK_INT < 24 || !bghVar.i.a()) {
                            hashSet.add(bghVar);
                            hashSet2.add(bghVar.a);
                        } else {
                            bbz.e().a(new Throwable[0]);
                        }
                    } else {
                        bbz.e().a(new Throwable[0]);
                    }
                } else {
                    bbz e = bbz.e();
                    String str = bghVar.a;
                    e.a(new Throwable[0]);
                    this.c.i(bghVar.a);
                }
            }
        }
        synchronized (this.h) {
            if (!hashSet.isEmpty()) {
                bbz e2 = bbz.e();
                TextUtils.join(",", hashSet2);
                e2.a(new Throwable[0]);
                this.e.addAll(hashSet);
                this.d.a(this.e);
            }
        }
    }

    @Override // defpackage.bcx
    public final void c(String str) {
        Runnable remove;
        if (this.a == null) {
            g();
        }
        if (!this.a.booleanValue()) {
            bbz.e().c(new Throwable[0]);
            return;
        }
        h();
        bbz.e().a(new Throwable[0]);
        bdt bdtVar = this.f;
        if (bdtVar != null && (remove = bdtVar.b.remove(str)) != null) {
            bdtVar.c.a(remove);
        }
        this.c.k(str);
    }

    @Override // defpackage.bcx
    public final boolean d() {
        return false;
    }
}
