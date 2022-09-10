package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.ui.overlay.OverlayView;
/* compiled from: PG */
/* renamed from: cvfh  reason: default package */
/* loaded from: classes5.dex */
public final class cvfh implements cvfd {
    public final OverlayView a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final Runnable c = new cvfg(this);
    private final csuk d;
    private final cuuc e;
    private final ctyy f;

    public cvfh(csuk csukVar, OverlayView overlayView, cuuc cuucVar, ctyy ctyyVar) {
        this.e = cuucVar;
        this.d = csukVar;
        this.a = overlayView;
        this.f = ctyyVar;
    }

    @Override // defpackage.cuvu
    public final void A() {
    }

    @Override // defpackage.cuvu
    public final void B() {
    }

    public final void a(cugu cuguVar) {
        b(cuguVar.k().b());
        csuk csukVar = this.d;
        final ctyy ctyyVar = this.f;
        final ConversationId c = cuguVar.c();
        final String[] strArr = {cuguVar.a()};
        final ctct ctctVar = (ctct) csukVar;
        ctctVar.d.execute(new Runnable(ctctVar, ctyyVar, c, strArr) { // from class: ctbm
            private final ctct a;
            private final ctyy b;
            private final ConversationId c;
            private final String[] d;

            {
                this.a = ctctVar;
                this.b = ctyyVar;
                this.c = c;
                this.d = strArr;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ctct ctctVar2 = this.a;
                ctyy ctyyVar2 = this.b;
                ctctVar2.H(ctyyVar2).i(this.c, this.d);
            }
        });
        this.a.setVisibility(8);
    }

    public final void b(cugq cugqVar) {
        if (cugqVar.a().a()) {
            this.e.a(cugqVar.a().b());
        }
    }

    @Override // defpackage.cuvu
    public final void z() {
    }
}
