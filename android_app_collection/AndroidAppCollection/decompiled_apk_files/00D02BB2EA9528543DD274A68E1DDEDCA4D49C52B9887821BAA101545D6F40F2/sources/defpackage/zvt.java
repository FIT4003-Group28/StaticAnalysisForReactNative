package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Calendar;
/* compiled from: PG */
/* renamed from: zvt  reason: default package */
/* loaded from: classes7.dex */
public final class zvt extends FrameLayout implements View.OnClickListener, bbb {
    public final int a;
    public final ArrayList<TextView> b;
    private final int c;
    private final ViewPager d;
    private final ImageButton e;
    private final ImageButton f;
    @dzsi
    private zvs g;
    @dzsi
    private zvr h;
    private final Calendar i;
    private int j;
    private int k;

    public zvt(Context context) {
        this(context, null);
    }

    private final void f() {
        int i;
        int i2;
        if (this.k != 0 || (i = this.j) == (i2 = this.c)) {
            return;
        }
        g(i - i2);
    }

    private final void g(int i) {
        this.i.add(5, i);
        h();
        i();
    }

    private final void h() {
        e(this.i, this.b.get(this.c));
        this.d.setCurrentItem(this.c, false);
        this.j = this.c;
        this.k = 0;
        for (int i = 0; i < this.a; i++) {
            if (i != this.c) {
                Calendar calendar = (Calendar) this.i.clone();
                calendar.add(5, i - this.c);
                e(calendar, this.b.get(i));
            }
        }
        this.d.invalidate();
    }

    private final void i() {
        zvr zvrVar = this.h;
        if (zvrVar != null) {
            zvrVar.a(this.i.get(1), this.i.get(2), this.i.get(5));
        }
    }

    @Override // defpackage.bbb
    public final void a(int i, float f, int i2) {
    }

    @Override // defpackage.bbb
    public final void b(int i) {
        this.j = i;
        f();
    }

    @Override // defpackage.bbb
    public final void c(int i) {
        this.k = i;
        f();
    }

    public final void d() {
        if (this.k == 2) {
            g(this.j - this.c);
        }
    }

    final void e(Calendar calendar, TextView textView) {
        textView.setText(bvsk.b(getContext(), calendar, 98326));
        textView.setContentDescription(bvsk.f(getContext(), calendar));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.e) {
            d();
            this.d.setCurrentItem(this.c - 1);
        } else if (view == this.f) {
            d();
            this.d.setCurrentItem(this.c + 1);
        } else {
            zvs zvsVar = this.g;
            if (zvsVar == null) {
                return;
            }
            zvsVar.a(this.i.get(1), this.i.get(2), this.i.get(5));
        }
    }

    public void setDate(int i, int i2, int i3) {
        if (i == this.i.get(1) && i2 == this.i.get(2) && i3 == this.i.get(5)) {
            return;
        }
        this.i.set(i, i2, i3);
        h();
        i();
    }

    public void setOnDateChangedListener(@dzsi zvr zvrVar) {
        this.h = zvrVar;
    }

    public void setOnDateClickListener(@dzsi zvs zvsVar) {
        this.g = zvsVar;
    }

    public zvt(Context context, @dzsi AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public zvt(Context context, @dzsi AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, pxp.a);
        int i2 = obtainStyledAttributes.getInt(0, 30);
        this.a = i2;
        obtainStyledAttributes.recycle();
        dbsk.e(i2 >= 3, "numberOfPageBuffers should be greater than or equal to 3. But it was %s", i2);
        int i3 = i2 / 2;
        this.c = i3;
        this.j = i3;
        this.k = 0;
        this.i = Calendar.getInstance();
        this.b = dchl.f(i2);
        for (int i4 = 0; i4 < this.a; i4++) {
            TextView textView = (TextView) View.inflate(context, R.layout.directions_swipeabledatepicker_internal_date_text, null);
            textView.setOnClickListener(this);
            this.b.add(textView);
        }
        View.inflate(context, R.layout.directions_swipeabledatepicker_content, this);
        ViewPager viewPager = (ViewPager) findViewById(R.id.date_pager);
        this.d = viewPager;
        ImageButton imageButton = (ImageButton) findViewById(R.id.previous_button);
        this.e = imageButton;
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.forward_button);
        this.f = imageButton2;
        viewPager.setAdapter(new zvq(this));
        viewPager.setOnPageChangeListener(this);
        viewPager.setCurrentItem(this.c, false);
        h();
        cjxu.e(imageButton);
        cjxu.e(imageButton2);
        imageButton.setOnClickListener(this);
        imageButton2.setOnClickListener(this);
    }

    public void setDate(jej jejVar) {
        setDate(jejVar.a, jejVar.b, jejVar.c);
    }
}
