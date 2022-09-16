package defpackage;
/* compiled from: PG */
/* renamed from: afzx  reason: default package */
/* loaded from: classes2.dex */
final class afzx extends agak {
    private final boolean a;

    public afzx(boolean z) {
        this.a = z;
    }

    @Override // defpackage.agak
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof agak) && this.a == ((agak) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(43);
        sb.append("RequestContext{personalEventsOptedIn=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
