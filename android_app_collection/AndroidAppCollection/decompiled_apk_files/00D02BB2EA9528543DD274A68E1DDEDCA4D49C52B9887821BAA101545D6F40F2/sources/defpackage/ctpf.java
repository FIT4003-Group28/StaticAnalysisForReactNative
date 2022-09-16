package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: ctpf  reason: default package */
/* loaded from: classes5.dex */
final class ctpf extends ctqg {
    private final dbsg<ConversationId> a;
    private final boolean b;
    private final dbsg<ctqu> c;

    public ctpf(dbsg<ConversationId> dbsgVar, boolean z, dbsg<ctqu> dbsgVar2) {
        this.a = dbsgVar;
        this.b = z;
        this.c = dbsgVar2;
    }

    @Override // defpackage.ctqg
    public final dbsg<ConversationId> a() {
        return this.a;
    }

    @Override // defpackage.ctqg
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.ctqg
    public final dbsg<ctqu> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctqg) {
            ctqg ctqgVar = (ctqg) obj;
            if (this.a.equals(ctqgVar.a()) && this.b == ctqgVar.b() && this.c.equals(ctqgVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72 + String.valueOf(valueOf2).length());
        sb.append("ChangeGroupProfile{conversationId=");
        sb.append(valueOf);
        sb.append(", syncBlockStatus=");
        sb.append(z);
        sb.append(", profileInfo=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
