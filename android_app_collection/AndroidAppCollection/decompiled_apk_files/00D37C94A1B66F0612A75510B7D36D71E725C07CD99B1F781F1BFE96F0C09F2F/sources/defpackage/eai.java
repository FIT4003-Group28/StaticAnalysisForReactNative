package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.FileObserver;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.apps.youtube.app.extensions.appindexing.WatchVideoIndexer;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: eai  reason: default package */
/* loaded from: classes3.dex */
public final class eai implements dzc {
    azqb A;
    azqb B;
    azqb C;
    azqb D;
    azqb E;
    azqb F;
    azqb G;
    azqb H;
    azqb I;

    /* renamed from: J  reason: collision with root package name */
    azqb f200J;
    azqb K;
    azqb L;
    azqb M;
    azqb N;
    azqb O;
    azqb P;
    azqb Q;
    azqb R;
    azqb S;
    azqb T;
    azqb U;
    azqb V;
    azqb W;
    azqb X;
    azqb Y;
    azqb Z;
    Executor a;
    azqb aA;
    azqb aB;
    azqb aC;
    azqb aD;
    azqb aE;
    azqb aF;
    azqb aG;
    azqb aH;
    azqb aI;
    azqb aJ;
    azqb aK;
    azqb aL;
    azqb aM;
    azqb aN;
    azqb aO;
    azqb aP;
    azqb aQ;
    azqb aR;
    azqb aS;
    azqb aT;
    azqb aU;
    azqb aV;
    azqb aW;
    azqb aX;
    azqb aY;
    azqb aZ;
    azqb aa;
    azqb ab;
    azqb ac;
    azqb ad;
    azqb ae;
    azqb af;
    azqb ag;
    azqb ah;
    azqb ai;
    azqb aj;
    azqb ak;
    azqb al;
    azqb am;
    azqb an;
    azqb ao;
    azqb ap;
    azqb aq;
    azqb ar;
    azqb as;
    azqb at;
    azqb au;
    azqb av;
    azqb aw;
    azqb ax;
    azqb ay;
    azqb az;
    ayor b;
    azqb ba;
    azqb bb;
    azqb bc;
    azqb bd;
    azqb be;
    axnm bf;
    axnm bg;
    axnm bh;
    axnm bi;
    axnm bj;
    axnm bk;
    axnm bl;
    axnm bm;
    axnm bn;
    axnm bo;
    axnm bp;
    axnm bq;
    public FileObserver br;
    public ymg bt;
    aacz bu;
    SharedPreferences c;
    efz d;
    snc e;
    Application f;
    ywk g;
    aaau h;
    ankt i;
    azqb j;
    azqb k;
    azqb l;
    azqb m;
    azqb n;
    azqb o;
    azqb p;
    azqb q;
    azqb r;
    azqb s;
    azqb t;
    azqb u;
    azqb v;
    azqb w;
    azqb x;
    azqb y;
    azqb z;
    public final azpw bs = azpw.Y();
    private final azpo bv = azpo.W();

