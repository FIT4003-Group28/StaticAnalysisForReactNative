package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: kdr  reason: default package */
/* loaded from: classes3.dex */
public final class kdr extends kbg implements View.OnClickListener, View.OnLongClickListener, aigm, kbk {
    public ImageView b;
    public boolean c;
    private final aigl d;
    private final Set e;
    private final acti f;
    private final khf g;
    private boolean h;
    private final kii i;

    public kdr(aigl aiglVar, acti actiVar, khd khdVar, khf khfVar, kii kiiVar) {
        this.d = aiglVar;
        HashSet hashSet = new HashSet();
        this.e = hashSet;
        this.f = actiVar;
        this.g = khfVar;
        this.i = kiiVar;
        aiglVar.c.a(this);
        khfVar.a(new khe() { // from class: kdq
            @Override // defpackage.khe
            public final void a(View view) {
                kdr kdrVar = kdr.this;
                if (kdrVar.b != null) {
                    return;
                }
                kdrVar.b = (ImageView) view.findViewById(R.id.hide_controls_button_top);
                kdrVar.b.setOnClickListener(kdrVar);
            }
        });
        khdVar.getClass();
        hashSet.add(new kdp(khdVar));
    }

    private final void x(boolean z) {
        for (kdp kdpVar : this.e) {
            khd khdVar = kdpVar.a;
            khdVar.h = z;
            khdVar.a();
        }
    }

    @Override // defpackage.kbg
    protected final void a(boolean z) {
        x(false);
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void b(boolean z) {
    }

    @Override // defpackage.aigm
    public final void e(float f, boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void i(ControlsOverlayStyle controlsOverlayStyle) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void j(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void k(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void l(ezx ezxVar) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void m(boolean z) {
    }

    @Override // defpackage.aigm
    public final void nF(int i, int i2, int i3) {
        u();
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nG(zbb zbbVar) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nL(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nx(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void od(ControlsState controlsState) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void oe(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void og(boolean z) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        YouTubeControlsOverlay youTubeControlsOverlay = this.i.a;
        if (youTubeControlsOverlay.t != 0) {
            youTubeControlsOverlay.B();
            youTubeControlsOverlay.R();
        }
        this.f.H(3, new acte(actj.ACCESSIBILITY_PLAYER_CONTROLS_CLOSE_BUTTON), null);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return false;
    }

    @Override // defpackage.kbk
    public final void p(boolean z) {
        this.h = z;
        u();
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // defpackage.kbg
    protected final void t(boolean z) {
        this.g.b();
        x(true);
        this.f.n(new acte(actj.ACCESSIBILITY_PLAYER_CONTROLS_CLOSE_BUTTON));
    }

    @Override // defpackage.kbg
    protected final boolean w(boolean z) {
        return !this.d.c.d() && !this.c && this.h;
    }
}
