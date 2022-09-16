package defpackage;

import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: gwk  reason: default package */
/* loaded from: classes3.dex */
public final class gwk {
    public final View a;
    public hhn b;
    public boolean c;
    private final gyq d;
    private final hho e;
    private final boolean f;
    private final View g;
    private final View h;
    private final View i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;

    public gwk(hhn hhnVar, hho hhoVar, boolean z, gyq gyqVar, View view, View view2, View view3, View view4) {
        this.b = hhnVar;
        this.e = hhoVar;
        this.f = z;
        this.d = gyqVar;
        this.a = view;
        this.g = view2;
        this.h = view3;
        this.i = view4;
    }

    static boolean d(boolean z, boolean z2) {
        return z && z2;
    }

    private final void e(boolean z, boolean z2, actj actjVar) {
        if (z != z2) {
            gyo a = this.d.a(actjVar);
            a.h(z2);
            a.g();
        }
    }

    public final void a() {
        if (gyy.a(this.a)) {
            this.m = gyy.a(this.i);
            this.k = gyy.a(this.h);
            this.l = this.h.isEnabled();
            this.j = gyy.a(this.g);
        }
    }

    public final void b(boolean z) {
        a();
        gyy.b(this.a, z);
        hhn hhnVar = this.b;
        boolean z2 = false;
        if (hhnVar != null && hhnVar.x()) {
            z2 = true;
        }
        c(z2, z);
    }

    public final void c(boolean z, boolean z2) {
        boolean d = d(z, z2);
        gyy.b(this.g, d);
        boolean d2 = d(z, z2);
        gyy.b(this.h, d2);
        hho hhoVar = this.e;
        boolean z3 = true;
        boolean z4 = hhoVar != null && hhoVar.d >= hhoVar.b;
        this.h.setEnabled(z4);
        this.h.findViewById(R.id.shorts_camera_next_button).setEnabled(z4);
        boolean z5 = this.f;
        boolean c = this.e.c();
        if (!z5 ? z || !z2 : !c || !z2) {
            z3 = false;
        }
        gyy.b(this.i, z3);
        if (!z2 || !this.c) {
            return;
        }
        e(this.j, d, actj.SHORTS_CREATION_UNDO_BUTTON);
        e(this.m, z3, actj.SHORTS_CREATION_GALLERY_BUTTON);
        boolean z6 = this.k;
        boolean z7 = this.l;
        if (z6 == d2 && z7 == z4) {
            return;
        }
        if (!z6) {
            if (!d2) {
                return;
            }
            if (z4) {
                this.d.a(actj.SHORTS_CREATION_NEXT_BUTTON).e();
            } else {
                this.d.a(actj.SHORTS_CREATION_NEXT_DISABLED_BUTTON).e();
            }
        } else if (!d2) {
            if (z7) {
                this.d.a(actj.SHORTS_CREATION_NEXT_BUTTON).d();
            } else {
                this.d.a(actj.SHORTS_CREATION_NEXT_DISABLED_BUTTON).d();
            }
        } else if (z4) {
            this.d.a(actj.SHORTS_CREATION_NEXT_DISABLED_BUTTON).d();
            this.d.a(actj.SHORTS_CREATION_NEXT_BUTTON).e();
        } else {
            this.d.a(actj.SHORTS_CREATION_NEXT_BUTTON).d();
            this.d.a(actj.SHORTS_CREATION_NEXT_DISABLED_BUTTON).e();
        }
    }
}
