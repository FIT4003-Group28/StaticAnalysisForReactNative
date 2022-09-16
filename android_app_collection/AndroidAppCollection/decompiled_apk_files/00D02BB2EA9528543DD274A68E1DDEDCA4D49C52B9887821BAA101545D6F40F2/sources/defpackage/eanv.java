package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: eanv  reason: default package */
/* loaded from: classes6.dex */
public final class eanv {
    public static final eanv a = new eanv();
    public eanv b;
    protected final boolean c;
    protected final boolean d;
    public String[] e;
    public eanu[] f;
    public int g;
    protected int h;
    protected int i;
    public boolean j;

    private eanv() {
        this.d = true;
        this.c = true;
        this.j = true;
        e();
    }

    public static int d(String str) {
        int charAt = str.charAt(0);
        int length = str.length();
        for (int i = 1; i < length; i++) {
            charAt = (charAt * 31) + str.charAt(i);
        }
        return charAt;
    }

    private final void e() {
        this.e = new String[64];
        this.f = new eanu[32];
        this.i = 63;
        this.g = 0;
        this.h = 48;
    }

    public final synchronized eanv a(boolean z, boolean z2) {
        return new eanv(this, z, z2, this.e, this.f, this.g);
    }

    public final synchronized void b(eanv eanvVar) {
        int i = eanvVar.g;
        if (i > 12000) {
            e();
        } else if (i <= this.g) {
            return;
        } else {
            this.e = eanvVar.e;
            this.f = eanvVar.f;
            this.g = i;
            this.h = eanvVar.h;
            this.i = eanvVar.i;
        }
        this.j = false;
    }

    public final String c(char[] cArr, int i, int i2, int i3) {
        if (i2 <= 0) {
            return "";
        }
        if (!this.d) {
            return new String(cArr, i, i2);
        }
        int i4 = i3 & this.i;
        String str = this.e[i4];
        if (str != null) {
            if (str.length() == i2) {
                int i5 = 0;
                while (str.charAt(i5) == cArr[i + i5] && (i5 = i5 + 1) < i2) {
                }
                if (i5 == i2) {
                    return str;
                }
            }
            eanu eanuVar = this.f[i4 >> 1];
            if (eanuVar != null) {
                String str2 = eanuVar.a;
                eanu eanuVar2 = eanuVar.b;
                while (true) {
                    if (str2.length() == i2) {
                        int i6 = 0;
                        while (str2.charAt(i6) == cArr[i + i6] && (i6 = i6 + 1) < i2) {
                        }
                        if (i6 == i2) {
                            break;
                        }
                    }
                    if (eanuVar2 == null) {
                        str2 = null;
                        break;
                    }
                    str2 = eanuVar2.a;
                    eanuVar2 = eanuVar2.b;
                }
                if (str2 != null) {
                    return str2;
                }
            }
        }
        if (!this.j) {
            String[] strArr = this.e;
            int length = strArr.length;
            String[] strArr2 = new String[length];
            this.e = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, length);
            eanu[] eanuVarArr = this.f;
            int length2 = eanuVarArr.length;
            eanu[] eanuVarArr2 = new eanu[length2];
            this.f = eanuVarArr2;
            System.arraycopy(eanuVarArr, 0, eanuVarArr2, 0, length2);
            this.j = true;
        } else {
            int i7 = this.g;
            int i8 = this.h;
            if (i7 >= i8) {
                String[] strArr3 = this.e;
                int length3 = strArr3.length;
                int i9 = length3 + length3;
                if (i9 > 65536) {
                    this.g = 0;
                    Arrays.fill(strArr3, (Object) null);
                    Arrays.fill(this.f, (Object) null);
                    this.j = true;
                } else {
                    eanu[] eanuVarArr3 = this.f;
                    this.e = new String[i9];
                    this.f = new eanu[i9 >> 1];
                    this.i = i9 - 1;
                    this.h = i8 + i8;
                    int i10 = 0;
                    for (String str3 : strArr3) {
                        if (str3 != null) {
                            i10++;
                            int d = d(str3) & this.i;
                            String[] strArr4 = this.e;
                            if (strArr4[d] == null) {
                                strArr4[d] = str3;
                            } else {
                                int i11 = d >> 1;
                                eanu[] eanuVarArr4 = this.f;
                                eanuVarArr4[i11] = new eanu(str3, eanuVarArr4[i11]);
                            }
                        }
                    }
                    int i12 = length3 >> 1;
                    for (int i13 = 0; i13 < i12; i13++) {
                        for (eanu eanuVar3 = eanuVarArr3[i13]; eanuVar3 != null; eanuVar3 = eanuVar3.b) {
                            i10++;
                            String str4 = eanuVar3.a;
                            int d2 = d(str4) & this.i;
                            String[] strArr5 = this.e;
                            if (strArr5[d2] == null) {
                                strArr5[d2] = str4;
                            } else {
                                int i14 = d2 >> 1;
                                eanu[] eanuVarArr5 = this.f;
                                eanuVarArr5[i14] = new eanu(str4, eanuVarArr5[i14]);
                            }
                        }
                    }
                    if (i10 != this.g) {
                        throw new Error("Internal error on SymbolTable.rehash(): had " + this.g + " entries; now have " + i10 + ".");
                    }
                }
                int i15 = 1;
                char c = cArr[0];
                while (i15 < i2) {
                    i15++;
                    c = (c * 31) + cArr[i15];
                }
                i4 = c & this.i;
            }
        }
        this.g++;
        String str5 = new String(cArr, i, i2);
        if (this.c) {
            str5 = eaoi.a.a(str5);
        }
        String[] strArr6 = this.e;
        if (strArr6[i4] == null) {
            strArr6[i4] = str5;
        } else {
            int i16 = i4 >> 1;
            eanu[] eanuVarArr6 = this.f;
            eanuVarArr6[i16] = new eanu(str5, eanuVarArr6[i16]);
        }
        return str5;
    }

    public eanv(eanv eanvVar, boolean z, boolean z2, String[] strArr, eanu[] eanuVarArr, int i) {
        this.b = eanvVar;
        this.d = z;
        this.c = z2;
        this.e = strArr;
        this.f = eanuVarArr;
        this.g = i;
        int length = strArr.length;
        this.h = length - (length >> 2);
        this.i = length - 1;
        this.j = false;
    }
}
