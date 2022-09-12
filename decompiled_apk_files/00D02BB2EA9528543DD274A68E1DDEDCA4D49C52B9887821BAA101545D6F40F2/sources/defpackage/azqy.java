package defpackage;
/* compiled from: PG */
/* renamed from: azqy  reason: default package */
/* loaded from: classes3.dex */
final class azqy extends azrh {
    private final int a;

    public azqy(int i) {
        this.a = i;
    }

    @Override // defpackage.azrh
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof azrh) && this.a == ((azrh) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        String str = this.a != 1 ? "STORAGE_CLEARED" : "SYNC_REFRESH";
        StringBuilder sb = new StringBuilder(str.length() + 21);
        sb.append("SyncEvent{eventType=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
