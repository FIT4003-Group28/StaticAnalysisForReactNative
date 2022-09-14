package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
/* loaded from: classes.dex */
public class AppCompatDialogFragment extends DialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public void a(Dialog dialog, int i) {
        if (!(dialog instanceof h)) {
            super.a(dialog, i);
            return;
        }
        h hVar = (h) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            dialog.getWindow().addFlags(24);
        }
        hVar.a(1);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog n(Bundle bundle) {
        return new h(n(), p0());
    }
}
