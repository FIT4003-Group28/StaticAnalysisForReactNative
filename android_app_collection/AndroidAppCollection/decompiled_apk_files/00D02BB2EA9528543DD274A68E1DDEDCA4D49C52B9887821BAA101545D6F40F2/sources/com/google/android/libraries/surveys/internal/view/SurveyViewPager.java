package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.maps.R;
import com.google.android.libraries.surveys.internal.view.SurveyViewPager;
/* compiled from: PG */
/* loaded from: classes.dex */
public class SurveyViewPager extends ViewPager {
    public SurveyViewPager(Context context) {
        super(context);
        C();
    }

    private final void C() {
        final czsl czslVar = new czsl(this);
        h(czslVar);
        post(new Runnable(this, czslVar) { // from class: czsj
            private final SurveyViewPager a;
            private final bbf b;

            {
                this.a = this;
                this.b = czslVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.b.b(this.a.e());
            }
        });
    }

    public final void A() {
        setCurrentItem(c().OV() - 1, true);
        B().i();
    }

    public final czpi B() {
        if (!(getContext() instanceof ff)) {
            return null;
        }
        int e = e();
        for (fd fdVar : ((ff) getContext()).g().q()) {
            if (czsm.s(fdVar) == e && (fdVar instanceof czpi)) {
                return (czpi) fdVar;
            }
        }
        return null;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        switch (keyCode) {
            case 19:
            case 20:
            case 21:
            case 22:
                return false;
            default:
                switch (keyCode) {
                    case 268:
                    case 269:
                    case 270:
                    case 271:
                        return false;
                    default:
                        return super.dispatchKeyEvent(keyEvent);
                }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onMeasure(int i, int i2) {
        if (getChildCount() == 0) {
            super.onMeasure(i, i2);
        }
        View view = c() == null ? null : B().P;
        if (view == null) {
            super.onMeasure(i, i2);
            return;
        }
        int i3 = 0;
        view.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = view.getMeasuredHeight();
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        if (!czov.a(dyed.a.a().a(czov.a))) {
            int height = rect.height();
            int height2 = view.findViewById(R.id.survey_question_header_logo_text).getHeight();
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.survey_bottom_padding);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(measuredHeight, (height - height2) - (dimensionPixelSize + dimensionPixelSize)), 1073741824));
            return;
        }
        int height3 = rect.height();
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.survey_answer_min_height_for_scrolling);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.survey_bottom_padding);
        View findViewById = ((ff) getContext()).findViewById(R.id.survey_controls_container);
        if (findViewById != null) {
            i3 = findViewById.getHeight();
        }
        int i4 = dimensionPixelSize3 + dimensionPixelSize3 + i3;
        int height4 = (height3 - view.findViewById(R.id.survey_question_header_logo_text).getHeight()) - i4;
        if (measuredHeight + i4 > height3 && height4 > dimensionPixelSize2) {
            measuredHeight = height3 - i4;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean y() {
        if (!czov.a(dyed.b(czov.a))) {
            return e() == c().OV() + (-2);
        }
        czsm czsmVar = (czsm) c();
        if (czsmVar == null) {
            return false;
        }
        return e() == c().OV() - (czsmVar.b == cznv.CARD ? 2 : 1);
    }

    public final boolean z() {
        return e() == 0;
    }

    public SurveyViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C();
    }
}
