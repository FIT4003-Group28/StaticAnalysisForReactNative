package com.google.android.apps.gmm.notification.log.api;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: com.google.android.apps.gmm.notification.log.api.$AutoValue_NotificationLogger_IntentMetadata  reason: invalid class name */
/* loaded from: classes5.dex */
public abstract class C$AutoValue_NotificationLogger_IntentMetadata extends NotificationLogger$IntentMetadata {
    public final auhv a;
    public final boolean b;

    public C$AutoValue_NotificationLogger_IntentMetadata(auhv auhvVar, boolean z) {
        if (auhvVar != null) {
            this.a = auhvVar;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null intentOrigin");
    }

    @Override // com.google.android.apps.gmm.notification.log.api.NotificationLogger$IntentMetadata
    public final auhv a() {
        return this.a;
    }

    @Override // com.google.android.apps.gmm.notification.log.api.NotificationLogger$IntentMetadata
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NotificationLogger$IntentMetadata) {
            NotificationLogger$IntentMetadata notificationLogger$IntentMetadata = (NotificationLogger$IntentMetadata) obj;
            if (this.a.equals(notificationLogger$IntentMetadata.a()) && this.b == notificationLogger$IntentMetadata.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 73);
        sb.append("IntentMetadata{intentOrigin=");
        sb.append(valueOf);
        sb.append(", doesIntentCauseRemovalOfNotification=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
