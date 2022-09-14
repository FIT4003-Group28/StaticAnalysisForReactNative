package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: du  reason: default package */
/* loaded from: classes6.dex */
public final class du {
    public final dw b;
    private final dv i;
    public int a = 0;
    private int j = 8;
    public int[] c = new int[8];
    public int[] d = new int[8];
    public float[] e = new float[8];
    public int f = -1;
    public int g = -1;
    public boolean h = false;

    public du(dv dvVar, dw dwVar) {
        this.i = dvVar;
        this.b = dwVar;
    }

    public final void a(ea eaVar, float f) {
        if (f == 0.0f) {
            c(eaVar);
            return;
        }
        int i = this.f;
        if (i != -1) {
            int i2 = -1;
            for (int i3 = 0; i != -1 && i3 < this.a; i3++) {
                int i4 = this.c[i];
                int i5 = eaVar.a;
                if (i4 != i5) {
                    if (i4 < i5) {
                        i2 = i;
                    }
                    i = this.d[i];
                } else {
                    this.e[i] = f;
                    return;
                }
            }
            int i6 = this.g;
            int i7 = i6 + 1;
            if (this.h) {
                int[] iArr = this.c;
                if (iArr[i6] != -1) {
                    i6 = iArr.length;
                }
            } else {
                i6 = i7;
            }
            int length = this.c.length;
            if (i6 >= length && this.a < length) {
                int i8 = 0;
                while (true) {
                    int[] iArr2 = this.c;
                    if (i8 >= iArr2.length) {
                        break;
                    } else if (iArr2[i8] == -1) {
                        i6 = i8;
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            int length2 = this.c.length;
            if (i6 >= length2) {
                int i9 = this.j;
                int i10 = i9 + i9;
                this.j = i10;
                this.h = false;
                this.g = length2 - 1;
                this.e = Arrays.copyOf(this.e, i10);
                this.c = Arrays.copyOf(this.c, this.j);
                this.d = Arrays.copyOf(this.d, this.j);
                i6 = length2;
            }
            int[] iArr3 = this.c;
            iArr3[i6] = eaVar.a;
            this.e[i6] = f;
            if (i2 != -1) {
                int[] iArr4 = this.d;
                iArr4[i6] = iArr4[i2];
                iArr4[i2] = i6;
            } else {
                this.d[i6] = this.f;
                this.f = i6;
            }
            int i11 = this.a + 1;
            this.a = i11;
            if (!this.h) {
                this.g++;
            }
            if (i11 < iArr3.length) {
                return;
            }
            this.h = true;
            return;
        }
        this.f = 0;
        this.e[0] = f;
        this.c[0] = eaVar.a;
        this.d[0] = -1;
        this.a++;
        if (this.h) {
            return;
        }
        this.g++;
    }

    public final float c(ea eaVar) {
        int i = this.f;
        if (i != -1) {
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.a) {
                int i4 = this.c[i];
                if (i4 != eaVar.a) {
                    i2++;
                    i3 = i;
                    i = this.d[i];
                } else {
                    if (i == this.f) {
                        this.f = this.d[i];
                    } else {
                        int[] iArr = this.d;
                        iArr[i3] = iArr[i];
                    }
                    this.b.a[i4].a(this.i);
                    this.a--;
                    this.c[i] = -1;
                    if (this.h) {
                        this.g = i;
                    }
                    return this.e[i];
                }
            }
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(dv dvVar, dv dvVar2) {
        int i = this.f;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
                int i3 = this.c[i];
                ea eaVar = dvVar2.a;
                if (i3 == eaVar.a) {
                    float f = this.e[i];
                    c(eaVar);
                    du duVar = dvVar2.d;
                    int i4 = duVar.f;
                    for (int i5 = 0; i4 != -1 && i5 < duVar.a; i5++) {
                        b(this.b.a[duVar.c[i4]], duVar.e[i4] * f);
                        i4 = duVar.d[i4];
                    }
                    dvVar.b += dvVar2.b * f;
                    dvVar2.a.a(dvVar);
                    i = this.f;
                } else {
                    i = this.d[i];
                }
            }
            return;
        }
    }

    public final float g(ea eaVar) {
        int i = this.f;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.c[i] != eaVar.a) {
                i = this.d[i];
            } else {
                return this.e[i];
            }
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.f;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            str = ((str + " -> ") + this.e[i] + " : ") + this.b.a[this.c[i]];
            i = this.d[i];
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ea e(int i) {
        int i2 = this.f;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 != i) {
                i2 = this.d[i2];
            } else {
                return this.b.a[this.c[i2]];
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float f(int i) {
        int i2 = this.f;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 != i) {
                i2 = this.d[i2];
            } else {
                return this.e[i2];
            }
        }
        return 0.0f;
    }

    public final void b(ea eaVar, float f) {
        if (f == 0.0f) {
            return;
        }
        int i = this.f;
        if (i != -1) {
            int i2 = -1;
            for (int i3 = 0; i != -1 && i3 < this.a; i3++) {
                int i4 = this.c[i];
                int i5 = eaVar.a;
                if (i4 != i5) {
                    if (i4 < i5) {
                        i2 = i;
                    }
                    i = this.d[i];
                } else {
                    float[] fArr = this.e;
                    float f2 = fArr[i] + f;
                    fArr[i] = f2;
                    if (f2 != 0.0f) {
                        return;
                    }
                    if (i == this.f) {
                        this.f = this.d[i];
                    } else {
                        int[] iArr = this.d;
                        iArr[i2] = iArr[i];
                    }
                    this.b.a[i4].a(this.i);
                    if (this.h) {
                        this.g = i;
                    }
                    this.a--;
                    return;
                }
            }
            int i6 = this.g;
            int i7 = i6 + 1;
            if (this.h) {
                int[] iArr2 = this.c;
                if (iArr2[i6] != -1) {
                    i6 = iArr2.length;
                }
            } else {
                i6 = i7;
            }
            int length = this.c.length;
            if (i6 >= length && this.a < length) {
                int i8 = 0;
                while (true) {
                    int[] iArr3 = this.c;
                    if (i8 >= iArr3.length) {
                        break;
                    } else if (iArr3[i8] == -1) {
                        i6 = i8;
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            int length2 = this.c.length;
            if (i6 >= length2) {
                int i9 = this.j;
                int i10 = i9 + i9;
                this.j = i10;
                this.h = false;
                this.g = length2 - 1;
                this.e = Arrays.copyOf(this.e, i10);
                this.c = Arrays.copyOf(this.c, this.j);
                this.d = Arrays.copyOf(this.d, this.j);
                i6 = length2;
            }
            int[] iArr4 = this.c;
            iArr4[i6] = eaVar.a;
            this.e[i6] = f;
            if (i2 != -1) {
                int[] iArr5 = this.d;
                iArr5[i6] = iArr5[i2];
                iArr5[i2] = i6;
            } else {
                this.d[i6] = this.f;
                this.f = i6;
            }
            this.a++;
            if (!this.h) {
                this.g++;
            }
            int i11 = this.g;
            int length3 = iArr4.length;
            if (i11 < length3) {
                return;
            }
            this.h = true;
            this.g = length3 - 1;
            return;
        }
        this.f = 0;
        this.e[0] = f;
        this.c[0] = eaVar.a;
        this.d[0] = -1;
        this.a++;
        if (this.h) {
            return;
        }
        this.g++;
    }
}
