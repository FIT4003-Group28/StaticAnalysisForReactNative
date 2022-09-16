package defpackage;

import defpackage.dcpz;
import defpackage.dcqw;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: dcqm  reason: default package */
/* loaded from: classes.dex */
public abstract class dcqm<LOGGER extends dcpz<API>, API extends dcqw<API>> implements dcqw, dcrj {
    private static final String a = new String();
    public final long b;
    public dcqk c;
    private final Level d;
    private dcqp e;
    private dcsl f;
    private Object[] g;

    /* JADX INFO: Access modifiers changed from: protected */
    public dcqm(Level level, boolean z) {
        long l = dcsh.l();
        this.c = null;
        this.e = null;
        this.f = null;
        this.g = null;
        dcuj.a(level, "level");
        this.d = level;
        this.b = l;
        if (z) {
            m(dcqj.e, Boolean.TRUE);
        }
    }

    private final boolean w() {
        dcqq dcqqVar;
        if (this.e == null) {
            dcqp b = dcsh.a().b(dcqm.class, 1);
            dcuj.a(b, "logger backend must not return a null LogSite");
            this.e = b;
        }
        if (this.e != dcqp.a) {
            dcqqVar = this.e;
            String str = (String) l().e(dcqj.d);
            if (str != null) {
                dcqqVar = new dcql(this.e, str);
            }
        } else {
            dcqqVar = null;
        }
        if (!b(dcqqVar)) {
            return false;
        }
        dctw i = dcsh.i();
        if (!i.c.isEmpty()) {
            m(dcqj.f, i);
        }
        return true;
    }

    private final void x(String str, Object... objArr) {
        this.g = objArr;
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof dcqg) {
                objArr[i] = ((dcqg) obj).a();
            }
        }
        if (str != a) {
            this.f = new dcsl(a(), str);
        }
        LOGGER c = c();
        try {
            c.a.c(this);
        } catch (RuntimeException e) {
            try {
                c.a.d(e, this);
            } catch (dcrm e2) {
                throw e2;
            } catch (RuntimeException e3) {
                PrintStream printStream = System.err;
                String valueOf = String.valueOf(e3.getMessage());
                printStream.println(valueOf.length() != 0 ? "logging error: ".concat(valueOf) : new String("logging error: "));
                deki.d(e3, System.err);
            }
        }
    }

    protected abstract dcuf a();

    protected boolean b(dcqq dcqqVar) {
        throw null;
    }

    protected abstract LOGGER c();

    @Override // defpackage.dcrj
    public final Level d() {
        return this.d;
    }

    @Override // defpackage.dcrj
    public final long e() {
        return this.b;
    }

    @Override // defpackage.dcrj
    public final String f() {
        return c().a.a();
    }

    @Override // defpackage.dcrj
    public final dcqp g() {
        dcqp dcqpVar = this.e;
        if (dcqpVar != null) {
            return dcqpVar;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    @Override // defpackage.dcrj
    public final dcsl h() {
        return this.f;
    }

    @Override // defpackage.dcrj
    public final Object[] i() {
        if (this.f != null) {
            return this.g;
        }
        throw new IllegalStateException("cannot get arguments unless a template context exists");
    }

    @Override // defpackage.dcrj
    public final Object j() {
        if (this.f != null) {
            throw new IllegalStateException("cannot get literal argument if a template context exists");
        }
        return this.g[0];
    }

    @Override // defpackage.dcrj
    public final boolean k() {
        return this.c != null && Boolean.TRUE.equals(this.c.e(dcqj.e));
    }

    @Override // defpackage.dcrj
    public final dcrp l() {
        dcqk dcqkVar = this.c;
        return dcqkVar != null ? dcqkVar : dcro.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <T> void m(dcqy<T> dcqyVar, T t) {
        if (this.c == null) {
            this.c = new dcqk();
        }
        dcqk dcqkVar = this.c;
        int d = dcqkVar.d(dcqyVar);
        if (d == -1) {
            int i = dcqkVar.b + 1;
            Object[] objArr = dcqkVar.a;
            int length = objArr.length;
            if (i + i > length) {
                dcqkVar.a = Arrays.copyOf(objArr, length + length);
            }
            Object[] objArr2 = dcqkVar.a;
            int i2 = dcqkVar.b;
            dcuj.a(dcqyVar, "metadata key");
            objArr2[i2 + i2] = dcqyVar;
            Object[] objArr3 = dcqkVar.a;
            int i3 = dcqkVar.b;
            dcuj.a(t, "metadata value");
            objArr3[i3 + i3 + 1] = t;
            dcqkVar.b++;
            return;
        }
        Object[] objArr4 = dcqkVar.a;
        dcuj.a(t, "metadata value");
        objArr4[d + d + 1] = t;
    }

    @Override // defpackage.dcqw
    public final API n(Throwable th) {
        if (th != null) {
            m(dcqj.a, th);
        }
        return this;
    }

    @Override // defpackage.dcqw
    public final void o() {
        if (w()) {
            x(a, "");
        }
    }

    @Override // defpackage.dcqw
    public final void p(String str) {
        if (w()) {
            x(a, str);
        }
    }

    @Override // defpackage.dcqw
    public final void q(String str, Object obj) {
        if (w()) {
            x(str, obj);
        }
    }

    @Override // defpackage.dcqw
    public final void r(String str, Object obj, Object obj2, Object obj3) {
        if (w()) {
            x(str, obj, obj2, obj3);
        }
    }

    @Override // defpackage.dcqw
    public final void s(String str, int i, Object obj) {
        if (w()) {
            x("Deleting %d reservations for key: %s.", Integer.valueOf(i), obj);
        }
    }

    @Override // defpackage.dcqw
    public final API t(int i) {
        dcqo dcqoVar = new dcqo(i);
        if (this.e == null) {
            this.e = dcqoVar;
        }
        return this;
    }

    @Override // defpackage.dcqw
    public final void u(TimeUnit timeUnit) {
        throw null;
    }

    @Override // defpackage.dcqw
    public final void v(dcqz dcqzVar) {
        throw null;
    }
}
