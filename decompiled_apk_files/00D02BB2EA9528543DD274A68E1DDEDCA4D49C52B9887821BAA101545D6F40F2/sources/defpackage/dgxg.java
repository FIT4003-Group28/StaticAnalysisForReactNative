package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
/* compiled from: PG */
/* renamed from: dgxg  reason: default package */
/* loaded from: classes6.dex */
public class dgxg implements Closeable, Flushable {
    private static final String[] a = new String[128];
    private static final String[] b;
    public boolean c;
    public boolean d;
    public boolean e;
    private final Writer f;
    private int[] g = new int[32];
    private int h = 0;
    private final String i;
    private String j;

    static {
        for (int i = 0; i <= 31; i++) {
            a[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        b = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public dgxg(Writer writer) {
        l(6);
        this.i = ":";
        this.e = true;
        if (writer != null) {
            this.f = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    private final void l(int i) {
        int i2 = this.h;
        int[] iArr = this.g;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[i2 + i2];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.g = iArr2;
        }
        int[] iArr3 = this.g;
        int i3 = this.h;
        this.h = i3 + 1;
        iArr3[i3] = i;
    }

    private final int m() {
        int i = this.h;
        if (i == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        return this.g[i - 1];
    }

    private final void n(int i) {
        this.g[this.h - 1] = i;
    }

    private final void o() {
        if (this.j != null) {
            int m = m();
            if (m == 5) {
                this.f.write(44);
            } else if (m != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            n(4);
            p(this.j);
            this.j = null;
        }
    }

    private final void q() {
        int m = m();
        if (m == 1) {
            n(2);
        } else if (m == 2) {
            this.f.append(',');
        } else if (m != 4) {
            if (m != 6) {
                if (m != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.c) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            n(7);
        } else {
            this.f.append((CharSequence) this.i);
            n(5);
        }
    }

    private final void r(int i, int i2, String str) {
        int m = m();
        if (m == i2 || m == i) {
            if (this.j != null) {
                throw new IllegalStateException("Dangling name: " + this.j);
            }
            this.h--;
            this.f.write(str);
            return;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    private final void s(int i, String str) {
        q();
        l(i);
        this.f.write(str);
    }

    public void a() {
        o();
        s(1, "[");
    }

    public void b() {
        o();
        s(3, "{");
    }

    public void c() {
        r(1, 2, "]");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f.close();
        int i = this.h;
        if (i > 1 || (i == 1 && this.g[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.h = 0;
    }

    public void d() {
        r(3, 5, "}");
    }

    public void e(String str) {
        if (str != null) {
            if (this.j == null) {
                if (this.h != 0) {
                    this.j = str;
                    return;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    public void f() {
        if (this.j != null) {
            if (this.e) {
                o();
            } else {
                this.j = null;
                return;
            }
        }
        q();
        this.f.write("null");
    }

    public void flush() {
        if (this.h == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f.flush();
    }

    public void g(long j) {
        o();
        q();
        this.f.write(Long.toString(j));
    }

    public void h(Boolean bool) {
        if (bool == null) {
            f();
            return;
        }
        o();
        q();
        this.f.write(true != bool.booleanValue() ? "false" : "true");
    }

    public void i(Number number) {
        if (number == null) {
            f();
            return;
        }
        o();
        String obj = number.toString();
        if (this.c || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            q();
            this.f.append((CharSequence) obj);
            return;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public void j(String str) {
        if (str == null) {
            f();
            return;
        }
        o();
        q();
        p(str);
    }

    public void k(boolean z) {
        o();
        q();
        this.f.write(true != z ? "false" : "true");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void p(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.d
            if (r0 == 0) goto L7
            java.lang.String[] r0 = defpackage.dgxg.b
            goto L9
        L7:
            java.lang.String[] r0 = defpackage.dgxg.a
        L9:
            java.io.Writer r1 = r8.f
            java.lang.String r2 = "\""
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgxg.p(java.lang.String):void");
    }
}
