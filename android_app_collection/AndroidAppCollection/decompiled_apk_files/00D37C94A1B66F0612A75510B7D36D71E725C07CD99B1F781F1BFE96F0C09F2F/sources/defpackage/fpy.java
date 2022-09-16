package defpackage;

import com.google.android.apps.youtube.app.common.tvfilm.TrailerOverlayPresenter;
/* compiled from: PG */
/* renamed from: fpy  reason: default package */
/* loaded from: classes3.dex */
public final class fpy implements ynl {
    final /* synthetic */ TrailerOverlayPresenter a;

    public fpy(TrailerOverlayPresenter trailerOverlayPresenter) {
        this.a = trailerOverlayPresenter;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        boolean z = true;
        int i2 = 0;
        if (i != -1) {
            if (i == 0) {
                TrailerOverlayPresenter trailerOverlayPresenter = this.a;
                if (((adob) obj).a() == null) {
                    z = false;
                }
                trailerOverlayPresenter.c = z;
                return null;
            } else if (i == 1) {
                ahhv ahhvVar = (ahhv) obj;
                TrailerOverlayPresenter trailerOverlayPresenter2 = this.a;
                if (trailerOverlayPresenter2.c) {
                    trailerOverlayPresenter2.d.f(true);
                    TrailerOverlayPresenter trailerOverlayPresenter3 = this.a;
                    fpm fpmVar = trailerOverlayPresenter3.d;
                    boolean z2 = ahhvVar.a;
                    int i3 = z2 ? trailerOverlayPresenter3.b : 0;
                    if (z2) {
                        i2 = trailerOverlayPresenter3.a;
                    }
                    fpmVar.i(i3, i2);
                    return null;
                }
                trailerOverlayPresenter2.d.f(!ahhvVar.a);
                this.a.d.i(0, 0);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{adob.class, ahhv.class};
    }
}
