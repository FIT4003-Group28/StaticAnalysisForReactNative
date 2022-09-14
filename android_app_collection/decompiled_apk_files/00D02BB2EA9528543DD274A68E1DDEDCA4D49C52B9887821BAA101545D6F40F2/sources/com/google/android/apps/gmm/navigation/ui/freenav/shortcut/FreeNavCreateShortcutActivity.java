package com.google.android.apps.gmm.navigation.ui.freenav.shortcut;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class FreeNavCreateShortcutActivity extends affm {
    public btvo k;
    public cjqy l;
    public cjqq m;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    public final void onCreate(@dzsi Bundle bundle) {
        super.onCreate(bundle);
        ((aszn) btsq.a(aszn.class, this)).a(this);
        if (!this.k.getNavigationParameters().A()) {
            Toast.makeText(this, getString(R.string.DRIVING_MODE_NOT_AVAILABLE), 1).show();
            setResult(0);
            finish();
            return;
        }
        cjtd a = cjtd.a(dtxn.eO);
        this.l.n(this.m.g().d(a), new cjte(deaf.LONG_PRESS), a);
        Intent a2 = afft.a(this);
        a2.setData(afhd.c(dqvj.DRIVE, ddjr.FREE_NAV_LAUNCHER_SHORTCUT));
        a2.setAction("android.intent.action.VIEW");
        setResult(-1, yzi.g(this, "FreeNavShortcutId", getString(R.string.DRIVING_MODE_SHORTCUT_TITLE), R.mipmap.driving_icon, a2));
        finish();
    }
}
