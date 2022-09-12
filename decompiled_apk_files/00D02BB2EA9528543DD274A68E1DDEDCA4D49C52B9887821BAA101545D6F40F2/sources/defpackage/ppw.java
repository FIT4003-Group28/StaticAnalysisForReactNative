package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ppw  reason: default package */
/* loaded from: classes7.dex */
public final class ppw {
    public static int a;

    public static boolean a(bttq bttqVar) {
        return bttqVar == bttq.IO_ERROR || bttqVar == bttq.NO_CONNECTIVITY;
    }

    public static void b(Activity activity, @dzsi DialogInterface.OnClickListener onClickListener, @dzsi DialogInterface.OnCancelListener onCancelListener) {
        bvrj.UI_THREAD.c();
        a++;
        AlertDialog create = new AlertDialog.Builder(activity).setTitle(R.string.NETWORK_UNAVAILABLE).setMessage(R.string.PROBLEM_CONNECTING_TO_THE_NETWORK_TEXT).setPositiveButton(R.string.TRY_AGAIN, onClickListener).setNegativeButton(R.string.CANCEL_BUTTON, onClickListener).setOnCancelListener(onCancelListener).create();
        create.setOnDismissListener(new ppv());
        create.show();
    }
}
