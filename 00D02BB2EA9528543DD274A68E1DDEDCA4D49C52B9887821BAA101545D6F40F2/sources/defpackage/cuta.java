package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: cuta  reason: default package */
/* loaded from: classes5.dex */
final class cuta extends cutc {
    private final ConversationId.GroupId a;

    public cuta(ConversationId.GroupId groupId) {
        this.a = groupId;
    }

    @Override // defpackage.cutc, defpackage.cutf
    public final ConversationId.GroupId a() {
        return this.a;
    }

    @Override // defpackage.cutf
    public final ConversationId.IdType b() {
        return ConversationId.IdType.GROUP;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cutf) {
            cutf cutfVar = (cutf) obj;
            if (ConversationId.IdType.GROUP == cutfVar.b() && this.a.equals(cutfVar.a())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("BlockId{group=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
