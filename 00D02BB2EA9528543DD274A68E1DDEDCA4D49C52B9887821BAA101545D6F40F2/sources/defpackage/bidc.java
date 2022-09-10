package defpackage;

import android.app.AlertDialog;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bidc  reason: default package */
/* loaded from: classes3.dex */
final class bidc implements View.OnClickListener {
    final /* synthetic */ bidk a;

    public bidc(bidk bidkVar) {
        this.a = bidkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bidk bidkVar = this.a;
        ilo c = bidkVar.f.c();
        dbsk.s(c);
        dbsk.l(akqi.d(c.ai()));
        new AlertDialog.Builder(bidkVar.a).setTitle(R.string.REMOVE_CONTACT_PROMPT).setMessage(bidkVar.a.getString(R.string.REMOVE_CONTACT_MESSAGE, new Object[]{bidkVar.a(), bidkVar.e.o(bidkVar.a)})).setPositiveButton(R.string.REMOVE_BUTTON, new bidi(bidkVar)).setNegativeButton(R.string.CANCEL_BUTTON, new bidh()).create().show();
    }
}
