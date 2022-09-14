package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: egu  reason: default package */
/* loaded from: classes.dex */
public class egu {
    public boolean A;
    @dzsi
    public acyu B;
    @dzsi
    public glg C;
    @dzsi
    public View E;
    @dzsi
    public egr F;
    public int G;
    @dzsi
    public dbty<Integer> H;
    @dzsi
    public View K;
    @dzsi
    public dbty<Integer> L;
    @dzsi
    public dbty<Integer> M;
    @dzsi
    public View N;
    @dzsi
    public egl O;
    @dzsi
    public View P;
    @dzsi
    public dbty<Integer> Q;
    @dzsi
    public jar T;
    @dzsi
    public View W;
    public boolean X;
    @dzsi
    public View Y;
    public final ggc a;
    public boolean aA;
    @dzsi
    public int aD;
    @dzsi
    public int aF;
    public boolean aa;
    @dzsi
    public egk ac;
    public boolean af;
    @dzsi
    public jar ag;
    @dzsi
    public cqiw<jar> ah;
    @dzsi
    public bxaz ai;
    @dzsi
    public jar aj;
    @dzsi
    public egq am;
    public boolean an;
    @dzsi
    public ecs ao;
    @dzsi
    public cqss aq;
    @dzsi
    public brav as;
    @dzsi
    public View av;
    public boolean aw;
    public boolean ax;
    public boolean ay;
    public boolean az;
    @dzsi
    public cqiw<?> b;
    @dzsi
    public izs c;
    @dzsi
    public View g;
    @dzsi
    public View n;
    @dzsi
    public jkh o;
    @dzsi
    public jke p;
    @dzsi
    public egd q;
    @dzsi
    public cqjg r;
    @dzsi
    public egf s;
    @dzsi
    public Callable<Integer> t;
    @dzsi
    public Callable<Integer> u;
    @dzsi
    public Callable<Integer> v;
    public boolean w;
    @dzsi
    public View y;
    public boolean z;
    public boolean d = true;
    public boolean e = false;
    public jjn f = jjn.COLLAPSED;
    public jjn h = jjn.COLLAPSED;
    public boolean i = false;
    public jjn j = jjn.COLLAPSED;
    public jkc k = jkc.c;
    public jkc l = jkc.l;
    public egn m = egn.ONE_THIRD_EXPANDED_MAP;
    public int aB = 1;
    public int aC = 1;
    public int x = -1;
    public boolean D = true;
    public int aE = 1;
    public boolean I = true;
    public cjmu J = cjmu.LEGACY;
    public int aG = 1;
    public boolean R = true;
    public boolean S = true;
    public int U = -1;
    public int V = -1;
    public int aH = 1;
    public boolean Z = true;
    public int ab = -1;
    public final List<View> ad = new ArrayList(2);
    public cjxf ae = cjxf.SMALL;
    public boolean ak = true;
    public int al = 0;
    public boolean ap = false;
    public boolean ar = true;
    public boolean at = false;
    @dzsi
    public aliw au = null;

    public egu(ggc ggcVar) {
        this.a = ggcVar;
    }

    public static void a(cjqp cjqpVar, @dzsi View... viewArr) {
        if (viewArr == null) {
            return;
        }
        for (View view : viewArr) {
            if (view != null) {
                cjqpVar.a().i(cjqpVar, view);
            }
        }
    }

    public final boolean b() {
        return this.y != null;
    }

    public final boolean c() {
        int i = this.U;
        return i == -1 ? !b() && this.P == null : i == 2;
    }

    public final egf d() {
        egf egfVar = this.s;
        return egfVar != null ? egfVar : egf.a();
    }

    public final fd e() {
        return this.a.Ny();
    }

    public final boolean f() {
        bxaz bxazVar;
        return c() && (bxazVar = this.ai) != null && bxazVar.d().booleanValue();
    }

    public final boolean g(Context context, dvrz dvrzVar) {
        if (this.x != -1) {
            return false;
        }
        if (!btpf.c(context).e && !dvrzVar.b) {
            return false;
        }
        return c();
    }

    public final dcdc<View> h() {
        return dcdc.r(this.ad);
    }

    public final int i() {
        dbty<Integer> dbtyVar = this.H;
        return dbtyVar != null ? dbtyVar.a().intValue() : this.G;
    }

    public final ege j(int i) {
        return new ege(this, i, this.aa);
    }

    public final void k() {
        this.al = 2;
    }
}
