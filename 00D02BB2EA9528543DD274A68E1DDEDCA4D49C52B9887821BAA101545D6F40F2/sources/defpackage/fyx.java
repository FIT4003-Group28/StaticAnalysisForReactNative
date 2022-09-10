package defpackage;

import android.app.Application;
import android.content.Context;
/* compiled from: PG */
/* renamed from: fyx  reason: default package */
/* loaded from: classes.dex */
public final class fyx implements eiy {
    public volatile dzsj<iqz> a;
    private final Application b;
    private final fza c;
    private final bvrv d;
    private final bvjj e;
    private volatile Object f = new dxjf();
    private volatile Object g = new dxjf();
    private volatile Object h = new dxjf();
    private volatile Object i = new dxjf();
    private volatile Object j = new dxjf();

    public fyx(fza fzaVar, Application application, bvrv bvrvVar, bvjj bvjjVar) {
        this.b = application;
        this.c = fzaVar;
        this.d = bvrvVar;
        this.e = bvjjVar;
    }

    @Override // defpackage.eiy
    public final akpw a() {
        Object obj;
        Object obj2 = this.f;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.f;
                if (obj instanceof dxjf) {
                    aluk alukVar = new aluk(c());
                    dxjc.d(this.f, alukVar);
                    this.f = alukVar;
                    obj = alukVar;
                }
            }
            obj2 = obj;
        }
        return (akpw) obj2;
    }

    @Override // defpackage.eiy
    public final amcp b() {
        Object obj;
        Object obj2 = this.g;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.g;
                if (obj instanceof dxjf) {
                    amdq amdqVar = new amdq(c(), a());
                    dxjc.d(this.g, amdqVar);
                    this.g = amdqVar;
                    obj = amdqVar;
                }
            }
            obj2 = obj;
        }
        return (amcp) obj2;
    }

    @Override // defpackage.eiy
    public final akpx c() {
        Object obj;
        Object obj2 = this.i;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.i;
                if (obj instanceof dxjf) {
                    iqz e = e();
                    eje f = ((fyz) this.c).a.f();
                    dxjg.e(f);
                    dbty<dbsg<ddla>> dbtyVar = fyy.a;
                    hwi hwiVar = new hwi();
                    dxjg.b(e);
                    hwiVar.a = e;
                    hwiVar.b = f;
                    hwiVar.c = dbtyVar;
                    dxjg.a(hwiVar.a, iqz.class);
                    dxjg.a(hwiVar.b, akpy.class);
                    dxjg.a(hwiVar.c, dbty.class);
                    obj = new hwk(hwiVar.a, hwiVar.b);
                    dxjc.d(this.i, obj);
                    this.i = obj;
                }
            }
            obj2 = obj;
        }
        return (akpx) obj2;
    }

    @Override // defpackage.eiy
    public final ahkm d() {
        Object obj;
        Object obj2 = this.j;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.j;
                if (obj instanceof dxjf) {
                    iqz e = e();
                    amcp b = b();
                    eje f = ((fyz) this.c).a.f();
                    dxjg.e(f);
                    ahlz ahlzVar = new ahlz();
                    dxjg.b(e);
                    ahlzVar.a = e;
                    dxjg.b(b);
                    ahlzVar.b = b;
                    ahlzVar.c = f;
                    dxjg.a(ahlzVar.a, iqz.class);
                    dxjg.a(ahlzVar.b, amcp.class);
                    dxjg.a(ahlzVar.c, ahkn.class);
                    obj = new ahmb(ahlzVar.a, ahlzVar.c);
                    dxjc.d(this.j, obj);
                    this.j = obj;
                }
            }
            obj2 = obj;
        }
        return (ahkm) obj2;
    }

    public final iqz e() {
        Object obj;
        Object obj2 = this.h;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.h;
                if (obj instanceof dxjf) {
                    Application application = this.b;
                    dbty<dbsg<ddla>> dbtyVar = fyy.a;
                    bvrv bvrvVar = this.d;
                    bvjj bvjjVar = this.e;
                    ira iraVar = new ira();
                    dxjg.b(application);
                    iraVar.a = application;
                    iraVar.b = "GMM";
                    iraVar.c = dbtyVar;
                    dxjg.b(bvrvVar);
                    iraVar.e = bvrvVar;
                    dxjg.b(application);
                    iraVar.d = application;
                    dxjg.b(bvjjVar);
                    iraVar.f = bvjjVar;
                    dxjg.a(iraVar.a, Application.class);
                    dxjg.a(iraVar.b, String.class);
                    dxjg.a(iraVar.c, dbty.class);
                    dxjg.a(iraVar.d, Context.class);
                    dxjg.a(iraVar.e, bvrv.class);
                    dxjg.a(iraVar.f, bvjj.class);
                    obj = new irc(iraVar.a, iraVar.b, iraVar.c, iraVar.d, iraVar.e, iraVar.f);
                    dxjc.d(this.h, obj);
                    this.h = obj;
                }
            }
            obj2 = obj;
        }
        return (iqz) obj2;
    }
}
