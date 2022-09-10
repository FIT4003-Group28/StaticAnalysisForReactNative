package defpackage;

import android.view.View;
import com.google.android.libraries.surveys.internal.view.SurveyViewPager;
/* compiled from: PG */
/* renamed from: czsl  reason: default package */
/* loaded from: classes5.dex */
public final class czsl extends bbf {
    final /* synthetic */ SurveyViewPager a;

    public czsl(SurveyViewPager surveyViewPager) {
        this.a = surveyViewPager;
    }

    @Override // defpackage.bbf, defpackage.bbb
    public final void b(int i) {
        this.a.invalidate();
        czpi B = this.a.B();
        if (B != null) {
            B.f();
            B.i();
            View view = B.P;
            if (view != null) {
                view.sendAccessibilityEvent(32);
            }
        }
        this.a.requestLayout();
    }
}
