package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: akqi  reason: default package */
/* loaded from: classes.dex */
public class akqi implements Serializable, Comparable<akqi> {
    public static final akqi a = new akqi(0, 0);
    static final long serialVersionUID = 3249100930050580838L;
    public final long b;
    public final long c;

    public akqi(long j) {
        this(0L, j);
    }

    public akqi(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public static akqi b(String str) {
        dbsk.s(str);
        String[] split = str.split(":");
        int i = 1;
        if (split.length != 2) {
            int length = str.length();
            if (length != 0) {
                if (str.charAt(0) != '-') {
                    i = 0;
                }
                if (length - i <= 20) {
                    while (i < length) {
                        char charAt = str.charAt(i);
                        if (charAt >= '0' && charAt <= '9') {
                            i++;
                        }
                    }
                    try {
                        return new akqi(0L, str.indexOf(45) == 0 ? Long.parseLong(str) : decu.d(str));
                    } catch (NumberFormatException e) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 19);
                        sb.append("malformed cdocid \"");
                        sb.append(str);
                        sb.append('\"');
                        throw new IllegalArgumentException(sb.toString(), e);
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 23);
            sb2.append("malformed feature id \"");
            sb2.append(str);
            sb2.append('\"');
            throw new IllegalArgumentException(sb2.toString());
        }
        dbsk.a(split[0].startsWith("0x"));
        dbsk.a(split[1].startsWith("0x"));
        return new akqi(c(split[0].substring(2)), c(split[1].substring(2)));
    }

    static long c(String str) {
        if (str.length() != 16 || Integer.parseInt(String.valueOf(str.charAt(0)), 16) <= 7) {
            return Long.parseLong(str, 16);
        }
        int parseInt = Integer.parseInt(String.valueOf(str.charAt(0)), 16);
        String substring = str.substring(1);
        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 11);
        sb.append(parseInt - 8);
        sb.append(substring);
        return Long.parseLong(sb.toString(), 16) | Long.MIN_VALUE;
    }

    public static boolean d(@dzsi akqi akqiVar) {
        if (akqiVar == null) {
            return false;
        }
        return e(akqiVar.c);
    }

    public static boolean e(long j) {
        return j != 0;
    }

    @dzsi
    public static akqi f(@dzsi String str) {
        if (str == null) {
            return null;
        }
        try {
            return b(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static akqi j(dpsn dpsnVar) {
        if (dpsnVar == null) {
            return null;
        }
        return new akqi(dpsnVar.b, dpsnVar.c);
    }

    public static akqi k(dgrh dgrhVar) {
        if (dgrhVar == null) {
            return null;
        }
        return new akqi(dgrhVar.b, dgrhVar.c);
    }

    public static akqi l(dtai dtaiVar) {
        if (dtaiVar == null) {
            return null;
        }
        return new akqi(dtaiVar.b, dtaiVar.c);
    }

    public boolean equals(@dzsi Object obj) {
        if (!(obj instanceof akqi)) {
            return false;
        }
        akqi akqiVar = (akqi) obj;
        return this.b == akqiVar.b && this.c == akqiVar.c;
    }

    public final dtbk g() {
        dtbj bZ = dtbk.d.bZ();
        long j = this.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtbk dtbkVar = (dtbk) bZ.b;
        int i = dtbkVar.a | 1;
        dtbkVar.a = i;
        dtbkVar.b = j;
        long j2 = this.c;
        dtbkVar.a = i | 2;
        dtbkVar.c = j2;
        return bZ.bK();
    }

    public final dgrh h() {
        dgrg bZ = dgrh.d.bZ();
        long j = this.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgrh dgrhVar = (dgrh) bZ.b;
        int i = dgrhVar.a | 1;
        dgrhVar.a = i;
        dgrhVar.b = j;
        long j2 = this.c;
        dgrhVar.a = i | 2;
        dgrhVar.c = j2;
        return bZ.bK();
    }

    public int hashCode() {
        long j = this.b;
        long j2 = this.c;
        return (int) (((j >>> 32) ^ (j ^ j2)) ^ (j2 >>> 32));
    }

    public final dpsn i() {
        dpsm bZ = dpsn.d.bZ();
        long j = this.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpsn dpsnVar = (dpsn) bZ.b;
        int i = dpsnVar.a | 1;
        dpsnVar.a = i;
        dpsnVar.b = j;
        long j2 = this.c;
        dpsnVar.a = i | 2;
        dpsnVar.c = j2;
        return bZ.bK();
    }

    public final dtai m() {
        dtah bZ = dtai.d.bZ();
        long j = this.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtai dtaiVar = (dtai) bZ.b;
        int i = dtaiVar.a | 1;
        dtaiVar.a = i;
        dtaiVar.b = j;
        long j2 = this.c;
        dtaiVar.a = i | 2;
        dtaiVar.c = j2;
        return bZ.bK();
    }

    public final decs n() {
        return decs.a(this.c);
    }

    public final String o() {
        String hexString = Long.toHexString(this.b);
        String hexString2 = Long.toHexString(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 5 + String.valueOf(hexString2).length());
        sb.append("0x");
        sb.append(hexString);
        sb.append(":0x");
        sb.append(hexString2);
        return sb.toString();
    }

    public final boolean p(@dzsi akqi akqiVar) {
        return akqiVar != null && this.c == akqiVar.c;
    }

    @Override // java.lang.Comparable
    /* renamed from: q */
    public final int compareTo(akqi akqiVar) {
        dbsk.s(akqiVar);
        long j = this.b;
        long j2 = akqiVar.b;
        if (j >= j2) {
            if (j != j2) {
                return 1;
            }
            return (this.c > akqiVar.c ? 1 : (this.c == akqiVar.c ? 0 : -1));
        }
        return -1;
    }

    public final String toString() {
        return o();
    }
}
