package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cysi  reason: default package */
/* loaded from: classes5.dex */
public final class cysi {
    public final String a;
    public final String b;
    public final long c;
    public final dspd d;

    public cysi(String str, String str2, long j, dspd dspdVar) {
        dbsk.s(str);
        this.a = str;
        dbsk.s(str2);
        this.b = str2;
        this.c = j;
        this.d = dspdVar;
    }

    public static dspd a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return dspd.x(bArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cysi) {
            cysi cysiVar = (cysi) obj;
            if (dbsd.a(this.a, cysiVar.a) && dbsd.a(this.b, cysiVar.b) && this.c == cysiVar.c && dbsd.a(this.d, cysiVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), this.d});
    }
}
