package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateLifecycleController;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: mcj  reason: default package */
/* loaded from: classes3.dex */
public final class mcj implements fze {
    private final airr a;
    private final InlinePlaybackLifecycleController b;
    private final aadd c;
    private final Handler d;
    private final ActiveStateLifecycleController e;
    private ggt f;
    private Runnable g;

    public mcj(aadd aaddVar, airr airrVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, Handler handler, ActiveStateLifecycleController activeStateLifecycleController) {
        this.c = aaddVar;
        this.a = airrVar;
        this.b = inlinePlaybackLifecycleController;
        this.d = handler;
        this.e = activeStateLifecycleController;
    }

    private final boolean c(ggt ggtVar) {
        ggt ggtVar2 = this.f;
        return ggtVar2 != null && (ggtVar2 == ggtVar || ggtVar2.k(ggtVar));
    }

    public final void a(ggt ggtVar, Map map) {
        if (!c(ggtVar) || !ggtVar.j()) {
            return;
        }
        aadd aaddVar = this.c;
        airr airrVar = this.a;
        map.put("ALLOW_RELOAD", true);
        map.put("PLAYBACK_START_DESCRIPTOR_MUTATOR", new mcw(airrVar, aaddVar));
    }

    public final boolean b(ggt ggtVar, final aafo aafoVar, final acti actiVar, Map map, ajrn ajrnVar) {
        boolean z;
        if (c(ggtVar)) {
            final HashMap hashMap = new HashMap();
            hashMap.putAll(map);
            ajrnVar.oq(hashMap);
            hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", actiVar);
            final apzg c = ggtVar.c();
            this.g = new Runnable() { // from class: mci
                @Override // java.lang.Runnable
                public final void run() {
                    acti actiVar2 = acti.this;
                    apzg apzgVar = c;
                    aafoVar.c(actiVar2.f(apzgVar), hashMap);
                }
            };
            z = true;
        } else {
            z = false;
        }
        this.b.o();
        ActiveStateLifecycleController activeStateLifecycleController = this.e;
        aypg aypgVar = activeStateLifecycleController.e;
        if (aypgVar != null && !aypgVar.e()) {
            ayqi.c((AtomicReference) activeStateLifecycleController.e);
        }
        activeStateLifecycleController.e = activeStateLifecycleController.g(fxr.INACTIVE).Q();
        return z;
    }

    @Override // defpackage.fze
    public final void lh(fyp fypVar, int i) {
        if (i == 1) {
            this.f = null;
        } else if (i == 2) {
            this.f = fypVar.b;
        } else if (i != 0) {
        } else {
            Runnable runnable = this.g;
            if (runnable != null) {
                this.d.post(runnable);
                this.g = null;
            }
            this.f = null;
        }
    }
}
