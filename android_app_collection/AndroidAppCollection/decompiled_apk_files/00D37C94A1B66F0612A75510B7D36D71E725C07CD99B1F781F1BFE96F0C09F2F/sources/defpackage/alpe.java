package defpackage;

import android.text.Editable;
import android.view.View;
/* compiled from: PG */
/* renamed from: alpe  reason: default package */
/* loaded from: classes.dex */
final class alpe implements View.OnClickListener {
    final /* synthetic */ alpi a;

    public alpe(alpi alpiVar) {
        this.a = alpiVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Editable text = this.a.k.a.getText();
        if (text != null) {
            text.clear();
        }
        this.a.k.h();
    }
}
