package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: hux  reason: default package */
/* loaded from: classes3.dex */
public final class hux {
    public final ajmy b;
    public final eym c;
    public final Executor d;
    public final hvk e;
    private final Map g = DesugarCollections.synchronizedMap(new HashMap());
    public final Map a = DesugarCollections.synchronizedMap(new HashMap());
    public int f = 3;

    public hux(Context context, ajmy ajmyVar, Executor executor, hvk hvkVar) {
        this.b = ajmyVar;
        this.d = executor;
        this.e = hvkVar;
        this.c = new eym(context);
    }

    public static boolean c(Uri uri) {
        return uri.getLastPathSegment().endsWith(".png");
    }

    public static byte[] d(byte[] bArr, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        yuo yuoVar = new yuo();
        decodeByteArray.compress(Bitmap.CompressFormat.PNG, 100, yuoVar);
        return yuoVar.toByteArray();
    }

    public final void a(final Uri uri, final yiw yiwVar) {
        if (uri == null) {
            yiwVar.a(null, new NullPointerException());
        } else if (this.g.containsKey(uri)) {
            try {
                yiwVar.b(uri, this.c.b((byte[]) this.g.get(uri)));
            } catch (zhy e) {
                yiwVar.a(uri, e);
            }
        } else {
            final yiy c = yiy.c(yiwVar);
            this.a.put(uri, c);
            final int i = this.f;
            this.d.execute(new Runnable() { // from class: huu
                @Override // java.lang.Runnable
                public final void run() {
                    hux huxVar = hux.this;
                    Uri uri2 = uri;
                    int i2 = i;
                    yiy yiyVar = c;
                    yiw yiwVar2 = yiwVar;
                    hvk hvkVar = huxVar.e;
                    String lastPathSegment = uri2.getLastPathSegment();
                    ylr.b();
                    znh znhVar = hvkVar.a;
                    byte[] bArr = null;
                    if (znhVar != null) {
                        ylr.b();
                        File file = znhVar.a;
                        if (file != null) {
                            try {
                                File file2 = new File(file, lastPathSegment);
                                if (file2.exists()) {
                                    FileInputStream fileInputStream = new FileInputStream(file2);
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    byte[] bArr2 = new byte[1024];
                                    while (true) {
                                        int read = fileInputStream.read(bArr2);
                                        if (read <= 0) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(bArr2, 0, read);
                                    }
                                    bArr = byteArrayOutputStream.toByteArray();
                                }
                            } catch (IOException | SecurityException e2) {
                                zep.d("Error getting file", e2);
                            }
                        }
                    }
                    if (bArr == null) {
                        huxVar.b.m(uri2, new huw(huxVar, yiyVar, uri2, huxVar.f));
                        return;
                    }
                    if (hux.c(uri2)) {
                        bArr = hux.d(bArr, i2);
                    }
                    huxVar.b(uri2, bArr);
                    try {
                        yiyVar.b(uri2, huxVar.c.b(bArr));
                    } catch (zhy e3) {
                        yiwVar2.a(uri2, e3);
                    }
                }
            });
        }
    }

    public final void b(Uri uri, byte[] bArr) {
        this.g.put(uri, bArr);
    }
}
