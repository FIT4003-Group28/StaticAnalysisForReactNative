package com.google.android.libraries.messaging.lighter.model;

import android.os.Parcelable;
import java.io.Serializable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class MessageReceivedNotification implements Parcelable, Serializable {
    public static cugv j() {
        ctyn ctynVar = new ctyn();
        ctynVar.e(false);
        return ctynVar;
    }

    public abstract ConversationId a();

    public abstract String b();

    public abstract ContactId c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract String h();

    public abstract boolean i();
}
