package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahvi  reason: default package */
/* loaded from: classes.dex */
public class ahvi extends ahuz {
    public ViewGroup j;
    public TextView k;
    private FrameLayout r;
    private ImageView s;
    private ajmy t;
    private FrameLayout u;

    public ahvi(Context context, CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, aqvc aqvcVar) {
        super(context, creatorEndscreenOverlayPresenter, aqvcVar);
    }

    @Override // defpackage.ahuz
    public final View c() {
        if (this.r == null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.a).inflate(R.layout.endscreen_element_layout_icon, (ViewGroup) this.c.g, false);
            this.r = frameLayout;
            frameLayout.setOnClickListener(this);
            FrameLayout frameLayout2 = (FrameLayout) this.r.findViewById(R.id.image_container);
            this.u = frameLayout2;
            ahuz.e(frameLayout2);
            this.u.addView(d());
            this.j = (ViewGroup) this.r.findViewById(R.id.icon_container);
            this.k = (TextView) this.r.findViewById(R.id.cta_text);
            j();
            f(this.r);
        }
        return this.r;
    }

    @Override // defpackage.ahuz
    public void g(ahvk ahvkVar) {
        super.g(ahvkVar);
        ahvkVar.d.setVisibility(0);
        ajmy ajmyVar = this.t;
        if (ajmyVar != null) {
            ImageView imageView = ahvkVar.d;
            avhn avhnVar = this.b.d;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajmyVar.h(imageView, avhnVar);
        }
        ahvkVar.e.setVisibility(8);
    }

    @Override // defpackage.ahuz
    public final void h(ajmy ajmyVar) {
        super.h(ajmyVar);
        this.t = ajmyVar;
        ImageView k = k();
        avhn avhnVar = this.b.e;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.h(k, avhnVar);
    }

    @Override // defpackage.ahuz
    public final boolean i() {
        return true;
    }

    public void j() {
        this.j.addView(k());
        k().setBackgroundColor(0);
    }

    public final ImageView k() {
        if (this.s == null) {
            this.s = new ImageView(this.a);
            this.s.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.s.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        return this.s;
    }
}
