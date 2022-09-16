package com.facebook.react.views.modal;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.views.modal.d;
/* loaded from: classes.dex */
public class c {
    public static void a(ViewGroup viewGroup, MotionEvent motionEvent) {
        ((d.b) viewGroup).a(motionEvent);
    }

    public static boolean a(ViewParent viewParent) {
        return viewParent instanceof d.b;
    }
}
