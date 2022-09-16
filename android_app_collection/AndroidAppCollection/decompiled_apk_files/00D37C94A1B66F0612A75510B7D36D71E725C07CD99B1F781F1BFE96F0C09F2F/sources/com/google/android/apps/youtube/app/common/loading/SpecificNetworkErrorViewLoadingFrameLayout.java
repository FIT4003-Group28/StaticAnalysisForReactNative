package com.google.android.apps.youtube.app.common.loading;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class SpecificNetworkErrorViewLoadingFrameLayout extends ezj {
    public final Context a;
    public ezo b;
    public ezn c;
    public FrameLayout d;
    public ezl e;
    public acti f;
    public int g;
    public yrj h;
    public jqa i;
    private ezo j;

    public SpecificNetworkErrorViewLoadingFrameLayout(Context context) {
        this(context, R.layout.loading_frame_status_error_view, R.layout.loading_frame_status_progress_view, R.layout.loading_frame_status_empty_view);
    }

    private final void j(int i) {
        this.b = new ezo(this, 4, i, R.id.empty_message_text);
    }

    private final void k(int i) {
        this.c = new ezn(this, i);
    }

    private final void l(int i) {
        this.j = new ezo(this, 1, i, 0);
    }

    public final void c() {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(getContext()).inflate(R.layout.loading_frame_offline_status_view, (ViewGroup) this, false);
        this.d = frameLayout;
        addView(frameLayout);
        jqa jqaVar = this.i;
        FrameLayout frameLayout2 = this.d;
        dt dtVar = (dt) jqaVar.a.get();
        dtVar.getClass();
        fcl fclVar = (fcl) jqaVar.b.get();
        fclVar.getClass();
        akbn akbnVar = (akbn) jqaVar.c.get();
        akbnVar.getClass();
        frameLayout2.getClass();
        this.e = new jpz(dtVar, fclVar, akbnVar, frameLayout2);
    }

    public final void f() {
        h(2);
    }

    public final void g() {
        ylr.c();
        if (!this.h.o()) {
            h(6);
        } else {
            h(1);
        }
    }

    public final void h(int i) {
        if (this.g != i) {
            int i2 = i == 2 ? 0 : 8;
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                getChildAt(i3).setVisibility(i2);
            }
            this.j.f(i);
            this.c.f(i);
            if (i == 5) {
                this.d.setVisibility(0);
                this.e.a(this.f);
            } else if (i != 6) {
                this.d.setVisibility(8);
            } else {
                jpz jpzVar = (jpz) this.e;
                jpzVar.f(true, null);
                ProgressBar progressBar = jpzVar.h;
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                }
                TextView textView = jpzVar.g;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                this.d.setVisibility(0);
            }
            ezo ezoVar = this.b;
            if (ezoVar != null) {
                ezoVar.f(i);
            }
            this.g = i;
        }
    }

    public final void i(ios iosVar) {
        this.c.b = iosVar;
        ezl ezlVar = this.e;
        if (ezlVar != null) {
            ((jpz) ezlVar).k = iosVar;
        }
    }

    public SpecificNetworkErrorViewLoadingFrameLayout(Context context, int i, int i2) {
        super(context);
        this.g = 0;
        context.getClass();
        this.a = context;
        l(i2);
        k(i);
        c();
    }

    public SpecificNetworkErrorViewLoadingFrameLayout(Context context, int i, int i2, int i3) {
        this(context, i, i2);
        j(i3);
    }

    public SpecificNetworkErrorViewLoadingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpecificNetworkErrorViewLoadingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = 0;
        context.getClass();
        this.a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ezk.a, i, 0);
        l(obtainStyledAttributes.getResourceId(2, R.layout.loading_frame_status_progress_view));
        j(obtainStyledAttributes.getResourceId(0, R.layout.loading_frame_status_empty_view));
        k(obtainStyledAttributes.getResourceId(1, R.layout.loading_frame_status_error_view));
        c();
        obtainStyledAttributes.recycle();
        g();
    }
}
