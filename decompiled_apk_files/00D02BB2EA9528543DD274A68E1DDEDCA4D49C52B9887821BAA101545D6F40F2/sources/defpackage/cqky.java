package defpackage;

import android.view.MotionEvent;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cqky  reason: default package */
/* loaded from: classes.dex */
public final class cqky implements View.OnTouchListener {
    public final Map<cqis<View.OnTouchListener>, View.OnTouchListener> a = new LinkedHashMap();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        dcdc r = dcdc.r(this.a.values());
        boolean z = false;
        for (int i = 0; i < r.size(); i++) {
            z |= ((View.OnTouchListener) r.get(i)).onTouch(view, motionEvent);
        }
        return true == z;
    }
}
