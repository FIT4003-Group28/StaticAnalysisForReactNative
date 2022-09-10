package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: caah  reason: default package */
/* loaded from: classes4.dex */
final class caah implements DialogInterface.OnClickListener {
    final /* synthetic */ caaw a;

    public caah(caaw caawVar) {
        this.a = caawVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            this.a.aV();
        } else if (i != -2) {
        } else {
            this.a.aJ(null, true);
        }
    }
}
