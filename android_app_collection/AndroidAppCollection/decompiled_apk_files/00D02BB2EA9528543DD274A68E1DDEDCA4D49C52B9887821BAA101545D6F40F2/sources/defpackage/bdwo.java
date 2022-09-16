package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* renamed from: bdwo  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bdwo implements bvrp {
    static final bvrp a = new bdwo();

    private bdwo() {
    }

    @Override // defpackage.bvrp
    public final Object a(Object obj, Object obj2) {
        return Boolean.valueOf(((View) obj).dispatchGenericMotionEvent((MotionEvent) obj2));
    }
}
