package com.google.android.apps.gmm.sharing.sms.api;

import android.os.Parcelable;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class SmsController$GroupSmsMessage implements Parcelable {
    public static SmsController$GroupSmsMessage f(List<String> list, String str) {
        return new AutoValue_SmsController_GroupSmsMessage(list, str, null, null, true);
    }

    public abstract List<String> a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract boolean e();
}
