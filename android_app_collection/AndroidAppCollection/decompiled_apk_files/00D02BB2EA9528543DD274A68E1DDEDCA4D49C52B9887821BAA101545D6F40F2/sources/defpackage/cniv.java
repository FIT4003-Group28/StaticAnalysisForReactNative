package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: cniv  reason: default package */
/* loaded from: classes5.dex */
public final class cniv {
    public cniw a;
    public cniw b;
    public cniw c;
    public cniw d;
    public int e;
    private boolean f;

    private final boolean e(int i) {
        return (i & this.e) != 0;
    }

    private static void f(View view) {
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    public final void a(View view) {
        if (view instanceof FrameLayout) {
            if (this.a != null || this.b != null || this.c != null || this.d != null) {
                throw new IllegalStateException("Call to addTrampolines when trampolines already exist");
            }
            FrameLayout frameLayout = (FrameLayout) view;
            cniw cniwVar = new cniw(frameLayout.getContext());
            cniwVar.setLayoutParams(new FrameLayout.LayoutParams(1, -1, 3));
            frameLayout.addView(cniwVar);
            cniw cniwVar2 = new cniw(frameLayout.getContext());
            cniwVar2.setLayoutParams(new FrameLayout.LayoutParams(-1, 1, 48));
            frameLayout.addView(cniwVar2);
            cniw cniwVar3 = new cniw(frameLayout.getContext());
            cniwVar3.setLayoutParams(new FrameLayout.LayoutParams(1, -1, 5));
            frameLayout.addView(cniwVar3);
            cniw cniwVar4 = new cniw(frameLayout.getContext());
            cniwVar4.setLayoutParams(new FrameLayout.LayoutParams(-1, 1, 80));
            frameLayout.addView(cniwVar4);
            this.a = cniwVar;
            this.b = cniwVar2;
            this.c = cniwVar3;
            this.d = cniwVar4;
            d();
            return;
        }
        throw new IllegalArgumentException("addTrampolines must be invoked on a ViewGroup");
    }

    public final void b() {
        cniw cniwVar = this.a;
        if (cniwVar != null) {
            f(cniwVar);
            this.a = null;
        }
        cniw cniwVar2 = this.b;
        if (cniwVar2 != null) {
            f(cniwVar2);
            this.b = null;
        }
        cniw cniwVar3 = this.c;
        if (cniwVar3 != null) {
            f(cniwVar3);
            this.c = null;
        }
        cniw cniwVar4 = this.d;
        if (cniwVar4 != null) {
            f(cniwVar4);
            this.d = null;
        }
    }

    public final void d() {
        boolean z = true;
        this.a.setFocusable(this.f && e(1));
        this.b.setFocusable(this.f && e(2));
        this.c.setFocusable(this.f && e(4));
        cniw cniwVar = this.d;
        if (!this.f || !e(8)) {
            z = false;
        }
        cniwVar.setFocusable(z);
    }

    public final void c(boolean z) {
        this.f = z;
        if (this.a == null || this.b == null || this.c == null || this.d == null) {
            if (!cmwk.a("CAR.PROJECTION", 3)) {
                return;
            }
            int i = cnjc.a;
            return;
        }
        d();
    }
}
