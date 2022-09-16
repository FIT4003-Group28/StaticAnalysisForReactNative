package defpackage;

import android.os.Looper;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: prx  reason: default package */
/* loaded from: classes4.dex */
public final class prx implements pri, prk, axt, axw {
    public final int a;
    public final pry b;
    boolean c;
    private final boolean[] e;
    private final prj f;
    private final pqh g;
    private final axs h;
    private final ArrayList k;
    private final List l;
    private final prh m;
    private final prh[] n;
    private final prr o;
    private pru p;
    private Format q;
    private long r;
    private long s;
    private int t;
    private final int[] d = new int[0];
    private final axz i = new axz("ChunkSampleStream");
    private final prw j = new prw();

    public prx(int i, pry pryVar, prj prjVar, axf axfVar, long j, pnp pnpVar, pnj pnjVar, axs axsVar, pqh pqhVar) {
        this.a = i;
        this.b = pryVar;
        this.f = prjVar;
        this.g = pqhVar;
        this.h = axsVar;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.l = Collections.unmodifiableList(arrayList);
        this.n = new prh[0];
        this.e = new boolean[0];
        Looper myLooper = Looper.myLooper();
        ptx.a(myLooper);
        prh C = prh.C(axfVar, myLooper, pnpVar, pnjVar);
        this.m = C;
        this.o = new prr(new int[]{i}, new prh[]{C});
        this.r = j;
        this.s = j;
    }

