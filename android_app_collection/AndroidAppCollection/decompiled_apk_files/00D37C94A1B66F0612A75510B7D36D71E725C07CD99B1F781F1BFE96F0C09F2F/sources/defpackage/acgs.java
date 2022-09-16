package defpackage;

import android.view.Choreographer;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
/* compiled from: PG */
/* renamed from: acgs  reason: default package */
/* loaded from: classes.dex */
public final class acgs implements Choreographer.FrameCallback {
    final /* synthetic */ LiveCreationActivity a;

    public acgs(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.Q.a();
        if (this.a.aH()) {
            this.a.ao(this);
        }
    }
}
