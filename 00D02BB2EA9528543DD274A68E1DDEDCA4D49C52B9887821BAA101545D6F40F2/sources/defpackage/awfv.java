package defpackage;

import android.content.Context;
import android.widget.TextView;
import androidx.preference.SwitchPreferenceCompat;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awfv  reason: default package */
/* loaded from: classes3.dex */
public final class awfv extends SwitchPreferenceCompat {
    @dzsi
    public cjtd c;
    @dzsi
    public TextView d;
    private final ite e;

    public awfv(Context context, ite iteVar) {
        super(context);
        this.c = null;
        this.d = null;
        this.e = iteVar;
    }

    @Override // androidx.preference.Preference
    public final void P() {
        TextView textView = this.d;
        if (textView != null) {
            itf.a(textView);
        }
        R();
    }

    @Override // androidx.preference.SwitchPreferenceCompat, androidx.preference.Preference
    public final void Rk(ave aveVar) {
        super.Rk(aveVar);
        TextView textView = (TextView) aveVar.C(16908310);
        this.d = textView;
        cjtd cjtdVar = this.c;
        if (cjtdVar != null) {
            cjqg.h(textView, cjtdVar);
            this.e.c(this.d);
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setSingleLine(false);
        }
    }
}
