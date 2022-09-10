package defpackage;

import android.app.AlertDialog;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bidb  reason: default package */
/* loaded from: classes3.dex */
final class bidb implements View.OnClickListener {
    final /* synthetic */ bidk a;

    public bidb(bidk bidkVar) {
        this.a = bidkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bidk bidkVar = this.a;
        new AlertDialog.Builder(bidkVar.a).setTitle(R.string.HIDE_CONTACT_PROMPT).setMessage(bidkVar.a.getString(R.string.HIDE_CONTACT_MESSAGE, new Object[]{bidkVar.a()})).setPositiveButton(R.string.HIDE_BUTTON, new bidg(bidkVar)).setNegativeButton(R.string.CANCEL_BUTTON, new bidf()).create().show();
    }
}
