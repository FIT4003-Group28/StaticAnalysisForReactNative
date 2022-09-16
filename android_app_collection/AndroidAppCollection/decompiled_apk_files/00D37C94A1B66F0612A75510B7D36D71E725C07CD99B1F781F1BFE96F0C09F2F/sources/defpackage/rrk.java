package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
/* compiled from: PG */
/* renamed from: rrk  reason: default package */
/* loaded from: classes4.dex */
final class rrk extends FileInputStream implements vjl {
    private final ParcelFileDescriptor a;

    public rrk(ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelFileDescriptor.getFileDescriptor());
        this.a = parcelFileDescriptor;
    }

    @Override // defpackage.vjl
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
