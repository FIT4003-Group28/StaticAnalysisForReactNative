package defpackage;

import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.features.overlay.live.LiveOverlayPresenter;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ahzs  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ahzs implements ayqb {
    public final /* synthetic */ LiveOverlayPresenter a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahzs(LiveOverlayPresenter liveOverlayPresenter) {
        this.a = liveOverlayPresenter;
    }

    public /* synthetic */ ahzs(LiveOverlayPresenter liveOverlayPresenter, int i) {
        this.b = i;
        this.a = liveOverlayPresenter;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        asur i;
        int i2 = this.b;
        if (i2 == 0) {
            this.a.j((ahgn) obj);
            return;
        }
        boolean z = true;
        if (i2 == 1) {
            LiveOverlayPresenter liveOverlayPresenter = this.a;
            ajff ajffVar = (ajff) ((Pair) obj).first;
            if (ajffVar == null || ajffVar.c() == null || (i = LiveOverlayPresenter.i(ajffVar.c().t())) == null || liveOverlayPresenter.i != null) {
                return;
            }
            liveOverlayPresenter.i = i;
            liveOverlayPresenter.r();
        } else if (i2 == 2) {
            this.a.m((ahhw) obj);
        } else if (i2 == 3) {
            this.a.n((ahhx) obj);
        } else if (i2 == 4) {
            this.a.o((ahia) obj);
        } else if (i2 != 5) {
            LiveOverlayPresenter liveOverlayPresenter2 = this.a;
            asaa asaaVar = (asaa) obj;
            if (LiveOverlayPresenter.i(asaaVar) == null && !liveOverlayPresenter2.l) {
                return;
            }
            if (!liveOverlayPresenter2.l) {
                liveOverlayPresenter2.i = LiveOverlayPresenter.i(asaaVar);
            }
            if (liveOverlayPresenter2.i != null) {
                if (liveOverlayPresenter2.l) {
                    liveOverlayPresenter2.r();
                } else {
                    liveOverlayPresenter2.q();
                    liveOverlayPresenter2.r();
                }
            }
            asur asurVar = liveOverlayPresenter2.i;
            if (asurVar == null) {
                return;
            }
            asuq asuqVar = asurVar.h;
            if (asuqVar == null) {
                asuqVar = asuq.a;
            }
            if (!asuqVar.b) {
                return;
            }
            ahzm ahzmVar = liveOverlayPresenter2.a;
            asuq asuqVar2 = asurVar.h;
            if (asuqVar2 == null) {
                asuqVar2 = asuq.a;
            }
            ahzmVar.o(asuqVar2.c);
        } else {
            LiveOverlayPresenter liveOverlayPresenter3 = this.a;
            if (((ahic) obj).a().a() != 3) {
                z = false;
            }
            liveOverlayPresenter3.l = z;
            if (z) {
                PlayerResponseModel playerResponseModel = liveOverlayPresenter3.m;
                if (playerResponseModel != null) {
                    liveOverlayPresenter3.i = LiveOverlayPresenter.i(playerResponseModel.t());
                }
                aypg aypgVar = liveOverlayPresenter3.j;
                if (aypgVar != null && !aypgVar.e()) {
                    azof.f((AtomicReference) liveOverlayPresenter3.j);
                }
                liveOverlayPresenter3.j = liveOverlayPresenter3.e.c.n().G(azpj.b(liveOverlayPresenter3.d)).Z(liveOverlayPresenter3.f);
            }
            liveOverlayPresenter3.a.r(liveOverlayPresenter3.l);
        }
    }
}
