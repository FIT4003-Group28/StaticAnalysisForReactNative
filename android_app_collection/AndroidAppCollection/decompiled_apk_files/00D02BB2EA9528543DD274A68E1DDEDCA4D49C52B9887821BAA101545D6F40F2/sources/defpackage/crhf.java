package defpackage;
/* compiled from: PG */
/* renamed from: crhf  reason: default package */
/* loaded from: classes5.dex */
final class crhf extends crhr {
    private final boolean a;

    public crhf(boolean z) {
        this.a = z;
    }

    @Override // defpackage.crhr
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof crhr) && this.a == ((crhr) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(43);
        sb.append("NavigationStartingEvent{arNavigation=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
