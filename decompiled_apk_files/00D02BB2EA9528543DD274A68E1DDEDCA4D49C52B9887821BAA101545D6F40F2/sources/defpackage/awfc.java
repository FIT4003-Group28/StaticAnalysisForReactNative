package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: awfc  reason: default package */
/* loaded from: classes3.dex */
public class awfc {
    public final akpm a;
    public final bvjj b;
    public final Paint d;
    public final Paint e;
    public final StaticLayout f;
    public boolean g;
    public final AnimatorSet c = new AnimatorSet();
    @dzsi
    public View h = null;
    @dzsi
    public aliw i = null;
    public int j = 0;
    @dzsi
    public Runnable k = null;

    public awfc(Activity activity, bvjj bvjjVar, akpm akpmVar) {
        this.a = akpmVar;
        this.b = bvjjVar;
        this.g = !bvjjVar.m(bvjk.bI, false);
        Paint paint = new Paint();
        this.d = paint;
        paint.setColor(activity.getResources().getColor(R.color.qu_white_alpha_66));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setColor(activity.getResources().getColor(R.color.primary_grey));
        paint2.setAlpha(165);
        paint2.setStyle(Paint.Style.FILL);
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(activity.getResources().getColor(R.color.quantum_white_text));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, activity.getResources().getDisplayMetrics()));
        textPaint.setAntiAlias(true);
        this.f = new StaticLayout(activity.getString(R.string.REGION_SELECTION_TUTORIAL_HINT), textPaint, (int) (activity.getResources().getDisplayMetrics().widthPixels * 0.8f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c.end();
        c();
    }

    public final ValueAnimator b(int i, int i2, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        int i3 = i2 - i;
        int abs = Math.abs(i3);
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addListener(new awfb(this.a, -i3));
        ofInt.addUpdateListener(animatorUpdateListener);
        ofInt.setDuration(abs * 3);
        return ofInt;
    }

    public final void c() {
        if (!this.g) {
            return;
        }
        this.g = false;
        Runnable runnable = this.k;
        if (runnable != null) {
            runnable.run();
            this.k = null;
        }
        aliw J = this.a.J();
        aliw aliwVar = this.i;
        if (J != null && aliwVar != null) {
            J.o(aliwVar);
        }
        View view = this.h;
        dbsk.s(view);
        view.setClickable(false);
        view.invalidate();
    }
}
