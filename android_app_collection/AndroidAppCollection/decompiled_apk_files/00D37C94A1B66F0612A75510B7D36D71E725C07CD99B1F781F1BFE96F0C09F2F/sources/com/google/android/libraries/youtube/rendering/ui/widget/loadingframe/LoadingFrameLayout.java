package com.google.android.libraries.youtube.rendering.ui.widget.loadingframe;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class LoadingFrameLayout extends FrameLayout {
    private akgk a;
    private akgi b;
    public final Context c;
    public akgk d;
    public int e;

    public LoadingFrameLayout(Context context) {
        this(context, R.layout.loading_frame_status_error_view, R.layout.loading_frame_status_progress_view, R.layout.loading_frame_status_empty_view);
    }

    private final void d(int i) {
        this.a = new akgk(this, 4, i, R.id.empty_message_text);
    }

    private final void j(int i) {
        this.d = new akgk(this, 1, i, 0);
    }

    private final void k(int i) {
        if (this.e != i) {
            int i2 = i == 2 ? 0 : 8;
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                getChildAt(i3).setVisibility(i2);
            }
            this.d.e(i);
            this.b.e(i);
            akgk akgkVar = this.a;
            if (akgkVar != null) {
                akgkVar.e(i);
            }
            this.e = i;
        }
    }

    public void a() {
        k(2);
    }

    public void b(CharSequence charSequence, boolean z) {
        this.b.d(charSequence);
        this.b.c(z);
        k(3);
    }

    public void c() {
        ylr.c();
        k(1);
    }

    public final void e() {
        k(0);
    }

    public final void f(akgj akgjVar) {
        this.b.a = akgjVar;
    }

    public final void g(int i) {
        this.b = new akgi(this, i);
    }

    public final void h(CharSequence charSequence) {
        akgk akgkVar = this.a;
        akgkVar.getClass();
        akgkVar.d(charSequence);
        k(4);
    }

    public final void i(CharSequence charSequence, int i) {
        this.b.d(charSequence);
        this.b.c(true);
        this.b.b(i);
        k(3);
    }

    public LoadingFrameLayout(Context context, int i, int i2) {
        super(context);
        this.e = 0;
        context.getClass();
        this.c = context;
        j(i2);
        g(i);
    }

    public LoadingFrameLayout(Context context, int i, int i2, int i3) {
        this(context, i, i2);
        d(i3);
    }

    public LoadingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = 0;
        context.getClass();
        this.c = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, akgl.a, i, 0);
        j(obtainStyledAttributes.getResourceId(2, R.layout.loading_frame_status_progress_view));
        d(obtainStyledAttributes.getResourceId(0, R.layout.loading_frame_status_empty_view));
        g(obtainStyledAttributes.getResourceId(1, R.layout.loading_frame_status_error_view));
        obtainStyledAttributes.recycle();
        c();
    }
}
