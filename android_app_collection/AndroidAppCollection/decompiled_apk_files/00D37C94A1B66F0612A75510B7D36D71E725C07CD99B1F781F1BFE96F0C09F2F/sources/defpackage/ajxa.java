package defpackage;
/* compiled from: PG */
/* renamed from: ajxa  reason: default package */
/* loaded from: classes.dex */
public final class ajxa {
    public final boolean a;

    public ajxa() {
    }

    public ajxa(boolean z) {
        this.a = z;
    }

    public static ajxa a() {
        return new ajxa(false);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ajxa) && this.a == ((ajxa) obj).a;
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(39);
        sb.append("ContinuationContext{wasScheduled=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
