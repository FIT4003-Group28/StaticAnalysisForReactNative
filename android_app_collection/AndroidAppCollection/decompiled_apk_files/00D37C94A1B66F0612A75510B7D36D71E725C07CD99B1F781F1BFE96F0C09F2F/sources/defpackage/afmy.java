package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: afmy  reason: default package */
/* loaded from: classes.dex */
public final class afmy extends afnj implements afnh {
    public static final afnk a = afnk.SURFACE;
    public afnh b;
    private final List c;
    private boolean d;
    private boolean e;
    private afng f;
    private afnk g;
    private boolean i;
    private boolean j;
    private float k;
    private float l;
    private int m;
    private final ahjw n;

    public afmy(Context context, ahjw ahjwVar) {
        super(context);
        this.c = new ArrayList();
        afms.a(ahjwVar);
        this.n = ahjwVar;
        this.g = a;
    }

    @Override // defpackage.afnh
    public final Surface A() {
        if (G()) {
            return this.b.A();
        }
        return null;
    }

    @Override // defpackage.afnh
    public final SurfaceHolder B() {
        if (G()) {
            return this.b.B();
        }
        return null;
    }

    @Override // defpackage.afnh
    public final afnk C() {
        afnh afnhVar = this.b;
        return afnhVar != null ? afnhVar.C() : afnk.UNKNOWN;
    }

    @Override // defpackage.afmu
    public final void D() {
        if (G()) {
            this.b.D();
            this.b = null;
        }
    }

    @Override // defpackage.afmu
    public final boolean E() {
        return G() && this.b.E();
    }

    final afnh F(afnk afnkVar) {
        afnk afnkVar2 = afnk.UNKNOWN;
        int ordinal = afnkVar.ordinal();
        if (ordinal == 0 || ordinal == 3) {
            return new afne(getContext());
        }
        if (ordinal == 4) {
            return new afnf(getContext());
        }
        if (ordinal == 5) {
            return new afnc(getContext());
        }
        if (ordinal == 6 || ordinal == 7) {
            ahjw ahjwVar = this.n;
            Context context = getContext();
            boolean z = this.i;
            boolean z2 = this.j;
            if (afnkVar == afnk.GL_GVR) {
                return new ahld(context, ahjwVar.a, z, z2);
            }
            if (afnkVar != afnk.GL_VPX) {
                return null;
            }
            return new ahnt(context);
        }
        throw new UnsupportedOperationException("Requested view is not supported.");
    }

    public final boolean G() {
        return this.b != null;
    }

    @Override // defpackage.afmu
    public final int c() {
        afms.e(G(), "MediaView method called before surface created");
        return this.b.c();
    }

    @Override // defpackage.afmu
    public final int e() {
        afms.e(G(), "MediaView method called before surface created");
        return this.b.e();
    }

    @Override // defpackage.afnh
    public final SurfaceControl f() {
        if (G()) {
            return this.b.f();
        }
        return null;
    }

    @Override // defpackage.afnh
    public final View h() {
        afnh afnhVar = this.b;
        if (afnhVar != null) {
            return afnhVar.h();
        }
        return null;
    }

    @Override // defpackage.afnh
    public final pgg i() {
        if (G()) {
            return this.b.i();
        }
        return null;
    }

    @Override // defpackage.afnh
    public final pxs j() {
        if (G()) {
            return this.b.j();
        }
        return null;
    }

    @Override // defpackage.afnh
    public final void k() {
        if (G()) {
            this.b.k();
        }
        this.e = false;
    }

    @Override // defpackage.afmu
    public final void l(Bitmap bitmap, yiw yiwVar) {
        if (G()) {
            this.b.l(bitmap, yiwVar);
        } else {
            yiwVar.a(bitmap, null);
        }
    }

