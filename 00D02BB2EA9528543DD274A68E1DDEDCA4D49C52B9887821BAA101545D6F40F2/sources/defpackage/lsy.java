package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: lsy  reason: default package */
/* loaded from: classes7.dex */
final class lsy implements View.OnFocusChangeListener {
    final /* synthetic */ kdg a;

    public lsy(kdg kdgVar) {
        this.a = kdgVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.a.f(kdc.MAP_INTERACTION_AND_BUTTONS_FORCED);
        } else {
            this.a.f(kdc.MAP_INTERACTION_AND_BUTTONS_ENABLED);
        }
    }
}
