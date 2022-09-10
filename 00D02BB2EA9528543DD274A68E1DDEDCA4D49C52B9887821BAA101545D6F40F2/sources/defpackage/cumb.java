package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cumb  reason: default package */
/* loaded from: classes5.dex */
public class cumb extends FrameLayout implements cule {
    private final Toolbar a;
    private final TextView b;
    private final TextView c;
    private final ImageView d;
    private final CoordinatorLayout e;
    private final ProgressBar f;
    private final TextView g;

    public cumb(Context context) {
        super(context);
        inflate(getContext(), R.layout.photo_lightbox_layout, this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.a = toolbar;
        this.b = (TextView) findViewById(R.id.toolbar_title);
        this.c = (TextView) findViewById(R.id.toolbar_subtitle);
        this.d = (ImageView) findViewById(R.id.lightbox_photo_image_view);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.lightbox_coordinator_body);
        this.e = coordinatorLayout;
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.lightbox_spinner);
        this.f = progressBar;
        this.g = (TextView) findViewById(R.id.lightbox_permanent_failure_container);
        progressBar.getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        coordinatorLayout.setBackgroundColor(-16777216);
        coordinatorLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: culx
            private final cumb a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.a.j();
            }
        });
        toolbar.setBackgroundColor(akm.c(getContext(), R.color.lightbox_toolbar_color));
        Drawable g = toolbar.g();
        if (g != null) {
            g.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
            toolbar.setOverflowIcon(g);
        }
    }

    @Override // defpackage.cule
    public final void a(Bitmap bitmap) {
        this.d.setImageBitmap(bitmap);
        if (this.a.getChildCount() > 0) {
            this.a.getChildAt(0).sendAccessibilityEvent(8);
        }
    }

    @Override // defpackage.cule
    public final void b(int i) {
        this.a.f().removeItem(i);
    }

    @Override // defpackage.cule
    public final void c() {
        Toolbar toolbar = this.a;
        toolbar.setVisibility(toolbar.getVisibility() == 0 ? 8 : 0);
    }

    @Override // defpackage.cule
    public final boolean d() {
        return this.a.getVisibility() == 0;
    }

    @Override // defpackage.cule
    public final void e() {
        this.f.setVisibility(0);
        this.g.setVisibility(8);
        this.d.setVisibility(8);
    }

    @Override // defpackage.cule
    public final void f() {
        this.f.setVisibility(8);
        this.g.setVisibility(0);
        this.d.setVisibility(8);
    }

    @Override // defpackage.cule
    public final void g() {
        this.f.setVisibility(8);
        this.g.setVisibility(8);
        this.d.setVisibility(0);
    }

    @Override // defpackage.cule
    public final Toolbar h() {
        return this.a;
    }

    @Override // defpackage.cule
    public final MenuItem i(CharSequence charSequence, Drawable drawable, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        MenuItem icon = this.a.f().add(charSequence).setOnMenuItemClickListener(onMenuItemClickListener).setIcon(drawable);
        icon.setShowAsAction(0);
        return icon;
    }

    public final void j() {
        this.d.setMaxHeight(this.e.getHeight());
        this.d.setMaxWidth(this.e.getWidth());
    }

    @Override // defpackage.cuvv
    public void setPresenter(final culd culdVar) {
        ImageView imageView = this.d;
        culdVar.getClass();
        imageView.setOnClickListener(new View.OnClickListener(culdVar) { // from class: culz
            private final culd a;

            {
                this.a = culdVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b();
            }
        });
        Toolbar toolbar = this.a;
        culdVar.getClass();
        toolbar.setNavigationOnClickListener(new View.OnClickListener(culdVar) { // from class: cuma
            private final culd a;

            {
                this.a = culdVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a(view);
            }
        });
    }

    @Override // defpackage.cule
    public void setSubtitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    @Override // defpackage.cule
    public void setTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public cumb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public cumb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), R.layout.photo_lightbox_layout, this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.a = toolbar;
        this.b = (TextView) findViewById(R.id.toolbar_title);
        this.c = (TextView) findViewById(R.id.toolbar_subtitle);
        this.d = (ImageView) findViewById(R.id.lightbox_photo_image_view);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.lightbox_coordinator_body);
        this.e = coordinatorLayout;
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.lightbox_spinner);
        this.f = progressBar;
        this.g = (TextView) findViewById(R.id.lightbox_permanent_failure_container);
        progressBar.getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        coordinatorLayout.setBackgroundColor(-16777216);
        coordinatorLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: culy
            private final cumb a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                this.a.j();
            }
        });
        toolbar.setBackgroundColor(akm.c(getContext(), R.color.lightbox_toolbar_color));
        Drawable g = toolbar.g();
        if (g != null) {
            g.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
            toolbar.setOverflowIcon(g);
        }
    }
}
