package com.google.android.gms.auth;

import android.content.Intent;
/* compiled from: PG */
/* loaded from: classes.dex */
public class UserRecoverableAuthException extends cmra {
    private final Intent a;

    public UserRecoverableAuthException(String str, Intent intent) {
        super(str);
        this.a = intent;
    }

    public final Intent a() {
        Intent intent = this.a;
        if (intent == null) {
            return null;
        }
        return new Intent(intent);
    }
}
