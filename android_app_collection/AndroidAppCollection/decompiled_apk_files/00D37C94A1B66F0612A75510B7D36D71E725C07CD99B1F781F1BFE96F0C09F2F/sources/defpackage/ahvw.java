package defpackage;
/* compiled from: PG */
/* renamed from: ahvw  reason: default package */
/* loaded from: classes.dex */
final class ahvw extends ahvy {
    private final int a;

    public ahvw(int i) {
        this.a = i;
    }

    @Override // defpackage.ahvy
    public int a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ahvy) && this.a == ((ahvy) obj).a();
    }

    public int hashCode() {
        return this.a ^ 1000003;
    }

    public String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("PlaybackLoopDismissedEvent{reason=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