    /* JADX WARN: Removed duplicated region for block: B:149:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0988  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x098e  */
    @Override // defpackage.dzc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 2483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eai.a():void");
    }

    public final apfn b() {
        atfw atfwVar = this.bu.b().k;
        if (atfwVar == null) {
            atfwVar = atfw.a;
        }
        apfn apfnVar = atfwVar.p;
        return apfnVar == null ? apfn.a : apfnVar;
    }

    public final void c(Boolean bool, Throwable th) {
        long h;
        String str;
        ymg ymgVar = this.bt;
        if (ymgVar != null) {
            h = ymgVar.h();
        } else if (Build.VERSION.SDK_INT >= 24) {
            h = Process.getStartElapsedRealtime();
        } else {
            h = SystemClock.elapsedRealtime();
        }
        acvh acvhVar = (acvh) this.n.get();
        yxe yxeVar = this.d.b;
        String[] strArr = acwj.a;
        if (yxeVar.a) {
            TimeUnit.MILLISECONDS.toMicros(h);
            List<yxd> list = yxeVar.c;
            asny asnyVar = asny.LATENCY_ACTION_STARTUP;
            acvhVar.r(asnyVar, h);
            aopa createBuilder = asno.a.createBuilder();
            createBuilder.copyOnWrite();
            asno asnoVar = (asno) createBuilder.instance;
            asnoVar.d = asnyVar.bL;
            asnoVar.b |= 1;
            createBuilder.copyOnWrite();
            asno asnoVar2 = (asno) createBuilder.instance;
            asnoVar2.b |= 8;
            asnoVar2.g = "cold";
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            createBuilder.copyOnWrite();
            asno asnoVar3 = (asno) createBuilder.instance;
            asnoVar3.c |= 128;
            asnoVar3.s = availableProcessors;
            String str2 = Build.VERSION.SDK;
            createBuilder.copyOnWrite();
            asno asnoVar4 = (asno) createBuilder.instance;
            str2.getClass();
            asnoVar4.c |= 256;
            asnoVar4.t = str2;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                createBuilder.copyOnWrite();
                asno asnoVar5 = (asno) createBuilder.instance;
                asnoVar5.b |= 16;
                asnoVar5.h = booleanValue;
            }
            if (th != null) {
                createBuilder.copyOnWrite();
                asno asnoVar6 = (asno) createBuilder.instance;
                asnoVar6.u = 1;
                asnoVar6.c |= 8192;
                afus.c(2, 18, "SS wait for schedulers", th);
            }
            acvhVar.n(asnyVar, (asno) createBuilder.mo39build());
            ArrayList arrayList = new ArrayList(256);
            int i = 0;
            for (yxd yxdVar : list) {
                yxa[] yxaVarArr = yxdVar.a;
                for (int i2 = 0; i2 < 2; i2++) {
                    yxaVarArr[i2].d(arrayList);
                }
                yxa[] yxaVarArr2 = yxdVar.a;
                int i3 = 0;
                for (int i4 = 0; i4 < 2; i4++) {
                    i3 += yxaVarArr2[i4].a();
                }
                i += i3;
                for (Throwable th2 : yxdVar.b) {
                    afus.c(2, 18, "SS non fatal error", th2);
                }
            }
            if (i > 0) {
                afus.b(1, 18, "SS tasks after noMoreTasksAreLikely");
            }
            zdb zdbVar = yxeVar.m;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                yxb yxbVar = (yxb) arrayList.get(i5);
                String str3 = yxbVar.b;
                if (str3 != null) {
                    acvhVar.p(asnyVar, acwj.a(str3, yxbVar.d, yxbVar.e));
                }
            }
            for (yxd yxdVar2 : list) {
                AtomicReference atomicReference = yxdVar2.c;
                yxj yxjVar = atomicReference != null ? (yxj) atomicReference.get() : null;
                if (yxjVar != null) {
                    acvhVar.p(asnyVar, acwj.a(acwj.b(yxjVar), yxjVar, null));
                }
            }
            for (yxj yxjVar2 : yxeVar.i) {
                acvhVar.p(asnyVar, acwj.a(acwj.b(yxjVar2), yxjVar2, null));
            }
            for (yxb yxbVar2 : yxeVar.h) {
                if (yxbVar2.c != -1) {
                    str = acwj.a[yxbVar2.c];
                } else {
                    str = yxbVar2.b;
                }
                acvhVar.p(asnyVar, acwj.a(str, yxbVar2.d, yxbVar2.e));
            }
        }
        yxe yxeVar2 = this.d.b;
        yxi yxiVar = yxeVar2.f;
        for (ylq ylqVar : ylq.a) {
            ylqVar.b.a.remove(yxiVar);
        }
        yxi yxiVar2 = yxeVar2.f;
        Iterator it = ylp.a.iterator();
        if (it.hasNext()) {
            ylp ylpVar = (ylp) it.next();
            throw null;
        }
        yxm yxmVar = yxeVar2.g;
        if (yxmVar != null) {
            yxmVar.a();
        }
        if (yxeVar2.b) {
            return;
        }
        for (yxd yxdVar3 : yxeVar2.c) {
            yxa[] yxaVarArr3 = yxdVar3.a;
            for (int i6 = 0; i6 < 2; i6++) {
                yxaVarArr3[i6].f();
            }
        }
        yxeVar2.c.clear();
        zdb zdbVar2 = yxeVar2.m;
    }

    public final void d() {
        boolean z;
        ylr.c();
        try {
            z = ((Boolean) this.i.get(500L, TimeUnit.MILLISECONDS)).booleanValue();
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            z = false;
        }
        ((etn) this.an.get()).b(((dwk) this.f).c(), ((dwk) this.f).b(), z, ((Boolean) this.aY.get()).booleanValue());
        yni yniVar = (yni) this.z.get();
        Iterator it = ((Set) this.L.get()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            exn exnVar = (exn) it.next();
            if (exnVar.c()) {
                exnVar.b((acvp) this.M.get());
                ymg a = exnVar.a();
                this.bt = a;
                if (a != null) {
                    yniVar.f(a);
                    break;
                }
            }
        }
        aaqd b = this.h.b();
        yniVar.f(new evu(b.k));
        yniVar.f(new ewm(b.l));
        yniVar.f(new ewq(b.m));
        ((acux) this.j.get()).f();
        this.bv.sm();
    }

    public final void e(boolean z) {
        if (z) {
            ((Executor) this.aW.get()).execute(new dzv(this, 15));
        } else {
            this.aI.get();
        }
    }

    public final void f(boolean z) {
        ((aksw) this.ab.get()).c(z, this.ax);
    }

    public final void h() {
        boolean z;
        ylr.c();
        try {
            z = ((Boolean) this.i.get(500L, TimeUnit.MILLISECONDS)).booleanValue();
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            z = false;
        }
        ((etn) this.an.get()).b(((dwk) this.f).c(), ((dwk) this.f).b(), z, ((Boolean) this.aY.get()).booleanValue());
    }

    public final void i() {
        this.c.registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) this.bc.get());
        this.h.a().a.V(dzy.a).B().at(new dzu(this, 4), dzq.c);
    }

    public final void j(boolean z) {
        File[] listFiles;
        if (z && (listFiles = ((File) this.aR.get()).listFiles()) != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
        ((akid) this.bh.get()).d();
        ((WatchVideoIndexer) this.bi.get()).h();
    }
}
