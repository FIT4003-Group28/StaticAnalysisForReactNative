package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cjxd  reason: default package */
/* loaded from: classes.dex */
public class cjxd {
    public final Context a;
    public final dxio<afha> b;
    @dzsi
    public Dialog c;

    public cjxd(Activity activity, dxio<afha> dxioVar) {
        this.a = activity;
        this.b = dxioVar;
    }

    public final boolean a() {
        Dialog dialog = this.c;
        return dialog != null && dialog.isShowing();
    }

    public final boolean b() {
        return btsj.b(this.a);
    }

    public final void c(boolean z, @dzsi cjxc cjxcVar, int i, int i2, int i3, Intent intent) {
        d(z, cjxcVar, i, this.a.getString(i2), i3, intent);
    }

    public final void d(boolean z, @dzsi cjxc cjxcVar, int i, CharSequence charSequence, int i2, Intent intent) {
        AlertDialog.Builder message = new AlertDialog.Builder(this.a).setTitle(this.a.getString(i)).setMessage(charSequence);
        message.setPositiveButton(this.a.getString(i2), new cjxb(this, intent)).setNegativeButton(this.a.getString(R.string.IGNORE_BUTTON), new cjxa(cjxcVar, z)).setOnCancelListener(new cjwz(cjxcVar, z));
        e(message.create());
    }

    public final void e(Dialog dialog) {
        Dialog dialog2 = this.c;
        if (dialog2 != null && dialog2.isShowing()) {
            this.c.dismiss();
        }
        dialog.show();
        this.c = dialog;
    }

    public final boolean f(boolean z, @dzsi cjxc cjxcVar) {
        int i;
        Intent intent;
        int i2;
        int i3;
        int c = btsj.c(this.a);
        if (c != 0 && cnnl.g(c)) {
            if (c == 3) {
                Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent2.setData(fromParts);
                intent = intent2;
                i = R.string.ENABLE_PLAY_SERVICES_FOR_LOCATION_TITLE;
                i3 = R.string.ENABLE_PLAY_SERVICES_FOR_LOCATION_MESSAGE;
                i2 = R.string.DA_DIALOG_ENABLE;
            } else {
                int i4 = c == 2 ? R.string.DIALOG_UPDATE : R.string.DIALOG_INSTALL;
                int i5 = c == 2 ? R.string.UPDATE_PLAY_SERVICES_FOR_LOCATION_MESSAGE : R.string.INSTALL_PLAY_SERVICES_FOR_LOCATION_MESSAGE;
                int i6 = c == 2 ? R.string.UPDATE_PLAY_SERVICES_FOR_LOCATION_TITLE : R.string.INSTALL_PLAY_SERVICES_FOR_LOCATION_TITLE;
                Uri build = Uri.parse("http://play.google.com/store/apps/details").buildUpon().appendQueryParameter("id", "com.google.android.gms").build();
                Intent intent3 = new Intent("android.intent.action.VIEW");
                intent3.setData(build);
                intent3.setPackage("com.android.vending");
                i = i6;
                intent = intent3;
                i2 = i4;
                i3 = i5;
            }
            c(z, cjxcVar, i, i3, i2, intent);
            return true;
        }
        return false;
    }
}
