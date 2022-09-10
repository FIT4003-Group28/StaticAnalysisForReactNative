package defpackage;

import android.app.AlertDialog;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bazo  reason: default package */
/* loaded from: classes3.dex */
final class bazo implements View.OnClickListener {
    final /* synthetic */ bazw a;

    public bazo(bazw bazwVar) {
        this.a = bazwVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bazw bazwVar = this.a;
        AlertDialog.Builder title = new AlertDialog.Builder(bazwVar.t).setTitle(R.string.HIDE_CONTACT_PROMPT);
        gga ggaVar = bazwVar.t;
        title.setMessage(ggaVar.getString(R.string.HIDE_CONTACT_MESSAGE, new Object[]{bazwVar.e.e(ggaVar)})).setPositiveButton(R.string.HIDE_BUTTON, new bazr(bazwVar)).setNegativeButton(R.string.CANCEL_BUTTON, new bazq()).show();
    }
}
