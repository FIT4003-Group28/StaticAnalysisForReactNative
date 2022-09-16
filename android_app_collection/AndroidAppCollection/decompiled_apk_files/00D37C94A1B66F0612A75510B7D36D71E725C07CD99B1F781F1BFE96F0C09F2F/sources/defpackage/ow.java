package defpackage;

import android.app.Dialog;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: ow  reason: default package */
/* loaded from: classes4.dex */
public class ow extends dh {
    @Override // defpackage.dh
    public Dialog oy(Bundle bundle) {
        return new ov(rb(), this.b);
    }

    @Override // defpackage.dh
    public final void p(Dialog dialog, int i) {
        if (dialog instanceof ov) {
            ov ovVar = (ov) dialog;
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                dialog.getWindow().addFlags(24);
            }
            ovVar.e();
            return;
        }
        super.p(dialog, i);
    }
}
