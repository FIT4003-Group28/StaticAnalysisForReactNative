package defpackage;
/* compiled from: PG */
/* renamed from: cloq  reason: default package */
/* loaded from: classes5.dex */
public final class cloq {
    public static final cloq a;
    public static final cloq b;
    public final long c;
    public final long d;

    static {
        cloq cloqVar = new cloq(0L, 0L);
        a = cloqVar;
        new cloq(Long.MAX_VALUE, Long.MAX_VALUE);
        new cloq(Long.MAX_VALUE, 0L);
        new cloq(0L, Long.MAX_VALUE);
        b = cloqVar;
    }

    public cloq(long j, long j2) {
        boolean z = true;
        cmmn.a(j >= 0);
        cmmn.a(j2 < 0 ? false : z);
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cloq cloqVar = (cloq) obj;
            if (this.c == cloqVar.c && this.d == cloqVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.c) * 31) + ((int) this.d);
    }
}
