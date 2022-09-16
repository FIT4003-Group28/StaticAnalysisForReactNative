package defpackage;

import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
/* compiled from: PG */
/* renamed from: ahut  reason: default package */
/* loaded from: classes.dex */
public final class ahut implements ynl {
    final /* synthetic */ CreatorEndscreenOverlayPresenter a;

    public ahut(CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter) {
        this.a = creatorEndscreenOverlayPresenter;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                this.a.g.e(((ahhv) obj).a);
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
