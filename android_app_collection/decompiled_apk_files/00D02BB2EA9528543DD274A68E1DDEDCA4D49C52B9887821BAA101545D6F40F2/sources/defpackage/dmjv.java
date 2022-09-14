package defpackage;

import android.net.wifi.ScanResult;
/* compiled from: PG */
/* renamed from: dmjv  reason: default package */
/* loaded from: classes6.dex */
final class dmjv extends dmkr {
    private final long a;
    private final dcdc<ScanResult> b;

    public dmjv(long j, dcdc<ScanResult> dcdcVar) {
        this.a = j;
        if (dcdcVar != null) {
            this.b = dcdcVar;
            return;
        }
        throw new NullPointerException("Null scanResults");
    }

    @Override // defpackage.dmkr
    public final long a() {
        return this.a;
    }

    @Override // defpackage.dmkr
    public final dcdc<ScanResult> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dmkr) {
            dmkr dmkrVar = (dmkr) obj;
            if (this.a == dmkrVar.a() && dchl.m(this.b, dmkrVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 70);
        sb.append("WifiScan{elapsedStartScanTimeNanos=");
        sb.append(j);
        sb.append(", scanResults=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
