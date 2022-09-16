package defpackage;

import android.app.Dialog;
import androidx.mediarouter.app.MediaRouteButton;
/* compiled from: PG */
/* renamed from: adfp  reason: default package */
/* loaded from: classes.dex */
public final class adfp implements adfl {
    public static final /* synthetic */ adfp b = new adfp(1);
    private final /* synthetic */ int c;

    public adfp() {
    }

    private /* synthetic */ adfp(int i) {
        this.c = i;
    }

    @Override // defpackage.adfl
    public final aypg a(MediaRouteButton mediaRouteButton) {
        if (this.c == 0) {
            final adfo adfoVar = new adfo(mediaRouteButton);
            MediaRouteButton mediaRouteButton2 = adfoVar.a;
            if (mediaRouteButton2 instanceof adfu) {
                final adfu adfuVar = (adfu) mediaRouteButton2;
                adfoVar.b = adfuVar.h().aG(ayrb.d, ayrb.d, new aypv() { // from class: adfm
                    @Override // defpackage.aypv
                    public final void a() {
                        adfo adfoVar2 = adfo.this;
                        adfu adfuVar2 = adfuVar;
                        Dialog dialog = adfoVar2.c;
                        if (dialog == null || !dialog.isShowing()) {
                            return;
                        }
                        adfuVar2.i();
                        adfoVar2.a.performClick();
                        adfoVar2.c.cancel();
                    }
                }).as(new ayqb() { // from class: adfn
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        adfo adfoVar2 = adfo.this;
                        zhx zhxVar = (zhx) obj;
                        MediaRouteButton mediaRouteButton3 = adfoVar2.a;
                        if (adfoVar2.c == null) {
                            adfoVar2.c = new adgx(mediaRouteButton3.getContext());
                        }
                        if (!adfoVar2.c.isShowing()) {
                            adfoVar2.c.show();
                        }
                    }
                });
            }
            return adfoVar;
        }
        return new adfk();
    }
}
