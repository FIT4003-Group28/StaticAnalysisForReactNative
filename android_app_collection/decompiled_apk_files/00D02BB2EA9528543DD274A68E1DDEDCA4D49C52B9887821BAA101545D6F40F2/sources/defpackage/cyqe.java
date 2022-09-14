package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cyqe  reason: default package */
/* loaded from: classes5.dex */
public final class cyqe {
    public final long a;
    public final long b;
    public final long c;
    public final dudy d;

    public cyqe(long j, long j2, long j3, dudy dudyVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = dudyVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyqe) {
            cyqe cyqeVar = (cyqe) obj;
            if (this.a == cyqeVar.a && this.b == cyqeVar.b && this.c == cyqeVar.c && dbsd.a(this.d, cyqeVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), this.d});
    }
}
