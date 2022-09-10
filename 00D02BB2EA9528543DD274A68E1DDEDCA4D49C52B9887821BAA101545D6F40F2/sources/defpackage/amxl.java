package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: amxl  reason: default package */
/* loaded from: classes.dex */
public final class amxl implements amxn {
    private static final akra a = new akra();
    private static final akra b = new akra();
    private static final akra c = new akra();
    private static final float[] d = new float[6];
    private final alvn[] e;
    private boolean g;
    private float h;
    private float i;
    private boolean k = false;
    private float l = 1.0f;
    private float m = 1.0f;
    private final bnvr f = new bnvr();
    private final bnvr j = new bnvr();

    public amxl(List<alvn> list) {
        this.e = (alvn[]) list.toArray(new alvn[0]);
    }

    public final synchronized void a(bnvr bnvrVar, float f) {
        this.j.f(bnvrVar);
        this.l = f;
        this.m = f;
        this.k = true;
    }

    public final synchronized void b(bnvr bnvrVar, float f, float f2) {
        this.j.f(bnvrVar);
        this.l = f;
        this.m = f2;
        this.k = false;
    }

    @Override // defpackage.amxn
    public final boolean d(amxr amxrVar) {
        bnvr bnvrVar;
        synchronized (this) {
            this.f.f(this.j);
            this.h = this.l;
            this.i = this.m;
            this.g = this.k;
        }
        alvn[] alvnVarArr = this.e;
        int length = alvnVarArr.length;
        char c2 = 0;
        int i = 0;
        while (i < length) {
            aksc akscVar = alvnVarArr[i].g;
            int i2 = 0;
            while (i2 < akscVar.b()) {
                if (akscVar.a.length > 0) {
                    akra akraVar = a;
                    akra akraVar2 = b;
                    akra akraVar3 = c;
                    akscVar.d(i2, akraVar, akraVar2, akraVar3);
                    bnvr bnvrVar2 = this.f;
                    float f = this.h;
                    if (!akyx.o(amxrVar.c, akraVar, amxrVar.g)) {
                        continue;
                    } else {
                        float[] fArr = amxrVar.h;
                        float[] fArr2 = amxrVar.g;
                        fArr[c2] = fArr2[c2];
                        fArr[1] = fArr2[1];
                        if (akyx.o(amxrVar.c, akraVar2, fArr2)) {
                            float[] fArr3 = amxrVar.h;
                            float[] fArr4 = amxrVar.g;
                            fArr3[2] = fArr4[c2];
                            fArr3[3] = fArr4[1];
                            if (akyx.o(amxrVar.c, akraVar3, fArr4)) {
                                float[] fArr5 = amxrVar.h;
                                float[] fArr6 = amxrVar.g;
                                fArr5[4] = fArr6[c2];
                                fArr5[5] = fArr6[1];
                                if (amxrVar.b(fArr5, false, 1.0f / f, bnvrVar2, amxrVar.f / f)) {
                                    return true;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    float[] fArr7 = d;
                    int[] e = akscVar.e(i2);
                    float[] fArr8 = akscVar.b;
                    if (fArr8 != null && fArr8.length > 0) {
                        int i3 = e[c2];
                        int i4 = i3 + 1;
                        e[c2] = i4;
                        fArr7[c2] = fArr8[i3];
                        e[c2] = i4 + 1;
                        fArr7[1] = fArr8[i4];
                        int i5 = e[1];
                        int i6 = i5 + 1;
                        e[1] = i6;
                        fArr7[2] = fArr8[i5];
                        e[1] = i6 + 1;
                        fArr7[3] = fArr8[i6];
                        int i7 = e[2];
                        int i8 = i7 + 1;
                        e[2] = i8;
                        fArr7[4] = fArr8[i7];
                        e[2] = i8 + 1;
                        fArr7[5] = fArr8[i8];
                    }
                    bnvr bnvrVar3 = this.f;
                    float f2 = this.h;
                    float f3 = this.i;
                    if (this.g) {
                        bnvrVar = bnvrVar3;
                        float pow = 2.0f / ((float) Math.pow(2.0d, 22.0f - amxrVar.c.p().k));
                        f2 *= pow;
                        f3 *= pow;
                    } else {
                        bnvrVar = bnvrVar3;
                    }
                    float[] fArr9 = amxrVar.h;
                    fArr9[0] = fArr7[0] * f2;
                    fArr9[1] = fArr7[1] * f3;
                    fArr9[2] = fArr7[2] * f2;
                    fArr9[3] = fArr7[3] * f3;
                    fArr9[4] = fArr7[4] * f2;
                    fArr9[5] = fArr7[5] * f3;
                    if (amxrVar.b(fArr9, true, 1.0f, bnvrVar, amxrVar.f)) {
                        return true;
                    }
                }
                i2++;
                c2 = 0;
            }
            i++;
            c2 = 0;
        }
        return false;
    }
}
