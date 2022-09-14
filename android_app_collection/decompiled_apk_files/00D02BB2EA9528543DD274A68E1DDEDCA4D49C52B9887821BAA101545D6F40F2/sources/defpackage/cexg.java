package defpackage;

import android.view.View;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: cexg  reason: default package */
/* loaded from: classes4.dex */
final class cexg implements View.OnLayoutChangeListener {
    final /* synthetic */ cexk a;

    public cexg(cexk cexkVar) {
        this.a = cexkVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        TextView textView = (TextView) view;
        boolean z = true;
        if (textView.getText().toString().equals(this.a.b.c) && textView.getLineCount() <= 3) {
            z = false;
        }
        if (z != this.a.d.booleanValue()) {
            this.a.d = Boolean.valueOf(z);
            cqkx.p(this.a);
        }
    }
}
