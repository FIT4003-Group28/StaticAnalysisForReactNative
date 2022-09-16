package defpackage;

import android.content.DialogInterface;
import android.widget.CheckBox;
/* compiled from: PG */
/* renamed from: zxk  reason: default package */
/* loaded from: classes4.dex */
final class zxk implements DialogInterface.OnClickListener {
    final /* synthetic */ CheckBox a;
    final /* synthetic */ zxn b;
    final /* synthetic */ ild c;

    public zxk(zxn zxnVar, CheckBox checkBox, ild ildVar) {
        this.b = zxnVar;
        this.a = checkBox;
        this.c = ildVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i != -2) {
            if (i == -1) {
                zxn zxnVar = this.b;
                zxnVar.a(zxnVar.c);
            }
        } else if (this.a.isChecked()) {
            this.b.b.edit().putBoolean("cellular_upload_dialog_do_not_show_again", true).apply();
        }
        this.c.a();
    }
}
