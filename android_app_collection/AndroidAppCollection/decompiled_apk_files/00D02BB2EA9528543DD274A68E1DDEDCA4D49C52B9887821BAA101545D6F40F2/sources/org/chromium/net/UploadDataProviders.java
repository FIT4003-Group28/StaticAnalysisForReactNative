package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new eakh(new eake(parcelFileDescriptor));
    }

    public static UploadDataProvider create(File file) {
        return new eakh(new eakd(file));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new eakf(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new eakf(ByteBuffer.wrap(bArr, i, i2).slice());
    }
}
