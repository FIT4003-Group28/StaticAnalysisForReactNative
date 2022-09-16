package defpackage;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pqx  reason: default package */
/* loaded from: classes4.dex */
public final class pqx implements ppy, azh, axt, axw, prg {
    public static final Map b;
    public static final Format c;
    private final pqp A;
    private boolean D;
    private boolean E;
    private pqw F;
    private boolean G;
    private boolean H;
    private int I;

    /* renamed from: J  reason: collision with root package name */
    private long f258J;
    private boolean L;
    private int M;
    private final axf N;
    public final pqt d;
    public final long e;
    public ppx j;
    public IcyHeaders k;
    public boolean m;
    public azy n;
    public boolean p;
    public boolean s;
    public boolean t;
    private final Uri u;
    private final asv v;
    private final pnp w;
    private final axs x;
    private final pqh y;
    private final pnj z;
    public final axz f = new axz("ProgressiveMediaPeriod");
    private final pvt B = new pvt();
    public final Runnable g = new pqq(this);
    public final Runnable h = new pqq(this, 1);
    public final Handler i = pxi.s();
    private pqv[] C = new pqv[0];
    public prh[] l = new prh[0];
    private long K = -9223372036854775807L;
    public long r = -1;
    public long o = -9223372036854775807L;
    public int q = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        b = Collections.unmodifiableMap(hashMap);
        pis pisVar = new pis();
        pisVar.a = "icy";
        pisVar.k = "application/x-icy";
        c = pisVar.a();
    }

    public pqx(Uri uri, asv asvVar, pqp pqpVar, pnp pnpVar, pnj pnjVar, axs axsVar, pqh pqhVar, pqt pqtVar, axf axfVar, int i) {
        this.u = uri;
        this.v = asvVar;
        this.w = pnpVar;
        this.z = pnjVar;
        this.x = axsVar;
        this.y = pqhVar;
        this.d = pqtVar;
        this.N = axfVar;
        this.e = i;
        this.A = pqpVar;
    }

    private final boolean A() {
        return this.K != -9223372036854775807L;
    }

    private final int w() {
        int i = 0;
        for (prh prhVar : this.l) {
            i += prhVar.i();
        }
        return i;
    }

    private final void x() {
        ptx.e(this.m);
        ptx.a(this.F);
        ptx.a(this.n);
    }

    private final void y(pqs pqsVar) {
        if (this.r == -1) {
            this.r = pqsVar.e;
        }
    }

    private final void z() {
        pqs pqsVar = new pqs(this, this.u, this.v, this.A, this, this.B);
        if (this.m) {
            ptx.e(A());
            long j = this.o;
            if (j == -9223372036854775807L || this.K <= j) {
                azy azyVar = this.n;
                ptx.a(azyVar);
                pqsVar.c(azyVar.b(this.K).a.c, this.K);
                for (prh prhVar : this.l) {
                    prhVar.c = this.K;
                }
                this.K = -9223372036854775807L;
            } else {
                this.s = true;
                this.K = -9223372036854775807L;
                return;
            }
        }
        this.M = w();
        this.f.g(pqsVar, this, this.x.a(this.q));
        this.y.n(new ppr(pqsVar.a, pqsVar.d), -1, null, 0, null, pqsVar.c, this.o);
    }

    @Override // defpackage.ppy
    public final long a(long j, pkh pkhVar) {
        x();
        if (!this.n.c()) {
            return 0L;
        }
        azw b2 = this.n.b(j);
        return pkhVar.a(j, b2.a.b, b2.b.b);
    }

    @Override // defpackage.azh
    public final void b() {
        this.D = true;
        this.i.post(this.g);
    }

    @Override // defpackage.ppy, defpackage.prk
    public final long d() {
        long j;
        x();
        boolean[] zArr = this.F.b;
        if (this.s) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.K;
        }
        if (this.E) {
            int length = this.l.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.l[i].y()) {
                    j = Math.min(j, this.l[i].l());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = n();
        }
        return j == Long.MIN_VALUE ? this.f258J : j;
    }

    @Override // defpackage.ppy, defpackage.prk
    public final long e() {
        if (this.I == 0) {
            return Long.MIN_VALUE;
        }
        return d();
    }

    @Override // defpackage.ppy
    public final long f() {
        if (this.H) {
            if (!this.s && w() <= this.M) {
                return -9223372036854775807L;
            }
            this.H = false;
            return this.f258J;
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.ppy
    public final long g(long j) {
        x();
        boolean[] zArr = this.F.b;
        if (true != this.n.c()) {
            j = 0;
        }
        int i = 0;
        this.H = false;
        this.f258J = j;
        if (A()) {
            this.K = j;
            return j;
        }
        if (this.q != 7) {
            int length = this.l.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (this.l[i2].B(j, false) || (!zArr[i2] && this.E)) {
                }
            }
            return j;
        }
        this.L = false;
        this.K = j;
        this.s = false;
        if (this.f.f()) {
            prh[] prhVarArr = this.l;
            int length2 = prhVarArr.length;
            while (i < length2) {
                prhVarArr[i].p();
                i++;
            }
            this.f.a();
        } else {
            this.f.b();
            prh[] prhVarArr2 = this.l;
            int length3 = prhVarArr2.length;
            while (i < length3) {
                prhVarArr2[i].v();
                i++;
            }
        }
        return j;
    }

    @Override // defpackage.ppy
    public final long h(pvf[] pvfVarArr, boolean[] zArr, pri[] priVarArr, boolean[] zArr2, long j) {
        pvf pvfVar;
        x();
        pqw pqwVar = this.F;
        TrackGroupArray trackGroupArray = pqwVar.a;
        boolean[] zArr3 = pqwVar.c;
        int i = this.I;
        int i2 = 0;
        for (int i3 = 0; i3 < pvfVarArr.length; i3++) {
            pri priVar = priVarArr[i3];
            if (priVar != null && (pvfVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((pqu) priVar).a;
                ptx.e(zArr3[i4]);
                this.I--;
                zArr3[i4] = false;
                priVarArr[i3] = null;
            }
        }
        boolean z = !this.G ? j != 0 : i == 0;
        for (int i5 = 0; i5 < pvfVarArr.length; i5++) {
            if (priVarArr[i5] == null && (pvfVar = pvfVarArr[i5]) != null) {
                ptx.e(pvfVar.m() == 1);
                ptx.e(pvfVar.j(0) == 0);
                int a = trackGroupArray.a(pvfVar.p());
                ptx.e(!zArr3[a]);
                this.I++;
                zArr3[a] = true;
                priVarArr[i5] = new pqu(this, a);
                zArr2[i5] = true;
                if (!z) {
                    prh prhVar = this.l[a];
                    z = !prhVar.B(j, true) && prhVar.g() != 0;
                }
            }
        }
        if (this.I == 0) {
            this.L = false;
            this.H = false;
            if (this.f.f()) {
                prh[] prhVarArr = this.l;
                int length = prhVarArr.length;
                while (i2 < length) {
                    prhVarArr[i2].p();
                    i2++;
                }
                this.f.a();
            } else {
                prh[] prhVarArr2 = this.l;
                int length2 = prhVarArr2.length;
                while (i2 < length2) {
                    prhVarArr2[i2].v();
                    i2++;
                }
            }
        } else if (z) {
            j = g(j);
            while (i2 < priVarArr.length) {
                if (priVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.G = true;
        return j;
    }

    @Override // defpackage.ppy
    public final TrackGroupArray i() {
        x();
        return this.F.a;
    }

    @Override // defpackage.ppy
    public final void j(long j, boolean z) {
        x();
        if (A()) {
            return;
        }
        boolean[] zArr = this.F.c;
        int length = this.l.length;
        for (int i = 0; i < length; i++) {
            this.l[i].o(j, z, zArr[i]);
        }
    }

    @Override // defpackage.ppy
    public final void k() {
        u();
        if (!this.s || this.m) {
            return;
        }
        throw pjq.a("Loading finished before preparation is complete.", null);
    }

    @Override // defpackage.ppy
    public final void l(ppx ppxVar, long j) {
        this.j = ppxVar;
        this.B.e();
        z();
    }

    @Override // defpackage.ppy, defpackage.prk
    public final void m(long j) {
    }

    public final long n() {
        long j = Long.MIN_VALUE;
        for (prh prhVar : this.l) {
            j = Math.max(j, prhVar.l());
        }
        return j;
    }

    @Override // defpackage.ppy, defpackage.prk
    public final boolean o(long j) {
        if (this.s || this.f.e() || this.L) {
            return false;
        }
        if (this.m && this.I == 0) {
            return false;
        }
        boolean e = this.B.e();
        if (this.f.f()) {
            return e;
        }
        z();
        return true;
    }

    @Override // defpackage.ppy, defpackage.prk
    public final boolean p() {
        return this.f.f() && this.B.d();
    }

    @Override // defpackage.azh
    public final bab pT(int i, int i2) {
        return q(new pqv(i, false));
    }

    @Override // defpackage.axw
    public final void pU() {
        for (prh prhVar : this.l) {
            prhVar.u();
        }
        ppc ppcVar = (ppc) this.A;
        if (ppcVar.a != null) {
            ppcVar.a = null;
        }
        ppcVar.b = null;
    }

    @Override // defpackage.axt
    public final /* bridge */ /* synthetic */ void pV(axv axvVar, boolean z) {
        pqs pqsVar = (pqs) axvVar;
        ppr pprVar = new ppr(pqsVar.a, pqsVar.d, pqsVar.b.a);
        long j = pqsVar.a;
        this.y.k(pprVar, -1, null, 0, null, pqsVar.c, this.o);
        if (!z) {
            y(pqsVar);
            for (prh prhVar : this.l) {
                prhVar.v();
            }
            if (this.I <= 0) {
                return;
            }
            ppx ppxVar = this.j;
            ptx.a(ppxVar);
            ppxVar.b(this);
        }
    }

    @Override // defpackage.axt
    public final /* bridge */ /* synthetic */ void pW(axv axvVar) {
        azy azyVar;
        pqs pqsVar = (pqs) axvVar;
        if (this.o == -9223372036854775807L && (azyVar = this.n) != null) {
            boolean c2 = azyVar.c();
            long n = n();
            long j = n == Long.MIN_VALUE ? 0L : n + 10000;
            this.o = j;
            this.d.a(j, c2, this.p);
        }
        ppr pprVar = new ppr(pqsVar.a, pqsVar.d, pqsVar.b.a);
        long j2 = pqsVar.a;
        this.y.l(pprVar, -1, null, 0, null, pqsVar.c, this.o);
        y(pqsVar);
        this.s = true;
        ppx ppxVar = this.j;
        ptx.a(ppxVar);
        ppxVar.b(this);
    }

    @Override // defpackage.axt
    public final /* bridge */ /* synthetic */ bbu pX(axv axvVar, IOException iOException, int i) {
        axr axrVar;
        bbu h;
        azy azyVar;
        pqs pqsVar = (pqs) axvVar;
        y(pqsVar);
        ppr pprVar = new ppr(pqsVar.a, pqsVar.d, pqsVar.b.a);
        long j = pqsVar.c;
        UUID uuid = phk.a;
        new ppw(-1, null, 0, null);
        IOException iOException2 = new axr(pprVar, iOException, i).b;
        long min = ((iOException2 instanceof pjq) || (iOException2 instanceof FileNotFoundException) || (iOException2 instanceof atc) || (iOException2 instanceof axy)) ? -9223372036854775807L : Math.min((axrVar.c - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            h = axz.e;
        } else {
            int w = w();
            boolean z = w > this.M;
            if (this.r != -1 || ((azyVar = this.n) != null && azyVar.a() != -9223372036854775807L)) {
                this.M = w;
            } else if (!this.m || v()) {
                this.H = this.m;
                this.f258J = 0L;
                this.M = 0;
                for (prh prhVar : this.l) {
                    prhVar.v();
                }
                pqsVar.c(0L, 0L);
            } else {
                this.L = true;
                h = axz.d;
            }
            h = axz.h(z, min);
        }
        boolean z2 = !h.a();
        this.y.m(pprVar, -1, null, 0, null, pqsVar.c, this.o, iOException, z2);
        if (z2) {
            long j2 = pqsVar.a;
        }
        return h;
    }

    public final bab q(pqv pqvVar) {
        int length = this.l.length;
        for (int i = 0; i < length; i++) {
            if (pqvVar.equals(this.C[i])) {
                return this.l[i];
            }
        }
        prh C = prh.C(this.N, this.i.getLooper(), this.w, this.z);
        C.a = this;
        int i2 = length + 1;
        pqv[] pqvVarArr = (pqv[]) Arrays.copyOf(this.C, i2);
        pqvVarArr[length] = pqvVar;
        this.C = (pqv[]) pxi.V(pqvVarArr);
        prh[] prhVarArr = (prh[]) Arrays.copyOf(this.l, i2);
        prhVarArr[length] = C;
        this.l = (prh[]) pxi.V(prhVarArr);
        return C;
    }

    public final void r() {
        Metadata c2;
        if (this.t || this.m || !this.D || this.n == null) {
            return;
        }
        for (prh prhVar : this.l) {
            if (prhVar.n() == null) {
                return;
            }
        }
        this.B.f();
        int length = this.l.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            Format n = this.l[i].n();
            ptx.a(n);
            String str = n.l;
            boolean j = pwl.j(str);
            boolean z = j || pwl.l(str);
            zArr[i] = z;
            this.E = z | this.E;
            IcyHeaders icyHeaders = this.k;
            if (icyHeaders != null) {
                if (j || this.C[i].b) {
                    Metadata metadata = n.j;
                    if (metadata == null) {
                        c2 = new Metadata(icyHeaders);
                    } else {
                        c2 = metadata.c(icyHeaders);
                    }
                    pis b2 = n.b();
                    b2.i = c2;
                    n = b2.a();
                }
                if (j && n.f == -1 && n.g == -1 && icyHeaders.a != -1) {
                    pis b3 = n.b();
                    b3.f = icyHeaders.a;
                    n = b3.a();
                }
            }
            trackGroupArr[i] = new TrackGroup(n.c(this.w.c(n)));
        }
        this.F = new pqw(new TrackGroupArray(trackGroupArr), zArr);
        this.m = true;
        ppx ppxVar = this.j;
        ptx.a(ppxVar);
        ppxVar.c(this);
    }

    @Override // defpackage.azh
    public final void ry(final azy azyVar) {
        this.i.post(new Runnable() { // from class: pqr
            @Override // java.lang.Runnable
            public final void run() {
                pqx pqxVar = pqx.this;
                azy azyVar2 = azyVar;
                pqxVar.n = pqxVar.k == null ? azyVar2 : new azx(-9223372036854775807L);
                pqxVar.o = azyVar2.a();
                boolean z = false;
                int i = 1;
                if (pqxVar.r == -1 && azyVar2.a() == -9223372036854775807L) {
                    z = true;
                }
                pqxVar.p = z;
                if (true == z) {
                    i = 7;
                }
                pqxVar.q = i;
                pqxVar.d.a(pqxVar.o, azyVar2.c(), pqxVar.p);
                if (!pqxVar.m) {
                    pqxVar.r();
                }
            }
        });
    }

    public final void s(int i) {
        x();
        pqw pqwVar = this.F;
        boolean[] zArr = pqwVar.d;
        if (!zArr[i]) {
            Format a = pqwVar.a.b(i).a(0);
            this.y.c(pwl.b(a.l), a, 0, null, this.f258J);
            zArr[i] = true;
        }
    }

    public final void t(int i) {
        x();
        boolean[] zArr = this.F.b;
        if (!this.L || !zArr[i]) {
            return;
        }
        if (this.l[i].z(false)) {
            return;
        }
        this.K = 0L;
        this.L = false;
        this.H = true;
        this.f258J = 0L;
        this.M = 0;
        for (prh prhVar : this.l) {
            prhVar.v();
        }
        ppx ppxVar = this.j;
        ptx.a(ppxVar);
        ppxVar.b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u() {
        this.f.c(this.x.a(this.q));
    }

    public final boolean v() {
        return this.H || A();
    }
}
