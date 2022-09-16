package defpackage;

import android.app.Dialog;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: zya  reason: default package */
/* loaded from: classes4.dex */
public final class zya extends zxz {
    @Override // defpackage.zxz
    protected final void aG() {
        mN(0, 2132083368);
    }

    @Override // defpackage.zxz, defpackage.aljp, defpackage.ow, defpackage.dh
    public final Dialog oy(Bundle bundle) {
        Dialog oy = super.oy(bundle);
        if (oy.getWindow() != null) {
            oy.getWindow().getDecorView().setSystemUiVisibility(4357);
            oy.getWindow().setFlags(8, 8);
        }
        return oy;
    }
}
