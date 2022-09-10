package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: cutb  reason: default package */
/* loaded from: classes5.dex */
final class cutb extends cutc {
    private final ContactId a;

    public cutb(ContactId contactId) {
        this.a = contactId;
    }

    @Override // defpackage.cutf
    public final ConversationId.IdType b() {
        return ConversationId.IdType.ONE_TO_ONE;
    }

    @Override // defpackage.cutc, defpackage.cutf
    public final ContactId c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cutf) {
            cutf cutfVar = (cutf) obj;
            if (ConversationId.IdType.ONE_TO_ONE == cutfVar.b() && this.a.equals(cutfVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("BlockId{oneToOne=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
