package com.google.android.apps.gmm.locationsharing.widget;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class LocationSharingCreateShortcutActivity extends affm {
    public static Intent o(Context context) {
        Intent l = ahyr.l(context, dbpy.a, ahwe.SHORTCUT);
        l.setAction("android.intent.action.VIEW");
        return yzi.g(context, "LocationSharingShortcutId", context.getString(R.string.LOCATION_SHARING_FEATURE_TITLE), R.drawable.location_sharing_icon, l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    public final void onCreate(@dzsi Bundle bundle) {
        super.onCreate(bundle);
        ((akbk) btsq.a(akbk.class, this)).c();
        setResult(-1, o(this));
        finish();
    }
}
