package com.google.android.apps.gmm.notification.log.api;

import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class NotificationLogger$IntentMetadata implements Parcelable {
    public static NotificationLogger$IntentMetadata c(auhv auhvVar, boolean z) {
        return new AutoValue_NotificationLogger_IntentMetadata(auhvVar, z);
    }

    public abstract auhv a();

    public abstract boolean b();
}