    @Override // defpackage.afnh
    public final void m(Object obj) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            afnh afnhVar = (afnh) it.next();
            if (obj == null || (obj != afnhVar.A() && obj != afnhVar.j())) {
                afnhVar.D();
                removeView(afnhVar.h());
                it.remove();
            }
        }
    }

    @Override // defpackage.afnh
    public final void n(int i) {
        if (!G()) {
            this.e = true;
            return;
        }
        this.e = false;
        this.b.n(i);
    }

    @Override // defpackage.afnh
    public final void o() {
        if (G()) {
            this.b.o();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        afnh afnhVar = this.b;
        if (afnhVar != null) {
            removeView(afnhVar.h());
        }
        afnh F = F(this.g);
        this.b = F;
        addView(F.h());
        if (this.d) {
            this.d = false;
            this.b.s(this.f);
            if (!this.e) {
                return;
            }
            n(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount() - 1;
        if (childCount >= 0) {
            getChildAt(childCount).layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int childCount = getChildCount() - 1;
        if (childCount >= 0) {
            View childAt = getChildAt(childCount);
            childAt.measure(i, i2);
            setMeasuredDimension(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @Override // defpackage.afnh
    public final void p() {
        t(a);
    }

    @Override // defpackage.afnh
    public final void q() {
        afnh afnhVar = this.b;
        if (afnhVar != null) {
            afnhVar.q();
        }
    }

    @Override // defpackage.afnh
    public final void r(boolean z, byte[] bArr, long j, long j2) {
        if (G()) {
            this.b.r(z, bArr, j, j2);
        }
    }

    @Override // defpackage.afmu
    public final int rP() {
        afms.e(G(), "MediaView method called before surface created");
        int rP = this.b.rP();
        return rP == 0 ? getMeasuredHeight() : rP;
    }

    @Override // defpackage.afmu
    public final int rQ() {
        afms.e(G(), "MediaView method called before surface created");
        int rQ = this.b.rQ();
        return rQ == 0 ? getMeasuredWidth() : rQ;
    }

    @Override // defpackage.afnh
    public final void s(afng afngVar) {
        this.f = afngVar;
        if (!G()) {
            this.d = true;
            return;
        }
        this.d = false;
        this.b.s(afngVar);
    }

    @Override // defpackage.afnh
    public final void t(afnk afnkVar) {
        if (afnkVar == this.g) {
            if (!G()) {
                return;
            }
            this.b.y(this.i, this.k, this.l, this.m);
            return;
        }
        afms.a(this.f);
        this.g = afnkVar;
        afki afkiVar = afki.ABR;
        afnh afnhVar = this.b;
        if (afnkVar == afnk.GL_GVR) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                afnh afnhVar2 = (afnh) it.next();
                if (afnhVar2.C() == afnkVar) {
                    it.remove();
                    this.b = afnhVar2;
                    bringChildToFront(afnhVar2.h());
                    this.f.c();
                    break;
                }
            }
        }
        afnh F = F(afnkVar);
        this.b = F;
        addView(F.h());
        this.b.s(this.f);
        this.b.y(this.i, this.k, this.l, this.m);
        if (afnhVar == null) {
            return;
        }
        afnhVar.s(null);
        this.c.add(afnhVar);
    }

    @Override // android.view.View
    public final String toString() {
        int hashCode = hashCode();
        int left = getLeft();
        int top = getTop();
        int right = getRight();
        int bottom = getBottom();
        StringBuilder sb = new StringBuilder(60);
        sb.append(hashCode);
        sb.append("(");
        sb.append(left);
        sb.append(",");
        sb.append(top);
        sb.append(",");
        sb.append(right);
        sb.append(",");
        sb.append(bottom);
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.afnh
    public final void u(afnn afnnVar) {
        if (G()) {
            this.b.u(afnnVar);
        }
    }

    @Override // defpackage.afmu
    public final void v(int i, int i2) {
        afms.e(G(), "MediaView method called before surface created");
        this.b.v(i, i2);
    }

    @Override // defpackage.afnh
    public final void w(boolean z) {
        this.j = z;
    }

    @Override // defpackage.afmu
    @Deprecated
    public final boolean x() {
        afnh afnhVar = this.b;
        return afnhVar != null && afnhVar.x();
    }

    @Override // defpackage.afnh
    public final void y(boolean z, float f, float f2, int i) {
        this.i = z;
        this.k = f;
        this.l = f2;
        this.m = i;
    }

    @Override // defpackage.afnh
    public final /* synthetic */ void z() {
    }
}
