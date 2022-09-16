package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class m extends ahyf {
    public TextView a;
    public TextView b;
    public l c;
    public aypg d;
    public com.google.android.apps.youtube.embeddedplayer.service.model.d e;
    public aypg f;
    public boolean g;
    private FrameLayout h;
    private boolean i;

    public m(Context context) {
        super(context);
    }

    @Override // defpackage.ahyl
    public final /* bridge */ /* synthetic */ View a(Context context) {
        this.h = new FrameLayout(context);
        LayoutInflater from = LayoutInflater.from(context);
        if (this.g) {
            try {
                from.inflate(R.layout.preview_to_player_transition_overlay, this.h);
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                sb.append("Unable to inflate LazyPreviewThumbnailOverlay: ");
                sb.append(valueOf);
                aqvb.k(sb.toString(), new Object[0]);
                return this.h;
            }
        } else {
            from.inflate(R.layout.preview_to_player_transition_overlay, this.h);
        }
        if (!this.f.e()) {
            ayqi.c((AtomicReference) this.f);
        }
        this.i = true;
        this.a = (TextView) this.h.findViewById(R.id.embed_title);
        this.b = (TextView) this.h.findViewById(R.id.embed_subtitle);
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.preview_to_player_fade_animation);
        l lVar = new l((ImageView) this.h.findViewById(R.id.embed_preview_thumbnail), loadAnimation);
        loadAnimation.setAnimationListener(lVar);
        this.c = lVar;
        kT();
        return this.h;
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
        this.a.setText(this.e.b);
        this.b.setText(this.e.c);
        Bitmap bitmap = this.e.d;
        if (bitmap != null) {
            this.c.a.setImageBitmap(bitmap);
        }
        if (aa(2)) {
            this.a.setVisibility(0);
            this.b.setVisibility(0);
        }
        if (!aa(1)) {
            return;
        }
        l lVar = this.c;
        lVar.a.clearAnimation();
        lVar.a.setAlpha(lVar.c);
        lVar.a.setVisibility(0);
    }

    public final void g() {
        super.Z();
        Y(2);
    }

    @Override // defpackage.ahyf
    public final ahyk kS(Context context) {
        ahyk kS = super.kS(context);
        kS.e = false;
        kS.b();
        kS.a();
        return kS;
    }

    @Override // defpackage.ahyf
    public final void kT() {
        super.W();
        if (nI()) {
            this.a.setVisibility(8);
            this.b.setVisibility(8);
            l lVar = this.c;
            lVar.a.clearAnimation();
            lVar.a.setVisibility(8);
        }
    }

    public final void l() {
        super.Z();
        Y(1);
    }

    @Override // defpackage.ahyl
    public final boolean mZ() {
        return this.e != null;
    }

    @Override // defpackage.ahyf, defpackage.ahyh
    public final boolean nI() {
        return this.i && super.nI();
    }
}
