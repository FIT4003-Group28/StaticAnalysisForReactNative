package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aksi  reason: default package */
/* loaded from: classes.dex */
public final class aksi extends aksk {
    public final akra[] a;
    public final akqk b;
    public final aksj c;
    public final akrp d;
    private final akra[] f;
    private akra[][] g;

    public aksi(akra[] akraVarArr) {
        this.a = new akra[akraVarArr.length];
        for (int i = 0; i < 4; i++) {
            this.a[i] = new akra();
            akraVarArr[i].P(this.a[i]);
        }
        this.f = akraVarArr;
        akqk akqkVar = new akqk(akraVarArr);
        this.b = akqkVar;
        akrp akrpVar = akqkVar.b;
        this.d = akrpVar;
        aksj c = aksj.c(akrpVar);
        this.c = c;
        boolean z = c.e;
        this.e = z;
        if (z) {
            k();
        }
    }

    private final void k() {
        if (this.g == null) {
            this.g = (akra[][]) Array.newInstance(akra.class, 6, 2);
        }
        akra[][] akraVarArr = this.g;
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < 4; i2++) {
            boolean z2 = !this.a[i2].equals(this.f[i2]);
            if (z2 != z) {
                if (i2 > 0 && i < 5) {
                    akra[] akraVarArr2 = this.f;
                    l(akraVarArr2[i2 - 1], akraVarArr2[i2], i, akraVarArr);
                    i++;
                }
                z = z2;
            }
            if (i2 > 0) {
                akraVarArr[i - 1][1] = this.a[i2];
            }
            akraVarArr[i][0] = this.a[i2];
            i++;
        }
        if (i < 6) {
            akra[] akraVarArr3 = this.f;
            l(akraVarArr3[3], akraVarArr3[0], i, akraVarArr);
        }
        akraVarArr[5][1] = this.a[0];
    }

    private static void l(akra akraVar, akra akraVar2, int i, akra[][] akraVarArr) {
        int i2 = (Math.abs(akraVar2.a) > Math.abs(akraVar.a) ? akraVar2.a : akraVar.a) > 0 ? 536870913 : -536870913;
        int i3 = akraVar.a;
        int i4 = akraVar2.a;
        int i5 = akraVar2.b;
        int i6 = akraVar.b;
        double d = i2 - i3;
        double d2 = i4 - i3;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = i5 - i6;
        Double.isNaN(d4);
        double d5 = i6;
        Double.isNaN(d5);
        int i7 = (int) ((d3 * d4) + d5);
        if (i3 > i4) {
            akraVarArr[i - 1][1] = new akra(-536870913, i7);
            akraVarArr[i][0] = new akra(536870913, i7);
            return;
        }
        akraVarArr[i - 1][1] = new akra(536870913, i7);
        akraVarArr[i][0] = new akra(-536870913, i7);
    }

    public final void a() {
        for (int i = 0; i < 4; i++) {
            this.f[i].P(this.a[i]);
        }
        akqk akqkVar = this.b;
        akra[] akraVarArr = this.f;
        akqkVar.a = akraVarArr;
        akqkVar.b.e(akraVarArr);
        this.c.a(this.d);
        boolean z = this.c.e;
        this.e = z;
        if (z) {
            k();
        }
    }

    @Override // defpackage.aksk
    public final aksj b() {
        return this.c;
    }

    public final akra c() {
        return this.a[0];
    }

    public final akra d() {
        return this.a[1];
    }

    public final akra e() {
        return this.a[2];
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aksi)) {
            return false;
        }
        return Arrays.equals(this.f, ((aksi) obj).f);
    }

    @Override // defpackage.aksk
    public final akra f(int i) {
        return this.a[i];
    }

    public final akra g(int i) {
        return this.f[i];
    }

    @Override // defpackage.aksk
    public final int h() {
        return this.e ? 6 : 4;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f);
    }

    @Override // defpackage.aksk
    public final boolean j(akra akraVar) {
        akra akraVar2;
        akra[][] akraVarArr = this.g;
        if (!this.e || akraVarArr == null) {
            return this.b.j(akraVar);
        }
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            akra[] akraVarArr2 = akraVarArr[i2];
            akra akraVar3 = akraVarArr2[0];
            if (akraVar3 == null || (akraVar2 = akraVarArr2[1]) == null) {
                return false;
            }
            if (akrb.d(akraVar3, akraVar2, akraVar)) {
                i++;
            }
        }
        return i == 1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f[0]);
        String valueOf2 = String.valueOf(this.f[1]);
        String valueOf3 = String.valueOf(this.f[2]);
        String valueOf4 = String.valueOf(this.f[3]);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 5 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("[");
        sb.append(valueOf);
        sb.append(",");
        sb.append(valueOf2);
        sb.append(",");
        sb.append(valueOf3);
        sb.append(",");
        sb.append(valueOf4);
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.aksk
    public final void i(int i, akra[] akraVarArr) {
        akra[][] akraVarArr2 = this.g;
        if (!this.e || akraVarArr2 == null) {
            akraVarArr[0] = f(i);
            akraVarArr[1] = f((i + 1) % 4);
            return;
        }
        akraVarArr[0] = akraVarArr2[i][0];
        akraVarArr[1] = akraVarArr2[i][1];
    }
}
