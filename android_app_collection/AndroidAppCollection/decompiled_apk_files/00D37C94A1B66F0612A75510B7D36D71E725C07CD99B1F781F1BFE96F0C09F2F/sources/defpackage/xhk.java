package defpackage;

import android.widget.TextView;
/* compiled from: PG */
/* renamed from: xhk  reason: default package */
/* loaded from: classes4.dex */
public final class xhk {
    public boolean a;
    private final TextView b;

    public xhk(TextView textView) {
        this.b = textView;
        a();
    }

    public final void a() {
        b(false, true);
        this.b.setText("");
    }

    public final void b(boolean z, boolean z2) {
        if (z2 || this.a != z) {
            this.a = z;
            this.b.setClickable(z);
            this.b.setEnabled(z);
            TextView textView = this.b;
            textView.setCompoundDrawablePadding(z ? (int) (textView.getResources().getDisplayMetrics().density * 6.0f) : 0);
            this.b.setCompoundDrawablesWithIntrinsicBounds(0, 0, true != z ? 0 : 2131230855, 0);
        }
    }
}
