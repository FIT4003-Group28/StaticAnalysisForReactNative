package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui.ShortsPlayerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: gzh  reason: default package */
/* loaded from: classes3.dex */
public final class gzh extends aljg {
    public final ViewGroup a;
    public final gzg b;
    public final BottomSheetBehavior c;
    private final ShortsPlayerView e;
    private final View f;
    private final View g;
    public View d = null;
    private int h = -1;

    public gzh(View view, gzg gzgVar) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.popup_content);
        this.a = viewGroup;
        this.g = view;
        this.b = gzgVar;
        BottomSheetBehavior v = BottomSheetBehavior.v(viewGroup);
        this.c = v;
        v.w(this);
        v.s = false;
        v.C(true);
        this.e = (ShortsPlayerView) view.findViewById(R.id.shorts_edit_player_view);
        this.f = view.findViewById(R.id.shorts_edit_player_view_wrapper);
        c();
    }

    private final int e() {
        int i = this.h;
        if (i < 0) {
            int height = this.g.getHeight() - this.f.getHeight();
            this.h = height;
            return height;
        }
        return i;
    }

    @Override // defpackage.aljg
    public final void b(View view, int i) {
        if (i == 5) {
            this.a.removeAllViews();
            ((hbv) this.b).b.c(false);
            this.c.A(true);
            ShortsPlayerView shortsPlayerView = this.e;
            shortsPlayerView.a(shortsPlayerView.getHeight());
        } else if (i != 3) {
        } else {
            ((hbv) this.b).b.c(true);
            this.c.A(false);
            ShortsPlayerView shortsPlayerView2 = this.e;
            shortsPlayerView2.a(shortsPlayerView2.getHeight() - (this.a.getHeight() - e()));
        }
    }

    public final void c() {
        d(false);
    }

    public final void d(boolean z) {
        if (z) {
            this.c.E(3);
        } else {
            this.c.E(5);
        }
    }

    @Override // defpackage.aljg
    public final void ms(View view, float f) {
        float max = Math.max(0.0f, f + 1.0f);
        this.e.a(Math.abs(this.e.getHeight() - ((view.getHeight() - e()) * max)));
    }
}
