package defpackage;

import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: dfdb  reason: default package */
/* loaded from: classes6.dex */
final class dfdb extends dfdg {
    private final dcrj a;
    private final AtomicLong b;

    public dfdb(dcrj dcrjVar, AtomicLong atomicLong) {
        this.a = dcrjVar;
        this.b = atomicLong;
    }

    @Override // defpackage.dfdg
    public final dcrj a() {
        return this.a;
    }

    @Override // defpackage.dfdg
    public final AtomicLong b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dfdg) {
            dfdg dfdgVar = (dfdg) obj;
            if (this.a.equals(dfdgVar.a()) && this.b.equals(dfdgVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25 + String.valueOf(valueOf2).length());
        sb.append("LogStat{logData=");
        sb.append(valueOf);
        sb.append(", count=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
