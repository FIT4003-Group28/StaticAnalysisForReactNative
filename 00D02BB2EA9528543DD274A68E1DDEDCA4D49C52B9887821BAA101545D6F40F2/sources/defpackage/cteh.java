package defpackage;
/* compiled from: PG */
/* renamed from: cteh  reason: default package */
/* loaded from: classes5.dex */
public final class cteh extends ctff {
    private final dcdc<Integer> a;

    public cteh(dcdc<Integer> dcdcVar) {
        this.a = dcdcVar;
    }

    @Override // defpackage.ctff
    public final dcdc<Integer> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ctff)) {
            return false;
        }
        return dchl.m(this.a, ((ctff) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58);
        sb.append("GetConversationPropertiesResult{conversationCapabilities=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
