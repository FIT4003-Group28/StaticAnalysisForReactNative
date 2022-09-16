package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bfm  reason: default package */
/* loaded from: classes2.dex */
public class bfm extends dh {
    public Dialog ae;
    public bgo af;

    public bfm() {
        n(true);
    }

    public bfl aE(Context context) {
        return new bfl(context, 0);
    }

    @Override // defpackage.dh, defpackage.dp
    public final void my() {
        super.my();
        Dialog dialog = this.ae;
        if (dialog != null) {
            ((bfl) dialog).nc(false);
        }
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.ae;
        if (dialog != null) {
            ((bfl) dialog).q();
        }
    }

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        bfl aE = aE(rb());
        this.ae = aE;
        return aE;
    }
}
