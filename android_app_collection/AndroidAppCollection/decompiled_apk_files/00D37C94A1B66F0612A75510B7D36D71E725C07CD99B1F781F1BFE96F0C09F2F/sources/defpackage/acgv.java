package defpackage;

import android.view.animation.Animation;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
/* compiled from: PG */
/* renamed from: acgv  reason: default package */
/* loaded from: classes.dex */
public final class acgv extends achi {
    final /* synthetic */ LiveCreationActivity a;

    public acgv(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }

    @Override // defpackage.achi, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.L.setVisibility(8);
    }
}
