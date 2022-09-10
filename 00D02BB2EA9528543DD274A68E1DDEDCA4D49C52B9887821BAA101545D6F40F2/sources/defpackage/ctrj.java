package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: ctrj  reason: default package */
/* loaded from: classes5.dex */
public final class ctrj extends ctsv {
    public final ConversationId a;
    public final long b;

    public ctrj(ConversationId conversationId, long j) {
        if (conversationId != null) {
            this.a = conversationId;
            this.b = j;
            return;
        }
        throw new NullPointerException("Null conversationId");
    }

    @Override // defpackage.ctsv
    public final ConversationId a() {
        return this.a;
    }

    @Override // defpackage.ctsv
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctsv) {
            ctsv ctsvVar = (ctsv) obj;
            if (this.a.equals(ctsvVar.a()) && this.b == ctsvVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 83);
        sb.append("DeleteConversationParams{conversationId=");
        sb.append(valueOf);
        sb.append(", lastDeleteTimestamp=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
