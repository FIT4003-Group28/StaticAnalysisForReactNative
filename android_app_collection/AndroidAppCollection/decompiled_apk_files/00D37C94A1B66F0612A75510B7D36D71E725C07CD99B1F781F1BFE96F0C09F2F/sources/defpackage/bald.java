package defpackage;

import java.util.Arrays;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bald  reason: default package */
/* loaded from: classes2.dex */
public final class bald {
    public final bahl a;
    public baht b;
    public Integer c;
    public final Locale d;
    public balb[] e = new balb[8];
    public int f;
    public boolean g;
    private Object h;

    public bald(bahl bahlVar) {
        bahl d = bahq.d(bahlVar);
        this.b = d.z();
        this.a = d.a();
        this.d = Locale.getDefault();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(bahv bahvVar, bahv bahvVar2) {
        if (bahvVar == null || !bahvVar.h()) {
            return (bahvVar2 == null || !bahvVar2.h()) ? 0 : -1;
        } else if (bahvVar2 != null && bahvVar2.h()) {
            return -bahvVar.compareTo(bahvVar2);
        } else {
            return 1;
        }
    }

    public final Object b() {
        if (this.h == null) {
            this.h = new balc(this);
        }
        return this.h;
    }

    public final void c(balb balbVar) {
        balb[] balbVarArr = this.e;
        int i = this.f;
        int length = balbVarArr.length;
        if (i == length || this.g) {
            if (i == length) {
                length = i + i;
            }
            balb[] balbVarArr2 = new balb[length];
            System.arraycopy(balbVarArr, 0, balbVarArr2, 0, i);
            this.e = balbVarArr2;
            this.g = false;
            balbVarArr = balbVarArr2;
        }
        this.h = null;
        balbVarArr[i] = balbVar;
        this.f = i + 1;
    }

    public final void d(bahp bahpVar, int i) {
        c(new balb(bahpVar.a(this.a), i));
    }

    public final void e(Integer num) {
        this.h = null;
        this.c = num;
    }

    public final void f(baht bahtVar) {
        this.h = null;
        this.b = bahtVar;
    }

    public final long g(String str) {
        Integer num;
        balb[] balbVarArr = this.e;
        int i = this.f;
        if (this.g) {
            balbVarArr = (balb[]) balbVarArr.clone();
            this.e = balbVarArr;
            this.g = false;
        }
        if (i > 10) {
            Arrays.sort(balbVarArr, 0, i);
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2;
                while (i3 > 0) {
                    int i4 = i3 - 1;
                    if (balbVarArr[i4].compareTo(balbVarArr[i3]) > 0) {
                        balb balbVar = balbVarArr[i3];
                        balbVarArr[i3] = balbVarArr[i4];
                        balbVarArr[i4] = balbVar;
                        i3 = i4;
                    }
                }
            }
        }
        long j = 0;
        if (i > 0) {
            bahv a = bahx.e.a(this.a);
            bahv a2 = bahx.g.a(this.a);
            bahv p = balbVarArr[0].a.p();
            if (a(p, a) >= 0 && a(p, a2) <= 0) {
                d(bahp.g, 2000);
                return g(str);
            }
        }
        for (int i5 = 0; i5 < i; i5++) {
            try {
                j = balbVarArr[i5].b(j, true);
            } catch (bahy e) {
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
            j = balbVarArr[i6].b(j, i6 == i + (-1));
            i6++;
        }
        if (this.c != null) {
            return j - num.intValue();
        }
        baht bahtVar = this.b;
        if (bahtVar == null) {
            return j;
        }
        int b = bahtVar.b(j);
        long j2 = j - b;
        if (b == this.b.a(j2)) {
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
        throw new bahz(sb5);
    }

    public final void h(Object obj) {
        if (obj instanceof balc) {
            balc balcVar = (balc) obj;
            if (this != balcVar.e) {
                return;
            }
            this.b = balcVar.a;
            this.c = balcVar.b;
            this.e = balcVar.c;
            int i = balcVar.d;
            if (i < this.f) {
                this.g = true;
            }
            this.f = i;
            this.h = obj;
        }
    }
}
