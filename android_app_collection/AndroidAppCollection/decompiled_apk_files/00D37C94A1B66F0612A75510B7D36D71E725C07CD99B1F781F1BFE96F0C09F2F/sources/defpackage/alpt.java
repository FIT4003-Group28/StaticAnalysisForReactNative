package defpackage;

import android.view.View;
import android.widget.AutoCompleteTextView;
/* compiled from: PG */
/* renamed from: alpt  reason: default package */
/* loaded from: classes.dex */
final class alpt implements View.OnClickListener {
    final /* synthetic */ alpx a;

    public alpt(alpx alpxVar) {
        this.a = alpxVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        alpx alpxVar = this.a;
        alpxVar.e((AutoCompleteTextView) alpxVar.k.a);
    }
}
