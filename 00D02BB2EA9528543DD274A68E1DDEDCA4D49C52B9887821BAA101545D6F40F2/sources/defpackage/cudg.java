package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: cudg  reason: default package */
/* loaded from: classes5.dex */
public final class cudg extends cufw {
    private final ConversationId a;
    private final dcdn<String, dspd> b;
    private final Long c;
    private final Long d;

    public cudg(ConversationId conversationId, dcdn<String, dspd> dcdnVar, Long l, Long l2) {
        this.a = conversationId;
        this.b = dcdnVar;
        this.c = l;
        this.d = l2;
    }

    @Override // defpackage.cufw
    public final ConversationId a() {
        return this.a;
    }

    @Override // defpackage.cufw
    public final dcdn<String, dspd> b() {
        return this.b;
    }

    @Override // defpackage.cufw
    public final Long c() {
        return this.c;
    }

    @Override // defpackage.cufw
    public final Long d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cufw) {
            cufw cufwVar = (cufw) obj;
            if (this.a.equals(cufwVar.a()) && this.b.equals(cufwVar.b()) && this.c.equals(cufwVar.c()) && this.d.equals(cufwVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 92 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("ConversationIdWithAppData{conversationId=");
        sb.append(valueOf);
        sb.append(", appData=");
        sb.append(valueOf2);
        sb.append(", updateTimestamp=");
        sb.append(valueOf3);
        sb.append(", lastDeleteTimestamp=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
