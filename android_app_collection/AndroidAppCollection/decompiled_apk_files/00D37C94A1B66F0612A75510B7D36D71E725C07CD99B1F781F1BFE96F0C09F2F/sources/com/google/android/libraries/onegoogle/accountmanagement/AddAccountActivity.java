package com.google.android.libraries.onegoogle.accountmanagement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AddAccountActivity extends Activity {
    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9) {
            ulc.a.a(false);
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ulc.a.a(true);
        Intent intent = new Intent("android.settings.ADD_ACCOUNT_SETTINGS");
        intent.putExtra("account_types", new String[]{"com.google"});
        startActivityForResult(intent, 9);
    }
}
