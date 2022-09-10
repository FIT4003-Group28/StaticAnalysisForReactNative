package defpackage;

import android.view.View;
/* renamed from: cjan  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cjan implements cqfd {
    static final cqfd a = new cjan();

    private cjan() {
    }

    @Override // defpackage.cqfd
    public final boolean a(View view) {
        int i = cjaq.a;
        if (view.hasFocus() || !cpv.a.e(view.getContext())) {
            return true;
        }
        view.requestFocus();
        return true;
    }
}
