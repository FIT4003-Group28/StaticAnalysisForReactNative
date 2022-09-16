package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: addc  reason: default package */
/* loaded from: classes.dex */
public final class addc extends dh {
    adda ae;

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        return new AlertDialog.Builder(mJ()).setMessage(Html.fromHtml(O(R.string.mdx_pref_delete_tv_codes_remove_confirmation, this.m.getString("screenName"))).toString()).setPositiveButton(R.string.mdx_pref_delete_tv_codes_remove_tv, new DialogInterface.OnClickListener() { // from class: addb
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                addc addcVar = addc.this;
                adda addaVar = addcVar.ae;
                String string = addcVar.m.getString("deviceId");
                addf addfVar = addaVar.a;
                ylx.n(addfVar.a, addfVar.c.j(new adit(string)), new adcz(addfVar, 1), new adcz(addfVar));
            }
        }).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create();
    }
}
