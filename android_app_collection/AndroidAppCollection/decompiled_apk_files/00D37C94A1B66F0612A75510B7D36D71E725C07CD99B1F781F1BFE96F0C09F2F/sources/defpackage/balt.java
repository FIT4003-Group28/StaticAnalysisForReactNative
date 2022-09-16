package defpackage;
/* compiled from: PG */
/* renamed from: balt  reason: default package */
/* loaded from: classes2.dex */
public final class balt extends baht {
    private static final int e;
    private static final long serialVersionUID = 5472298452022250685L;
    private final baht f;
    private final bals[] g;

    static {
        Integer num;
        int i;
        try {
            num = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException unused) {
            num = null;
        }
        if (num == null) {
            i = 512;
        } else {
            int i2 = 0;
            for (int intValue = num.intValue() - 1; intValue > 0; intValue >>= 1) {
                i2++;
            }
            i = 1 << i2;
        }
        e = i - 1;
    }

    public balt(baht bahtVar) {
        super(bahtVar.c);
        this.g = new bals[e + 1];
        this.f = bahtVar;
    }

    private final bals o(long j) {
        int i = (int) (j >> 32);
        bals[] balsVarArr = this.g;
        int i2 = e & i;
        bals balsVar = balsVarArr[i2];
        if (balsVar == null || ((int) (balsVar.a >> 32)) != i) {
            long j2 = j & (-4294967296L);
            bals balsVar2 = new bals(this.f, j2);
            long j3 = 4294967295L | j2;
            bals balsVar3 = balsVar2;
            while (true) {
                long e2 = this.f.e(j2);
                if (e2 == j2 || e2 > j3) {
                    break;
                }
                bals balsVar4 = new bals(this.f, e2);
                balsVar3.c = balsVar4;
                balsVar3 = balsVar4;
                j2 = e2;
            }
            balsVarArr[i2] = balsVar2;
            return balsVar2;
        }
        return balsVar;
    }

    @Override // defpackage.baht
    public final int a(long j) {
        return o(j).a(j);
    }

    @Override // defpackage.baht
    public final int c(long j) {
        return o(j).b(j);
    }

    @Override // defpackage.baht
    public final long e(long j) {
        return this.f.e(j);
    }

    @Override // defpackage.baht
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof balt)) {
            return false;
        }
        return this.f.equals(((balt) obj).f);
    }

    @Override // defpackage.baht
    public final long f(long j) {
        return this.f.f(j);
    }

    @Override // defpackage.baht
    public final String g(long j) {
        return o(j).c(j);
    }

    @Override // defpackage.baht
    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // defpackage.baht
    public final boolean l() {
        return false;
    }
}
