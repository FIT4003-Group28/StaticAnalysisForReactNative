package defpackage;

import android.app.AlertDialog;
import android.widget.TextView;
import androidx.preference.Preference;
/* compiled from: PG */
/* renamed from: bstt  reason: default package */
/* loaded from: classes4.dex */
final class bstt implements auc {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ bstu c;

    public bstt(bstu bstuVar, String str, String str2) {
        this.c = bstuVar;
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.auc
    public final boolean a(Preference preference) {
        bstu bstuVar = this.c;
        if (!bstuVar.aX) {
            return false;
        }
        AlertDialog create = new AlertDialog.Builder(bstuVar.J()).setTitle(this.a).setMessage(this.b).create();
        create.show();
        ((TextView) create.findViewById(16908299)).setTextIsSelectable(true);
        return true;
    }
}
