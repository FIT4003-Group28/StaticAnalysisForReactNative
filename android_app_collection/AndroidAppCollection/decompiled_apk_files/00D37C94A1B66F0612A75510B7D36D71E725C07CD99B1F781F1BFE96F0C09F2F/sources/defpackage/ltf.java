package defpackage;

import android.app.AlertDialog;
import android.widget.Button;
import android.widget.RadioGroup;
/* compiled from: PG */
/* renamed from: ltf  reason: default package */
/* loaded from: classes3.dex */
public final class ltf implements RadioGroup.OnCheckedChangeListener {
    final /* synthetic */ AlertDialog a;
    private final /* synthetic */ int b;

    public ltf(AlertDialog alertDialog) {
        this.a = alertDialog;
    }

    public /* synthetic */ ltf(AlertDialog alertDialog, int i) {
        this.b = i;
        this.a = alertDialog;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        int i2 = this.b;
        boolean z = true;
        if (i2 == 0) {
            this.a.getButton(-1).setEnabled(true);
        } else if (i2 != 1) {
            AlertDialog alertDialog = this.a;
            int i3 = yca.e;
            alertDialog.getButton(-1).setEnabled(true);
        } else {
            Button button = this.a.getButton(-1);
            if (i == -1) {
                z = false;
            }
            button.setEnabled(z);
        }
    }
}
