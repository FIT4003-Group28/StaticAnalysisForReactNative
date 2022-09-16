package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.PersistableBundle;
import android.text.SpannableString;
import android.text.style.TtsSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import com.google.android.libraries.youtube.edit.ui.SegmentedControl;
import com.google.android.libraries.youtube.edit.ui.SegmentedControlSegment;
import com.google.android.youtube.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: gxx  reason: default package */
/* loaded from: classes3.dex */
public final class gxx implements View.OnClickListener, zyh {
    public final SegmentedControl a;
    public float b;
    public gxu c;
    private final Context d;
    private final EditorButtonView e;
    private final ArrayList f;
    private final gyq g;
    private final CharSequence h;

    public gxx(Context context, EditorButtonView editorButtonView, SegmentedControl segmentedControl, gyq gyqVar) {
        context.getClass();
        this.d = context;
        editorButtonView.getClass();
        this.e = editorButtonView;
        editorButtonView.setOnClickListener(this);
        this.h = editorButtonView.getContentDescription();
        ArrayList arrayList = new ArrayList();
        Resources resources = context.getResources();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.shorts_speed_control_speed_very_slow, typedValue, true);
        float f = typedValue.getFloat();
        gxv a = gxw.a();
        a.e(f);
        a.b(resources.getString(R.string.shorts_speed_control_very_slow_label));
        a.f(resources.getString(R.string.shorts_speed_control_very_slow_text));
        a.d(R.drawable.ic_speed_0_3x_fill);
        a.c(b(resources, f));
        arrayList.add(a.a());
        resources.getValue(R.dimen.shorts_speed_control_speed_slow, typedValue, true);
        float f2 = typedValue.getFloat();
        gxv a2 = gxw.a();
        a2.e(f2);
        a2.b(resources.getString(R.string.shorts_speed_control_slow_label));
        a2.f(resources.getString(R.string.shorts_speed_control_slow_text));
        a2.d(R.drawable.ic_speed_0_5x_fill);
        a2.c(b(resources, f2));
        arrayList.add(a2.a());
        resources.getValue(R.dimen.shorts_speed_control_speed_normal, typedValue, true);
        this.b = typedValue.getFloat();
        gxv a3 = gxw.a();
        a3.e(this.b);
        a3.b(resources.getString(R.string.shorts_speed_control_normal_label));
        a3.f(resources.getString(R.string.shorts_speed_control_normal_text));
        a3.d(R.drawable.ic_speed_1x_fill);
        a3.c(b(resources, this.b));
        arrayList.add(a3.a());
        resources.getValue(R.dimen.shorts_speed_control_speed_fast, typedValue, true);
        float f3 = typedValue.getFloat();
        gxv a4 = gxw.a();
        a4.e(f3);
        a4.b(resources.getString(R.string.shorts_speed_control_fast_label));
        a4.f(resources.getString(R.string.shorts_speed_control_fast_text));
        a4.d(R.drawable.ic_speed_2x_fill);
        a4.c(b(resources, f3));
        arrayList.add(a4.a());
        resources.getValue(R.dimen.shorts_speed_control_speed_very_fast, typedValue, true);
        float f4 = typedValue.getFloat();
        gxv a5 = gxw.a();
        a5.e(f4);
        a5.b(resources.getString(R.string.shorts_speed_control_very_fast_label));
        a5.f(resources.getString(R.string.shorts_speed_control_very_fast_text));
        a5.d(R.drawable.ic_speed_3x_fill);
        a5.c(b(resources, f4));
        arrayList.add(a5.a());
        this.f = arrayList;
        segmentedControl.getClass();
        this.a = segmentedControl;
        segmentedControl.h = arrayList;
        this.g = gyqVar;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            SegmentedControlSegment segmentedControlSegment = (SegmentedControlSegment) LayoutInflater.from(context).inflate(R.layout.shorts_camera_speed_template, (ViewGroup) null);
            gxw gxwVar = (gxw) obj;
            SpannableString spannableString = new SpannableString(gxwVar.c);
            spannableString.setSpan(new TtsSpan("android.type.verbatim", PersistableBundle.EMPTY), spannableString.length() - 1, spannableString.length(), 33);
            segmentedControlSegment.setText(spannableString);
            segmentedControlSegment.setTextOff(spannableString);
            segmentedControlSegment.setTextOn(spannableString);
            segmentedControlSegment.setContentDescription(gxwVar.e);
            if (gxwVar.a == this.b) {
                segmentedControlSegment.setChecked(true);
            }
            this.a.addView(segmentedControlSegment);
        }
        this.a.post(new Runnable() { // from class: gxt
            @Override // java.lang.Runnable
            public final void run() {
                gxx.this.a.setVisibility(8);
            }
        });
        this.a.g = this;
    }

    static String b(Resources resources, float f) {
        if (f % 1.0f == 0.0f) {
            return resources.getString(R.string.shorts_a11y_speed_control_variable_speed_whole_seconds_x, Integer.valueOf((int) f));
        }
        return resources.getString(R.string.shorts_a11y_speed_control_variable_speed_tenth_seconds_x, Float.valueOf(f));
    }

    private static void h(View view) {
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight());
    }

    public final gxw a() {
        int i = this.a.d;
        if (i >= 0) {
            return (gxw) this.f.get(i);
        }
        return null;
    }

    public final void c() {
        gxw a = a();
        if (a != null && a.a == this.b) {
            e(R.drawable.ic_speed_1x_stroke);
        }
        h(this.a);
        gyy.e(this.a, false);
        gyq gyqVar = this.g;
        if (gyqVar != null) {
            gyqVar.a(actj.SHORTS_CREATION_SPEED_CONTROL_SELECTOR).d();
        }
    }

    @Override // defpackage.zyh
    public final void d(int i) {
        gyq gyqVar = this.g;
        if (gyqVar != null) {
            gyqVar.a(actj.SHORTS_CREATION_SPEED_CONTROL_SELECTOR).b();
        }
        gxw gxwVar = (gxw) this.f.get(i);
        e(gxwVar.d);
        if (gxwVar.a != this.b) {
            this.e.setContentDescription(gxwVar.e);
        } else {
            this.e.setContentDescription(this.h);
        }
        gxu gxuVar = this.c;
        if (gxuVar != null) {
            gxk gxkVar = (gxk) gxuVar;
            gwj.a(gxkVar.aE, gxwVar.b, gxkVar.aw);
            gxkVar.aq.e = gxwVar.a;
        }
    }

    final void e(int i) {
        this.e.a(i);
    }

    public final void f() {
        gxw a = a();
        if (a != null && a.a == this.b) {
            e(a.d);
        }
        h(this.a);
        gyy.e(this.a, true);
        gyq gyqVar = this.g;
        if (gyqVar != null) {
            gyqVar.a(actj.SHORTS_CREATION_SPEED_CONTROL_SELECTOR).e();
        }
    }

    @Override // defpackage.zyh
    public final void lM() {
        if (this.a.getVisibility() == 0) {
            f();
        } else {
            c();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.e) {
            gyq gyqVar = this.g;
            if (gyqVar != null) {
                gyqVar.a(actj.SHORTS_CREATION_SPEED_CONTROL_BUTTON).b();
            }
            if (this.a.getVisibility() == 0) {
                c();
            } else {
                f();
            }
        }
    }
}
