package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
/* compiled from: PG */
/* renamed from: ahup  reason: default package */
/* loaded from: classes.dex */
public final class ahup implements Runnable {
    final /* synthetic */ CreatorEndscreenOverlayPresenter a;
    private final /* synthetic */ int b;

    public ahup(CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter) {
        this.a = creatorEndscreenOverlayPresenter;
    }

    public ahup(CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, int i) {
        this.b = i;
        this.a = creatorEndscreenOverlayPresenter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.l.b.b.sendAccessibilityEvent(8);
        } else if (this.a.t()) {
            Rect a = this.a.u.a();
            int width = a.width();
            int height = a.height();
            final ahum ahumVar = this.a.g;
            zgd.u(ahumVar, new azqb() { // from class: ahui
                @Override // defpackage.azqb
                public final Object get() {
                    return ahum.this.c();
                }
            }, zgd.s(width, height), ViewGroup.LayoutParams.class);
            for (ahuz ahuzVar : this.a.h) {
                aqvc aqvcVar = ahuzVar.b;
                float f = width;
                float f2 = aqvcVar.i * f;
                float f3 = f2 / aqvcVar.k;
                int paddingLeft = ahuzVar.c().getPaddingLeft();
                int paddingRight = ahuzVar.c().getPaddingRight();
                int paddingTop = ahuzVar.c().getPaddingTop();
                int paddingBottom = ahuzVar.c().getPaddingBottom();
                int round = Math.round(ahuzVar.b.h * f);
                int round2 = Math.round(ahuzVar.b.j * height);
                int round3 = Math.round(f2);
                int round4 = Math.round(f3);
                View c = ahuzVar.c();
                zfx p = zgd.p(round2 - paddingTop);
                int i = 1;
                zgd.t(c, zgd.b(zgd.i(round - paddingLeft), p, zgd.s(round3 + paddingLeft + paddingRight, round4 + paddingTop + paddingBottom)), ViewGroup.MarginLayoutParams.class);
                TextView textView = ahuzVar.e;
                if (textView != null) {
                    if (f3 > ahuzVar.f) {
                        i = 2;
                    }
                    textView.setMaxLines(i);
                }
            }
            ahvm ahvmVar = this.a.l;
            if (ahvmVar == null) {
                return;
            }
            ahvmVar.c();
        }
    }
}
