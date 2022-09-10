package defpackage;

import android.content.Context;
import android.widget.TextView;
import androidx.preference.Preference;
/* compiled from: PG */
/* renamed from: bvjn  reason: default package */
/* loaded from: classes4.dex */
final class bvjn extends Preference {
    public bvjn(Context context) {
        super(context);
    }

    @Override // androidx.preference.Preference
    public final void Rk(ave aveVar) {
        super.Rk(aveVar);
        TextView textView = (TextView) aveVar.C(16908310);
        if (textView != null) {
            textView.setSingleLine(false);
        }
    }
}
