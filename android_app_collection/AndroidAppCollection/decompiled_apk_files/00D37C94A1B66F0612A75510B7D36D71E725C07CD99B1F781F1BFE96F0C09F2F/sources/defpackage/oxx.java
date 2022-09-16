package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.exoplayer.MediaFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: oxx  reason: default package */
/* loaded from: classes4.dex */
public final class oxx implements oui, ouh, oxr, pbv {
    private static final List c;
    private IOException A;
    private int B;
    private long C;
    private boolean D;
    private int E;
    private final pbo F;
    public final oxu a;
    public int b;
    private final int d;
    private final SparseArray e;
    private final Uri f;
    private final pbl g;
    private volatile boolean h;
    private volatile oye i;
    private volatile owx j;
    private boolean k;
    private int l;
    private MediaFormat[] m;
    private long n;
    private boolean[] o;
    private boolean[] p;
    private boolean[] q;
    private int r;
    private long s;
    private long t;
    private long u;
    private boolean v;
    private long w;
    private long x;
    private pbz y;
    private oxt z;

    static {
        ArrayList arrayList = new ArrayList();
        c = arrayList;
        try {
            arrayList.add(Class.forName("pbe").asSubclass(oxq.class));
        } catch (ClassNotFoundException unused) {
        }
        try {
            c.add(Class.forName("ozd").asSubclass(oxq.class));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            c.add(Class.forName("ozf").asSubclass(oxq.class));
        } catch (ClassNotFoundException unused3) {
        }
        try {
            c.add(Class.forName("oyp").asSubclass(oxq.class));
        } catch (ClassNotFoundException unused4) {
        }
        try {
            c.add(Class.forName("ozy").asSubclass(oxq.class));
        } catch (ClassNotFoundException unused5) {
        }
        try {
            c.add(Class.forName("pau").asSubclass(oxq.class));
        } catch (ClassNotFoundException unused6) {
        }
        try {
            c.add(Class.forName("oyh").asSubclass(oxq.class));
        } catch (ClassNotFoundException unused7) {
        }
        try {
            c.add(Class.forName("ozm").asSubclass(oxq.class));
        } catch (ClassNotFoundException unused8) {
        }
        try {
            c.add(Class.forName("pan").asSubclass(oxq.class));
        } catch (ClassNotFoundException unused9) {
        }
        try {
            c.add(Class.forName("pav").asSubclass(oxq.class));
        } catch (ClassNotFoundException unused10) {
        }
        try {
            c.add(Class.forName("com.google.android.exoplayer.ext.flac.FlacExtractor").asSubclass(oxq.class));
        } catch (ClassNotFoundException unused11) {
        }
    }

    public oxx(Uri uri, pbl pblVar, pbo pboVar, int i, oxq... oxqVarArr) {
        this.f = uri;
        this.g = pblVar;
        this.F = pboVar;
        this.d = i;
        if (oxqVarArr.length == 0) {
            int size = c.size();
            oxqVarArr = new oxq[size];
            for (int i2 = 0; i2 < size; i2++) {
                try {
                    oxqVarArr[i2] = (oxq) ((Class) c.get(i2)).newInstance();
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException("Unexpected error creating default extractor", e);
                } catch (InstantiationException e2) {
                    throw new IllegalStateException("Unexpected error creating default extractor", e2);
                }
            }
        }
        this.a = new oxu(oxqVarArr, this);
        this.e = new SparseArray();
        this.u = Long.MIN_VALUE;
    }

    private final oxt q() {
        return new oxt(this.f, this.g, this.a, this.F, this.d, 0L);
    }

    private final void r() {
        for (int i = 0; i < this.e.size(); i++) {
            ((oxv) this.e.valueAt(i)).b();
        }
        this.z = null;
        this.A = null;
        this.B = 0;
    }

