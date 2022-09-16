package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.player.overlay.SubtitleButtonController;
/* compiled from: PG */
/* renamed from: kgx  reason: default package */
/* loaded from: classes3.dex */
public final class kgx implements View.OnClickListener {
    final /* synthetic */ SubtitleButtonController a;
    private final Runnable b;

    public kgx(SubtitleButtonController subtitleButtonController, Runnable runnable) {
        this.a = subtitleButtonController;
        this.b = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SubtitleButtonController subtitleButtonController = this.a;
        if (subtitleButtonController.c) {
            subtitleButtonController.b.C(new kgw(this));
        } else {
            subtitleButtonController.a.b();
        }
        SubtitleButtonController subtitleButtonController2 = this.a;
        if (subtitleButtonController2.f.b(aijx.VIDEO_PLAYBACK_LOADED)) {
            subtitleButtonController2.g.oi().H(3, new acte(subtitleButtonController2.h), null);
        }
        this.b.run();
    }
}
