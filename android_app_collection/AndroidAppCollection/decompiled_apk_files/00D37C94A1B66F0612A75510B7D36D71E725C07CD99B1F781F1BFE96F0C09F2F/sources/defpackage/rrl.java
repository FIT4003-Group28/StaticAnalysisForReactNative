package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
/* compiled from: PG */
/* renamed from: rrl  reason: default package */
/* loaded from: classes4.dex */
final class rrl extends FileOutputStream implements vjv, vjl {
    private final ParcelFileDescriptor a;

    public rrl(ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelFileDescriptor.getFileDescriptor());
        this.a = parcelFileDescriptor;
    }

    @Override // defpackage.vjl
    public final FileChannel a() {
        return getChannel();
    }

    @Override // defpackage.vjv
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
