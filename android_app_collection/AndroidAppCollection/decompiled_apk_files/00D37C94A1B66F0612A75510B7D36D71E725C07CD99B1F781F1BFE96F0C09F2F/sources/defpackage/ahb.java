package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ahb  reason: default package */
/* loaded from: classes.dex */
public final class ahb extends agw {
    public int f;
    final aha g;
    private ahc[] h;
    private ahc[] i;

    public ahb(agx agxVar) {
        super(agxVar);
        this.h = new ahc[128];
        this.i = new ahc[128];
        this.f = 0;
        this.g = new aha(this);
    }

    @Override // defpackage.agw
    public final void d(agy agyVar, agw agwVar, boolean z) {
        ahc ahcVar = agwVar.a;
        if (ahcVar == null) {
            return;
        }
        agv agvVar = agwVar.e;
        int i = agvVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            ahc d = agvVar.d(i2);
            float b = agvVar.b(i2);
            aha ahaVar = this.g;
            ahaVar.a = d;
            if (ahaVar.a.b) {
                boolean z2 = true;
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr = ahaVar.a.i;
                    float f = fArr[i3] + (ahcVar.i[i3] * b);
                    fArr[i3] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ahaVar.a.i[i3] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ahaVar.b.n(ahaVar.a);
                }
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f2 = ahcVar.i[i4];
                    if (f2 != 0.0f) {
                        float f3 = f2 * b;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ahaVar.a.i[i4] = f3;
                    } else {
                        ahaVar.a.i[i4] = 0.0f;
                    }
                }
                m(d);
            }
            this.b += agwVar.b * b;
        }
        n(ahcVar);
    }

    @Override // defpackage.agw
    public final boolean e() {
        return this.f == 0;
    }

    @Override // defpackage.agw
    public final ahc k(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f; i2++) {
            ahc[] ahcVarArr = this.h;
            ahc ahcVar = ahcVarArr[i2];
            if (!zArr[ahcVar.c]) {
                aha ahaVar = this.g;
                ahaVar.a = ahcVar;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ahaVar.a.i[i3];
                        if (f > 0.0f) {
                            break;
                        } else if (f < 0.0f) {
                            i = i2;
                            break;
                        } else {
                            i3--;
                        }
                    }
                } else {
                    ahc ahcVar2 = ahcVarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = ahcVar2.i[i3];
                            float f3 = ahaVar.a.i[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 >= f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.h[i];
    }

    public final void m(ahc ahcVar) {
        int i;
        int i2 = this.f;
        ahc[] ahcVarArr = this.h;
        int length = ahcVarArr.length;
        if (i2 + 1 > length) {
            ahc[] ahcVarArr2 = (ahc[]) Arrays.copyOf(ahcVarArr, length + length);
            this.h = ahcVarArr2;
            int length2 = ahcVarArr2.length;
            this.i = (ahc[]) Arrays.copyOf(ahcVarArr2, length2 + length2);
        }
        ahc[] ahcVarArr3 = this.h;
        int i3 = this.f;
        ahcVarArr3[i3] = ahcVar;
        int i4 = i3 + 1;
        this.f = i4;
        if (i4 > 1 && ahcVarArr3[i4 - 1].c > ahcVar.c) {
            int i5 = 0;
            while (true) {
                i = this.f;
                if (i5 >= i) {
                    break;
                }
                this.i[i5] = this.h[i5];
                i5++;
            }
            Arrays.sort(this.i, 0, i, new wd(2));
            for (int i6 = 0; i6 < this.f; i6++) {
                this.h[i6] = this.i[i6];
            }
        }
        ahcVar.b = true;
        ahcVar.a(this);
    }

    public final void n(ahc ahcVar) {
        int i = 0;
        while (i < this.f) {
            if (this.h[i] == ahcVar) {
                while (true) {
                    int i2 = this.f - 1;
                    if (i < i2) {
                        ahc[] ahcVarArr = this.h;
                        int i3 = i + 1;
                        ahcVarArr[i] = ahcVarArr[i3];
                        i = i3;
                    } else {
                        this.f = i2;
                        ahcVar.b = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.agw
    public final String toString() {
        float f = this.b;
        StringBuilder sb = new StringBuilder(29);
        sb.append(" goal -> (");
        sb.append(f);
        sb.append(") : ");
        String sb2 = sb.toString();
        for (int i = 0; i < this.f; i++) {
            this.g.a = this.h[i];
            String valueOf = String.valueOf(sb2);
            String valueOf2 = String.valueOf(this.g);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
            sb3.append(valueOf);
            sb3.append(valueOf2);
            sb3.append(" ");
            sb2 = sb3.toString();
        }
        return sb2;
    }
}
