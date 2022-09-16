package defpackage;
/* compiled from: PG */
/* renamed from: clcs  reason: default package */
/* loaded from: classes5.dex */
public final class clcs<T> extends clcu<T> {
    private final T a;
    private final clcv b;

    public clcs(T t, clcv clcvVar) {
        if (t != null) {
            this.a = t;
            if (clcvVar != null) {
                this.b = clcvVar;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    @Override // defpackage.clcu
    public final Integer a() {
        return null;
    }

    @Override // defpackage.clcu
    public final T b() {
        return this.a;
    }

    @Override // defpackage.clcu
    public final clcv c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof clcu) {
            clcu clcuVar = (clcu) obj;
            if (clcuVar.a() == null && this.a.equals(clcuVar.b()) && this.b.equals(clcuVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ (-721379959)) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        T t = this.a;
        String valueOf = String.valueOf(this.b);
        int length = "null".length();
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(t).length() + String.valueOf(valueOf).length());
        sb.append("Event{code=");
        sb.append("null");
        sb.append(", payload=");
        sb.append((String) t);
        sb.append(", priority=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
