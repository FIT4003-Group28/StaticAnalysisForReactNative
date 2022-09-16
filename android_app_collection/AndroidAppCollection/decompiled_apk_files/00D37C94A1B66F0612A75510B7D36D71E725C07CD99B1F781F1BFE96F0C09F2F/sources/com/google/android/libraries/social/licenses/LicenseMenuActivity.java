package com.google.android.libraries.social.licenses;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LicenseMenuActivity extends oa {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_menu_activity);
        if (getSupportActionBar() != null) {
            getSupportActionBar().j(true);
        }
        eo supportFragmentManager = getSupportFragmentManager();
        if (!(supportFragmentManager.e(R.id.license_menu_fragment_container) instanceof vgg)) {
            vgg vggVar = new vgg();
            ex l = supportFragmentManager.l();
            l.p(R.id.license_menu_fragment_container, vggVar);
            l.d();
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
