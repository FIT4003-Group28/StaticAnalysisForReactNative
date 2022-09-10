package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: blxb  reason: default package */
/* loaded from: classes3.dex */
final class blxb implements cqfc {
    final /* synthetic */ boolean a;
    final /* synthetic */ blxc b;

    public blxb(blxc blxcVar, boolean z) {
        this.b = blxcVar;
        this.a = z;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        boolean z2 = this.a;
        int i = this.b.c;
        float height = z2 ? i : view.getHeight() + i;
        if (Float.compare(height, view.getTranslationY()) != 0) {
            if (z2) {
                i += view.getHeight();
            }
            view.setTranslationY(i);
            view.animate().setDuration(500L).translationY(height).start();
        }
    }
}
