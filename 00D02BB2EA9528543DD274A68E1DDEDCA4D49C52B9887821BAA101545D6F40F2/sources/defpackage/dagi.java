package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
/* compiled from: PG */
/* renamed from: dagi  reason: default package */
/* loaded from: classes5.dex */
final class dagi implements View.OnFocusChangeListener {
    final /* synthetic */ dagq a;

    public dagi(dagq dagqVar) {
        this.a = dagqVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        boolean isEmpty = TextUtils.isEmpty(((EditText) view).getText());
        dagq dagqVar = this.a;
        boolean z2 = true;
        if (!(!isEmpty) || !z) {
            z2 = false;
        }
        dagqVar.c(z2);
    }
}
