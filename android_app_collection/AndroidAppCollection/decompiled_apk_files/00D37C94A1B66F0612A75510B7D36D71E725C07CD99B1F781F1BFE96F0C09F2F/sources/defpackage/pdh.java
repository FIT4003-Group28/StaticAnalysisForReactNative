package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: pdh  reason: default package */
/* loaded from: classes4.dex */
public final class pdh implements asv {
    private final pde a;
    private final asv b;
    private final asv c;
    private final asv d;
    private final afjk e;
    private final boolean f;
    private final boolean g;
    private Uri h;
    private asy i;
    private asy j;
    private asv k;
    private long l;
    private long m;
    private long n;
    private pdj o;
    private boolean p;
    private boolean q;
    private long r;
    private long s;

    public pdh(pde pdeVar, asv asvVar, asv asvVar2, axd axdVar, int i, afjk afjkVar) {
        this.a = pdeVar;
        this.b = asvVar2;
        boolean z = false;
        this.f = 1 == (i & 1);
        this.g = (i & 2) != 0 ? true : z;
        this.d = asvVar;
        this.c = axdVar != null ? new ayg(asvVar, axdVar) : null;
        this.e = afjkVar;
    }

    private final void c() {
        asv asvVar = this.k;
        if (asvVar != null) {
            try {
                asvVar.j();
                this.j = null;
                this.k = null;
                pdj pdjVar = this.o;
                if (pdjVar == null) {
                    return;
                }
                this.a.k(pdjVar);
                this.o = null;
            } catch (Throwable th) {
                this.j = null;
                this.k = null;
                pdj pdjVar2 = this.o;
                if (pdjVar2 != null) {
                    this.a.k(pdjVar2);
                    this.o = null;
                }
                throw th;
            }
        }
    }

    private final void d(Throwable th) {
        if (k() || (th instanceof pdc)) {
            this.p = true;
        }
    }

    private final void e(boolean z) {
        pdj b;
        long j;
        asy a;
        asv asvVar;
        String str = this.i.i;
        Uri uri = null;
        if (this.q) {
            b = null;
        } else if (this.f) {
            try {
                b = this.a.b(str, this.m);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            b = this.a.c(str, this.m);
        }
        if (b == null) {
            asvVar = this.d;
            asx a2 = this.i.a();
            a2.f = this.m;
            a2.g = this.n;
            a = a2.a();
        } else if (b.d) {
            Uri fromFile = Uri.fromFile(b.e);
            long j2 = b.b;
            long j3 = this.m - j2;
            long j4 = b.c - j3;
            long j5 = this.n;
            if (j5 != -1) {
                j4 = Math.min(j4, j5);
            }
            asx a3 = this.i.a();
            a3.a = fromFile;
            a3.b = j2;
            a3.f = j3;
            a3.g = j4;
            a = a3.a();
            asvVar = this.b;
        } else {
            if (b.c()) {
                j = this.n;
            } else {
                j = b.c;
                long j6 = this.n;
                if (j6 != -1) {
                    j = Math.min(j, j6);
                }
            }
            asx a4 = this.i.a();
            a4.f = this.m;
            a4.g = j;
            a = a4.a();
            asvVar = this.c;
            if (asvVar == null) {
                asvVar = this.d;
                this.a.k(b);
                b = null;
            }
        }
        long j7 = Long.MAX_VALUE;
        if (!this.q && asvVar == this.d) {
            j7 = this.m + 102400;
        }
        this.s = j7;
        if (z) {
            ptx.e(this.k == this.d);
            if (asvVar == this.d) {
                return;
            }
            try {
                c();
            } catch (Throwable th) {
                if (b.b()) {
                    this.a.k(b);
                }
                throw th;
            }
        }
        if (b != null && b.b()) {
            this.o = b;
        }
        this.k = asvVar;
        this.j = a;
        this.l = 0L;
        long h = asvVar.h(a);
        pdq pdqVar = new pdq();
        if (this.j.h == -1 && h != -1) {
            this.n = h;
            pdq.b(pdqVar, this.m + h);
        }
        if (l()) {
            this.h = this.k.i();
            if (!this.i.a.equals(this.h)) {
                uri = this.h;
            }
            if (uri == null) {
                pdqVar.b.add("exo_redir");
                pdqVar.a.remove("exo_redir");
            } else {
                pdqVar.a("exo_redir", uri.toString());
            }
        }
        if (m()) {
            this.a.h(str, pdqVar);
        }
    }

    private final void f() {
        this.n = 0L;
        if (m()) {
            pdq pdqVar = new pdq();
            pdq.b(pdqVar, this.m);
            this.a.h(this.i.i, pdqVar);
        }
    }

    private final boolean k() {
        return this.k == this.b;
    }

    private final boolean l() {
        return !k();
    }

    private final boolean m() {
        return this.k == this.c;
    }

    @Override // defpackage.asv
    public final Map a() {
        if (l()) {
            return this.d.a();
        }
        return Collections.emptyMap();
    }

    @Override // defpackage.asv
    public final void b(atk atkVar) {
        this.b.b(atkVar);
        this.d.b(atkVar);
    }

    @Override // defpackage.ast
    public final int g(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.n == 0) {
            return -1;
        }
        try {
            if (this.m >= this.s) {
                e(true);
            }
            int g = this.k.g(bArr, i, i2);
            if (g == -1) {
                if (l()) {
                    long j = this.j.h;
                    if (j == -1 || this.l < j) {
                        f();
                    }
                }
                long j2 = this.n;
                if (j2 <= 0) {
                    if (j2 == -1) {
                    }
                }
                c();
                e(false);
                return g(bArr, i, i2);
            }
            if (k()) {
                this.r += g;
            }
            long j3 = g;
            this.m += j3;
            this.l += j3;
            long j4 = this.n;
            if (j4 != -1) {
                this.n = j4 - j3;
            }
            return g;
        } catch (IOException e) {
            if (this.j.h == -1) {
                for (Throwable th = e; th != null; th = th.getCause()) {
                    if ((th instanceof asw) && ((asw) th).a == 2008) {
                        f();
                        return -1;
                    }
                }
            }
            d(e);
            throw e;
        } catch (Throwable th2) {
            d(th2);
            throw th2;
        }
    }

