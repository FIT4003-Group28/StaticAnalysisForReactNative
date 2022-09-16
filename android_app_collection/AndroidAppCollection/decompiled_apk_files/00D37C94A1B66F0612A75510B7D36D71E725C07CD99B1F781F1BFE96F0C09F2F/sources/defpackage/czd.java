package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: czd  reason: default package */
/* loaded from: classes3.dex */
public final class czd implements View.OnTouchListener {
    public daq a;
    public daq b;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        daq daqVar = this.b;
        if (daqVar != null) {
            czu.g(daqVar, view, motionEvent);
        }
        daq daqVar2 = this.a;
        if (daqVar2 != null) {
            if (czu.d == null) {
                czu.d = new ddr();
            }
            czu.d.a = view;
            czu.d.b = motionEvent;
            Object K = daqVar2.a.l().K(daqVar2, czu.d);
            czu.d.a = null;
            czu.d.b = null;
            return K != null && ((Boolean) K).booleanValue();
        }
        return false;
    }
}
