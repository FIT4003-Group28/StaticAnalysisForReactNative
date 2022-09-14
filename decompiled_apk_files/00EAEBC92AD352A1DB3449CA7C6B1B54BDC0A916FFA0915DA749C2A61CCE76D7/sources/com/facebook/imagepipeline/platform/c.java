package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import c.d.d.d.n;
import c.d.d.g.i;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.FileDescriptor;
import java.io.OutputStream;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class c extends DalvikPurgeableDecoder {

    /* renamed from: d  reason: collision with root package name */
    private static Method f5292d;

    /* renamed from: c  reason: collision with root package name */
    private final c.d.d.l.b f5293c = c.d.d.l.c.b();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Bitmap a(c.d.d.h.a<c.d.d.g.g> r2, int r3, byte[] r4, android.graphics.BitmapFactory.Options r5) {
        /*
            r1 = this;
            r0 = 0
            android.os.MemoryFile r2 = a(r2, r3, r4)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2f
            java.io.FileDescriptor r3 = r1.a(r2)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
            c.d.d.l.b r4 = r1.f5293c     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
            if (r4 == 0) goto L20
            c.d.d.l.b r4 = r1.f5293c     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
            android.graphics.Bitmap r3 = r4.a(r3, r0, r5)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
            java.lang.String r4 = "BitmapFactory returned null"
            c.d.d.d.i.a(r3, r4)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
            if (r2 == 0) goto L1f
            r2.close()
        L1f:
            return r3
        L20:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
            java.lang.String r4 = "WebpBitmapFactory is null"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
            throw r3     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
        L28:
            r3 = move-exception
            goto L35
        L2a:
            r3 = move-exception
            goto L31
        L2c:
            r3 = move-exception
            r2 = r0
            goto L35
        L2f:
            r3 = move-exception
            r2 = r0
        L31:
            c.d.d.d.n.a(r3)     // Catch: java.lang.Throwable -> L28
            throw r0
        L35:
            if (r2 == 0) goto L3a
            r2.close()
        L3a:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.c.a(c.d.d.h.a, int, byte[], android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3 */
    private static MemoryFile a(c.d.d.h.a<c.d.d.g.g> aVar, int i, byte[] bArr) {
        OutputStream outputStream;
        i iVar;
        c.d.d.j.a aVar2 = null;
        OutputStream outputStream2 = null;
        aVar2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i);
        memoryFile.allowPurging(false);
        try {
            iVar = new i(aVar.b());
            try {
                c.d.d.j.a aVar3 = new c.d.d.j.a(iVar, i);
                try {
                    outputStream2 = memoryFile.getOutputStream();
                    c.d.d.d.a.a(aVar3, outputStream2);
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i, bArr.length);
                    }
                    c.d.d.h.a.b(aVar);
                    c.d.d.d.b.a(iVar);
                    c.d.d.d.b.a(aVar3);
                    c.d.d.d.b.a(outputStream2, true);
                    return memoryFile;
                } catch (Throwable th) {
                    th = th;
                    outputStream = outputStream2;
                    aVar2 = aVar3;
                    c.d.d.h.a.b(aVar);
                    c.d.d.d.b.a(iVar);
                    c.d.d.d.b.a(aVar2);
                    c.d.d.d.b.a(outputStream, true);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
            iVar = null;
        }
    }

    private FileDescriptor a(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) a().invoke(memoryFile, new Object[0]);
        } catch (Exception e2) {
            n.a(e2);
            throw null;
        }
    }

    private synchronized Method a() {
        if (f5292d == null) {
            try {
                f5292d = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
            } catch (Exception e2) {
                n.a(e2);
                throw null;
            }
        }
        return f5292d;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap a(c.d.d.h.a<c.d.d.g.g> aVar, int i, BitmapFactory.Options options) {
        return a(aVar, i, DalvikPurgeableDecoder.a(aVar, i) ? null : DalvikPurgeableDecoder.f5278b, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap a(c.d.d.h.a<c.d.d.g.g> aVar, BitmapFactory.Options options) {
        return a(aVar, aVar.b().size(), (byte[]) null, options);
    }
}
