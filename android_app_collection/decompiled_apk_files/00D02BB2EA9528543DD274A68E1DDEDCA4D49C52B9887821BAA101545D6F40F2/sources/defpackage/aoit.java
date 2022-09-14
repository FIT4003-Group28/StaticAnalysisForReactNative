package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aoit  reason: default package */
/* loaded from: classes2.dex */
public final class aoit extends gen {
    public angp a;

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        dwfl dwflVar = (dwfl) bvrs.b(this.o.getByteArray("photo"), (dssr) dwfl.w.cu(7));
        dbsk.s(dwflVar);
        aois aoisVar = new aois(this, dwflVar);
        return new AlertDialog.Builder(J()).setTitle(R.string.MAPS_ACTIVITY_HIDE_PHOTO_DIALOG_TITLE).setMessage(R.string.MAPS_ACTIVITY_REMOVE_PHOTO_DIALOG_BODY).setPositiveButton(R.string.MAPS_ACTIVITY_HIDE, aoisVar).setNegativeButton(R.string.CANCEL_BUTTON, aoisVar).show();
    }
}
