package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.io.File;
/* compiled from: PG */
/* renamed from: czhv  reason: default package */
/* loaded from: classes5.dex */
public final class czhv extends ex implements DialogInterface.OnClickListener {
    @Override // defpackage.ex, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ff J = J();
        if (J != null) {
            J.finish();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i != -1) {
            return;
        }
        ff J = J();
        new File(J.getFilesDir(), "corrupted_install").delete();
        String valueOf = String.valueOf(J.getPackageName());
        J.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(valueOf.length() != 0 ? "market://details?id=".concat(valueOf) : new String("market://details?id="))));
        J.finish();
    }

    @Override // defpackage.ex
    public final Dialog q(Bundle bundle) {
        ff J = J();
        CharSequence charSequence = null;
        try {
            PackageManager packageManager = J.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(J.getPackageName(), 0);
            if (applicationInfo != null) {
                charSequence = packageManager.getApplicationLabel(applicationInfo);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (charSequence == null) {
            charSequence = J.getString(R.string.application);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(J);
        builder.setTitle(J.getString(R.string.reinstall_prompt_dialog_title, new Object[]{charSequence}));
        builder.setMessage(J.getString(R.string.reinstall_prompt_dialog_message, new Object[]{charSequence}));
        builder.setPositiveButton(17039370, this);
        return builder.create();
    }
}
