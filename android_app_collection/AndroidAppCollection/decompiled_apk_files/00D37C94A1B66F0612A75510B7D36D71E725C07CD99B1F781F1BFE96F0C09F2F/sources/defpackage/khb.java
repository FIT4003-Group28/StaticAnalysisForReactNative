package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: khb  reason: default package */
/* loaded from: classes3.dex */
public final class khb {
    public final yye a;
    public final yye b;
    final yye c;
    public final yye d;
    public final yye e;
    public final yye f;
    public final yye g;

    public khb(View view, int i) {
        long j = i;
        this.b = new yye((FrameLayout) view.findViewById(R.id.player_video_heading), j, 8);
        this.a = new yye((LinearLayout) view.findViewById(R.id.player_additional_view_container), j, 8);
        this.e = new yye((TouchImageView) view.findViewById(R.id.player_collapse_button), j, 8);
        this.f = new yye((TouchImageView) view.findViewById(R.id.player_overflow_button), j, 8);
        this.d = new yye((TouchImageView) view.findViewById(R.id.live_chat_overlay_button), j, 8);
        this.c = new yye(view.findViewById(R.id.title_anchor), j, 8);
        this.g = new yye((ImageView) view.findViewById(R.id.hide_controls_button_top), j, 8);
    }
}
