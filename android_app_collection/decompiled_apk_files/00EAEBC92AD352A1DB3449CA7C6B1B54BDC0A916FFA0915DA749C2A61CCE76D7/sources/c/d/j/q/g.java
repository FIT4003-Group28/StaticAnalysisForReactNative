package c.d.j.q;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Build;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class g implements c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f3664a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3665b;

    public g(boolean z, int i) {
        this.f3664a = z;
        this.f3665b = i;
    }

    private int b(c.d.j.k.d dVar, c.d.j.e.f fVar, c.d.j.e.e eVar) {
        if (!this.f3664a) {
            return 1;
        }
        return a.a(fVar, eVar, dVar, this.f3665b);
    }

    private static Bitmap.CompressFormat b(c.d.i.c cVar) {
        if (cVar != null && cVar != c.d.i.b.f3144a) {
            return cVar == c.d.i.b.f3145b ? Bitmap.CompressFormat.PNG : (Build.VERSION.SDK_INT < 14 || !c.d.i.b.a(cVar)) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    @Override // c.d.j.q.c
    public b a(c.d.j.k.d dVar, OutputStream outputStream, c.d.j.e.f fVar, c.d.j.e.e eVar, c.d.i.c cVar, Integer num) {
        g gVar;
        c.d.j.e.f fVar2;
        c.d.j.e.e eVar2;
        Bitmap bitmap;
        Throwable th;
        OutOfMemoryError e2;
        Integer num2 = num == null ? 85 : num;
        if (fVar == null) {
            eVar2 = eVar;
            fVar2 = c.d.j.e.f.e();
            gVar = this;
        } else {
            gVar = this;
            fVar2 = fVar;
            eVar2 = eVar;
        }
        int b2 = gVar.b(dVar, fVar2, eVar2);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = b2;
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(dVar.h(), null, options);
            if (decodeStream == null) {
                c.d.d.e.a.b("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new b(2);
            }
            Matrix a2 = e.a(dVar, fVar2);
            if (a2 != null) {
                try {
                    bitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), a2, false);
                } catch (OutOfMemoryError e3) {
                    e2 = e3;
                    bitmap = decodeStream;
                    c.d.d.e.a.b("SimpleImageTranscoder", "Out-Of-Memory during transcode", e2);
                    b bVar = new b(2);
                    bitmap.recycle();
                    decodeStream.recycle();
                    return bVar;
                } catch (Throwable th2) {
                    th = th2;
                    bitmap = decodeStream;
                    bitmap.recycle();
                    decodeStream.recycle();
                    throw th;
                }
            } else {
                bitmap = decodeStream;
            }
            try {
                try {
                    bitmap.compress(b(cVar), num2.intValue(), outputStream);
                    int i = 1;
                    if (b2 > 1) {
                        i = 0;
                    }
                    b bVar2 = new b(i);
                    bitmap.recycle();
                    decodeStream.recycle();
                    return bVar2;
                } catch (OutOfMemoryError e4) {
                    e2 = e4;
                    c.d.d.e.a.b("SimpleImageTranscoder", "Out-Of-Memory during transcode", e2);
                    b bVar3 = new b(2);
                    bitmap.recycle();
                    decodeStream.recycle();
                    return bVar3;
                }
            } catch (Throwable th3) {
                th = th3;
                bitmap.recycle();
                decodeStream.recycle();
                throw th;
            }
        } catch (OutOfMemoryError e5) {
            c.d.d.e.a.b("SimpleImageTranscoder", "Out-Of-Memory during transcode", e5);
            return new b(2);
        }
    }

    @Override // c.d.j.q.c
    public String a() {
        return "SimpleImageTranscoder";
    }

    @Override // c.d.j.q.c
    public boolean a(c.d.i.c cVar) {
        return cVar == c.d.i.b.k || cVar == c.d.i.b.f3144a;
    }

    @Override // c.d.j.q.c
    public boolean a(c.d.j.k.d dVar, c.d.j.e.f fVar, c.d.j.e.e eVar) {
        if (fVar == null) {
            fVar = c.d.j.e.f.e();
        }
        return this.f3664a && a.a(fVar, eVar, dVar, this.f3665b) > 1;
    }
}
