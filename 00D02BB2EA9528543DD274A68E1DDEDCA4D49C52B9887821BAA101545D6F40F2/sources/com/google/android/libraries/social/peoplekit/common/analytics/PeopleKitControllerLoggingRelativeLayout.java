package com.google.android.libraries.social.peoplekit.common.analytics;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PeopleKitControllerLoggingRelativeLayout extends RelativeLayout {
    private cxqo a;
    private PeopleKitVisualElementPath b;
    private boolean c;

    public PeopleKitControllerLoggingRelativeLayout(Context context) {
        super(context);
        this.c = true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.a != null && motionEvent.getAction() == 0 && this.c) {
            cxqo cxqoVar = this.a;
            PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath.a(new czhc(dhjm.E));
            peopleKitVisualElementPath.c(this.b);
            cxqoVar.d(4, peopleKitVisualElementPath);
            this.c = false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setUp(cxqo cxqoVar, PeopleKitVisualElementPath peopleKitVisualElementPath) {
        this.a = cxqoVar;
        this.b = peopleKitVisualElementPath;
        PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath2.a(new czhc(dhjm.E));
        peopleKitVisualElementPath2.c(peopleKitVisualElementPath);
        cxqoVar.d(-1, peopleKitVisualElementPath2);
    }

    public PeopleKitControllerLoggingRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = true;
    }

    public PeopleKitControllerLoggingRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = true;
    }
}
