package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kjd  reason: default package */
/* loaded from: classes3.dex */
public final class kjd implements ffu {
    public final long a;
    public final kbd b;
    public final acti c;
    public final aafo d;
    public final ahwz k;
    public final axxu l;
    public kcb m;
    public ampq n;
    public final kij o;
    private final khf p;
    public final azpm e = azpm.e();
    public final azpm f = azpm.e();
    public final azpm g = azpm.e();
    public final azpm i = azpm.e();
    public final azpm j = azpm.e();
    public final azpm h = azpm.e();

    public kjd(ahwz ahwzVar, acti actiVar, aafo aafoVar, axxu axxuVar, khf khfVar, kij kijVar, long j, kbd kbdVar) {
        this.p = khfVar;
        this.k = ahwzVar;
        this.o = kijVar;
        this.a = j;
        this.b = kbdVar;
        this.c = actiVar;
        this.d = aafoVar;
        this.l = axxuVar;
        khfVar.a(new khe() { // from class: kiz
            @Override // defpackage.khe
            public final void a(View view) {
                kjd kjdVar = kjd.this;
                if (kjdVar.m != null) {
                    return;
                }
                kjdVar.m = new kcb(new yye((TextView) view.findViewById(R.id.time_bar_current_time), kjdVar.a, 4), new yye((TextView) view.findViewById(R.id.time_bar_total_time), kjdVar.a, 4), new yye((TextView) view.findViewById(R.id.time_bar_live_label), kjdVar.a, 8), new yye(view.findViewById(R.id.timestamps_container), kjdVar.a, 4), new yye((TextView) view.findViewById(R.id.time_bar_chapter_title), kjdVar.a, 8), kjdVar.k, kjdVar.b, kjdVar.c, kjdVar.d, kjdVar.l);
                kjdVar.m.i((ayoi) ((ampv) kjdVar.n).a);
                kjdVar.m.a(false);
                azpm azpmVar = kjdVar.e;
                kcb kcbVar = kjdVar.m;
                kcbVar.getClass();
                azpmVar.as(new kja(kcbVar, 3));
                azpm azpmVar2 = kjdVar.f;
                kcb kcbVar2 = kjdVar.m;
                kcbVar2.getClass();
                azpmVar2.as(new kja(kcbVar2, 2));
                azpm azpmVar3 = kjdVar.g;
                kcb kcbVar3 = kjdVar.m;
                kcbVar3.getClass();
                azpmVar3.as(new kja(kcbVar3, 4));
                azpm azpmVar4 = kjdVar.i;
                kcb kcbVar4 = kjdVar.m;
                kcbVar4.getClass();
                azpmVar4.as(new kja(kcbVar4));
                kjdVar.j.as(new kjb(kjdVar, 1));
                kjdVar.h.as(new kjb(kjdVar));
                final YouTubeControlsOverlay youTubeControlsOverlay = kjdVar.o.a;
                youTubeControlsOverlay.p = (TextView) youTubeControlsOverlay.l.findViewById(R.id.time_bar_live_label);
                youTubeControlsOverlay.p.setOnClickListener(new View.OnClickListener() { // from class: kib
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        YouTubeControlsOverlay youTubeControlsOverlay2 = YouTubeControlsOverlay.this;
                        if (!ControlsOverlayStyle.c(youTubeControlsOverlay2.z)) {
                            youTubeControlsOverlay2.c.a();
                            youTubeControlsOverlay2.g.r(youTubeControlsOverlay2.u);
                            youTubeControlsOverlay2.o.g(true);
                        }
                    }
                });
                youTubeControlsOverlay.N.as(new kic(youTubeControlsOverlay, 10));
                kix kixVar = youTubeControlsOverlay.n;
                View view2 = youTubeControlsOverlay.k;
                kixVar.h.g(view2.findViewById(R.id.fullscreen_button));
                kixVar.h.g(view2.findViewById(R.id.time_bar_live_label));
                if (kixVar.i) {
                    kixVar.h.g(view2.findViewById(R.id.time_bar_chapter_title));
                }
                kixVar.h.t(view2.findViewById(R.id.time_bar_reference_view));
                youTubeControlsOverlay.n.nS(youTubeControlsOverlay.w, youTubeControlsOverlay.v, youTubeControlsOverlay.u, youTubeControlsOverlay.x);
            }
        });
    }

    @Override // defpackage.ffu
    public final void a(boolean z) {
        kcb kcbVar = this.m;
        if (kcbVar == null) {
            return;
        }
        kcbVar.a(z);
    }

    @Override // defpackage.ffu
    public final void b(boolean z) {
        this.f.c(Boolean.valueOf(z));
    }

    @Override // defpackage.ffu
    public final void d(boolean z) {
        this.g.c(Boolean.valueOf(z));
    }

    @Override // defpackage.ffu
    public final void e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.j.c(new kjc(charSequence, charSequence2, charSequence3));
    }

    @Override // defpackage.ffu
    public final void f(boolean z) {
        if (this.g.aM() && ((Boolean) this.g.aJ()).booleanValue()) {
            this.p.b();
        }
        kcb kcbVar = this.m;
        if (kcbVar == null) {
            return;
        }
        kcbVar.f(z);
    }

    @Override // defpackage.ffu
    public final void g(boolean z) {
        kcb kcbVar = this.m;
        if (kcbVar != null) {
            kcbVar.g(z);
        }
    }

    @Override // defpackage.ffu
    public final void nE(boolean z) {
        this.e.c(Boolean.valueOf(z));
    }
}
