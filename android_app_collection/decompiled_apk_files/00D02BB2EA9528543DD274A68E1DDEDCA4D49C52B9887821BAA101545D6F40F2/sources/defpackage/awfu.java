package defpackage;

import android.content.Context;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awfu  reason: default package */
/* loaded from: classes3.dex */
public final class awfu extends Preference {
    @dzsi
    public cjtd a;
    @dzsi
    public TextView b;
    private final ite c;

    public awfu(Context context, ite iteVar) {
        super(context);
        this.a = null;
        this.b = null;
        this.c = iteVar;
    }

    @Override // androidx.preference.Preference
    public final void P() {
        TextView textView = this.b;
        if (textView != null) {
            itf.a(textView);
        }
        R();
    }

    @Override // androidx.preference.Preference
    public final void Rk(ave aveVar) {
        super.Rk(aveVar);
        TextView textView = (TextView) aveVar.C(16908310);
        this.b = textView;
        cjtd cjtdVar = this.a;
        if (cjtdVar != null) {
            cjqg.h(textView, cjtdVar);
            this.c.c(this.b);
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setSingleLine(false);
        }
        ((TextView) aveVar.C(16908304)).setTextColor(this.j.getResources().getColor(R.color.quantum_googblue));
    }
}
