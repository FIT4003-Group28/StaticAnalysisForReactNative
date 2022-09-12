package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
/* compiled from: PG */
/* renamed from: eand  reason: default package */
/* loaded from: classes6.dex */
public abstract class eand extends eane {
    static final BigDecimal o = new BigDecimal(Long.MIN_VALUE);
    static final BigDecimal p = new BigDecimal(Long.MAX_VALUE);
    static final BigDecimal q = new BigDecimal(Long.MIN_VALUE);
    static final BigDecimal r = new BigDecimal(Long.MAX_VALUE);
    protected final eanm c;
    protected boolean d;
    protected eanf l;
    protected eamz m;
    protected final eaoj n;
    protected int t;
    protected long u;
    protected double v;
    protected BigInteger w;
    protected BigDecimal x;
    protected boolean y;
    protected int z;
    protected int e = 0;
    protected int f = 0;
    protected long g = 0;
    protected int h = 1;
    protected int i = 0;
    protected int j = 1;
    protected int k = 0;
    protected int s = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    public eand(eanm eanmVar, int i) {
        this.a = i;
        this.c = eanmVar;
        this.n = new eaoj(eanmVar.d);
        this.l = new eanf(null, 0, 1, 0);
    }

    protected final void A() {
        throw l("Numeric value (" + e() + ") out of range of long (-9223372036854775808 - 9223372036854775807)");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final eamz B(boolean z, int i) {
        this.y = z;
        this.z = i;
        this.s = 0;
        return eamz.VALUE_NUMBER_FLOAT;
    }

    @Override // defpackage.eamw
    public final String c() {
        return ((this.b == eamz.START_OBJECT || this.b == eamz.START_ARRAY) ? this.l.c : this.l).f;
    }

    @Override // defpackage.eamw, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.d) {
            this.d = true;
            try {
                p();
            } finally {
                q();
            }
        }
    }

    @Override // defpackage.eamw
    public final eamt d() {
        int i = this.e;
        return new eamt(this.c.a, (this.g + i) - 1, this.h, (i - this.i) + 1);
    }

    @Override // defpackage.eamw
    public final int f() {
        int i = this.s;
        if ((i & 1) == 0) {
            if (i == 0) {
                w(1);
            }
            int i2 = this.s;
            if ((i2 & 1) == 0) {
                if ((i2 & 2) != 0) {
                    long j = this.u;
                    int i3 = (int) j;
                    if (i3 != j) {
                        throw l("Numeric value (" + e() + ") out of range of int");
                    }
                    this.t = i3;
                } else if ((i2 & 4) != 0) {
                    this.t = this.w.intValue();
                } else if ((i2 & 8) != 0) {
                    double d = this.v;
                    if (d < -2.147483648E9d || d > 2.147483647E9d) {
                        z();
                    }
                    this.t = (int) this.v;
                } else if ((i2 & 16) != 0) {
                    if (q.compareTo(this.x) > 0 || r.compareTo(this.x) < 0) {
                        z();
                    }
                    this.t = this.x.intValue();
                } else {
                    K();
                }
                this.s |= 1;
            }
        }
        return this.t;
    }

    @Override // defpackage.eamw
    public final long g() {
        int i = this.s;
        if ((i & 2) == 0) {
            if (i == 0) {
                w(2);
            }
            int i2 = this.s;
            if ((i2 & 2) == 0) {
                if ((i2 & 1) != 0) {
                    this.u = this.t;
                } else if ((i2 & 4) != 0) {
                    this.u = this.w.longValue();
                } else if ((i2 & 8) != 0) {
                    double d = this.v;
                    if (d < -9.223372036854776E18d || d > 9.223372036854776E18d) {
                        A();
                    }
                    this.u = (long) this.v;
                } else if ((i2 & 16) != 0) {
                    if (o.compareTo(this.x) > 0 || p.compareTo(this.x) < 0) {
                        A();
                    }
                    this.u = this.x.longValue();
                } else {
                    K();
                }
                this.s |= 2;
            }
        }
        return this.u;
    }

    @Override // defpackage.eamw
    public final BigInteger h() {
        int i = this.s;
        if ((i & 4) == 0) {
            if (i == 0) {
                w(4);
            }
            int i2 = this.s;
            if ((i2 & 4) == 0) {
                if ((i2 & 16) != 0) {
                    this.w = this.x.toBigInteger();
                } else if ((i2 & 2) != 0) {
                    this.w = BigInteger.valueOf(this.u);
                } else if ((i2 & 1) != 0) {
                    this.w = BigInteger.valueOf(this.t);
                } else if ((i2 & 8) != 0) {
                    this.w = BigDecimal.valueOf(this.v).toBigInteger();
                } else {
                    K();
                }
                this.s |= 4;
            }
        }
        return this.w;
    }

    @Override // defpackage.eamw
    public final float i() {
        return (float) j();
    }

    @Override // defpackage.eamw
    public final double j() {
        double d;
        int i = this.s;
        if ((i & 8) == 0) {
            if (i == 0) {
                w(8);
            }
            int i2 = this.s;
            if ((i2 & 8) == 0) {
                if ((i2 & 16) != 0) {
                    this.v = this.x.doubleValue();
                } else {
                    if ((i2 & 4) != 0) {
                        d = this.w.doubleValue();
                    } else if ((i2 & 2) != 0) {
                        d = this.u;
                    } else if ((i2 & 1) != 0) {
                        d = this.t;
                    } else {
                        K();
                    }
                    this.v = d;
                }
                this.s |= 8;
            }
        }
        return this.v;
    }

    @Override // defpackage.eamw
    public final BigDecimal k() {
        int i = this.s;
        if ((i & 16) == 0) {
            if (i == 0) {
                w(16);
            }
            int i2 = this.s;
            if ((i2 & 16) == 0) {
                if ((i2 & 8) != 0) {
                    this.x = new BigDecimal(e());
                } else if ((i2 & 4) != 0) {
                    this.x = new BigDecimal(this.w);
                } else if ((i2 & 2) != 0) {
                    this.x = BigDecimal.valueOf(this.u);
                } else if ((i2 & 1) != 0) {
                    this.x = BigDecimal.valueOf(this.t);
                } else {
                    K();
                }
                this.s |= 16;
            }
        }
        return this.x;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n() {
        if (!o()) {
            D(" in " + this.b);
        }
    }

    protected abstract boolean o();

    protected abstract void p();

    /* JADX INFO: Access modifiers changed from: protected */
    public void q() {
        eaoj eaojVar = this.n;
        if (eaojVar.h != null) {
            eaojVar.d = -1;
            eaojVar.i = 0;
            eaojVar.e = 0;
            eaojVar.c = null;
            eaojVar.j = null;
            eaojVar.k = null;
            if (eaojVar.f) {
                eaojVar.c();
            }
            char[] cArr = eaojVar.h;
            eaojVar.h = null;
            eaojVar.b.e(eaoc.TEXT_BUFFER, cArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eane
    public final void r() {
        if (this.l.a == 0) {
            return;
        }
        D(": expected close marker for " + this.l.c() + " (from " + this.l.i(this.c.a) + ")");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s(int i, char c) {
        throw l("Unexpected close marker '" + ((char) i) + "': expected '" + c + "' (for " + this.l.c() + " starting at " + ("" + this.l.i(this.c.a)) + ")");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final eamz u(boolean z, int i) {
        this.y = z;
        this.z = i;
        this.s = 0;
        return eamz.VALUE_NUMBER_INT;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final eamz v(String str, double d) {
        eaoj eaojVar = this.n;
        eaojVar.c = null;
        eaojVar.d = -1;
        eaojVar.e = 0;
        eaojVar.j = str;
        eaojVar.k = null;
        if (eaojVar.f) {
            eaojVar.c();
        }
        eaojVar.i = 0;
        this.v = d;
        this.s = 8;
        return eamz.VALUE_NUMBER_FLOAT;
    }

    protected final void w(int i) {
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        int i2 = 0;
        if (this.b == eamz.VALUE_NUMBER_INT) {
            char[] f = this.n.f();
            int e = this.n.e();
            int i3 = this.z;
            if (this.y) {
                e++;
            }
            if (i3 <= 9) {
                int a = eano.a(f, e, i3);
                if (this.y) {
                    a = -a;
                }
                this.t = a;
                this.s = 1;
            } else if (i3 <= 18) {
                int i4 = i3 - 9;
                long a2 = (eano.a(f, e, i4) * 1000000000) + eano.a(f, e + i4, 9);
                boolean z = this.y;
                if (z) {
                    a2 = -a2;
                }
                if (i3 == 10) {
                    if (z) {
                        if (a2 >= -2147483648L) {
                            this.t = (int) a2;
                            this.s = 1;
                            return;
                        }
                    } else if (a2 <= 2147483647L) {
                        this.t = (int) a2;
                        this.s = 1;
                        return;
                    }
                }
                this.u = a2;
                this.s = 2;
            } else {
                String g = this.n.g();
                try {
                    String str = "9223372036854775807";
                    if (this.y) {
                        str = eano.a;
                    }
                    int length = str.length();
                    if (i3 >= length) {
                        if (i3 <= length) {
                            while (true) {
                                if (i2 >= length) {
                                    break;
                                }
                                int charAt = f[e + i2] - str.charAt(i2);
                                if (charAt == 0) {
                                    i2++;
                                } else if (charAt >= 0) {
                                }
                            }
                        }
                        this.w = new BigInteger(g);
                        this.s = 4;
                        return;
                    }
                    this.u = Long.parseLong(g);
                    this.s = 2;
                } catch (NumberFormatException e2) {
                    throw I("Malformed numeric value '" + g + "'", e2);
                }
            }
        } else if (this.b == eamz.VALUE_NUMBER_FLOAT) {
            try {
                if (i == 16) {
                    eaoj eaojVar = this.n;
                    char[] cArr = eaojVar.k;
                    if (cArr != null) {
                        bigDecimal2 = new BigDecimal(cArr);
                    } else {
                        int i5 = eaojVar.d;
                        if (i5 >= 0) {
                            bigDecimal2 = new BigDecimal(eaojVar.c, i5, eaojVar.e);
                        } else {
                            if (eaojVar.g == 0) {
                                bigDecimal = new BigDecimal(eaojVar.h, 0, eaojVar.i);
                            } else {
                                bigDecimal = new BigDecimal(eaojVar.h());
                            }
                            bigDecimal2 = bigDecimal;
                        }
                    }
                    this.x = bigDecimal2;
                    this.s = 16;
                    return;
                }
                String g2 = this.n.g();
                this.v = "2.2250738585072012e-308".equals(g2) ? Double.MIN_NORMAL : Double.parseDouble(g2);
                this.s = 8;
            } catch (NumberFormatException e3) {
                throw I("Malformed numeric value '" + this.n.g() + "'", e3);
            }
        } else {
            throw l("Current token (" + this.b + ") not numeric, can not use numeric value accessors");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(int i, String str) {
        throw l(("Unexpected character (" + H(i) + ") in numeric value") + ": " + str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void y(String str) {
        throw l("Invalid numeric value: " + str);
    }

    protected final void z() {
        throw l("Numeric value (" + e() + ") out of range of int (-2147483648 - 2147483647)");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final eamz t(boolean z, int i, int i2, int i3) {
        if (i2 > 0 || i3 > 0) {
            return B(z, i);
        }
        return u(z, i);
    }
}
