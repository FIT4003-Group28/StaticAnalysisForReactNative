package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: apyq  reason: default package */
/* loaded from: classes2.dex */
public final class apyq extends apzg {
    private final String a;
    private final ConversationId b;

    public apyq(String str, ConversationId conversationId) {
        this.a = str;
        this.b = conversationId;
    }

    @Override // defpackage.apzg
    public final String a() {
        return this.a;
    }

    @Override // defpackage.apzg
    public final ConversationId b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apzg) {
            apzg apzgVar = (apzg) obj;
            if (this.a.equals(apzgVar.a()) && this.b.equals(apzgVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 52 + String.valueOf(valueOf).length());
        sb.append("OpenPhotoLightboxParams{messageId=");
        sb.append(str);
        sb.append(", conversationId=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
