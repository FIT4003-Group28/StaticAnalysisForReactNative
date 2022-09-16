package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: umv  reason: default package */
/* loaded from: classes4.dex */
final class umv extends ov {
    public umv(Context context, int i) {
        super(context, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ov, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
            window.setLayout(-1, -2);
        }
    }
}
