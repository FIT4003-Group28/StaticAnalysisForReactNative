package defpackage;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: atbs  reason: default package */
/* loaded from: classes2.dex */
public final class atbs {
    public final dxio<crfm> a;
    public final dxio<asik> b;
    public final dxio<jzv> c;
    public final dxio<btrm> d;
    public final dxio<bvjj> e;
    public final dxio<axrf> f;
    public boolean g;
    public boolean h = true;
    public volatile boolean i;
    public volatile boolean j;
    public volatile boolean k;
    public volatile boolean l;
    private final dxio<pfk> m;
    private final dxio<btvo> n;

    public atbs(dxio<crfm> dxioVar, dxio<asik> dxioVar2, dxio<jzv> dxioVar3, dxio<pfk> dxioVar4, dxio<btrm> dxioVar5, dxio<btvo> dxioVar6, dxio<bvjj> dxioVar7, dxio<axrf> dxioVar8) {
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = dxioVar3;
        this.m = dxioVar4;
        this.d = dxioVar5;
        this.n = dxioVar6;
        this.e = dxioVar7;
        this.f = dxioVar8;
    }

    public static boolean j(Activity activity) {
        return Build.VERSION.SDK_INT >= 26 && activity.isInMultiWindowMode();
    }

    public static boolean k(Activity activity) {
        return Build.VERSION.SDK_INT >= 26 && activity.isInPictureInPictureMode();
    }

    public static final void m(Activity activity, int i) {
        View findViewById = activity.findViewById(R.id.picture_in_picture_cover);
        if (findViewById == null || findViewById.getAlpha() == 0.0f) {
            return;
        }
        findViewById.animate().cancel();
        findViewById.animate().setStartDelay(i).setDuration(500L).alpha(0.0f);
    }

    public final boolean a() {
        return Build.VERSION.SDK_INT >= 26 && this.n.a().getEnableFeatureParameters().an;
    }

    public final boolean b() {
        return this.i;
    }

    public final boolean c() {
        return this.j;
    }

    public final boolean d() {
        return this.k;
    }

    public final boolean e() {
        return this.l;
    }

    public final boolean f(Activity activity) {
        return a() && activity.isInPictureInPictureMode();
    }

    public final boolean g(boolean z, boolean z2) {
        boolean z3;
        if (this.i != z) {
            this.i = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.j != z2) {
            this.j = z2;
            return true;
        }
        return z3;
    }

    public final void h(Activity activity) {
        if (a() && activity.isInPictureInPictureMode()) {
            activity.moveTaskToBack(true);
        }
    }

    public final boolean i() {
        return this.k;
    }

    public final void l(boolean z, boolean z2, boolean z3) {
        boolean z4 = false;
        boolean z5 = true;
        boolean g = g(z, z2 || z3);
        if (this.i != z) {
            this.i = z;
            z4 = true;
        }
        if (this.k != z2) {
            this.k = z2;
            if (z2) {
                this.m.a().d();
            } else {
                this.m.a().e();
            }
        } else {
            z5 = z4;
        }
        if (g || z5) {
            this.d.a().b(crih.a);
        }
    }
}
