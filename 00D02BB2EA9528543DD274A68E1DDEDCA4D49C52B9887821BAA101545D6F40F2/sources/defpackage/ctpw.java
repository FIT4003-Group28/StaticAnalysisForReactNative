package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.List;
/* compiled from: PG */
/* renamed from: ctpw  reason: default package */
/* loaded from: classes5.dex */
final class ctpw extends ctra {
    private final int a;
    private final String b;
    private final List<String> c;
    private final ContactId d;
    private final ConversationId e;

    public ctpw(int i, String str, List<String> list, ContactId contactId, ConversationId conversationId) {
        this.a = i;
        this.b = str;
        this.c = list;
        this.d = contactId;
        this.e = conversationId;
    }

    @Override // defpackage.ctra
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ctra
    public final String b() {
        return this.b;
    }

    @Override // defpackage.ctra
    public final List<String> c() {
        return this.c;
    }

    @Override // defpackage.ctra
    public final ContactId d() {
        return this.d;
    }

    @Override // defpackage.ctra
    public final ConversationId e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctra) {
            ctra ctraVar = (ctra) obj;
            if (this.a == ctraVar.a() && this.b.equals(ctraVar.b()) && this.c.equals(ctraVar.c()) && this.d.equals(ctraVar.d()) && this.e.equals(ctraVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 86 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Receipt{receiptType=");
        sb.append(i);
        sb.append(", receiptId=");
        sb.append(str);
        sb.append(", messageIds=");
        sb.append(valueOf);
        sb.append(", recipient=");
        sb.append(valueOf2);
        sb.append(", conversationId=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
