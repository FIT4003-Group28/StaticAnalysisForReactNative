package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.GridLayout;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class HatsContainer extends GridLayout {
    View a;
    ImageView b;
    View c;
    YouTubeTextView d;
    HatsSurvey e;
    public ViewGroup f;
    public boolean g;
    boolean h;
    private fuh i;
    private int j;

    public HatsContainer(Context context) {
        super(context);
        this.h = false;
        this.j = 0;
    }

    public final fuh a() {
        if (this.i == null) {
            this.i = new fuh(this);
        }
        return this.i;
    }

    public final void c() {
        this.j = 0;
        b();
        if (this.h) {
            b();
        }
    }

    public final void d(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public final void e(YouTubeTextView youTubeTextView) {
        YouTubeTextView youTubeTextView2 = this.d;
        if (youTubeTextView2 != null) {
            this.f.removeView(youTubeTextView2);
        }
        this.d = youTubeTextView;
        if (youTubeTextView != null) {
            this.f.addView(youTubeTextView);
            this.d.setOnClickListener(new fug(this));
        }
    }

    public final void f(HatsSurvey hatsSurvey) {
        HatsSurvey hatsSurvey2 = this.e;
        if (hatsSurvey2 != null) {
            this.f.removeView(hatsSurvey2);
        }
        this.e = hatsSurvey;
        if (hatsSurvey != null) {
            this.f.addView(hatsSurvey);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.f = (ViewGroup) findViewById(R.id.hats_content_container);
        this.a = findViewById(R.id.hats_dismiss);
        this.c = findViewById(R.id.hats_expand_spacing);
        ImageView imageView = (ImageView) findViewById(R.id.hats_expand);
        this.b = imageView;
        imageView.setOnClickListener(new fug(this, 1));
    }

    public HatsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = false;
        this.j = 0;
    }

    public HatsContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = false;
        this.j = 0;
    }

    public final void b() {
        if (this.j != 0 || this.d == null) {
            bnr bnrVar = new bnr();
            bnrVar.J(1);
            bnrVar.D(new LinearInterpolator());
            bne bneVar = new bne(2);
            bneVar.b = 75L;
            bneVar.z(this.d);
            bnrVar.f(bneVar);
            bne bneVar2 = new bne(1);
            bneVar2.b = 150L;
            bneVar2.z(this.e);
            bnrVar.f(bneVar2);
            fui fuiVar = new fui();
            fuiVar.b = 300L;
            fuiVar.z(this);
            bnr bnrVar2 = new bnr();
            bnrVar2.J(0);
            bnrVar2.f(bnrVar);
            bnrVar2.f(fuiVar);
            bno.b(this, bnrVar2);
            zag.o(this.b, false);
            zag.o(this.c, false);
            YouTubeTextView youTubeTextView = this.d;
            if (youTubeTextView != null) {
                zag.o(youTubeTextView, false);
            }
            zag.o(this.e, true);
            zag.o(this.a, this.g);
            this.j = 2;
            return;
        }
        zag.o(this.b, true);
        zag.o(this.c, true);
        zag.o(this.d, true);
        zag.o(this.e, false);
        zag.o(this.a, this.g);
        this.j = 1;
    }
}
