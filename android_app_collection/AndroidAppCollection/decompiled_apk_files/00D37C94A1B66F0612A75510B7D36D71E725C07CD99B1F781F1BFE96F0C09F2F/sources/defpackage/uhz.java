package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: uhz  reason: default package */
/* loaded from: classes4.dex */
public final class uhz {
    public Context a;

    public final String a(String str) {
        Context context = this.a;
        qnm.m(str, "accountName must be provided");
        qnm.i("Calling this from your main thread can lead to deadlock");
        qhz.g(context, 8400000);
        return qhz.f(context, new Account(str, "com.google"), "^^_account_id_^^", new Bundle());
    }

    public final String b(String str) {
        return qhz.k(this.a, str, "oauth2:https://www.googleapis.com/auth/notifications");
    }
}
