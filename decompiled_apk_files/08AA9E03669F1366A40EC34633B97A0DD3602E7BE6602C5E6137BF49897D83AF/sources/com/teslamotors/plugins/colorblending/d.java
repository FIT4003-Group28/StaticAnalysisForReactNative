package com.teslamotors.plugins.colorblending;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.facebook.b.a.i;
import com.facebook.c.e;
import com.facebook.common.b.f;
import com.facebook.imagepipeline.f.j;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.File;
import java.lang.ref.WeakReference;
/* compiled from: ColorPostprocessor.java */
/* loaded from: classes.dex */
public class d extends com.facebook.imagepipeline.n.a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f5364b = "d";
    private static final ColorMatrixColorFilter f = new ColorMatrixColorFilter(new ColorMatrix(new float[]{1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 255.0f}));

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<a> f5365c;

    /* renamed from: d  reason: collision with root package name */
    private c f5366d;
    private boolean e = false;

    public d(c cVar, a aVar) {
        this.f5366d = cVar;
        this.f5365c = new WeakReference<>(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap b(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ALPHA_8);
        Paint paint = new Paint();
        paint.setColorFilter(f);
        new Canvas(createBitmap).drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        return createBitmap;
    }

    public Uri a(String str) {
        return new com.facebook.react.views.b.a(this.f5365c.get().getContext(), str).b();
    }

    private void c(final Bitmap bitmap) {
        j.a().i().b(com.facebook.imagepipeline.n.c.a(a(this.f5366d.d())).n(), this.f5365c.get().getContext()).a(new e<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>>() { // from class: com.teslamotors.plugins.colorblending.d.1
            @Override // com.facebook.c.e
            public void b(com.facebook.c.c<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> cVar) {
            }

            @Override // com.facebook.c.e
            public void c(com.facebook.c.c<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> cVar) {
            }

            @Override // com.facebook.c.e
            public void d(com.facebook.c.c<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> cVar) {
            }

            @Override // com.facebook.c.e
            public void a(com.facebook.c.c<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> cVar) {
                if (bitmap == null || bitmap.isRecycled()) {
                    return;
                }
                if (!cVar.b()) {
                    cVar.h();
                    return;
                }
                com.facebook.common.h.a<com.facebook.imagepipeline.i.b> d2 = cVar.d();
                try {
                    d.this.b(bitmap, d.this.b(((com.facebook.imagepipeline.i.a) d2.a()).a()));
                    cVar.h();
                } finally {
                    com.facebook.common.h.a.c(d2);
                }
            }
        }, f.b());
    }

    void b(final Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap.isRecycled()) {
            Log.e(f5364b, String.format("Cannot postprocess image %s - bitmap has been recycled", this.f5366d.e()));
            return;
        }
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        if (this.f5366d.a() != 0.0d) {
            a(canvas, bitmap2, (int) this.f5366d.a(), paint);
        }
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
        paint.setColor(this.f5366d.f());
        canvas.drawBitmap(bitmap2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        if (this.f5366d.b() != 0.0d) {
            a(canvas, bitmap2, (int) this.f5366d.b(), paint);
        }
        paint.setXfermode(null);
        new AsyncTask() { // from class: com.teslamotors.plugins.colorblending.d.2
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
                if (r0 == false) goto L15;
             */
            /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // android.os.AsyncTask
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            protected java.lang.Object doInBackground(java.lang.Object[] r9) {
                /*
                    r8 = this;
                    r9 = 0
                    r0 = 1
                    r1 = 0
                    com.teslamotors.plugins.colorblending.d r2 = com.teslamotors.plugins.colorblending.d.this     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
                    com.teslamotors.plugins.colorblending.c r2 = com.teslamotors.plugins.colorblending.d.a(r2)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
                    java.io.File r2 = r2.g()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
                    boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                    if (r3 == 0) goto L14
                    return r1
                L14:
                    java.io.File r3 = r2.getParentFile()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                    r3.mkdirs()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                    android.graphics.Bitmap r3 = r2     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                    boolean r3 = r3.isRecycled()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                    if (r3 == 0) goto L25
                    r3 = r1
                    goto L3b
                L25:
                    java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                    r3.<init>(r2)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
                    android.graphics.Bitmap r4 = r2     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
                    android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
                    r6 = 100
                    boolean r4 = r4.compress(r5, r6, r3)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
                    r3.flush()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
                    if (r4 != 0) goto L3a
                    goto L3b
                L3a:
                    r0 = 0
                L3b:
                    if (r3 == 0) goto L40
                    r3.close()     // Catch: java.io.IOException -> L40
                L40:
                    if (r0 == 0) goto L6c
                    goto L69
                L43:
                    r0 = move-exception
                    r1 = r3
                    goto L71
                L46:
                    r4 = move-exception
                    goto L53
                L48:
                    r0 = move-exception
                    goto L71
                L4a:
                    r4 = move-exception
                    r3 = r1
                    goto L53
                L4d:
                    r0 = move-exception
                    r2 = r1
                    goto L71
                L50:
                    r4 = move-exception
                    r2 = r1
                    r3 = r2
                L53:
                    java.lang.String r5 = com.teslamotors.plugins.colorblending.d.c()     // Catch: java.lang.Throwable -> L6d
                    java.lang.String r6 = "Failed to write cached file %s"
                    java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L6d
                    r7[r9] = r2     // Catch: java.lang.Throwable -> L6d
                    java.lang.String r9 = java.lang.String.format(r6, r7)     // Catch: java.lang.Throwable -> L6d
                    android.util.Log.e(r5, r9, r4)     // Catch: java.lang.Throwable -> L6d
                    if (r3 == 0) goto L69
                    r3.close()     // Catch: java.io.IOException -> L69
                L69:
                    com.teslamotors.plugins.colorblending.d.a(r2)
                L6c:
                    return r1
                L6d:
                    r9 = move-exception
                    r0 = r9
                    r1 = r3
                    r9 = 1
                L71:
                    if (r1 == 0) goto L76
                    r1.close()     // Catch: java.io.IOException -> L76
                L76:
                    if (r9 == 0) goto L7b
                    com.teslamotors.plugins.colorblending.d.a(r2)
                L7b:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.plugins.colorblending.d.AnonymousClass2.doInBackground(java.lang.Object[]):java.lang.Object");
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
        this.f5365c.get().f();
    }

    @Override // com.facebook.imagepipeline.n.a
    public void a(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        if (this.f5366d.d() != null) {
            c(bitmap);
        } else {
            b(bitmap, bitmap.extractAlpha());
        }
    }

    private static void a(Canvas canvas, Bitmap bitmap, int i, Paint paint) {
        int argb = Color.argb(i, 255, 255, 255);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        paint.setColor(argb);
        canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
    }

    @Override // com.facebook.imagepipeline.n.a, com.facebook.imagepipeline.n.e
    public com.facebook.b.a.d a() {
        return new i(this.f5366d.e());
    }

    @Override // com.facebook.imagepipeline.n.a, com.facebook.imagepipeline.n.e
    public String b() {
        return f5364b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        try {
            file.delete();
        } catch (Exception unused) {
        }
    }
}
