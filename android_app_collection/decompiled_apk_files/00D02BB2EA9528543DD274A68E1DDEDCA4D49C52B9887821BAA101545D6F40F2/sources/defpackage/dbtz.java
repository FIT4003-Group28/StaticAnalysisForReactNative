package defpackage;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dbtz  reason: default package */
/* loaded from: classes5.dex */
public final class dbtz<T> implements Serializable, dbty {
    private static final long serialVersionUID = 0;
    final dbty<T> a;
    final long b;
    volatile transient T c;
    volatile transient long d;

    public dbtz(dbty<T> dbtyVar, long j, TimeUnit timeUnit) {
        dbsk.s(dbtyVar);
        this.a = dbtyVar;
        this.b = timeUnit.toNanos(j);
        dbsk.i(j > 0, "duration (%s %s) must be > 0", j, timeUnit);
    }

    @Override // defpackage.dbty
    public final T a() {
        long j = this.d;
        long a = dbsj.a();
        if (j == 0 || a - j >= 0) {
            synchronized (this) {
                if (j == this.d) {
                    T a2 = this.a.a();
                    this.c = a2;
                    long j2 = a + this.b;
                    if (j2 == 0) {
                        j2 = 1;
                    }
                    this.d = j2;
                    return a2;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
        sb.append("Suppliers.memoizeWithExpiration(");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(j);
        sb.append(", NANOS)");
        return sb.toString();
    }
}
