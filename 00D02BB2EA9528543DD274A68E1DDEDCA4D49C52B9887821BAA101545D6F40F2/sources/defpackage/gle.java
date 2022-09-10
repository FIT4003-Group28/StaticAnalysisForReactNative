package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import com.google.android.apps.gmm.base.layout.MainLayout;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: gle  reason: default package */
/* loaded from: classes6.dex */
public final class gle implements gll {
    private final Activity a;
    private final hwd b;
    private final dxio<akzh> c;

    public gle(Activity activity, hwd hwdVar, dxio<akzh> dxioVar) {
        this.a = activity;
        this.b = hwdVar;
        this.c = dxioVar;
    }

    @dzsi
    public final MainLayout a() {
        return (MainLayout) this.a.findViewById(R.id.mainmap_container);
    }

    @Override // defpackage.gll
    public final Rect b() {
        MainLayout a = a();
        if (a != null) {
            Rect ak = a.ak(true != a.S() ? 3 : 2, true);
            a.al(ak);
            return ak;
        }
        return new Rect();
    }

    @Override // defpackage.gll
    public final Rect[] c() {
        MainLayout a = a();
        if (a != null) {
            Rect ak = a.ak(3, true);
            a.al(ak);
            Rect ak2 = a.ak(2, true);
            a.al(ak2);
            Rect ak3 = a.ak(3, false);
            a.al(ak3);
            Rect ak4 = a.ak(2, false);
            a.al(ak4);
            return new Rect[]{ak, ak2, ak3, ak4};
        }
        return new Rect[0];
    }

    @Override // defpackage.gll
    public final Rect d() {
        MainLayout a = a();
        if (a != null) {
            Rect ak = a.ak(2, true);
            a.al(ak);
            return ak;
        }
        return new Rect();
    }

    @Override // defpackage.gll
    public final Rect e() {
        MainLayout a = a();
        return a != null ? a.Q() : new Rect();
    }

    @Override // defpackage.gll
    public final Rect f() {
        MainLayout a = a();
        if (a != null) {
            if (!a.S()) {
                bvoo.h("Map is updated to expanded view in landscape mode.", new Object[0]);
            }
            int i = a.i();
            return new Rect(0, i, a.i.a().y(), ((a.getHeight() - a.k()) - i) + i);
        }
        return new Rect();
    }

    @Override // defpackage.gll
    @dzsi
    public final View g() {
        return a();
    }

    @Override // defpackage.gll
    @Deprecated
    public final boolean h() {
        return this.b.i();
    }

    @Override // defpackage.gll
    public final Point i() {
        bnuw A = this.c.a().A();
        return new Point(A.a(), A.b());
    }
}
