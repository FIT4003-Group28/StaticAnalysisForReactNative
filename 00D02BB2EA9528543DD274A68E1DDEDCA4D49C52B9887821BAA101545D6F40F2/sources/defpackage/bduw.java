package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: bduw  reason: default package */
/* loaded from: classes3.dex */
public final class bduw implements bbtt {
    private static final dcqe a = dcqe.c("bduw");
    private static final Bitmap.Config b = Bitmap.Config.ARGB_8888;
    private final Context c;

    public bduw(Application application) {
        this.c = application;
    }

    private static int d(String str) {
        try {
            int c = new aok(str).c(0);
            if (c == 3) {
                return 180;
            }
            if (c == 6) {
                return 90;
            }
            return c != 8 ? 0 : 270;
        } catch (IOException unused) {
            return 0;
        }
    }

    private final int e(Uri uri) {
        Throwable th;
        InputStream inputStream;
        File file;
        FileOutputStream fileOutputStream = null;
        try {
            file = File.createTempFile("tmp_photo", ".jpg", this.c.getCacheDir());
            try {
                inputStream = this.c.getContentResolver().openInputStream(uri);
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        ddak.a(inputStream, fileOutputStream2);
                        fileOutputStream2.flush();
                        int d = d(file.getAbsolutePath());
                        try {
                            ddam.b(fileOutputStream2);
                        } catch (IOException unused) {
                        }
                        ddam.a(inputStream);
                        if (file != null && file.exists()) {
                            file.delete();
                        }
                        return d;
                    } catch (IOException | UnsupportedOperationException unused2) {
                        fileOutputStream = fileOutputStream2;
                        try {
                            ddam.b(fileOutputStream);
                        } catch (IOException unused3) {
                        }
                        ddam.a(inputStream);
                        if (file == null || !file.exists()) {
                            return 0;
                        }
                        file.delete();
                        return 0;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        try {
                            ddam.b(fileOutputStream);
                        } catch (IOException unused4) {
                        }
                        ddam.a(inputStream);
                        if (file != null && file.exists()) {
                            file.delete();
                        }
                        throw th;
                    }
                } catch (IOException | UnsupportedOperationException unused5) {
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException | UnsupportedOperationException unused6) {
                inputStream = null;
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
            }
        } catch (IOException | UnsupportedOperationException unused7) {
            inputStream = null;
            file = null;
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            file = null;
        }
    }

    private final InputStream f(Uri uri) {
        try {
            return this.c.getContentResolver().openInputStream(uri);
        } catch (SecurityException e) {
            throw new IOException(e);
        }
    }

    @Override // defpackage.bbtt
    @dzsi
    public final Bitmap a(Uri uri) {
        bvrj.UI_THREAD.d();
        int i = this.c.getResources().getDisplayMetrics().widthPixels;
        int i2 = this.c.getResources().getDisplayMetrics().heightPixels;
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        Bitmap.Config config = b;
        if (max <= 0 || min <= 0) {
            bvoo.h("Bitmap crop failed: widthRange=[%d-%d], viewHeight=%d", Integer.valueOf(max), Integer.valueOf(max), Integer.valueOf(min));
            return null;
        }
        Bitmap c = c(uri, config, max);
        int min2 = Math.min(min, c.getHeight());
        int max2 = Math.max(Math.round(min2 * (c.getWidth() / max)), min2);
        if (c.getHeight() <= max2) {
            return c;
        }
        Bitmap createBitmap = Bitmap.createBitmap(c, 0, (c.getHeight() / 2) - (max2 / 2), c.getWidth(), max2);
        c.recycle();
        return createBitmap;
    }

    @Override // defpackage.bbtt
    public final int[] b(Uri uri) {
        InputStream f = f(uri);
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(f, null, options);
            int[] iArr = {options.outWidth, options.outHeight};
            if (f != null) {
                f.close();
            }
            return iArr;
        } catch (Throwable th) {
            if (f != null) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    deki.a(th, th2);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #0 {all -> 0x00a0, blocks: (B:3:0x000b, B:5:0x0013, B:7:0x0016, B:8:0x0018, B:10:0x0023, B:12:0x0038, B:23:0x005f, B:27:0x0071, B:28:0x0077, B:31:0x007e, B:24:0x0065, B:13:0x0046, B:15:0x004e, B:36:0x0098, B:37:0x009f), top: B:45:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    @Override // defpackage.bbtt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap c(android.net.Uri r12, android.graphics.Bitmap.Config r13, int r14) {
        /*
            r11 = this;
            int[] r0 = r11.b(r12)
            r1 = 0
            r0 = r0[r1]
            java.io.InputStream r2 = r11.f(r12)
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> La0
            r3.<init>()     // Catch: java.lang.Throwable -> La0
            r4 = 1
            if (r14 <= 0) goto L18
            int r0 = r0 / r14
            if (r0 <= r4) goto L18
            r3.inSampleSize = r0     // Catch: java.lang.Throwable -> La0
        L18:
            r3.inPurgeable = r4     // Catch: java.lang.Throwable -> La0
            r3.inPreferredConfig = r13     // Catch: java.lang.Throwable -> La0
            r13 = 0
            android.graphics.Bitmap r13 = android.graphics.BitmapFactory.decodeStream(r2, r13, r3)     // Catch: java.lang.Throwable -> La0
            if (r13 == 0) goto L98
            int r0 = r13.getWidth()     // Catch: java.lang.Throwable -> La0
            android.graphics.Matrix r9 = new android.graphics.Matrix     // Catch: java.lang.Throwable -> La0
            r9.<init>()     // Catch: java.lang.Throwable -> La0
            java.lang.String r3 = r12.getScheme()     // Catch: java.lang.Throwable -> La0
            java.lang.String r4 = "file"
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Throwable -> La0
            if (r4 == 0) goto L46
            android.content.Context r1 = r11.c     // Catch: java.lang.Throwable -> La0
            java.lang.String r12 = defpackage.bdux.a(r1, r12)     // Catch: java.lang.Throwable -> La0
            defpackage.dbuh.d(r12)     // Catch: java.lang.Throwable -> La0
            int r1 = d(r12)     // Catch: java.lang.Throwable -> La0
            goto L52
        L46:
            java.lang.String r4 = "content"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> La0
            if (r3 == 0) goto L52
            int r1 = r11.e(r12)     // Catch: java.lang.Throwable -> La0
        L52:
            r12 = 90
            if (r1 == r12) goto L65
            r12 = 270(0x10e, float:3.78E-43)
            if (r1 != r12) goto L5b
            goto L65
        L5b:
            r12 = 180(0xb4, float:2.52E-43)
            if (r1 != r12) goto L6d
            r12 = 1127481344(0x43340000, float:180.0)
            r9.preRotate(r12)     // Catch: java.lang.Throwable -> La0
            goto L6d
        L65:
            float r12 = (float) r1     // Catch: java.lang.Throwable -> La0
            r9.preRotate(r12)     // Catch: java.lang.Throwable -> La0
            int r0 = r13.getHeight()     // Catch: java.lang.Throwable -> La0
        L6d:
            if (r14 <= 0) goto L77
            if (r0 <= r14) goto L77
            float r12 = (float) r14     // Catch: java.lang.Throwable -> La0
            float r14 = (float) r0     // Catch: java.lang.Throwable -> La0
            float r12 = r12 / r14
            r9.postScale(r12, r12)     // Catch: java.lang.Throwable -> La0
        L77:
            boolean r12 = r9.isIdentity()     // Catch: java.lang.Throwable -> La0
            if (r12 == 0) goto L7e
            goto L92
        L7e:
            r5 = 0
            r6 = 0
            int r7 = r13.getWidth()     // Catch: java.lang.Throwable -> La0
            int r8 = r13.getHeight()     // Catch: java.lang.Throwable -> La0
            r10 = 0
            r4 = r13
            android.graphics.Bitmap r12 = android.graphics.Bitmap.createBitmap(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> La0
            r13.recycle()     // Catch: java.lang.Throwable -> La0
            r13 = r12
        L92:
            if (r2 == 0) goto L97
            r2.close()
        L97:
            return r13
        L98:
            java.io.IOException r12 = new java.io.IOException     // Catch: java.lang.Throwable -> La0
            java.lang.String r13 = "Bitmap exists, but is corrupted."
            r12.<init>(r13)     // Catch: java.lang.Throwable -> La0
            throw r12     // Catch: java.lang.Throwable -> La0
        La0:
            r12 = move-exception
            if (r2 == 0) goto Lab
            r2.close()     // Catch: java.lang.Throwable -> La7
            goto Lab
        La7:
            r13 = move-exception
            defpackage.deki.a(r12, r13)
        Lab:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bduw.c(android.net.Uri, android.graphics.Bitmap$Config, int):android.graphics.Bitmap");
    }
}
