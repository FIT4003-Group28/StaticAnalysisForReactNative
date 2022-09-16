package com.crashlytics.android.core;

import android.content.Context;
import b.a.a.a.a.b.i;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
final class NativeFileUtils {
    private NativeFileUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] readFile(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] readBytes = readBytes(fileInputStream);
                i.a((Closeable) fileInputStream);
                return readBytes;
            } catch (FileNotFoundException unused) {
                i.a((Closeable) fileInputStream);
                return null;
            } catch (IOException unused2) {
                i.a((Closeable) fileInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                i.a((Closeable) fileInputStream2);
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            fileInputStream = null;
        } catch (IOException unused4) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static byte[] readBytes(InputStream inputStream) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    private static File filter(File file, String str) {
        File[] listFiles;
        for (File file2 : file.listFiles()) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] minidumpFromDirectory(File file) {
        File filter = filter(file, ".dmp");
        return filter == null ? new byte[0] : minidumpFromFile(filter);
    }

    private static byte[] minidumpFromFile(File file) {
        return readFile(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] binaryImagesJsonFromDirectory(File file, Context context) {
        File filter = filter(file, ".maps");
        if (filter != null) {
            return binaryImagesJsonFromMapsFile(filter, context);
        }
        File filter2 = filter(file, ".binary_libs");
        if (filter2 == null) {
            return null;
        }
        return binaryImagesJsonFromBinaryLibsFile(filter2, context);
    }

    private static byte[] binaryImagesJsonFromBinaryLibsFile(File file, Context context) {
        byte[] readFile = readFile(file);
        if (readFile == null || readFile.length == 0) {
            return null;
        }
        return processBinaryImages(context, new String(readFile));
    }

    private static byte[] binaryImagesJsonFromMapsFile(File file, Context context) {
        BufferedReader bufferedReader;
        if (!file.exists()) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            try {
                byte[] convert = new BinaryImagesConverter(context, new Sha1FileIdStrategy()).convert(bufferedReader);
                i.a(bufferedReader);
                return convert;
            } catch (Throwable th) {
                th = th;
                i.a(bufferedReader);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] metadataJsonFromDirectory(File file) {
        File filter = filter(file, ".device_info");
        if (filter == null) {
            return null;
        }
        return readFile(filter);
    }

    private static byte[] processBinaryImages(Context context, String str) {
        return new BinaryImagesConverter(context, new Sha1FileIdStrategy()).convert(str);
    }
}
