package defpackage;

import com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification;
import com.google.android.libraries.messaging.lighter.model.Notification;
import com.google.android.libraries.messaging.lighter.model.NotificationMetadata;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: cugw  reason: default package */
/* loaded from: classes5.dex */
public abstract class cugw {
    public abstract Notification a();

    public abstract void b(String str);

    public abstract void c(NotificationMetadata notificationMetadata);

    public abstract void d(Notification.OneOfType oneOfType);

    public final void e(MessageReceivedNotification messageReceivedNotification) {
        d(cuaz.a(messageReceivedNotification));
    }

    public final void f(HashMap<String, byte[]> hashMap) {
        c(new NotificationMetadata(hashMap));
    }
}
