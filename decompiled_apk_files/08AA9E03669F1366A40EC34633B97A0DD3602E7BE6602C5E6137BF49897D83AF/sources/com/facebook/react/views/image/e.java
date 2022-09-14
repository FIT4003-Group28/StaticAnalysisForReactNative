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
import com.facebook.f.c.f;
import com.facebook.f.e.o;
import com.facebook.f.f.d;
import com.facebook.react.bridge.aj;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.b.b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.stats.netstats.NetstatsParserPatterns;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ReactImageView.java */
/* loaded from: classes.dex */
public class e extends com.facebook.f.i.d {

    /* renamed from: a  reason: collision with root package name */
    private static float[] f3973a = new float[4];

    /* renamed from: b  reason: collision with root package name */
    private static final Matrix f3974b = new Matrix();

    /* renamed from: c  reason: collision with root package name */
    private static final Matrix f3975c = new Matrix();

    /* renamed from: d  reason: collision with root package name */
    private c f3976d;
    private final List<com.facebook.react.views.b.a> e;
    private com.facebook.react.views.b.a f;
    private com.facebook.react.views.b.a g;
    private Drawable h;
    private int i;
    private int j;
    private float k;
    private float l;
    private float[] m;
    private o.b n;
    private boolean o;
    private final com.facebook.f.c.b p;
    private final a q;
    private com.facebook.imagepipeline.l.a r;
    private com.facebook.f.c.d s;
    private com.facebook.f.c.d t;
    private com.facebook.react.views.image.a u;
    private final Object v;
    private int w;
    private boolean x;
    private an y;

