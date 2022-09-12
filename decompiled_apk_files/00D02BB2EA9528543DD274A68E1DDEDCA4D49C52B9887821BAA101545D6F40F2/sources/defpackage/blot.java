package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: blot  reason: default package */
/* loaded from: classes3.dex */
public final class blot extends gen {
    static final dcdn<String, Integer> a;
    public dzsj<ache> b;
    public cjqy c;

    static {
        dcdg dcdgVar = new dcdg();
        dcdgVar.f("poor-translation", Integer.valueOf((int) R.string.RIDDLER_POOR_QUESTION_TRANSLATION));
        dcdgVar.f("inappropriate-for-place", Integer.valueOf((int) R.string.RIDDLER_INAPPROPRIATE_QUESTION_AT_THIS_PLACE));
        dcdgVar.f("inappropriate-in-country", Integer.valueOf((int) R.string.RIDDLER_INAPPROPRIATE_QUESTION_IN_THIS_COUNTRY));
        dcdgVar.f("inappropriate-question-sequence", Integer.valueOf((int) R.string.RIDDLER_INAPPROPRIATE_QUESTION_SEQUENCE));
        dcdgVar.f("permanently-closed-place", Integer.valueOf((int) R.string.RIDDLER_PERMANENTLY_CLOSED_PLACE));
        dcdgVar.f("other", Integer.valueOf((int) R.string.RIDDLER_OTHER_QUESTION_ISSUE));
        a = dcdgVar.b();
    }

    @Override // defpackage.ges
    public final void Nv() {
        ((blou) btsx.b(blou.class, this)).cV(this);
    }

    @Override // defpackage.gen
    public final Dialog i(@dzsi Bundle bundle) {
        Bundle bundle2 = this.o;
        blvu blvuVar = bundle2 != null ? (blvu) bundle2.getSerializable("question_key") : null;
        ff J = J();
        dccx dccxVar = new dccx();
        gga ggaVar = this.aE;
        if (ggaVar != null) {
            dcpd<Integer> it = a.values().iterator();
            while (it.hasNext()) {
                dccxVar.g(ggaVar.getString(it.next().intValue()));
            }
        }
        return new AlertDialog.Builder(J()).setTitle(R.string.RIDDLER_REPORT_A_QUESTION_TITLE).setNegativeButton(R.string.CANCEL_BUTTON, new blos(this)).setSingleChoiceItems(new ArrayAdapter(J, (int) R.layout.generic_dialog_listitem, dccxVar.f()), -1, new blor(this, blvuVar)).create();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.bM;
    }
}
