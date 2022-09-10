package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adh  reason: default package */
/* loaded from: classes2.dex */
public final class adh implements View.OnFocusChangeListener {
    final /* synthetic */ adv a;

    public adh(adv advVar) {
        this.a = advVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        adv advVar = this.a;
        View.OnFocusChangeListener onFocusChangeListener = advVar.n;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(advVar, z);
        }
    }
}
