package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahvb  reason: default package */
/* loaded from: classes.dex */
public class ahvb extends ahuz {
    private FrameLayout j;
    private CircularImageView k;
    private ajmy r;
    private FrameLayout s;

    public ahvb(Context context, CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, aqvc aqvcVar) {
        super(context, creatorEndscreenOverlayPresenter, aqvcVar);
    }

    @Override // defpackage.ahuz
    public final View c() {
        if (this.j == null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.a).inflate(R.layout.endscreen_element_layout_circle, (ViewGroup) this.c.g, false);
            this.j = frameLayout;
            frameLayout.setOnClickListener(this);
            FrameLayout frameLayout2 = (FrameLayout) this.j.findViewById(R.id.image_container);
            this.s = frameLayout2;
            frameLayout2.addView(d(), 0);
            FrameLayout frameLayout3 = this.s;
            ahuz.e(frameLayout3);
            frameLayout3.setOutlineProvider(new ahva());
            frameLayout3.setClipToOutline(true);
            f(this.j);
        }
        return this.j;
    }

    @Override // defpackage.ahuz
    public final ImageView d() {
        if (this.k == null) {
            CircularImageView circularImageView = new CircularImageView(this.a, null);
            this.k = circularImageView;
            circularImageView.setBackgroundDrawable(new ColorDrawable(ake.d(this.a, R.color.endscreen_element_border_color)));
        }
        return this.k;
    }

    @Override // defpackage.ahuz
    public void g(ahvk ahvkVar) {
        super.g(ahvkVar);
        ahvkVar.e.setVisibility(0);
        ajmy ajmyVar = this.r;
        if (ajmyVar != null) {
            ImageView imageView = ahvkVar.e;
            avhn avhnVar = this.b.d;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajmyVar.h(imageView, avhnVar);
        }
        ahvkVar.d.setVisibility(8);
    }

    @Override // defpackage.ahuz
    public final void h(ajmy ajmyVar) {
        super.h(ajmyVar);
        this.r = ajmyVar;
    }

    @Override // defpackage.ahuz
    public final boolean i() {
        return true;
    }
}
