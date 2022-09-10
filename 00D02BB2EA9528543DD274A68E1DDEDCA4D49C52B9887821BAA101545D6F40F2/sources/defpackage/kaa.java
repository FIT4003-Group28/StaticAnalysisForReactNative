package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: kaa  reason: default package */
/* loaded from: classes7.dex */
final class kaa implements View.OnFocusChangeListener {
    final /* synthetic */ kaf a;

    public kaa(kaf kafVar) {
        this.a = kafVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.a.j.scrollTo(0, 0);
        }
    }
}
