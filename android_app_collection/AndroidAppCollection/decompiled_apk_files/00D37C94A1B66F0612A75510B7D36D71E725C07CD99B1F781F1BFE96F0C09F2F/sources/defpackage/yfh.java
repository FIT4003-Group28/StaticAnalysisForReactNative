package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: yfh  reason: default package */
/* loaded from: classes4.dex */
public final class yfh {
    public final yzj a;
    private final Activity b;
    private AlertDialog c;

    public yfh(Activity activity, yzj yzjVar) {
        activity.getClass();
        this.b = activity;
        yzjVar.getClass();
        this.a = yzjVar;
    }

    public final void a(CharSequence charSequence) {
        if (this.c == null) {
            this.c = new AlertDialog.Builder(this.b, 2132083943).setPositiveButton(R.string.commerce_dialog_ok, (DialogInterface.OnClickListener) null).create();
        }
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.b.getString(R.string.commerce_error_generic);
        }
        this.c.setMessage(charSequence);
        this.c.show();
    }
}
