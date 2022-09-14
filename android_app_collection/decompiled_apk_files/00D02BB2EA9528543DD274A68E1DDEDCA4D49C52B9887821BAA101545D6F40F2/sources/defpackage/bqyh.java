package defpackage;

import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bqyh  reason: default package */
/* loaded from: classes4.dex */
public abstract class bqyh extends akrq {
    private static final dcqe a = dcqe.c("bqyh");
    public final akra b;
    public final akra c;
    public final float d;
    protected float e = -1.0f;

    public bqyh(akra akraVar, akra akraVar2) {
        this.b = akraVar;
        this.c = akraVar2;
        this.d = akrb.e(akraVar, akraVar2);
    }

    private static int m(akrp akrpVar, akra akraVar) {
        int i;
        int i2 = akraVar.a;
        akra akraVar2 = akrpVar.a;
        if (i2 < akraVar2.a) {
            i = 1;
        } else {
            i = i2 > akrpVar.b.a ? 2 : 0;
        }
        int i3 = akraVar.b;
        return i3 < akraVar2.b ? i | 4 : i3 <= akrpVar.b.b ? i : i | 8;
    }

    public void a(double d, akra akraVar) {
        akra.H(this.b, this.c, (float) (d / c()), akraVar);
    }

    public double b() {
        return Double.POSITIVE_INFINITY;
    }

    public double c() {
        float f = this.e;
        if (f == -1.0f) {
            f = this.b.z(this.c);
            this.e = f;
        }
        return f;
    }

    public abstract List<? extends bqyh> e();

    public boolean equals(Object obj) {
        bvoo.h("Equals should be defined directly on subclasses: %s", getClass().getSimpleName());
        return this == obj;
    }

    public List<? extends bqyh> f() {
        throw null;
    }

    public abstract boolean g();

    public abstract boolean h(bqyh bqyhVar);

    public int hashCode() {
        return (this.b.hashCode() * 229) + this.c.hashCode();
    }

    @Override // defpackage.akrq, defpackage.akqd
    public final boolean j(akra akraVar) {
        return false;
    }

    @Override // defpackage.akrq, defpackage.akqd
    public final boolean k(akrq akrqVar) {
        if (akrqVar instanceof akrp) {
            akrp akrpVar = (akrp) akrqVar;
            int m = m(akrpVar, this.b);
            int m2 = m(akrpVar, this.c);
            if (m != 0 && m2 != 0) {
                if ((m & m2) != 0) {
                    return false;
                }
                int i = m2 | m;
                if (i != 3 && i != 12) {
                    return v(akrqVar);
                }
            }
            return true;
        } else if (akrqVar instanceof bqyh) {
            bqyh bqyhVar = (bqyh) akrqVar;
            return akrb.c(this.b, this.c, bqyhVar.b, bqyhVar.c);
        } else {
            return super.k(akrqVar);
        }
    }

    public final String toString() {
        double b = b();
        Locale locale = Locale.US;
        Object[] objArr = new Object[6];
        objArr[0] = this.b.T();
        objArr[1] = Double.valueOf(c());
        objArr[2] = Float.valueOf(this.d);
        String str = "";
        objArr[3] = b == Double.POSITIVE_INFINITY ? str : String.format(Locale.US, ", r%.1fm", Double.valueOf(b));
        if (true == g()) {
            str = ", isTunnel";
        }
        objArr[4] = str;
        objArr[5] = Integer.valueOf(e().size());
        return String.format(locale, "[%s %.1fm, %.1fdeg%s%s, %d->]", objArr);
    }

    @Override // defpackage.akrq
    public final int w() {
        return 2;
    }

    @Override // defpackage.akrq
    public final akra x(int i) {
        if (i == 0) {
            return this.b;
        }
        if (i == 1) {
            return this.c;
        }
        throw new IndexOutOfBoundsException();
    }
}
