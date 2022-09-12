package com.google.android.apps.gmm.traffic.shortcut;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.util.UUID;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TrafficHubCreateShortcutActivity extends affm {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    public final void onCreate(@dzsi Bundle bundle) {
        super.onCreate(bundle);
        setResult(-1, yzi.f(this, String.format("TrafficHubShortcutId_%s", UUID.randomUUID().toString()), getString(R.string.TRAFFIC_HUB_SHORTCUT_NAME), BitmapFactory.decodeResource(getResources(), R.drawable.traffic_hub_shortcut_icon), bynu.e(this)));
        finish();
    }
}
