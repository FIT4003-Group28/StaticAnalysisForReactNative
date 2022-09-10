package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: azqt  reason: default package */
/* loaded from: classes3.dex */
public final class azqt extends gen {
    public dxio<axws> a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        ff J = J();
        cjkp B = cjkr.B();
        B.t(J.getResources().getString(R.string.DIALOG_NO_CONNECTIVITY_TO_UPDATE_HOME_WORK_ALIAS_TITLE));
        ((cjke) B).e = J.getResources().getString(R.string.DIALOG_NO_CONNECTIVITY_TO_UPDATE_HOME_WORK_ALIAS_BODY);
        B.y(J.getResources().getString(R.string.DIALOG_NO_CONNECTIVITY_TO_UPDATE_HOME_WORK_ALIAS_DISMISS), null, cjtd.a(dtxy.af));
        return B.u(J).q();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.a.a().c(true);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxy.ae;
    }
}
