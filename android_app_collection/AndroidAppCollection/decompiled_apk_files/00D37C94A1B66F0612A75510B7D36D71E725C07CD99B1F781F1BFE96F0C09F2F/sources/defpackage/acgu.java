package defpackage;

import android.view.animation.Animation;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
/* compiled from: PG */
/* renamed from: acgu  reason: default package */
/* loaded from: classes.dex */
public final class acgu extends achi {
    final /* synthetic */ LiveCreationActivity a;

    public acgu(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }

    @Override // defpackage.achi, android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.a.L.setVisibility(0);
    }
}
