package defpackage;

import com.google.android.libraries.messaging.lighter.model.AutoValue_Notification;
import com.google.android.libraries.messaging.lighter.model.Notification;
import com.google.android.libraries.messaging.lighter.model.NotificationMetadata;
/* compiled from: PG */
/* renamed from: ctyo  reason: default package */
/* loaded from: classes5.dex */
public final class ctyo extends cugw {
    public Long a;
    private String b;
    private NotificationMetadata c;
    private Notification.OneOfType d;

    @Override // defpackage.cugw
    public final void b(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    @Override // defpackage.cugw
    public final void c(NotificationMetadata notificationMetadata) {
        this.c = notificationMetadata;
    }

    @Override // defpackage.cugw
    public final void d(Notification.OneOfType oneOfType) {
        this.d = oneOfType;
    }

    @Override // defpackage.cugw
    public final Notification a() {
        String str = this.b == null ? " id" : "";
        if (this.a == null) {
            str = str.concat(" timeStampMillis");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" metadata");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" oneOfType");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_Notification(this.b, this.a, this.c, this.d);
    }
}
