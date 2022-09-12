package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
/* compiled from: PG */
/* renamed from: cotg  reason: default package */
/* loaded from: classes5.dex */
final class cotg extends FileOutputStream implements cziy, czip {
    private final ParcelFileDescriptor a;

    public cotg(ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelFileDescriptor.getFileDescriptor());
        this.a = parcelFileDescriptor;
    }

    @Override // defpackage.czip
    public final FileChannel a() {
        return getChannel();
    }

    @Override // defpackage.cziy
    public final void b() {
        getFD().sync();
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } finally {
            this.a.close();
        }
    }
}
