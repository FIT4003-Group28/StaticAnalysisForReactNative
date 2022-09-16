package defpackage;
/* compiled from: PG */
/* renamed from: agya  reason: default package */
/* loaded from: classes.dex */
public final class agya {
    public final ampq a;
    public final long b;
    public final long c;
    public final double d;
    public final boolean e;
    public final ampq f;
    public final ampq g;
    public final int h;
    public final ampq i;
    public final ampq j;
    public final agpw k;
    public final int l;
    private final ampq m;

    public agya() {
    }

    public agya(int i, ampq ampqVar, ampq ampqVar2, long j, long j2, double d, boolean z, ampq ampqVar3, ampq ampqVar4, int i2, ampq ampqVar5, ampq ampqVar6, agpw agpwVar) {
        this.l = i;
        this.m = ampqVar;
        this.a = ampqVar2;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = z;
        this.f = ampqVar3;
        this.g = ampqVar4;
        this.h = i2;
        this.i = ampqVar5;
        this.j = ampqVar6;
        this.k = agpwVar;
    }

    public static agxz a(int i) {
        agxz agxzVar = new agxz(null);
        agxzVar.e = i;
        agxzVar.g(0L);
        agxzVar.b(0L);
        agxzVar.h(0.0d);
        agxzVar.i(false);
        agxzVar.e(0);
        agxzVar.d = null;
        return agxzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof agya)) {
            return false;
        }
        agya agyaVar = (agya) obj;
        int i = this.l;
        int i2 = agyaVar.l;
        if (i == 0) {
            throw null;
        }
        if (i == i2 && this.m.equals(agyaVar.m) && this.a.equals(agyaVar.a) && this.b == agyaVar.b && this.c == agyaVar.c && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(agyaVar.d) && this.e == agyaVar.e && this.f.equals(agyaVar.f) && this.g.equals(agyaVar.g) && this.h == agyaVar.h && this.i.equals(agyaVar.i) && this.j.equals(agyaVar.j)) {
            agpw agpwVar = this.k;
            agpw agpwVar2 = agyaVar.k;
            if (agpwVar != null ? agpwVar.equals(agpwVar2) : agpwVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.l;
        if (i != 0) {
            int hashCode = this.m.hashCode();
            int hashCode2 = this.a.hashCode();
            long j = this.b;
            long j2 = this.c;
            int doubleToLongBits = (((((((((((((((((((((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.d) >>> 32) ^ Double.doubleToLongBits(this.d)))) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
            agpw agpwVar = this.k;
            return doubleToLongBits ^ (agpwVar == null ? 0 : agpwVar.hashCode());
        }
        throw null;
    }

    public final String toString() {
        String a = agzw.a(this.l);
        String valueOf = String.valueOf(this.m);
        String valueOf2 = String.valueOf(this.a);
        long j = this.b;
        long j2 = this.c;
        double d = this.d;
        boolean z = this.e;
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.g);
        int i = this.h;
        String valueOf5 = String.valueOf(this.i);
        String valueOf6 = String.valueOf(this.j);
        String valueOf7 = String.valueOf(this.k);
        int length = a.length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        int length6 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + 316 + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
        sb.append("Action{type=");
        sb.append(a);
        sb.append(", offlineStoreTag=");
        sb.append(valueOf);
        sb.append(", transferId=");
        sb.append(valueOf2);
        sb.append(", transferSize=");
        sb.append(j);
        sb.append(", bytesTransferred=");
        sb.append(j2);
        sb.append(", transferSpeedBytesPerSecond=");
        sb.append(d);
        sb.append(", usingDataToDownloadStreams=");
        sb.append(z);
        sb.append(", mediaStatus=");
        sb.append(valueOf3);
        sb.append(", failureReason=");
        sb.append(valueOf4);
        sb.append(", statusReason=");
        sb.append(i);
        sb.append(", transfer=");
        sb.append(valueOf5);
        sb.append(", downloadNetworkPreference=");
        sb.append(valueOf6);
        sb.append(", outputExtras=");
        sb.append(valueOf7);
        sb.append("}");
        return sb.toString();
    }
}
