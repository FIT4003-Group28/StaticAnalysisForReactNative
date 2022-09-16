package defpackage;

import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import com.google.protos.youtube.api.innertube.MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint;
import com.google.protos.youtube.api.innertube.StickerCatalogEndpointOuterClass$StickerCatalogEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: hpe  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hpe implements Runnable {
    public final /* synthetic */ hpi a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ hpe(hpi hpiVar, boolean z) {
        this.a = hpiVar;
        this.b = z;
    }

    public /* synthetic */ hpe(hpi hpiVar, boolean z, int i) {
        this.c = i;
        this.a = hpiVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            hpi hpiVar = this.a;
            boolean z = this.b;
            if (!hqs.i(hpiVar.j)) {
                return;
            }
            for (Map.Entry entry : hpiVar.c.a.f.entrySet()) {
                apzg apzgVar = ((apoj) entry.getKey()).o;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                if (!apzgVar.qn(StickerCatalogEndpointOuterClass$StickerCatalogEndpoint.stickerCatalogEndpoint)) {
                    apzg apzgVar2 = ((apoj) entry.getKey()).o;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                    if (apzgVar2.qn(MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.multiPageStickerCatalogEndpoint)) {
                    }
                }
                hpu.a((View) entry.getValue(), z);
            }
        } else if (i == 1) {
            hpi hpiVar2 = this.a;
            boolean z2 = this.b;
            if (!hqs.i(hpiVar2.j)) {
                return;
            }
            if (z2) {
                hpiVar2.g.performHapticFeedback(1);
            }
            if (hpiVar2.h.getAnimation() != null && hpiVar2.h.getAnimation().hasStarted() && !hpiVar2.h.getAnimation().hasEnded()) {
                hpiVar2.h.getAnimation().reset();
            }
            float f = true != z2 ? 1.0f : 1.1667f;
            hpiVar2.h.animate().scaleX(f).scaleY(f).setDuration(75L).start();
            TransitionDrawable transitionDrawable = (TransitionDrawable) hpiVar2.h.getBackground();
            if (z2) {
                transitionDrawable.startTransition(75);
                hpiVar2.q.H(3, new acte(actj.UPLOAD_VIDEO_EDITING_DELETE_STICKER_BUTTON), null);
                return;
            }
            transitionDrawable.reverseTransition(75);
        } else {
            hpi hpiVar3 = this.a;
            boolean z3 = this.b;
            if (!hqs.i(hpiVar3.j)) {
                return;
            }
            hpu.a(hpiVar3.c.l, z3);
        }
    }
}
