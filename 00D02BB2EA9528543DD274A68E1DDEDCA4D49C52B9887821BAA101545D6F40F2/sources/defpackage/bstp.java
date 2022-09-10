package defpackage;

import android.content.Context;
import android.widget.TextView;
import androidx.preference.Preference;
/* compiled from: PG */
/* renamed from: bstp  reason: default package */
/* loaded from: classes4.dex */
final class bstp extends Preference {
    public bstp(Context context) {
        super(context);
    }

    @Override // androidx.preference.Preference
    public final void Rk(ave aveVar) {
        super.Rk(aveVar);
        TextView textView = (TextView) aveVar.C(16908310);
        if (textView != null) {
            textView.setSingleLine(false);
            textView.setTypeface(textView.getTypeface(), 1);
            textView.setTextColor(ibm.t().b(this.j));
            textView.setTextSize(2, 16.0f);
            textView.setGravity(8388659);
            textView.setPaddingRelative(0, 0, 0, (int) cqrp.d(4.0d).a(this.j));
        }
    }
}
