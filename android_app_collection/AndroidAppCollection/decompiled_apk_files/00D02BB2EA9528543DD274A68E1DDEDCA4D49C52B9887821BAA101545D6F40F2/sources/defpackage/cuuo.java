package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: cuuo  reason: default package */
/* loaded from: classes5.dex */
final class cuuo extends cuui {
    private final ConversationId a;
    private final int b;
    private final boolean c;

    public cuuo(ConversationId conversationId, int i, boolean z) {
        this.a = conversationId;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.cuui
    public final ConversationId a() {
        return this.a;
    }

    @Override // defpackage.cuui
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cuui
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cuui) {
            cuui cuuiVar = (cuui) obj;
            if (this.a.equals(cuuiVar.a()) && this.b == cuuiVar.b() && this.c == cuuiVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 63);
        sb.append("CacheKey{conversationId=");
        sb.append(valueOf);
        sb.append(", sizeInPx=");
        sb.append(i);
        sb.append(", darkMode=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
