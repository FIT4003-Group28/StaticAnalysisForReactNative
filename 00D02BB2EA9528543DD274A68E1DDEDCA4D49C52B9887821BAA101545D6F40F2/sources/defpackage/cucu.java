package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: cucu  reason: default package */
/* loaded from: classes5.dex */
public final class cucu extends cufd {
    private final ConversationId a;
    private final cuff b;
    private final dcdc<cufb> c;

    public cucu(ConversationId conversationId, cuff cuffVar, dcdc<cufb> dcdcVar) {
        this.a = conversationId;
        this.b = cuffVar;
        this.c = dcdcVar;
    }

    @Override // defpackage.cufd
    public final ConversationId a() {
        return this.a;
    }

    @Override // defpackage.cufd
    public final cuff b() {
        return this.b;
    }

    @Override // defpackage.cufd
    public final dcdc<cufb> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cufd) {
            cufd cufdVar = (cufd) obj;
            if (this.a.equals(cufdVar.a()) && this.b.equals(cufdVar.b()) && dchl.m(this.c, cufdVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 76 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("CloudConversation{conversationId=");
        sb.append(valueOf);
        sb.append(", cloudConversationMetadata=");
        sb.append(valueOf2);
        sb.append(", annotations=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
