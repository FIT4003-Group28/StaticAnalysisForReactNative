package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: axdp  reason: default package */
/* loaded from: classes2.dex */
final class axdp implements DialogInterface.OnClickListener {
    final /* synthetic */ Context a;
    private final /* synthetic */ int b;

    public axdp(Context context) {
        this.a = context;
    }

    public axdp(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        if (i2 == 0) {
            this.a.startActivity(new Intent("android.settings.VR_LISTENER_SETTINGS"));
        } else if (i2 == 1) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("market://details?id=com.google.vr.vrcore"));
            intent.setPackage("com.android.vending");
            try {
                this.a.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                Log.e(axdq.a, "Google Play Services is not installed, unable to download VrCore.");
            }
        } else if (i2 != 2) {
            try {
                this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://google.com/cardboard/cfg")));
            } catch (ActivityNotFoundException unused2) {
                Toast.makeText(this.a, (int) R.string.no_browser_text, 1).show();
            }
        } else {
            try {
                this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/daydream?p=daydream_help_menu")));
            } catch (ActivityNotFoundException unused3) {
                Toast.makeText(this.a, (int) R.string.no_browser_text, 1).show();
                dialogInterface.cancel();
            }
        }
    }
}
