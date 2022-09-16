package defpackage;

import android.view.View;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: aicd  reason: default package */
/* loaded from: classes.dex */
public final class aicd implements aice {
    private final TextView a;

    public aicd(TextView textView) {
        textView.getClass();
        this.a = textView;
    }

    @Override // defpackage.aice
    public final void a(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    @Override // defpackage.aice
    public final void b(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    @Override // defpackage.aice
    public final void c(int i) {
        this.a.setVisibility(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("[");
        sb.append(this.a.getId());
        sb.append("]");
        return sb.toString();
    }
}
