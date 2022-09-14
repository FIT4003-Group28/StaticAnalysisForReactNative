package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cvit  reason: default package */
/* loaded from: classes5.dex */
public final class cvit extends cvix {
    private final Long a;
    private final long b;

    public cvit(@dzsi Long l, long j) {
        this.a = l;
        this.b = j;
    }

    @Override // defpackage.cvix
    @dzsi
    public final Long a() {
        return this.a;
    }

    @Override // defpackage.cvix
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvix) {
            cvix cvixVar = (cvix) obj;
            Long l = this.a;
            if (l != null ? l.equals(cvixVar.a()) : cvixVar.a() == null) {
                if (this.b == cvixVar.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = l == null ? 0 : l.hashCode();
        long j = this.b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Timeout{value=");
        sb.append(valueOf);
        sb.append(", startTime=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
