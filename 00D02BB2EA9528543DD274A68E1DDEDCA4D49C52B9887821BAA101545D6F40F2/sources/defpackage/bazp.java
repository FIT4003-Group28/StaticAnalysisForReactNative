package defpackage;

import android.app.AlertDialog;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bazp  reason: default package */
/* loaded from: classes3.dex */
final class bazp implements View.OnClickListener {
    final /* synthetic */ bazw a;

    public bazp(bazw bazwVar) {
        this.a = bazwVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bazw bazwVar = this.a;
        AlertDialog.Builder title = new AlertDialog.Builder(bazwVar.t).setTitle(R.string.REMOVE_CONTACT_PROMPT);
        gga ggaVar = bazwVar.t;
        title.setMessage(ggaVar.getString(R.string.REMOVE_CONTACT_MESSAGE, new Object[]{bazwVar.e.e(ggaVar), bazwVar.e.o(bazwVar.t)})).setPositiveButton(R.string.REMOVE_BUTTON, new bazu(bazwVar)).setNegativeButton(R.string.CANCEL_BUTTON, new bazt()).show();
    }
}
