package defpackage;

import com.google.android.apps.youtube.app.common.player.PlaybackLifecycleMonitor;
/* compiled from: PG */
/* renamed from: fdx  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fdx implements ayqb {
    public final /* synthetic */ PlaybackLifecycleMonitor a;
    private final /* synthetic */ int b;

    public /* synthetic */ fdx(PlaybackLifecycleMonitor playbackLifecycleMonitor, int i) {
        this.b = i;
        this.a = playbackLifecycleMonitor;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            this.a.k((ahia) obj);
        } else {
            this.a.j((ahhw) obj);
        }
    }
}
