package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: mvg  reason: default package */
/* loaded from: classes7.dex */
public final class mvg extends ex {
    @Override // defpackage.ex, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ((mvn) G()).b = false;
    }

    @Override // defpackage.ex
    public final Dialog q(@dzsi Bundle bundle) {
        Dialog a = cnnk.a(this.o.getInt("dialog_error"), J(), 3, null);
        dbsk.s(a);
        return a;
    }
}
