package defpackage;

import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dgvi  reason: default package */
/* loaded from: classes6.dex */
public final class dgvi extends dgxe {
    private static final Reader c = new dgvh();
    private static final Object d = new Object();
    private Object[] e;
    private int f;
    private String[] g;
    private int[] h;

    public dgvi(dgtc dgtcVar) {
        super(c);
        this.e = new Object[32];
        this.f = 0;
        this.g = new String[32];
        this.h = new int[32];
        o(dgtcVar);
    }

    private final Object u() {
        Object[] objArr = this.e;
        int i = this.f - 1;
        this.f = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    private final String v() {
        return " at path " + p();
    }

    @Override // defpackage.dgxe
    public final void a() {
        r(1);
        o(((dgta) f()).iterator());
        this.h[this.f - 1] = 0;
    }

    @Override // defpackage.dgxe
    public final void b() {
        r(2);
        u();
        u();
        int i = this.f;
        if (i > 0) {
            int[] iArr = this.h;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.dgxe
    public final void c() {
        r(3);
        o(((dgtf) f()).b().iterator());
    }

    @Override // defpackage.dgxe, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e = new Object[]{d};
        this.f = 1;
    }

    @Override // defpackage.dgxe
    public final void d() {
        r(4);
        u();
        u();
        int i = this.f;
        if (i > 0) {
            int[] iArr = this.h;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.dgxe
    public final boolean e() {
        int q = q();
        return (q == 4 || q == 2) ? false : true;
    }

    public final Object f() {
        return this.e[this.f - 1];
    }

    @Override // defpackage.dgxe
    public final String g() {
        r(5);
        Map.Entry entry = (Map.Entry) ((Iterator) f()).next();
        String str = (String) entry.getKey();
        this.g[this.f - 1] = str;
        o(entry.getValue());
        return str;
    }

    @Override // defpackage.dgxe
    public final String h() {
        int q = q();
        if (q == 6 || q == 7) {
            String c2 = ((dgth) u()).c();
            int i = this.f;
            if (i > 0) {
                int[] iArr = this.h;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return c2;
        }
        throw new IllegalStateException("Expected " + ((Object) "STRING") + " but was " + ((Object) dgxf.a(q)) + v());
    }

    @Override // defpackage.dgxe
    public final boolean i() {
        r(8);
        boolean h = ((dgth) u()).h();
        int i = this.f;
        if (i > 0) {
            int[] iArr = this.h;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return h;
    }

    @Override // defpackage.dgxe
    public final void j() {
        r(9);
        u();
        int i = this.f;
        if (i > 0) {
            int[] iArr = this.h;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.dgxe
    public final double k() {
        double parseDouble;
        int q = q();
        if (q == 7 || q == 6) {
            dgth dgthVar = (dgth) f();
            if (!dgthVar.i()) {
                parseDouble = Double.parseDouble(dgthVar.c());
            } else {
                parseDouble = dgthVar.j().doubleValue();
            }
            if (this.a || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
                u();
                int i = this.f;
                if (i > 0) {
                    int[] iArr = this.h;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return parseDouble;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + parseDouble);
        }
        throw new IllegalStateException("Expected " + ((Object) "NUMBER") + " but was " + ((Object) dgxf.a(q)) + v());
    }

    @Override // defpackage.dgxe
    public final long l() {
        long parseLong;
        int q = q();
        if (q == 7 || q == 6) {
            dgth dgthVar = (dgth) f();
            if (!dgthVar.i()) {
                parseLong = Long.parseLong(dgthVar.c());
            } else {
                parseLong = dgthVar.j().longValue();
            }
            u();
            int i = this.f;
            if (i > 0) {
                int[] iArr = this.h;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return parseLong;
        }
        throw new IllegalStateException("Expected " + ((Object) "NUMBER") + " but was " + ((Object) dgxf.a(q)) + v());
    }

    @Override // defpackage.dgxe
    public final int m() {
        int q = q();
        if (q == 7 || q == 6) {
            int d2 = ((dgth) f()).d();
            u();
            int i = this.f;
            if (i > 0) {
                int[] iArr = this.h;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return d2;
        }
        throw new IllegalStateException("Expected " + ((Object) "NUMBER") + " but was " + ((Object) dgxf.a(q)) + v());
    }

    @Override // defpackage.dgxe
    public final void n() {
        if (q() == 5) {
            g();
            this.g[this.f - 2] = "null";
        } else {
            u();
            int i = this.f;
            if (i > 0) {
                this.g[i - 1] = "null";
            }
        }
        int i2 = this.f;
        if (i2 > 0) {
            int[] iArr = this.h;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public final void o(Object obj) {
        int i = this.f;
        Object[] objArr = this.e;
        if (i == objArr.length) {
            int i2 = i + i;
            Object[] objArr2 = new Object[i2];
            int[] iArr = new int[i2];
            String[] strArr = new String[i2];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.h, 0, iArr, 0, this.f);
            System.arraycopy(this.g, 0, strArr, 0, this.f);
            this.e = objArr2;
            this.h = iArr;
            this.g = strArr;
        }
        Object[] objArr3 = this.e;
        int i3 = this.f;
        this.f = i3 + 1;
        objArr3[i3] = obj;
    }

    @Override // defpackage.dgxe
    public final String p() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (i < this.f) {
            Object[] objArr = this.e;
            Object obj = objArr[i];
            if (obj instanceof dgta) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.h[i]);
                    sb.append(']');
                }
            } else if (obj instanceof dgtf) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String str = this.g[i];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    @Override // defpackage.dgxe
    public final int q() {
        if (this.f == 0) {
            return 10;
        }
        Object f = f();
        if (f instanceof Iterator) {
            boolean z = this.e[this.f - 2] instanceof dgtf;
            Iterator it = (Iterator) f;
            if (!it.hasNext()) {
                return z ? 4 : 2;
            } else if (z) {
                return 5;
            } else {
                o(it.next());
                return q();
            }
        } else if (f instanceof dgtf) {
            return 3;
        } else {
            if (f instanceof dgta) {
                return 1;
            }
            if (f instanceof dgth) {
                dgth dgthVar = (dgth) f;
                if (dgthVar.a instanceof String) {
                    return 6;
                }
                if (dgthVar.b()) {
                    return 8;
                }
                if (!dgthVar.i()) {
                    throw new AssertionError();
                }
                return 7;
            } else if (f instanceof dgte) {
                return 9;
            } else {
                if (f == d) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public final void r(int i) {
        if (q() == i) {
            return;
        }
        throw new IllegalStateException("Expected " + ((Object) dgxf.a(i)) + " but was " + ((Object) dgxf.a(q())) + v());
    }

    @Override // defpackage.dgxe
    public final String toString() {
        return getClass().getSimpleName();
    }
}
