package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.Button;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: adnc  reason: default package */
/* loaded from: classes.dex */
public final class adnc extends dh {
    public static adnc aE(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("status_code", i);
        bundle.putString("device_name", str);
        adnc adncVar = new adnc();
        adncVar.ae(bundle);
        return adncVar;
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mS() {
        super.mS();
        Dialog dialog = this.d;
        if (dialog == null) {
            return;
        }
        Button button = (Button) dialog.findViewById(16908313);
        button.setTextColor(zhn.j(mJ(), R.attr.ytCallToAction).orElse(button.getTextColors().getDefaultColor()));
    }

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        String str;
        int i;
        String N;
        String O;
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            i = bundle2.getInt("status_code");
            str = bundle2.getString("device_name");
        } else {
            str = "";
            i = 0;
        }
        amvn amvnVar = aczm.a;
        Integer valueOf = Integer.valueOf(i);
        if (amvnVar.contains(valueOf)) {
            N = N(R.string.cast_auth_error_message_title);
            O = O(R.string.cast_auth_error_message_desc, str);
        } else if (i == 401) {
            N = N(R.string.dial_connect_error_header_needs_permission);
            O = N(R.string.dial_connect_error_message_needs_permission);
        } else if (i == 404) {
            N = N(R.string.dial_connect_error_header_ytb_not_installed);
            O = N(R.string.dial_connect_error_message_ytb_not_installed);
        } else {
            N = N(R.string.dial_connect_error_header_generic);
            O = O(R.string.dial_connect_error_message_generic, valueOf);
        }
        return new AlertDialog.Builder(mJ()).setTitle(N).setMessage(O).setPositiveButton(R.string.dial_connect_error_dialog_close, gzj.i).setCancelable(false).create();
    }
}
