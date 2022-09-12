package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: cvxh  reason: default package */
/* loaded from: classes5.dex */
public class cvxh extends Activity {
    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9) {
            cvxi.c.a(false);
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cvxi.c.a(true);
        Intent intent = new Intent("android.settings.ADD_ACCOUNT_SETTINGS");
        intent.putExtra("account_types", new String[]{"com.google"});
        startActivityForResult(intent, 9);
    }
}
