package defpackage;

import android.graphics.Rect;
import android.util.ArrayMap;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cpmf  reason: default package */
/* loaded from: classes.dex */
public final class cpmf extends TouchDelegate {
    public final Map<View, TouchDelegate> a;
    public TouchDelegate b;

    public cpmf(View view, TouchDelegate touchDelegate) {
        super(new Rect(), view);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        if (!(touchDelegate instanceof cpmf)) {
            this.b = touchDelegate;
            return;
        }
        cpmf cpmfVar = (cpmf) touchDelegate;
        this.b = cpmfVar.b;
        linkedHashMap.putAll(cpmfVar.a);
    }

    private static boolean a(MotionEvent motionEvent, TouchDelegate touchDelegate) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        boolean onTouchEvent = touchDelegate.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent;
    }

    @Override // android.view.TouchDelegate
    public final AccessibilityNodeInfo.TouchDelegateInfo getTouchDelegateInfo() {
        ArrayMap arrayMap = new ArrayMap(this.a.size());
        for (View view : this.a.keySet()) {
            TouchDelegate touchDelegate = this.a.get(view);
            AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo = touchDelegate.getTouchDelegateInfo();
            boolean z = true;
            dbsk.l(!(touchDelegate instanceof cpmf));
            if (touchDelegateInfo.getRegionCount() != 1) {
                z = false;
            }
            dbsk.l(z);
            arrayMap.put(touchDelegateInfo.getRegionAt(0), view);
        }
        return new AccessibilityNodeInfo.TouchDelegateInfo(arrayMap);
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TouchDelegate touchDelegate = this.b;
        if (touchDelegate == null || !a(motionEvent, touchDelegate)) {
            for (View view : this.a.keySet()) {
                TouchDelegate touchDelegate2 = this.a.get(view);
                dbsk.s(touchDelegate2);
                if (a(motionEvent, touchDelegate2)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}
