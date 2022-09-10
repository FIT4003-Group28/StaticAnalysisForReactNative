package defpackage;

import android.app.Dialog;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: ry  reason: default package */
/* loaded from: classes.dex */
public class ry extends ex {
    @Override // defpackage.ex
    public final void p(Dialog dialog, int i) {
        if (dialog instanceof rx) {
            rx rxVar = (rx) dialog;
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                dialog.getWindow().addFlags(24);
            }
            rxVar.f();
            return;
        }
        super.p(dialog, i);
    }

    @Override // defpackage.ex
    public Dialog q(Bundle bundle) {
        return new rx(H(), this.b);
    }
}
