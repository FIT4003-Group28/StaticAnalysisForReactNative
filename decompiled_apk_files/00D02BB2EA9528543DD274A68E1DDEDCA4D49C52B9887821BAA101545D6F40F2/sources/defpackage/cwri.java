package defpackage;
/* compiled from: PG */
/* renamed from: cwri  reason: default package */
/* loaded from: classes.dex */
final class cwri extends cwty {
    private final int a;
    private final int b;
    private final boolean c;

    public cwri(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    @Override // defpackage.cwty
    public final dehq a() {
        return null;
    }

    @Override // defpackage.cwty
    public final int b() {
        return this.a;
    }

    @Override // defpackage.cwty
    public final int c() {
        return this.b;
    }

    @Override // defpackage.cwty
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cwty) {
            cwty cwtyVar = (cwty) obj;
            if (cwtyVar.a() == null && this.a == cwtyVar.b() && this.b == cwtyVar.c() && this.c == cwtyVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ (-721379959)) * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        boolean z = this.c;
        StringBuilder sb = new StringBuilder("null".length() + 162);
        sb.append("PrimesThreadsConfigurations{primesExecutorService=");
        sb.append("null");
        sb.append(", primesMetricExecutorPriority=");
        sb.append(i);
        sb.append(", primesMetricExecutorPoolSize=");
        sb.append(i2);
        sb.append(", enableDeferredTasks=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
