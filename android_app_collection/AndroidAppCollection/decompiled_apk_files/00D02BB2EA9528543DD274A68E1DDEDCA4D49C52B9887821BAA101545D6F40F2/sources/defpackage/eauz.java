package defpackage;
/* compiled from: PG */
/* renamed from: eauz  reason: default package */
/* loaded from: classes6.dex */
public final class eauz extends eaou {
    private static final int a;
    private static final long serialVersionUID = 5472298452022250685L;
    private final eaou e;
    private final eauy[] f;

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
        a = i - 1;
    }

    public eauz(eaou eaouVar) {
        super(eaouVar.d);
        this.f = new eauy[a + 1];
        this.e = eaouVar;
    }

    private final eauy g(long j) {
        int i = (int) (j >> 32);
        eauy[] eauyVarArr = this.f;
        int i2 = a & i;
        eauy eauyVar = eauyVarArr[i2];
        if (eauyVar == null || ((int) (eauyVar.a >> 32)) != i) {
            long j2 = j & (-4294967296L);
            eauy eauyVar2 = new eauy(this.e, j2);
            long j3 = 4294967295L | j2;
            eauy eauyVar3 = eauyVar2;
            while (true) {
                long e = this.e.e(j2);
                if (e == j2 || e > j3) {
                    break;
                }
                eauy eauyVar4 = new eauy(this.e, e);
                eauyVar3.c = eauyVar4;
                eauyVar3 = eauyVar4;
                j2 = e;
            }
            eauyVarArr[i2] = eauyVar2;
            return eauyVar2;
        }
        return eauyVar;
    }

    @Override // defpackage.eaou
    public final String a(long j) {
        return g(j).a(j);
    }

    @Override // defpackage.eaou
    public final int b(long j) {
        return g(j).b(j);
    }

    @Override // defpackage.eaou
    public final int c(long j) {
        return g(j).c(j);
    }

    @Override // defpackage.eaou
    public final boolean d() {
        return false;
    }

    @Override // defpackage.eaou
    public final long e(long j) {
        return this.e.e(j);
    }

    @Override // defpackage.eaou
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eauz)) {
            return false;
        }
        return this.e.equals(((eauz) obj).e);
    }

    @Override // defpackage.eaou
    public final long f(long j) {
        return this.e.f(j);
    }

    @Override // defpackage.eaou
    public final int hashCode() {
        return this.e.hashCode();
    }
}
