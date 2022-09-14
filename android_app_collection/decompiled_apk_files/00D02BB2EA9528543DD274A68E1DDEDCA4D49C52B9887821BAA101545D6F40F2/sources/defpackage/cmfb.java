package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cmfb  reason: default package */
/* loaded from: classes5.dex */
public final class cmfb implements cmeg, clup, cmlb, cmlf, cmfi {
    public static final Map<String, String> b;
    public static final Format c;
    private final cmkg A;
    private final cltu B;
    private final cltr C;
    private boolean F;
    private boolean G;
    private cmfa H;
    private boolean I;
    private int J;
    private final cmks L;
    private final cmkk M;
    public final cmeq d;
    public final cmex e;
    public cmef j;
    public IcyHeaders k;
    public boolean m;
    public clvg n;
    public boolean p;
    public boolean r;
    public long t;
    public boolean u;
    public int v;
    public boolean w;
    public boolean x;
    public final cmdk y;
    private final Uri z;
    public final cmli f = new cmli();
    private final cmmt D = new cmmt();
    public final Runnable g = new Runnable(this) { // from class: cmet
        private final cmfb a;

        {
            this.a = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.t();
        }
    };
    public final Runnable h = new Runnable(this) { // from class: cmeu
        private final cmfb a;

        {
            this.a = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            cmfb cmfbVar = this.a;
            if (!cmfbVar.x) {
                cmef cmefVar = cmfbVar.j;
                cmmn.f(cmefVar);
                cmefVar.e(cmfbVar);
            }
        }
    };
    public final Handler i = cmny.g();
    private cmez[] E = new cmez[0];
    public cmfj[] l = new cmfj[0];
    private long K = -9223372036854775807L;
    public long s = -1;
    public long o = -9223372036854775807L;
    public int q = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        b = Collections.unmodifiableMap(hashMap);
        clnf clnfVar = new clnf();
        clnfVar.a = "icy";
        clnfVar.k = "application/x-icy";
        c = clnfVar.a();
    }

    public cmfb(Uri uri, cmkg cmkgVar, clus clusVar, cltu cltuVar, cltr cltrVar, cmks cmksVar, cmeq cmeqVar, cmex cmexVar, cmkk cmkkVar) {
        this.z = uri;
        this.A = cmkgVar;
        this.B = cltuVar;
        this.C = cltrVar;
        this.L = cmksVar;
        this.d = cmeqVar;
        this.e = cmexVar;
        this.M = cmkkVar;
        this.y = new cmdk(clusVar);
    }

    private final void A() {
        cmmn.c(this.m);
        cmmn.f(this.H);
        cmmn.f(this.n);
    }

    private final void y() {
        cmew cmewVar = new cmew(this, this.z, this.A, this.y, this, this.D);
        if (this.m) {
            cmmn.c(z());
            long j = this.o;
            if (j != -9223372036854775807L && this.K > j) {
                this.w = true;
                this.K = -9223372036854775807L;
                return;
            }
            clvg clvgVar = this.n;
            cmmn.f(clvgVar);
            cmewVar.b(clvgVar.b(this.K).a.c, this.K);
            for (cmfj cmfjVar : this.l) {
                cmfjVar.g = this.K;
            }
            this.K = -9223372036854775807L;
        }
        this.v = v();
        cmli cmliVar = this.f;
        Looper myLooper = Looper.myLooper();
        cmmn.e(myLooper);
        cmliVar.e = null;
        new cmld(cmliVar, myLooper, cmewVar, this, SystemClock.elapsedRealtime()).a(0L);
        this.d.b(new cmdz(cmewVar.j), new cmee(-1, null, cmeq.g(cmewVar.i), cmeq.g(this.o)));
    }

    private final boolean z() {
        return this.K != -9223372036854775807L;
    }

    @Override // defpackage.clup
    public final void RS() {
        this.F = true;
        this.i.post(this.g);
    }

    @Override // defpackage.clup
    public final clvk RT(int i) {
        return s(new cmez(i, false));
    }

    @Override // defpackage.cmeg
    public final void a(cmef cmefVar, long j) {
        this.j = cmefVar;
        this.D.a();
        y();
    }

    @Override // defpackage.clup
    public final void b(final clvg clvgVar) {
        this.i.post(new Runnable(this, clvgVar) { // from class: cmev
            private final cmfb a;
            private final clvg b;

            {
                this.a = this;
                this.b = clvgVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cmfb cmfbVar = this.a;
                clvg clvgVar2 = this.b;
                cmfbVar.n = cmfbVar.k == null ? clvgVar2 : new clvf(-9223372036854775807L);
                cmfbVar.o = clvgVar2.c();
                boolean z = false;
                int i = 1;
                if (cmfbVar.s == -1 && clvgVar2.c() == -9223372036854775807L) {
                    z = true;
                }
                cmfbVar.p = z;
                if (true == z) {
                    i = 7;
                }
                cmfbVar.q = i;
                cmfbVar.e.b(cmfbVar.o, clvgVar2.a(), cmfbVar.p);
                if (!cmfbVar.m) {
                    cmfbVar.t();
                }
            }
        });
    }

    @Override // defpackage.cmeg
    public final void c() {
        e();
        if (!this.w || this.m) {
            return;
        }
        throw new clob("Loading finished before preparation is complete.");
    }

    @Override // defpackage.cmeg
    public final TrackGroupArray d() {
        A();
        return this.H.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        IOException iOException;
        cmli cmliVar = this.f;
        int a = cmks.a(this.q);
        IOException iOException2 = cmliVar.e;
        if (iOException2 == null) {
            cmld<? extends cmle> cmldVar = cmliVar.d;
            if (cmldVar != null && (iOException = cmldVar.a) != null && cmldVar.b > a) {
                throw iOException;
            }
            return;
        }
        throw iOException2;
    }

    @Override // defpackage.cmeg
    public final long f(cmjm[] cmjmVarArr, boolean[] zArr, cmfk[] cmfkVarArr, boolean[] zArr2, long j) {
        cmjm cmjmVar;
        A();
        cmfa cmfaVar = this.H;
        TrackGroupArray trackGroupArray = cmfaVar.a;
        boolean[] zArr3 = cmfaVar.c;
        int i = this.J;
        int i2 = 0;
        for (int i3 = 0; i3 < cmjmVarArr.length; i3++) {
            cmfk cmfkVar = cmfkVarArr[i3];
            if (cmfkVar != null && (cmjmVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((cmey) cmfkVar).a;
                cmmn.c(zArr3[i4]);
                this.J--;
                zArr3[i4] = false;
                cmfkVarArr[i3] = null;
            }
        }
        boolean z = !this.I ? j != 0 : i == 0;
        for (int i5 = 0; i5 < cmjmVarArr.length; i5++) {
            if (cmfkVarArr[i5] == null && (cmjmVar = cmjmVarArr[i5]) != null) {
                cmmn.c(cmjmVar.d() == 1);
                cmmn.c(cmjmVar.f(0) == 0);
                int b2 = trackGroupArray.b(cmjmVar.c());
                cmmn.c(!zArr3[b2]);
                this.J++;
                zArr3[b2] = true;
                cmfkVarArr[i5] = new cmey(this, b2);
                zArr2[i5] = true;
                if (!z) {
                    cmfj cmfjVar = this.l[b2];
                    z = !cmfjVar.m(j, true) && cmfjVar.e + cmfjVar.f != 0;
                }
            }
        }
        if (this.J == 0) {
            this.u = false;
            this.r = false;
            if (this.f.b()) {
                cmfj[] cmfjVarArr = this.l;
                int length = cmfjVarArr.length;
                while (i2 < length) {
                    cmfjVarArr[i2].p();
                    i2++;
                }
                this.f.c();
            } else {
                cmfj[] cmfjVarArr2 = this.l;
                int length2 = cmfjVarArr2.length;
                while (i2 < length2) {
                    cmfjVarArr2[i2].g();
                    i2++;
                }
            }
        } else if (z) {
            j = j(j);
            while (i2 < cmfkVarArr.length) {
                if (cmfkVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.I = true;
        return j;
    }

    @Override // defpackage.cmeg
    public final void g(long j) {
    }

    @Override // defpackage.cmeg
    public final long h() {
        if (this.r) {
            if (!this.w && v() <= this.v) {
                return -9223372036854775807L;
            }
            this.r = false;
            return this.t;
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.cmeg
    public final long i() {
        long j;
        A();
        boolean[] zArr = this.H.b;
        if (this.w) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.K;
        }
        if (this.G) {
            int length = this.l.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.l[i].k()) {
                    j = Math.min(j, this.l[i].j());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = w();
        }
        return j == Long.MIN_VALUE ? this.t : j;
    }

    @Override // defpackage.cmeg
    public final long j(long j) {
        A();
        boolean[] zArr = this.H.b;
        if (true != this.n.a()) {
            j = 0;
        }
        this.r = false;
        this.t = j;
        if (z()) {
            this.K = j;
            return j;
        }
        if (this.q != 7) {
            int length = this.l.length;
            for (int i = 0; i < length; i++) {
                if (this.l[i].m(j, false) || (!zArr[i] && this.G)) {
                }
            }
            return j;
        }
        this.u = false;
        this.K = j;
        this.w = false;
        if (this.f.b()) {
            this.f.c();
        } else {
            this.f.e = null;
            for (cmfj cmfjVar : this.l) {
                cmfjVar.g();
            }
        }
        return j;
    }

    @Override // defpackage.cmeg
    public final long k(long j, cloq cloqVar) {
        A();
        if (!this.n.a()) {
            return 0L;
        }
        clve b2 = this.n.b(j);
        long j2 = b2.a.b;
        long j3 = b2.b.b;
        long j4 = cloqVar.c;
        if (j4 == 0 && cloqVar.d == 0) {
            return j;
        }
        long am = cmny.am(j, j4);
        long aa = cmny.aa(j, cloqVar.d);
        boolean z = true;
        boolean z2 = am <= j2 && j2 <= aa;
        if (am > j3 || j3 > aa) {
            z = false;
        }
        if (!z2 || !z) {
            if (!z2) {
                return z ? j3 : am;
            }
        } else if (Math.abs(j2 - j) > Math.abs(j3 - j)) {
            return j3;
        }
        return j2;
    }

    @Override // defpackage.cmeg
    public final long l() {
        if (this.J == 0) {
            return Long.MIN_VALUE;
        }
        return i();
    }

    @Override // defpackage.cmeg
    public final boolean m(long j) {
        if (this.w || this.f.e != null || this.u) {
            return false;
        }
        if (this.m && this.J == 0) {
            return false;
        }
        boolean a = this.D.a();
        if (this.f.b()) {
            return a;
        }
        y();
        return true;
    }

    @Override // defpackage.cmeg
    public final boolean n() {
        return this.f.b() && this.D.c();
    }

    public final void o(int i) {
        A();
        cmfa cmfaVar = this.H;
        boolean[] zArr = cmfaVar.d;
        if (!zArr[i]) {
            Format a = cmfaVar.a.a(i).a(0);
            this.d.f(new cmee(cmnf.g(a.l), a, cmeq.g(this.t), -9223372036854775807L));
            zArr[i] = true;
        }
    }

    @Override // defpackage.cmeg
    public final void p(long j) {
        A();
        if (z()) {
            return;
        }
        boolean[] zArr = this.H.c;
        int length = this.l.length;
        for (int i = 0; i < length; i++) {
            cmfj cmfjVar = this.l[i];
            cmfjVar.a.a(cmfjVar.s(j, zArr[i]));
        }
    }

    public final void q(int i) {
        A();
        boolean[] zArr = this.H.b;
        if (!this.u || !zArr[i]) {
            return;
        }
        if (this.l[i].l(false)) {
            return;
        }
        this.K = 0L;
        this.u = false;
        this.r = true;
        this.t = 0L;
        this.v = 0;
        for (cmfj cmfjVar : this.l) {
            cmfjVar.g();
        }
        cmef cmefVar = this.j;
        cmmn.f(cmefVar);
        cmefVar.e(this);
    }

    public final boolean r() {
        return this.r || z();
    }

    public final clvk s(cmez cmezVar) {
        int length = this.l.length;
        for (int i = 0; i < length; i++) {
            if (cmezVar.equals(this.E[i])) {
                return this.l[i];
            }
        }
        cmkk cmkkVar = this.M;
        this.i.getLooper();
        cmfj cmfjVar = new cmfj(cmkkVar, this.B);
        cmfjVar.c = this;
        int i2 = length + 1;
        cmez[] cmezVarArr = (cmez[]) Arrays.copyOf(this.E, i2);
        cmezVarArr[length] = cmezVar;
        this.E = (cmez[]) cmny.d(cmezVarArr);
        cmfj[] cmfjVarArr = (cmfj[]) Arrays.copyOf(this.l, i2);
        cmfjVarArr[length] = cmfjVar;
        this.l = (cmfj[]) cmny.d(cmfjVarArr);
        return cmfjVar;
    }

    public final void t() {
        Metadata c2;
        if (this.x || this.m || !this.F || this.n == null) {
            return;
        }
        for (cmfj cmfjVar : this.l) {
            if (cmfjVar.i() == null) {
                return;
            }
        }
        this.D.d();
        int length = this.l.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            Format i2 = this.l[i].i();
            cmmn.f(i2);
            String str = i2.l;
            boolean a = cmnf.a(str);
            boolean z = a || cmnf.b(str);
            zArr[i] = z;
            this.G = z | this.G;
            IcyHeaders icyHeaders = this.k;
            if (icyHeaders != null) {
                if (a || this.E[i].b) {
                    Metadata metadata = i2.j;
                    if (metadata == null) {
                        c2 = new Metadata(icyHeaders);
                    } else {
                        c2 = metadata.c(icyHeaders);
                    }
                    clnf a2 = i2.a();
                    a2.i = c2;
                    i2 = a2.a();
                }
                if (a && i2.f == -1 && i2.g == -1 && icyHeaders.a != -1) {
                    clnf a3 = i2.a();
                    a3.f = icyHeaders.a;
                    i2 = a3.a();
                }
            }
            trackGroupArr[i] = new TrackGroup(i2.b(this.B.a(i2)));
        }
        this.H = new cmfa(new TrackGroupArray(trackGroupArr), zArr);
        this.m = true;
        cmef cmefVar = this.j;
        cmmn.f(cmefVar);
        cmefVar.b(this);
    }

    public final void u(cmew cmewVar) {
        if (this.s == -1) {
            this.s = cmewVar.k;
        }
    }

    public final int v() {
        cmfj[] cmfjVarArr;
        int i = 0;
        for (cmfj cmfjVar : this.l) {
            i += cmfjVar.e + cmfjVar.d;
        }
        return i;
    }

    public final long w() {
        long j = Long.MIN_VALUE;
        for (cmfj cmfjVar : this.l) {
            j = Math.max(j, cmfjVar.j());
        }
        return j;
    }

    public final void x(cmew cmewVar, boolean z) {
        cmlm cmlmVar = cmewVar.c;
        long j = cmewVar.a;
        cmkj cmkjVar = cmewVar.j;
        cmdz cmdzVar = new cmdz();
        long j2 = cmewVar.a;
        this.d.d(cmdzVar, new cmee(-1, null, cmeq.g(cmewVar.i), cmeq.g(this.o)));
        if (!z) {
            u(cmewVar);
            for (cmfj cmfjVar : this.l) {
                cmfjVar.g();
            }
            if (this.J <= 0) {
                return;
            }
            cmef cmefVar = this.j;
            cmmn.f(cmefVar);
            cmefVar.e(this);
        }
    }
}
