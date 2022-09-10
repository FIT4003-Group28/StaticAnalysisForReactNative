package defpackage;

import android.view.View;
import android.view.ViewParent;
/* renamed from: rdn  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class rdn implements View.OnClickListener {
    static final View.OnClickListener a = new rdn();

    private rdn() {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = rdr.a;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof aefv) {
                aefv aefvVar = (aefv) parent;
                aefvVar.e(aefvVar.w());
                return;
            }
        }
    }
}
