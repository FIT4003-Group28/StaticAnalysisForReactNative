package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cmlv  reason: default package */
/* loaded from: classes5.dex */
public final class cmlv implements cmkg {
    private final cmls a;
    private final cmkg b;
    private final cmkg c;
    private final cmkg d;
    private Uri e;
    private cmkj f;
    private cmkg g;
    private boolean h;
    private long i;
    private long j;
    private cmly k;
    private long l;
    private long m;

    public cmlv(cmls cmlsVar, cmkg cmkgVar, cmkg cmkgVar2, cmlu cmluVar) {
        this.a = cmlsVar;
        this.b = cmkgVar2;
        cmlx cmlxVar = cmlx.b;
        this.d = cmkgVar;
        this.c = new cmln(cmkgVar, cmluVar);
    }

    private final void g(cmkj cmkjVar, boolean z) {
        cmkj a;
        cmkg cmkgVar;
        String str = cmkjVar.h;
        int i = cmny.a;
        cmly a2 = this.a.a(str, this.i, this.j);
        if (a2 == null) {
            cmkgVar = this.d;
            cmki c = cmkjVar.c();
            c.e = this.i;
            c.f = this.j;
            a = c.a();
        } else if (a2.d) {
            Uri fromFile = Uri.fromFile(a2.e);
            long j = a2.b;
            long j2 = this.i - j;
            long j3 = a2.c - j2;
            long j4 = this.j;
            if (j4 != -1) {
                j3 = Math.min(j3, j4);
            }
            cmki c2 = cmkjVar.c();
            c2.a = fromFile;
            c2.b = j;
            c2.e = j2;
            c2.f = j3;
            a = c2.a();
            cmkgVar = this.b;
        } else {
            long j5 = a2.c;
            if (j5 == -1) {
                j5 = this.j;
            } else {
                long j6 = this.j;
                if (j6 != -1) {
                    j5 = Math.min(j5, j6);
                }
            }
            cmki c3 = cmkjVar.c();
            c3.e = this.i;
            c3.f = j5;
            a = c3.a();
            cmkgVar = this.c;
        }
        cmkg cmkgVar2 = this.d;
        this.m = cmkgVar == cmkgVar2 ? this.i + 102400 : Long.MAX_VALUE;
        boolean z2 = true;
        if (z) {
            cmmn.c(this.g == cmkgVar2);
            if (cmkgVar == this.d) {
                return;
            }
            try {
                l();
            } catch (Throwable th) {
                if (a2.a()) {
                    this.a.d(a2);
                }
                throw th;
            }
        }
        if (a2 != null && a2.a()) {
            this.k = a2;
        }
        this.g = cmkgVar;
        if (a.g != -1) {
            z2 = false;
        }
        this.h = z2;
        long c4 = cmkgVar.c(a);
        cmmg cmmgVar = new cmmg();
        if (this.h && c4 != -1) {
            this.j = c4;
            cmmg.b(cmmgVar, this.i + c4);
        }
        if (i()) {
            this.e = cmkgVar.d();
            Uri uri = !cmkjVar.a.equals(this.e) ? this.e : null;
            if (uri == null) {
                cmmgVar.b.add("exo_redir");
                cmmgVar.a.remove("exo_redir");
            } else {
                cmmgVar.a("exo_redir", uri.toString());
            }
        }
        if (k()) {
            this.a.f(str, cmmgVar);
        }
    }

    private final void h(String str) {
        this.j = 0L;
        if (k()) {
            cmmg cmmgVar = new cmmg();
            cmmg.b(cmmgVar, this.i);
            this.a.f(str, cmmgVar);
        }
    }

    private final boolean i() {
        return !j();
    }

    private final boolean j() {
        return this.g == this.b;
    }

    private final boolean k() {
        return this.g == this.c;
    }

    private final void l() {
        cmkg cmkgVar = this.g;
        if (cmkgVar != null) {
            try {
                cmkgVar.f();
                this.g = null;
                this.h = false;
                cmly cmlyVar = this.k;
                if (cmlyVar == null) {
                    return;
                }
                this.a.d(cmlyVar);
                this.k = null;
            } catch (Throwable th) {
                this.g = null;
                this.h = false;
                cmly cmlyVar2 = this.k;
                if (cmlyVar2 != null) {
                    this.a.d(cmlyVar2);
                    this.k = null;
                }
                throw th;
            }
        }
    }

    @Override // defpackage.cmkd
    public final int a(byte[] bArr, int i, int i2) {
        cmkj cmkjVar = this.f;
        cmmn.f(cmkjVar);
        if (i2 == 0) {
            return 0;
        }
        if (this.j == 0) {
            return -1;
        }
        try {
            if (this.i >= this.m) {
                g(cmkjVar, true);
            }
            cmkg cmkgVar = this.g;
            cmmn.f(cmkgVar);
            int a = cmkgVar.a(bArr, i, i2);
            if (a != -1) {
                if (j()) {
                    this.l += a;
                }
                long j = a;
                this.i += j;
                long j2 = this.j;
                if (j2 != -1) {
                    this.j = j2 - j;
                }
            } else if (this.h) {
                String str = cmkjVar.h;
                int i3 = cmny.a;
                h(str);
            } else {
                long j3 = this.j;
                if (j3 <= 0) {
                    if (j3 == -1) {
                    }
                }
                l();
                g(cmkjVar, false);
                return a(bArr, i, i2);
            }
            return a;
        } catch (IOException e) {
            if (this.h) {
                for (Throwable th = e; th != null; th = th.getCause()) {
                    if (th instanceof cmkh) {
                        cmkh cmkhVar = (cmkh) th;
                        String str2 = cmkjVar.h;
                        int i4 = cmny.a;
                        h(str2);
                        return -1;
                    }
                }
            }
            throw e;
        }
    }

    @Override // defpackage.cmkg
    public final void b(cmlo cmloVar) {
        cmmn.f(cmloVar);
        this.b.b(cmloVar);
        this.d.b(cmloVar);
    }

    @Override // defpackage.cmkg
    public final long c(cmkj cmkjVar) {
        String str = cmkjVar.h;
        if (str == null) {
            str = cmkjVar.a.toString();
        }
        cmki c = cmkjVar.c();
        c.g = str;
        cmkj a = c.a();
        this.f = a;
        cmls cmlsVar = this.a;
        Uri uri = a.a;
        String b = cmlsVar.g(str).b();
        Uri parse = b == null ? null : Uri.parse(b);
        if (parse != null) {
            uri = parse;
        }
        this.e = uri;
        this.i = cmkjVar.f;
        long j = cmkjVar.g;
        if (j == -1) {
            long a2 = cmme.a(this.a.g(str));
            this.j = a2;
            if (a2 != -1) {
                long j2 = a2 - cmkjVar.f;
                this.j = j2;
                if (j2 <= 0) {
                    throw new cmkh();
                }
            }
        } else {
            this.j = j;
        }
        g(a, false);
        return this.j;
    }

    @Override // defpackage.cmkg
    public final Uri d() {
        return this.e;
    }

    @Override // defpackage.cmkg
    public final Map<String, List<String>> e() {
        if (i()) {
            return this.d.e();
        }
        return Collections.emptyMap();
    }

    @Override // defpackage.cmkg
    public final void f() {
        this.f = null;
        this.e = null;
        this.i = 0L;
        l();
    }
}
