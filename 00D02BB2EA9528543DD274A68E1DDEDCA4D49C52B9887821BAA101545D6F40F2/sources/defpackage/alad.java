package defpackage;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: alad  reason: default package */
/* loaded from: classes.dex */
public class alad implements Serializable {
    public static final alad a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public final akqq i;
    public final akra j;
    public final float k;
    public final float l;
    public final float m;
    public final alae n;
    private akqp o;
    private akqp p;

    static {
        alaa a2 = a();
        a2.d(new akra(0, 0));
        a2.c = 20.0f;
        a2.d = 0.0f;
        a2.e = 0.0f;
        a2.f = alae.a;
        a = a2.a();
        alab.b();
        b = 5;
        c = 1;
        d = 2;
        e = 4;
        f = 8;
        g = 16;
        h = (1 << 5) - 1;
    }

    public alad(@dzsi akqq akqqVar, float f2, float f3, float f4, @dzsi alae alaeVar) {
        dbsk.t(akqqVar, "Null camera target");
        dbsk.t(alaeVar, "Null camera lookAhead");
        if (f3 <= 0.0f) {
            f3 = 0.0f;
        } else if (f3 > 90.0f) {
            f3 = 90.0f;
        }
        this.i = akqqVar;
        this.j = akqg.a(akqqVar);
        this.k = Math.max(2.0f, Math.min(f2, 21.0f));
        this.l = f3 + 0.0f;
        this.m = (((double) f4) <= dcyn.a ? (f4 % 360.0f) + 360.0f : f4) % 360.0f;
        this.n = alae.e(alaeVar);
    }

    public static alaa a() {
        return new alaa();
    }

    public static alaa b(alad aladVar) {
        return new alaa(aladVar);
    }

    @dzsi
    public static final alad c(dhjx dhjxVar) {
        float f2;
        int i = dhjxVar.a;
        if ((i & 1) == 0 || (i & 4) == 0) {
            return null;
        }
        dhjz dhjzVar = dhjxVar.b;
        if (dhjzVar == null) {
            dhjzVar = dhjz.e;
        }
        double d2 = dhjzVar.d;
        double d3 = dhjzVar.c;
        double d4 = dhjzVar.b;
        float f3 = dhjxVar.e;
        dhkd dhkdVar = dhjxVar.d;
        if (dhkdVar == null) {
            dhkdVar = dhkd.d;
        }
        int i2 = dhkdVar.c;
        akqq akqqVar = new akqq(d3, d4);
        float n = (float) akqo.n(d2, akqqVar.a, f3, i2);
        float f4 = 0.0f;
        if ((dhjxVar.a & 2) != 0) {
            dhkb dhkbVar = dhjxVar.c;
            if (dhkbVar == null) {
                dhkbVar = dhkb.e;
            }
            f4 = dhkbVar.b;
            f2 = dhkbVar.c;
        } else {
            f2 = 0.0f;
        }
        alaa alaaVar = new alaa();
        alaaVar.c(akqqVar);
        alaaVar.c = n;
        alaaVar.e = f4;
        alaaVar.d = f2;
        return alaaVar.a();
    }

