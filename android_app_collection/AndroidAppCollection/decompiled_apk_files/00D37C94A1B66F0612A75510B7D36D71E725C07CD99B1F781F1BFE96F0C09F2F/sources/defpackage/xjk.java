package defpackage;

import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: xjk  reason: default package */
/* loaded from: classes4.dex */
public final class xjk {
    public final View a;
    public final View.OnTouchListener b;
    public final List c = new ArrayList();
    public final List d = new ArrayList();
    public MotionEvent e;
    public boolean f;
    public boolean g;
    public final mxr h;
    public final mxq i;
    public final mxs j;

    public xjk(View view, mxq mxqVar, mxr mxrVar, View.OnTouchListener onTouchListener, mxs mxsVar) {
        this.a = view;
        this.i = mxqVar;
        this.h = mxrVar;
        this.b = onTouchListener;
        this.j = mxsVar;
        view.setOnTouchListener(new xjj(this));
        view.setOnClickListener(new xji(this, 1));
    }

    public final void a() {
        MotionEvent motionEvent = this.e;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.e = null;
    }

    public final void b(View view, boolean z) {
        if (z) {
            this.c.add(view);
        }
        view.setOnTouchListener(new xjj(this, 1));
    }

    public final void c() {
        if (this.f) {
            this.f = false;
            this.d.clear();
            a();
        }
    }

    protected final void finalize() {
        super.finalize();
        a();
    }
}
