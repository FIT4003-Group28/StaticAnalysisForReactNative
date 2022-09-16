package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aguw  reason: default package */
/* loaded from: classes.dex */
public final class aguw {
    public final String a;
    public final long b;
    public final String[] c;
    public final long d;
    public final long e;

    public aguw(String str, long j, String[] strArr, long j2) {
        str.getClass();
        this.a = str;
        this.b = j;
        strArr.getClass();
        this.c = strArr;
        this.d = j2;
        this.e = 0L;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aguw)) {
            return false;
        }
        aguw aguwVar = (aguw) obj;
        if (!akzj.f(this.a, aguwVar.a) || this.b != aguwVar.b || this.d != aguwVar.d || !Arrays.equals(this.c, aguwVar.c)) {
            return false;
        }
        long j = aguwVar.e;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Long.valueOf(this.d), 0L});
    }
}
