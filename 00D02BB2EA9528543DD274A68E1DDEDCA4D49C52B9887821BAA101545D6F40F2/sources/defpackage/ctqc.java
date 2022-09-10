package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: ctqc  reason: default package */
/* loaded from: classes5.dex */
final class ctqc extends ctri {
    private final String a;
    private final ConversationId b;
    private final ContactId c;
    private final int d;
    private final long e;
    private final long f;

    public ctqc(String str, ConversationId conversationId, ContactId contactId, int i, long j, long j2) {
        this.a = str;
        this.b = conversationId;
        this.c = contactId;
        this.d = i;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.ctri
    public final String a() {
        return this.a;
    }

    @Override // defpackage.ctri
    public final ConversationId b() {
        return this.b;
    }

    @Override // defpackage.ctri
    public final ContactId c() {
        return this.c;
    }

    @Override // defpackage.ctri
    public final int d() {
        return this.d;
    }

    @Override // defpackage.ctri
    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctri) {
            ctri ctriVar = (ctri) obj;
            if (this.a.equals(ctriVar.a()) && this.b.equals(ctriVar.b()) && this.c.equals(ctriVar.c()) && this.d == ctriVar.d() && this.e == ctriVar.e() && this.f == ctriVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ctri
    public final long f() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        int hashCode3 = this.c.hashCode();
        int i = this.d;
        long j = this.e;
        long j2 = this.f;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int i = this.d;
        long j = this.e;
        long j2 = this.f;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 180 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("TypingIndicator{typingIndicatorId=");
        sb.append(str);
        sb.append(", conversationId=");
        sb.append(valueOf);
        sb.append(", sender=");
        sb.append(valueOf2);
        sb.append(", typingIndicatorStatus=");
        sb.append(i);
        sb.append(", refreshIntervalUSec=");
        sb.append(j);
        sb.append(", serverTimestampUSec=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
