package defpackage;
/* compiled from: PG */
/* renamed from: wdu  reason: default package */
/* loaded from: classes7.dex */
final class wdu extends wdv {
    private final Long a;
    private final int b;

    public wdu(int i, @dzsi Long l) {
        this.b = i;
        this.a = l;
    }

    @Override // defpackage.wdv
    @dzsi
    public final Long a() {
        return this.a;
    }

    @Override // defpackage.wdv
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Long l;
        if (obj == this) {
            return true;
        }
        if (obj instanceof wdv) {
            wdv wdvVar = (wdv) obj;
            if (this.b == wdvVar.b() && ((l = this.a) != null ? l.equals(wdvVar.a()) : wdvVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.b ^ 1000003) * 1000003;
        Long l = this.a;
        return i ^ (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        int i = this.b;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "NICKNAME" : "WORK_PROMPT" : "HOME_PROMPT" : "WORK" : "HOME";
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(str.length() + 30 + String.valueOf(valueOf).length());
        sb.append("BookmarkId{type=");
        sb.append(str);
        sb.append(", nicknameId=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
