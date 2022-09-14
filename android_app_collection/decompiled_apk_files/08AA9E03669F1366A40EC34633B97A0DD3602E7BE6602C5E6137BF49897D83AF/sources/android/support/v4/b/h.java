package android.support.v4.b;

import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
/* compiled from: TypefaceCompatUtil.java */
/* loaded from: classes.dex */
public class h {
    public static File a(Context context) {
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(context.getCacheDir(), str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    private static ByteBuffer a(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return map;
        } catch (IOException unused) {
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static java.nio.ByteBuffer a(android.content.Context r8, android.os.CancellationSignal r9, android.net.Uri r10) {
        /*
            android.content.ContentResolver r8 = r8.getContentResolver()
            r0 = 0
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r8 = r8.openFileDescriptor(r10, r1, r9)     // Catch: java.io.IOException -> L6b
            if (r8 != 0) goto L13
            if (r8 == 0) goto L12
            r8.close()     // Catch: java.io.IOException -> L6b
        L12:
            return r0
        L13:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L54
            java.io.FileDescriptor r10 = r8.getFileDescriptor()     // Catch: java.lang.Throwable -> L54
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L54
            java.nio.channels.FileChannel r1 = r9.getChannel()     // Catch: java.lang.Throwable -> L3a
            long r5 = r1.size()     // Catch: java.lang.Throwable -> L3a
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L3a
            r3 = 0
            java.nio.MappedByteBuffer r10 = r1.map(r2, r3, r5)     // Catch: java.lang.Throwable -> L3a
            if (r9 == 0) goto L31
            r9.close()     // Catch: java.lang.Throwable -> L54
        L31:
            if (r8 == 0) goto L36
            r8.close()     // Catch: java.io.IOException -> L6b
        L36:
            return r10
        L37:
            r10 = move-exception
            r1 = r0
            goto L40
        L3a:
            r10 = move-exception
            throw r10     // Catch: java.lang.Throwable -> L3c
        L3c:
            r1 = move-exception
            r7 = r1
            r1 = r10
            r10 = r7
        L40:
            if (r9 == 0) goto L50
            if (r1 == 0) goto L4d
            r9.close()     // Catch: java.lang.Throwable -> L48
            goto L50
        L48:
            r9 = move-exception
            r1.addSuppressed(r9)     // Catch: java.lang.Throwable -> L54
            goto L50
        L4d:
            r9.close()     // Catch: java.lang.Throwable -> L54
        L50:
            throw r10     // Catch: java.lang.Throwable -> L54
        L51:
            r9 = move-exception
            r10 = r0
            goto L5a
        L54:
            r9 = move-exception
            throw r9     // Catch: java.lang.Throwable -> L56
        L56:
            r10 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L5a:
            if (r8 == 0) goto L6a
            if (r10 == 0) goto L67
            r8.close()     // Catch: java.lang.Throwable -> L62
            goto L6a
        L62:
            r8 = move-exception
            r10.addSuppressed(r8)     // Catch: java.io.IOException -> L6b
            goto L6a
        L67:
            r8.close()     // Catch: java.io.IOException -> L6b
        L6a:
            throw r9     // Catch: java.io.IOException -> L6b
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.h.a(android.content.Context, android.os.CancellationSignal, android.net.Uri):java.nio.ByteBuffer");
    }

    public static ByteBuffer a(Context context, Resources resources, int i) {
        File a2 = a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (a(a2, resources, i)) {
                return a(a2);
            }
            return null;
        } finally {
            a2.delete();
        }
    }

    public static boolean a(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    a(fileOutputStream);
                    return true;
                }
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            a(fileOutputStream2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            a(fileOutputStream2);
            throw th;
        }
    }

    public static boolean a(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean a2 = a(file, inputStream);
                a(inputStream);
                return a2;
            } catch (Throwable th) {
                th = th;
                a(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
