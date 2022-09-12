package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* renamed from: bdwn  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bdwn implements bvrp {
    static final bvrp a = new bdwn();

    private bdwn() {
    }

    @Override // defpackage.bvrp
    public final Object a(Object obj, Object obj2) {
        return Boolean.valueOf(((View) obj).dispatchTouchEvent((MotionEvent) obj2));
    }
}
