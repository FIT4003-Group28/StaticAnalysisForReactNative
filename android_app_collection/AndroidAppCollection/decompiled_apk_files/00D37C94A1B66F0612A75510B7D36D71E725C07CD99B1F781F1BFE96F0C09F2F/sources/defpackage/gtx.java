package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: gtx  reason: default package */
/* loaded from: classes3.dex */
public final class gtx {
    public View a;
    public gtw d;
    public int e;
    public int f;
    public final ViewTreeObserver.OnGlobalLayoutListener b = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: gtv
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            gtx gtxVar = gtx.this;
            gtxVar.a.getWindowVisibleDisplayFrame(gtxVar.c);
            int i = gtxVar.c.bottom;
            if (i != gtxVar.f) {
                boolean z = i == gtxVar.e;
                gtxVar.g = z;
                if (z) {
                    if (gtxVar.h) {
                        gtxVar.a.getViewTreeObserver().removeOnGlobalLayoutListener(gtxVar.b);
                    } else {
                        gtw gtwVar = gtxVar.d;
                        if (gtwVar != null) {
                            ((hvy) gtwVar).d();
                        }
                    }
                }
                int[] iArr = new int[2];
                gtxVar.a.getLocationOnScreen(iArr);
                zgd.t(gtxVar.a, zgd.h(i - iArr[1]), ViewGroup.LayoutParams.class);
                gtxVar.f = i;
            }
        }
    };
    public final Rect c = new Rect();
    public boolean g = true;
    public boolean h = true;

    public final void a() {
        aqxo.y(this.a != null);
        if (!this.h) {
            this.h = true;
            if (!this.g) {
                return;
            }
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this.b);
        }
    }

    public final void b() {
        aqxo.y(this.a != null);
        if (this.h) {
            this.h = false;
            this.a.getViewTreeObserver().addOnGlobalLayoutListener(this.b);
        }
    }

    public final void c(View view) {
        view.getClass();
        this.a = view;
        view.getWindowVisibleDisplayFrame(this.c);
        int i = this.c.bottom;
        this.f = i;
        this.e = i;
    }
}
