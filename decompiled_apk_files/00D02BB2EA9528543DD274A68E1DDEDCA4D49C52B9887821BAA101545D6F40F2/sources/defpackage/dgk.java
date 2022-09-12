package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
/* compiled from: PG */
/* renamed from: dgk  reason: default package */
/* loaded from: classes6.dex */
final class dgk extends ViewOutlineProvider {
    final /* synthetic */ int a;

    public dgk(int i) {
        this.a = i;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int height = view.getHeight();
        int round = Math.round(width * 0.8f);
        int round2 = Math.round(height * 0.8f);
        int i = this.a;
        outline.setOval(((width - round) / 2) + i, ((height - round2) / 2) + i, round, round2);
    }
}
