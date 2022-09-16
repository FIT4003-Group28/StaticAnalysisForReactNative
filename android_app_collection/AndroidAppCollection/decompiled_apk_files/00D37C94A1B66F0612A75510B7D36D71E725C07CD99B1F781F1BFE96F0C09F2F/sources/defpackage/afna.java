package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Handler;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
/* compiled from: PG */
/* renamed from: afna  reason: default package */
/* loaded from: classes.dex */
public abstract class afna extends afnj implements afnh, afji {
    private final Runnable a;
    private final Runnable b;
    private final Point c;
    protected final Handler d;
    public int e;
    public int f;
    public afng g;
    private final afjj i;
    private int j;
    private int k;
    private Window l;
    private boolean m;
    private boolean n;
    private float o;
    private float p;

    public afna(Context context) {
        super(context);
        afjj afjjVar;
        Point point = new Point();
        this.c = point;
        this.o = -1.0f;
        ampq D = zew.D(context);
        if (D.h()) {
            Window window = ((Activity) D.c()).getWindow();
            this.l = window;
            if (window != null) {
                this.m = window.getAttributes().screenBrightness == 1.0f;
            }
        }
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
            if (point.y > point.x) {
                int i = point.y;
                point.y = point.x;
                point.x = i;
            }
        }
        this.a = new afmz(this, 2);
        this.b = new afmz(this, 1);
        if (afjs.a != null) {
            afjjVar = afjs.a;
        } else {
            afjs.a = new afjs(context.getApplicationContext());
            afjjVar = afjs.a;
        }
        this.i = afjjVar;
        this.d = new Handler(context.getMainLooper());
    }

    public SurfaceHolder B() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void G(View view, int i, int i2) {
        int i3 = this.e;
        int i4 = (i - i3) / 2;
        int i5 = this.f;
        int i6 = (i2 - i5) / 2;
        view.layout(i4, i6, i3 + i4, i5 + i6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void H();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void I();

    public final void J(int i, int i2, int i3, int i4) {
        if ((this.n || this.m) && this.l != null) {
            if (i != 0 || i2 != 0 || ((i3 < this.c.x && i4 < this.c.y) || !this.n || K())) {
                if (!this.m) {
                    return;
                }
                WindowManager.LayoutParams attributes = this.l.getAttributes();
                attributes.screenBrightness = -1.0f;
                this.o = -1.0f;
                this.l.setAttributes(attributes);
                this.m = false;
                afki afkiVar = afki.ABR;
                return;
            }
            float f = ((afjs) this.i).f;
            float f2 = this.p;
            if (f2 > 1.0f) {
                float f3 = this.o;
                if (f3 == 1.0f) {
                    double d = f2;
                    Double.isNaN(d);
                    if (f < d * 0.5d) {
                        this.o = -1.0f;
                    }
                }
                if (f3 != -1.0f || f <= f2) {
                    return;
                }
                this.o = 1.0f;
            } else if (this.o == 1.0f) {
                return;
            }
            afki afkiVar2 = afki.ABR;
            WindowManager.LayoutParams attributes2 = this.l.getAttributes();
            attributes2.screenBrightness = this.o;
            this.l.setAttributes(attributes2);
            this.m = true;
        }
    }

    protected boolean K() {
        return false;
    }

    protected boolean L() {
        return true;
    }

    @Override // defpackage.afmu
    public final int c() {
        return this.k;
    }

    @Override // defpackage.afji
    public final void d() {
        this.d.post(new afmz(this));
    }

    @Override // defpackage.afmu
    public final int e() {
        return this.j;
    }

    @Override // defpackage.afnh
    public /* synthetic */ SurfaceControl f() {
        return null;
    }

    @Override // defpackage.afnh
    public final View h() {
        return this;
    }

    public /* synthetic */ pgg i() {
        return null;
    }

    public /* synthetic */ pxs j() {
        return null;
    }

    @Override // defpackage.afnh
    public final void k() {
        M(this.a, this.b, 0);
    }

    @Override // defpackage.afmu
    public void l(Bitmap bitmap, yiw yiwVar) {
        yiwVar.a(bitmap, null);
    }

    @Override // defpackage.afnh
    public final /* synthetic */ void m(Object obj) {
    }

    @Override // defpackage.afnh
    public final void n(int i) {
        M(this.b, this.a, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        J(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        if (L()) {
            int defaultSize = getDefaultSize(this.j, i);
            int defaultSize2 = getDefaultSize(this.k, i2);
            int i4 = this.j;
            if (i4 > 0 && (i3 = this.k) > 0) {
                int i5 = i4 * defaultSize2;
                int i6 = defaultSize * i3;
                float f = (i5 / i6) - 1.0f;
                if (f > 0.01f) {
                    defaultSize2 = i6 / i4;
                } else if (f < -0.01f) {
                    defaultSize = i5 / i3;
                }
            }
            this.e = resolveSize(defaultSize, i);
            this.f = resolveSize(defaultSize2, i2);
        } else {
            this.f = View.MeasureSpec.getSize(i2);
            this.e = View.MeasureSpec.getSize(i);
        }
        setMeasuredDimension(this.e, this.f);
    }

    @Override // defpackage.afnh
    public final void p() {
    }

    @Override // defpackage.afnh
    public /* synthetic */ void q() {
    }

    @Override // defpackage.afnh
    public /* synthetic */ void r(boolean z, byte[] bArr, long j, long j2) {
    }

    @Override // defpackage.afmu
    public final int rP() {
        return this.f;
    }

    @Override // defpackage.afmu
    public final int rQ() {
        return this.e;
    }

    @Override // defpackage.afnh
    public final void s(afng afngVar) {
        this.g = afngVar;
    }

    @Override // defpackage.afnh
    public final void t(afnk afnkVar) {
        if (afnkVar == C()) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.afnh
    public void u(afnn afnnVar) {
    }

    @Override // defpackage.afmu
    public void v(int i, int i2) {
        if (this.j == i && this.k == i2) {
            return;
        }
        this.j = i;
        this.k = i2;
        requestLayout();
    }

    @Override // defpackage.afnh
    public final /* synthetic */ void w(boolean z) {
    }

    @Override // defpackage.afmu
    @Deprecated
    public final boolean x() {
        return C() == afnk.GL_GVR || C() == afnk.GL_VPX;
    }

    @Override // defpackage.afnh
    public void y(boolean z, float f, float f2, int i) {
        Handler handler;
        this.n = z;
        this.p = f2;
        Window window = this.l;
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            this.o = attributes.screenBrightness;
            this.m = attributes.screenBrightness == 1.0f;
        }
        J(getLeft(), getTop(), getRight(), getBottom());
        if (z) {
            afjs afjsVar = (afjs) this.i;
            afjsVar.a();
            afjsVar.c.add(this);
            if (afjsVar.h != null || afjsVar.e == null) {
                return;
            }
            afjsVar.h = new Thread(new afjr(afjsVar, 1), "mediaViewambientBrightnessSensor");
            afjsVar.h.start();
            return;
        }
        afjs afjsVar2 = (afjs) this.i;
        if (afjsVar2.c.isEmpty()) {
            afjsVar2.c.remove(this);
        } else {
            afjsVar2.a();
        }
        if (afjsVar2.h == null || !afjsVar2.c.isEmpty() || (handler = afjsVar2.g) == null) {
            return;
        }
        handler.post(new afjr(afjsVar2));
        afjsVar2.g = null;
        afjsVar2.h = null;
    }

    @Override // defpackage.afnh
    public final /* synthetic */ void z() {
    }
}