    private final void s() {
        if (this.D || this.y.b) {
            return;
        }
        int i = 0;
        if (this.A != null) {
            if (u()) {
                return;
            }
            pce.d(this.z != null);
            if (SystemClock.elapsedRealtime() - this.C < Math.min((this.B - 1) * 1000, 5000L)) {
                return;
            }
            this.A = null;
            if (!this.k) {
                while (i < this.e.size()) {
                    ((oxv) this.e.valueAt(i)).b();
                    i++;
                }
                this.z = q();
            } else if (!this.i.c() && this.n == -1) {
                while (i < this.e.size()) {
                    ((oxv) this.e.valueAt(i)).b();
                    i++;
                }
                this.z = q();
                this.w = this.s;
                this.v = true;
            }
            this.E = this.b;
            this.y.d(this.z, this);
            return;
        }
        this.x = 0L;
        this.v = false;
        if (!this.k) {
            this.z = q();
        } else {
            pce.d(v());
            long j = this.n;
            if (j == -1 || this.u < j) {
                this.z = new oxt(this.f, this.g, this.a, this.F, this.d, this.i.b(this.u));
                this.u = Long.MIN_VALUE;
            } else {
                this.D = true;
                this.u = Long.MIN_VALUE;
                return;
            }
        }
        this.E = this.b;
        this.y.d(this.z, this);
    }

    private final void t(long j) {
        this.u = j;
        this.D = false;
        pbz pbzVar = this.y;
        if (pbzVar.b) {
            pbzVar.a();
            return;
        }
        r();
        s();
    }

    private final boolean u() {
        return this.A instanceof oxw;
    }

    private final boolean v() {
        return this.u != Long.MIN_VALUE;
    }

    @Override // defpackage.ouh
    public final int a() {
        return this.e.size();
    }

    @Override // defpackage.ouh
    public final int b(int i, long j, oue oueVar, oug ougVar) {
        this.s = j;
        if (!this.p[i] && !v()) {
            oxv oxvVar = (oxv) this.e.valueAt(i);
            if (this.o[i]) {
                oueVar.a = oxvVar.e;
                oueVar.b = this.j;
                this.o[i] = false;
                return -4;
            } else if (oxvVar.c(ougVar)) {
                long j2 = ougVar.e;
                long j3 = this.t;
                ougVar.d = (j2 < j3 ? 134217728 : 0) | ougVar.d;
                if (this.v) {
                    this.x = this.w - j2;
                    this.v = false;
                }
                ougVar.e = j2 + this.x;
                return -3;
            } else if (this.D) {
                return -1;
            }
        }
        return -2;
    }

    @Override // defpackage.ouh
    public final long c() {
        if (this.D) {
            return -3L;
        }
        if (v()) {
            return this.u;
        }
        long j = Long.MIN_VALUE;
        for (int i = 0; i < this.e.size(); i++) {
            j = Math.max(j, ((oxv) this.e.valueAt(i)).d);
        }
        return j == Long.MIN_VALUE ? this.s : j;
    }

