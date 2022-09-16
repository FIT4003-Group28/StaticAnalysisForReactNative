package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.player.overlay.InteractiveInlineMutedControlsOverlay;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: kep  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kep implements View.OnClickListener {
    public final /* synthetic */ InteractiveInlineMutedControlsOverlay a;
    private final /* synthetic */ int b;

    public /* synthetic */ kep(InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay) {
        this.a = interactiveInlineMutedControlsOverlay;
    }

    public /* synthetic */ kep(InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay, int i) {
        this.b = i;
        this.a = interactiveInlineMutedControlsOverlay;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mda mdaVar;
        int i = this.b;
        if (i == 0) {
            InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay = this.a;
            interactiveInlineMutedControlsOverlay.f.oi().H(3, InteractiveInlineMutedControlsOverlay.b, null);
            HashMap hashMap = new HashMap();
            hashMap.put("force_fullscreen", Boolean.valueOf(interactiveInlineMutedControlsOverlay.B()));
            hashMap.put("OVERRIDE_EXIT_FULLSCREEN_TO_MAXIMIZED", Boolean.valueOf(((Boolean) interactiveInlineMutedControlsOverlay.G.c().b(jvb.j).e(false)).booleanValue()));
            interactiveInlineMutedControlsOverlay.e.s(hashMap);
        } else if (i == 1) {
            InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay2 = this.a;
            interactiveInlineMutedControlsOverlay2.f.oi().H(3, InteractiveInlineMutedControlsOverlay.c, null);
            InlinePlaybackController inlinePlaybackController = interactiveInlineMutedControlsOverlay2.e;
            if (inlinePlaybackController.a.g().d() && (mdaVar = inlinePlaybackController.f) != null && mdaVar.d() && inlinePlaybackController.b.u()) {
                mda mdaVar2 = inlinePlaybackController.f;
                if (mdaVar2.d) {
                    if (mdaVar2.c) {
                        mdaVar2.b.t();
                        mdaVar2.d = false;
                    }
                } else if (mdaVar2.c) {
                    mdaVar2.b.n();
                    mdaVar2.d = true;
                }
            }
            ggt ggtVar = interactiveInlineMutedControlsOverlay2.G.c;
            String f = ggtVar != null ? ggtVar.f() : "";
            if (interactiveInlineMutedControlsOverlay2.e.w()) {
                interactiveInlineMutedControlsOverlay2.i.c = f;
            } else {
                interactiveInlineMutedControlsOverlay2.i.b = f;
            }
            interactiveInlineMutedControlsOverlay2.z();
        } else {
            InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay3 = this.a;
            boolean z = !interactiveInlineMutedControlsOverlay3.A();
            acti oi = interactiveInlineMutedControlsOverlay3.f.oi();
            aopa createBuilder = asjj.a.createBuilder();
            aopa createBuilder2 = askc.a.createBuilder();
            createBuilder2.copyOnWrite();
            askc askcVar = (askc) createBuilder2.instance;
            askcVar.b |= 2;
            askcVar.d = z;
            createBuilder.copyOnWrite();
            asjj asjjVar = (asjj) createBuilder.instance;
            askc askcVar2 = (askc) createBuilder2.mo39build();
            askcVar2.getClass();
            asjjVar.H = askcVar2;
            asjjVar.c |= 134217728;
            oi.H(3, InteractiveInlineMutedControlsOverlay.a, (asjj) createBuilder.mo39build());
            interactiveInlineMutedControlsOverlay3.e.u(z);
            if (z) {
                interactiveInlineMutedControlsOverlay3.z();
            } else {
                interactiveInlineMutedControlsOverlay3.l.resetTransition();
            }
        }
    }
}
