package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ebt  reason: default package */
/* loaded from: classes6.dex */
final class ebt implements View.OnScrollChangeListener {
    final /* synthetic */ ebx a;

    public ebt(ebx ebxVar) {
        this.a = ebxVar;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        if (i2 == 0) {
            if (i4 == 0) {
                return;
            }
            this.a.f(false);
        } else if (i2 == 0 || i4 != 0) {
        } else {
            this.a.f(true);
        }
    }
}
