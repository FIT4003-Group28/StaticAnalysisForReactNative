package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: anam  reason: default package */
/* loaded from: classes.dex */
final class anam {
    public final TimeUnit a;
    public int b = -1;
    private final int c = 5000;

    public anam(TimeUnit timeUnit) {
        anha.c(timeUnit, "time unit");
        this.a = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anam) {
            anam anamVar = (anam) obj;
            int i = anamVar.c;
            if (this.a == anamVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 185000;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("5000 ");
        sb.append(this.a);
        if (this.b > 0) {
            sb.append(" [skipped: ");
            sb.append(this.b);
            sb.append(']');
        }
        return sb.toString();
    }
}
