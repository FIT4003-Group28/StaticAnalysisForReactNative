package defpackage;

import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
/* compiled from: PG */
/* renamed from: fyz  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fyz {
    public final /* synthetic */ InlinePlaybackLifecycleController a;
    public final /* synthetic */ fzg b;
    public final /* synthetic */ int c;
    public final /* synthetic */ fzf d;

    public /* synthetic */ fyz(InlinePlaybackLifecycleController inlinePlaybackLifecycleController, fzg fzgVar, int i, fzf fzfVar) {
        this.a = inlinePlaybackLifecycleController;
        this.b = fzgVar;
        this.c = i;
        this.d = fzfVar;
    }

    public final void a() {
        InlinePlaybackLifecycleController inlinePlaybackLifecycleController = this.a;
        fzg fzgVar = this.b;
        int i = this.c;
        fzf fzfVar = this.d;
        if (fzgVar.g != 2 && fzgVar.c.contains(fzfVar)) {
            int i2 = fzgVar.g;
            if (i2 != 1) {
                if (i2 != 3) {
                    return;
                }
                if (fzgVar.f + 1 != i) {
                    if (i != 0) {
                        return;
                    }
                    i = 0;
                }
            } else if (fzgVar.f + 1 != i) {
                return;
            }
            fzgVar.a(fzfVar);
            String.valueOf(String.valueOf(fzfVar)).length();
            if (fzgVar.b()) {
                return;
            }
            inlinePlaybackLifecycleController.a.post(new fzd(inlinePlaybackLifecycleController, i, fzgVar, 1));
        }
    }
}
