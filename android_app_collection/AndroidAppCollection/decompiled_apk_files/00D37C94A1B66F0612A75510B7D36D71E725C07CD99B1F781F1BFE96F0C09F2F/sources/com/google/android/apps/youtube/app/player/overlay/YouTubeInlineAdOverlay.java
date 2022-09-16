package com.google.android.apps.youtube.app.player.overlay;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.ads.player.ui.AdCountdownView;
import com.google.android.libraries.youtube.ads.player.ui.AdProgressTextView;
import com.google.android.libraries.youtube.ads.player.ui.BrandInteractionView;
import com.google.android.libraries.youtube.ads.player.ui.SkipAdButton;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class YouTubeInlineAdOverlay extends ahyf implements xfk, fgd, f, ynl {
    public final ghd a;
    public final kdy b;
    public final kip c;
    public final aizb d;
    private final xid e;
    private final ajmy f;
    private final acti g;
    private final ezh h;
    private final akbn i;
    private final yni j;
    private final aadd k;
    private ken l;

    public YouTubeInlineAdOverlay(Activity activity, ghd ghdVar, acti actiVar, ajmy ajmyVar, ezh ezhVar, aafo aafoVar, wzx wzxVar, aizb aizbVar, akbn akbnVar, ken kenVar, ImageView imageView, aice aiceVar, yni yniVar, aadd aaddVar) {
        super(activity);
        this.a = ghdVar;
        ezhVar.getClass();
        this.h = ezhVar;
        aizbVar.getClass();
        this.d = aizbVar;
        ajmyVar.getClass();
        this.f = ajmyVar;
        this.g = actiVar;
        this.i = akbnVar;
        this.c = new kip();
        this.l = kenVar;
        this.j = yniVar;
        this.k = aaddVar;
        this.e = new xid(activity, aafoVar, actiVar);
        kdy kdyVar = new kdy(new xif(activity), actiVar, wzxVar);
        this.b = kdyVar;
        xhy xhyVar = kdyVar.g;
        imageView.getClass();
        boolean z = true;
        aqxo.y(xhyVar.a == null);
        xhyVar.a = imageView;
        xhyVar.a.setVisibility(8);
        imageView.setOnClickListener(new kdv(kdyVar));
        xif xifVar = kdyVar.a;
        aiceVar.getClass();
        aqxo.y(xifVar.a != null ? false : z);
        xifVar.a = aiceVar;
        xifVar.a.a(new xie(xifVar));
        xifVar.a.c(8);
    }

    private final void g() {
        this.b.qV(this.c.a);
        kdy kdyVar = this.b;
        boolean mZ = mZ();
        if (kdyVar.m) {
            if (mZ) {
                kdyVar.f.b(null, null, null);
            } else {
                kdyVar.f.b(null, null, null);
            }
        }
    }

    @Override // defpackage.ahyl
    public final /* bridge */ /* synthetic */ View a(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        LayoutInflater.from(context).inflate(R.layout.inline_ad_overlay, relativeLayout);
        TextView textView = (TextView) relativeLayout.findViewById(R.id.ad_reengagement_view);
        xib xibVar = new xib(this.i.a(textView), this.g);
        xibVar.c(textView);
        this.e.c((BrandInteractionView) relativeLayout.findViewById(R.id.brand_interaction_view));
        apdq a = xrz.a(this.k);
        boolean z = false;
        boolean z2 = a != null && a.r;
        apdq a2 = xrz.a(this.k);
        if (a2 != null && a2.s) {
            z = true;
        }
        final xia xiaVar = new xia(z2, z);
        xiaVar.c((AdProgressTextView) relativeLayout.findViewById(R.id.ad_progress_text));
        SkipAdButton skipAdButton = (SkipAdButton) relativeLayout.findViewById(R.id.skip_ad_button);
        skipAdButton.b(true);
        AdCountdownView adCountdownView = (AdCountdownView) relativeLayout.findViewById(R.id.ad_countdown);
        xhn xhnVar = adCountdownView.c;
        xhnVar.c.setTextColor(ake.d(xhnVar.a, R.color.skip_ad_button_high_contrast_foreground_color));
        xfg xfgVar = new xfg(adCountdownView, this.f);
        ken kenVar = this.l;
        View findViewById = relativeLayout.findViewById(R.id.video_metadata_container);
        kenVar.c = (TextView) findViewById.findViewById(R.id.title);
        kenVar.d = (TextView) findViewById.findViewById(R.id.author);
        kenVar.a = findViewById.findViewById(R.id.channel_thumbnail_container);
        kenVar.b = (ImageView) kenVar.a.findViewById(R.id.channel_thumbnail);
        kenVar.f = new yye(findViewById, 200L, 8);
        this.l.a(this.h.g().b());
        final kdy kdyVar = this.b;
        xid xidVar = this.e;
        ken kenVar2 = this.l;
        aqxo.z(!kdyVar.m, "Can only be initialized once");
        kdyVar.i = xibVar;
        kdyVar.j = xidVar;
        xidVar.a = kdyVar.k;
        kenVar2.getClass();
        kdyVar.f = kenVar2;
        kdyVar.e = new kem(kenVar2);
        kdyVar.d = xiaVar;
        skipAdButton.setOnTouchListener(new kdx(kdyVar));
        skipAdButton.setOnClickListener(new kdv(kdyVar, 1));
        ((AdProgressTextView) xiaVar.c).setOnClickListener(new View.OnClickListener() { // from class: kdw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kdy kdyVar2 = kdy.this;
                xia xiaVar2 = xiaVar;
                kdyVar2.k.getClass();
                if (!xiaVar2.e || !((AdProgressTextView) xiaVar2.c).a.a) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("menu_as_bottom_sheet", true);
                kdyVar2.k.a(bundle);
            }
        });
        xfs xfsVar = new xfs(xfgVar, skipAdButton);
        kdyVar.h = new xih(kdyVar.b, kdyVar.c);
        kdyVar.h.c(xfsVar);
        kdyVar.m = true;
        relativeLayout.addOnLayoutChangeListener(new kio(this));
        return relativeLayout;
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahyl
    public final /* bridge */ /* synthetic */ void d(Context context, View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        if (aa(2)) {
            kdy kdyVar = this.b;
            boolean z = this.c.c;
            if (kdyVar.l != z) {
                kdyVar.l = z;
                xif xifVar = kdyVar.a;
                int i = 8;
                if (xifVar.g != z) {
                    xifVar.g = z;
                    int i2 = true != xif.a(xifVar.h, xifVar.i, z) ? 8 : 0;
                    aice aiceVar = xifVar.a;
                    if (aiceVar != null && ((xhe) xifVar.b).b) {
                        aiceVar.c(i2);
                    }
                }
                if (kdyVar.m) {
                    xih xihVar = kdyVar.h;
                    if (xihVar.e && xihVar.a != z) {
                        xihVar.a = z;
                        xhr xhrVar = (xhr) xihVar.c;
                        xhi xhiVar = (xhi) xihVar.b;
                        xhrVar.j(xhiVar.d, z || xhiVar.e);
                    }
                    kdyVar.g.a(z);
                    kdyVar.i.a = z;
                    xid xidVar = kdyVar.j;
                    xidVar.g = z;
                    if (xidVar.e) {
                        if (true == xid.g(xidVar.f, z)) {
                            i = 0;
                        }
                        ((BrandInteractionView) xidVar.c).setVisibility(i);
                    }
                }
            }
            this.l.a(this.c.d);
        }
        if (aa(1)) {
            g();
        }
        if (aa(4)) {
            ken kenVar = this.l;
            boolean z2 = this.c.b;
            if (kenVar.e == z2) {
                return;
            }
            kenVar.e = z2;
            kenVar.f.a(z2, false);
        }
    }

    @Override // defpackage.fgd
    public final void h(ezx ezxVar) {
        boolean z = true;
        if (!ezxVar.k() && !ezxVar.e()) {
            z = false;
        }
        kip kipVar = this.c;
        if (kipVar.c == z && kipVar.d == ezxVar.b()) {
            return;
        }
        kip kipVar2 = this.c;
        kipVar2.c = z;
        kipVar2.d = ezxVar.b();
        Y(2);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                kip kipVar = this.c;
                boolean z = kipVar.b;
                boolean z2 = ((ahhv) obj).a;
                if (z == z2) {
                    return null;
                }
                kipVar.b = z2;
                Y(4);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhv.class};
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.fgd
    public final boolean mY(ezx ezxVar) {
        return etk.f(ezxVar);
    }

    @Override // defpackage.ahyl
    public final boolean mZ() {
        return this.c.a();
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        this.j.m(this);
    }

    @Override // defpackage.xfk
    public final void nR(xig xigVar) {
        this.b.nR(xigVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahyf
    public final void na(int i) {
        acti actiVar;
        if (i == 0) {
            acti actiVar2 = this.g;
            if (actiVar2 != null) {
                actiVar2.q(new acte(this.c.a.j), this.c.a.k);
            }
            g();
        } else if (i != 2 || (actiVar = this.g) == null) {
        } else {
            actiVar.u(new acte(this.c.a.j), this.c.a.k);
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.j.g(this);
    }

    @Override // defpackage.xfk
    public final void qV(xgu xguVar) {
        kip kipVar = this.c;
        kipVar.a = xguVar;
        kdy kdyVar = this.b;
        xhe xheVar = xguVar.f;
        boolean a = kipVar.a();
        if (kdyVar.m) {
            xif xifVar = kdyVar.a;
            xifVar.h = a;
            xifVar.e(xheVar, a);
        }
        if (mZ()) {
            kU();
        } else {
            kdy kdyVar2 = this.b;
            if (kdyVar2.m) {
                kdyVar2.g.e(false, false);
            }
            super.kT();
        }
        Y(1);
    }
}
