package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.net.Uri;
import com.facebook.react.bridge.an;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ImageShadowNode.java */
/* loaded from: classes.dex */
class p extends RenderableShadowNode {
    private static final float[] k = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private String f4898a;

    /* renamed from: b  reason: collision with root package name */
    private String f4899b;

    /* renamed from: c  reason: collision with root package name */
    private String f4900c;

    /* renamed from: d  reason: collision with root package name */
    private String f4901d;
    private Uri e;
    private int f;
    private int g;
    private String h;
    private int i;
    private final AtomicBoolean j = new AtomicBoolean(false);
    private Matrix l = null;

    @com.facebook.react.uimanager.a.a(a = "x")
    public void setX(String str) {
        this.f4898a = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "y")
    public void setY(String str) {
        this.f4899b = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "width")
    public void setWidth(String str) {
        this.f4900c = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "height")
    public void seHeight(String str) {
        this.f4901d = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "src")
    public void setSrc(an anVar) {
        String string;
        if (anVar == null || (string = anVar.getString("uri")) == null || string.isEmpty()) {
            return;
        }
        if (anVar.hasKey("width") && anVar.hasKey("height")) {
            this.f = anVar.getInt("width");
            this.g = anVar.getInt("height");
        } else {
            this.f = 0;
            this.g = 0;
        }
        this.e = Uri.parse(string);
        if (this.e.getScheme() != null) {
            return;
        }
        this.e = com.facebook.react.views.b.c.a().c(getThemedContext(), string);
    }

    @com.facebook.react.uimanager.a.a(a = "align")
    public void setAlign(String str) {
        this.h = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "meetOrSlice")
    public void setMeetOrSlice(int i) {
        this.i = i;
        markUpdated();
    }

    @Override // com.horcrux.svg.RenderableShadowNode, com.horcrux.svg.am
    @com.facebook.react.uimanager.a.a(a = "matrix")
    public void setMatrix(com.facebook.react.bridge.am amVar) {
        if (amVar != null) {
            int a2 = w.a(amVar, k, this.mScale);
            if (a2 == 6) {
                if (this.l == null) {
                    this.l = new Matrix();
                }
                this.l.setValues(k);
            } else if (a2 != -1) {
                com.facebook.common.e.a.c("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.l = null;
        }
        markUpdated();
    }

    @Override // com.horcrux.svg.RenderableShadowNode, com.horcrux.svg.am
    public void draw(Canvas canvas, Paint paint, float f) {
        if (!this.j.get()) {
            com.facebook.imagepipeline.n.b n = com.facebook.imagepipeline.n.c.a(this.e).n();
            if (com.facebook.f.a.a.c.c().a(n)) {
                b(n, canvas, paint, f * this.mOpacity);
            } else {
                a(n, canvas, paint, f * this.mOpacity);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.horcrux.svg.RenderableShadowNode, com.horcrux.svg.am
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        path.addRect(a(), Path.Direction.CW);
        return path;
    }

    private void a(com.facebook.imagepipeline.n.b bVar, final Canvas canvas, final Paint paint, final float f) {
        com.facebook.f.a.a.c.c().b(bVar, getThemedContext()).a(new com.facebook.imagepipeline.g.b() { // from class: com.horcrux.svg.p.1
            @Override // com.facebook.imagepipeline.g.b
            public void a(Bitmap bitmap) {
                p.this.j.set(false);
                p.this.a(bitmap, canvas, paint, f * p.this.mOpacity);
            }

            @Override // com.facebook.c.b
            public void f(com.facebook.c.c<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> cVar) {
                p.this.j.set(false);
                com.facebook.common.e.a.a("ReactNative", cVar.f(), "RNSVG: fetchDecodedImage failed!", new Object[0]);
            }
        }, com.facebook.common.b.f.b());
    }

    private RectF a() {
        double relativeOnWidth = relativeOnWidth(this.f4898a);
        double relativeOnHeight = relativeOnHeight(this.f4899b);
        double relativeOnWidth2 = relativeOnWidth(this.f4900c);
        double relativeOnHeight2 = relativeOnHeight(this.f4901d);
        if (relativeOnWidth2 == 0.0d) {
            relativeOnWidth2 = this.f * this.mScale;
        }
        if (relativeOnHeight2 == 0.0d) {
            relativeOnHeight2 = this.g * this.mScale;
        }
        return new RectF((float) relativeOnWidth, (float) relativeOnHeight, (float) (relativeOnWidth + relativeOnWidth2), (float) (relativeOnHeight + relativeOnHeight2));
    }

    private void a(Canvas canvas, Paint paint, Bitmap bitmap, float f) {
        if (this.f == 0 || this.g == 0) {
            this.f = bitmap.getWidth();
            this.g = bitmap.getHeight();
        }
        RectF a2 = a();
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f, this.g);
        al.a(rectF, a2, this.h, this.i).mapRect(rectF);
        if (this.l != null) {
            this.l.mapRect(rectF);
        }
        Path path = new Path();
        Path clipPath = getClipPath(canvas, paint);
        Path path2 = getPath(canvas, paint);
        if (clipPath != null) {
            path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
            Path path3 = new Path();
            path3.setFillType(Path.FillType.INVERSE_WINDING);
            path3.addPath(path2);
            path3.addPath(clipPath);
            Path path4 = new Path();
            path4.setFillType(Path.FillType.EVEN_ODD);
            path4.addPath(path2);
            path4.addPath(clipPath);
            canvas.clipPath(path4, Region.Op.DIFFERENCE);
            canvas.clipPath(path3, Region.Op.DIFFERENCE);
        } else {
            canvas.clipPath(path2, Region.Op.REPLACE);
        }
        Paint paint2 = new Paint();
        paint2.setAlpha((int) (f * 255.0f));
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint2);
    }

    private void b(com.facebook.imagepipeline.n.b bVar, Canvas canvas, Paint paint, float f) {
        Bitmap a2;
        com.facebook.c.c<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> a3 = com.facebook.f.a.a.c.c().a(bVar, getThemedContext());
        try {
            try {
                com.facebook.common.h.a<com.facebook.imagepipeline.i.b> d2 = a3.d();
                if (d2 != null) {
                    try {
                        try {
                            if ((d2.a() instanceof com.facebook.imagepipeline.i.a) && (a2 = ((com.facebook.imagepipeline.i.a) d2.a()).a()) != null) {
                                a(canvas, paint, a2, f);
                            }
                        } catch (Exception e) {
                            throw new IllegalStateException(e);
                        }
                    } finally {
                        com.facebook.common.h.a.c(d2);
                    }
                }
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        } finally {
            a3.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bitmap bitmap, Canvas canvas, Paint paint, float f) {
        if (bitmap != null) {
            try {
                a(canvas, paint, bitmap, f);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
