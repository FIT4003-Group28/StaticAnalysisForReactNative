package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.apps.viewer.client.Dimensions;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
/* compiled from: PG */
/* renamed from: clcb  reason: default package */
/* loaded from: classes5.dex */
public final class clcb extends ViewGroup {
    public final Rect b;
    public claz c;
    @dzsi
    public clbu d;
    @dzsi
    public Bitmap e;
    @dzsi
    public String f;
    public final SparseArray<clcd> g;
    public int h;
    protected float i;
    protected boolean j;
    public yxm k;
    private final int m;
    private final int n;
    private final Map<String, Drawable> o;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private static final Matrix l = new Matrix();
    private static final Paint p = new clbv();
    private static final Paint q = new clbw();
    static final Paint a = new clbx();
    private static final Paint r = new Paint(2);

    public clcb(Context context) {
        super(context);
        this.o = new HashMap();
        this.b = new Rect();
        this.g = new SparseArray<>();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.j = false;
        setWillNotDraw(false);
        int a2 = a(getContext());
        this.m = a2;
        this.n = a2 / 2;
    }

    public static int a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return Math.max(Math.max(point.x, point.y), 1024);
    }

    private final int g(int i, int i2) {
        int width = this.b.width() * i2;
        return Math.min(Math.min(i, i2), width / this.b.height());
    }

    protected final Dimensions b(int i) {
        return new Dimensions(i, (this.b.height() * i) / this.b.width());
    }

    public final void c() {
        removeAllViews();
        this.g.clear();
        clbu clbuVar = this.d;
        if (clbuVar != null) {
            if (!clbuVar.i.isEmpty()) {
                clbuVar.j.a(new HashSet(clbuVar.i));
                clbuVar.i.clear();
            }
            for (Bitmap bitmap : clbuVar.f) {
                clbuVar.c.b(bitmap);
            }
            Arrays.fill(clbuVar.f, (Object) null);
            clbuVar.c();
            this.d = null;
            this.i = 0.0f;
        }
    }

    public final clcd d(int i) {
        return this.g.get(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (clba.a) {
            canvas.save();
            float width = getWidth() / this.h;
            canvas.scale(width, width);
            canvas.drawRect(this.s, a);
            canvas.restore();
        }
        for (Drawable drawable : this.o.values()) {
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        Point point;
        canvas.save();
        float width = getWidth() / this.d.d.a;
        canvas.scale(width, width);
        clbs clbsVar = ((clcd) view).b;
        if (clbsVar != null) {
            point = clbsVar.c();
        } else {
            point = clcd.a;
        }
        canvas.translate(point.x, point.y);
        view.draw(canvas);
        canvas.restore();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
        if (defpackage.clba.c == false) goto L142;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(float r17) {
        /*
            Method dump skipped, instructions count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clcb.e(float):void");
    }

    public final String f() {
        int id = getId();
        StringBuilder sb = new StringBuilder(21);
        sb.append("MosaicView");
        sb.append(id);
        return sb.toString();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        if (this.d == null || clba.d) {
            if (this.e != null) {
                canvas.save();
                float width = getWidth() / this.e.getWidth();
                canvas.scale(width, width);
                canvas.drawBitmap(this.e, l, r);
                canvas.restore();
            } else {
                String str = this.f;
                if (str != null) {
                    canvas.drawText(str, getWidth() / 2, (getHeight() / 2) - 10, q);
                } else {
                    canvas.drawRect(this.b, p);
                }
            }
        } else if (clba.a) {
            int size = this.g.size();
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            for (int i = 0; i < size; i++) {
                clcd valueAt = this.g.valueAt(i);
                rect2.union(valueAt.b.d());
                if (valueAt.c == null) {
                    rect.union(valueAt.b.d());
                }
            }
            clbm.a(rect);
            clbm.a(rect2);
            f();
            f();
        }
        if (clba.a) {
            int width2 = getWidth();
            int height = getHeight();
            Paint paint = a;
            canvas.drawText(f(), width2 / 2, (height / 2) - 10, paint);
            float f = width2;
            float f2 = height;
            canvas.drawLine(0.0f, 0.0f, f, f2, paint);
            canvas.drawLine(0.0f, f2, f, 0.0f, paint);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int size = this.g.size();
        if (size != 0) {
            float width = getWidth() / this.h;
            for (int i5 = 0; i5 < size; i5++) {
                clcd valueAt = this.g.valueAt(i5);
                Rect d = valueAt.b.d();
                clbm.b(d, width, width);
                valueAt.layout(d.left, d.top, d.right, d.bottom);
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(this.b.width(), this.b.height());
        int size = this.g.size();
        if (size != 0) {
            float width = this.b.width() / this.h;
            for (int i3 = 0; i3 < size; i3++) {
                clcd valueAt = this.g.valueAt(i3);
                clbs clbsVar = valueAt.b;
                Dimensions dimensions = clbu.a;
                valueAt.measure((int) Math.ceil(dimensions.a * width), (int) Math.ceil(dimensions.b * width));
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 && clba.a) {
            int size = this.g.size();
            StringBuilder sb = new StringBuilder(21);
            sb.append("tiles (");
            sb.append(size);
            sb.append("): ");
            StringBuilder sb2 = new StringBuilder(sb.toString());
            for (int i = 0; i < this.g.size(); i++) {
                sb2.append(String.format("%d: %s, ", Integer.valueOf(i), this.g.valueAt(i).a()));
            }
            sb2.toString();
            clbu clbuVar = this.d;
            if (clbuVar != null) {
                clbuVar.toString();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setDoNotRequestPageBitmap() {
        this.j = true;
    }

    public void setFailure(String str) {
        this.f = str;
        invalidate();
    }

    public void setPageBitmap(Bitmap bitmap) {
        clbk.c(bitmap, "Use removePageBitmap() instead.");
        this.f = null;
        this.e = bitmap;
        invalidate();
    }

    public void setTileBitmap(clbs clbsVar, Bitmap bitmap) {
        clbr clbrVar;
        int i;
        int i2;
        clbk.c(bitmap, "Use removePageBitmap() instead.");
        clbu clbuVar = this.d;
        if (clbuVar != null && (clbrVar = clbuVar.h) != null && (i = clbsVar.a) >= clbrVar.b && i <= clbrVar.d && (i2 = clbsVar.b) >= clbrVar.a && i2 <= clbrVar.c) {
            if (!clbsVar.a(clbuVar)) {
                int i3 = clbuVar.d.a;
            } else {
                clbuVar.f[clbsVar.b()] = bitmap;
                clbuVar.i.remove(Integer.valueOf(clbsVar.b()));
                clbuVar.c();
                clcd d = d(clbsVar.b());
                if (d != null) {
                    clbs clbsVar2 = d.b;
                    clbk.b(clbsVar == clbsVar2, String.format("Got wrong tileId %s : %s", clbsVar2, clbsVar));
                    if (d.c != null) {
                        d.a();
                        String valueOf = String.valueOf(clbsVar);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                        sb.append("Used tile receiving new bitmap ");
                        sb.append(valueOf);
                        sb.toString();
                    }
                    d.c = bitmap;
                    d.requestLayout();
                    d.invalidate();
                    return;
                }
                f();
                String valueOf2 = String.valueOf(clbsVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 12);
                sb2.append("No tile for ");
                sb2.append(valueOf2);
                sb2.toString();
                return;
            }
        }
        this.c.b(bitmap);
    }

    public void setViewArea(int i, int i2, int i3, int i4) {
        this.t.set(i, i2, i3, i4);
        if (!this.t.intersect(0, 0, this.b.width(), this.b.height())) {
            this.t.setEmpty();
        }
    }

    @Override // android.view.View
    public final String toString() {
        String valueOf = String.valueOf(f());
        Object[] objArr = new Object[2];
        Bitmap bitmap = this.e;
        objArr[0] = bitmap != null ? Integer.valueOf(bitmap.getWidth()) : "x";
        clbu clbuVar = this.d;
        objArr[1] = clbuVar != null ? clbuVar.toString() : "no tiles";
        String valueOf2 = String.valueOf(String.format(" bg: %s /t: %s", objArr));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public void setViewArea(Rect rect) {
        setViewArea(rect.left, rect.top, rect.right, rect.bottom);
    }

    public clcb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = new HashMap();
        this.b = new Rect();
        this.g = new SparseArray<>();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.j = false;
        setWillNotDraw(false);
        int a2 = a(getContext());
        this.m = a2;
        this.n = a2 / 2;
    }

    public clcb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = new HashMap();
        this.b = new Rect();
        this.g = new SparseArray<>();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.j = false;
        setWillNotDraw(false);
        int a2 = a(getContext());
        this.m = a2;
        this.n = a2 / 2;
    }
}
