package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: brx  reason: default package */
/* loaded from: classes2.dex */
public final class brx implements bqz, bso, bqv {
    Boolean a;
    private final Context b;
    private final brq c;
    private final bsp d;
    private final brw f;
    private boolean g;
    private final Set e = new HashSet();
    private final Object h = new Object();

    static {
        bqf.b("GreedyScheduler");
    }

    public brx(Context context, bps bpsVar, bwn bwnVar, brq brqVar) {
        this.b = context;
        this.c = brqVar;
        this.d = new bsp(context, bwnVar, this);
        this.f = new brw(this, bpsVar.d);
    }

    private final void g() {
        this.a = Boolean.valueOf(bvk.a(this.b, this.c.c));
    }

    private final void h() {
        if (!this.g) {
            this.c.f.b(this);
            this.g = true;
        }
    }

    @Override // defpackage.bqv
    public final void a(String str, boolean z) {
        synchronized (this.h) {
            Iterator it = this.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                bum bumVar = (bum) it.next();
                if (bumVar.c.equals(str)) {
                    bqf a = bqf.a();
                    String.format("Stopping tracking for %s", str);
                    a.d(new Throwable[0]);
                    this.e.remove(bumVar);
                    this.d.a(this.e);
                    break;
                }
            }
        }
    }

    @Override // defpackage.bqz
    public final void b(String str) {
        Runnable runnable;
        if (this.a == null) {
            g();
        }
        if (!this.a.booleanValue()) {
            bqf.a();
            bqf.f(new Throwable[0]);
            return;
        }
        h();
        bqf a = bqf.a();
        String.format("Cancelling work ID %s", str);
        a.d(new Throwable[0]);
        brw brwVar = this.f;
        if (brwVar != null && (runnable = (Runnable) brwVar.c.remove(str)) != null) {
            brwVar.b.a(runnable);
        }
        this.c.l(str);
    }

    @Override // defpackage.bqz
    public final void c(bum... bumVarArr) {
        if (this.a == null) {
            g();
        }
        if (!this.a.booleanValue()) {
            bqf.a();
            bqf.f(new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (bum bumVar : bumVarArr) {
            long a = bumVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (bumVar.r == 1) {
                if (currentTimeMillis < a) {
                    brw brwVar = this.f;
                    if (brwVar != null) {
                        Runnable runnable = (Runnable) brwVar.c.remove(bumVar.c);
                        if (runnable != null) {
                            brwVar.b.a(runnable);
                        }
                        brv brvVar = new brv(brwVar, bumVar);
                        brwVar.c.put(bumVar.c, brvVar);
                        brwVar.b.b(bumVar.a() - System.currentTimeMillis(), brvVar);
                    }
                } else if (bumVar.c()) {
                    if (Build.VERSION.SDK_INT < 23 || !bumVar.k.c) {
                        if (Build.VERSION.SDK_INT < 24 || !bumVar.k.a()) {
                            hashSet.add(bumVar);
                            hashSet2.add(bumVar.c);
                        } else {
                            bqf a2 = bqf.a();
                            String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", bumVar);
                            a2.d(new Throwable[0]);
                        }
                    } else {
                        bqf a3 = bqf.a();
                        String.format("Ignoring WorkSpec %s, Requires device idle.", bumVar);
                        a3.d(new Throwable[0]);
                    }
                } else {
                    bqf a4 = bqf.a();
                    String.format("Starting work for %s", bumVar.c);
                    a4.d(new Throwable[0]);
                    this.c.k(bumVar.c);
                }
            }
        }
        synchronized (this.h) {
            if (!hashSet.isEmpty()) {
                bqf a5 = bqf.a();
                String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2));
                a5.d(new Throwable[0]);
                this.e.addAll(hashSet);
                this.d.a(this.e);
            }
        }
    }

    @Override // defpackage.bqz
    public final boolean d() {
        return false;
    }

    @Override // defpackage.bso
    public final void e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            bqf a = bqf.a();
            String.format("Constraints met: Scheduling work ID %s", str);
            a.d(new Throwable[0]);
            this.c.k(str);
        }
    }

    @Override // defpackage.bso
    public final void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            bqf a = bqf.a();
            String.format("Constraints not met: Cancelling work ID %s", str);
            a.d(new Throwable[0]);
            this.c.l(str);
        }
    }
}
