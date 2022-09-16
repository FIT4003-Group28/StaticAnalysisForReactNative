package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: adew  reason: default package */
/* loaded from: classes.dex */
public final class adew extends bgk {
    public static final /* synthetic */ int q = 0;
    public final azqb a;
    public volatile boolean b;
    public boolean c;
    public int d;
    public final adev m;
    public final adeu n;
    public final Executor o;
    final String p;
    private final Map r;
    private final azqb s;
    private final azqb t;
    private final azqb u;
    private final boolean v;
    private final ankw w;

    static {
        zep.a("MDX.mediaroute");
    }

    public adew(Context context, Executor executor, ankw ankwVar, String str, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, boolean z) {
        super(context);
        this.r = new ConcurrentHashMap();
        this.b = false;
        this.c = false;
        this.m = new adev(this);
        this.a = azqbVar;
        this.s = azqbVar2;
        this.t = azqbVar3;
        this.u = azqbVar4;
        this.v = z;
        this.n = new adeu(this);
        this.o = executor;
        this.w = ankwVar;
        this.p = str;
    }

    public static String f(adig adigVar) {
        if (adigVar instanceof adid) {
            return ((adid) adigVar).n.c.replace("-", "").replace("uuid:", "");
        }
        return adigVar.g();
    }

    @Override // defpackage.bgk
    public final bgj b(String str) {
        adig adigVar = (adig) this.r.get(str);
        if (adigVar == null) {
            return null;
        }
        return new adfb(this.u, adigVar, this.t, str);
    }

    @Override // defpackage.bgk
    public final void d(final bgb bgbVar) {
        ylx.k(this.w.qp(new Callable() { // from class: ades
            @Override // java.util.concurrent.Callable
            public final Object call() {
                adew adewVar = adew.this;
                bgb bgbVar2 = bgbVar;
                String.valueOf(String.valueOf(bgbVar2)).length();
                bgo a = bgbVar2 != null ? bgbVar2.a() : null;
                if (a == null || !a.b().contains(adewVar.p)) {
                    ((adnq) adewVar.a.get()).i(adewVar.n);
                    adewVar.b = false;
                    adewVar.l();
                    return null;
                }
                ((adnq) adewVar.a.get()).h(adewVar.n);
                adewVar.b = true;
                adewVar.l();
                return adewVar.e();
            }
        }), this.o, acsn.m, new ylw() { // from class: ader
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                adew adewVar = adew.this;
                bgm bgmVar = (bgm) obj;
                if (bgmVar != null) {
                    adewVar.jL(bgmVar);
                }
            }
        });
    }

    public final bgm e() {
        String b;
        this.r.clear();
        bgl bglVar = new bgl();
        for (adig adigVar : ((adnq) this.a.get()).d()) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory(this.p);
            if (this.v) {
                b = adigVar.b();
                if (this.v) {
                    StringBuilder sb = new StringBuilder();
                    if (adigVar instanceof adid) {
                        sb.append("d");
                        if (((adid) adigVar).o()) {
                            sb.append(",w");
                        }
                    } else if (adigVar instanceof adhz) {
                        sb.append("ca");
                    } else if (adigVar instanceof adif) {
                        sb.append("cl");
                    }
                    if (sb.length() > 0) {
                        sb.insert(0, " <");
                        sb.append(">");
                    }
                    b = b.concat(sb.toString());
                }
            } else {
                b = adigVar.b();
            }
            bfz bfzVar = new bfz(f(adigVar), b);
            bfzVar.b(intentFilter);
            bfzVar.i(1);
            bfzVar.l(1);
            bfzVar.g(true);
            bfzVar.m(100);
            bfzVar.h(adigVar.r());
            bfzVar.f(1);
            adnt e = ((adoa) this.s.get()).e();
            if (e != null && adigVar.i(e.k())) {
                bfzVar.k(this.d);
                int a = e.a();
                if (a == 0) {
                    bfzVar.d(1);
                } else if (a == 1) {
                    bfzVar.d(2);
                }
            }
            bga a2 = bfzVar.a();
            bglVar.b(a2);
            this.r.put(a2.n(), adigVar);
        }
        return bglVar.a();
    }

    public final void l() {
        adnq adnqVar = (adnq) this.a.get();
        if (!this.b || this.c) {
            adnqVar.f(this.p);
        } else {
            adnqVar.g(this.p);
        }
    }
}
