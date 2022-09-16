package defpackage;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: ajvq  reason: default package */
/* loaded from: classes.dex */
public final class ajvq implements ajvp {
    public View a;

    public ajvq() {
        this.a = null;
    }

    public ajvq(View view) {
        this.a = view;
    }

    @Override // defpackage.ajvp
    public final void a(SpannableStringBuilder spannableStringBuilder, int i) {
        View view = this.a;
        if (view == null) {
            return;
        }
        View findViewById = view.findViewById(i);
        if (!(findViewById instanceof TextView)) {
            return;
        }
        ((TextView) findViewById).setText(spannableStringBuilder);
    }
}
