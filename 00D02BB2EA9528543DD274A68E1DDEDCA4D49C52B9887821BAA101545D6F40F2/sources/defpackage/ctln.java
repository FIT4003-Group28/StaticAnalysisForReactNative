package defpackage;

import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: ctln  reason: default package */
/* loaded from: classes5.dex */
public final class ctln {
    public static Uri a(long j, ConversationId conversationId) {
        return k("messages", "REGISTRATION", String.valueOf(j), "MESSAGES_FOR_CONVERSATION_PATH", String.valueOf(conversationId.hashCode()));
    }

    public static Uri b(long j, ConversationId conversationId) {
        return k("participants", "REGISTRATION", String.valueOf(j), "PARTICIPANTS_LIST_PATH", String.valueOf(conversationId.hashCode()));
    }

    public static Uri c(long j) {
        return k("notifications", "REGISTRATION", String.valueOf(j), "NOTIFICATION_PATH");
    }

    public static Uri d(long j) {
        return k("conversations", "REGISTRATION", String.valueOf(j), "CONVERSATION_LIST_PATH");
    }

    public static Uri e(long j, cutf cutfVar) {
        return k("conversations", "REGISTRATION", String.valueOf(j), "BLOCKS_PATH", String.valueOf(cutfVar.hashCode()));
    }

    public static Uri f(long j, ConversationId conversationId) {
        return k("conversations", "REGISTRATION", String.valueOf(j), "CONVERSATION_PATH", String.valueOf(conversationId.hashCode()));
    }

    public static Uri g(long j, ContactId contactId) {
        return k("contacts", "REGISTRATION", String.valueOf(j), "CONTACT_PATH", String.valueOf(contactId.hashCode()));
    }

    public static Uri h(long j, ConversationId conversationId) {
        return k("messages", "REGISTRATION", String.valueOf(j), "UNREAD_COUNT_FOR_CONVERSATION_PATH", String.valueOf(conversationId.hashCode()));
    }

    public static Uri i(long j, cugo cugoVar) {
        return k("messages", "REGISTRATION", String.valueOf(j), "MESSAGES_STATUS_COUNT_FOR_ACCOUNT_PATH", String.valueOf(cugoVar));
    }

    public static Uri j(long j, String str) {
        return k("messages", "REGISTRATION", String.valueOf(j), "MESSAGES_PATH", String.valueOf(str));
    }

    private static Uri k(String str, String... strArr) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority("com.google.android.libraries.messaging.lighter.internal.data");
        builder.appendEncodedPath(str);
        for (String str2 : strArr) {
            builder.appendEncodedPath(str2);
        }
        return builder.build();
    }
}