    private final int j(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.k.size()) {
                return this.k.size() - 1;
            }
        } while (((prp) this.k.get(i2)).c(0) <= i);
        return i2 - 1;
    }

    private final prp k(int i) {
        prp prpVar = (prp) this.k.get(i);
        ArrayList arrayList = this.k;
        pxi.K(arrayList, i, arrayList.size());
        this.t = Math.max(this.t, this.k.size());
        this.m.r(prpVar.c(0));
        return prpVar;
    }

    private final prp l() {
        ArrayList arrayList = this.k;
        return (prp) arrayList.get(arrayList.size() - 1);
    }

    private final void n() {
        int j = j(this.m.g(), this.t - 1);
        while (true) {
            int i = this.t;
            if (i <= j) {
                this.t = i + 1;
                prp prpVar = (prp) this.k.get(i);
                Format format = prpVar.h;
                if (!format.equals(this.q)) {
                    this.g.c(this.a, format, prpVar.i, prpVar.j, prpVar.k);
                }
                this.q = format;
            } else {
                return;
            }
        }
    }

    private final void q() {
        this.m.v();
    }

    private final boolean r(int i) {
        return this.m.g() > ((prp) this.k.get(i)).c(0);
    }

    @Override // defpackage.pri
    public final int a(pit pitVar, pmv pmvVar, int i) {
        if (h()) {
            return -3;
        }
        n();
        return this.m.j(pitVar, pmvVar, i, this.c);
    }

    @Override // defpackage.pri
    public final int b(long j) {
        if (h()) {
            return 0;
        }
        int h = this.m.h(j, this.c);
        this.m.x(h);
        n();
        return h;
    }

    @Override // defpackage.pri
    public final void c() {
        this.i.c(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        this.m.s();
        if (!this.i.f()) {
            this.b.d();
        }
    }

    @Override // defpackage.prk
    public final long d() {
        if (this.c) {
            return Long.MIN_VALUE;
        }
        if (h()) {
            return this.r;
        }
        long j = this.s;
        prp l = l();
        if (!l.h()) {
            if (this.k.size() > 1) {
                ArrayList arrayList = this.k;
                l = (prp) arrayList.get(arrayList.size() - 2);
            } else {
                l = null;
            }
        }
        if (l != null) {
            j = Math.max(j, l.l);
        }
        return Math.max(j, this.m.l());
    }

    @Override // defpackage.prk
    public final long e() {
        if (h()) {
            return this.r;
        }
        if (!this.c) {
            return l().l;
        }
        return Long.MIN_VALUE;
    }

    public final void f(long j, boolean z) {
        if (h()) {
            return;
        }
        prh prhVar = this.m;
        int i = prhVar.b;
        prhVar.o(j, z, true);
        prh prhVar2 = this.m;
        int i2 = prhVar2.b;
        if (i2 > i) {
            prhVar2.k();
        }
        int min = Math.min(j(i2, 0), this.t);
        if (min <= 0) {
            return;
        }
        pxi.K(this.k, 0, min);
        this.t -= min;
    }

    public final void g(long j) {
        prp prpVar;
        boolean B;
        this.s = j;
        if (h()) {
            this.r = j;
            return;
        }
        int i = 0;
        while (true) {
            prpVar = null;
            if (i >= this.k.size()) {
                break;
            }
            prp prpVar2 = (prp) this.k.get(i);
            long j2 = prpVar2.k;
            if (j2 == j && prpVar2.a == -9223372036854775807L) {
                prpVar = prpVar2;
                break;
            } else if (j2 > j) {
                break;
            } else {
                i++;
            }
        }
        if (prpVar != null) {
            B = this.m.A(prpVar.c(0));
        } else {
            B = this.m.B(j, j < e());
        }
        if (B) {
            this.t = j(this.m.g(), 0);
            return;
        }
        this.r = j;
        this.c = false;
        this.k.clear();
        this.t = 0;
        if (this.i.f()) {
            this.m.p();
            this.i.a();
            return;
        }
        this.i.b();
        q();
    }

    final boolean h() {
        return this.r != -9223372036854775807L;
    }

    public final void i() {
        this.m.t();
        this.i.d(this);
    }

    @Override // defpackage.prk
    public final void m(long j) {
        if (this.i.e() || h()) {
            return;
        }
        if (this.i.f()) {
            pru pruVar = this.p;
            ptx.a(pruVar);
            if ((pruVar instanceof prp) && r(this.k.size() - 1)) {
                return;
            }
            this.b.h();
            return;
        }
        int a = this.b.a(j, this.l);
        if (a >= this.k.size()) {
            return;
        }
        ptx.e(!this.i.f());
        int size = this.k.size();
        while (true) {
            if (a >= size) {
                a = -1;
                break;
            } else if (!r(a)) {
                break;
            } else {
                a++;
            }
        }
        if (a == -1) {
            return;
        }
        long j2 = l().l;
        prp k = k(a);
        if (this.k.isEmpty()) {
            this.r = this.s;
        }
        this.c = false;
        pqh pqhVar = this.g;
        int i = this.a;
        pqh.j(k.k);
        pqh.j(j2);
        pqhVar.h(new ppw(i, null, 3, null));
    }

    @Override // defpackage.prk
    public final boolean o(long j) {
        List list;
        long j2;
        if (this.c || this.i.f() || this.i.e()) {
            return false;
        }
        boolean h = h();
        if (h) {
            list = Collections.emptyList();
            j2 = this.r;
        } else {
            list = this.l;
            j2 = l().l;
        }
        pry pryVar = this.b;
        pryVar.c(j, j2, list, this.j);
        prw prwVar = this.j;
        boolean z = prwVar.b;
        pru pruVar = prwVar.a;
        prwVar.a = null;
        prwVar.b = false;
        if (z) {
            this.r = -9223372036854775807L;
            this.c = true;
            return true;
        } else if (pruVar == null) {
            return false;
        } else {
            this.p = pruVar;
            if (pruVar instanceof prp) {
                prp prpVar = (prp) pruVar;
                if (h) {
                    long j3 = prpVar.k;
                    long j4 = this.r;
                    if (j3 != j4) {
                        this.m.c = j4;
                    }
                    this.r = -9223372036854775807L;
                }
                prr prrVar = this.o;
                prpVar.c = prrVar;
                int[] iArr = new int[1];
                char c = 0;
                while (true) {
                    prh[] prhVarArr = prrVar.a;
                    if (c > 0) {
                        break;
                    }
                    iArr[0] = prhVarArr[0].i();
                    c = 1;
                }
                prpVar.d = iArr;
                this.k.add(prpVar);
            } else if (pruVar instanceof psa) {
                ((psa) pruVar).a = this.o;
            }
            this.i.g(pruVar, this, Integer.MAX_VALUE);
            this.g.n(new ppr(pruVar.e, pruVar.f), this.a, pruVar.h, pruVar.i, pruVar.j, pruVar.k, pruVar.l);
            return true;
        }
    }

    @Override // defpackage.prk
    public final boolean p() {
        return this.i.f();
    }

    @Override // defpackage.axw
    public final void pU() {
        this.m.u();
        this.b.f();
    }

    @Override // defpackage.axt
    public final /* bridge */ /* synthetic */ void pV(axv axvVar, boolean z) {
        pru pruVar = (pru) axvVar;
        this.p = null;
        ppr pprVar = new ppr(pruVar.e, pruVar.f, pruVar.e());
        this.h.c(pruVar.e);
        pqh pqhVar = this.g;
        int i = pruVar.g;
        pqhVar.k(pprVar, this.a, pruVar.h, pruVar.i, pruVar.j, pruVar.k, pruVar.l);
        if (!z) {
            if (!h()) {
                if (pruVar instanceof prp) {
                    k(this.k.size() - 1);
                    if (this.k.isEmpty()) {
                        this.r = this.s;
                    }
                }
            } else {
                q();
            }
            this.f.b(this);
        }
    }

    @Override // defpackage.axt
    public final /* bridge */ /* synthetic */ void pW(axv axvVar) {
        pru pruVar = (pru) axvVar;
        this.p = null;
        this.b.e(pruVar);
        ppr pprVar = new ppr(pruVar.e, pruVar.f, pruVar.e());
        this.h.c(pruVar.e);
        pqh pqhVar = this.g;
        int i = pruVar.g;
        pqhVar.l(pprVar, this.a, pruVar.h, pruVar.i, pruVar.j, pruVar.k, pruVar.l);
        this.f.b(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de  */
    @Override // defpackage.axt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ defpackage.bbu pX(defpackage.axv r26, java.io.IOException r27, int r28) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prx.pX(axv, java.io.IOException, int):bbu");
    }

    @Override // defpackage.pri
    public final boolean pZ() {
        return !h() && this.m.z(this.c);
    }
}
