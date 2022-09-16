package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: xjj  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xjj implements View.OnTouchListener {
    public final /* synthetic */ xjk a;
    private final /* synthetic */ int b;

    public /* synthetic */ xjj(xjk xjkVar, int i) {
        this.b = i;
        this.a = xjkVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.b == 0) {
            xjk xjkVar = this.a;
            View.OnTouchListener onTouchListener = xjkVar.b;
            if (onTouchListener != null) {
                onTouchListener.onTouch(view, motionEvent);
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                xjkVar.c();
                xjkVar.d.add(xjkVar.a);
                mxr mxrVar = xjkVar.h;
                if (mxrVar != null) {
                    amuk o = amuk.o(xjkVar.d);
                    mxt mxtVar = mxrVar.a;
                    if (!mxtVar.v(o)) {
                        if (mxtVar.t(o)) {
                            mxtVar.n(mxtVar.j(o));
                        } else {
                            mxtVar.o();
                        }
                    }
                }
            } else if (action != 1) {
                xjkVar.f = true;
            } else {
                xjkVar.a();
                xjkVar.e = MotionEvent.obtain(motionEvent);
                xjkVar.f = true;
            }
            return false;
        }
        xjk xjkVar2 = this.a;
        if (motionEvent.getAction() == 0) {
            xjkVar2.c();
            xjkVar2.d.add(view);
        }
        return false;
    }
}
