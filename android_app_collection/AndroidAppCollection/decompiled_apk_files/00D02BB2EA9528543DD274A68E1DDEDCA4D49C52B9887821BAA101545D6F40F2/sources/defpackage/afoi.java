package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: afoi  reason: default package */
/* loaded from: classes2.dex */
public final class afoi extends gen {
    public static void g(gga ggaVar, cjqy cjqyVar, String str) {
        cjqyVar.t(str);
        ggaVar.runOnUiThread(new afoh(ggaVar));
    }

    @Override // defpackage.ges
    protected final void Nv() {
        ((afoj) btsx.b(afoj.class, this)).bQ(this);
    }

    @Override // defpackage.gen
    public final synchronized Dialog i(Bundle bundle) {
        return new AlertDialog.Builder(J()).setTitle(Rp(R.string.EXTERNAL_INVOCATION_UNSUPPORTED_LINK_TITLE)).setMessage(Rp(R.string.EXTERNAL_INVOCATION_UNSUPPORTED_LINK_MESSAGE)).setPositiveButton(Rp(R.string.OK_BUTTON), (DialogInterface.OnClickListener) null).create();
    }
}
