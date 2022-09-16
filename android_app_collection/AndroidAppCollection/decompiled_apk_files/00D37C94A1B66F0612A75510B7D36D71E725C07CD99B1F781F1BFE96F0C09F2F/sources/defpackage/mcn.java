package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;
/* compiled from: PG */
/* renamed from: mcn  reason: default package */
/* loaded from: classes3.dex */
public final class mcn extends fyo implements fzf {
    public final InlinePlaybackLifecycleController d;
    public final ScrollSelectionController e;
    public final Handler f;
    public fyq g;
    private final fyy h;

    public mcn(fyy fyyVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, ScrollSelectionController scrollSelectionController, Handler handler) {
        this.h = fyyVar;
        this.d = inlinePlaybackLifecycleController;
        this.e = scrollSelectionController;
        this.f = handler;
    }

    @Override // defpackage.fyo
    protected final boolean j(fyp fypVar, int i) {
        if (i != 2 || this.h.o()) {
            return true;
        }
        this.d.p();
        return true;
    }
}
