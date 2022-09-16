package com.google.android.apps.youtube.app.player.overlay;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.player.overlay.InlineMutedScrimOverlayRedirectController;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class InlineMutedScrimOverlayRedirectController implements aiby, airt, f {
    public ahhx a;
    public ezx b = ezx.NONE;
    public long c;
    public final ViewGroup d;
    public final View e;
    public final airw f;
    public final axxi g;
    public final InlinePlaybackController h;
    public final Context i;
    public final yye j;
    private final ezh k;
    private final ayor l;
    private final aypf m;

    public InlineMutedScrimOverlayRedirectController(Context context, ViewGroup viewGroup, airw airwVar, axxi axxiVar, InlinePlaybackController inlinePlaybackController, ezh ezhVar, ayor ayorVar) {
        this.i = context;
        this.d = viewGroup;
        viewGroup.getClass();
        this.j = new yye(viewGroup);
        this.e = viewGroup.findViewById(R.id.continue_watching_text);
        this.f = airwVar;
        this.g = axxiVar;
        this.h = inlinePlaybackController;
        this.k = ezhVar;
        ayorVar.getClass();
        this.l = ayorVar;
        this.m = new aypf();
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().d.G(this.l).I().aa(new ayqb() { // from class: kef
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                Long l;
                Boolean bool;
                InlineMutedScrimOverlayRedirectController inlineMutedScrimOverlayRedirectController = InlineMutedScrimOverlayRedirectController.this;
                ahhx ahhxVar = (ahhx) obj;
                Long l2 = 0L;
                if (inlineMutedScrimOverlayRedirectController.b == ezx.INLINE_MINIMAL && inlineMutedScrimOverlayRedirectController.a != null && !inlineMutedScrimOverlayRedirectController.h.w() && ahhxVar.f() > 60000 && TextUtils.equals(inlineMutedScrimOverlayRedirectController.a.i(), ahhxVar.i())) {
                    long g = ahhxVar.g() - inlineMutedScrimOverlayRedirectController.a.g();
                    if (g > 0 && g < 5000) {
                        inlineMutedScrimOverlayRedirectController.c += g;
                    }
                } else {
                    ahhx ahhxVar2 = inlineMutedScrimOverlayRedirectController.a;
                    if (ahhxVar2 != null && !TextUtils.equals(ahhxVar2.i(), ahhxVar.i())) {
                        inlineMutedScrimOverlayRedirectController.c = 0L;
                        inlineMutedScrimOverlayRedirectController.i();
                    }
                }
                inlineMutedScrimOverlayRedirectController.a = ahhxVar;
                aqxe aqxeVar = inlineMutedScrimOverlayRedirectController.g.b.b().C;
                if (aqxeVar == null) {
                    aqxeVar = aqxe.a;
                }
                if (aqxeVar.a(45353146L)) {
                    aoqp aoqpVar = aqxeVar.b;
                    if (!aoqpVar.containsKey(45353146L)) {
                        throw new IllegalArgumentException();
                    }
                    aqxf aqxfVar = (aqxf) aoqpVar.get(45353146L);
                    l = Long.valueOf(aqxfVar.b == 2 ? ((Long) aqxfVar.c).longValue() : 0L);
                } else {
                    l = l2;
                }
                long longValue = l.longValue();
                mda mdaVar = inlineMutedScrimOverlayRedirectController.h.f;
                if (mdaVar == null || mdaVar.a.a().a != arjm.INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED_PAUSE_AFTER_DURATION || longValue <= 0 || inlineMutedScrimOverlayRedirectController.c / 1000 <= longValue) {
                    aqxe aqxeVar2 = inlineMutedScrimOverlayRedirectController.g.b.b().C;
                    if (aqxeVar2 == null) {
                        aqxeVar2 = aqxe.a;
                    }
                    if (aqxeVar2.a(45354250L)) {
                        aoqp aoqpVar2 = aqxeVar2.b;
                        if (!aoqpVar2.containsKey(45354250L)) {
                            throw new IllegalArgumentException();
                        }
                        aqxf aqxfVar2 = (aqxf) aoqpVar2.get(45354250L);
                        l2 = Long.valueOf(aqxfVar2.b == 2 ? ((Long) aqxfVar2.c).longValue() : 0L);
                    }
                    long longValue2 = l2.longValue();
                    mda mdaVar2 = inlineMutedScrimOverlayRedirectController.h.f;
                    if (mdaVar2 == null || mdaVar2.a.a().a != arjm.INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED_REDIRECT_AFTER_DURATION || longValue2 <= 0 || inlineMutedScrimOverlayRedirectController.c / 1000 <= longValue2) {
                        return;
                    }
                    inlineMutedScrimOverlayRedirectController.h.s(amyc.b);
                    return;
                }
                inlineMutedScrimOverlayRedirectController.f.E().a();
                inlineMutedScrimOverlayRedirectController.e.setVisibility(0);
                inlineMutedScrimOverlayRedirectController.d.setVisibility(0);
                inlineMutedScrimOverlayRedirectController.j.c(true);
                aqxe aqxeVar3 = inlineMutedScrimOverlayRedirectController.g.b.b().C;
                if (aqxeVar3 == null) {
                    aqxeVar3 = aqxe.a;
                }
                if (aqxeVar3.a(45354077L)) {
                    aoqp aoqpVar3 = aqxeVar3.b;
                    if (!aoqpVar3.containsKey(45354077L)) {
                        throw new IllegalArgumentException();
                    }
                    aqxf aqxfVar3 = (aqxf) aoqpVar3.get(45354077L);
                    bool = Boolean.valueOf(aqxfVar3.b == 1 ? ((Boolean) aqxfVar3.c).booleanValue() : false);
                } else {
                    bool = false;
                }
                if (!bool.booleanValue()) {
                    return;
                }
                inlineMutedScrimOverlayRedirectController.e.setBackground(new ColorDrawable(zhn.j(inlineMutedScrimOverlayRedirectController.i, R.attr.ytOverlayButtonPrimary).orElse(0)));
            }
        }, jww.k), this.k.h().B().at(new ayqb() { // from class: kee
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                InlineMutedScrimOverlayRedirectController.this.b = (ezx) obj;
            }
        }, jww.k)};
    }

    public final void i() {
        this.d.setVisibility(8);
        this.e.setVisibility(8);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        this.m.qr();
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.aiby
    public final void nt(int i, long j) {
        if (i == 1 || i == 2) {
            this.d.setVisibility(0);
            this.j.c(true);
        } else if (i != 3 && i != 4) {
        } else {
            this.j.b(true);
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.m.g(g(this.f));
    }
}
