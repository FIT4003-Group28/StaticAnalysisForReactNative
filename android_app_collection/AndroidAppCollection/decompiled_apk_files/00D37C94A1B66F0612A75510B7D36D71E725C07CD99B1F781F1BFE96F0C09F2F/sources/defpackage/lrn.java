package defpackage;

import android.app.AlertDialog;
import android.widget.CompoundButton;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lrn  reason: default package */
/* loaded from: classes3.dex */
public final class lrn implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ lrp a;

    public lrn(lrp lrpVar) {
        this.a = lrpVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        lrp lrpVar = this.a;
        boolean z2 = lrpVar.p;
        if (z2) {
            if (!z) {
                if (lrpVar.o == null) {
                    lrpVar.o = new AlertDialog.Builder(lrpVar.a).setMessage(R.string.collab_playlist_turn_off_confirm_message).setPositiveButton(R.string.ok, new lro(lrpVar)).setNegativeButton(R.string.cancel, new lro(lrpVar, 1)).create();
                }
                lrpVar.o.show();
                return;
            }
            z = true;
        }
        if (z2 || !z) {
            return;
        }
        lrpVar.c(true);
    }
}
