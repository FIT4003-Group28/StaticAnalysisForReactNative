package com.spotify.sdk.android.authentication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class AuthCallbackActivity extends Activity {
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, LoginActivity.class);
        intent.setData(getIntent().getData());
        intent.setFlags(603979776);
        startActivity(intent);
        finish();
    }
}
