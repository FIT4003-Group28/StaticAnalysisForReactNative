package defpackage;

import com.google.android.libraries.messaging.lighter.model.AutoOneOf_ConversationId_OneOfId$Parent_;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cual  reason: default package */
/* loaded from: classes5.dex */
public final class cual {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static ConversationId.OneOfId a(final ConversationId.GroupId groupId) {
        groupId.getClass();
        return new AutoOneOf_ConversationId_OneOfId$Parent_(groupId) { // from class: com.google.android.libraries.messaging.lighter.model.AutoOneOf_ConversationId_OneOfId$Impl_group
            private final ConversationId.GroupId a;

            {
                this.a = groupId;
            }

            @Override // com.google.android.libraries.messaging.lighter.model.AutoOneOf_ConversationId_OneOfId$Parent_, com.google.android.libraries.messaging.lighter.model.ConversationId.OneOfId
            public final ConversationId.GroupId a() {
                return this.a;
            }

            @Override // com.google.android.libraries.messaging.lighter.model.ConversationId.OneOfId
            public final ConversationId.IdType b() {
                return ConversationId.IdType.GROUP;
            }

            public final boolean equals(Object obj) {
                if (obj instanceof ConversationId.OneOfId) {
                    ConversationId.OneOfId oneOfId = (ConversationId.OneOfId) obj;
                    if (ConversationId.IdType.GROUP == oneOfId.b() && this.a.equals(oneOfId.a())) {
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
                sb.append("OneOfId{group=");
                sb.append(valueOf);
                sb.append("}");
                return sb.toString();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ConversationId.OneOfId b(final ContactId contactId) {
        contactId.getClass();
        return new AutoOneOf_ConversationId_OneOfId$Parent_(contactId) { // from class: com.google.android.libraries.messaging.lighter.model.AutoOneOf_ConversationId_OneOfId$Impl_oneToOne
            private final ContactId a;

            {
                this.a = contactId;
            }

            @Override // com.google.android.libraries.messaging.lighter.model.ConversationId.OneOfId
            public final ConversationId.IdType b() {
                return ConversationId.IdType.ONE_TO_ONE;
            }

            @Override // com.google.android.libraries.messaging.lighter.model.AutoOneOf_ConversationId_OneOfId$Parent_, com.google.android.libraries.messaging.lighter.model.ConversationId.OneOfId
            public final ContactId c() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (obj instanceof ConversationId.OneOfId) {
                    ConversationId.OneOfId oneOfId = (ConversationId.OneOfId) obj;
                    if (ConversationId.IdType.ONE_TO_ONE == oneOfId.b() && this.a.equals(oneOfId.c())) {
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
                sb.append("OneOfId{oneToOne=");
                sb.append(valueOf);
                sb.append("}");
                return sb.toString();
            }
        };
    }
}
