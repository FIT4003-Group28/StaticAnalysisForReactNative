package defpackage;

import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
/* compiled from: PG */
/* renamed from: mdk  reason: default package */
/* loaded from: classes3.dex */
public final class mdk extends fyo implements fzf, ezg {
    private final ezh d;
    private final InlinePlaybackLifecycleController e;

    public mdk(ezh ezhVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController) {
        this.d = ezhVar;
        this.e = inlinePlaybackLifecycleController;
    }

    @Override // defpackage.fyo
    public final boolean j(fyp fypVar, int i) {
        return i != 1 || this.d.g().c();
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pa(ezx ezxVar) {
    }

    @Override // defpackage.ezg
    public final void pb(ezx ezxVar, ezx ezxVar2) {
        if (!ezxVar.d() || ezxVar2.c()) {
            if (ezxVar.c() || !ezxVar2.c()) {
                return;
            }
            i();
            return;
        }
        this.e.o();
    }
}
