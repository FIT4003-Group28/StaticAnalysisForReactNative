package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipException;
/* compiled from: PG */
/* renamed from: en  reason: default package */
/* loaded from: classes.dex */
public final class en {
    public static long a(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    public static long b(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            long length = randomAccessFile.length() - 22;
            if (length >= 0) {
                long j = (-65536) + length;
                if (j < 0) {
                    j = 0;
                }
                int reverseBytes = Integer.reverseBytes(101010256);
                do {
                    randomAccessFile.seek(length);
                    if (randomAccessFile.readInt() == reverseBytes) {
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        eo eoVar = new eo();
                        eoVar.b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                        eoVar.a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                        CRC32 crc32 = new CRC32();
                        long j2 = eoVar.b;
                        randomAccessFile.seek(eoVar.a);
                        byte[] bArr = new byte[16384];
                        int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j2));
                        while (read != -1) {
                            crc32.update(bArr, 0, read);
                            j2 -= read;
                            if (j2 == 0) {
                                break;
                            }
                            read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j2));
                        }
                        long value = crc32.getValue();
                        randomAccessFile.close();
                        return value == -1 ? value - 1 : value;
                    }
                    length--;
                } while (length >= j);
                throw new ZipException("End Of Central Directory signature not found");
            }
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0271, code lost:
        r9 = r9 + 1;
        r8 = r7.getEntry("classes" + r9 + ".dex");
        r0 = r17;
        r1 = r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<defpackage.em> c(java.io.File r16, java.io.File r17) {
        /*
            Method dump skipped, instructions count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en.c(java.io.File, java.io.File):java.util.List");
    }

    public static void d(Context context, long j, long j2, List<em> list) {
        SharedPreferences.Editor edit = e(context).edit();
        edit.putLong("timestamp", j);
        edit.putLong("crc", j2);
        edit.putInt("dex.number", list.size() + 1);
        int i = 2;
        for (em emVar : list) {
            edit.putLong("dex.crc." + i, emVar.a);
            edit.putLong("dex.time." + i, emVar.lastModified());
            i++;
        }
        edit.commit();
    }

    public static SharedPreferences e(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    public static void f(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