    @Override // defpackage.ouh
    public final long d(int i) {
        boolean[] zArr = this.p;
        if (zArr[i]) {
            zArr[i] = false;
            return this.t;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.ouh
    public final MediaFormat e(int i) {
        pce.d(this.k);
        return this.m[i];
    }

    @Override // defpackage.oui
    public final ouh f() {
        this.r++;
        return this;
    }

    @Override // defpackage.ouh
    public final void g(int i) {
        pce.d(this.k);
        pce.d(this.q[i]);
        int i2 = this.l - 1;
        this.l = i2;
        this.q[i] = false;
        if (i2 == 0) {
            this.s = Long.MIN_VALUE;
            pbz pbzVar = this.y;
            if (pbzVar.b) {
                pbzVar.a();
                return;
            }
            r();
            this.F.c(0);
        }
    }

    @Override // defpackage.ouh
    public final void h(int i, long j) {
        pce.d(this.k);
        pce.d(!this.q[i]);
        int i2 = this.l + 1;
        this.l = i2;
        this.q[i] = true;
        this.o[i] = true;
        this.p[i] = false;
        if (i2 == 1) {
            if (true != this.i.c()) {
                j = 0;
            }
            this.s = j;
            this.t = j;
            t(j);
        }
    }

    @Override // defpackage.ouh
    public final void i() {
        if (this.A == null) {
            return;
        }
        if (!u()) {
            int i = 3;
            if (this.i != null && !this.i.c()) {
                i = 6;
            }
            if (this.B > i) {
                throw this.A;
            }
            return;
        }
        throw this.A;
    }

    @Override // defpackage.ouh
    public final void j() {
        pbz pbzVar;
        pce.d(this.r > 0);
        int i = this.r - 1;
        this.r = i;
        if (i != 0 || (pbzVar = this.y) == null) {
            return;
        }
        pbzVar.c(new oxs(this));
        this.y = null;
    }

    @Override // defpackage.ouh
    public final void k(long j) {
        pce.d(this.k);
        int i = 0;
        pce.d(this.l > 0);
        if (true != this.i.c()) {
            j = 0;
        }
        long j2 = v() ? this.u : this.s;
        this.s = j;
        this.t = j;
        if (j2 == j) {
            return;
        }
        boolean z = !v();
        int i2 = 0;
        while (true) {
            if (z) {
                if (i2 >= this.e.size()) {
                    break;
                }
                z = ((oxv) this.e.valueAt(i2)).h(j);
                i2++;
            } else {
                t(j);
                break;
            }
        }
        while (true) {
            boolean[] zArr = this.p;
            if (i >= zArr.length) {
                return;
            }
            zArr[i] = true;
            i++;
        }
    }

    @Override // defpackage.ouh
    public final boolean l(int i, long j) {
        pce.d(this.k);
        pce.d(this.q[i]);
        this.s = j;
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.q;
            if (i2 >= zArr.length) {
                break;
            }
            if (!zArr[i2]) {
                oxv oxvVar = (oxv) this.e.valueAt(i2);
                while (oxvVar.a.e(oxvVar.b) && oxvVar.b.e < j) {
                    oxvVar.a.d();
                    oxvVar.c = true;
                }
            }
            i2++;
        }
        if (this.D) {
            return true;
        }
        s();
        return !v() && !((oxv) this.e.valueAt(i)).e();
    }

    @Override // defpackage.ouh
    public final boolean m() {
        if (this.k) {
            return true;
        }
        if (this.y == null) {
            this.y = new pbz("Loader:ExtractorSampleSource");
        }
        s();
        if (this.i != null && this.h) {
            for (int i = 0; i < this.e.size(); i++) {
                if (((oxv) this.e.valueAt(i)).e != null) {
                }
            }
            int size = this.e.size();
            this.q = new boolean[size];
            this.p = new boolean[size];
            this.o = new boolean[size];
            this.m = new MediaFormat[size];
            this.n = -1L;
            for (int i2 = 0; i2 < size; i2++) {
                MediaFormat mediaFormat = ((oxv) this.e.valueAt(i2)).e;
                this.m[i2] = mediaFormat;
                long j = mediaFormat.e;
                if (j != -1 && j > this.n) {
                    this.n = j;
                }
            }
            this.k = true;
            return true;
        }
        return false;
    }

    @Override // defpackage.pbv
    public final void n(pbx pbxVar) {
        this.D = true;
    }

    @Override // defpackage.pbv
    public final void p() {
        if (this.l > 0) {
            t(this.u);
            return;
        }
        r();
        this.F.c(0);
    }

    @Override // defpackage.oxr
    public final oyf pP(int i) {
        oxv oxvVar = (oxv) this.e.get(i);
        if (oxvVar == null) {
            oxv oxvVar2 = new oxv(this, this.F);
            this.e.put(i, oxvVar2);
            return oxvVar2;
        }
        return oxvVar;
    }

    @Override // defpackage.oxr
    public final void pQ(owx owxVar) {
        this.j = owxVar;
    }

    @Override // defpackage.oxr
    public final void pR() {
        this.h = true;
    }

    @Override // defpackage.oxr
    public final void pS(oye oyeVar) {
        this.i = oyeVar;
    }

    @Override // defpackage.pbv
    public final void o(pbx pbxVar, IOException iOException) {
        this.A = iOException;
        int i = 1;
        if (this.b <= this.E) {
            i = 1 + this.B;
        }
        this.B = i;
        this.C = SystemClock.elapsedRealtime();
        s();
    }
}
