package defpackage;

import com.google.android.libraries.messaging.lighter.model.AutoOneOf_Notification_OneOfType$Parent_;
import com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification;
import com.google.android.libraries.messaging.lighter.model.Notification;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuaz  reason: default package */
/* loaded from: classes5.dex */
public final class cuaz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.OneOfType a(final MessageReceivedNotification messageReceivedNotification) {
        messageReceivedNotification.getClass();
        return new AutoOneOf_Notification_OneOfType$Parent_(messageReceivedNotification) { // from class: com.google.android.libraries.messaging.lighter.model.AutoOneOf_Notification_OneOfType$Impl_messageReceived
            private final MessageReceivedNotification a;

            {
                this.a = messageReceivedNotification;
            }

            @Override // com.google.android.libraries.messaging.lighter.model.AutoOneOf_Notification_OneOfType$Parent_, com.google.android.libraries.messaging.lighter.model.Notification.OneOfType
            public final MessageReceivedNotification a() {
                return this.a;
            }

            @Override // com.google.android.libraries.messaging.lighter.model.Notification.OneOfType
            public final Notification.NotificationType b() {
                return Notification.NotificationType.a;
            }

            public final boolean equals(Object obj) {
                if (obj instanceof Notification.OneOfType) {
                    Notification.OneOfType oneOfType = (Notification.OneOfType) obj;
                    if (Notification.NotificationType.a == oneOfType.b() && this.a.equals(oneOfType.a())) {
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
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                sb.append("OneOfType{messageReceived=");
                sb.append(valueOf);
                sb.append("}");
                return sb.toString();
            }
        };
    }
}