    private void a(String str) {
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReactImageView.java */
    /* loaded from: classes.dex */
    public class a extends com.facebook.imagepipeline.n.a {
        private a() {
        }

        void a(Bitmap bitmap, float[] fArr, float[] fArr2) {
            e.this.n.a(e.f3974b, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), bitmap.getWidth(), bitmap.getHeight(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            e.f3974b.invert(e.f3975c);
            fArr2[0] = e.f3975c.mapRadius(fArr[0]);
            fArr2[1] = fArr2[0];
            fArr2[2] = e.f3975c.mapRadius(fArr[1]);
            fArr2[3] = fArr2[2];
            fArr2[4] = e.f3975c.mapRadius(fArr[2]);
            fArr2[5] = fArr2[4];
            fArr2[6] = e.f3975c.mapRadius(fArr[3]);
            fArr2[7] = fArr2[6];
        }

        @Override // com.facebook.imagepipeline.n.a
        public void a(Bitmap bitmap, Bitmap bitmap2) {
            e.this.a(e.f3973a);
            bitmap.setHasAlpha(true);
            if (com.facebook.react.uimanager.c.a(e.f3973a[0], BitmapDescriptorFactory.HUE_RED) && com.facebook.react.uimanager.c.a(e.f3973a[1], BitmapDescriptorFactory.HUE_RED) && com.facebook.react.uimanager.c.a(e.f3973a[2], BitmapDescriptorFactory.HUE_RED) && com.facebook.react.uimanager.c.a(e.f3973a[3], BitmapDescriptorFactory.HUE_RED)) {
                super.a(bitmap, bitmap2);
                return;
            }
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setShader(new BitmapShader(bitmap2, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
            Canvas canvas = new Canvas(bitmap);
            float[] fArr = new float[8];
            a(bitmap2, e.f3973a, fArr);
            Path path = new Path();
            path.addRoundRect(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bitmap2.getWidth(), bitmap2.getHeight()), fArr, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    private static com.facebook.f.f.a a(Context context) {
        return new com.facebook.f.f.b(context.getResources()).a(com.facebook.f.f.d.b(BitmapDescriptorFactory.HUE_RED)).s();
    }

    public e(Context context, com.facebook.f.c.b bVar, com.facebook.react.views.image.a aVar, Object obj) {
        super(context, a(context));
        this.f3976d = c.AUTO;
        this.l = Float.NaN;
        this.w = -1;
        this.n = d.a();
        this.p = bVar;
        this.q = new a();
        this.u = aVar;
        this.v = obj;
        this.e = new LinkedList();
    }

    public void setShouldNotifyLoadEvents(boolean z) {
        if (!z) {
            this.s = null;
        } else {
            final com.facebook.react.uimanager.events.c eventDispatcher = ((UIManagerModule) ((aj) getContext()).b(UIManagerModule.class)).getEventDispatcher();
            this.s = new com.facebook.f.c.c<com.facebook.imagepipeline.i.e>() { // from class: com.facebook.react.views.image.e.1
                @Override // com.facebook.f.c.c, com.facebook.f.c.d
                public void a(String str, Object obj) {
                    eventDispatcher.a(new b(e.this.getId(), 4));
                }

                @Override // com.facebook.f.c.c, com.facebook.f.c.d
                public void a(String str, com.facebook.imagepipeline.i.e eVar, Animatable animatable) {
                    if (eVar != null) {
                        eventDispatcher.a(new b(e.this.getId(), 2, e.this.f.a(), eVar.f(), eVar.g()));
                        eventDispatcher.a(new b(e.this.getId(), 3));
                    }
                }

                @Override // com.facebook.f.c.c, com.facebook.f.c.d
                public void b(String str, Throwable th) {
                    eventDispatcher.a(new b(e.this.getId(), 1));
                    eventDispatcher.a(new b(e.this.getId(), 3));
                }
            };
        }
        this.o = true;
    }

    public void setBlurRadius(float f) {
        int a2 = (int) com.facebook.react.uimanager.o.a(f);
        if (a2 == 0) {
            this.r = null;
        } else {
            this.r = new com.facebook.imagepipeline.l.a(a2);
        }
        this.o = true;
    }

    public void setBorderColor(int i) {
        this.i = i;
        this.o = true;
    }

    public void setOverlayColor(int i) {
        this.j = i;
        this.o = true;
    }

    public void setBorderWidth(float f) {
        this.k = com.facebook.react.uimanager.o.a(f);
        this.o = true;
    }

    public void setBorderRadius(float f) {
        if (!com.facebook.react.uimanager.c.a(this.l, f)) {
            this.l = f;
            this.o = true;
        }
    }

    public void a(float f, int i) {
        if (this.m == null) {
            this.m = new float[4];
            Arrays.fill(this.m, Float.NaN);
        }
        if (!com.facebook.react.uimanager.c.a(this.m[i], f)) {
            this.m[i] = f;
            this.o = true;
        }
    }

    public void setScaleType(o.b bVar) {
        this.n = bVar;
        this.o = true;
    }

    public void setResizeMethod(c cVar) {
        this.f3976d = cVar;
        this.o = true;
    }

    public void setSource(am amVar) {
        this.e.clear();
        if (amVar != null && amVar.size() != 0) {
            if (amVar.size() == 1) {
                String string = amVar.c(0).getString("uri");
                com.facebook.react.views.b.a aVar = new com.facebook.react.views.b.a(getContext(), string);
                this.e.add(aVar);
                if (Uri.EMPTY.equals(aVar.b())) {
                    a(string);
                }
            } else {
                for (int i = 0; i < amVar.size(); i++) {
                    an c2 = amVar.c(i);
                    String string2 = c2.getString("uri");
                    com.facebook.react.views.b.a aVar2 = new com.facebook.react.views.b.a(getContext(), string2, c2.getDouble("width"), c2.getDouble("height"));
                    this.e.add(aVar2);
                    if (Uri.EMPTY.equals(aVar2.b())) {
                        a(string2);
                    }
                }
            }
        }
        this.o = true;
    }

    public void setLoadingIndicatorSource(String str) {
        Drawable b2 = com.facebook.react.views.b.c.a().b(getContext(), str);
        this.h = b2 != null ? new com.facebook.f.e.b(b2, NetstatsParserPatterns.NEW_TS_TO_MILLIS) : null;
        this.o = true;
    }

    public void setProgressiveRenderingEnabled(boolean z) {
        this.x = z;
    }

    public void setFadeDuration(int i) {
        this.w = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float[] fArr) {
        float f = !com.facebook.yoga.a.a(this.l) ? this.l : BitmapDescriptorFactory.HUE_RED;
        fArr[0] = (this.m == null || com.facebook.yoga.a.a(this.m[0])) ? f : this.m[0];
        fArr[1] = (this.m == null || com.facebook.yoga.a.a(this.m[1])) ? f : this.m[1];
        fArr[2] = (this.m == null || com.facebook.yoga.a.a(this.m[2])) ? f : this.m[2];
        if (this.m != null && !com.facebook.yoga.a.a(this.m[3])) {
            f = this.m[3];
        }
        fArr[3] = f;
    }

    public void setHeaders(an anVar) {
        this.y = anVar;
    }

    public void e() {
        int i;
        com.facebook.imagepipeline.n.e eVar;
        if (!this.o) {
            return;
        }
        if (i() && (getWidth() <= 0 || getHeight() <= 0)) {
            return;
        }
        j();
        if (this.f == null) {
            return;
        }
        boolean a2 = a(this.f);
        if (a2 && (getWidth() <= 0 || getHeight() <= 0)) {
            return;
        }
        com.facebook.f.f.a hierarchy = getHierarchy();
        hierarchy.a(this.n);
        if (this.h != null) {
            hierarchy.a(this.h, o.b.e);
        }
        boolean z = (this.n == o.b.g || this.n == o.b.h) ? false : true;
        com.facebook.f.f.d c2 = hierarchy.c();
        if (z) {
            c2.a(BitmapDescriptorFactory.HUE_RED);
        } else {
            a(f3973a);
            c2.a(f3973a[0], f3973a[1], f3973a[2], f3973a[3]);
        }
        c2.a(this.i, this.k);
        if (this.j != 0) {
            c2.a(this.j);
        } else {
            c2.a(d.a.BITMAP_ONLY);
        }
        hierarchy.a(c2);
        if (this.w >= 0) {
            i = this.w;
        } else {
            i = this.f.d() ? 0 : 300;
        }
        hierarchy.a(i);
        com.facebook.imagepipeline.e.d dVar = null;
        if (z) {
            eVar = this.q;
        } else {
            eVar = this.r != null ? this.r : null;
        }
        if (a2) {
            dVar = new com.facebook.imagepipeline.e.d(getWidth(), getHeight());
        }
        com.facebook.react.modules.fresco.a a3 = com.facebook.react.modules.fresco.a.a(com.facebook.imagepipeline.n.c.a(this.f.b()).a(eVar).a(dVar).a(true).b(this.x), this.y);
        if (this.u != null) {
            this.u.a(this.f.b());
        }
        this.p.e();
        this.p.a(true).e(this.v).b(getController()).b((com.facebook.f.c.b) a3);
        if (this.g != null) {
            this.p.c((com.facebook.f.c.b) com.facebook.imagepipeline.n.c.a(this.g.b()).a(eVar).a(dVar).a(true).b(this.x).n());
        }
        if (this.s != null && this.t != null) {
            f fVar = new f();
            fVar.a(this.s);
            fVar.a(this.t);
            this.p.a((com.facebook.f.c.d) fVar);
        } else if (this.t != null) {
            this.p.a(this.t);
        } else if (this.s != null) {
            this.p.a(this.s);
        }
        setController(this.p.q());
        this.o = false;
        this.p.e();
    }

    public void setControllerListener(com.facebook.f.c.d dVar) {
        this.t = dVar;
        this.o = true;
        e();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.o = this.o || i();
        e();
    }

    private boolean i() {
        return this.e.size() > 1;
    }

    private void j() {
        this.f = null;
        if (this.e.isEmpty()) {
            return;
        }
        if (i()) {
            b.a a2 = com.facebook.react.views.b.b.a(getWidth(), getHeight(), this.e);
            this.f = a2.a();
            this.g = a2.b();
            return;
        }
        this.f = this.e.get(0);
    }

    private boolean a(com.facebook.react.views.b.a aVar) {
        return this.f3976d == c.AUTO ? com.facebook.common.l.f.c(aVar.b()) || com.facebook.common.l.f.b(aVar.b()) : this.f3976d == c.RESIZE;
    }
}
