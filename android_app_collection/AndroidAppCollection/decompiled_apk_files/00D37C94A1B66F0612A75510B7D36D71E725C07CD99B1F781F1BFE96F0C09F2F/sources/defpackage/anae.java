package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: anae  reason: default package */
/* loaded from: classes.dex */
public abstract class anae implements anap, anbe {
    private static final String a = new String();
    public final long b;
    public anad c;
    private final Level d;
    private anah e;
    private ancf f;
    private Object[] g;

    /* JADX INFO: Access modifiers changed from: protected */
    public anae(Level level) {
        long b = ancd.b();
        this.c = null;
        this.e = null;
        this.f = null;
        this.g = null;
        anha.c(level, "level");
        this.d = level;
        this.b = b;
    }

    private final void C(String str, Object... objArr) {
        this.g = objArr;
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof amzz) {
                objArr[i] = ((amzz) obj).a();
            }
        }
        if (str != a) {
            this.f = new ancf(a(), str);
        }
        amzu c = c();
        try {
            andr andrVar = (andr) andr.a.get();
            int i2 = andrVar.b + 1;
            andrVar.b = i2;
            if (i2 == 0) {
                throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
            }
            if (i2 <= 100) {
                c.a.c(this);
            } else {
                amzu.i("unbounded recursion in log statement", this);
            }
            if (andrVar == null) {
                return;
            }
            andrVar.close();
        } catch (RuntimeException e) {
            try {
                c.a.b(e, this);
            } catch (anbg e2) {
                throw e2;
            } catch (RuntimeException e3) {
                String name = e3.getClass().getName();
                String message = e3.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 2 + String.valueOf(message).length());
                sb.append(name);
                sb.append(": ");
                sb.append(message);
                amzu.i(sb.toString(), this);
                try {
                    e3.printStackTrace(System.err);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    private final boolean D() {
        anai anaiVar;
        if (this.e == null) {
            this.e = ancd.g().a(anae.class, 1);
        }
        if (this.e != anah.a) {
            anaiVar = this.e;
            anad anadVar = this.c;
            if (anadVar != null && anadVar.b > 0) {
                anha.c(anaiVar, "logSiteKey");
                int i = anadVar.b;
                for (int i2 = 0; i2 < i; i2++) {
                    if (anac.d.equals(anadVar.c(i2))) {
                        Object e = anadVar.e(i2);
                        if (!(e instanceof anaq)) {
                            anaiVar = new anat(anaiVar, e);
                        } else {
                            anaiVar = ((anaq) e).b();
                        }
                    }
                }
            }
        } else {
            anaiVar = null;
        }
        if (!b(anaiVar)) {
            return false;
        }
        andd k = ancd.k();
        if (!k.c.isEmpty()) {
            n(anac.f, k);
        }
        return true;
    }

    @Override // defpackage.anap
    public final void A(int i, int i2) {
        if (D()) {
            C("Stopping service immediately, intent delivered from previous process. Old PID was %d but current PID is %d", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    @Override // defpackage.anap
    public final void B(boolean z) {
        if (D()) {
            C("#isAvailable(%d) - isAvailable = %b", 0, Boolean.valueOf(z));
        }
    }

    protected abstract andm a();

    protected boolean b(anai anaiVar) {
        throw null;
    }

    protected abstract amzu c();

    protected abstract anap d();

    @Override // defpackage.anbe
    public final long e() {
        return this.b;
    }

    @Override // defpackage.anbe
    public final anah f() {
        anah anahVar = this.e;
        if (anahVar != null) {
            return anahVar;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    @Override // defpackage.anap
    public final anap g(anas anasVar, Object obj) {
        anha.c(anasVar, "metadata key");
        if (obj != null) {
            n(anasVar, obj);
        }
        return d();
    }

    @Override // defpackage.anap
    public final anap h(Throwable th) {
        return g(anac.a, th);
    }

    @Override // defpackage.anap
    public final anap i(String str, String str2, int i, String str3) {
        anag anagVar = new anag(str, str2, i, str3);
        if (this.e == null) {
            this.e = anagVar;
        }
        return d();
    }

    @Override // defpackage.anbe
    public final anbj j() {
        anad anadVar = this.c;
        return anadVar != null ? anadVar : anbi.a;
    }

    @Override // defpackage.anbe
    public final ancf k() {
        return this.f;
    }

    @Override // defpackage.anbe
    public final Object l() {
        if (this.f != null) {
            throw new IllegalStateException("cannot get literal argument if a template context exists");
        }
        return this.g[0];
    }

    @Override // defpackage.anbe
    public final Level m() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(anas anasVar, Object obj) {
        int a2;
        if (this.c == null) {
            this.c = new anad();
        }
        anad anadVar = this.c;
        if (anasVar.b || (a2 = anadVar.a(anasVar)) == -1) {
            int i = anadVar.b + 1;
            Object[] objArr = anadVar.a;
            int length = objArr.length;
            if (i + i > length) {
                anadVar.a = Arrays.copyOf(objArr, length + length);
            }
            Object[] objArr2 = anadVar.a;
            int i2 = anadVar.b;
            anha.c(anasVar, "metadata key");
            objArr2[i2 + i2] = anasVar;
            Object[] objArr3 = anadVar.a;
            int i3 = anadVar.b;
            anha.c(obj, "metadata value");
            objArr3[i3 + i3 + 1] = obj;
            anadVar.b++;
            return;
        }
        Object[] objArr4 = anadVar.a;
        anha.c(obj, "metadata value");
        objArr4[a2 + a2 + 1] = obj;
    }

    @Override // defpackage.anap
    public final void o() {
        if (D()) {
            C(a, "");
        }
    }

    @Override // defpackage.anap
    public final void p(Object obj) {
        if (D()) {
            C("%s", obj);
        }
    }

    @Override // defpackage.anap
    public final void q(String str) {
        if (D()) {
            C(a, str);
        }
    }

    @Override // defpackage.anap
    public final void r(String str, int i) {
        if (D()) {
            C(str, Integer.valueOf(i));
        }
    }

    @Override // defpackage.anap
    public final void s(String str, Object obj) {
        if (D()) {
            C(str, obj);
        }
    }

    @Override // defpackage.anap
    public final void t(String str, int i, Object obj) {
        if (D()) {
            C(str, Integer.valueOf(i), obj);
        }
    }

    @Override // defpackage.anap
    public final void u(String str, Object obj, Object obj2) {
        if (D()) {
            C(str, obj, obj2);
        }
    }

    @Override // defpackage.anap
    public final void v(String str, Object obj, Object obj2, Object obj3) {
        if (D()) {
            C(str, obj, obj2, obj3);
        }
    }

    @Override // defpackage.anap
    public final void w(String str, Object[] objArr) {
        if (D()) {
            C(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.anbe
    public final boolean x() {
        return this.c != null && Boolean.TRUE.equals(this.c.d(anac.e));
    }

    @Override // defpackage.anbe
    public final Object[] y() {
        if (this.f != null) {
            return this.g;
        }
        throw new IllegalStateException("cannot get arguments unless a template context exists");
    }

    @Override // defpackage.anap
    public final anap z(TimeUnit timeUnit) {
        if (x()) {
            return d();
        }
        n(anac.c, anan.a(timeUnit));
        return d();
    }
}
