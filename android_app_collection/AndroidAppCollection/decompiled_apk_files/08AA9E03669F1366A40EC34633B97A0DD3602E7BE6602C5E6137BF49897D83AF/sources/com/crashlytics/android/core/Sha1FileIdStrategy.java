package com.crashlytics.android.core;

import b.a.a.a.a.b.i;
import com.crashlytics.android.core.BinaryImagesConverter;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
/* loaded from: classes.dex */
class Sha1FileIdStrategy implements BinaryImagesConverter.FileIdStrategy {
    @Override // com.crashlytics.android.core.BinaryImagesConverter.FileIdStrategy
    public String createId(File file) {
        return getFileSHA(file.getPath());
    }

    private static String getFileSHA(String str) {
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str));
            try {
                String b2 = i.b(bufferedInputStream2);
                i.a((Closeable) bufferedInputStream2);
                return b2;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                i.a((Closeable) bufferedInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