    @Override // defpackage.asv
    public final long h(asy asyVar) {
        int i;
        long a;
        afjk afjkVar;
        try {
            String str = asyVar.i;
            if (str == null) {
                str = asyVar.a.toString();
            }
            asx a2 = asyVar.a();
            a2.h = str;
            asy a3 = a2.a();
            this.i = a3;
            pde pdeVar = this.a;
            Uri uri = a3.a;
            pdp d = pdeVar.d(str);
            Uri uri2 = null;
            String str2 = ((pdr) d).b.containsKey("exo_redir") ? new String((byte[]) ((pdr) d).b.get("exo_redir"), Charset.forName("UTF-8")) : null;
            if (str2 != null) {
                uri2 = Uri.parse(str2);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.h = uri;
            this.m = asyVar.g;
            boolean z = true;
            if (!this.g || !this.p) {
                i = asyVar.h == -1 ? 1 : -1;
            } else {
                i = 0;
            }
            if (i == -1) {
                z = false;
            }
            this.q = z;
            if (z && (afjkVar = this.e) != null) {
                afjkVar.b(i);
            }
            if (this.q) {
                this.n = -1L;
                a = -1;
            } else {
                a = pdo.a(this.a.d(str));
                this.n = a;
                if (a != -1) {
                    a -= asyVar.g;
                    this.n = a;
                    if (a < 0) {
                        throw new asw(2008);
                    }
                }
            }
            long j = asyVar.h;
            if (j != -1) {
                a = a == -1 ? j : Math.min(a, j);
                this.n = a;
            }
            if (a > 0 || a == -1) {
                e(false);
            }
            long j2 = asyVar.h;
            return j2 != -1 ? j2 : this.n;
        } catch (Throwable th) {
            d(th);
            throw th;
        }
    }

    @Override // defpackage.asv
    public final Uri i() {
        return this.h;
    }

    @Override // defpackage.asv
    public final void j() {
        this.i = null;
        this.h = null;
        if (this.e != null && this.r > 0) {
            try {
                this.a.a();
            } catch (Exception e) {
                this.e.a(e);
            }
            this.e.c(this.r);
            this.r = 0L;
        }
        try {
            c();
        } catch (IOException e2) {
            d(e2);
            throw e2;
        }
    }
}
