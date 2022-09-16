package defpackage;

import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: xji  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xji implements View.OnClickListener {
    public final /* synthetic */ xjk a;
    private final /* synthetic */ int b;

    public /* synthetic */ xji(xjk xjkVar, int i) {
        this.b = i;
        this.a = xjkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            xjk xjkVar = this.a;
            mxs mxsVar = xjkVar.j;
            if (mxsVar != null) {
                mxt mxtVar = mxsVar.a;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                if (!mxtVar.u(mxtVar.g, arrayList)) {
                    mxtVar.l(mxtVar.g, null, arrayList, true);
                }
            }
            xjkVar.c();
            return;
        }
        xjk xjkVar2 = this.a;
        MotionEvent motionEvent = xjkVar2.e;
        if (motionEvent != null) {
            mxq mxqVar = xjkVar2.i;
            amuk o = amuk.o(xjkVar2.d);
            mxt mxtVar2 = mxqVar.a;
            if (!mxtVar2.u(mxtVar2.g, o)) {
                List j = mxtVar2.j(o);
                if (mxtVar2.t(o)) {
                    mxtVar2.l(mxtVar2.g, motionEvent, j, false);
                } else {
                    mxtVar2.m(mxtVar2.g, motionEvent, j);
                }
            }
        }
        xjkVar2.c();
    }
}
