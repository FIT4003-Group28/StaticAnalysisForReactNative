package defpackage;

import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
/* compiled from: PG */
/* renamed from: fzd  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fzd implements Runnable {
    public final /* synthetic */ InlinePlaybackLifecycleController a;
    public final /* synthetic */ int b;
    public final /* synthetic */ fzg c;
    private final /* synthetic */ int d;

    public /* synthetic */ fzd(InlinePlaybackLifecycleController inlinePlaybackLifecycleController, int i, fzg fzgVar) {
        this.a = inlinePlaybackLifecycleController;
        this.b = i;
        this.c = fzgVar;
    }

    public /* synthetic */ fzd(InlinePlaybackLifecycleController inlinePlaybackLifecycleController, int i, fzg fzgVar, int i2) {
        this.d = i2;
        this.a = inlinePlaybackLifecycleController;
        this.b = i;
        this.c = fzgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d == 0) {
            InlinePlaybackLifecycleController inlinePlaybackLifecycleController = this.a;
            int i = this.b;
            fzg fzgVar = this.c;
            if (!InlinePlaybackLifecycleController.q(i, fzgVar)) {
                return;
            }
            inlinePlaybackLifecycleController.n(i, fzgVar);
            return;
        }
        InlinePlaybackLifecycleController inlinePlaybackLifecycleController2 = this.a;
        int i2 = this.b;
        fzg fzgVar2 = this.c;
        if (!InlinePlaybackLifecycleController.q(i2, fzgVar2)) {
            return;
        }
        inlinePlaybackLifecycleController2.n(i2, fzgVar2);
    }
}
