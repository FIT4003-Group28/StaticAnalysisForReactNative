package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ieh  reason: default package */
/* loaded from: classes3.dex */
public final class ieh extends aizd implements ahzx {
    public final aizf a;
    public final aiah b;
    public View c;
    public final ieg d;
    private final ieg e;
    private final ieg f;

    public ieh(Context context, aizf aizfVar, aiah aiahVar) {
        super(context);
        this.e = new ieg(R.id.reels_playback);
        this.f = new ieg(R.id.reels_response);
        this.d = new ieg(R.id.reels_sequence);
        this.a = aizfVar;
        this.b = aiahVar;
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahzx
    public final void d() {
        g(false);
        this.b.g();
    }

    public final void e(long j) {
        this.e.b(j);
    }

    public final void f(long j) {
        this.f.b(j);
    }

    public final void g(boolean z) {
        if (this.c == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.reel_player_csi_overlay, this);
            this.e.a(inflate);
            this.f.a(inflate);
            this.d.a(inflate);
            this.c = inflate;
        }
        zag.o(this.c, z);
        aizf aizfVar = this.a;
        if (aizfVar != null) {
            ief iefVar = new ief(this);
            View findViewById = ((View) aizfVar).findViewById(R.id.nerd_stats_layout);
            if (findViewById == null) {
                return;
            }
            if (findViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                zgd.t(findViewById, zgd.p(getResources().getDimensionPixelSize(R.dimen.reel_nerd_stats_margin_top)), ViewGroup.MarginLayoutParams.class);
            }
            findViewById.addOnLayoutChangeListener(iefVar);
        }
    }

    public final boolean h() {
        View view = this.c;
        return view != null && view.getVisibility() == 0;
    }

    @Override // defpackage.ahzx
    public final void rW() {
        this.b.rW();
    }
}
