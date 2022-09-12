package com.google.android.libraries.messaging.lighter.ui.overlay;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.messaging.lighter.ui.overlay.OverlayView;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class OverlayView extends FrameLayout implements cuvv {
    final LinearLayout a;
    public final CardView b;
    public final FrameLayout.LayoutParams c;
    public final FrameLayout.LayoutParams d;
    public final int e;
    private final ImageView f;
    private final TextView g;
    private final LinearLayout h;
    private final ImageView i;
    private final FrameLayout.LayoutParams j;

    public OverlayView(Context context) {
        this(context, null);
    }

    private static boolean e(dbsg<String> dbsgVar) {
        return dbsgVar.a() && !dbsgVar.b().isEmpty();
    }

    private static void f(View view, boolean z) {
        view.setVisibility(true != z ? 4 : 0);
    }

    private static boolean g(View view) {
        return view.getVisibility() == 0;
    }

    public final void a(cugq cugqVar, boolean z) {
        this.a.removeAllViews();
        this.a.setVisibility(8);
        if (z) {
            this.j.topMargin = getContext().getResources().getDimensionPixelSize(R.dimen.overlay_card_view_top_margin);
        } else {
            this.j.topMargin = getContext().getResources().getDimensionPixelSize(R.dimen.overlay_card_view_top_collapsed_margin);
        }
        this.b.setLayoutParams(this.j);
        setClickable(false);
        setVisibility(0);
        setBackgroundColor(akm.c(getContext(), R.color.overlay_background_transparent_color));
        d(cugqVar);
    }

    public final void b(cugq cugqVar) {
        if (cugqVar.h()) {
            postDelayed(new Runnable(this) { // from class: cvfi
                private final OverlayView a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c();
                }
            }, 100L);
        } else {
            c();
        }
    }

    public final void c() {
        requestFocus();
        sendAccessibilityEvent(32768);
    }

    public final void d(cugq cugqVar) {
        boolean z = cugqVar.c().a() && cugqVar.c().b().a().length != 0;
        if (z) {
            setLighterIcon(cugqVar.c().b());
        } else if (cugqVar.b().a()) {
            setIconView(cugqVar.b().b().G());
        }
        if (e(cugqVar.d())) {
            setTextView(cugqVar.d().b());
        }
        f(this.f, z);
        f(this.g, e(cugqVar.d()));
        f(this.i, !cugqVar.g());
        if (g(this.f) || g(this.g) || g(this.i)) {
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(8);
        }
    }

    public void setContentView(View view) {
        this.a.removeAllViews();
        this.a.addView(view);
        this.a.setVisibility(0);
    }

    public void setDismissOnClickListener(cugq cugqVar, View.OnClickListener onClickListener) {
        if (g(this.i)) {
            this.i.setOnClickListener(onClickListener);
        }
        if (!cugqVar.h()) {
            setClickable(false);
            this.b.setClickable(false);
            return;
        }
        setOnClickListener(onClickListener);
        this.b.setClickable(false);
        this.b.setOnClickListener(null);
    }

    public void setIconView(byte[] bArr) {
        this.f.setImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    public void setLighterIcon(cugd cugdVar) {
        ViewGroup.LayoutParams layoutParams = this.f.getLayoutParams();
        layoutParams.height = cuwg.a(getContext(), cugdVar.c());
        layoutParams.width = cuwg.a(getContext(), cugdVar.b());
        this.f.setLayoutParams(layoutParams);
        this.f.setImageBitmap(BitmapFactory.decodeByteArray(cugdVar.a(), 0, cugdVar.a().length));
        this.f.setContentDescription(cugdVar.e());
    }

    @Override // defpackage.cuvv
    public void setPresenter(cvfd cvfdVar) {
    }

    public void setTextView(String str) {
        this.g.setText(str);
    }

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.j = layoutParams;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        this.c = layoutParams2;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        this.d = layoutParams3;
        inflate(getContext(), R.layout.overlay_layout, this);
        this.f = (ImageView) findViewById(R.id.display_icon);
        this.g = (TextView) findViewById(R.id.title);
        this.a = (LinearLayout) findViewById(R.id.overlay_content);
        this.b = (CardView) findViewById(R.id.overlay_card_view);
        this.h = (LinearLayout) findViewById(R.id.overlay_header);
        this.i = (ImageView) findViewById(R.id.dismiss_button);
        layoutParams.setMargins(getResources().getDimensionPixelSize(R.dimen.overlay_card_view_left_right_margin), getResources().getDimensionPixelSize(R.dimen.overlay_card_view_top_margin), getResources().getDimensionPixelSize(R.dimen.overlay_card_view_left_right_margin), getResources().getDimensionPixelSize(R.dimen.overlay_card_view_bottom_margin));
        layoutParams.gravity = 0;
        layoutParams2.setMargins(getResources().getDimensionPixelSize(R.dimen.overlay_card_view_left_right_margin), 0, getResources().getDimensionPixelSize(R.dimen.overlay_card_view_left_right_margin), 0);
        layoutParams2.gravity = 17;
        layoutParams3.gravity = 80;
        this.e = getResources().getDimensionPixelSize(R.dimen.overlay_card_view_corner_radius);
    }
}
