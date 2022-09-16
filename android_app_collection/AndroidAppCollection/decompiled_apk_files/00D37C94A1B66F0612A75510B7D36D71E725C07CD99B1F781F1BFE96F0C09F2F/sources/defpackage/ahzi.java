package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahzi  reason: default package */
/* loaded from: classes.dex */
public final class ahzi {
    private Drawable a;
    private ahzh b;
    private ahzh c;
    private ControlsState d;
    private ImageView e;
    private final Context f;

    public ahzi(ImageView imageView, Context context) {
        this(imageView, context, false);
    }

    public final void a(ControlsState controlsState) {
        ImageView imageView = this.e;
        imageView.getClass();
        this.c.getClass();
        this.b.getClass();
        Drawable drawable = imageView.getDrawable();
        ControlsState controlsState2 = this.d;
        boolean z = true;
        boolean z2 = (controlsState2 == null || controlsState == null || controlsState.a != controlsState2.a) ? false : true;
        if (drawable == null || !drawable.isVisible()) {
            z = false;
        }
        if (controlsState != null) {
            if (z2 && z) {
                return;
            }
            if (controlsState.a == ahzb.PAUSED) {
                this.e.setContentDescription(this.f.getText(R.string.accessibility_play));
                ControlsState controlsState3 = this.d;
                if (controlsState3 == null || controlsState3.a != ahzb.PLAYING) {
                    this.c.b();
                } else {
                    this.c.a();
                }
            } else if (controlsState.a == ahzb.PLAYING) {
                this.e.setContentDescription(this.f.getText(R.string.accessibility_pause));
                ControlsState controlsState4 = this.d;
                if (controlsState4 == null || controlsState4.a != ahzb.PAUSED) {
                    this.b.b();
                } else {
                    this.b.a();
                }
            } else {
                this.e.setContentDescription(this.f.getText(R.string.accessibility_replay));
                ImageView imageView2 = this.e;
                if (this.a == null) {
                    this.a = akf.a(this.f, R.drawable.player_replay);
                }
                imageView2.setImageDrawable(this.a);
            }
            this.d = controlsState;
        }
    }

    public ahzi(ImageView imageView, Context context, boolean z) {
        context.getClass();
        this.f = context;
        imageView.getClass();
        this.e = imageView;
        this.b = new ahzh(imageView, R.drawable.player_play_pause_transition, R.drawable.player_pause, z);
        this.c = new ahzh(imageView, R.drawable.player_pause_play_transition, R.drawable.player_play, z);
    }
}
