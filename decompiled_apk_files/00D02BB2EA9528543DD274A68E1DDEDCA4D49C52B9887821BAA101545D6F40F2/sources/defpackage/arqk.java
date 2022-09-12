package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: arqk  reason: default package */
/* loaded from: classes2.dex */
public final class arqk extends gen {
    public arqu a;
    public cjqy b;
    public cjqq c;

    @Override // defpackage.gen
    public final Dialog i(@dzsi Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(J());
        Bundle bundle2 = this.o;
        CharSequence charSequence = null;
        String string = bundle2 == null ? null : bundle2.getString("package_name_key");
        if (string != null) {
            charSequence = this.a.e(string);
        }
        if (string == null || charSequence == null) {
            builder.setMessage(arjj.DEFAULT_MEDIA_APP_CONFIRMATION_ERROR);
            builder.setPositiveButton(R.string.OK_BUTTON, new arqh());
            return builder.create();
        }
        cjql d = this.c.g().d(cjtd.a(dtxv.ab));
        cjql d2 = this.c.g().d(cjtd.a(dtxv.ac));
        builder.setTitle(arjj.DEFAULT_MEDIA_APP_CONFIRMATION_TITLE);
        builder.setMessage(Rn().getString(arjj.DEFAULT_MEDIA_APP_CONFIRMATION_DESCRIPTION, charSequence));
        builder.setPositiveButton(arjj.DEFAULT_MEDIA_APP_CONFIRMATION_ACCEPT_TEXT, new arqi(this, d, string));
        builder.setNegativeButton(R.string.CANCEL_BUTTON, new arqj(this, d2));
        return builder.create();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxv.ad;
    }
}
