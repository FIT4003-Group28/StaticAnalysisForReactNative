package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: blzh  reason: default package */
/* loaded from: classes3.dex */
public final class blzh implements cqfc {
    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
        view.setVisibility(0);
        dcdc j = dcdc.j(htt.a, htt.b, htt.c, htt.d, htt.e);
        int size = j.size();
        int i = 500;
        int i2 = 330;
        for (int i3 = 0; i3 < size; i3++) {
            View d = cqkx.d(view, (cqjg) j.get(i3));
            if (d != null) {
                d.setTranslationY(80.0f);
                d.setAlpha(0.0f);
                d.animate().setStartDelay(i).setDuration(i2).setInterpolator(irf.b).translationY(0.0f).alpha(1.0f).start();
                i += 65;
                i2 += 30;
            }
        }
    }
}
