package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hfx  reason: default package */
/* loaded from: classes6.dex */
public final class hfx implements cqfc {
    final /* synthetic */ boolean a;
    final /* synthetic */ float b;

    public hfx(boolean z, float f) {
        this.a = z;
        this.b = f;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        if (z) {
            b(view);
        } else {
            view.animate().alpha(this.b).setInterpolator(irf.a).setDuration(200L).setListener(new hfw(this, view)).start();
        }
    }

    public final void b(View view) {
        view.setVisibility(true != this.a ? 8 : 0);
        view.setAlpha(this.b);
    }
}
