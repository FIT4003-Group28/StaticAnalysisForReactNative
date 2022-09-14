package defpackage;

import android.text.Editable;
import android.view.View;
/* compiled from: PG */
/* renamed from: dagl  reason: default package */
/* loaded from: classes5.dex */
final class dagl implements View.OnClickListener {
    final /* synthetic */ dagq a;

    public dagl(dagq dagqVar) {
        this.a = dagqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Editable text = this.a.k.a.getText();
        if (text != null) {
            text.clear();
        }
        this.a.k.m();
    }
}
