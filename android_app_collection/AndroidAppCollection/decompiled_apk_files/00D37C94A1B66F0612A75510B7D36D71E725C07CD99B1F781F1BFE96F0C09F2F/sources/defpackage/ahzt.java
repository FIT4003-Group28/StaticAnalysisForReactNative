package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.live.LiveOverlayPresenter;
/* compiled from: PG */
/* renamed from: ahzt  reason: default package */
/* loaded from: classes.dex */
public final class ahzt implements ynl {
    final /* synthetic */ LiveOverlayPresenter a;

    public ahzt(LiveOverlayPresenter liveOverlayPresenter) {
        this.a = liveOverlayPresenter;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        boolean z = false;
        if (i != -1) {
            if (i == 0) {
                if (((ahhv) obj).a) {
                    this.a.a.l();
                    return null;
                }
                if (this.a.n != aika.ENDED) {
                    z = true;
                }
                this.a.a.u(z);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhv.class};
    }
}
