package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mpd  reason: default package */
/* loaded from: classes3.dex */
public final class mpd implements ajru {
    private final Context a;
    private final FrameLayout b;
    private final boolean c;
    private View d;

    public mpd(Context context, aadd aaddVar) {
        this.b = new FrameLayout(context);
        this.a = context;
        asxp asxpVar = aaddVar.a().e;
        this.c = (asxpVar == null ? asxp.a : asxpVar).aN;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        this.b.removeAllViews();
        int bn = awwc.bn(((auqc) obj).c);
        if (bn == 0) {
            bn = 1;
        }
        int i = bn - 1;
        int i2 = R.layout.video_title_bar_ghost_card;
        if (i != 1) {
            if (i == 2) {
                i2 = R.layout.video_metadata_bar_ghost_card;
            } else if (i == 3) {
                i2 = R.layout.video_with_context_ghost_card;
            } else if (i == 4) {
                i2 = R.layout.video_comments_ghost_card;
            }
        }
        this.d = LayoutInflater.from(this.a).inflate(i2, this.b);
        if (this.c) {
            mpe.g(this.d, ajrsVar.b("position", -1));
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        if (this.c) {
            mpe.h(this.d);
        }
    }
}
