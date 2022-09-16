package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.embeddedplayer.service.util.a;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: oqt  reason: default package */
/* loaded from: classes4.dex */
public final class oqt extends Dialog {
    private final Activity a;

    public oqt(Activity activity, View view, oqs oqsVar, PlaybackStartDescriptor playbackStartDescriptor, boolean z, boolean z2, boolean z3) {
        super(activity, z ? true != z2 ? R.style.LightboxDialogTheme : R.style.LightboxDialogWithStatusBarTheme : z3 ? R.style.DialogTheme : R.style.DialogFullscreenTheme);
        playbackStartDescriptor.getClass();
        this.a = activity;
        oqsVar.getClass();
        int i = -2;
        if (z) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setBackgroundResource(17301521);
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -2, 17));
            Window window = activity.getWindow();
            if (window != null) {
                window.setBackgroundDrawableResource(R.color.darker_transparent);
            }
            view = frameLayout;
        } else {
            Window window2 = activity.getWindow();
            if (window2 != null) {
                window2.setNavigationBarColor(0);
            }
            view.setBackgroundColor(-16777216);
        }
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(view, new FrameLayout.LayoutParams(-1, true != z ? -1 : i, 17));
        setContentView(frameLayout2);
        oqsVar.b.m(oqsVar.c, a.d(playbackStartDescriptor), true);
        oqsVar.a.k(playbackStartDescriptor, oqsVar.c);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.a.onKeyDown(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.a.onKeyUp(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Dialog
    protected final void onStop() {
        if (!this.a.isFinishing()) {
            this.a.finish();
        }
        super.onStop();
    }
}
