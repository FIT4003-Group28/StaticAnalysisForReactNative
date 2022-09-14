package com.google.android.libraries.social.licenses;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class LicenseMenuActivity extends rb {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_menu_activity);
        if (NI() != null) {
            NI().b(true);
        }
        gn g = g();
        if (!(g.G(R.id.license_menu_fragment_container) instanceof cxop)) {
            cxop cxopVar = new cxop();
            gz b = g.b();
            b.w(R.id.license_menu_fragment_container, cxopVar);
            b.g();
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
