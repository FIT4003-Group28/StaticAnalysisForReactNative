package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: zju  reason: default package */
/* loaded from: classes7.dex */
public final class zju {
    private final cjqy a;
    private final cjqq b;
    private final gga c;
    private final zmz d;
    private final zqm e;
    private final yys f;
    private final xkl g;
    private final zce h;
    private final btvo i;
    private final xfc j;
    private final xfd k;
    private final Executor l;
    private final cqhn m;
    private final bvjj n;
    private final dxio<afha> o;
    private final Future<Boolean> p;
    private final qbv q;
    private final xhk r;
    private final dxio<zqv> s;
    private final zaz t;
    private final zpj u;
    private final ckcw v;

    public zju(cjqy cjqyVar, cjqq cjqqVar, gga ggaVar, zmz zmzVar, zqm zqmVar, avij avijVar, yys yysVar, bvjj bvjjVar, dxio<afha> dxioVar, btvo btvoVar, xfc xfcVar, xfd xfdVar, Executor executor, cqhn cqhnVar, qbv qbvVar, xhk xhkVar, dxio<zqv> dxioVar2, zaz zazVar, zpj zpjVar, ckcw ckcwVar, xkl xklVar, zce zceVar) {
        this.a = cjqyVar;
        this.b = cjqqVar;
        this.c = ggaVar;
        this.d = zmzVar;
        this.e = zqmVar;
        this.f = yysVar;
        this.n = bvjjVar;
        this.o = dxioVar;
        this.i = btvoVar;
        this.j = xfcVar;
        this.k = xfdVar;
        this.l = executor;
        this.m = cqhnVar;
        this.q = qbvVar;
        this.g = xklVar;
        this.h = zceVar;
        this.r = xhkVar;
        this.s = dxioVar2;
        this.t = zazVar;
        this.u = zpjVar;
        this.v = ckcwVar;
        this.p = avijVar.w();
    }

    private final boolean c() {
        if (!this.p.isDone()) {
            return false;
        }
        return Boolean.TRUE.equals(deha.s(this.p));
    }

    private final zjz d(dqvj dqvjVar, vmx vmxVar, @dzsi String str, int i, Object... objArr) {
        return f(dqvjVar, vmxVar, str, false, false, i, null, objArr);
    }

    private final zjz e(dqvj dqvjVar, vmx vmxVar, @dzsi String str, int i, Object... objArr) {
        return f(dqvjVar, vmxVar, str, true, false, i, null, objArr);
    }

    private final zjz f(dqvj dqvjVar, vmx vmxVar, @dzsi String str, boolean z, boolean z2, int i, @dzsi Integer num, Object... objArr) {
        return new zjz(dqvjVar, null, new zjw(this.c, vmxVar, this.b, this.a, this.c.getString(i, objArr), num == null ? null : this.c.getString(num.intValue()), z, z2, str), dcdc.e(), false, false, null, this.t, this.u, this.h, this.i, this.c, this.m, this.n, this.o, null, this.j, this.k, this.l, this.q, this.r, this.v);
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x057f, code lost:
        if (r1 < r2.f.size()) goto L138;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.zjz a(defpackage.vmx r38, defpackage.dqvj r39, defpackage.vwn r40, long r41, boolean r43, defpackage.zuz r44) {
        /*
            Method dump skipped, instructions count: 1938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zju.a(vmx, dqvj, vwn, long, boolean, zuz):zjz");
    }

    final void b(dqvj dqvjVar, amve amveVar, int i, @dzsi amub amubVar, @dzsi String str, amvh amvhVar, vou vouVar, long j, boolean z, dccx<zca> dccxVar, xkl xklVar) {
        dosz doszVar = null;
        dwao dwaoVar = amubVar != null ? amubVar.J : null;
        if (this.d.a(amveVar, dwaoVar)) {
            zmz zmzVar = this.d;
            cjta c = cjtd.c(vyb.t(amveVar));
            c.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
            if (zmzVar.b(amveVar)) {
                c.d = dtxn.dG;
            } else if (zmz.c(amveVar, dwaoVar)) {
                c.d = dtxn.dO;
            } else if (!zmz.d(amveVar, dwaoVar)) {
                throw new IllegalArgumentException("Trip should not be repressed.");
            } else {
                c.d = dtxn.dK;
            }
            dccxVar.g(new zna(c.a()));
            return;
        }
        zqm zqmVar = this.e;
        gga ggaVar = this.c;
        zfn zfnVar = zfn.DIRECTIONS_RESULT_TRIPCARD;
        if (amubVar != null && (doszVar = amubVar.J.B) == null) {
            doszVar = dosz.e;
        }
        zql a = zqmVar.a(ggaVar, zfnVar, dqvjVar, amveVar, str, i, amvhVar, doszVar, amubVar != null && amubVar.ao(), this.m);
        a.h = j;
        a.f = z;
        a.b(vouVar);
        a.e = xklVar;
        a.b = amubVar;
        zqo a2 = a.a();
        if (a2 == null) {
            bvoo.h("Failed to build viewModel for trip %s", Integer.valueOf(i));
        } else {
            dccxVar.g(a2);
        }
    }
}
