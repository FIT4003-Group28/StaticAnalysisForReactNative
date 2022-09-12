package com.google.android.libraries.messaging.lighter.model;

import com.google.android.libraries.messaging.lighter.model.Notification;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.messaging.lighter.model.$AutoValue_Notification  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_Notification extends Notification {
    public final String a;
    public final Long b;
    public final NotificationMetadata c;
    public final Notification.OneOfType d;

    public C$AutoValue_Notification(String str, Long l, NotificationMetadata notificationMetadata, Notification.OneOfType oneOfType) {
        if (str != null) {
            this.a = str;
            if (l != null) {
                this.b = l;
                if (notificationMetadata != null) {
                    this.c = notificationMetadata;
                    if (oneOfType != null) {
                        this.d = oneOfType;
                        return;
                    }
                    throw new NullPointerException("Null oneOfType");
                }
                throw new NullPointerException("Null metadata");
            }
            throw new NullPointerException("Null timeStampMillis");
        }
        throw new NullPointerException("Null id");
    }

    @Override // com.google.android.libraries.messaging.lighter.model.Notification
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.libraries.messaging.lighter.model.Notification
    public final Long b() {
        return this.b;
    }

    @Override // com.google.android.libraries.messaging.lighter.model.Notification
    public final NotificationMetadata c() {
        return this.c;
    }

    @Override // com.google.android.libraries.messaging.lighter.model.Notification
    public final Notification.OneOfType d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Notification) {
            Notification notification = (Notification) obj;
            if (this.a.equals(notification.a()) && this.b.equals(notification.b()) && this.c.equals(notification.c()) && this.d.equals(notification.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 58 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Notification{id=");
        sb.append(str);
        sb.append(", timeStampMillis=");
        sb.append(valueOf);
        sb.append(", metadata=");
        sb.append(valueOf2);
        sb.append(", oneOfType=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
