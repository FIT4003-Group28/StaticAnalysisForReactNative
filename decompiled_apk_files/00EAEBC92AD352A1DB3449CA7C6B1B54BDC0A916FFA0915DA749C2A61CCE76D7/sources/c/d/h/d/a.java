package c.d.h.d;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import c.d.h.d.b.b;
import c.d.h.e.r;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class a extends Drawable implements b {

    /* renamed from: b  reason: collision with root package name */
    private String f3006b;

    /* renamed from: c  reason: collision with root package name */
    private String f3007c;

    /* renamed from: d  reason: collision with root package name */
    private int f3008d;

    /* renamed from: e  reason: collision with root package name */
    private int f3009e;

    /* renamed from: f  reason: collision with root package name */
    private int f3010f;

    /* renamed from: g  reason: collision with root package name */
    private String f3011g;

    /* renamed from: h  reason: collision with root package name */
    private r.b f3012h;
    private int j;
    private int k;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private long v;
    private String w;
    private HashMap<String, String> i = new HashMap<>();
    private int l = 80;
    private final Paint m = new Paint(1);
    private final Matrix n = new Matrix();
    private final Rect o = new Rect();
    private final RectF p = new RectF();

    public a() {
        a();
    }

    private void a(Canvas canvas, String str, Object... objArr) {
        if (objArr != null) {
            str = String.format(str, objArr);
        }
        canvas.drawText(str, this.t, this.u, this.m);
        this.u += this.s;
    }

    private void a(Rect rect, int i, int i2) {
        int min = Math.min(40, Math.max(10, Math.min(rect.width() / i2, rect.height() / i)));
        this.m.setTextSize(min);
        this.s = min + 8;
        if (this.l == 80) {
            this.s *= -1;
        }
        this.q = rect.left + 10;
        this.r = this.l == 80 ? rect.bottom - 10 : rect.top + 10 + 10;
    }

    int a(int i, int i2, r.b bVar) {
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0 && i > 0 && i2 > 0) {
            if (bVar != null) {
                Rect rect = this.o;
                rect.top = 0;
                rect.left = 0;
                rect.right = width;
                rect.bottom = height;
                this.n.reset();
                bVar.a(this.n, this.o, i, i2, 0.0f, 0.0f);
                RectF rectF = this.p;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = i;
                rectF.bottom = i2;
                this.n.mapRect(rectF);
                width = Math.min(width, (int) this.p.width());
                height = Math.min(height, (int) this.p.height());
            }
            float f2 = width;
            float f3 = f2 * 0.1f;
            float f4 = f2 * 0.5f;
            float f5 = height;
            float f6 = 0.1f * f5;
            float f7 = f5 * 0.5f;
            int abs = Math.abs(i - width);
            int abs2 = Math.abs(i2 - height);
            float f8 = abs;
            if (f8 < f3 && abs2 < f6) {
                return 1716301648;
            }
            if (f8 < f4 && abs2 < f7) {
                return 1728026624;
            }
        }
        return 1727284022;
    }

    public void a() {
        this.f3008d = -1;
        this.f3009e = -1;
        this.f3010f = -1;
        this.i = new HashMap<>();
        this.j = -1;
        this.k = -1;
        this.f3011g = null;
        a((String) null);
        this.v = -1L;
        this.w = null;
        invalidateSelf();
    }

    public void a(int i) {
        this.f3010f = i;
    }

    public void a(int i, int i2) {
        this.f3008d = i;
        this.f3009e = i2;
        invalidateSelf();
    }

    @Override // c.d.h.d.b.b
    public void a(long j) {
        this.v = j;
        invalidateSelf();
    }

    public void a(r.b bVar) {
        this.f3012h = bVar;
    }

    public void a(String str) {
        if (str == null) {
            str = "none";
        }
        this.f3006b = str;
        invalidateSelf();
    }

    public void b(String str) {
        this.w = str;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.m.setStyle(Paint.Style.STROKE);
        this.m.setStrokeWidth(2.0f);
        this.m.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.m);
        this.m.setStyle(Paint.Style.FILL);
        this.m.setColor(a(this.f3008d, this.f3009e, this.f3012h));
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.m);
        this.m.setStyle(Paint.Style.FILL);
        this.m.setStrokeWidth(0.0f);
        this.m.setColor(-1);
        this.t = this.q;
        this.u = this.r;
        String str = this.f3007c;
        if (str != null) {
            a(canvas, "IDs: %s, %s", this.f3006b, str);
        } else {
            a(canvas, "ID: %s", this.f3006b);
        }
        a(canvas, "D: %dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height()));
        a(canvas, "I: %dx%d", Integer.valueOf(this.f3008d), Integer.valueOf(this.f3009e));
        a(canvas, "I: %d KiB", Integer.valueOf(this.f3010f / 1024));
        String str2 = this.f3011g;
        if (str2 != null) {
            a(canvas, "i format: %s", str2);
        }
        int i = this.j;
        if (i > 0) {
            a(canvas, "anim: f %d, l %d", Integer.valueOf(i), Integer.valueOf(this.k));
        }
        r.b bVar = this.f3012h;
        if (bVar != null) {
            a(canvas, "scale: %s", bVar);
        }
        long j = this.v;
        if (j >= 0) {
            a(canvas, "t: %d ms", Long.valueOf(j));
        }
        String str3 = this.w;
        if (str3 != null) {
            a(canvas, "origin: %s", str3);
        }
        for (Map.Entry<String, String> entry : this.i.entrySet()) {
            a(canvas, "%s: %s", entry.getKey(), entry.getValue());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(rect, 9, 8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
