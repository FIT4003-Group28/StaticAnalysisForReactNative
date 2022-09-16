package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kzq  reason: default package */
/* loaded from: classes7.dex */
public final class kzq implements View.OnFocusChangeListener {
    final /* synthetic */ kzt a;

    public kzq(kzt kztVar) {
        this.a = kztVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.a.t++;
        } else {
            kzt kztVar = this.a;
            kztVar.t--;
        }
        kzt kztVar2 = this.a;
        kztVar2.k.c().post(new kzl(kztVar2));
    }
}
