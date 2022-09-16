package com.facebook.imagepipeline.k;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.common.d.m;
import com.facebook.common.g.g;
import com.facebook.common.g.i;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
/* compiled from: GingerbreadPurgeableDecoder.java */
/* loaded from: classes.dex */
public class c extends b {

    /* renamed from: b  reason: collision with root package name */
    private static Method f2720b;

    @Override // com.facebook.imagepipeline.k.b
    public /* bridge */ /* synthetic */ com.facebook.common.h.a a(Bitmap bitmap) {
        return super.a(bitmap);
    }

    @Override // com.facebook.imagepipeline.k.b, com.facebook.imagepipeline.k.e
    public /* bridge */ /* synthetic */ com.facebook.common.h.a a(com.facebook.imagepipeline.i.d dVar, Bitmap.Config config) {
        return super.a(dVar, config);
    }

    @Override // com.facebook.imagepipeline.k.b, com.facebook.imagepipeline.k.e
    public /* bridge */ /* synthetic */ com.facebook.common.h.a a(com.facebook.imagepipeline.i.d dVar, Bitmap.Config config, int i) {
        return super.a(dVar, config, i);
    }

    @Override // com.facebook.imagepipeline.k.b
    protected Bitmap a(com.facebook.common.h.a<g> aVar, BitmapFactory.Options options) {
        return a(aVar, aVar.a().a(), null, options);
    }

    @Override // com.facebook.imagepipeline.k.b
    protected Bitmap a(com.facebook.common.h.a<g> aVar, int i, BitmapFactory.Options options) {
        return a(aVar, i, a(aVar, i) ? null : f2718a, options);
    }

    private static MemoryFile a(com.facebook.common.h.a<g> aVar, int i, byte[] bArr) {
        i iVar;
        OutputStream outputStream;
        com.facebook.common.k.a aVar2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i);
        memoryFile.allowPurging(false);
        try {
            iVar = new i(aVar.a());
            try {
                com.facebook.common.k.a aVar3 = new com.facebook.common.k.a(iVar, i);
                try {
                    outputStream = memoryFile.getOutputStream();
                    try {
                        com.facebook.common.d.a.a(aVar3, outputStream);
                        if (bArr != null) {
                            memoryFile.writeBytes(bArr, 0, i, bArr.length);
                        }
                        com.facebook.common.h.a.c(aVar);
                        com.facebook.common.d.b.a(iVar);
                        com.facebook.common.d.b.a(aVar3);
                        com.facebook.common.d.b.a(outputStream, true);
                        return memoryFile;
                    } catch (Throwable th) {
                        th = th;
                        aVar2 = aVar3;
                        com.facebook.common.h.a.c(aVar);
                        com.facebook.common.d.b.a(iVar);
                        com.facebook.common.d.b.a(aVar2);
                        com.facebook.common.d.b.a(outputStream, true);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                outputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            iVar = null;
            outputStream = null;
        }
    }

    private synchronized Method a() {
        if (f2720b == null) {
            try {
                f2720b = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
            } catch (Exception e) {
                throw m.b(e);
            }
        }
        return f2720b;
    }

    private FileDescriptor a(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) a().invoke(memoryFile, new Object[0]);
        } catch (Exception e) {
            throw m.b(e);
        }
    }

    protected Bitmap a(com.facebook.common.h.a<g> aVar, int i, byte[] bArr, BitmapFactory.Options options) {
        MemoryFile memoryFile;
        try {
            try {
                memoryFile = a(aVar, i, bArr);
            } catch (Throwable th) {
                th = th;
                memoryFile = null;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            Bitmap bitmap = (Bitmap) com.facebook.common.d.i.a(com.facebook.common.m.c.f2332d.a(a(memoryFile), null, options), "BitmapFactory returned null");
            if (memoryFile != null) {
                memoryFile.close();
            }
            return bitmap;
        } catch (IOException e2) {
            e = e2;
            throw m.b(e);
        } catch (Throwable th2) {
            th = th2;
            if (memoryFile != null) {
                memoryFile.close();
            }
            throw th;
        }
    }
}
