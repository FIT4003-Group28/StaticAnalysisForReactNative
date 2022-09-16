package defpackage;

import android.widget.ImageView;
import com.google.android.libraries.youtube.ads.player.ui.AdCountdownView;
/* compiled from: PG */
/* renamed from: xfg  reason: default package */
/* loaded from: classes4.dex */
public final class xfg {
    public final AdCountdownView a;
    private int b;

    public xfg(AdCountdownView adCountdownView, ajmy ajmyVar) {
        adCountdownView.getClass();
        this.a = adCountdownView;
        adCountdownView.b = new xhw(adCountdownView.d, new ajnj(ajmyVar.b(), adCountdownView.d), adCountdownView.getBackground(), adCountdownView.getAlpha());
        xhn xhnVar = adCountdownView.c;
        ajnj ajnjVar = new ajnj(ajmyVar.b(), xhnVar.b);
        ImageView imageView = xhnVar.b;
        xhnVar.p = new xhw(imageView, ajnjVar, imageView.getBackground(), xhnVar.b.getAlpha());
        this.b = adCountdownView.getVisibility();
        a();
    }

    public final void a() {
        b(false);
        this.a.a();
    }

    public final void b(boolean z) {
        this.a.b(z);
        this.a.setVisibility(this.b);
    }

    public final void c(int i) {
        this.b = i;
        this.a.setVisibility(i);
    }
}
