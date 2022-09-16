package com.google.android.apps.youtube.app.watch.engagementpanel.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class InterceptTouchListenerLinearLayout extends LinearLayout {
    private nts a;

    public InterceptTouchListenerLinearLayout(Context context) {
        super(context);
    }

    public final void a(nts ntsVar) {
        this.a = ntsVar;
        setOnTouchListener(ntsVar);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        nts ntsVar = this.a;
        if (ntsVar != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            return false;
                        }
                    } else if (nsy.a(((nsy) ntsVar).a, motionEvent)) {
                        return true;
                    }
                }
                nsy nsyVar = (nsy) ntsVar;
                if (!nsy.a(nsyVar.a, motionEvent)) {
                    nsyVar.a.f();
                }
                return true;
            }
            ((nsy) ntsVar).a.g(motionEvent);
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public InterceptTouchListenerLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InterceptTouchListenerLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
