package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
/* compiled from: PG */
/* renamed from: cotf  reason: default package */
/* loaded from: classes5.dex */
final class cotf extends FileInputStream implements czip {
    private final ParcelFileDescriptor a;

    public cotf(ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelFileDescriptor.getFileDescriptor());
        this.a = parcelFileDescriptor;
    }

    @Override // defpackage.czip
    public final FileChannel a() {
        return getChannel();
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } finally {
            this.a.close();
        }
    }
}
