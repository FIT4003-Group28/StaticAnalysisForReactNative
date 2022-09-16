package com.google.android.apps.gmm.shared.util.exceptionhandlers;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ClassNotFoundExceptionHandlingActivity extends rb implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {
    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        finish();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i != -1) {
            return;
        }
        String valueOf = String.valueOf(getPackageName());
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(valueOf.length() != 0 ? "market://details?id=".concat(valueOf) : new String("market://details?id="))));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PackageManager packageManager = getPackageManager();
        CharSequence charSequence = null;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(getPackageName(), 0);
            if (applicationInfo != null) {
                charSequence = packageManager.getApplicationLabel(applicationInfo);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (charSequence == null) {
            charSequence = getString(R.string.APPLICATION_NAME);
        }
        qx qxVar = new qx(this);
        qxVar.j(getString(R.string.REINSTALL_DIALOG_TITLE, new Object[]{charSequence}));
        qxVar.f(getString(R.string.REINSTALL_DIALOG_MESSAGE, new Object[]{charSequence}));
        qxVar.o(17039370, this);
        qxVar.m(this);
        qxVar.b().show();
    }
}
