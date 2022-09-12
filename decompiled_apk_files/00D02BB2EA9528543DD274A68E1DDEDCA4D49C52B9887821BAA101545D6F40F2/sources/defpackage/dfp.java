package defpackage;

import android.app.Dialog;
import android.text.style.ClickableSpan;
import android.view.View;
/* compiled from: PG */
/* renamed from: dfp  reason: default package */
/* loaded from: classes6.dex */
final class dfp extends ClickableSpan {
    final /* synthetic */ View.OnClickListener a;
    final /* synthetic */ Dialog b;

    public dfp(View.OnClickListener onClickListener, Dialog dialog) {
        this.a = onClickListener;
        this.b = dialog;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.onClick(view);
        this.b.dismiss();
    }
}
