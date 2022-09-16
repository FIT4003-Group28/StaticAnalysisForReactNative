package defpackage;
/* compiled from: PG */
/* renamed from: balz  reason: default package */
/* loaded from: classes2.dex */
public final class balz extends baht {
    private static final long serialVersionUID = -3513011772763289092L;
    private final String e;
    private final int f;
    private final int g;

    public balz(String str, String str2, int i, int i2) {
        super(str);
        this.e = str2;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.baht
    public final int a(long j) {
        return this.f;
    }

    @Override // defpackage.baht
    public final int b(long j) {
        return this.f;
    }

    @Override // defpackage.baht
    public final int c(long j) {
        return this.g;
    }

    @Override // defpackage.baht
    public final long e(long j) {
        return j;
    }

    @Override // defpackage.baht
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof balz) {
            balz balzVar = (balz) obj;
            if (this.c.equals(balzVar.c) && this.g == balzVar.g && this.f == balzVar.f) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.baht
    public final long f(long j) {
        return j;
    }

    @Override // defpackage.baht
    public final String g(long j) {
        return this.e;
    }

    @Override // defpackage.baht
    public final int hashCode() {
        return this.c.hashCode() + (this.g * 37) + (this.f * 31);
    }

    @Override // defpackage.baht
    public final boolean l() {
        return true;
    }
}
