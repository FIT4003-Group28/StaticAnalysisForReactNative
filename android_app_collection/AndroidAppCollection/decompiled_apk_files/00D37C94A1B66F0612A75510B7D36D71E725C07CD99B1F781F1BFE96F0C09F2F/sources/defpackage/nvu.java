package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nvu  reason: default package */
/* loaded from: classes3.dex */
public final class nvu {
    public final ImageView a;
    public final ProgressBar b;
    public final nvw c;
    public Drawable d;
    public Drawable e;
    public Drawable f;
    private Drawable g;
    private Drawable h;
    private Drawable i;

    public nvu(ImageView imageView, ProgressBar progressBar, nvw nvwVar) {
        this.a = imageView;
        this.b = progressBar;
        this.c = nvwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        boolean z = true;
        this.a.setEnabled(true);
        this.a.setOnClickListener(new nvt(this, 2));
        this.b.setVisibility(8);
        if (i == 1) {
            if (this.i == null) {
                this.i = akf.a(this.a.getContext(), 2131233271);
            }
            b(this.i, R.string.accessibility_pause);
        } else if (i == 2) {
            if (this.g == null) {
                this.g = akf.a(this.a.getContext(), 2131233273);
            }
            b(this.g, R.string.accessibility_play);
        } else if (i == 3) {
            if (this.h == null) {
                this.h = akf.a(this.a.getContext(), 2131233312);
            }
            b(this.h, R.string.accessibility_replay);
        } else if (i == 4) {
            z = false;
        }
        zag.o(this.a, z);
    }

    public final void b(Drawable drawable, int i) {
        this.a.setImageDrawable(drawable);
        ImageView imageView = this.a;
        imageView.setContentDescription(imageView.getContext().getText(i));
    }

    public final void c(int i, int i2) {
        this.b.setMax(i);
        this.b.setProgress(i2);
    }
}
