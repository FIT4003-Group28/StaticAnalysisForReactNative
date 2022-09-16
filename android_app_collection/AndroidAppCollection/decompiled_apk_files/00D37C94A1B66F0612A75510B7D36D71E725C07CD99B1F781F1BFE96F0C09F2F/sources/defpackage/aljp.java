package defpackage;

import android.app.Dialog;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: aljp  reason: default package */
/* loaded from: classes.dex */
public class aljp extends ow {
    private final void aE() {
        Dialog dialog = this.d;
        if (dialog instanceof aljo) {
            boolean z = ((aljo) dialog).a().q;
        }
    }

    @Override // defpackage.dh
    public final void dismiss() {
        aE();
        super.dismiss();
    }

    @Override // defpackage.dh
    public final void ku() {
        aE();
        super.ku();
    }

    @Override // defpackage.ow, defpackage.dh
    public Dialog oy(Bundle bundle) {
        return new aljo(rb(), this.b);
    }
}
