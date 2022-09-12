package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Flag extends AbstractSafeParcelable implements Comparable<Flag> {
    public static final Parcelable.Creator<Flag> CREATOR = new coxn();
    private static final List<Integer> j = Arrays.asList(2, 8, 9);
    public final String a;
    public final long b;
    public final boolean c;
    public final double d;
    public final String e;
    public final byte[] f;
    public final int g;
    public final int h;
    final Set<Integer> i;

    public Flag(Set<Integer> set, String str, long j2, boolean z, double d, String str2, byte[] bArr, int i, int i2) {
        this.i = set;
        this.a = str;
        this.b = j2;
        this.c = z;
        this.d = d;
        this.e = str2;
        this.f = bArr;
        this.g = i;
        this.h = i2;
        set.addAll(j);
        if (i == 1) {
            set.add(3);
        } else if (i == 2) {
            set.add(4);
        } else if (i == 3) {
            set.add(5);
        } else if (i == 4) {
            set.add(6);
        } else if (i != 5) {
        } else {
            set.add(7);
        }
    }

    private static int g(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i != i2 ? 1 : 0;
    }

    public final long a() {
        if (this.g == 1) {
            return this.b;
        }
        throw new IllegalArgumentException("Not a long type");
    }

    public final boolean b() {
        if (this.g == 2) {
            return this.c;
        }
        throw new IllegalArgumentException("Not a boolean type");
    }

    public final double c() {
        if (this.g == 3) {
            return this.d;
        }
        throw new IllegalArgumentException("Not a double type");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00b1 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ int compareTo(com.google.android.gms.phenotype.Flag r9) {
        /*
            r8 = this;
            com.google.android.gms.phenotype.Flag r9 = (com.google.android.gms.phenotype.Flag) r9
            java.lang.String r0 = r8.a
            java.lang.String r1 = r9.a
            int r0 = r0.compareTo(r1)
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L11
            goto Lb2
        L11:
            int r0 = r8.g
            int r4 = r9.g
            int r0 = g(r0, r4)
            if (r0 == 0) goto L1d
            goto Lb2
        L1d:
            int r0 = r8.g
            if (r0 == r3) goto La2
            r4 = 2
            if (r0 == r4) goto L97
            r4 = 3
            if (r0 == r4) goto L8e
            r4 = 4
            if (r0 == r4) goto L7c
            r4 = 5
            if (r0 != r4) goto L63
            byte[] r0 = r8.f
            byte[] r4 = r9.f
            if (r0 != r4) goto L35
            goto L9d
        L35:
            if (r0 != 0) goto L39
            goto Laa
        L39:
            if (r4 != 0) goto L3d
            goto Lb1
        L3d:
            byte[] r0 = r8.f
            int r0 = r0.length
            byte[] r1 = r9.f
            int r1 = r1.length
            int r0 = java.lang.Math.min(r0, r1)
            if (r2 >= r0) goto L58
            byte[] r0 = r8.f
            r0 = r0[r2]
            byte[] r1 = r9.f
            r1 = r1[r2]
            int r0 = r0 - r1
            if (r0 == 0) goto L55
            goto Lb2
        L55:
            int r2 = r2 + 1
            goto L3d
        L58:
            byte[] r0 = r8.f
            int r0 = r0.length
            byte[] r9 = r9.f
            int r9 = r9.length
            int r0 = g(r0, r9)
            goto Lb2
        L63:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 31
            r1.<init>(r2)
            java.lang.String r2 = "Invalid enum value: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.<init>(r0)
            throw r9
        L7c:
            java.lang.String r0 = r8.e
            java.lang.String r9 = r9.e
            if (r0 != r9) goto L83
            goto L9d
        L83:
            if (r0 != 0) goto L86
            goto Laa
        L86:
            if (r9 != 0) goto L89
            goto Lb1
        L89:
            int r0 = r0.compareTo(r9)
            goto Lb2
        L8e:
            double r0 = r8.d
            double r2 = r9.d
            int r0 = java.lang.Double.compare(r0, r2)
            goto Lb2
        L97:
            boolean r0 = r8.c
            boolean r9 = r9.c
            if (r0 != r9) goto L9f
        L9d:
            r0 = 0
            goto Lb2
        L9f:
            if (r0 == 0) goto Laa
            goto Lb1
        La2:
            long r4 = r8.b
            long r6 = r9.b
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto Lac
        Laa:
            r0 = -1
            goto Lb2
        Lac:
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto Lb1
            goto L9d
        Lb1:
            r0 = 1
        Lb2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.phenotype.Flag.compareTo(java.lang.Object):int");
    }

    public final String d() {
        if (this.g == 4) {
            return this.e;
        }
        throw new IllegalArgumentException("Not a String type");
    }

    public final byte[] e() {
        if (this.g == 5) {
            return this.f;
        }
        throw new IllegalArgumentException("Not a bytes type");
    }

    public final boolean equals(@dzsi Object obj) {
        int i;
        if (obj instanceof Flag) {
            Flag flag = (Flag) obj;
            if (coya.a(this.a, flag.a) && (i = this.g) == flag.g && this.h == flag.h) {
                if (i != 1) {
                    if (i == 2) {
                        return this.c == flag.c;
                    } else if (i == 3) {
                        return this.d == flag.d;
                    } else if (i == 4) {
                        return coya.a(this.e, flag.e);
                    } else {
                        if (i == 5) {
                            return Arrays.equals(this.f, flag.f);
                        }
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("Invalid enum value: ");
                        sb.append(i);
                        throw new AssertionError(sb.toString());
                    }
                } else if (this.b == flag.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String f(StringBuilder sb) {
        sb.append("Flag(");
        sb.append(this.a);
        sb.append(", ");
        int i = this.g;
        if (i == 1) {
            sb.append(this.b);
        } else if (i == 2) {
            sb.append(this.c);
        } else if (i == 3) {
            sb.append(this.d);
        } else if (i == 4) {
            sb.append("'");
            sb.append(this.e);
            sb.append("'");
        } else if (i == 5) {
            if (this.f == null) {
                sb.append("null");
            } else {
                sb.append("'");
                sb.append(Base64.encodeToString(this.f, 3));
                sb.append("'");
            }
        } else {
            String str = this.a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 27);
            sb2.append("Invalid type: ");
            sb2.append(str);
            sb2.append(", ");
            sb2.append(i);
            throw new AssertionError(sb2.toString());
        }
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    public final String toString() {
        return f(new StringBuilder());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        Set<Integer> set = this.i;
        if (set.contains(2)) {
            cnwn.k(parcel, 2, this.a, true);
        }
        if (set.contains(3)) {
            cnwn.h(parcel, 3, this.b);
        }
        if (set.contains(4)) {
            cnwn.e(parcel, 4, this.c);
        }
        if (set.contains(5)) {
            cnwn.j(parcel, 5, this.d);
        }
        if (set.contains(6)) {
            cnwn.k(parcel, 6, this.e, true);
        }
        if (set.contains(7)) {
            cnwn.l(parcel, 7, this.f, true);
        }
        if (set.contains(8)) {
            cnwn.g(parcel, 8, this.g);
        }
        if (set.contains(9)) {
            cnwn.g(parcel, 9, this.h);
        }
        cnwn.c(parcel, d);
    }
}
