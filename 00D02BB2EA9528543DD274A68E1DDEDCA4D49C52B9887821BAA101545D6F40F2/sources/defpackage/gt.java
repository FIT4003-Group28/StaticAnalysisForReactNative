package defpackage;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
@Deprecated
/* renamed from: gt  reason: default package */
/* loaded from: classes.dex */
public abstract class gt extends bas {
    private final gn a;
    private gz b = null;
    private fd c = null;
    private boolean d;

    @Deprecated
    public gt(gn gnVar) {
        this.a = gnVar;
    }

    private static String s(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    @Override // defpackage.bas
    public final boolean OW(View view, Object obj) {
        return ((fd) obj).P == view;
    }

    @Override // defpackage.bas
    public final void OY(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @Override // defpackage.bas
    public final Parcelable OZ() {
        return null;
    }

    public abstract fd a(int i);

    @Override // defpackage.bas
    public final Object c(ViewGroup viewGroup, int i) {
        if (this.b == null) {
            this.b = this.a.b();
        }
        long i2 = i(i);
        fd H = this.a.H(s(viewGroup.getId(), i2));
        if (H != null) {
            this.b.A(H);
        } else {
            H = a(i);
            this.b.x(viewGroup.getId(), H, s(viewGroup.getId(), i2));
        }
        if (H != this.c) {
            H.W(false);
            H.X(false);
        }
        return H;
    }

    @Override // defpackage.bas
    public final void d(ViewGroup viewGroup, int i, Object obj) {
        fd fdVar = (fd) obj;
        if (this.b == null) {
            this.b = this.a.b();
        }
        this.b.t(fdVar);
        if (fdVar.equals(this.c)) {
            this.c = null;
        }
    }

    @Override // defpackage.bas
    public final void e(ViewGroup viewGroup, int i, Object obj) {
        fd fdVar = (fd) obj;
        fd fdVar2 = this.c;
        if (fdVar != fdVar2) {
            if (fdVar2 != null) {
                fdVar2.W(false);
                this.c.X(false);
            }
            fdVar.W(true);
            fdVar.X(true);
            this.c = fdVar;
        }
    }

    @Override // defpackage.bas
    public final void f(ViewGroup viewGroup) {
        gz gzVar = this.b;
        if (gzVar != null) {
            if (!this.d) {
                try {
                    this.d = true;
                    gzVar.h();
                } finally {
                    this.d = false;
                }
            }
            this.b = null;
        }
    }

    public long i(int i) {
        return i;
    }

    @Override // defpackage.bas
    public final void j() {
    }
}
