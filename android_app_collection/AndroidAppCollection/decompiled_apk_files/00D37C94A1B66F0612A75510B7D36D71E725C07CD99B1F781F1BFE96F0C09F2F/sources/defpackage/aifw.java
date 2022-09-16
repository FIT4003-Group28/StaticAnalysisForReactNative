package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.quickseek.overlay.CircularClipTapBloomView;
import com.google.android.libraries.youtube.player.features.quickseek.overlay.TapBloomView;
import com.google.android.youtube.R;
import j$.time.Duration;
/* compiled from: PG */
/* renamed from: aifw  reason: default package */
/* loaded from: classes.dex */
public final class aifw {
    private static final Duration g = Duration.ofMillis(200);
    private static final Duration h = Duration.ofMillis(200);
    private static final Duration i = Duration.ofMillis(200);
    public aigd a;
    public LinearLayout b;
    public final View c;
    public final aifv d;
    public yye e;
    public yye f;
    private aiga j;
    private aifq k;
    private boolean l;
    private final aifs m;
    private ViewStub n;
    private boolean o;
    private yye p;

    public aifw(View view, ViewStub viewStub, aifv aifvVar, aifs aifsVar) {
        this.c = view;
        this.n = viewStub;
        this.d = aifvVar;
        this.m = aifsVar;
        if (viewStub == null) {
            a();
        }
    }

    public final void a() {
        if (this.o) {
            return;
        }
        ViewStub viewStub = this.n;
        if (viewStub != null) {
            viewStub.inflate();
            this.n = null;
        }
        int integer = this.c.getResources().getInteger(R.integer.fade_duration_fast);
        this.p = new yye((CircularClipTapBloomView) this.c.findViewById(R.id.tap_bloom_view));
        this.f = new yye((TextView) this.c.findViewById(R.id.fast_forward_rewind_hint_text), integer, 8);
        aiga aigaVar = new aiga((TapBloomView) this.p.b, 650, 0);
        this.j = aigaVar;
        aigaVar.a().addListener(new aifu(this));
        aigc a = aigd.a();
        a.c(g);
        Duration duration = i;
        a.b(amuk.t(aigb.a(0.0f, 1.0f, duration), aigb.a(1.0f, 1.0f, h), aigb.a(1.0f, 0.0f, duration)));
        a.d(amuk.t(this.c.findViewById(R.id.swipe_triangle_left), this.c.findViewById(R.id.swipe_triangle_mid), this.c.findViewById(R.id.swipe_triangle_right)));
        this.a = a.a();
        yye yyeVar = new yye((ImageView) this.c.findViewById(R.id.dark_background));
        this.e = yyeVar;
        yyeVar.e = 300L;
        yyeVar.d = 200L;
        this.b = (LinearLayout) this.c.findViewById(R.id.fast_forward_rewind_triangles);
        aifq aifqVar = new aifq(this.c.findViewById(R.id.user_education_view), this.m);
        this.k = aifqVar;
        aifqVar.f = this.l;
        this.o = true;
    }

    public final void b() {
        this.e.b(true);
        this.p.b(true);
        this.f.b(true);
        this.d.J();
    }

    public final void c(boolean z) {
        this.l = z;
        if (this.o) {
            this.k.f = z;
        }
    }

    public final void d(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        this.c.addOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    public final void e(CharSequence charSequence, aifr aifrVar, boolean z) {
        a();
        int i2 = aifrVar.b;
        int i3 = i2 == 1 ? 1 : 0;
        ((CircularClipTapBloomView) this.p.b).invalidate();
        ((TextView) this.f.b).setText(charSequence);
        float width = z ? 0.0f : this.c.getWidth() * 0.25f;
        ((TextView) this.f.b).setWidth(this.c.getWidth() / 2);
        ((TextView) this.f.b).setTranslationX(i3 != 0 ? width : -width);
        LinearLayout linearLayout = this.b;
        if (i3 == 0) {
            width = -width;
        }
        linearLayout.setTranslationX(width);
        this.b.setScaleX(i2 == 1 ? 1.0f : -1.0f);
        CircularClipTapBloomView circularClipTapBloomView = (CircularClipTapBloomView) this.p.b;
        circularClipTapBloomView.a = i3;
        circularClipTapBloomView.a(z);
        this.d.I();
        this.e.c(true);
        this.j.b((int) aifrVar.a.getX(), (int) aifrVar.a.getY());
        this.a.c();
        this.p.c(true);
        this.f.c(true);
    }

    public final void f(boolean z) {
        g(z, 0);
    }

    public final void g(boolean z, int i2) {
        String quantityString;
        a();
        if (z) {
            final aifq aifqVar = this.k;
            if (!aifqVar.h) {
                int integer = aifqVar.d.getResources().getInteger(R.integer.fade_duration_fast);
                aifqVar.g = (TextView) aifqVar.d.findViewById(R.id.user_education_text_view);
                aifqVar.i = new yye((ViewGroup) aifqVar.d.findViewById(R.id.user_education_view), integer, 8);
                aifqVar.b = aifqVar.a(R.id.user_education_triangle_left3, R.id.user_education_triangle_left2, R.id.user_education_triangle_left1);
                aifqVar.c = aifqVar.a(R.id.user_education_triangle_right3, R.id.user_education_triangle_right2, R.id.user_education_triangle_right1);
                aifqVar.h = true;
            }
            TextView textView = aifqVar.g;
            aifs aifsVar = aifqVar.e;
            if (i2 != 1) {
                int seconds = (int) aifsVar.a().getSeconds();
                quantityString = aifsVar.a.getQuantityString(R.plurals.user_education_quick_seek, seconds, Integer.valueOf(seconds));
            } else {
                quantityString = aifsVar.a.getString(R.string.chapter_seek_education_text);
            }
            textView.setText(quantityString);
            aifqVar.i.c(true);
            aifqVar.i.h(new zas() { // from class: aifn
                @Override // defpackage.zas
                public final void nH(int i3, yye yyeVar) {
                    aifq aifqVar2 = aifq.this;
                    if (i3 == 2) {
                        aifqVar2.b();
                    }
                }
            });
            return;
        }
        aifq aifqVar2 = this.k;
        if (!aifqVar2.h) {
            return;
        }
        aifqVar2.i.b(true);
        aifqVar2.b.b();
        aifqVar2.c.b();
        aifqVar2.g.removeCallbacks(new aifo(aifqVar2));
    }
}
