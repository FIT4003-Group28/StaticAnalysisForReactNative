package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: arrb  reason: default package */
/* loaded from: classes2.dex */
public final class arrb extends gen {
    public arrf a;
    public cjqy b;
    public cjqq c;

    @Override // defpackage.gen
    public final Dialog i(@dzsi Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(J());
        cjql d = this.c.g().d(cjtd.a(dtxv.al));
        cjql d2 = this.c.g().d(cjtd.a(dtxv.am));
        builder.setTitle(J().getResources().getString(R.string.ENABLE_MEDIA_WELCOME_SCREEN_TITLE_NO_APP_NAME));
        builder.setMessage(R.string.ENABLE_MEDIA_WELCOME_SCREEN_CONTENT);
        builder.setPositiveButton(R.string.OK_BUTTON, new arqz(this, d));
        builder.setNegativeButton(R.string.CANCEL_BUTTON, new arra(this, d2));
        return builder.create();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxv.an;
    }
}
