package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: fzn  reason: default package */
/* loaded from: classes3.dex */
public final class fzn implements DialogInterface.OnClickListener {
    final /* synthetic */ fzo a;

    public fzn(fzo fzoVar) {
        this.a = fzoVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.a.d.isChecked()) {
            this.a.c.d(2);
            this.a.h.H(3, new acte(actj.INLINE_DIALOG_SETTINGS_ON), null);
        } else if (this.a.e.isChecked()) {
            this.a.c.d(1);
            this.a.h.H(3, new acte(actj.INLINE_DIALOG_SETTINGS_ONLY_WIFI), null);
        } else if (!this.a.f.isChecked()) {
        } else {
            this.a.c.d(0);
            this.a.h.H(3, new acte(actj.INLINE_DIALOG_SETTINGS_OFF), null);
        }
    }
}
