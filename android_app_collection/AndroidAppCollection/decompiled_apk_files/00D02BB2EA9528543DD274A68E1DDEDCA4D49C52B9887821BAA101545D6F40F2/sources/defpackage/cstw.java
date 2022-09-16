package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: cstw  reason: default package */
/* loaded from: classes5.dex */
final class cstw extends csuc {
    private final String a;
    private final dcdc<ConversationId> b;

    public cstw(String str, dcdc<ConversationId> dcdcVar) {
        this.a = str;
        this.b = dcdcVar;
    }

    @Override // defpackage.csuc
    public final String a() {
        return this.a;
    }

    @Override // defpackage.csuc
    public final dcdc<ConversationId> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof csuc) {
            csuc csucVar = (csuc) obj;
            if (this.a.equals(csucVar.a()) && dchl.m(this.b, csucVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(valueOf).length());
        sb.append("GetBlockedConversationsResult{nextPageToken=");
        sb.append(str);
        sb.append(", conversationIds=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
