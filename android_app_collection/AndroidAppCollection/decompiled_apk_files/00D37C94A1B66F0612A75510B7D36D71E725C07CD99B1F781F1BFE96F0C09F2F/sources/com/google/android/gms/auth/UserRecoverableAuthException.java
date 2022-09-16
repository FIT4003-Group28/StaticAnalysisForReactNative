package com.google.android.gms.auth;

import android.content.Intent;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class UserRecoverableAuthException extends qhr {
    public final Intent b;

    public UserRecoverableAuthException(String str, Intent intent) {
        super(str);
        this.b = intent;
    }
}
