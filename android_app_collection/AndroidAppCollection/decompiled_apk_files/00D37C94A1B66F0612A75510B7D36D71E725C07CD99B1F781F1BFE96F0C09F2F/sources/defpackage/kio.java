package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.player.overlay.YouTubeInlineAdOverlay;
/* compiled from: PG */
/* renamed from: kio  reason: default package */
/* loaded from: classes3.dex */
public final class kio implements View.OnLayoutChangeListener {
    final /* synthetic */ YouTubeInlineAdOverlay a;

    public kio(YouTubeInlineAdOverlay youTubeInlineAdOverlay) {
        this.a = youTubeInlineAdOverlay;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i8 - i6;
        int i10 = i3 - i;
        int i11 = i4 - i2;
        if (i7 - i5 == i10 && i9 == i11) {
            return;
        }
        boolean isInMultiWindowMode = this.a.a.isInMultiWindowMode();
        YouTubeInlineAdOverlay youTubeInlineAdOverlay = this.a;
        kdy kdyVar = youTubeInlineAdOverlay.b;
        boolean z = true;
        if (i11 <= i10 && !isInMultiWindowMode) {
            z = false;
        }
        boolean d = youTubeInlineAdOverlay.d.d();
        xih xihVar = kdyVar.h;
        xhi xhiVar = (xhi) xihVar.b;
        ((xhr) xihVar.c).a(z, xhiVar.k, xhiVar.j, d);
    }
}
