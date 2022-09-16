package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.ab;
import com.google.android.youtube.R;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class n extends ahyf implements com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g {
    private static final String e = alj.a().b(" · ");
    public aafo a;
    public xig b;
    public Context c;
    public boolean d;
    private FrameLayout f;
    private TextView g;
    private FrameLayout h;
    private View i;
    private TextView j;
    private aicd k;
    private ImageView l;
    private m m;
    private boolean n;
    private boolean o;
    private final aypg p;

    public n(Context context) {
        super(context);
        this.c = context;
        l lVar = new l();
        lVar.a = null;
        lVar.e(false);
        lVar.d(false);
        lVar.g(false);
        lVar.f(false);
        lVar.b = null;
        lVar.c(0);
        lVar.h(0);
        lVar.i(0);
        lVar.b(0);
        lVar.j(0);
        this.m = lVar.a();
        this.p = com.google.android.apps.youtube.embeddedplayer.service.jar.c.a.b.ae(azpj.c()).X(aypa.a()).as(new k(this));
    }

    @Override // defpackage.ahyl
    public final /* bridge */ /* synthetic */ View a(Context context) {
        this.f = new FrameLayout(context);
        LayoutInflater from = LayoutInflater.from(context);
        if (this.d) {
            try {
                from.inflate(R.layout.embedded_ad_overlay, this.f);
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
                sb.append("Unable to inflate LazyEmbeddedAdOverlay: ");
                sb.append(valueOf);
                aqvb.k(sb.toString(), new Object[0]);
                return this.f;
            }
        } else {
            from.inflate(R.layout.embedded_ad_overlay, this.f);
        }
        if (!this.p.e()) {
            ayqi.c((AtomicReference) this.p);
        }
        this.o = true;
        this.g = (TextView) this.f.findViewById(R.id.ad_text);
        this.h = (FrameLayout) this.f.findViewById(R.id.ad_text_and_ad_choices_button);
        View findViewById = this.f.findViewById(R.id.skip_ad_button);
        this.i = findViewById;
        this.j = (TextView) findViewById.findViewById(R.id.skip_ad_text);
        this.l = (ImageView) this.i.findViewById(R.id.skip_ad_icon);
        this.h.setOnClickListener(new i(this, 1));
        this.i.setOnClickListener(new i(this));
        this.i.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                n nVar = n.this;
                if (motionEvent.getAction() == 1) {
                    nVar.b.e((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    return false;
                }
                return false;
            }
        });
        return this.f;
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahyl
    public final /* bridge */ /* synthetic */ void d(Context context, View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        if (!nI()) {
            return;
        }
        if (aa(2) && nI()) {
            if (this.m.c) {
                this.j.setText(this.f.getResources().getString(R.string.skip_ad));
                this.l.setVisibility(0);
            } else {
                this.l.setVisibility(8);
            }
            this.i.setEnabled(this.m.c);
            m mVar = this.m;
            if (mVar.b || !mVar.a) {
                this.i.setVisibility(8);
            } else {
                this.i.setVisibility(0);
            }
        }
        if (aa(4) && nI()) {
            boolean z = this.m.d;
            this.h.setEnabled(z);
            kz.u(this.g, null, null, z ? gw.f(this.f.getResources(), 2131230855, null) : null);
            if (z) {
                this.g.setCompoundDrawablePadding(10);
            }
        }
        if (aa(1)) {
            ((RelativeLayout.LayoutParams) this.i.getLayoutParams()).bottomMargin += this.m.e;
        }
        if (aa(64)) {
            m mVar2 = this.m;
            l(mVar2.g, mVar2.h, mVar2.i);
        }
        if (!aa(32)) {
            return;
        }
        m(this.m.f);
    }

    public final void g(ayos ayosVar) {
        ayosVar.T(new k(this, 1), ab.l);
    }

    @Override // defpackage.ahyf
    public final ahyk kS(Context context) {
        ahyk kS = super.kS(context);
        kS.e = false;
        kS.b();
        kS.a();
        return kS;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void l(int i, int i2, int i3) {
        if (!nI()) {
            l clone = this.m.clone();
            clone.i(i);
            clone.b(i2);
            clone.j(i3);
            this.m = clone.a();
            Y(64);
        } else if (i == -1) {
            this.g.setText(this.f.getResources().getString(R.string.ad_badge));
        } else {
            String i4 = zgh.i(i / 1000);
            if (i3 >= 2) {
                this.g.setText(this.f.getResources().getString(R.string.ad_pod, e, Integer.valueOf(i2), Integer.valueOf(i3), i4));
            } else {
                this.g.setText(this.f.getResources().getString(R.string.ad_normal, e, i4));
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void m(int i) {
        if (!nI()) {
            l clone = this.m.clone();
            clone.h(i);
            this.m = clone.a();
            Y(32);
            return;
        }
        int i2 = (i + 999) / 1000;
        TextView textView = this.j;
        Resources resources = this.f.getResources();
        Integer valueOf = Integer.valueOf(i2);
        textView.setText(resources.getString(R.string.skip_ad_in, valueOf));
        this.j.setContentDescription(this.f.getResources().getQuantityString(R.plurals.accessibility_skip_ad_in, i2, valueOf));
    }

    @Override // defpackage.ahyl
    public final boolean mZ() {
        return this.n;
    }

    @Override // defpackage.ahyf, defpackage.ahyh
    public final boolean nI() {
        return this.o && super.nI();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void o(CharSequence charSequence) {
        l clone = this.m.clone();
        clone.a = charSequence;
        this.m = clone.a();
        Y(8);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void p(Bitmap bitmap) {
        l clone = this.m.clone();
        clone.b = bitmap;
        this.m = clone.a();
        Y(16);
    }

    public final void q(int i) {
        l clone = this.m.clone();
        clone.c(i);
        this.m = clone.a();
        Y(1);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void r(boolean z) {
        l clone = this.m.clone();
        clone.d(z);
        this.m = clone.a();
        Y(2);
    }

    public final void s(aicd aicdVar) {
        aicdVar.getClass();
        aqxo.y(this.k == null);
        this.k = aicdVar;
        aicdVar.a(new i(this, 2));
        this.k.c(8);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void t(xig xigVar) {
        this.b = xigVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void u(boolean z) {
        l clone = this.m.clone();
        clone.f(z);
        this.m = clone.a();
        Y(4);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void v(boolean z) {
        l clone = this.m.clone();
        clone.g(z);
        this.m = clone.a();
        Y(2);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void w(boolean z) {
        l clone = this.m.clone();
        clone.e(z);
        this.m = clone.a();
        Y(2);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void x(boolean z) {
        this.n = z;
        if (z) {
            Z();
            return;
        }
        W();
        aicd aicdVar = this.k;
        if (aicdVar == null) {
            return;
        }
        aicdVar.c(8);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void y(aqxq aqxqVar) {
        Context context = this.c;
        if (context instanceof com.google.android.apps.youtube.embeddedplayer.service.context.b) {
            context = ((com.google.android.apps.youtube.embeddedplayer.service.context.b) context).getBaseContext();
        }
        aafo aafoVar = this.a;
        if (aafoVar != null) {
            ajhb.c(context, aqxqVar, aafoVar, null);
        } else {
            aqvb.k("Unable to show dismissible ads dialog: command router not present.", new Object[0]);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void z(CharSequence charSequence) {
        if (this.k == null) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.f.getResources().getString(R.string.ad_learn_more);
        }
        this.k.b(charSequence);
        this.k.c(0);
    }
}