    public static final dhjx d(@dzsi alad aladVar, float f2, float f3, int i, int i2) {
        dhjw bZ = dhjx.f.bZ();
        int i3 = (int) (i2 / f2);
        int i4 = (int) (i / f2);
        if (aladVar != null) {
            akqq akqqVar = aladVar.i;
            double m = akqo.m(aladVar.k, akqqVar.a, f3, i3);
            dhjy bZ2 = dhjz.e.bZ();
            double d2 = akqqVar.a;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dhjz dhjzVar = (dhjz) bZ2.b;
            int i5 = dhjzVar.a | 2;
            dhjzVar.a = i5;
            dhjzVar.c = d2;
            double d3 = akqqVar.b;
            int i6 = i5 | 1;
            dhjzVar.a = i6;
            dhjzVar.b = d3;
            dhjzVar.a = i6 | 4;
            dhjzVar.d = m;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhjx dhjxVar = (dhjx) bZ.b;
            dhjz bK = bZ2.bK();
            bK.getClass();
            dhjxVar.b = bK;
            dhjxVar.a |= 1;
            dhka bZ3 = dhkb.e.bZ();
            float f4 = aladVar.m;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dhkb dhkbVar = (dhkb) bZ3.b;
            int i7 = dhkbVar.a | 1;
            dhkbVar.a = i7;
            dhkbVar.b = f4;
            float f5 = aladVar.l;
            int i8 = i7 | 2;
            dhkbVar.a = i8;
            dhkbVar.c = f5;
            dhkbVar.a = i8 | 4;
            dhkbVar.d = 0.0f;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhjx dhjxVar2 = (dhjx) bZ.b;
            dhkb bK2 = bZ3.bK();
            bK2.getClass();
            dhjxVar2.c = bK2;
            dhjxVar2.a |= 2;
        }
        dhkc bZ4 = dhkd.d.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dhkd dhkdVar = (dhkd) bZ4.b;
        int i9 = dhkdVar.a | 1;
        dhkdVar.a = i9;
        dhkdVar.b = i4;
        dhkdVar.a = i9 | 2;
        dhkdVar.c = i3;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjx dhjxVar3 = (dhjx) bZ.b;
        dhkd bK3 = bZ4.bK();
        bK3.getClass();
        dhjxVar3.d = bK3;
        dhjxVar3.a |= 4;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjx dhjxVar4 = (dhjx) bZ.b;
        dhjxVar4.a |= 8;
        dhjxVar4.e = f3;
        return bZ.bK();
    }

    public static akra g(float f2) {
        double d2 = f2;
        Double.isNaN(d2);
        double d3 = d2 * 0.017453292519943295d;
        return new akra(Math.round(((float) Math.sin(d3)) * 65536.0f), Math.round(((float) Math.cos(d3)) * 65536.0f));
    }

    public final akqp e() {
        if (this.p == null) {
            this.p = g(this.m + 90.0f).a();
        }
        return this.p;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alad)) {
            return false;
        }
        alad aladVar = (alad) obj;
        return this.i.equals(aladVar.i) && Float.floatToIntBits(this.k) == Float.floatToIntBits(aladVar.k) && Float.floatToIntBits(this.l) == Float.floatToIntBits(aladVar.l) && Float.floatToIntBits(this.m) == Float.floatToIntBits(aladVar.m) && this.n.equals(aladVar.n);
    }

    public final akqp f() {
        akqp akqpVar;
        if (this.o == null) {
            double d2 = this.m;
            Double.isNaN(d2);
            double d3 = (90.0d - d2) * 0.017453292519943295d;
            float cos = (float) Math.cos(d3);
            float sin = (float) Math.sin(d3);
            float f2 = this.l;
            if (f2 == 0.0f) {
                akqpVar = new akqp(Math.round(cos * 65536.0f), Math.round(sin * 65536.0f));
            } else {
                double d4 = f2;
                Double.isNaN(d4);
                double d5 = d4 * 0.017453292519943295d;
                float cos2 = (float) Math.cos(d5);
                akqpVar = new akqp(Math.round(cos * cos2 * 65536.0f), Math.round(sin * cos2 * 65536.0f), Math.round(((float) Math.sin(d5)) * 65536.0f));
            }
            this.o = akqpVar;
        }
        return this.o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.i, Float.valueOf(this.k), Float.valueOf(this.l), Float.valueOf(this.m), this.n});
    }

    public final String toString() {
        dbsb b2 = dbsc.b(this);
        b2.b("target", this.i);
        b2.e("zoom", this.k);
        b2.e("tilt", this.l);
        b2.e("bearing", this.m);
        b2.b("lookAhead", this.n);
        return b2.toString();
    }

    public final Object h(int i) {
        float f2;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                return this.j;
            }
            if (i2 == 1) {
                f2 = this.k;
            } else if (i2 == 2) {
                f2 = this.l;
            } else if (i2 != 3) {
                if (i2 == 4) {
                    return this.n;
                }
                String a2 = alab.a(i);
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 33);
                sb.append("Invalid camera position property ");
                sb.append(a2);
                throw new IllegalArgumentException(sb.toString());
            } else {
                f2 = this.m;
            }
            return Float.valueOf(f2);
        }
        throw null;
    }
}
