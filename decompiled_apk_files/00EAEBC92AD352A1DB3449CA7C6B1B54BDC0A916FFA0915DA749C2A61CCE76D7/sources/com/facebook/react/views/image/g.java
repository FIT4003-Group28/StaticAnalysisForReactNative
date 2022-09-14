package com.facebook.react.views.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import c.d.h.e.m;
import c.d.h.e.r;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.j0.b.b;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.q;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class g extends c.d.h.i.d {
    private static float[] I = new float[4];
    private static final Matrix J = new Matrix();
    private static final Matrix K = new Matrix();
    private static final Matrix L = new Matrix();
    private c.d.j.m.a A;
    private c.d.h.c.d B;
    private c.d.h.c.d C;
    private com.facebook.react.views.image.a D;
    private final Object E;
    private int F;
    private boolean G;
    private ReadableMap H;

    /* renamed from: h  reason: collision with root package name */
    private com.facebook.react.views.image.c f6158h;
    private final List<com.facebook.react.j0.b.a> i;
    private com.facebook.react.j0.b.a j;
    private com.facebook.react.j0.b.a k;
    private Drawable l;
    private Drawable m;
    private m n;
    private int o;
    private int p;
    private int q;
    private float r;
    private float s;
    private float[] t;
    private r.b u;
    private Shader.TileMode v;
    private boolean w;
    private final c.d.h.c.b x;
    private final b y;
    private final c z;

    /* loaded from: classes.dex */
    class a extends c.d.h.c.c<c.d.j.k.e> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.uimanager.events.d f6159b;

        a(com.facebook.react.uimanager.events.d dVar) {
            this.f6159b = dVar;
        }

        @Override // c.d.h.c.c, c.d.h.c.d
        public void a(String str, c.d.j.k.e eVar, Animatable animatable) {
            if (eVar != null) {
                this.f6159b.a(new com.facebook.react.views.image.b(g.this.getId(), 2, g.this.j.b(), eVar.b(), eVar.a()));
                this.f6159b.a(new com.facebook.react.views.image.b(g.this.getId(), 3));
            }
        }

        @Override // c.d.h.c.c, c.d.h.c.d
        public void b(String str, Object obj) {
            this.f6159b.a(new com.facebook.react.views.image.b(g.this.getId(), 4));
        }

        @Override // c.d.h.c.c, c.d.h.c.d
        public void b(String str, Throwable th) {
            this.f6159b.a(new com.facebook.react.views.image.b(g.this.getId(), 1, true, th.getMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends c.d.j.o.a {
        private b() {
        }

        /* synthetic */ b(g gVar, a aVar) {
            this();
        }

        @Override // c.d.j.o.a
        public void a(Bitmap bitmap, Bitmap bitmap2) {
            g.this.a(g.I);
            bitmap.setHasAlpha(true);
            if (com.facebook.react.uimanager.d.a(g.I[0], 0.0f) && com.facebook.react.uimanager.d.a(g.I[1], 0.0f) && com.facebook.react.uimanager.d.a(g.I[2], 0.0f) && com.facebook.react.uimanager.d.a(g.I[3], 0.0f)) {
                super.a(bitmap, bitmap2);
                return;
            }
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
            Canvas canvas = new Canvas(bitmap);
            float[] fArr = new float[8];
            a(bitmap2, g.I, fArr);
            Path path = new Path();
            path.addRoundRect(new RectF(0.0f, 0.0f, bitmap2.getWidth(), bitmap2.getHeight()), fArr, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }

        void a(Bitmap bitmap, float[] fArr, float[] fArr2) {
            g.this.u.a(g.J, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
            g.J.invert(g.K);
            fArr2[0] = g.K.mapRadius(fArr[0]);
            fArr2[1] = fArr2[0];
            fArr2[2] = g.K.mapRadius(fArr[1]);
            fArr2[3] = fArr2[2];
            fArr2[4] = g.K.mapRadius(fArr[2]);
            fArr2[5] = fArr2[4];
            fArr2[6] = g.K.mapRadius(fArr[3]);
            fArr2[7] = fArr2[6];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c extends c.d.j.o.a {
        private c() {
        }

        /* synthetic */ c(g gVar, a aVar) {
            this();
        }

        @Override // c.d.j.o.a, c.d.j.o.e
        public c.d.d.h.a<Bitmap> a(Bitmap bitmap, c.d.j.c.f fVar) {
            Rect rect = new Rect(0, 0, g.this.getWidth(), g.this.getHeight());
            g.this.u.a(g.L, rect, bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            BitmapShader bitmapShader = new BitmapShader(bitmap, g.this.v, g.this.v);
            bitmapShader.setLocalMatrix(g.L);
            paint.setShader(bitmapShader);
            c.d.d.h.a<Bitmap> a2 = fVar.a(g.this.getWidth(), g.this.getHeight());
            try {
                new Canvas(a2.b()).drawRect(rect, paint);
                return a2.m124clone();
            } finally {
                c.d.d.h.a.b(a2);
            }
        }
    }

    public g(Context context, c.d.h.c.b bVar, com.facebook.react.views.image.a aVar, Object obj) {
        super(context, a(context));
        this.f6158h = com.facebook.react.views.image.c.AUTO;
        this.o = 0;
        this.s = Float.NaN;
        this.v = d.a();
        this.F = -1;
        this.u = d.b();
        this.x = bVar;
        this.y = new b(this, null);
        this.z = new c(this, null);
        this.D = aVar;
        this.E = obj;
        this.i = new LinkedList();
    }

    private static c.d.h.f.a a(Context context) {
        c.d.h.f.b bVar = new c.d.h.f.b(context.getResources());
        bVar.a(c.d.h.f.d.b(0.0f));
        return bVar.a();
    }

    private void a(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float[] fArr) {
        float f2 = !com.facebook.yoga.g.a(this.s) ? this.s : 0.0f;
        float[] fArr2 = this.t;
        fArr[0] = (fArr2 == null || com.facebook.yoga.g.a(fArr2[0])) ? f2 : this.t[0];
        float[] fArr3 = this.t;
        fArr[1] = (fArr3 == null || com.facebook.yoga.g.a(fArr3[1])) ? f2 : this.t[1];
        float[] fArr4 = this.t;
        fArr[2] = (fArr4 == null || com.facebook.yoga.g.a(fArr4[2])) ? f2 : this.t[2];
        float[] fArr5 = this.t;
        if (fArr5 != null && !com.facebook.yoga.g.a(fArr5[3])) {
            f2 = this.t[3];
        }
        fArr[3] = f2;
    }

    private boolean a(com.facebook.react.j0.b.a aVar) {
        com.facebook.react.views.image.c cVar = this.f6158h;
        return cVar == com.facebook.react.views.image.c.AUTO ? c.d.d.k.f.f(aVar.c()) || c.d.d.k.f.g(aVar.c()) : cVar == com.facebook.react.views.image.c.RESIZE;
    }

    private boolean j() {
        return this.i.size() > 1;
    }

    private boolean k() {
        return this.v != Shader.TileMode.CLAMP;
    }

    private void l() {
        this.j = null;
        if (this.i.isEmpty()) {
            this.i.add(new com.facebook.react.j0.b.a(getContext(), "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII="));
        } else if (j()) {
            b.C0124b a2 = com.facebook.react.j0.b.b.a(getWidth(), getHeight(), this.i);
            this.j = a2.a();
            this.k = a2.b();
            return;
        }
        this.j = this.i.get(0);
    }

    public void a(float f2, int i) {
        if (this.t == null) {
            this.t = new float[4];
            Arrays.fill(this.t, Float.NaN);
        }
        if (!com.facebook.react.uimanager.d.a(this.t[i], f2)) {
            this.t[i] = f2;
            this.w = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0192, code lost:
        if (r0 != null) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e() {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.image.g.e():void");
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.w = this.w || j() || k();
        e();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (this.o != i) {
            this.o = i;
            this.n = new m(i);
            this.w = true;
        }
    }

    public void setBlurRadius(float f2) {
        int b2 = (int) q.b(f2);
        if (b2 == 0) {
            this.A = null;
        } else {
            this.A = new c.d.j.m.a(b2);
        }
        this.w = true;
    }

    public void setBorderColor(int i) {
        this.p = i;
        this.w = true;
    }

    public void setBorderRadius(float f2) {
        if (!com.facebook.react.uimanager.d.a(this.s, f2)) {
            this.s = f2;
            this.w = true;
        }
    }

    public void setBorderWidth(float f2) {
        this.r = q.b(f2);
        this.w = true;
    }

    public void setControllerListener(c.d.h.c.d dVar) {
        this.C = dVar;
        this.w = true;
        e();
    }

    public void setDefaultSource(String str) {
        this.l = com.facebook.react.j0.b.c.a().a(getContext(), str);
        this.w = true;
    }

    public void setFadeDuration(int i) {
        this.F = i;
    }

    public void setHeaders(ReadableMap readableMap) {
        this.H = readableMap;
    }

    public void setLoadingIndicatorSource(String str) {
        Drawable a2 = com.facebook.react.j0.b.c.a().a(getContext(), str);
        this.m = a2 != null ? new c.d.h.e.b(a2, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA) : null;
        this.w = true;
    }

    public void setOverlayColor(int i) {
        this.q = i;
        this.w = true;
    }

    public void setProgressiveRenderingEnabled(boolean z) {
        this.G = z;
    }

    public void setResizeMethod(com.facebook.react.views.image.c cVar) {
        this.f6158h = cVar;
        this.w = true;
    }

    public void setScaleType(r.b bVar) {
        this.u = bVar;
        this.w = true;
    }

    public void setShouldNotifyLoadEvents(boolean z) {
        if (!z) {
            this.B = null;
        } else {
            this.B = new a(((UIManagerModule) ((ReactContext) getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher());
        }
        this.w = true;
    }

    public void setSource(ReadableArray readableArray) {
        this.i.clear();
        if (readableArray == null || readableArray.size() == 0) {
            this.i.add(new com.facebook.react.j0.b.a(getContext(), "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII="));
        } else {
            if (readableArray.size() == 1) {
                String string = readableArray.mo209getMap(0).getString("uri");
                com.facebook.react.j0.b.a aVar = new com.facebook.react.j0.b.a(getContext(), string);
                this.i.add(aVar);
                if (Uri.EMPTY.equals(aVar.c())) {
                    a(string);
                }
            } else {
                for (int i = 0; i < readableArray.size(); i++) {
                    ReadableMap mo209getMap = readableArray.mo209getMap(i);
                    String string2 = mo209getMap.getString("uri");
                    com.facebook.react.j0.b.a aVar2 = new com.facebook.react.j0.b.a(getContext(), string2, mo209getMap.getDouble("width"), mo209getMap.getDouble("height"));
                    this.i.add(aVar2);
                    if (Uri.EMPTY.equals(aVar2.c())) {
                        a(string2);
                    }
                }
            }
        }
        this.w = true;
    }

    public void setTileMode(Shader.TileMode tileMode) {
        this.v = tileMode;
        this.w = true;
    }
}
