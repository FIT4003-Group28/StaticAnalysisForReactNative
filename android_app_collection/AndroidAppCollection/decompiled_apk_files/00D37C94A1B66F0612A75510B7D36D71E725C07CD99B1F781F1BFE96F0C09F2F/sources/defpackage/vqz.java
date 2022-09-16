package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
/* compiled from: PG */
/* renamed from: vqz  reason: default package */
/* loaded from: classes4.dex */
public final class vqz implements axja {
    private final Uri a;
    private final FileChannel b;

    public vqz(FileChannel fileChannel, Uri uri) {
        this.a = uri;
        this.b = fileChannel;
    }

    public static axja g(Context context, Uri uri) {
        try {
            return new vqz(new AssetFileDescriptor.AutoCloseInputStream(context.getContentResolver().openAssetFileDescriptor(uri, "r")).getChannel(), uri);
        } catch (SecurityException e) {
            throw new IOException(e);
        }
    }

    @Override // defpackage.axja
    public final int a(ByteBuffer byteBuffer) {
        return this.b.read(byteBuffer);
    }

    @Override // defpackage.axja
    public final long b() {
        return this.b.position();
    }

    @Override // defpackage.axja
    public final long c() {
        return this.b.size();
    }

    @Override // defpackage.axja, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // defpackage.axja
    public final long d(long j, long j2, WritableByteChannel writableByteChannel) {
        return this.b.transferTo(j, j2, writableByteChannel);
    }

    @Override // defpackage.axja
    public final void f(long j) {
        this.b.position(j);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.axja
    public final ByteBuffer e(long j, long j2) {
        if (j2 > 2147483647L || j2 < 0) {
            StringBuilder sb = new StringBuilder(62);
            sb.append("ByteBuffer cannot perform mapping of size ");
            sb.append(j2);
            throw new IOException(sb.toString());
        }
        try {
            ByteBuffer allocate = ByteBuffer.allocate((int) j2);
            this.b.position(j);
            axlc.a(this.b, allocate);
            return allocate;
        } catch (IndexOutOfBoundsException | OutOfMemoryError e) {
            try {
                this.b.close();
            } catch (Exception unused) {
            }
            throw new IOException(e);
        }
    }
}
