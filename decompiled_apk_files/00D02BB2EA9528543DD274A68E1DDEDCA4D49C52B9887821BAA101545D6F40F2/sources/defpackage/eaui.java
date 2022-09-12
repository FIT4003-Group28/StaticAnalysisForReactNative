package defpackage;

import java.util.Arrays;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: eaui  reason: default package */
/* loaded from: classes6.dex */
public final class eaui {
    public final eaok a;
    public eaou b;
    public Integer c;
    public final Locale d;
    public eaug[] e = new eaug[8];
    public int f;
    public boolean g;
    private Object h;

    public eaui(eaok eaokVar, Locale locale) {
        eaok d = eaor.d(eaokVar);
        this.b = d.a();
        this.a = d.b();
        this.d = locale == null ? Locale.getDefault() : locale;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(eaox eaoxVar, eaox eaoxVar2) {
        if (eaoxVar == null || !eaoxVar.b()) {
            return (eaoxVar2 == null || !eaoxVar2.b()) ? 0 : -1;
        } else if (eaoxVar2 != null && eaoxVar2.b()) {
            return -eaoxVar.compareTo(eaoxVar2);
        } else {
            return 1;
        }
    }

    public final void a(eaou eaouVar) {
        this.h = null;
        this.b = eaouVar;
    }

    public final void b(Integer num) {
        this.h = null;
        this.c = num;
    }

    public final void c(eaop eaopVar, int i) {
        d(new eaug(eaopVar.c(this.a), i));
    }

    public final void d(eaug eaugVar) {
        eaug[] eaugVarArr = this.e;
        int i = this.f;
        int length = eaugVarArr.length;
        if (i == length || this.g) {
            if (i == length) {
                length = i + i;
            }
            eaug[] eaugVarArr2 = new eaug[length];
            System.arraycopy(eaugVarArr, 0, eaugVarArr2, 0, i);
            this.e = eaugVarArr2;
            this.g = false;
            eaugVarArr = eaugVarArr2;
        }
        this.h = null;
        eaugVarArr[i] = eaugVar;
        this.f = i + 1;
    }

    public final Object e() {
        if (this.h == null) {
            this.h = new eauh(this);
        }
        return this.h;
    }

    public final long g(String str) {
        Integer num;
        eaug[] eaugVarArr = this.e;
        int i = this.f;
        if (this.g) {
            eaugVarArr = (eaug[]) eaugVarArr.clone();
            this.e = eaugVarArr;
            this.g = false;
        }
        if (i > 10) {
            Arrays.sort(eaugVarArr, 0, i);
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2;
                while (i3 > 0) {
                    int i4 = i3 - 1;
                    if (eaugVarArr[i4].compareTo(eaugVarArr[i3]) > 0) {
                        eaug eaugVar = eaugVarArr[i3];
                        eaugVarArr[i3] = eaugVarArr[i4];
                        eaugVarArr[i4] = eaugVar;
                        i3 = i4;
                    }
                }
            }
        }
        long j = 0;
        if (i > 0) {
            eaox a = eaoz.e.a(this.a);
            eaox a2 = eaoz.g.a(this.a);
            eaox s = eaugVarArr[0].a.s();
            if (f(s, a) >= 0 && f(s, a2) <= 0) {
                c(eaop.g, 2000);
                return g(str);
            }
        }
        for (int i5 = 0; i5 < i; i5++) {
            try {
                j = eaugVarArr[i5].a(j, true);
            } catch (eapb e) {
                if (str != null) {
                    StringBuilder sb = new StringBuilder(str.length() + 15);
                    sb.append("Cannot parse \"");
                    sb.append(str);
                    sb.append('\"');
                    String sb2 = sb.toString();
                    String str2 = e.a;
                    if (str2 == null) {
                        e.a = sb2;
                    } else if (sb2 != null) {
                        StringBuilder sb3 = new StringBuilder(sb2.length() + 2 + str2.length());
                        sb3.append(sb2);
                        sb3.append(": ");
                        sb3.append(str2);
                        e.a = sb3.toString();
                    }
                }
                throw e;
            }
        }
        int i6 = 0;
        while (i6 < i) {
            j = eaugVarArr[i6].a(j, i6 == i + (-1));
            i6++;
        }
        if (this.c != null) {
            return j - num.intValue();
        }
        eaou eaouVar = this.b;
        if (eaouVar == null) {
            return j;
        }
        int p = eaouVar.p(j);
        long j2 = j - p;
        if (p == this.b.b(j2)) {
            return j2;
        }
        String valueOf = String.valueOf(this.b);
        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 53);
        sb4.append("Illegal instant due to time zone offset transition (");
        sb4.append(valueOf);
        sb4.append(')');
        String sb5 = sb4.toString();
        if (str != null) {
            StringBuilder sb6 = new StringBuilder(str.length() + 17 + String.valueOf(sb5).length());
            sb6.append("Cannot parse \"");
            sb6.append(str);
            sb6.append("\": ");
            sb6.append(sb5);
            sb5 = sb6.toString();
        }
        throw new eapc(sb5);
    }

    public final void h(Object obj) {
        if (obj instanceof eauh) {
            eauh eauhVar = (eauh) obj;
            if (this != eauhVar.e) {
                return;
            }
            this.b = eauhVar.a;
            this.c = eauhVar.b;
            this.e = eauhVar.c;
            int i = eauhVar.d;
            if (i < this.f) {
                this.g = true;
            }
            this.f = i;
            this.h = obj;
        }
    }
}
