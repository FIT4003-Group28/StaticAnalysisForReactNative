package defpackage;
/* compiled from: PG */
/* renamed from: agcj  reason: default package */
/* loaded from: classes2.dex */
public final class agcj extends agnc {
    private final boolean a;

    public agcj(boolean z) {
        this.a = z;
    }

    @Override // defpackage.agnc
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof agnc) && this.a == ((agnc) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Options{useFixedLayoutHeight=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
